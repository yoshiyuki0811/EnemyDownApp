package plugin.enemydown.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import plugin.enemydown.app.mapper.data.PlayerScore;
import plugin.enemydown.app.mapper.data.SpawnEnemy;
import plugin.enemydown.app.service.PlayerScoreService;

@RestController
public class PlayerScoreController {
  @Autowired
  private PlayerScoreService service;

  @RequestMapping(value = "/playerScoreList", method = RequestMethod.GET)
  public List<PlayerScore> playerScoreList(){
    return service.searchPlayerScoreList();
  }

}
