package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.gU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC8235gU extends AbstractBinderC7336To implements LC {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC7369Uo f75157a;

    /* renamed from: b, reason: collision with root package name */
    private KC f75158b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC9500sG f75159c;

    public final synchronized void C9(InterfaceC7369Uo interfaceC7369Uo) {
        this.f75157a = interfaceC7369Uo;
    }

    public final synchronized void D9(InterfaceC9500sG interfaceC9500sG) {
        this.f75159c = interfaceC9500sG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final synchronized void N5(com.google.android.gms.dynamic.b bVar, int i10) throws RemoteException {
        InterfaceC9500sG interfaceC9500sG = this.f75159c;
        if (interfaceC9500sG != null) {
            Sc.p.g("Fail to initialize adapter ".concat(String.valueOf(((LV) interfaceC9500sG).f69217c.f76665a)));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final synchronized void Q(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC7369Uo interfaceC7369Uo = this.f75157a;
        if (interfaceC7369Uo != null) {
            ((MV) interfaceC7369Uo).f69496a.I2();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final synchronized void Z1(com.google.android.gms.dynamic.b bVar, C7402Vo c7402Vo) throws RemoteException {
        InterfaceC7369Uo interfaceC7369Uo = this.f75157a;
        if (interfaceC7369Uo != null) {
            ((MV) interfaceC7369Uo).f69499d.y0(c7402Vo);
        }
    }

    @Override // com.google.android.gms.internal.ads.LC
    public final synchronized void a2(KC kc2) {
        this.f75158b = kc2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final synchronized void q3(com.google.android.gms.dynamic.b bVar, int i10) throws RemoteException {
        KC kc2 = this.f75158b;
        if (kc2 != null) {
            kc2.zza(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final synchronized void y(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC7369Uo interfaceC7369Uo = this.f75157a;
        if (interfaceC7369Uo != null) {
            ((MV) interfaceC7369Uo).f69498c.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final synchronized void z0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC7369Uo interfaceC7369Uo = this.f75157a;
        if (interfaceC7369Uo != null) {
            ((MV) interfaceC7369Uo).f69498c.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final synchronized void z1(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC7369Uo interfaceC7369Uo = this.f75157a;
        if (interfaceC7369Uo != null) {
            ((MV) interfaceC7369Uo).f69499d.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final synchronized void zze(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC7369Uo interfaceC7369Uo = this.f75157a;
        if (interfaceC7369Uo != null) {
            ((MV) interfaceC7369Uo).f69497b.v();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final synchronized void zzf(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC7369Uo interfaceC7369Uo = this.f75157a;
        if (interfaceC7369Uo != null) {
            interfaceC7369Uo.zzf(bVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final synchronized void zzi(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        KC kc2 = this.f75158b;
        if (kc2 != null) {
            kc2.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7369Uo
    public final synchronized void zzl(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC9500sG interfaceC9500sG = this.f75159c;
        if (interfaceC9500sG != null) {
            Executor executor = ((LV) interfaceC9500sG).f69218d.f69736b;
            final C8767lT c8767lT = ((LV) interfaceC9500sG).f69217c;
            final Z50 z50 = ((LV) interfaceC9500sG).f69216b;
            final C8733l60 c8733l60 = ((LV) interfaceC9500sG).f69215a;
            final LV lv2 = (LV) interfaceC9500sG;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.KV
                @Override // java.lang.Runnable
                public final void run() {
                    NV nv2 = lv2.f69218d;
                    NV.e(c8733l60, z50, c8767lT);
                }
            });
        }
    }
}
