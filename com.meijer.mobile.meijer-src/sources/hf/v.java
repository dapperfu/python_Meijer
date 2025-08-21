package hf;

import java.lang.reflect.Array;

/* loaded from: classes8.dex */
final class v {
    static <T> T[] a(T[] tArr, int i10) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
    }
}
