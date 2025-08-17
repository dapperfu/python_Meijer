package Xc;

import Mc.A;
import Mc.C4115f1;
import Mc.C4153s1;
import android.content.Context;
import com.google.android.gms.internal.ads.C6905Kn;
import com.google.android.gms.internal.ads.C8554kg;
import com.google.android.gms.internal.ads.C8659lf;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final C4153s1 f39192a;

    public static void a(Context context, Ec.b bVar, com.google.android.gms.ads.c cVar, b bVar2) {
        c(context, bVar, cVar, null, bVar2);
    }

    public String b() {
        return this.f39192a.a();
    }

    public a(C4153s1 c4153s1) {
        this.f39192a = c4153s1;
    }

    private static void c(final Context context, final Ec.b bVar, final com.google.android.gms.ads.c cVar, final String str, final b bVar2) {
        C4115f1 c4115f1A;
        C8659lf.a(context);
        if (((Boolean) C8554kg.f75694j.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8659lf.f76275bb)).booleanValue()) {
                Qc.c.f29937b.execute(new Runnable() { // from class: Xc.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.c cVar2 = cVar;
                        C4115f1 c4115f1A2 = cVar2 == null ? null : cVar2.a();
                        new C6905Kn(context, bVar, c4115f1A2, str).b(bVar2);
                    }
                });
                return;
            }
        }
        if (cVar == null) {
            c4115f1A = null;
        } else {
            c4115f1A = cVar.a();
        }
        new C6905Kn(context, bVar, c4115f1A, str).b(bVar2);
    }
}
