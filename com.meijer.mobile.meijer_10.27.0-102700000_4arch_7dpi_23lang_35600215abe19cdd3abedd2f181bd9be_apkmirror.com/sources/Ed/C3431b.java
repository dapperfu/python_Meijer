package Ed;

import java.util.Set;

/* renamed from: Ed.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3431b {
    static int a(Set set) {
        int iHashCode;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            i10 += iHashCode;
        }
        return i10;
    }
}
