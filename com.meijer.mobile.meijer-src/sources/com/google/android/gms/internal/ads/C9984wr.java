package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: com.google.android.gms.internal.ads.wr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9984wr {

    /* renamed from: a, reason: collision with root package name */
    private final Context f80393a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6932Hr f80394b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f80395c;

    /* renamed from: d, reason: collision with root package name */
    private zzcbg f80396d;

    public final zzcbg a() {
        return this.f80396d;
    }

    public final Integer b() {
        zzcbg zzcbgVar = this.f80396d;
        if (zzcbgVar != null) {
            return zzcbgVar.o();
        }
        return null;
    }

    public final void c(int i10, int i11, int i12, int i13) {
        com.google.android.gms.common.internal.r.e("The underlay may only be modified from the UI thread.");
        zzcbg zzcbgVar = this.f80396d;
        if (zzcbgVar != null) {
            zzcbgVar.h(i10, i11, i12, i13);
        }
    }

    public final void d(int i10, int i11, int i12, int i13, int i14, boolean z10, C6898Gr c6898Gr) {
        if (this.f80396d != null) {
            return;
        }
        C9532sf.a(this.f80394b.zzm().a(), this.f80394b.zzk(), "vpr2");
        Context context = this.f80393a;
        InterfaceC6932Hr interfaceC6932Hr = this.f80394b;
        zzcbg zzcbgVar = new zzcbg(context, interfaceC6932Hr, i14, z10, interfaceC6932Hr.zzm().a(), c6898Gr);
        this.f80396d = zzcbgVar;
        this.f80395c.addView(zzcbgVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f80396d.h(i10, i11, i12, i13);
        this.f80394b.d0(false);
    }

    public final void e() {
        com.google.android.gms.common.internal.r.e("onDestroy must be called from the UI thread.");
        zzcbg zzcbgVar = this.f80396d;
        if (zzcbgVar != null) {
            zzcbgVar.r();
            this.f80395c.removeView(this.f80396d);
            this.f80396d = null;
        }
    }

    public final void f() {
        com.google.android.gms.common.internal.r.e("onPause must be called from the UI thread.");
        zzcbg zzcbgVar = this.f80396d;
        if (zzcbgVar != null) {
            zzcbgVar.x();
        }
    }

    public final void g(int i10) {
        zzcbg zzcbgVar = this.f80396d;
        if (zzcbgVar != null) {
            zzcbgVar.e(i10);
        }
    }

    public C9984wr(Context context, ViewGroup viewGroup, InterfaceC9133ot interfaceC9133ot) {
        this.f80393a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f80395c = viewGroup;
        this.f80394b = interfaceC9133ot;
        this.f80396d = null;
    }
}
