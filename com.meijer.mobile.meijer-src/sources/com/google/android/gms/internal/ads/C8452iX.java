package com.google.android.gms.internal.ads;

import Oc.InterfaceC4376a;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.iX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8452iX implements InterfaceC4376a, InterfaceC8326hG {

    /* renamed from: a, reason: collision with root package name */
    private Oc.E f75815a;

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final synchronized void Z() {
        Oc.E e10 = this.f75815a;
        if (e10 != null) {
            try {
                e10.zzb();
            } catch (RemoteException e11) {
                Sc.p.h("Remote Exception at onPhysicalClick.", e11);
            }
        }
    }

    public final synchronized void a(Oc.E e10) {
        this.f75815a = e10;
    }

    @Override // Oc.InterfaceC4376a
    public final synchronized void v() {
        Oc.E e10 = this.f75815a;
        if (e10 != null) {
            try {
                e10.zzb();
            } catch (RemoteException e11) {
                Sc.p.h("Remote Exception at onAdClicked.", e11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final synchronized void zzu() {
    }
}
