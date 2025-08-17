package Be;

import com.google.common.base.VerifyException;

/* loaded from: classes6.dex */
public final class C {
    public static void a(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new VerifyException(v.c(str, obj));
        }
    }
}
