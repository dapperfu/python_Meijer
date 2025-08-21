package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC8265gm extends AbstractBinderC7197Pl {

    /* renamed from: a, reason: collision with root package name */
    private final Uc.s f75228a;

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final InterfaceC7224Qg zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final boolean r() {
        return this.f75228a.m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final boolean v() {
        return this.f75228a.l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final double zze() {
        if (this.f75228a.o() != null) {
            return this.f75228a.o().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final float zzf() {
        return this.f75228a.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final float zzg() {
        return this.f75228a.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final float zzh() {
        return this.f75228a.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final Bundle zzi() {
        return this.f75228a.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final Oc.Y0 zzj() {
        if (this.f75228a.H() != null) {
            return this.f75228a.H().b();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final InterfaceC7459Xg zzl() {
        Jc.c cVarI = this.f75228a.i();
        if (cVarI != null) {
            return new BinderC7021Kg(cVarI.a(), cVarI.c(), cVarI.b(), cVarI.e(), cVarI.d());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final com.google.android.gms.dynamic.b zzm() {
        View viewA = this.f75228a.a();
        if (viewA == null) {
            return null;
        }
        return com.google.android.gms.dynamic.d.I2(viewA);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final com.google.android.gms.dynamic.b zzn() {
        View viewG = this.f75228a.G();
        if (viewG == null) {
            return null;
        }
        return com.google.android.gms.dynamic.d.I2(viewG);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final com.google.android.gms.dynamic.b zzo() {
        Object objI = this.f75228a.I();
        if (objI == null) {
            return null;
        }
        return com.google.android.gms.dynamic.d.I2(objI);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final String zzp() {
        return this.f75228a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final String zzq() {
        return this.f75228a.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final String zzr() {
        return this.f75228a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final String zzs() {
        return this.f75228a.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final String zzt() {
        return this.f75228a.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final String zzu() {
        return this.f75228a.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final List zzv() {
        List<Jc.c> listJ = this.f75228a.j();
        ArrayList arrayList = new ArrayList();
        if (listJ != null) {
            for (Jc.c cVar : listJ) {
                arrayList.add(new BinderC7021Kg(cVar.a(), cVar.c(), cVar.b(), cVar.e(), cVar.d()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final void zzx() {
        this.f75228a.s();
    }

    public BinderC8265gm(Uc.s sVar) {
        this.f75228a = sVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final void E5(com.google.android.gms.dynamic.b bVar) {
        this.f75228a.q((View) com.google.android.gms.dynamic.d.c2(bVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final void K(com.google.android.gms.dynamic.b bVar) {
        this.f75228a.F((View) com.google.android.gms.dynamic.d.c2(bVar));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7231Ql
    public final void w8(com.google.android.gms.dynamic.b bVar, com.google.android.gms.dynamic.b bVar2, com.google.android.gms.dynamic.b bVar3) {
        HashMap map = (HashMap) com.google.android.gms.dynamic.d.c2(bVar2);
        HashMap map2 = (HashMap) com.google.android.gms.dynamic.d.c2(bVar3);
        this.f75228a.E((View) com.google.android.gms.dynamic.d.c2(bVar), map, map2);
    }
}
