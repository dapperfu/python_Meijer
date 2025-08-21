package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Pf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7188Pf extends Zc.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f70240a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7222Qf f70241b;

    C7188Pf(C7222Qf c7222Qf, String str) {
        this.f70240a = str;
        this.f70241b = c7222Qf;
    }

    @Override // Zc.b
    public final void a(String str) {
        Sc.p.g("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            C7222Qf c7222Qf = this.f70241b;
            c7222Qf.f70451g.g(c7222Qf.c(this.f70240a, str).toString(), null);
        } catch (JSONException e10) {
            Sc.p.e("Error creating PACT Error Response JSON: ", e10);
        }
    }

    @Override // Zc.b
    public final void b(Zc.a aVar) {
        String strB = aVar.b();
        try {
            C7222Qf c7222Qf = this.f70241b;
            c7222Qf.f70451g.g(c7222Qf.d(this.f70240a, strB).toString(), null);
        } catch (JSONException e10) {
            Sc.p.e("Error creating PACT Signal Response JSON: ", e10);
        }
    }
}
