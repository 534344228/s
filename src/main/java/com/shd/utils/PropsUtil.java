package com.shd.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 属性文件工具
 * Created by shanhaodong on 2018/8/8
 */
public final class PropsUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 加载属性文件
     *
     * @param fileName
     * @return
     */
    public static Properties loadProps(String fileName) {
        Properties props = null;
        InputStream in = null;
        try {
            in = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if (in == null) {
                throw new FileNotFoundException(fileName + "file is not found");
            }
            props = new Properties();
            props.load(in);
        } catch (IOException e) {
            LOGGER.error("load properties file failure", e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    LOGGER.error("close input stream failure", e);
                }
            }
        }
        return props;
    }

    /**
     * 获取属性
     *
     * @param props
     * @param key
     * @param defaultVaules
     * @return
     */
    public static String getString(Properties props, String key, String defaultVaules) {
        String value = defaultVaules;
        if (props.containsKey(key)) {
            value = props.getProperty(key);
        }
        return value;
    }

    public static String getString(Properties props, String key) {
        return getString(props, key, "");
    }


}
