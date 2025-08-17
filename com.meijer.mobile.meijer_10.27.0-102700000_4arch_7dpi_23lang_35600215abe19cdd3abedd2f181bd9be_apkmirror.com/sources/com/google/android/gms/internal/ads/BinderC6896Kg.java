package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Kg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC6896Kg extends AbstractBinderC7301Wg {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f68145a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f68146b;

    /* renamed from: c, reason: collision with root package name */
    private final double f68147c;

    /* renamed from: d, reason: collision with root package name */
    private final int f68148d;

    /* renamed from: e, reason: collision with root package name */
    private final int f68149e;

    @Override // com.google.android.gms.internal.ads.InterfaceC7334Xg
    public final double zzb() {
        return this.f68147c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7334Xg
    public final int zzc() {
        return this.f68149e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7334Xg
    public final int zzd() {
        return this.f68148d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7334Xg
    public final Uri zze() throws RemoteException {
        return this.f68146b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7334Xg
    public final com.google.android.gms.dynamic.b zzf() throws RemoteException {
        return com.google.android.gms.dynamic.d.F2(this.f68145a);
    }

    public BinderC6896Kg(Drawable drawable, Uri uri, double d10, int i10, int i11) {
        this.f68145a = drawable;
        this.f68146b = uri;
        this.f68147c = d10;
        this.f68148d = i10;
        this.f68149e = i11;
    }
}
