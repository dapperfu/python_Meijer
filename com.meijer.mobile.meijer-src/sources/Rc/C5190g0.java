package Rc;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.C7267Rn;
import java.util.concurrent.Callable;

/* renamed from: Rc.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5190g0 {
    @Deprecated
    public static Object a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th2) {
            Sc.p.e("Unexpected exception.", th2);
            C7267Rn.c(context).b(th2, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
