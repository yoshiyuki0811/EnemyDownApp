package plugin.enemydown.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import plugin.enemydown.app.mapper.data.GameConfig;
import plugin.enemydown.app.mapper.data.SpawnEnemy;
import plugin.enemydown.app.service.ConfigService;

@RestController
public class ConfigController {
 @Autowired
  private ConfigService service;

@GetMapping(value = "/configList")
 public List<GameConfig> searchConfigList(){
  return service.searchConfigList();
 }

 @GetMapping(value = "/config")
 public GameConfig searchConfig(@RequestParam String difficulty){
  return service.searchConfig(difficulty);
 }
 @GetMapping(value = "/spawnEnemyList")
 public List<SpawnEnemy> spawnEnemyList(@RequestParam String difficulty){
  return service.searchSpawnEnemyList(difficulty);
 }
 @PostMapping(value = "/config")
 public ResponseEntity<GameConfig> registerConfig(@RequestBody GameConfig config){
 GameConfig registerConfig = service.registerConfig(config);
 return new ResponseEntity<>(registerConfig, HttpStatus.OK);
 }

}
