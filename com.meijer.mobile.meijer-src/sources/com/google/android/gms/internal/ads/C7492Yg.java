package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Yg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7492Yg extends Jc.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7459Xg f72431a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f72432b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f72433c;

    /* renamed from: d, reason: collision with root package name */
    private final double f72434d;

    /* renamed from: e, reason: collision with root package name */
    private final int f72435e;

    /* renamed from: f, reason: collision with root package name */
    private final int f72436f;

    @Override // Jc.c
    public final Drawable a() {
        return this.f72432b;
    }

    @Override // Jc.c
    public final double b() {
        return this.f72434d;
    }

    @Override // Jc.c
    public final Uri c() {
        return this.f72433c;
    }

    @Override // Jc.c
    public final int d() {
        return this.f72436f;
    }

    @Override // Jc.c
    public final int e() {
        return this.f72435e;
    }

    public C7492Yg(InterfaceC7459Xg interfaceC7459Xg) {
        double dZzb;
        int iZzd;
        com.google.android.gms.dynamic.b bVarZzf;
        this.f72431a = interfaceC7459Xg;
        Uri uriZze = null;
        try {
            bVarZzf = interfaceC7459Xg.zzf();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
        Drawable drawable = bVarZzf != null ? (Drawable) com.google.android.gms.dynamic.d.c2(bVarZzf) : null;
        this.f72432b = drawable;
        try {
            uriZze = this.f72431a.zze();
        } catch (RemoteException e11) {
            Sc.p.e("", e11);
        }
        this.f72433c = uriZze;
        try {
            dZzb = this.f72431a.zzb();
        } catch (RemoteException e12) {
            Sc.p.e("", e12);
            dZzb = 1.0d;
        }
        this.f72434d = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.f72431a.zzd();
        } catch (RemoteException e13) {
            Sc.p.e("", e13);
            iZzd = -1;
        }
        this.f72435e = iZzd;
        try {
            iZzc = this.f72431a.zzc();
        } catch (RemoteException e14) {
            Sc.p.e("", e14);
        }
        this.f72436f = iZzc;
    }
}
