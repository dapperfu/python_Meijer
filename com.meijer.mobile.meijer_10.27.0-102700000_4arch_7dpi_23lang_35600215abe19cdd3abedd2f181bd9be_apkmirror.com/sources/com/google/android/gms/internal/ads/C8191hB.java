package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.hB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8191hB implements InterfaceC10118zD, InterfaceC9482tG {

    /* renamed from: a, reason: collision with root package name */
    private final Context f74626a;

    /* renamed from: b, reason: collision with root package name */
    private final C9570u60 f74627b;

    /* renamed from: c, reason: collision with root package name */
    private final Qc.a f74628c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.r0 f74629d;

    /* renamed from: e, reason: collision with root package name */
    private final EO f74630e;

    /* renamed from: f, reason: collision with root package name */
    private final Z80 f74631f;

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void A0(C8608l60 c8608l60) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9482tG
    public final void i(String str) {
    }

    private final void b() throws JSONException {
        if (((Boolean) Mc.A.c().a(C8659lf.f76268b4)).booleanValue()) {
            Pc.r0 r0Var = this.f74629d;
            Context context = this.f74626a;
            Qc.a aVar = this.f74628c;
            C9570u60 c9570u60 = this.f74627b;
            Z80 z80 = this.f74631f;
            Lc.v.d().c(context, aVar, c9570u60.f78740f, r0Var.zzg(), z80);
        }
        this.f74630e.r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9482tG
    public final void a(Vc.N n10) throws JSONException {
        if (((Boolean) Mc.A.c().a(C8659lf.f76282c4)).booleanValue()) {
            b();
        }
    }

    public C8191hB(Context context, C9570u60 c9570u60, Qc.a aVar, Pc.r0 r0Var, EO eo2, Z80 z80) {
        this.f74626a = context;
        this.f74627b = c9570u60;
        this.f74628c = aVar;
        this.f74629d = r0Var;
        this.f74630e = eo2;
        this.f74631f = z80;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10118zD
    public final void N(C9853wo c9853wo) throws JSONException {
        b();
    }
}
