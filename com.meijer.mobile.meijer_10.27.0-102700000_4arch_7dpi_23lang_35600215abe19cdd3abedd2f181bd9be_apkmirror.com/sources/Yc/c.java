package Yc;

import Ec.k;
import Ec.p;
import Mc.A;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.C7142Rn;
import com.google.android.gms.internal.ads.C8554kg;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C8679lp;

/* loaded from: classes4.dex */
public abstract class c {
    public abstract p a();

    public abstract void c(Activity activity, k kVar);

    public static void b(final Context context, final String str, final com.google.android.gms.ads.c cVar, final d dVar) {
        r.m(context, "Context cannot be null.");
        r.m(str, "AdUnitId cannot be null.");
        r.m(cVar, "AdRequest cannot be null.");
        r.m(dVar, "LoadCallback cannot be null.");
        r.e("#008 Must be called on the main UI thread.");
        C8659lf.a(context);
        if (((Boolean) C8554kg.f75695k.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8659lf.f76275bb)).booleanValue()) {
                Qc.c.f29937b.execute(new Runnable() { // from class: Yc.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        com.google.android.gms.ads.c cVar2 = cVar;
                        try {
                            new C8679lp(context2, str2).d(cVar2.a(), dVar);
                        } catch (IllegalStateException e10) {
                            C7142Rn.c(context2).b(e10, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        Qc.p.b("Loading on UI thread");
        new C8679lp(context, str).d(cVar.a(), dVar);
    }
}
