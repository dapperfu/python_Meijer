package com.google.android.gms.internal.ads;

import io.constructor.data.local.PreferencesHelper;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9224pl implements InterfaceC9541sj0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f78474a = "google.afma.activeView.handleUpdate";

    /* renamed from: b, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f78475b;

    C9224pl(com.google.common.util.concurrent.q qVar, String str, InterfaceC7398Vk interfaceC7398Vk, InterfaceC7365Uk interfaceC7365Uk) {
        this.f78475b = qVar;
    }

    final /* synthetic */ com.google.common.util.concurrent.q a(Object obj, InterfaceC7230Qk interfaceC7230Qk) throws Exception {
        C7270Rq c7270Rq = new C7270Rq();
        Nc.v.t();
        String string = UUID.randomUUID().toString();
        C7160Oi.f69986o.c(string, new C9117ol(this, c7270Rq));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PreferencesHelper.PREF_ID, string);
        jSONObject.put("args", (JSONObject) obj);
        interfaceC7230Qk.R0(this.f78474a, jSONObject);
        return c7270Rq;
    }

    public final com.google.common.util.concurrent.q zzb(final Object obj) {
        return Mj0.n(this.f78475b, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.nl
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj2) {
                return this.f77969a.a(obj, (InterfaceC7230Qk) obj2);
            }
        }, C7033Kq.f69020g);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
    public final com.google.common.util.concurrent.q zza(Object obj) throws Exception {
        return zzb(obj);
    }
}
