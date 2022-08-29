/*
 * Licensed Materials - Property of ROOTCLOUD
 * THIS MODULE IS "RESTRICTED MATERIALS OF ROOTCLOUD"
 * (c) Copyright ROOTCLOUD Inc. 2021 All Rights Reserved
 *
 * The source code for this program is not published or
 * otherwise divested of its trade secrets
 */
package designPattern.singleton;

/**
 * @author: dw
 * @Date: 2022/8/29 10:07
 * @Version: 1.0.0
 * 懒汉模式+synchronized
 */
public final class Singleton3 {

    private static Singleton3 INSTANCE = null;

    private Singleton3() {}

    /**
     * 有可能产生多个实例对象
     * @return
     */
    public static Singleton3 getInstance() {
        if (null == INSTANCE) {
            synchronized (Singleton3.class) {
                INSTANCE = new Singleton3();
            }
        }
        return INSTANCE;
    }
}
