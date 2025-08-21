package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.hX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8345hX implements InterfaceC8960nD {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f75579a = new AtomicReference();

    public final void a(Oc.N0 n02) {
        this.f75579a.set(n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8960nD
    public final void i(final Oc.f2 f2Var) {
        A40.a(this.f75579a, new InterfaceC10226z40() { // from class: com.google.android.gms.internal.ads.gX
            @Override // com.google.android.gms.internal.ads.InterfaceC10226z40
            public final void zza(Object obj) throws RemoteException {
                ((Oc.N0) obj).m3(f2Var);
            }
        });
    }
}
