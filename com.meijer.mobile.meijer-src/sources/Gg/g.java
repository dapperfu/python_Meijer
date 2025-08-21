package Gg;

import android.content.Intent;
import android.os.Bundle;
import com.fullstory.FS;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12549a = "g";

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f12550b = Pattern.compile(",");

    public static Map<com.google.zxing.d, Object> a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null && !extras.isEmpty()) {
            EnumMap enumMap = new EnumMap(com.google.zxing.d.class);
            for (com.google.zxing.d dVar : com.google.zxing.d.values()) {
                if (dVar != com.google.zxing.d.CHARACTER_SET && dVar != com.google.zxing.d.NEED_RESULT_POINT_CALLBACK && dVar != com.google.zxing.d.POSSIBLE_FORMATS) {
                    String strName = dVar.name();
                    if (extras.containsKey(strName)) {
                        if (dVar.a().equals(Void.class)) {
                            enumMap.put((EnumMap) dVar, (com.google.zxing.d) Boolean.TRUE);
                        } else {
                            Object obj = extras.get(strName);
                            if (dVar.a().isInstance(obj)) {
                                enumMap.put((EnumMap) dVar, (com.google.zxing.d) obj);
                            } else {
                                FS.log_w(f12549a, "Ignoring hint " + dVar + " because it is not assignable from " + obj);
                            }
                        }
                    }
                }
            }
            FS.log_i(f12549a, "Hints from the Intent: " + enumMap);
            return enumMap;
        }
        return null;
    }
}
