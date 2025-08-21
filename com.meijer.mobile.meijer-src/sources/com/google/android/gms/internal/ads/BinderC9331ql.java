package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ql, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC9331ql extends AbstractBinderC8600ju {

    /* renamed from: a, reason: collision with root package name */
    private final Pd.a f78678a;

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final void L0(Bundle bundle) throws RemoteException {
        this.f78678a.s(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final Map O8(String str, String str2, boolean z10) throws RemoteException {
        return this.f78678a.m(str, str2, z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final List Q3(String str, String str2) throws RemoteException {
        return this.f78678a.g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final void R3(com.google.android.gms.dynamic.b bVar, String str, String str2) throws RemoteException {
        this.f78678a.t(bVar != null ? (Activity) com.google.android.gms.dynamic.d.c2(bVar) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final void T(Bundle bundle) throws RemoteException {
        this.f78678a.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final void a1(String str, String str2, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        this.f78678a.u(str, str2, bVar != null ? com.google.android.gms.dynamic.d.c2(bVar) : null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final Bundle c7(Bundle bundle) throws RemoteException {
        return this.f78678a.p(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final int d(String str) throws RemoteException {
        return this.f78678a.l(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final void j9(String str, String str2, Bundle bundle) throws RemoteException {
        this.f78678a.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final void k8(String str, String str2, Bundle bundle) throws RemoteException {
        this.f78678a.n(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final void u(Bundle bundle) throws RemoteException {
        this.f78678a.r(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final void x(String str) throws RemoteException {
        this.f78678a.a(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final void z(String str) throws RemoteException {
        this.f78678a.c(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final long zzc() throws RemoteException {
        return this.f78678a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final String zze() throws RemoteException {
        return this.f78678a.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final String zzf() throws RemoteException {
        return this.f78678a.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final String zzg() throws RemoteException {
        return this.f78678a.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final String zzh() throws RemoteException {
        return this.f78678a.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8707ku
    public final String zzi() throws RemoteException {
        return this.f78678a.j();
    }

    BinderC9331ql(Pd.a aVar) {
        this.f78678a = aVar;
    }
}
