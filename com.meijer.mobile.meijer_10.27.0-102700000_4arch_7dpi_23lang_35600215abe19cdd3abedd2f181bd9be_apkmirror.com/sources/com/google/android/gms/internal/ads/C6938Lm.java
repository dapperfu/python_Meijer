package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Lm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6938Lm implements Sc.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC9849wm f68424a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC6835Il f68425b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ BinderC6971Mm f68426c;

    C6938Lm(BinderC6971Mm binderC6971Mm, InterfaceC9849wm interfaceC9849wm, InterfaceC6835Il interfaceC6835Il) {
        this.f68424a = interfaceC9849wm;
        this.f68425b = interfaceC6835Il;
        this.f68426c = binderC6971Mm;
    }

    @Override // Sc.d
    public final void a(Ec.a aVar) {
        try {
            this.f68424a.b(aVar.d());
        } catch (RemoteException e10) {
            Qc.p.e("", e10);
        }
    }
}
