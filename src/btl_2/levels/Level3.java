package btl_2.levels;

import javafx.scene.image.Image;
import btl_2.entities.animal.Animal;
import btl_2.entities.animal.Ballom;
import btl_2.entities.animal.Doll;
import btl_2.graphics.CreateMap;
import btl_2.graphics.Sprite;

import static btl_2.BombermanGame.*;
import static btl_2.BombermanGame.enemy;
import static btl_2.control.Menu.bombNumber;
import static btl_2.control.Menu.timeNumber;
import static btl_2.entities.animal.Bomber.swapKill;
import static btl_2.entities.block.Bomb.isBomb;
import static btl_2.entities.item.SpeedItem.speed;
import static btl_2.utility.SoundManager.isSoundDied;
import static btl_2.utility.SoundManager.isSoundTitle;

public class Level3 {
    public Level3() {
        enemy.clear();
        block.clear();
        swapKill = 1;
        new CreateMap("res/levels/Level3.txt");
        player.setLife(true);
        player.setX(32);
        player.setY(32);
        speed = 1;
        isSoundDied = false;
        isSoundTitle = false;
        timeNumber = 120;
        bombNumber = 40;
        isBomb = 0;

        player.setImg(Sprite.player_right_2.getFxImage());
        Image transparent = new Image("images/transparent.png");
        authorView.setImage(transparent);

        Animal enemy1 = new Ballom(5, 5, Sprite.ballom_left1.getFxImage());
        Animal enemy2 = new Ballom(11, 9, Sprite.ballom_left1.getFxImage());
        enemy.add(enemy1);
        enemy.add(enemy2);

        Animal enemy3 = new Doll(7, 5, Sprite.doll_left1.getFxImage());
        enemy.add(enemy3);

        for (Animal animal : enemy) {
            animal.setLife(true);
        }
    }
}
