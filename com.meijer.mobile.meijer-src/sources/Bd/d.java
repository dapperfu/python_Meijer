package Bd;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class d {
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
