package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.fullstory.FS;
import gd.C14243b;

/* loaded from: classes4.dex */
public final class f0 extends Q {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f64862g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC6521c f64863h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(AbstractC6521c abstractC6521c, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC6521c, i10, bundle);
        this.f64863h = abstractC6521c;
        this.f64862g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.Q
    protected final void f(C14243b c14243b) {
        if (this.f64863h.zzx != null) {
            this.f64863h.zzx.onConnectionFailed(c14243b);
        }
        this.f64863h.onConnectionFailed(c14243b);
    }

    @Override // com.google.android.gms.common.internal.Q
    protected final boolean g() throws RemoteException {
        try {
            IBinder iBinder = this.f64862g;
            r.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f64863h.getServiceDescriptor().equals(interfaceDescriptor)) {
                FS.log_w("GmsClient", "service descriptor mismatch: " + this.f64863h.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = this.f64863h.createServiceInterface(this.f64862g);
            if (iInterfaceCreateServiceInterface == null || !(AbstractC6521c.zzn(this.f64863h, 2, 4, iInterfaceCreateServiceInterface) || AbstractC6521c.zzn(this.f64863h, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            this.f64863h.zzC = null;
            AbstractC6521c abstractC6521c = this.f64863h;
            Bundle connectionHint = abstractC6521c.getConnectionHint();
            if (abstractC6521c.zzw == null) {
                return true;
            }
            this.f64863h.zzw.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            FS.log_w("GmsClient", "service probably died");
            return false;
        }
    }
}
