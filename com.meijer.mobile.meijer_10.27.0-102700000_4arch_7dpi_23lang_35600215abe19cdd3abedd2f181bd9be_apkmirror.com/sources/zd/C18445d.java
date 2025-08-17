package zd;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: zd.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C18445d {
    public static <T> T a(Callable<T> callable) throws Exception {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
