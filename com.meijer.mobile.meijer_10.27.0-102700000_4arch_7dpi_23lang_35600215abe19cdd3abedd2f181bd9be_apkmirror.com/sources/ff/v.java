package ff;

import java.lang.reflect.Array;

/* loaded from: classes7.dex */
final class v {
    static <T> T[] a(T[] tArr, int i10) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
    }
}
