package com.google.android.gms.internal.ads;

import io.constructor.data.local.PreferencesHelper;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9099pl implements InterfaceC9416sj0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f77634a = "google.afma.activeView.handleUpdate";

    /* renamed from: b, reason: collision with root package name */
    private final com.google.common.util.concurrent.q f77635b;

    C9099pl(com.google.common.util.concurrent.q qVar, String str, InterfaceC7273Vk interfaceC7273Vk, InterfaceC7240Uk interfaceC7240Uk) {
        this.f77635b = qVar;
    }

    final /* synthetic */ com.google.common.util.concurrent.q a(Object obj, InterfaceC7105Qk interfaceC7105Qk) throws Exception {
        C7145Rq c7145Rq = new C7145Rq();
        Lc.v.t();
        String string = UUID.randomUUID().toString();
        C7035Oi.f69146o.c(string, new C8992ol(this, c7145Rq));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PreferencesHelper.PREF_ID, string);
        jSONObject.put("args", (JSONObject) obj);
        interfaceC7105Qk.R0(this.f77634a, jSONObject);
        return c7145Rq;
    }

    public final com.google.common.util.concurrent.q zzb(final Object obj) {
        return Mj0.n(this.f77635b, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.nl
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj2) {
                return this.f77129a.a(obj, (InterfaceC7105Qk) obj2);
            }
        }, C6908Kq.f68180g);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
    public final com.google.common.util.concurrent.q zza(Object obj) throws Exception {
        return zzb(obj);
    }
}
