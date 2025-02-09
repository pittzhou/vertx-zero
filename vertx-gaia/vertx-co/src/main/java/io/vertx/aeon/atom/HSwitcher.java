package io.vertx.aeon.atom;

import io.vertx.aeon.atom.iras.HAeon;
import io.vertx.up.uca.yaml.Node;
import io.vertx.up.uca.yaml.ZeroAeon;
import io.vertx.up.util.Ut;

import java.util.Objects;

/**
 * 「开关」开关专用模块
 *
 * 1. Aeon系统配置鉴别专用
 * 2. 启动参数鉴别
 * 3. Aeon系统环境准备
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class HSwitcher {
    private static final Node<HAeon> VISITOR = Ut.singleton(ZeroAeon.class);

    // Kinect
    private static HAeon H_AEON;

    /* 检查当前系统是否开启了 Aeon 功能 */
    public static HAeon aeon() {
        if (Objects.isNull(H_AEON)) {
            H_AEON = VISITOR.read();
        }
        return H_AEON;
    }
}
