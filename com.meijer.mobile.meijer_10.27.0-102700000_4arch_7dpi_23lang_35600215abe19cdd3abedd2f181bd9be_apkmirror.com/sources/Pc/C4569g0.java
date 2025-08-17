package Pc;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.C7142Rn;
import java.util.concurrent.Callable;

/* renamed from: Pc.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4569g0 {
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
            Qc.p.e("Unexpected exception.", th2);
            C7142Rn.c(context).b(th2, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
