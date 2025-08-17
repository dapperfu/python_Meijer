package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Xp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7344Xp {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC7344Xp f71410a;

    abstract SharedPreferencesOnSharedPreferenceChangeListenerC6839Ip a();

    abstract C6974Mp b();

    abstract C7615bq c();

    public static synchronized AbstractC7344Xp d(Context context) {
        try {
            AbstractC7344Xp abstractC7344Xp = f71410a;
            if (abstractC7344Xp != null) {
                return abstractC7344Xp;
            }
            Context applicationContext = context.getApplicationContext();
            C8659lf.a(applicationContext);
            Pc.r0 r0VarJ = Lc.v.s().j();
            r0VarJ.z(applicationContext);
            C7076Pp c7076Pp = new C7076Pp(null);
            c7076Pp.b(applicationContext);
            c7076Pp.c(Lc.v.c());
            c7076Pp.a(r0VarJ);
            c7076Pp.d(Lc.v.r());
            AbstractC7344Xp abstractC7344XpE = c7076Pp.e();
            f71410a = abstractC7344XpE;
            abstractC7344XpE.a().a();
            C7615bq c7615bqC = f71410a.c();
            if (((Boolean) Mc.A.c().a(C8659lf.f75943E0)).booleanValue()) {
                Lc.v.t();
                Map mapB0 = Pc.D0.b0((String) Mc.A.c().a(C8659lf.f75957F0));
                Iterator it = mapB0.keySet().iterator();
                while (it.hasNext()) {
                    c7615bqC.c((String) it.next());
                }
                c7615bqC.d(new C7410Zp(c7615bqC, mapB0));
            }
            return f71410a;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
