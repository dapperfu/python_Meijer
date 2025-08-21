package Rc;

import Oc.C4447y;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC8308h7;
import com.google.android.gms.internal.ads.C6924Hj;
import com.google.android.gms.internal.ads.C8415i7;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C8995nd0;
import com.google.android.gms.internal.ads.C9102od0;
import com.google.android.gms.internal.ads.C9162p7;
import com.google.android.gms.internal.ads.C9696u7;
import com.google.android.gms.internal.ads.S6;
import com.google.android.gms.internal.ads.V6;
import com.google.android.gms.internal.ads.Y6;
import com.google.android.gms.internal.ads.zzapv;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class A extends C8415i7 {

    /* renamed from: c, reason: collision with root package name */
    private final Context f32289c;

    public static Y6 b(Context context) {
        Y6 y62 = new Y6(new C9162p7(new File(C9102od0.a(C8995nd0.a(), context.getCacheDir(), "admob_volley")), 20971520), new A(context, new C9696u7(null, null)), 4);
        y62.d();
        return y62;
    }

    private A(Context context, AbstractC8308h7 abstractC8308h7) {
        super(abstractC8308h7);
        this.f32289c = context;
    }

    @Override // com.google.android.gms.internal.ads.C8415i7, com.google.android.gms.internal.ads.Q6
    public final S6 a(V6 v62) throws zzapv {
        if (v62.zza() == 0) {
            if (Pattern.matches((String) Oc.A.c().a(C8784lf.f77416x4), v62.u())) {
                Context context = this.f32289c;
                C4447y.b();
                if (Sc.g.u(context, 13400000)) {
                    S6 s6A = new C6924Hj(this.f32289c).a(v62);
                    if (s6A != null) {
                        p0.k("Got gmscore asset response: ".concat(String.valueOf(v62.u())));
                        return s6A;
                    }
                    p0.k("Failed to get gmscore asset response: ".concat(String.valueOf(v62.u())));
                }
            }
        }
        return super.a(v62);
    }
}
