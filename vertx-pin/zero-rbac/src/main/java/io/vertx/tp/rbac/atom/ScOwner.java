package io.vertx.tp.rbac.atom;

import io.vertx.tp.rbac.cv.em.OwnerType;
import io.vertx.tp.rbac.refine.Sc;
import io.vertx.up.atom.secure.Vis;
import io.vertx.up.eon.KValue;
import io.vertx.up.util.Ut;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * 打开多模式
 * 1）可支持单用户模式
 * 2）可支持多角色模式（通常拥有者也只有一个）
 */
public class ScOwner implements Serializable {
    private final String owner;
    private final Set<String> roles = new HashSet<>();
    private final OwnerType type;
    private String view = KValue.View.VIEW_DEFAULT;
    private String position = KValue.View.POSITION_DEFAULT;

    public ScOwner(final String owner, final String typeStr) {
        final OwnerType ownerType = Ut.toEnum(() -> typeStr, OwnerType.class, OwnerType.ROLE);
        this.owner = owner;
        this.type = ownerType;
    }

    public ScOwner(final String owner, final OwnerType type) {
        this.owner = owner;
        this.type = type;
    }

    public ScOwner(final String owner) {
        this(owner, OwnerType.ROLE);
    }

    public ScOwner bind(final Vis vis) {
        if (Objects.nonNull(vis)) {
            this.view = vis.view();
            this.position = vis.position();
        }
        return this;
    }

    public ScOwner bind(final String view, final String position) {
        this.view = view;
        this.position = position;
        return this;
    }

    public ScOwner bind(final Set<String> roles) {
        if (OwnerType.ROLE == this.type) {
            Sc.warnView(this.getClass(), "Role / Roles is not supported, Owner is user. type = {0} and Ignored.", this.type.name());
        } else {
            if (Objects.nonNull(roles)) {
                this.roles.addAll(roles);
            }
        }
        return this;
    }

    public OwnerType type() {
        return this.type;
    }

    public String owner() {
        return this.owner;
    }

    public Set<String> roles() {
        return this.roles;
    }

    public String view() {
        return this.view;
    }

    public String position() {
        return this.position;
    }
}
