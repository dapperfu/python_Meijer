package W4;

import N4.AbstractC4333v;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* renamed from: W4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5404f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38526a = AbstractC4333v.i("EnqueueRunnable");

    /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean d(O4.O r18, java.util.List<? extends N4.P> r19, java.lang.String[] r20, java.lang.String r21, N4.EnumC4321i r22) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W4.C5404f.d(O4.O, java.util.List, java.lang.String[], java.lang.String, N4.i):boolean");
    }

    public static boolean a(O4.F f10) {
        O4.O oH = f10.h();
        WorkDatabase workDatabaseU = oH.u();
        workDatabaseU.beginTransaction();
        try {
            C5405g.a(workDatabaseU, oH.n(), f10);
            boolean zE = e(f10);
            workDatabaseU.setTransactionSuccessful();
            return zE;
        } finally {
            workDatabaseU.endTransaction();
        }
    }

    public static void b(O4.F f10) {
        if (!f10.i()) {
            if (a(f10)) {
                f(f10);
            }
        } else {
            throw new IllegalStateException("WorkContinuation has cycles (" + f10 + ")");
        }
    }

    private static boolean c(O4.F f10) {
        boolean zD = d(f10.h(), f10.g(), (String[]) O4.F.m(f10).toArray(new String[0]), f10.e(), f10.c());
        f10.l();
        return zD;
    }

    private static boolean e(O4.F f10) {
        List<O4.F> listF = f10.f();
        boolean zE = false;
        if (listF != null) {
            for (O4.F f11 : listF) {
                if (!f11.k()) {
                    zE |= e(f11);
                } else {
                    AbstractC4333v.e().k(f38526a, "Already enqueued work ids (" + TextUtils.join(", ", f11.d()) + ")");
                }
            }
        }
        return c(f10) | zE;
    }

    public static void f(O4.F f10) {
        O4.O oH = f10.h();
        androidx.work.impl.a.f(oH.n(), oH.u(), oH.s());
    }
}
