package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.tp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC9534tp extends AbstractBinderC7376Yo {

    /* renamed from: a, reason: collision with root package name */
    private final String f78629a;

    /* renamed from: b, reason: collision with root package name */
    private final int f78630b;

    @Override // com.google.android.gms.internal.ads.InterfaceC7409Zo
    public final int zze() throws RemoteException {
        return this.f78630b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7409Zo
    public final String zzf() throws RemoteException {
        return this.f78629a;
    }

    public BinderC9534tp(String str, int i10) {
        this.f78629a = str;
        this.f78630b = i10;
    }
}
