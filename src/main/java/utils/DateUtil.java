/*
 * Licensed Materials - Property of ROOTCLOUD
 * THIS MODULE IS "RESTRICTED MATERIALS OF ROOTCLOUD"
 * (c) Copyright ROOTCLOUD Inc. 2021 All Rights Reserved
 *
 * The source code for this program is not published or
 * otherwise divested of its trade secrets
 */
package utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Objects;

/**
 * @author: dw
 * @Date: 2022/8/23 16:36
 * @Version: 1.0.0
 */
public class DateUtil {

    /**
     * localDateTime convert mills
     * @param localDateTime
     * @return
     */
    public static Long localDateTime2Mills(LocalDateTime localDateTime) {
        Objects.requireNonNull(localDateTime);
        return localDateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
    }

    /**
     * mills convert localDateTime
     * @param mills
     * @return
     */
    public static LocalDateTime long2LocalDateTime(Long mills) {
        Objects.requireNonNull(mills);
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(mills), ZoneId.systemDefault());
    }
}
