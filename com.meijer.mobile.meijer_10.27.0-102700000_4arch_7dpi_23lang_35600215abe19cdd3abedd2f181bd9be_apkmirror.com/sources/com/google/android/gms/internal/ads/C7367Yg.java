package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Yg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7367Yg extends Hc.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7334Xg f71591a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f71592b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f71593c;

    /* renamed from: d, reason: collision with root package name */
    private final double f71594d;

    /* renamed from: e, reason: collision with root package name */
    private final int f71595e;

    /* renamed from: f, reason: collision with root package name */
    private final int f71596f;

    @Override // Hc.c
    public final Drawable a() {
        return this.f71592b;
    }

    @Override // Hc.c
    public final double b() {
        return this.f71594d;
    }

    @Override // Hc.c
    public final Uri c() {
        return this.f71593c;
    }

    @Override // Hc.c
    public final int d() {
        return this.f71596f;
    }

    @Override // Hc.c
    public final int e() {
        return this.f71595e;
    }

    public C7367Yg(InterfaceC7334Xg interfaceC7334Xg) {
        double dZzb;
        int iZzd;
        com.google.android.gms.dynamic.b bVarZzf;
        this.f71591a = interfaceC7334Xg;
        Uri uriZze = null;
        try {
            bVarZzf = interfaceC7334Xg.zzf();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
        Drawable drawable = bVarZzf != null ? (Drawable) com.google.android.gms.dynamic.d.b2(bVarZzf) : null;
        this.f71592b = drawable;
        try {
            uriZze = this.f71591a.zze();
        } catch (RemoteException e11) {
            Qc.p.e("", e11);
        }
        this.f71593c = uriZze;
        try {
            dZzb = this.f71591a.zzb();
        } catch (RemoteException e12) {
            Qc.p.e("", e12);
            dZzb = 1.0d;
        }
        this.f71594d = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.f71591a.zzd();
        } catch (RemoteException e13) {
            Qc.p.e("", e13);
            iZzd = -1;
        }
        this.f71595e = iZzd;
        try {
            iZzc = this.f71591a.zzc();
        } catch (RemoteException e14) {
            Qc.p.e("", e14);
        }
        this.f71596f = iZzc;
    }
}
