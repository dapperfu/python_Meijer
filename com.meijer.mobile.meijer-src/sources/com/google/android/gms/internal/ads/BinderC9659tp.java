package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.tp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC9659tp extends AbstractBinderC7501Yo {

    /* renamed from: a, reason: collision with root package name */
    private final String f79469a;

    /* renamed from: b, reason: collision with root package name */
    private final int f79470b;

    @Override // com.google.android.gms.internal.ads.InterfaceC7534Zo
    public final int zze() throws RemoteException {
        return this.f79470b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7534Zo
    public final String zzf() throws RemoteException {
        return this.f79469a;
    }

    public BinderC9659tp(String str, int i10) {
        this.f79469a = str;
        this.f79470b = i10;
    }
}
