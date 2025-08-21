package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Kg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC7021Kg extends AbstractBinderC7426Wg {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f68985a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f68986b;

    /* renamed from: c, reason: collision with root package name */
    private final double f68987c;

    /* renamed from: d, reason: collision with root package name */
    private final int f68988d;

    /* renamed from: e, reason: collision with root package name */
    private final int f68989e;

    @Override // com.google.android.gms.internal.ads.InterfaceC7459Xg
    public final double zzb() {
        return this.f68987c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7459Xg
    public final int zzc() {
        return this.f68989e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7459Xg
    public final int zzd() {
        return this.f68988d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7459Xg
    public final Uri zze() throws RemoteException {
        return this.f68986b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7459Xg
    public final com.google.android.gms.dynamic.b zzf() throws RemoteException {
        return com.google.android.gms.dynamic.d.I2(this.f68985a);
    }

    public BinderC7021Kg(Drawable drawable, Uri uri, double d10, int i10, int i11) {
        this.f68985a = drawable;
        this.f68986b = uri;
        this.f68987c = d10;
        this.f68988d = i10;
        this.f68989e = i11;
    }
}
