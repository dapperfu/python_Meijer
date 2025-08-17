package Gc;

import Ec.d;
import Ec.p;
import Mc.A;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.C6548Ac;
import com.google.android.gms.internal.ads.C7142Rn;
import com.google.android.gms.internal.ads.C8554kg;
import com.google.android.gms.internal.ads.C8659lf;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: Gc.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0161a extends d<a> {
    }

    public abstract p a();

    public abstract void c(Activity activity);

    @Deprecated
    public static void b(final Context context, final String str, final c cVar, final int i10, final AbstractC0161a abstractC0161a) {
        r.m(context, "Context cannot be null.");
        r.m(str, "adUnitId cannot be null.");
        r.m(cVar, "AdRequest cannot be null.");
        r.e("#008 Must be called on the main UI thread.");
        C8659lf.a(context);
        if (((Boolean) C8554kg.f75688d.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8659lf.f76275bb)).booleanValue()) {
                Qc.c.f29937b.execute(new Runnable() { // from class: Gc.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i11 = i10;
                        String str2 = str;
                        c cVar2 = cVar;
                        try {
                            new C6548Ac(context2, str2, cVar2.a(), i11, abstractC0161a).a();
                        } catch (IllegalStateException e10) {
                            C7142Rn.c(context2).b(e10, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C6548Ac(context, str, cVar.a(), i10, abstractC0161a).a();
    }
}
