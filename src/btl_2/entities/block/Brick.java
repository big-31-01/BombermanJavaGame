package btl_2.entities.block;

import javafx.scene.image.Image;
import btl_2.entities.Entity;
import btl_2.graphics.Sprite;

import static btl_2.BombermanGame.block;
import static btl_2.BombermanGame.listKill;

public class Brick extends Entity {

    public Brick(int x, int y, Image img) {
        super(x, y, img);
    }

    private void checkHidden() {
        for (Entity entity : block) {
            if (entity instanceof Brick)
                if (listKill[entity.getX() / 32][entity.getY() / 32] == 4) {
                    entity.setImg(Sprite.grass.getFxImage());
                }
        }
    }

    @Override
    public void update() {
        checkHidden();
    }
}
