package X4;

import O4.AbstractC4373v;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* renamed from: X4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5557f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f41596a = AbstractC4373v.i("EnqueueRunnable");

    /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean d(P4.O r18, java.util.List<? extends O4.P> r19, java.lang.String[] r20, java.lang.String r21, O4.EnumC4361i r22) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.C5557f.d(P4.O, java.util.List, java.lang.String[], java.lang.String, O4.i):boolean");
    }

    public static boolean a(P4.F f10) {
        P4.O oH = f10.h();
        WorkDatabase workDatabaseU = oH.u();
        workDatabaseU.beginTransaction();
        try {
            C5558g.a(workDatabaseU, oH.n(), f10);
            boolean zE = e(f10);
            workDatabaseU.setTransactionSuccessful();
            return zE;
        } finally {
            workDatabaseU.endTransaction();
        }
    }

    public static void b(P4.F f10) {
        if (!f10.i()) {
            if (a(f10)) {
                f(f10);
            }
        } else {
            throw new IllegalStateException("WorkContinuation has cycles (" + f10 + ")");
        }
    }

    private static boolean c(P4.F f10) {
        boolean zD = d(f10.h(), f10.g(), (String[]) P4.F.m(f10).toArray(new String[0]), f10.e(), f10.c());
        f10.l();
        return zD;
    }

    private static boolean e(P4.F f10) {
        List<P4.F> listF = f10.f();
        boolean zE = false;
        if (listF != null) {
            for (P4.F f11 : listF) {
                if (!f11.k()) {
                    zE |= e(f11);
                } else {
                    AbstractC4373v.e().k(f41596a, "Already enqueued work ids (" + TextUtils.join(", ", f11.d()) + ")");
                }
            }
        }
        return c(f10) | zE;
    }

    public static void f(P4.F f10) {
        P4.O oH = f10.h();
        androidx.work.impl.a.f(oH.n(), oH.u(), oH.s());
    }
}
