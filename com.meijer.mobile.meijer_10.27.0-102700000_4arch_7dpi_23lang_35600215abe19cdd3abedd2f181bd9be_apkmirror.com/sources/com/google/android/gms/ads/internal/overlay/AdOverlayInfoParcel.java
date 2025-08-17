package com.google.android.gms.ads.internal.overlay;

import Lc.v;
import Mc.A;
import Mc.InterfaceC4098a;
import Oc.p;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.C6908Kq;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C8833nC;
import com.google.android.gms.internal.ads.InterfaceC7918ei;
import com.google.android.gms.internal.ads.InterfaceC8132gi;
import com.google.android.gms.internal.ads.InterfaceC8201hG;
import com.google.android.gms.internal.ads.InterfaceC8675ln;
import com.google.android.gms.internal.ads.InterfaceC9008ot;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class AdOverlayInfoParcel extends AbstractC15136a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new i();

    /* renamed from: y, reason: collision with root package name */
    private static final AtomicLong f64565y = new AtomicLong(0);

    /* renamed from: z, reason: collision with root package name */
    private static final ConcurrentHashMap f64566z = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Oc.l f64567a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4098a f64568b;

    /* renamed from: c, reason: collision with root package name */
    public final p f64569c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC9008ot f64570d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC8132gi f64571e;

    /* renamed from: f, reason: collision with root package name */
    public final String f64572f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f64573g;

    /* renamed from: h, reason: collision with root package name */
    public final String f64574h;

    /* renamed from: i, reason: collision with root package name */
    public final Oc.d f64575i;

    /* renamed from: j, reason: collision with root package name */
    public final int f64576j;

    /* renamed from: k, reason: collision with root package name */
    public final int f64577k;

    /* renamed from: l, reason: collision with root package name */
    public final String f64578l;

    /* renamed from: m, reason: collision with root package name */
    public final Qc.a f64579m;

    /* renamed from: n, reason: collision with root package name */
    public final String f64580n;

    /* renamed from: o, reason: collision with root package name */
    public final Lc.l f64581o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC7918ei f64582p;

    /* renamed from: q, reason: collision with root package name */
    public final String f64583q;

    /* renamed from: r, reason: collision with root package name */
    public final String f64584r;

    /* renamed from: s, reason: collision with root package name */
    public final String f64585s;

    /* renamed from: t, reason: collision with root package name */
    public final C8833nC f64586t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC8201hG f64587u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC8675ln f64588v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f64589w;

    /* renamed from: x, reason: collision with root package name */
    public final long f64590x;

    public AdOverlayInfoParcel(InterfaceC4098a interfaceC4098a, p pVar, InterfaceC7918ei interfaceC7918ei, InterfaceC8132gi interfaceC8132gi, Oc.d dVar, InterfaceC9008ot interfaceC9008ot, boolean z10, int i10, String str, Qc.a aVar, InterfaceC8201hG interfaceC8201hG, InterfaceC8675ln interfaceC8675ln, boolean z11) {
        this.f64567a = null;
        this.f64568b = interfaceC4098a;
        this.f64569c = pVar;
        this.f64570d = interfaceC9008ot;
        this.f64582p = interfaceC7918ei;
        this.f64571e = interfaceC8132gi;
        this.f64572f = null;
        this.f64573g = z10;
        this.f64574h = null;
        this.f64575i = dVar;
        this.f64576j = i10;
        this.f64577k = 3;
        this.f64578l = str;
        this.f64579m = aVar;
        this.f64580n = null;
        this.f64581o = null;
        this.f64583q = null;
        this.f64584r = null;
        this.f64585s = null;
        this.f64586t = null;
        this.f64587u = interfaceC8201hG;
        this.f64588v = interfaceC8675ln;
        this.f64589w = z11;
        this.f64590x = f64565y.getAndIncrement();
    }

    public static AdOverlayInfoParcel B(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e10) {
            if (!((Boolean) A.c().a(C8659lf.f76067Mc)).booleanValue()) {
                return null;
            }
            v.s().x(e10, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    private static final IBinder c0(Object obj) {
        if (((Boolean) A.c().a(C8659lf.f76067Mc)).booleanValue()) {
            return null;
        }
        return com.google.android.gms.dynamic.d.F2(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 2, this.f64567a, i10, false);
        C15137b.m(parcel, 3, c0(this.f64568b), false);
        C15137b.m(parcel, 4, c0(this.f64569c), false);
        C15137b.m(parcel, 5, c0(this.f64570d), false);
        C15137b.m(parcel, 6, c0(this.f64571e), false);
        C15137b.w(parcel, 7, this.f64572f, false);
        C15137b.c(parcel, 8, this.f64573g);
        C15137b.w(parcel, 9, this.f64574h, false);
        C15137b.m(parcel, 10, c0(this.f64575i), false);
        C15137b.n(parcel, 11, this.f64576j);
        C15137b.n(parcel, 12, this.f64577k);
        C15137b.w(parcel, 13, this.f64578l, false);
        C15137b.u(parcel, 14, this.f64579m, i10, false);
        C15137b.w(parcel, 16, this.f64580n, false);
        C15137b.u(parcel, 17, this.f64581o, i10, false);
        C15137b.m(parcel, 18, c0(this.f64582p), false);
        C15137b.w(parcel, 19, this.f64583q, false);
        C15137b.w(parcel, 24, this.f64584r, false);
        C15137b.w(parcel, 25, this.f64585s, false);
        C15137b.m(parcel, 26, c0(this.f64586t), false);
        C15137b.m(parcel, 27, c0(this.f64587u), false);
        C15137b.m(parcel, 28, c0(this.f64588v), false);
        C15137b.c(parcel, 29, this.f64589w);
        C15137b.s(parcel, 30, this.f64590x);
        C15137b.b(parcel, iA);
        if (((Boolean) A.c().a(C8659lf.f76067Mc)).booleanValue()) {
            f64566z.put(Long.valueOf(this.f64590x), new j(this.f64568b, this.f64569c, this.f64570d, this.f64582p, this.f64571e, this.f64575i, this.f64586t, this.f64587u, this.f64588v, C6908Kq.f68177d.schedule(new k(this.f64590x), ((Integer) A.c().a(C8659lf.f76095Oc)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(InterfaceC4098a interfaceC4098a, p pVar, InterfaceC7918ei interfaceC7918ei, InterfaceC8132gi interfaceC8132gi, Oc.d dVar, InterfaceC9008ot interfaceC9008ot, boolean z10, int i10, String str, String str2, Qc.a aVar, InterfaceC8201hG interfaceC8201hG, InterfaceC8675ln interfaceC8675ln) {
        this.f64567a = null;
        this.f64568b = interfaceC4098a;
        this.f64569c = pVar;
        this.f64570d = interfaceC9008ot;
        this.f64582p = interfaceC7918ei;
        this.f64571e = interfaceC8132gi;
        this.f64572f = str2;
        this.f64573g = z10;
        this.f64574h = str;
        this.f64575i = dVar;
        this.f64576j = i10;
        this.f64577k = 3;
        this.f64578l = null;
        this.f64579m = aVar;
        this.f64580n = null;
        this.f64581o = null;
        this.f64583q = null;
        this.f64584r = null;
        this.f64585s = null;
        this.f64586t = null;
        this.f64587u = interfaceC8201hG;
        this.f64588v = interfaceC8675ln;
        this.f64589w = false;
        this.f64590x = f64565y.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC4098a interfaceC4098a, p pVar, Oc.d dVar, InterfaceC9008ot interfaceC9008ot, int i10, Qc.a aVar, String str, Lc.l lVar, String str2, String str3, String str4, C8833nC c8833nC, InterfaceC8675ln interfaceC8675ln, String str5) {
        this.f64567a = null;
        this.f64568b = null;
        this.f64569c = pVar;
        this.f64570d = interfaceC9008ot;
        this.f64582p = null;
        this.f64571e = null;
        this.f64573g = false;
        if (((Boolean) A.c().a(C8659lf.f76153T0)).booleanValue()) {
            this.f64572f = null;
            this.f64574h = null;
        } else {
            this.f64572f = str2;
            this.f64574h = str3;
        }
        this.f64575i = null;
        this.f64576j = i10;
        this.f64577k = 1;
        this.f64578l = null;
        this.f64579m = aVar;
        this.f64580n = str;
        this.f64581o = lVar;
        this.f64583q = str5;
        this.f64584r = null;
        this.f64585s = str4;
        this.f64586t = c8833nC;
        this.f64587u = null;
        this.f64588v = interfaceC8675ln;
        this.f64589w = false;
        this.f64590x = f64565y.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC4098a interfaceC4098a, p pVar, Oc.d dVar, InterfaceC9008ot interfaceC9008ot, boolean z10, int i10, Qc.a aVar, InterfaceC8201hG interfaceC8201hG, InterfaceC8675ln interfaceC8675ln) {
        this.f64567a = null;
        this.f64568b = interfaceC4098a;
        this.f64569c = pVar;
        this.f64570d = interfaceC9008ot;
        this.f64582p = null;
        this.f64571e = null;
        this.f64572f = null;
        this.f64573g = z10;
        this.f64574h = null;
        this.f64575i = dVar;
        this.f64576j = i10;
        this.f64577k = 2;
        this.f64578l = null;
        this.f64579m = aVar;
        this.f64580n = null;
        this.f64581o = null;
        this.f64583q = null;
        this.f64584r = null;
        this.f64585s = null;
        this.f64586t = null;
        this.f64587u = interfaceC8201hG;
        this.f64588v = interfaceC8675ln;
        this.f64589w = false;
        this.f64590x = f64565y.getAndIncrement();
    }

    AdOverlayInfoParcel(Oc.l lVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z10, String str2, IBinder iBinder5, int i10, int i11, String str3, Qc.a aVar, String str4, Lc.l lVar2, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z11, long j10) {
        this.f64567a = lVar;
        this.f64572f = str;
        this.f64573g = z10;
        this.f64574h = str2;
        this.f64576j = i10;
        this.f64577k = i11;
        this.f64578l = str3;
        this.f64579m = aVar;
        this.f64580n = str4;
        this.f64581o = lVar2;
        this.f64583q = str5;
        this.f64584r = str6;
        this.f64585s = str7;
        this.f64589w = z11;
        this.f64590x = j10;
        if (((Boolean) A.c().a(C8659lf.f76067Mc)).booleanValue()) {
            j jVar = (j) f64566z.remove(Long.valueOf(j10));
            if (jVar != null) {
                this.f64568b = jVar.f64624a;
                this.f64569c = jVar.f64625b;
                this.f64570d = jVar.f64626c;
                this.f64582p = jVar.f64627d;
                this.f64571e = jVar.f64628e;
                this.f64586t = jVar.f64630g;
                this.f64587u = jVar.f64631h;
                this.f64588v = jVar.f64632i;
                this.f64575i = jVar.f64629f;
                jVar.f64633j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f64568b = (InterfaceC4098a) com.google.android.gms.dynamic.d.b2(b.a.a2(iBinder));
        this.f64569c = (p) com.google.android.gms.dynamic.d.b2(b.a.a2(iBinder2));
        this.f64570d = (InterfaceC9008ot) com.google.android.gms.dynamic.d.b2(b.a.a2(iBinder3));
        this.f64582p = (InterfaceC7918ei) com.google.android.gms.dynamic.d.b2(b.a.a2(iBinder6));
        this.f64571e = (InterfaceC8132gi) com.google.android.gms.dynamic.d.b2(b.a.a2(iBinder4));
        this.f64575i = (Oc.d) com.google.android.gms.dynamic.d.b2(b.a.a2(iBinder5));
        this.f64586t = (C8833nC) com.google.android.gms.dynamic.d.b2(b.a.a2(iBinder7));
        this.f64587u = (InterfaceC8201hG) com.google.android.gms.dynamic.d.b2(b.a.a2(iBinder8));
        this.f64588v = (InterfaceC8675ln) com.google.android.gms.dynamic.d.b2(b.a.a2(iBinder9));
    }

    public AdOverlayInfoParcel(Oc.l lVar, InterfaceC4098a interfaceC4098a, p pVar, Oc.d dVar, Qc.a aVar, InterfaceC9008ot interfaceC9008ot, InterfaceC8201hG interfaceC8201hG, String str) {
        this.f64567a = lVar;
        this.f64568b = interfaceC4098a;
        this.f64569c = pVar;
        this.f64570d = interfaceC9008ot;
        this.f64582p = null;
        this.f64571e = null;
        this.f64572f = null;
        this.f64573g = false;
        this.f64574h = null;
        this.f64575i = dVar;
        this.f64576j = -1;
        this.f64577k = 4;
        this.f64578l = null;
        this.f64579m = aVar;
        this.f64580n = null;
        this.f64581o = null;
        this.f64583q = str;
        this.f64584r = null;
        this.f64585s = null;
        this.f64586t = null;
        this.f64587u = interfaceC8201hG;
        this.f64588v = null;
        this.f64589w = false;
        this.f64590x = f64565y.getAndIncrement();
    }

    public AdOverlayInfoParcel(p pVar, InterfaceC9008ot interfaceC9008ot, int i10, Qc.a aVar) {
        this.f64569c = pVar;
        this.f64570d = interfaceC9008ot;
        this.f64576j = 1;
        this.f64579m = aVar;
        this.f64567a = null;
        this.f64568b = null;
        this.f64582p = null;
        this.f64571e = null;
        this.f64572f = null;
        this.f64573g = false;
        this.f64574h = null;
        this.f64575i = null;
        this.f64577k = 1;
        this.f64578l = null;
        this.f64580n = null;
        this.f64581o = null;
        this.f64583q = null;
        this.f64584r = null;
        this.f64585s = null;
        this.f64586t = null;
        this.f64587u = null;
        this.f64588v = null;
        this.f64589w = false;
        this.f64590x = f64565y.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC9008ot interfaceC9008ot, Qc.a aVar, String str, String str2, int i10, InterfaceC8675ln interfaceC8675ln) {
        this.f64567a = null;
        this.f64568b = null;
        this.f64569c = null;
        this.f64570d = interfaceC9008ot;
        this.f64582p = null;
        this.f64571e = null;
        this.f64572f = null;
        this.f64573g = false;
        this.f64574h = null;
        this.f64575i = null;
        this.f64576j = 14;
        this.f64577k = 5;
        this.f64578l = null;
        this.f64579m = aVar;
        this.f64580n = null;
        this.f64581o = null;
        this.f64583q = str;
        this.f64584r = str2;
        this.f64585s = null;
        this.f64586t = null;
        this.f64587u = null;
        this.f64588v = interfaceC8675ln;
        this.f64589w = false;
        this.f64590x = f64565y.getAndIncrement();
    }
}
