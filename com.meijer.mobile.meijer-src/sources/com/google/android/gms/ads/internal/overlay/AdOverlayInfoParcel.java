package com.google.android.gms.ads.internal.overlay;

import Nc.v;
import Oc.A;
import Oc.InterfaceC4376a;
import Qc.p;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.C7033Kq;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C8958nC;
import com.google.android.gms.internal.ads.InterfaceC8043ei;
import com.google.android.gms.internal.ads.InterfaceC8257gi;
import com.google.android.gms.internal.ads.InterfaceC8326hG;
import com.google.android.gms.internal.ads.InterfaceC8800ln;
import com.google.android.gms.internal.ads.InterfaceC9133ot;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class AdOverlayInfoParcel extends AbstractC15707a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new i();

    /* renamed from: y, reason: collision with root package name */
    private static final AtomicLong f65405y = new AtomicLong(0);

    /* renamed from: z, reason: collision with root package name */
    private static final ConcurrentHashMap f65406z = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Qc.l f65407a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4376a f65408b;

    /* renamed from: c, reason: collision with root package name */
    public final p f65409c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC9133ot f65410d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC8257gi f65411e;

    /* renamed from: f, reason: collision with root package name */
    public final String f65412f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f65413g;

    /* renamed from: h, reason: collision with root package name */
    public final String f65414h;

    /* renamed from: i, reason: collision with root package name */
    public final Qc.d f65415i;

    /* renamed from: j, reason: collision with root package name */
    public final int f65416j;

    /* renamed from: k, reason: collision with root package name */
    public final int f65417k;

    /* renamed from: l, reason: collision with root package name */
    public final String f65418l;

    /* renamed from: m, reason: collision with root package name */
    public final Sc.a f65419m;

    /* renamed from: n, reason: collision with root package name */
    public final String f65420n;

    /* renamed from: o, reason: collision with root package name */
    public final Nc.l f65421o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC8043ei f65422p;

    /* renamed from: q, reason: collision with root package name */
    public final String f65423q;

    /* renamed from: r, reason: collision with root package name */
    public final String f65424r;

    /* renamed from: s, reason: collision with root package name */
    public final String f65425s;

    /* renamed from: t, reason: collision with root package name */
    public final C8958nC f65426t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC8326hG f65427u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC8800ln f65428v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f65429w;

    /* renamed from: x, reason: collision with root package name */
    public final long f65430x;

    public AdOverlayInfoParcel(InterfaceC4376a interfaceC4376a, p pVar, InterfaceC8043ei interfaceC8043ei, InterfaceC8257gi interfaceC8257gi, Qc.d dVar, InterfaceC9133ot interfaceC9133ot, boolean z10, int i10, String str, Sc.a aVar, InterfaceC8326hG interfaceC8326hG, InterfaceC8800ln interfaceC8800ln, boolean z11) {
        this.f65407a = null;
        this.f65408b = interfaceC4376a;
        this.f65409c = pVar;
        this.f65410d = interfaceC9133ot;
        this.f65422p = interfaceC8043ei;
        this.f65411e = interfaceC8257gi;
        this.f65412f = null;
        this.f65413g = z10;
        this.f65414h = null;
        this.f65415i = dVar;
        this.f65416j = i10;
        this.f65417k = 3;
        this.f65418l = str;
        this.f65419m = aVar;
        this.f65420n = null;
        this.f65421o = null;
        this.f65423q = null;
        this.f65424r = null;
        this.f65425s = null;
        this.f65426t = null;
        this.f65427u = interfaceC8326hG;
        this.f65428v = interfaceC8800ln;
        this.f65429w = z11;
        this.f65430x = f65405y.getAndIncrement();
    }

    public static AdOverlayInfoParcel B(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e10) {
            if (!((Boolean) A.c().a(C8784lf.f76907Mc)).booleanValue()) {
                return null;
            }
            v.s().x(e10, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    private static final IBinder b0(Object obj) {
        if (((Boolean) A.c().a(C8784lf.f76907Mc)).booleanValue()) {
            return null;
        }
        return com.google.android.gms.dynamic.d.I2(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 2, this.f65407a, i10, false);
        C15708b.m(parcel, 3, b0(this.f65408b), false);
        C15708b.m(parcel, 4, b0(this.f65409c), false);
        C15708b.m(parcel, 5, b0(this.f65410d), false);
        C15708b.m(parcel, 6, b0(this.f65411e), false);
        C15708b.w(parcel, 7, this.f65412f, false);
        C15708b.c(parcel, 8, this.f65413g);
        C15708b.w(parcel, 9, this.f65414h, false);
        C15708b.m(parcel, 10, b0(this.f65415i), false);
        C15708b.n(parcel, 11, this.f65416j);
        C15708b.n(parcel, 12, this.f65417k);
        C15708b.w(parcel, 13, this.f65418l, false);
        C15708b.u(parcel, 14, this.f65419m, i10, false);
        C15708b.w(parcel, 16, this.f65420n, false);
        C15708b.u(parcel, 17, this.f65421o, i10, false);
        C15708b.m(parcel, 18, b0(this.f65422p), false);
        C15708b.w(parcel, 19, this.f65423q, false);
        C15708b.w(parcel, 24, this.f65424r, false);
        C15708b.w(parcel, 25, this.f65425s, false);
        C15708b.m(parcel, 26, b0(this.f65426t), false);
        C15708b.m(parcel, 27, b0(this.f65427u), false);
        C15708b.m(parcel, 28, b0(this.f65428v), false);
        C15708b.c(parcel, 29, this.f65429w);
        C15708b.s(parcel, 30, this.f65430x);
        C15708b.b(parcel, iA);
        if (((Boolean) A.c().a(C8784lf.f76907Mc)).booleanValue()) {
            f65406z.put(Long.valueOf(this.f65430x), new j(this.f65408b, this.f65409c, this.f65410d, this.f65422p, this.f65411e, this.f65415i, this.f65426t, this.f65427u, this.f65428v, C7033Kq.f69017d.schedule(new k(this.f65430x), ((Integer) A.c().a(C8784lf.f76935Oc)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(InterfaceC4376a interfaceC4376a, p pVar, InterfaceC8043ei interfaceC8043ei, InterfaceC8257gi interfaceC8257gi, Qc.d dVar, InterfaceC9133ot interfaceC9133ot, boolean z10, int i10, String str, String str2, Sc.a aVar, InterfaceC8326hG interfaceC8326hG, InterfaceC8800ln interfaceC8800ln) {
        this.f65407a = null;
        this.f65408b = interfaceC4376a;
        this.f65409c = pVar;
        this.f65410d = interfaceC9133ot;
        this.f65422p = interfaceC8043ei;
        this.f65411e = interfaceC8257gi;
        this.f65412f = str2;
        this.f65413g = z10;
        this.f65414h = str;
        this.f65415i = dVar;
        this.f65416j = i10;
        this.f65417k = 3;
        this.f65418l = null;
        this.f65419m = aVar;
        this.f65420n = null;
        this.f65421o = null;
        this.f65423q = null;
        this.f65424r = null;
        this.f65425s = null;
        this.f65426t = null;
        this.f65427u = interfaceC8326hG;
        this.f65428v = interfaceC8800ln;
        this.f65429w = false;
        this.f65430x = f65405y.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC4376a interfaceC4376a, p pVar, Qc.d dVar, InterfaceC9133ot interfaceC9133ot, int i10, Sc.a aVar, String str, Nc.l lVar, String str2, String str3, String str4, C8958nC c8958nC, InterfaceC8800ln interfaceC8800ln, String str5) {
        this.f65407a = null;
        this.f65408b = null;
        this.f65409c = pVar;
        this.f65410d = interfaceC9133ot;
        this.f65422p = null;
        this.f65411e = null;
        this.f65413g = false;
        if (((Boolean) A.c().a(C8784lf.f76993T0)).booleanValue()) {
            this.f65412f = null;
            this.f65414h = null;
        } else {
            this.f65412f = str2;
            this.f65414h = str3;
        }
        this.f65415i = null;
        this.f65416j = i10;
        this.f65417k = 1;
        this.f65418l = null;
        this.f65419m = aVar;
        this.f65420n = str;
        this.f65421o = lVar;
        this.f65423q = str5;
        this.f65424r = null;
        this.f65425s = str4;
        this.f65426t = c8958nC;
        this.f65427u = null;
        this.f65428v = interfaceC8800ln;
        this.f65429w = false;
        this.f65430x = f65405y.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC4376a interfaceC4376a, p pVar, Qc.d dVar, InterfaceC9133ot interfaceC9133ot, boolean z10, int i10, Sc.a aVar, InterfaceC8326hG interfaceC8326hG, InterfaceC8800ln interfaceC8800ln) {
        this.f65407a = null;
        this.f65408b = interfaceC4376a;
        this.f65409c = pVar;
        this.f65410d = interfaceC9133ot;
        this.f65422p = null;
        this.f65411e = null;
        this.f65412f = null;
        this.f65413g = z10;
        this.f65414h = null;
        this.f65415i = dVar;
        this.f65416j = i10;
        this.f65417k = 2;
        this.f65418l = null;
        this.f65419m = aVar;
        this.f65420n = null;
        this.f65421o = null;
        this.f65423q = null;
        this.f65424r = null;
        this.f65425s = null;
        this.f65426t = null;
        this.f65427u = interfaceC8326hG;
        this.f65428v = interfaceC8800ln;
        this.f65429w = false;
        this.f65430x = f65405y.getAndIncrement();
    }

    AdOverlayInfoParcel(Qc.l lVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z10, String str2, IBinder iBinder5, int i10, int i11, String str3, Sc.a aVar, String str4, Nc.l lVar2, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z11, long j10) {
        this.f65407a = lVar;
        this.f65412f = str;
        this.f65413g = z10;
        this.f65414h = str2;
        this.f65416j = i10;
        this.f65417k = i11;
        this.f65418l = str3;
        this.f65419m = aVar;
        this.f65420n = str4;
        this.f65421o = lVar2;
        this.f65423q = str5;
        this.f65424r = str6;
        this.f65425s = str7;
        this.f65429w = z11;
        this.f65430x = j10;
        if (((Boolean) A.c().a(C8784lf.f76907Mc)).booleanValue()) {
            j jVar = (j) f65406z.remove(Long.valueOf(j10));
            if (jVar != null) {
                this.f65408b = jVar.f65464a;
                this.f65409c = jVar.f65465b;
                this.f65410d = jVar.f65466c;
                this.f65422p = jVar.f65467d;
                this.f65411e = jVar.f65468e;
                this.f65426t = jVar.f65470g;
                this.f65427u = jVar.f65471h;
                this.f65428v = jVar.f65472i;
                this.f65415i = jVar.f65469f;
                jVar.f65473j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f65408b = (InterfaceC4376a) com.google.android.gms.dynamic.d.c2(b.a.a2(iBinder));
        this.f65409c = (p) com.google.android.gms.dynamic.d.c2(b.a.a2(iBinder2));
        this.f65410d = (InterfaceC9133ot) com.google.android.gms.dynamic.d.c2(b.a.a2(iBinder3));
        this.f65422p = (InterfaceC8043ei) com.google.android.gms.dynamic.d.c2(b.a.a2(iBinder6));
        this.f65411e = (InterfaceC8257gi) com.google.android.gms.dynamic.d.c2(b.a.a2(iBinder4));
        this.f65415i = (Qc.d) com.google.android.gms.dynamic.d.c2(b.a.a2(iBinder5));
        this.f65426t = (C8958nC) com.google.android.gms.dynamic.d.c2(b.a.a2(iBinder7));
        this.f65427u = (InterfaceC8326hG) com.google.android.gms.dynamic.d.c2(b.a.a2(iBinder8));
        this.f65428v = (InterfaceC8800ln) com.google.android.gms.dynamic.d.c2(b.a.a2(iBinder9));
    }

    public AdOverlayInfoParcel(Qc.l lVar, InterfaceC4376a interfaceC4376a, p pVar, Qc.d dVar, Sc.a aVar, InterfaceC9133ot interfaceC9133ot, InterfaceC8326hG interfaceC8326hG, String str) {
        this.f65407a = lVar;
        this.f65408b = interfaceC4376a;
        this.f65409c = pVar;
        this.f65410d = interfaceC9133ot;
        this.f65422p = null;
        this.f65411e = null;
        this.f65412f = null;
        this.f65413g = false;
        this.f65414h = null;
        this.f65415i = dVar;
        this.f65416j = -1;
        this.f65417k = 4;
        this.f65418l = null;
        this.f65419m = aVar;
        this.f65420n = null;
        this.f65421o = null;
        this.f65423q = str;
        this.f65424r = null;
        this.f65425s = null;
        this.f65426t = null;
        this.f65427u = interfaceC8326hG;
        this.f65428v = null;
        this.f65429w = false;
        this.f65430x = f65405y.getAndIncrement();
    }

    public AdOverlayInfoParcel(p pVar, InterfaceC9133ot interfaceC9133ot, int i10, Sc.a aVar) {
        this.f65409c = pVar;
        this.f65410d = interfaceC9133ot;
        this.f65416j = 1;
        this.f65419m = aVar;
        this.f65407a = null;
        this.f65408b = null;
        this.f65422p = null;
        this.f65411e = null;
        this.f65412f = null;
        this.f65413g = false;
        this.f65414h = null;
        this.f65415i = null;
        this.f65417k = 1;
        this.f65418l = null;
        this.f65420n = null;
        this.f65421o = null;
        this.f65423q = null;
        this.f65424r = null;
        this.f65425s = null;
        this.f65426t = null;
        this.f65427u = null;
        this.f65428v = null;
        this.f65429w = false;
        this.f65430x = f65405y.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC9133ot interfaceC9133ot, Sc.a aVar, String str, String str2, int i10, InterfaceC8800ln interfaceC8800ln) {
        this.f65407a = null;
        this.f65408b = null;
        this.f65409c = null;
        this.f65410d = interfaceC9133ot;
        this.f65422p = null;
        this.f65411e = null;
        this.f65412f = null;
        this.f65413g = false;
        this.f65414h = null;
        this.f65415i = null;
        this.f65416j = 14;
        this.f65417k = 5;
        this.f65418l = null;
        this.f65419m = aVar;
        this.f65420n = null;
        this.f65421o = null;
        this.f65423q = str;
        this.f65424r = str2;
        this.f65425s = null;
        this.f65426t = null;
        this.f65427u = null;
        this.f65428v = interfaceC8800ln;
        this.f65429w = false;
        this.f65430x = f65405y.getAndIncrement();
    }
}
