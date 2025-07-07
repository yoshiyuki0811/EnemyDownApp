package plugin.enemydown.app.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import plugin.enemydown.app.mapper.data.GameConfig;
import plugin.enemydown.app.mapper.data.SpawnEnemy;


@Mapper
public interface GameConfigMapper {
  @Select("select * from game_config order by id asc")
  List<GameConfig> selectConfigList();

  @Select("select * from game_config where difficulty = #{difficulty} order by id asc")
  GameConfig selectConfig(String difficulty);

  @Select("select * from spawn_enemy inner join game_config on spawn_enemy.difficulty = game_config.difficulty  where spawn_enemy.difficulty = #{difficulty} order by spawn_enemy.id asc")
  List<SpawnEnemy> selectSpawnEnemyList(String difficulty);

@Insert("insert game_config(game_time, difficulty) value(#{gameTime}, #{difficulty})")
    int insertConfig(GameConfig config);


}
