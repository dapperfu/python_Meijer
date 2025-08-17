package com.google.android.gms.internal.ads;

import Z.C5503a;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class PK extends AbstractBinderC9091ph {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69308a;

    /* renamed from: b, reason: collision with root package name */
    private final C9914xI f69309b;

    /* renamed from: c, reason: collision with root package name */
    private YI f69310c;

    /* renamed from: d, reason: collision with root package name */
    private C9379sI f69311d;

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final String S(String str) {
        return (String) this.f69309b.V().get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final InterfaceC7334Xg s(String str) {
        return (InterfaceC7334Xg) this.f69309b.U().get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final void z(String str) {
        C9379sI c9379sI = this.f69311d;
        if (c9379sI != null) {
            c9379sI.n(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final Mc.Y0 zze() {
        return this.f69309b.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final InterfaceC7235Ug zzf() throws RemoteException {
        try {
            return this.f69311d.P().a();
        } catch (NullPointerException e10) {
            Lc.v.s().x(e10, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final com.google.android.gms.dynamic.b zzh() {
        return com.google.android.gms.dynamic.d.F2(this.f69308a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final String zzi() {
        return this.f69309b.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final List zzk() {
        try {
            Z.n0 n0VarU = this.f69309b.U();
            Z.n0 n0VarV = this.f69309b.V();
            String[] strArr = new String[n0VarU.getSize() + n0VarV.getSize()];
            int i10 = 0;
            for (int i11 = 0; i11 < n0VarU.getSize(); i11++) {
                strArr[i10] = (String) n0VarU.g(i11);
                i10++;
            }
            for (int i12 = 0; i12 < n0VarV.getSize(); i12++) {
                strArr[i10] = (String) n0VarV.g(i12);
                i10++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e10) {
            Lc.v.s().x(e10, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final void zzl() {
        C9379sI c9379sI = this.f69311d;
        if (c9379sI != null) {
            c9379sI.a();
        }
        this.f69311d = null;
        this.f69310c = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final void zzm() {
        try {
            String strC = this.f69309b.c();
            if (Objects.equals(strC, "Google")) {
                Qc.p.g("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(strC)) {
                Qc.p.g("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            C9379sI c9379sI = this.f69311d;
            if (c9379sI != null) {
                c9379sI.S(strC, false);
            }
        } catch (NullPointerException e10) {
            Lc.v.s().x(e10, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final void zzo() {
        C9379sI c9379sI = this.f69311d;
        if (c9379sI != null) {
            c9379sI.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final boolean zzq() {
        C9379sI c9379sI = this.f69311d;
        return (c9379sI == null || c9379sI.F()) && this.f69309b.e0() != null && this.f69309b.f0() == null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final boolean zzt() {
        C7789dT c7789dTH0 = this.f69309b.h0();
        if (c7789dTH0 == null) {
            Qc.p.g("Trying to start OMID session before creation.");
            return false;
        }
        Lc.v.b().a(c7789dTH0.a());
        if (this.f69309b.e0() == null) {
            return true;
        }
        this.f69309b.e0().L("onSdkLoaded", new C5503a());
        return true;
    }

    public PK(Context context, C9914xI c9914xI, YI yi2, C9379sI c9379sI) {
        this.f69308a = context;
        this.f69309b = c9914xI;
        this.f69310c = yi2;
        this.f69311d = c9379sI;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final boolean D(com.google.android.gms.dynamic.b bVar) throws SecurityException {
        YI yi2;
        Object objB2 = com.google.android.gms.dynamic.d.b2(bVar);
        if ((objB2 instanceof ViewGroup) && (yi2 = this.f69310c) != null && yi2.g((ViewGroup) objB2)) {
            this.f69309b.f0().e0(new OK(this, "_videoMediaView"));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final boolean E(com.google.android.gms.dynamic.b bVar) throws SecurityException {
        YI yi2;
        Object objB2 = com.google.android.gms.dynamic.d.b2(bVar);
        if ((objB2 instanceof ViewGroup) && (yi2 = this.f69310c) != null && yi2.f((ViewGroup) objB2)) {
            this.f69309b.d0().e0(new OK(this, "_videoMediaView"));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9198qh
    public final void zzp(com.google.android.gms.dynamic.b bVar) throws SecurityException {
        C9379sI c9379sI;
        Object objB2 = com.google.android.gms.dynamic.d.b2(bVar);
        if ((objB2 instanceof View) && this.f69309b.h0() != null && (c9379sI = this.f69311d) != null) {
            c9379sI.s((View) objB2);
        }
    }
}
