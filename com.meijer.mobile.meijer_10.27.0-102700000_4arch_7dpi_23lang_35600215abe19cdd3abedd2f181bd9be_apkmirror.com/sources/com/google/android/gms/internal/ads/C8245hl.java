package com.google.android.gms.internal.ads;

import io.constructor.data.local.PreferencesHelper;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8245hl implements InterfaceC7173Sk {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7240Uk f74773a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7273Vk f74774b;

    /* renamed from: c, reason: collision with root package name */
    private final C7071Pk f74775c;

    /* renamed from: d, reason: collision with root package name */
    private final String f74776d;

    C8245hl(C7071Pk c7071Pk, String str, InterfaceC7273Vk interfaceC7273Vk, InterfaceC7240Uk interfaceC7240Uk) {
        this.f74775c = c7071Pk;
        this.f74776d = str;
        this.f74774b = interfaceC7273Vk;
        this.f74773a = interfaceC7240Uk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7173Sk
    public final com.google.common.util.concurrent.q zzb(Object obj) {
        C7145Rq c7145Rq = new C7145Rq();
        C6868Jk c6868JkB = this.f74775c.b(null);
        Pc.p0.k("callJs > getEngine: Promise created");
        c6868JkB.f(new C7924el(this, c6868JkB, obj, c7145Rq), new C8031fl(this, c7145Rq, c6868JkB));
        return c7145Rq;
    }

    static /* bridge */ /* synthetic */ void b(C8245hl c8245hl, C6868Jk c6868Jk, InterfaceC7105Qk interfaceC7105Qk, Object obj, C7145Rq c7145Rq) throws JSONException {
        try {
            Lc.v.t();
            String string = UUID.randomUUID().toString();
            C7035Oi.f69146o.c(string, new C8138gl(c8245hl, c6868Jk, c7145Rq));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PreferencesHelper.PREF_ID, string);
            jSONObject.put("args", c8245hl.f74774b.zzb(obj));
            interfaceC7105Qk.R0(c8245hl.f74776d, jSONObject);
        } catch (Exception e10) {
            try {
                c7145Rq.c(e10);
                Qc.p.e("Unable to invokeJavascript", e10);
            } finally {
                c6868Jk.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
    public final com.google.common.util.concurrent.q zza(Object obj) throws Exception {
        return zzb(obj);
    }
}
