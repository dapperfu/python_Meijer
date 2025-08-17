package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;

/* renamed from: com.google.android.gms.internal.ads.gn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8142gn extends NativeAd.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7334Xg f74389a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f74390b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f74391c;

    /* renamed from: d, reason: collision with root package name */
    private final double f74392d;

    /* renamed from: e, reason: collision with root package name */
    private final int f74393e;

    /* renamed from: f, reason: collision with root package name */
    private final int f74394f;

    public C8142gn(InterfaceC7334Xg interfaceC7334Xg) {
        double dZzb;
        int iZzd;
        com.google.android.gms.dynamic.b bVarZzf;
        this.f74389a = interfaceC7334Xg;
        Uri uriZze = null;
        try {
            bVarZzf = interfaceC7334Xg.zzf();
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
        Drawable drawable = bVarZzf != null ? (Drawable) com.google.android.gms.dynamic.d.b2(bVarZzf) : null;
        this.f74390b = drawable;
        try {
            uriZze = this.f74389a.zze();
        } catch (RemoteException e11) {
            Qc.p.e("", e11);
        }
        this.f74391c = uriZze;
        try {
            dZzb = this.f74389a.zzb();
        } catch (RemoteException e12) {
            Qc.p.e("", e12);
            dZzb = 1.0d;
        }
        this.f74392d = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.f74389a.zzd();
        } catch (RemoteException e13) {
            Qc.p.e("", e13);
            iZzd = -1;
        }
        this.f74393e = iZzd;
        try {
            iZzc = this.f74389a.zzc();
        } catch (RemoteException e14) {
            Qc.p.e("", e14);
        }
        this.f74394f = iZzc;
    }
}
