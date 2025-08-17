package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: com.google.android.gms.internal.ads.wr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9859wr {

    /* renamed from: a, reason: collision with root package name */
    private final Context f79553a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6807Hr f79554b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f79555c;

    /* renamed from: d, reason: collision with root package name */
    private zzcbg f79556d;

    public final zzcbg a() {
        return this.f79556d;
    }

    public final Integer b() {
        zzcbg zzcbgVar = this.f79556d;
        if (zzcbgVar != null) {
            return zzcbgVar.o();
        }
        return null;
    }

    public final void c(int i10, int i11, int i12, int i13) {
        com.google.android.gms.common.internal.r.e("The underlay may only be modified from the UI thread.");
        zzcbg zzcbgVar = this.f79556d;
        if (zzcbgVar != null) {
            zzcbgVar.h(i10, i11, i12, i13);
        }
    }

    public final void d(int i10, int i11, int i12, int i13, int i14, boolean z10, C6773Gr c6773Gr) {
        if (this.f79556d != null) {
            return;
        }
        C9407sf.a(this.f79554b.zzm().a(), this.f79554b.zzk(), "vpr2");
        Context context = this.f79553a;
        InterfaceC6807Hr interfaceC6807Hr = this.f79554b;
        zzcbg zzcbgVar = new zzcbg(context, interfaceC6807Hr, i14, z10, interfaceC6807Hr.zzm().a(), c6773Gr);
        this.f79556d = zzcbgVar;
        this.f79555c.addView(zzcbgVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f79556d.h(i10, i11, i12, i13);
        this.f79554b.b0(false);
    }

    public final void e() {
        com.google.android.gms.common.internal.r.e("onDestroy must be called from the UI thread.");
        zzcbg zzcbgVar = this.f79556d;
        if (zzcbgVar != null) {
            zzcbgVar.r();
            this.f79555c.removeView(this.f79556d);
            this.f79556d = null;
        }
    }

    public final void f() {
        com.google.android.gms.common.internal.r.e("onPause must be called from the UI thread.");
        zzcbg zzcbgVar = this.f79556d;
        if (zzcbgVar != null) {
            zzcbgVar.x();
        }
    }

    public final void g(int i10) {
        zzcbg zzcbgVar = this.f79556d;
        if (zzcbgVar != null) {
            zzcbgVar.e(i10);
        }
    }

    public C9859wr(Context context, ViewGroup viewGroup, InterfaceC9008ot interfaceC9008ot) {
        this.f79553a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f79555c = viewGroup;
        this.f79554b = interfaceC9008ot;
        this.f79556d = null;
    }
}
