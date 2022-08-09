package zuz;

import java.util.List;

public interface Weapon {
    int getMaxAmmo(); //540
    int getMagAmmo(); //30
    int getMaxMagAmmo();
    void reload();
    Ammo getCurrentAmmo();
    void gunShoot();
    List<FireMode> getFireModes();
    FireMode getCurrentFireMode();
    void setCurrentFireMode(int index);
}
