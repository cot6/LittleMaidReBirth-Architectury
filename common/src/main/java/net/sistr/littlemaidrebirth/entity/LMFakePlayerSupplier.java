package net.sistr.littlemaidrebirth.entity;

import net.sistr.littlemaidrebirth.entity.util.FakePlayerSupplier;

public class LMFakePlayerSupplier implements FakePlayerSupplier {
    private final LittleMaidEntity origin;
    private FakePlayer fakePlayer;

    public LMFakePlayerSupplier(LittleMaidEntity origin) {
        this.origin = origin;
    }

    @Override
    public FakePlayer getFakePlayer() {
        if (this.fakePlayer == null) {
            this.fakePlayer = new LMFakePlayerWrapperEntity<>(this.origin) {

                @Override
                public LittleMaidEntity getOrigin() {
                    return origin;
                }

            };
        }
        return this.fakePlayer;
    }

    void tick() {
        if (fakePlayer != null)
            fakePlayer.tick();
    }

}
