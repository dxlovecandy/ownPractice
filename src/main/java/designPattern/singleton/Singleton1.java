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
 * @Date: 2022/8/29 09:41
 * @Version: 1.0.0
 * 饿汉模式
 */
public final class Singleton1 {

    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
