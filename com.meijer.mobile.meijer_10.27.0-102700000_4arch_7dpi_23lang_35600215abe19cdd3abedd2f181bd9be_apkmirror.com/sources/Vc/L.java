package Vc;

import Mc.C4169y;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.C7892eQ;
import com.google.android.gms.internal.ads.C9853wo;
import com.google.android.gms.internal.ads.InterfaceC9416sj0;
import com.google.android.gms.internal.ads.Mj0;
import com.google.android.gms.internal.ads.OQ;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class L implements InterfaceC9416sj0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f37164a;

    /* renamed from: b, reason: collision with root package name */
    private final C7892eQ f37165b;

    @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.q zza(Object obj) throws Exception {
        final C9853wo c9853wo = (C9853wo) obj;
        return Mj0.n(this.f37165b.c(c9853wo), new InterfaceC9416sj0() { // from class: Vc.K
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj2) {
                OQ oq2 = (OQ) obj2;
                N n10 = new N(new JsonReader(new InputStreamReader(oq2.b())), oq2.a());
                C9853wo c9853wo2 = c9853wo;
                try {
                    n10.f37168b = C4169y.b().k(c9853wo2.f79526a).toString();
                } catch (JSONException unused) {
                    n10.f37168b = "{}";
                }
                if (!c9853wo2.f79539n.isEmpty()) {
                    try {
                        n10.f37169c = C4169y.b().k(c9853wo2.f79539n).toString();
                    } catch (JSONException unused2) {
                    }
                }
                return Mj0.h(n10);
            }
        }, this.f37164a);
    }

    public L(Executor executor, C7892eQ c7892eQ) {
        this.f37164a = executor;
        this.f37165b = c7892eQ;
    }
}
