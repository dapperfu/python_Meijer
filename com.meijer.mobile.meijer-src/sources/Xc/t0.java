package Xc;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.C9296qN;
import com.google.android.gms.internal.ads.InterfaceC9607tG;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class t0 implements InterfaceC9607tG {

    /* renamed from: a, reason: collision with root package name */
    private final C9296qN f42024a;

    /* renamed from: b, reason: collision with root package name */
    private final s0 f42025b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42026c;

    /* renamed from: d, reason: collision with root package name */
    private final int f42027d;

    @Override // com.google.android.gms.internal.ads.InterfaceC9607tG
    public final void i(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9607tG
    public final void a(N n10) {
        String strOptString;
        if (n10 == null || this.f42027d == 2) {
            return;
        }
        if (TextUtils.isEmpty(n10.f41881c)) {
            this.f42025b.d(this.f42026c, n10.f41880b, this.f42024a);
            return;
        }
        try {
            strOptString = new JSONObject(n10.f41881c).optString("request_id");
        } catch (JSONException e10) {
            Nc.v.s().x(e10, "RenderSignals.getRequestId");
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.f42025b.d(strOptString, n10.f41881c, this.f42024a);
    }

    public t0(C9296qN c9296qN, s0 s0Var, String str, int i10) {
        this.f42024a = c9296qN;
        this.f42025b = s0Var;
        this.f42026c = str;
        this.f42027d = i10;
    }
}
