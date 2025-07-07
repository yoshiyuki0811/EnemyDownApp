package plugin.enemydown.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plugin.enemydown.app.mapper.PlayerScoreMapper;
import plugin.enemydown.app.mapper.data.PlayerScore;
import plugin.enemydown.app.mapper.data.SpawnEnemy;

@Service
public class PlayerScoreService {

  @Autowired
  private PlayerScoreMapper mapper;

  public List<PlayerScore> searchPlayerScoreList() {
    return mapper.selectPlayerScoreList();
  }
}