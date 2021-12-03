package btl_2.entities.item;

import javafx.scene.image.Image;
import btl_2.entities.Entity;
import btl_2.entities.block.Bomb;
import btl_2.graphics.Sprite;

import static btl_2.BombermanGame.*;

public class FlameItem extends Items {

    public FlameItem(int x, int y, Image img) {
        super(x, y, img);
    }

    public FlameItem(boolean received) {
        super(received);
    }

    public FlameItem() {
    }

    @Override
    public void update() {
        for (Entity entity : block)
            if (entity instanceof FlameItem && !this.received)
                if (listKill[entity.getX() / 32][entity.getY() / 32] == 4)
                    entity.setImg(Sprite.powerup_flames.getFxImage());

        if (!this.received)
            if (player.getX() == this.x && player.getY() == this.y) {
                this.setImg(Sprite.grass.getFxImage());
                this.received = true;
                Bomb.powerBomb += 2;
            }
    }
}
