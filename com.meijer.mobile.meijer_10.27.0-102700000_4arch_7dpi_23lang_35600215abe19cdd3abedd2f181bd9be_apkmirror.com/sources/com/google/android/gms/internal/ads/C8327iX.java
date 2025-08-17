package com.google.android.gms.internal.ads;

import Mc.InterfaceC4098a;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.iX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8327iX implements InterfaceC4098a, InterfaceC8201hG {

    /* renamed from: a, reason: collision with root package name */
    private Mc.E f74975a;

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final synchronized void Z() {
        Mc.E e10 = this.f74975a;
        if (e10 != null) {
            try {
                e10.zzb();
            } catch (RemoteException e11) {
                Qc.p.h("Remote Exception at onPhysicalClick.", e11);
            }
        }
    }

    public final synchronized void a(Mc.E e10) {
        this.f74975a = e10;
    }

    @Override // Mc.InterfaceC4098a
    public final synchronized void v() {
        Mc.E e10 = this.f74975a;
        if (e10 != null) {
            try {
                e10.zzb();
            } catch (RemoteException e11) {
                Qc.p.h("Remote Exception at onAdClicked.", e11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final synchronized void zzu() {
    }
}
