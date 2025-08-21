package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.hB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8316hB implements InterfaceC10243zD, InterfaceC9607tG {

    /* renamed from: a, reason: collision with root package name */
    private final Context f75466a;

    /* renamed from: b, reason: collision with root package name */
    private final C9695u60 f75467b;

    /* renamed from: c, reason: collision with root package name */
    private final Sc.a f75468c;

    /* renamed from: d, reason: collision with root package name */
    private final Rc.r0 f75469d;

    /* renamed from: e, reason: collision with root package name */
    private final EO f75470e;

    /* renamed from: f, reason: collision with root package name */
    private final Z80 f75471f;

    @Override // com.google.android.gms.internal.ads.InterfaceC9607tG
    public final void i(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void z0(C8733l60 c8733l60) {
    }

    private final void b() throws JSONException {
        if (((Boolean) Oc.A.c().a(C8784lf.f77108b4)).booleanValue()) {
            Rc.r0 r0Var = this.f75469d;
            Context context = this.f75466a;
            Sc.a aVar = this.f75468c;
            C9695u60 c9695u60 = this.f75467b;
            Z80 z80 = this.f75471f;
            Nc.v.d().c(context, aVar, c9695u60.f79580f, r0Var.zzg(), z80);
        }
        this.f75470e.r();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9607tG
    public final void a(Xc.N n10) throws JSONException {
        if (((Boolean) Oc.A.c().a(C8784lf.f77122c4)).booleanValue()) {
            b();
        }
    }

    public C8316hB(Context context, C9695u60 c9695u60, Sc.a aVar, Rc.r0 r0Var, EO eo2, Z80 z80) {
        this.f75466a = context;
        this.f75467b = c9695u60;
        this.f75468c = aVar;
        this.f75469d = r0Var;
        this.f75470e = eo2;
        this.f75471f = z80;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10243zD
    public final void d0(C9978wo c9978wo) throws JSONException {
        b();
    }
}
