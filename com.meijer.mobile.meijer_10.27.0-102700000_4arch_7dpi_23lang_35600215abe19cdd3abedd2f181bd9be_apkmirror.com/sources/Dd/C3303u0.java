package Dd;

import java.util.Map;

/* renamed from: Dd.u0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3303u0 {
    static Object a(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean b(Map map, Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
