package Tc;

import Gc.g;
import Gc.p;
import Oc.A;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.C7267Rn;
import com.google.android.gms.internal.ads.C8154fk;
import com.google.android.gms.internal.ads.C8679kg;
import com.google.android.gms.internal.ads.C8784lf;

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
        C8784lf.a(context);
        if (((Boolean) C8679kg.f76533i.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8784lf.f77115bb)).booleanValue()) {
                Sc.c.f34487b.execute(new Runnable() { // from class: Tc.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        com.google.android.gms.ads.c cVar2 = cVar;
                        try {
                            new C8154fk(context2, str2).f(cVar2.a(), bVar);
                        } catch (IllegalStateException e10) {
                            C7267Rn.c(context2).b(e10, "InterstitialAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C8154fk(context, str).f(cVar.a(), bVar);
    }
}
