package Vc;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.C9171qN;
import com.google.android.gms.internal.ads.InterfaceC9482tG;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class t0 implements InterfaceC9482tG {

    /* renamed from: a, reason: collision with root package name */
    private final C9171qN f37312a;

    /* renamed from: b, reason: collision with root package name */
    private final s0 f37313b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37314c;

    /* renamed from: d, reason: collision with root package name */
    private final int f37315d;

    @Override // com.google.android.gms.internal.ads.InterfaceC9482tG
    public final void i(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9482tG
    public final void a(N n10) {
        String strOptString;
        if (n10 == null || this.f37315d == 2) {
            return;
        }
        if (TextUtils.isEmpty(n10.f37169c)) {
            this.f37313b.d(this.f37314c, n10.f37168b, this.f37312a);
            return;
        }
        try {
            strOptString = new JSONObject(n10.f37169c).optString("request_id");
        } catch (JSONException e10) {
            Lc.v.s().x(e10, "RenderSignals.getRequestId");
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f37313b.d(strOptString, n10.f37169c, this.f37312a);
    }

    public t0(C9171qN c9171qN, s0 s0Var, String str, int i10) {
        this.f37312a = c9171qN;
        this.f37313b = s0Var;
        this.f37314c = str;
        this.f37315d = i10;
    }
}
