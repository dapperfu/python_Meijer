package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Xp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7469Xp {

    /* renamed from: a, reason: collision with root package name */
    static AbstractC7469Xp f72250a;

    abstract SharedPreferencesOnSharedPreferenceChangeListenerC6964Ip a();

    abstract C7099Mp b();

    abstract C7740bq c();

    public static synchronized AbstractC7469Xp d(Context context) {
        try {
            AbstractC7469Xp abstractC7469Xp = f72250a;
            if (abstractC7469Xp != null) {
                return abstractC7469Xp;
            }
            Context applicationContext = context.getApplicationContext();
            C8784lf.a(applicationContext);
            Rc.r0 r0VarJ = Nc.v.s().j();
            r0VarJ.z(applicationContext);
            C7201Pp c7201Pp = new C7201Pp(null);
            c7201Pp.b(applicationContext);
            c7201Pp.c(Nc.v.c());
            c7201Pp.a(r0VarJ);
            c7201Pp.d(Nc.v.r());
            AbstractC7469Xp abstractC7469XpE = c7201Pp.e();
            f72250a = abstractC7469XpE;
            abstractC7469XpE.a().a();
            C7740bq c7740bqC = f72250a.c();
            if (((Boolean) Oc.A.c().a(C8784lf.f76783E0)).booleanValue()) {
                Nc.v.t();
                Map mapB0 = Rc.D0.b0((String) Oc.A.c().a(C8784lf.f76797F0));
                Iterator it = mapB0.keySet().iterator();
                while (it.hasNext()) {
                    c7740bqC.c((String) it.next());
                }
                c7740bqC.d(new C7535Zp(c7740bqC, mapB0));
            }
            return f72250a;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
