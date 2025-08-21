package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;

/* renamed from: com.google.android.gms.internal.ads.gn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8267gn extends NativeAd.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7459Xg f75229a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f75230b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f75231c;

    /* renamed from: d, reason: collision with root package name */
    private final double f75232d;

    /* renamed from: e, reason: collision with root package name */
    private final int f75233e;

    /* renamed from: f, reason: collision with root package name */
    private final int f75234f;

    public C8267gn(InterfaceC7459Xg interfaceC7459Xg) {
        double dZzb;
        int iZzd;
        com.google.android.gms.dynamic.b bVarZzf;
        this.f75229a = interfaceC7459Xg;
        Uri uriZze = null;
        try {
            bVarZzf = interfaceC7459Xg.zzf();
        } catch (RemoteException e10) {
            Sc.p.e("", e10);
        }
        Drawable drawable = bVarZzf != null ? (Drawable) com.google.android.gms.dynamic.d.c2(bVarZzf) : null;
        this.f75230b = drawable;
        try {
            uriZze = this.f75229a.zze();
        } catch (RemoteException e11) {
            Sc.p.e("", e11);
        }
        this.f75231c = uriZze;
        try {
            dZzb = this.f75229a.zzb();
        } catch (RemoteException e12) {
            Sc.p.e("", e12);
            dZzb = 1.0d;
        }
        this.f75232d = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.f75229a.zzd();
        } catch (RemoteException e13) {
            Sc.p.e("", e13);
            iZzd = -1;
        }
        this.f75233e = iZzd;
        try {
            iZzc = this.f75229a.zzc();
        } catch (RemoteException e14) {
            Sc.p.e("", e14);
        }
        this.f75234f = iZzc;
    }
}
