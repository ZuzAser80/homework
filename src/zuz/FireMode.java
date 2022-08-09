package zuz;

import java.util.List;

public interface FireMode {
    void shoot(Ammo ammo);
    List<Ammo> getAmmoTypeList();
}