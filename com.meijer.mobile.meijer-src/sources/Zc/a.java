package Zc;

import Oc.A;
import Oc.C4393f1;
import Oc.C4431s1;
import android.content.Context;
import com.google.android.gms.internal.ads.C7030Kn;
import com.google.android.gms.internal.ads.C8679kg;
import com.google.android.gms.internal.ads.C8784lf;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final C4431s1 f43670a;

    public static void a(Context context, Gc.b bVar, com.google.android.gms.ads.c cVar, b bVar2) {
        c(context, bVar, cVar, null, bVar2);
    }

    public String b() {
        return this.f43670a.a();
    }

    public a(C4431s1 c4431s1) {
        this.f43670a = c4431s1;
    }

    private static void c(final Context context, final Gc.b bVar, final com.google.android.gms.ads.c cVar, final String str, final b bVar2) {
        C4393f1 c4393f1A;
        C8784lf.a(context);
        if (((Boolean) C8679kg.f76534j.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8784lf.f77115bb)).booleanValue()) {
                Sc.c.f34487b.execute(new Runnable() { // from class: Zc.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.ads.c cVar2 = cVar;
                        C4393f1 c4393f1A2 = cVar2 == null ? null : cVar2.a();
                        new C7030Kn(context, bVar, c4393f1A2, str).b(bVar2);
                    }
                });
                return;
            }
        }
        if (cVar == null) {
            c4393f1A = null;
        } else {
            c4393f1A = cVar.a();
        }
        new C7030Kn(context, bVar, c4393f1A, str).b(bVar2);
    }
}
