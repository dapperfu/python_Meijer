package Rc;

import com.google.android.gms.internal.ads.C7270Rq;
import com.google.android.gms.internal.ads.C7668b7;
import com.google.android.gms.internal.ads.C9269q7;
import com.google.android.gms.internal.ads.S6;
import com.google.android.gms.internal.ads.V6;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class N extends V6 {

    /* renamed from: m, reason: collision with root package name */
    private final C7270Rq f32327m;

    /* renamed from: n, reason: collision with root package name */
    private final Sc.m f32328n;

    public N(String str, Map map, C7270Rq c7270Rq) throws IOException {
        super(0, str, new M(c7270Rq));
        this.f32327m = c7270Rq;
        Sc.m mVar = new Sc.m(null);
        this.f32328n = mVar;
        mVar.d(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.V6
    protected final /* bridge */ /* synthetic */ void C(Object obj) throws IOException {
        S6 s62 = (S6) obj;
        this.f32328n.f(s62.f70873c, s62.f70871a);
        byte[] bArr = s62.f70872b;
        if (Sc.m.k() && bArr != null) {
            this.f32328n.h(bArr);
        }
        this.f32327m.b(s62);
    }

    @Override // com.google.android.gms.internal.ads.V6
    protected final C7668b7 o(S6 s62) {
        return C7668b7.b(s62, C9269q7.b(s62));
    }
}
