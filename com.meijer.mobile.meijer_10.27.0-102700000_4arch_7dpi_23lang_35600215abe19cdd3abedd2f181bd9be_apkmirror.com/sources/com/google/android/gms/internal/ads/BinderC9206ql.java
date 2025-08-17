package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ql, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC9206ql extends AbstractBinderC8475ju {

    /* renamed from: a, reason: collision with root package name */
    private final Nd.a f77838a;

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final List E3(String str, String str2) throws RemoteException {
        return this.f77838a.g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final void F3(com.google.android.gms.dynamic.b bVar, String str, String str2) throws RemoteException {
        this.f77838a.t(bVar != null ? (Activity) com.google.android.gms.dynamic.d.b2(bVar) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final void J0(Bundle bundle) throws RemoteException {
        this.f77838a.s(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final Bundle S6(Bundle bundle) throws RemoteException {
        return this.f77838a.p(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final void T(Bundle bundle) throws RemoteException {
        this.f77838a.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final Map T8(String str, String str2, boolean z10) throws RemoteException {
        return this.f77838a.m(str, str2, z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final void X0(String str, String str2, com.google.android.gms.dynamic.b bVar) throws RemoteException {
        this.f77838a.u(str, str2, bVar != null ? com.google.android.gms.dynamic.d.b2(bVar) : null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final int d(String str) throws RemoteException {
        return this.f77838a.l(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final void i9(String str, String str2, Bundle bundle) throws RemoteException {
        this.f77838a.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final void m8(String str, String str2, Bundle bundle) throws RemoteException {
        this.f77838a.n(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final void u(Bundle bundle) throws RemoteException {
        this.f77838a.r(bundle);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final void x(String str) throws RemoteException {
        this.f77838a.a(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final void z(String str) throws RemoteException {
        this.f77838a.c(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final long zzc() throws RemoteException {
        return this.f77838a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final String zze() throws RemoteException {
        return this.f77838a.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final String zzf() throws RemoteException {
        return this.f77838a.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final String zzg() throws RemoteException {
        return this.f77838a.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final String zzh() throws RemoteException {
        return this.f77838a.i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8582ku
    public final String zzi() throws RemoteException {
        return this.f77838a.j();
    }

    BinderC9206ql(Nd.a aVar) {
        this.f77838a = aVar;
    }
}
