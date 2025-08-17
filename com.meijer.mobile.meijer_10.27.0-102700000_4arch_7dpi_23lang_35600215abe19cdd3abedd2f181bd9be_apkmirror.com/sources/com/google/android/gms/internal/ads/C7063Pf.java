package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Pf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7063Pf extends Xc.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f69400a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7097Qf f69401b;

    C7063Pf(C7097Qf c7097Qf, String str) {
        this.f69400a = str;
        this.f69401b = c7097Qf;
    }

    @Override // Xc.b
    public final void a(String str) {
        Qc.p.g("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            C7097Qf c7097Qf = this.f69401b;
            c7097Qf.f69611g.g(c7097Qf.c(this.f69400a, str).toString(), null);
        } catch (JSONException e10) {
            Qc.p.e("Error creating PACT Error Response JSON: ", e10);
        }
    }

    @Override // Xc.b
    public final void b(Xc.a aVar) {
        String strB = aVar.b();
        try {
            C7097Qf c7097Qf = this.f69401b;
            c7097Qf.f69611g.g(c7097Qf.d(this.f69400a, strB).toString(), null);
        } catch (JSONException e10) {
            Qc.p.e("Error creating PACT Signal Response JSON: ", e10);
        }
    }
}
