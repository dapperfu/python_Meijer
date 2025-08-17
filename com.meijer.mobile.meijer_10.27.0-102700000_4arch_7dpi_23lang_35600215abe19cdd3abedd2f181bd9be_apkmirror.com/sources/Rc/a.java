package Rc;

import Ec.g;
import Ec.p;
import Mc.A;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.C7142Rn;
import com.google.android.gms.internal.ads.C8029fk;
import com.google.android.gms.internal.ads.C8554kg;
import com.google.android.gms.internal.ads.C8659lf;

/* loaded from: classes4.dex */
public abstract class a {
    public abstract p a();

    public abstract void c(g gVar);

    public abstract void d(boolean z10);

    public abstract void e(Activity activity);

    public static void b(final Context context, final String str, final com.google.android.gms.ads.c cVar, final b bVar) {
        r.m(context, "Context cannot be null.");
        r.m(str, "AdUnitId cannot be null.");
        r.m(cVar, "AdRequest cannot be null.");
        r.m(bVar, "LoadCallback cannot be null.");
        r.e("#008 Must be called on the main UI thread.");
        C8659lf.a(context);
        if (((Boolean) C8554kg.f75693i.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8659lf.f76275bb)).booleanValue()) {
                Qc.c.f29937b.execute(new Runnable() { // from class: Rc.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        com.google.android.gms.ads.c cVar2 = cVar;
                        try {
                            new C8029fk(context2, str2).f(cVar2.a(), bVar);
                        } catch (IllegalStateException e10) {
                            C7142Rn.c(context2).b(e10, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C8029fk(context, str).f(cVar.a(), bVar);
    }
}
