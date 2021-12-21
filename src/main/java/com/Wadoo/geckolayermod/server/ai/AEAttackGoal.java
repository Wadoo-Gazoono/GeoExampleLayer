package com.Wadoo.geckolayermod.server.ai;

import com.Wadoo.geckolayermod.server.entity.AEEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;

public class AEAttackGoal extends Goal {
    protected AEEntity entity;
    private int timer;
    private final int COOLDOWN = 20;
    private int cooldownTimer;

    public AEAttackGoal(AEEntity entity){
        this.entity = entity;
    }

    @Override
    public boolean canUse() {
        return this.entity.getTarget() != null;
    }

    @Override
    public void start() {
        super.start();
        this.timer = 0;
        this.entity.getNavigation().moveTo(this.entity.getTarget(), 1.0f);
    }

    @Override
    public void tick() {
        super.tick();
        if(this.entity.getTarget() !=  null) {
            if (this.cooldownTimer < COOLDOWN) {
                this.cooldownTimer++;
                this.entity.getNavigation().moveTo(this.entity.getTarget(), 1.0f);
                this.entity.setAttacking(false);
            } else {
                if (this.timer < 40) {
                    this.timer++;
                    this.entity.getNavigation().stop();
                    this.entity.setAttacking(true);
                    if (this.timer == 14) {
                        this.tryHurtTarget(this.entity, this.entity.distanceTo(this.entity.getTarget()));
                    }
                } else {
                    this.timer = 0;
                    this.entity.setAttacking(false);
                    this.cooldownTimer = 0;
                }
            }
        }
        else{
            this.entity.setAttacking(false);
        }
    }

    protected void tryHurtTarget(AEEntity entity, double distanceTo){
        if(distanceTo < this.getAttackReachSqr(entity)){
            this.entity.doHurtTarget(this.entity.getTarget());
        }
    }

    protected double getAttackReachSqr(LivingEntity entity) {
        return (double)(entity.getBbWidth() * 2F * entity.getBbWidth() * 2F + entity.getBbWidth());
    }
}
