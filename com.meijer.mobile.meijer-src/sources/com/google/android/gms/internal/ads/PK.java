package com.google.android.gms.internal.ads;

import Z.C5603a;
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
public final class PK extends AbstractBinderC9216ph {

    /* renamed from: a, reason: collision with root package name */
    private final Context f70148a;

    /* renamed from: b, reason: collision with root package name */
    private final C10039xI f70149b;

    /* renamed from: c, reason: collision with root package name */
    private YI f70150c;

    /* renamed from: d, reason: collision with root package name */
    private C9504sI f70151d;

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final String S(String str) {
        return (String) this.f70149b.V().get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final InterfaceC7459Xg s(String str) {
        return (InterfaceC7459Xg) this.f70149b.U().get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final void z(String str) {
        C9504sI c9504sI = this.f70151d;
        if (c9504sI != null) {
            c9504sI.n(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final Oc.Y0 zze() {
        return this.f70149b.W();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final InterfaceC7360Ug zzf() throws RemoteException {
        try {
            return this.f70151d.P().a();
        } catch (NullPointerException e10) {
            Nc.v.s().x(e10, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final com.google.android.gms.dynamic.b zzh() {
        return com.google.android.gms.dynamic.d.I2(this.f70148a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final String zzi() {
        return this.f70149b.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final List zzk() {
        try {
            Z.n0 n0VarU = this.f70149b.U();
            Z.n0 n0VarV = this.f70149b.V();
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
            Nc.v.s().x(e10, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final void zzl() {
        C9504sI c9504sI = this.f70151d;
        if (c9504sI != null) {
            c9504sI.a();
        }
        this.f70151d = null;
        this.f70150c = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final void zzm() {
        try {
            String strC = this.f70149b.c();
            if (Objects.equals(strC, "Google")) {
                Sc.p.g("Illegal argument specified for omid partner name.");
                return;
            }
            if (TextUtils.isEmpty(strC)) {
                Sc.p.g("Not starting OMID session. OM partner name has not been configured.");
                return;
            }
            C9504sI c9504sI = this.f70151d;
            if (c9504sI != null) {
                c9504sI.S(strC, false);
            }
        } catch (NullPointerException e10) {
            Nc.v.s().x(e10, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final void zzo() {
        C9504sI c9504sI = this.f70151d;
        if (c9504sI != null) {
            c9504sI.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final boolean zzq() {
        C9504sI c9504sI = this.f70151d;
        return (c9504sI == null || c9504sI.F()) && this.f70149b.e0() != null && this.f70149b.f0() == null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final boolean zzt() {
        C7914dT c7914dTH0 = this.f70149b.h0();
        if (c7914dTH0 == null) {
            Sc.p.g("Trying to start OMID session before creation.");
            return false;
        }
        Nc.v.b().b(c7914dTH0.a());
        if (this.f70149b.e0() == null) {
            return true;
        }
        this.f70149b.e0().L("onSdkLoaded", new C5603a());
        return true;
    }

    public PK(Context context, C10039xI c10039xI, YI yi2, C9504sI c9504sI) {
        this.f70148a = context;
        this.f70149b = c10039xI;
        this.f70150c = yi2;
        this.f70151d = c9504sI;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final boolean D(com.google.android.gms.dynamic.b bVar) throws SecurityException {
        YI yi2;
        Object objC2 = com.google.android.gms.dynamic.d.c2(bVar);
        if ((objC2 instanceof ViewGroup) && (yi2 = this.f70150c) != null && yi2.g((ViewGroup) objC2)) {
            this.f70149b.f0().c0(new OK(this, "_videoMediaView"));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final boolean E(com.google.android.gms.dynamic.b bVar) throws SecurityException {
        YI yi2;
        Object objC2 = com.google.android.gms.dynamic.d.c2(bVar);
        if ((objC2 instanceof ViewGroup) && (yi2 = this.f70150c) != null && yi2.f((ViewGroup) objC2)) {
            this.f70149b.d0().c0(new OK(this, "_videoMediaView"));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9323qh
    public final void zzp(com.google.android.gms.dynamic.b bVar) throws SecurityException {
        C9504sI c9504sI;
        Object objC2 = com.google.android.gms.dynamic.d.c2(bVar);
        if ((objC2 instanceof View) && this.f70149b.h0() != null && (c9504sI = this.f70151d) != null) {
            c9504sI.s((View) objC2);
        }
    }
}
