package ad;

import Gc.k;
import Gc.p;
import Oc.A;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.C7267Rn;
import com.google.android.gms.internal.ads.C8679kg;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C8804lp;

/* renamed from: ad.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5683c {
    public abstract p a();

    public abstract void c(Activity activity, k kVar);

    public static void b(final Context context, final String str, final com.google.android.gms.ads.c cVar, final AbstractC5684d abstractC5684d) {
        r.m(context, "Context cannot be null.");
        r.m(str, "AdUnitId cannot be null.");
        r.m(cVar, "AdRequest cannot be null.");
        r.m(abstractC5684d, "LoadCallback cannot be null.");
        r.e("#008 Must be called on the main UI thread.");
        C8784lf.a(context);
        if (((Boolean) C8679kg.f76535k.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8784lf.f77115bb)).booleanValue()) {
                Sc.c.f34487b.execute(new Runnable() { // from class: ad.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        com.google.android.gms.ads.c cVar2 = cVar;
                        try {
                            new C8804lp(context2, str2).d(cVar2.a(), abstractC5684d);
                        } catch (IllegalStateException e10) {
                            C7267Rn.c(context2).b(e10, "RewardedAd.load");
                        }
                    }
                });
                return;
            }
        }
        Sc.p.b("Loading on UI thread");
        new C8804lp(context, str).d(cVar.a(), abstractC5684d);
    }
}
