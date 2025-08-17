package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.gU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC8110gU extends AbstractBinderC7211To implements LC {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC7244Uo f74317a;

    /* renamed from: b, reason: collision with root package name */
    private KC f74318b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC9375sG f74319c;

    public final synchronized void C9(InterfaceC7244Uo interfaceC7244Uo) {
        this.f74317a = interfaceC7244Uo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final synchronized void D5(com.google.android.gms.dynamic.b bVar, int i10) throws RemoteException {
        InterfaceC9375sG interfaceC9375sG = this.f74319c;
        if (interfaceC9375sG != null) {
            Qc.p.g("Fail to initialize adapter ".concat(String.valueOf(((LV) interfaceC9375sG).f68377c.f75825a)));
        }
    }

    public final synchronized void D9(InterfaceC9375sG interfaceC9375sG) {
        this.f74319c = interfaceC9375sG;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final synchronized void Q(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC7244Uo interfaceC7244Uo = this.f74317a;
        if (interfaceC7244Uo != null) {
            ((MV) interfaceC7244Uo).f68656a.F2();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final synchronized void Y1(com.google.android.gms.dynamic.b bVar, C7277Vo c7277Vo) throws RemoteException {
        InterfaceC7244Uo interfaceC7244Uo = this.f74317a;
        if (interfaceC7244Uo != null) {
            ((MV) interfaceC7244Uo).f68659d.z0(c7277Vo);
        }
    }

    @Override // com.google.android.gms.internal.ads.LC
    public final synchronized void a2(KC kc2) {
        this.f74318b = kc2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final synchronized void j3(com.google.android.gms.dynamic.b bVar, int i10) throws RemoteException {
        KC kc2 = this.f74318b;
        if (kc2 != null) {
            kc2.zza(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final synchronized void q1(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC7244Uo interfaceC7244Uo = this.f74317a;
        if (interfaceC7244Uo != null) {
            ((MV) interfaceC7244Uo).f68659d.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final synchronized void w0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC7244Uo interfaceC7244Uo = this.f74317a;
        if (interfaceC7244Uo != null) {
            ((MV) interfaceC7244Uo).f68658c.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final synchronized void y(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC7244Uo interfaceC7244Uo = this.f74317a;
        if (interfaceC7244Uo != null) {
            ((MV) interfaceC7244Uo).f68658c.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final synchronized void zze(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC7244Uo interfaceC7244Uo = this.f74317a;
        if (interfaceC7244Uo != null) {
            ((MV) interfaceC7244Uo).f68657b.v();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final synchronized void zzf(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC7244Uo interfaceC7244Uo = this.f74317a;
        if (interfaceC7244Uo != null) {
            interfaceC7244Uo.zzf(bVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final synchronized void zzi(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        KC kc2 = this.f74318b;
        if (kc2 != null) {
            kc2.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244Uo
    public final synchronized void zzl(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        InterfaceC9375sG interfaceC9375sG = this.f74319c;
        if (interfaceC9375sG != null) {
            Executor executor = ((LV) interfaceC9375sG).f68378d.f68896b;
            final C8642lT c8642lT = ((LV) interfaceC9375sG).f68377c;
            final Z50 z50 = ((LV) interfaceC9375sG).f68376b;
            final C8608l60 c8608l60 = ((LV) interfaceC9375sG).f68375a;
            final LV lv2 = (LV) interfaceC9375sG;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.KV
                @Override // java.lang.Runnable
                public final void run() {
                    NV nv2 = lv2.f68378d;
                    NV.e(c8608l60, z50, c8642lT);
                }
            });
        }
    }
}
