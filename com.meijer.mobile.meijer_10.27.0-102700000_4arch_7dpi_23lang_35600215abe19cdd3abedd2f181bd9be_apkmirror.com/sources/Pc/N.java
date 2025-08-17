package Pc;

import com.google.android.gms.internal.ads.C7145Rq;
import com.google.android.gms.internal.ads.C7543b7;
import com.google.android.gms.internal.ads.C9144q7;
import com.google.android.gms.internal.ads.S6;
import com.google.android.gms.internal.ads.V6;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class N extends V6 {

    /* renamed from: m, reason: collision with root package name */
    private final C7145Rq f25113m;

    /* renamed from: n, reason: collision with root package name */
    private final Qc.m f25114n;

    public N(String str, Map map, C7145Rq c7145Rq) throws IOException {
        super(0, str, new M(c7145Rq));
        this.f25113m = c7145Rq;
        Qc.m mVar = new Qc.m(null);
        this.f25114n = mVar;
        mVar.d(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.V6
    protected final /* bridge */ /* synthetic */ void C(Object obj) throws IOException {
        S6 s62 = (S6) obj;
        this.f25114n.f(s62.f70033c, s62.f70031a);
        byte[] bArr = s62.f70032b;
        if (Qc.m.k() && bArr != null) {
            this.f25114n.h(bArr);
        }
        this.f25113m.b(s62);
    }

    @Override // com.google.android.gms.internal.ads.V6
    protected final C7543b7 o(S6 s62) {
        return C7543b7.b(s62, C9144q7.b(s62));
    }
}
