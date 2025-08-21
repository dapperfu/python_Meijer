package Xc;

import Oc.C4447y;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.C8017eQ;
import com.google.android.gms.internal.ads.C9978wo;
import com.google.android.gms.internal.ads.InterfaceC9541sj0;
import com.google.android.gms.internal.ads.Mj0;
import com.google.android.gms.internal.ads.OQ;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class L implements InterfaceC9541sj0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f41876a;

    /* renamed from: b, reason: collision with root package name */
    private final C8017eQ f41877b;

    @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.q zza(Object obj) throws Exception {
        final C9978wo c9978wo = (C9978wo) obj;
        return Mj0.n(this.f41877b.c(c9978wo), new InterfaceC9541sj0() { // from class: Xc.K
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj2) {
                OQ oq2 = (OQ) obj2;
                N n10 = new N(new JsonReader(new InputStreamReader(oq2.b())), oq2.a());
                C9978wo c9978wo2 = c9978wo;
                try {
                    n10.f41880b = C4447y.b().k(c9978wo2.f80366a).toString();
                } catch (JSONException unused) {
                    n10.f41880b = "{}";
                }
                if (!c9978wo2.f80379n.isEmpty()) {
                    try {
                        n10.f41881c = C4447y.b().k(c9978wo2.f80379n).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return Mj0.h(n10);
            }
        }, this.f41876a);
    }

    public L(Executor executor, C8017eQ c8017eQ) {
        this.f41876a = executor;
        this.f41877b = c8017eQ;
    }
}
