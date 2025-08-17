package com.google.maps.android.data.kml;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class KmlUtil {
    public static String substituteProperties(String str, KmlPlacemark kmlPlacemark) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = Pattern.compile("\\$\\[(.+?)]").matcher(str);
        while (matcher.find()) {
            String property = kmlPlacemark.getProperty(matcher.group(1));
            if (property != null) {
                matcher.appendReplacement(stringBuffer, property);
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
