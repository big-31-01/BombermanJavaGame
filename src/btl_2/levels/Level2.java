package btl_2.levels;

import javafx.scene.image.Image;
import btl_2.entities.animal.Animal;
import btl_2.entities.animal.Ballom;
import btl_2.entities.animal.Kondoria;
import btl_2.entities.animal.Oneal;
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

public class Level2 {
    public Level2() {
        enemy.clear();
        block.clear();
        swapKill = 1;
        new CreateMap("res/levels/Level2.txt");
        player.setLife(true);
        player.setX(32);
        player.setY(32);
        speed = 1;
        isSoundDied = false;
        isSoundTitle = false;
        timeNumber = 120;
        bombNumber = 30;
        isBomb = 0;

        player.setImg(Sprite.player_right_2.getFxImage());
        Image transparent = new Image("images/transparent.png");
        authorView.setImage(transparent);

        Animal enemy1 = new Ballom(5, 5, Sprite.ballom_left1.getFxImage());
        Animal enemy2 = new Ballom(11, 9, Sprite.ballom_left1.getFxImage());
        enemy.add(enemy1);
        enemy.add(enemy2);

        Animal enemy3 = new Kondoria(1, 3, Sprite.kondoria_right1.getFxImage());
        Animal enemy4 = new Kondoria(1, 7, Sprite.kondoria_right1.getFxImage());
        Animal enemy5 = new Kondoria(1, 11, Sprite.kondoria_right1.getFxImage());
        enemy.add(enemy3);
        enemy.add(enemy4);
        enemy.add(enemy5);

        Animal enemy6 = new Oneal(7, 5, Sprite.oneal_right1.getFxImage());
        Animal enemy7 = new Oneal(19, 7, Sprite.oneal_right1.getFxImage());
        enemy.add(enemy6);
        enemy.add(enemy7);

        for (Animal animal : enemy) {
            animal.setLife(true);
        }
    }
}
