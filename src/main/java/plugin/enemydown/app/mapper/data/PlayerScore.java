package plugin.enemydown.app.mapper.data;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
public class PlayerScore {

  private int id;
  private String playerName;
  private int score ;
  private String difficulty;
  private LocalDateTime registeredAT;

  }


