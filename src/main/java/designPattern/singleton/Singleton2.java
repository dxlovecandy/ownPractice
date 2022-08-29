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
 * @Date: 2022/8/29 10:04
 * @Version: 1.0.0
 * 懒汉模式
 */
public final class Singleton2 {

    private static Singleton2 INSTANCE = null;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }
}
