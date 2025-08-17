package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC8140gm extends AbstractBinderC7072Pl {

    /* renamed from: a, reason: collision with root package name */
    private final Sc.s f74388a;

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final InterfaceC7099Qg zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final boolean r() {
        return this.f74388a.m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final boolean v() {
        return this.f74388a.l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final double zze() {
        if (this.f74388a.o() != null) {
            return this.f74388a.o().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final float zzf() {
        return this.f74388a.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final float zzg() {
        return this.f74388a.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final float zzh() {
        return this.f74388a.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final Bundle zzi() {
        return this.f74388a.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final Mc.Y0 zzj() {
        if (this.f74388a.H() != null) {
            return this.f74388a.H().b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final InterfaceC7334Xg zzl() {
        Hc.c cVarI = this.f74388a.i();
        if (cVarI != null) {
            return new BinderC6896Kg(cVarI.a(), cVarI.c(), cVarI.b(), cVarI.e(), cVarI.d());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final com.google.android.gms.dynamic.b zzm() {
        View viewA = this.f74388a.a();
        if (viewA == null) {
            return null;
        }
        return com.google.android.gms.dynamic.d.F2(viewA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final com.google.android.gms.dynamic.b zzn() {
        View viewG = this.f74388a.G();
        if (viewG == null) {
            return null;
        }
        return com.google.android.gms.dynamic.d.F2(viewG);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final com.google.android.gms.dynamic.b zzo() {
        Object objI = this.f74388a.I();
        if (objI == null) {
            return null;
        }
        return com.google.android.gms.dynamic.d.F2(objI);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final String zzp() {
        return this.f74388a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final String zzq() {
        return this.f74388a.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final String zzr() {
        return this.f74388a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final String zzs() {
        return this.f74388a.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final String zzt() {
        return this.f74388a.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final String zzu() {
        return this.f74388a.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final List zzv() {
        List<Hc.c> listJ = this.f74388a.j();
        ArrayList arrayList = new ArrayList();
        if (listJ != null) {
            for (Hc.c cVar : listJ) {
                arrayList.add(new BinderC6896Kg(cVar.a(), cVar.c(), cVar.b(), cVar.e(), cVar.d()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final void zzx() {
        this.f74388a.s();
    }

    public BinderC8140gm(Sc.s sVar) {
        this.f74388a = sVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final void C8(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) {
        HashMap map = (HashMap) com.google.android.gms.dynamic.d.b2(bVar2);
        HashMap map2 = (HashMap) com.google.android.gms.dynamic.d.b2(bVar3);
        this.f74388a.E((View) com.google.android.gms.dynamic.d.b2(bVar), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final void K(com.google.android.gms.dynamic.b bVar) {
        this.f74388a.F((View) com.google.android.gms.dynamic.d.b2(bVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7106Ql
    public final void x5(com.google.android.gms.dynamic.b bVar) {
        this.f74388a.q((View) com.google.android.gms.dynamic.d.b2(bVar));
    }
}
