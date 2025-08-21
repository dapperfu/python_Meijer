package j2;

import android.os.Build;
import android.os.Bundle;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14922b {

    /* renamed from: j2.b$a */
    static class a {
        static <T> T a(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }
    }

    public static <T> T a(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.a(bundle, str, cls);
        }
        T t10 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }
}
