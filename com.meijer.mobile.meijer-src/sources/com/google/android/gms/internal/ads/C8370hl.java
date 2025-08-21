package com.google.android.gms.internal.ads;

import io.constructor.data.local.PreferencesHelper;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8370hl implements InterfaceC7298Sk {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7365Uk f75613a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7398Vk f75614b;

    /* renamed from: c, reason: collision with root package name */
    private final C7196Pk f75615c;

    /* renamed from: d, reason: collision with root package name */
    private final String f75616d;

    C8370hl(C7196Pk c7196Pk, String str, InterfaceC7398Vk interfaceC7398Vk, InterfaceC7365Uk interfaceC7365Uk) {
        this.f75615c = c7196Pk;
        this.f75616d = str;
        this.f75614b = interfaceC7398Vk;
        this.f75613a = interfaceC7365Uk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7298Sk
    public final com.google.common.util.concurrent.q zzb(Object obj) {
        C7270Rq c7270Rq = new C7270Rq();
        C6993Jk c6993JkB = this.f75615c.b(null);
        Rc.p0.k("callJs > getEngine: Promise created");
        c6993JkB.f(new C8049el(this, c6993JkB, obj, c7270Rq), new C8156fl(this, c7270Rq, c6993JkB));
        return c7270Rq;
    }

    static /* bridge */ /* synthetic */ void b(C8370hl c8370hl, C6993Jk c6993Jk, InterfaceC7230Qk interfaceC7230Qk, Object obj, C7270Rq c7270Rq) throws JSONException {
        try {
            Nc.v.t();
            String string = UUID.randomUUID().toString();
            C7160Oi.f69986o.c(string, new C8263gl(c8370hl, c6993Jk, c7270Rq));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PreferencesHelper.PREF_ID, string);
            jSONObject.put("args", c8370hl.f75614b.zzb(obj));
            interfaceC7230Qk.R0(c8370hl.f75616d, jSONObject);
        } catch (Exception e10) {
            try {
                c7270Rq.c(e10);
                Sc.p.e("Unable to invokeJavascript", e10);
            } finally {
                c6993Jk.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
    public final com.google.common.util.concurrent.q zza(Object obj) throws Exception {
        return zzb(obj);
    }
}
