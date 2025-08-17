package Pc;

import Mc.C4169y;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC8183h7;
import com.google.android.gms.internal.ads.C6799Hj;
import com.google.android.gms.internal.ads.C8290i7;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C8870nd0;
import com.google.android.gms.internal.ads.C8977od0;
import com.google.android.gms.internal.ads.C9037p7;
import com.google.android.gms.internal.ads.C9571u7;
import com.google.android.gms.internal.ads.S6;
import com.google.android.gms.internal.ads.V6;
import com.google.android.gms.internal.ads.Y6;
import com.google.android.gms.internal.ads.zzapv;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class A extends C8290i7 {

    /* renamed from: c, reason: collision with root package name */
    private final Context f25075c;

    public static Y6 b(Context context) {
        Y6 y62 = new Y6(new C9037p7(new File(C8977od0.a(C8870nd0.a(), context.getCacheDir(), "admob_volley")), 20971520), new A(context, new C9571u7(null, null)), 4);
        y62.d();
        return y62;
    }

    private A(Context context, AbstractC8183h7 abstractC8183h7) {
        super(abstractC8183h7);
        this.f25075c = context;
    }

    @Override // com.google.android.gms.internal.ads.C8290i7, com.google.android.gms.internal.ads.Q6
    public final S6 a(V6 v62) throws zzapv {
        if (v62.zza() == 0) {
            if (Pattern.matches((String) Mc.A.c().a(C8659lf.f76576x4), v62.u())) {
                Context context = this.f25075c;
                C4169y.b();
                if (Qc.g.u(context, 13400000)) {
                    S6 s6A = new C6799Hj(this.f25075c).a(v62);
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
