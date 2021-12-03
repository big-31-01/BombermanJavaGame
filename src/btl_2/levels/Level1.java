package btl_2.levels;

import javafx.scene.image.Image;
import btl_2.entities.animal.Animal;
import btl_2.entities.animal.Ballom;
import btl_2.entities.animal.Oneal;
import btl_2.graphics.CreateMap;
import btl_2.graphics.Sprite;

import static btl_2.BombermanGame.*;
import static btl_2.control.Menu.bombNumber;
import static btl_2.control.Menu.timeNumber;
import static btl_2.entities.animal.Bomber.swapKill;
import static btl_2.entities.block.Bomb.isBomb;
import static btl_2.entities.block.Bomb.powerBomb;
import static btl_2.entities.item.SpeedItem.speed;
import static btl_2.utility.SoundManager.isSoundDied;
import static btl_2.utility.SoundManager.isSoundTitle;

public class Level1 {
    public Level1() {
        enemy.clear();
        block.clear();
        swapKill = 1;
        powerBomb = 0;
        new CreateMap("res/levels/Level1.txt");
        player.setLife(true);
        player.setX(32);
        player.setY(32);
        isSoundDied = false;
        isSoundTitle = false;
        timeNumber = 120;
        bombNumber = 20;
        isBomb = 0;
        speed = 1;

        player.setImg(Sprite.player_right_2.getFxImage());
        Image transparent = new Image("images/transparent.png");
        authorView.setImage(transparent);

        Animal enemy1 = new Ballom(4, 4, Sprite.ballom_left1.getFxImage());
        Animal enemy2 = new Ballom(9, 9, Sprite.ballom_left1.getFxImage());
        Animal enemy3 = new Ballom(22, 6, Sprite.ballom_left1.getFxImage());
        enemy.add(enemy1);
        enemy.add(enemy2);
        enemy.add(enemy3);

        Animal enemy4 = new Oneal(7, 6, Sprite.oneal_right1.getFxImage());
        Animal enemy5 = new Oneal(13, 8, Sprite.oneal_right1.getFxImage());
        enemy.add(enemy4);
        enemy.add(enemy5);

        for (Animal animal : enemy) {
            animal.setLife(true);
        }
    }
}