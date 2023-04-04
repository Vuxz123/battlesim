package com.ethnicthv.entity;

import com.ethnicthv.entity.properties.AttackCondition;
import com.ethnicthv.entity.properties.DefendCondition;
import com.ethnicthv.entity.properties.EntityProperties;
import com.ethnicthv.entity.result.AttackResult;
import com.ethnicthv.entity.result.DefendResult;
import com.ethnicthv.simspace.AbNode;

public interface IEntity {
    AbNode getCurrentPlace();
    EntityProperties getProperties();
    void doNextMove();
    AttackResult attack(IEntity entity, AttackCondition condition);
    DefendResult defend(IEntity entity, DefendCondition condition);
}
