package fsimpl;

import android.os.Build;
import android.os.Looper;

/* renamed from: fsimpl.fy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14107fy {

    /* renamed from: a, reason: collision with root package name */
    private static C14099fq f132290a;

    public static void a(C13966ar c13966ar, C14013ck c14013ck) {
        if (c14013ck.v() && c13966ar.q()) {
            f132290a = new C14099fq(c13966ar.o(), String.format("%s %s %s", Build.MANUFACTURER, Build.MODEL, Build.PRODUCT), "Android", Integer.toString(Build.VERSION.SDK_INT), "fs_runtime", "1.62.0", c14013ck.l(), c13966ar.w(), false);
        }
    }

    public static void a(final Throwable th2) {
        if (f132290a != null) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                C14104fv.a(new Runnable() { // from class: fsimpl.fy$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C14107fy.b(th2);
                    }
                });
            } else {
                f132290a.a(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Throwable th2) {
        f132290a.a(th2);
    }
}
