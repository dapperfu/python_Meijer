package Z;

import java.lang.reflect.Array;

/* renamed from: Z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5605c {
    static <T> T[] a(T[] tArr, int i10) {
        if (tArr.length < i10) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
        }
        if (tArr.length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
