package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.hX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8220hX implements InterfaceC8835nD {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f74739a = new AtomicReference();

    public final void a(Mc.N0 n02) {
        this.f74739a.set(n02);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8835nD
    public final void i(final Mc.f2 f2Var) {
        A40.a(this.f74739a, new InterfaceC10101z40() { // from class: com.google.android.gms.internal.ads.gX
            @Override // com.google.android.gms.internal.ads.InterfaceC10101z40
            public final void zza(Object obj) throws RemoteException {
                ((Mc.N0) obj).p8(f2Var);
            }
        });
    }
}
