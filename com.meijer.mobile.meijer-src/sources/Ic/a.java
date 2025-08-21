package Ic;

import Gc.d;
import Gc.p;
import Oc.A;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.C6673Ac;
import com.google.android.gms.internal.ads.C7267Rn;
import com.google.android.gms.internal.ads.C8679kg;
import com.google.android.gms.internal.ads.C8784lf;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: Ic.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0230a extends d<a> {
    }

    public abstract p a();

    public abstract void c(Activity activity);

    @Deprecated
    public static void b(final Context context, final String str, final c cVar, final int i10, final AbstractC0230a abstractC0230a) {
        r.m(context, "Context cannot be null.");
        r.m(str, "adUnitId cannot be null.");
        r.m(cVar, "AdRequest cannot be null.");
        r.e("#008 Must be called on the main UI thread.");
        C8784lf.a(context);
        if (((Boolean) C8679kg.f76528d.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8784lf.f77115bb)).booleanValue()) {
                Sc.c.f34487b.execute(new Runnable() { // from class: Ic.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i11 = i10;
                        String str2 = str;
                        c cVar2 = cVar;
                        try {
                            new C6673Ac(context2, str2, cVar2.a(), i11, abstractC0230a).a();
                        } catch (IllegalStateException e10) {
                            C7267Rn.c(context2).b(e10, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C6673Ac(context, str, cVar.a(), i10, abstractC0230a).a();
    }
}
