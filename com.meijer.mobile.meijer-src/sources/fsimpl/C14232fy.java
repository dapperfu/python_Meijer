package fsimpl;

import android.os.Build;
import android.os.Looper;

/* renamed from: fsimpl.fy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14232fy {

    /* renamed from: a, reason: collision with root package name */
    private static C14224fq f133540a;

    public static void a(C14091ar c14091ar, C14138ck c14138ck) {
        if (c14138ck.v() && c14091ar.q()) {
            f133540a = new C14224fq(c14091ar.o(), String.format("%s %s %s", Build.MANUFACTURER, Build.MODEL, Build.PRODUCT), "Android", Integer.toString(Build.VERSION.SDK_INT), "fs_runtime", "1.62.2", c14138ck.l(), c14091ar.w(), false);
        }
    }

    public static void a(final Throwable th2) {
        if (f133540a != null) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                C14229fv.a(new Runnable() { // from class: fsimpl.fy$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C14232fy.b(th2);
                    }
                });
            } else {
                f133540a.a(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Throwable th2) {
        f133540a.a(th2);
    }
}
