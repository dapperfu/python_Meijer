package r7;

import android.text.TextUtils;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class k {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T d(T t10) {
        return (T) e(t10, "Argument must not be null");
    }

    public static <T> T e(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static <T extends Collection<Y>, Y> T c(T t10) {
        if (!t10.isEmpty()) {
            return t10;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }
}
