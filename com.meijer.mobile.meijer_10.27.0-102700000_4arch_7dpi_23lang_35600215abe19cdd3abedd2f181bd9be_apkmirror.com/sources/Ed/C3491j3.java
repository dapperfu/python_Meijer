package Ed;

import java.util.Objects;

/* renamed from: Ed.j3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3491j3 {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            Objects.toString(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }
}
