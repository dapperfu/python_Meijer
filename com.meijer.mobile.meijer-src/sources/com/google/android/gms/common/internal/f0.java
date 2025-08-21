package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.fullstory.FS;
import id.C14719b;

/* loaded from: classes4.dex */
public final class f0 extends Q {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f65702g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC6646c f65703h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(AbstractC6646c abstractC6646c, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC6646c, i10, bundle);
        this.f65703h = abstractC6646c;
        this.f65702g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.Q
    protected final void f(C14719b c14719b) {
        if (this.f65703h.zzx != null) {
            this.f65703h.zzx.onConnectionFailed(c14719b);
        }
        this.f65703h.onConnectionFailed(c14719b);
    }

    @Override // com.google.android.gms.common.internal.Q
    protected final boolean g() throws RemoteException {
        try {
            IBinder iBinder = this.f65702g;
            r.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f65703h.getServiceDescriptor().equals(interfaceDescriptor)) {
                FS.log_w("GmsClient", "service descriptor mismatch: " + this.f65703h.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = this.f65703h.createServiceInterface(this.f65702g);
            if (iInterfaceCreateServiceInterface == null || !(AbstractC6646c.zzn(this.f65703h, 2, 4, iInterfaceCreateServiceInterface) || AbstractC6646c.zzn(this.f65703h, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            this.f65703h.zzC = null;
            AbstractC6646c abstractC6646c = this.f65703h;
            Bundle connectionHint = abstractC6646c.getConnectionHint();
            if (abstractC6646c.zzw == null) {
                return true;
            }
            this.f65703h.zzw.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            FS.log_w("GmsClient", "service probably died");
            return false;
        }
    }
}
