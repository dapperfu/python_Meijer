package com.google.android.gms.internal.ads;

import Mc.C4169y;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC9388sR extends AbstractBinderC8357io {

    /* renamed from: a, reason: collision with root package name */
    private final Context f78246a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f78247b;

    /* renamed from: c, reason: collision with root package name */
    private final AR f78248c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC9441sw f78249d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque f78250e;

    /* renamed from: f, reason: collision with root package name */
    private final Z80 f78251f;

    /* renamed from: g, reason: collision with root package name */
    private final C6702Eo f78252g;

    private final synchronized C9068pR G9(String str) {
        Iterator it = this.f78250e.iterator();
        while (it.hasNext()) {
            C9068pR c9068pR = (C9068pR) it.next();
            if (c9068pR.f77584c.equals(str)) {
                it.remove();
                return c9068pR;
            }
        }
        return null;
    }

    private final synchronized void J9(C9068pR c9068pR) {
        zzp();
        this.f78250e.addLast(c9068pR);
    }

    private final synchronized void zzp() {
        int iIntValue = ((Long) C9516tg.f78610b.e()).intValue();
        while (this.f78250e.size() >= iIntValue) {
            this.f78250e.removeFirst();
        }
    }

    private static com.google.common.util.concurrent.q H9(com.google.common.util.concurrent.q qVar, B80 b80, C7818dl c7818dl, W80 w80, K80 k80) {
        InterfaceC7173Sk interfaceC7173SkA = c7818dl.a("AFMA_getAdDictionary", C7498al.f72486b, new InterfaceC7240Uk() { // from class: com.google.android.gms.internal.ads.jR
            @Override // com.google.android.gms.internal.ads.InterfaceC7240Uk
            public final Object a(JSONObject jSONObject) {
                return new C10067yo(jSONObject);
            }
        });
        V80.d(qVar, k80);
        C8079g80 c8079g80A = b80.b(EnumC9681v80.BUILD_URL, qVar).f(interfaceC7173SkA).a();
        V80.c(c8079g80A, w80, k80);
        return c8079g80A;
    }

    private static com.google.common.util.concurrent.q I9(final C9853wo c9853wo, B80 b80, final AbstractC9883x20 abstractC9883x20) {
        InterfaceC9416sj0 interfaceC9416sj0 = new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.cR
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return abstractC9883x20.b().a(C4169y.b().k((Bundle) obj), c9853wo.f79538m, false);
            }
        };
        return b80.b(EnumC9681v80.GMS_SIGNALS, Mj0.h(c9853wo.f79526a)).f(interfaceC9416sj0).e(new InterfaceC7865e80() { // from class: com.google.android.gms.internal.ads.dR
            @Override // com.google.android.gms.internal.ads.InterfaceC7865e80
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Pc.p0.k("Ad request signals:");
                Pc.p0.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).a();
    }

    private final void K9(com.google.common.util.concurrent.q qVar, InterfaceC8998oo interfaceC8998oo, C9853wo c9853wo) {
        Mj0.r(Mj0.n(qVar, new InterfaceC9416sj0(this) { // from class: com.google.android.gms.internal.ads.kR
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) throws IOException {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
                C6908Kq.f68174a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.U60
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        InputStream inputStream2 = inputStream;
                        try {
                            try {
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                try {
                                    com.google.android.gms.common.util.l.b(inputStream2, autoCloseOutputStream);
                                    autoCloseOutputStream.close();
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
                return Mj0.h(parcelFileDescriptor);
            }
        }, C6908Kq.f68174a), new C8961oR(this, c9853wo, interfaceC8998oo), C6908Kq.f68180g);
    }

    public final com.google.common.util.concurrent.q B9(final C9853wo c9853wo, int i10) {
        if (!((Boolean) C9516tg.f78609a.e()).booleanValue()) {
            return Mj0.g(new Exception("Split request is disabled."));
        }
        C9038p70 c9038p70 = c9853wo.f79534i;
        if (c9038p70 == null) {
            return Mj0.g(new Exception("Pool configuration missing from request."));
        }
        if (c9038p70.f77503e == 0 || c9038p70.f77504f == 0) {
            return Mj0.g(new Exception("Caching is disabled."));
        }
        C7818dl c7818dlB = Lc.v.j().b(this.f78246a, Qc.a.B(), this.f78251f);
        AbstractC9883x20 abstractC9883x20A = this.f78249d.a(c9853wo, i10);
        B80 b80C = abstractC9883x20A.c();
        final com.google.common.util.concurrent.q qVarI9 = I9(c9853wo, b80C, abstractC9883x20A);
        W80 w80D = abstractC9883x20A.d();
        final K80 k80A = J80.a(this.f78246a, 9);
        final com.google.common.util.concurrent.q qVarH9 = H9(qVarI9, b80C, c7818dlB, w80D, k80A);
        return b80C.a(EnumC9681v80.GET_URL_AND_CACHE_KEY, qVarI9, qVarH9).a(new Callable() { // from class: com.google.android.gms.internal.ads.hR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f74720a.F9(qVarH9, qVarI9, c9853wo, k80A);
            }
        }).a();
    }

    public final com.google.common.util.concurrent.q E9(String str) {
        if (((Boolean) C9516tg.f78609a.e()).booleanValue()) {
            return G9(str) == null ? Mj0.g(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : Mj0.h(new C8854nR(this));
        }
        return Mj0.g(new Exception("Split request is disabled."));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8463jo
    public final void N6(C9853wo c9853wo, InterfaceC8998oo interfaceC8998oo) {
        Bundle bundle;
        if (((Boolean) Mc.A.c().a(C8659lf.f76392k2)).booleanValue() && (bundle = c9853wo.f79538m) != null) {
            bundle.putLong(EnumC7889eN.SERVICE_CONNECTED.a(), Lc.v.c().a());
        }
        com.google.common.util.concurrent.q qVarC9 = C9(c9853wo, Binder.getCallingUid());
        K9(qVarC9, interfaceC8998oo, c9853wo);
        if (((Boolean) C8768mg.f76849e.e()).booleanValue()) {
            AR ar2 = this.f78248c;
            Objects.requireNonNull(ar2);
            qVarC9.addListener(new RunnableC8321iR(ar2), this.f78247b);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8463jo
    public final void u7(C9853wo c9853wo, InterfaceC8998oo interfaceC8998oo) {
        Bundle bundle;
        if (((Boolean) Mc.A.c().a(C8659lf.f76392k2)).booleanValue() && (bundle = c9853wo.f79538m) != null) {
            bundle.putLong(EnumC7889eN.SERVICE_CONNECTED.a(), Lc.v.c().a());
        }
        K9(D9(c9853wo, Binder.getCallingUid()), interfaceC8998oo, c9853wo);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8463jo
    public final void z6(C8037fo c8037fo, C9105po c9105po) {
        if (((Boolean) C6556Ag.f65155a.e()).booleanValue()) {
            this.f78249d.zzF();
            String str = c8037fo.f74176a;
            Mj0.r(Mj0.h(null), new C8747mR(this, c9105po, c8037fo), C6908Kq.f68180g);
        } else {
            try {
                c9105po.N3("", c8037fo);
            } catch (RemoteException e10) {
                Pc.p0.l("Service can't call client", e10);
            }
        }
    }

    public BinderC9388sR(Context context, Xj0 xj0, C6702Eo c6702Eo, InterfaceC9441sw interfaceC9441sw, AR ar2, ArrayDeque arrayDeque, C9923xR c9923xR, Z80 z80) {
        C8659lf.a(context);
        this.f78246a = context;
        this.f78247b = xj0;
        this.f78252g = c6702Eo;
        this.f78248c = ar2;
        this.f78249d = interfaceC9441sw;
        this.f78250e = arrayDeque;
        this.f78251f = z80;
    }

    public final com.google.common.util.concurrent.q C9(final C9853wo c9853wo, int i10) {
        C9068pR c9068pRG9;
        K80 k80A;
        C8079g80 c8079g80A;
        C7818dl c7818dlB = Lc.v.j().b(this.f78246a, Qc.a.B(), this.f78251f);
        AbstractC9883x20 abstractC9883x20A = this.f78249d.a(c9853wo, i10);
        InterfaceC7173Sk interfaceC7173SkA = c7818dlB.a("google.afma.response.normalize", C9281rR.f78023d, C7498al.f72487c);
        if (!((Boolean) C9516tg.f78609a.e()).booleanValue()) {
            String str = c9853wo.f79535j;
            c9068pRG9 = null;
            if (str != null && !str.isEmpty()) {
                Pc.p0.k("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            c9068pRG9 = G9(c9853wo.f79533h);
            if (c9068pRG9 == null) {
                Pc.p0.k("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (c9068pRG9 == null) {
            k80A = J80.a(this.f78246a, 9);
        } else {
            k80A = c9068pRG9.f77585d;
        }
        W80 w80D = abstractC9883x20A.d();
        w80D.d(c9853wo.f79526a.getStringArrayList("ad_types"));
        C10137zR c10137zR = new C10137zR(c9853wo.f79532g, w80D, k80A);
        C9816wR c9816wR = new C9816wR(this.f78246a, c9853wo.f79527b.f29929a, this.f78252g, i10);
        B80 b80C = abstractC9883x20A.c();
        K80 k80A2 = J80.a(this.f78246a, 11);
        if (c9068pRG9 == null) {
            final com.google.common.util.concurrent.q qVarI9 = I9(c9853wo, b80C, abstractC9883x20A);
            final com.google.common.util.concurrent.q qVarH9 = H9(qVarI9, b80C, c7818dlB, w80D, k80A);
            K80 k80A3 = J80.a(this.f78246a, 10);
            final C8079g80 c8079g80A2 = b80C.a(EnumC9681v80.HTTP, qVarH9, qVarI9).a(new Callable() { // from class: com.google.android.gms.internal.ads.eR
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C9853wo c9853wo2;
                    Bundle bundle;
                    C10067yo c10067yo = (C10067yo) qVarH9.get();
                    if (((Boolean) Mc.A.c().a(C8659lf.f76392k2)).booleanValue() && (bundle = (c9853wo2 = c9853wo).f79538m) != null) {
                        bundle.putLong(EnumC7889eN.GET_AD_DICTIONARY_SDKCORE_START.a(), c10067yo.c());
                        c9853wo2.f79538m.putLong(EnumC7889eN.GET_AD_DICTIONARY_SDKCORE_END.a(), c10067yo.b());
                    }
                    return new C10030yR((JSONObject) qVarI9.get(), c10067yo);
                }
            }).e(c10137zR).e(new R80(k80A3)).e(c9816wR).a();
            V80.a(c8079g80A2, w80D, k80A3);
            V80.d(c8079g80A2, k80A2);
            c8079g80A = b80C.a(EnumC9681v80.PRE_PROCESS, qVarI9, qVarH9, c8079g80A2).a(new Callable() { // from class: com.google.android.gms.internal.ads.fR
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) Mc.A.c().a(C8659lf.f76392k2)).booleanValue() && (bundle = c9853wo.f79538m) != null) {
                        bundle.putLong(EnumC7889eN.HTTP_RESPONSE_READY.a(), Lc.v.c().a());
                    }
                    return new C9281rR((C9709vR) c8079g80A2.get(), (JSONObject) qVarI9.get(), (C10067yo) qVarH9.get());
                }
            }).f(interfaceC7173SkA).a();
        } else {
            C10030yR c10030yR = new C10030yR(c9068pRG9.f77583b, c9068pRG9.f77582a);
            K80 k80A4 = J80.a(this.f78246a, 10);
            final C8079g80 c8079g80A3 = b80C.b(EnumC9681v80.HTTP, Mj0.h(c10030yR)).e(c10137zR).e(new R80(k80A4)).e(c9816wR).a();
            V80.a(c8079g80A3, w80D, k80A4);
            final com.google.common.util.concurrent.q qVarH = Mj0.h(c9068pRG9);
            V80.d(c8079g80A3, k80A2);
            c8079g80A = b80C.a(EnumC9681v80.PRE_PROCESS, c8079g80A3, qVarH).a(new Callable() { // from class: com.google.android.gms.internal.ads.bR
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C9709vR c9709vR = (C9709vR) c8079g80A3.get();
                    com.google.common.util.concurrent.q qVar = qVarH;
                    return new C9281rR(c9709vR, ((C9068pR) qVar.get()).f77583b, ((C9068pR) qVar.get()).f77582a);
                }
            }).f(interfaceC7173SkA).a();
        }
        V80.a(c8079g80A, w80D, k80A2);
        return c8079g80A;
    }

    public final com.google.common.util.concurrent.q D9(final C9853wo c9853wo, int i10) {
        C7818dl c7818dlB = Lc.v.j().b(this.f78246a, Qc.a.B(), this.f78251f);
        if (!((Boolean) C10051yg.f80263a.e()).booleanValue()) {
            return Mj0.g(new Exception("Signal collection disabled."));
        }
        AbstractC9883x20 abstractC9883x20A = this.f78249d.a(c9853wo, i10);
        final W10 w10A = abstractC9883x20A.a();
        InterfaceC7173Sk interfaceC7173SkA = c7818dlB.a("google.afma.request.getSignals", C7498al.f72486b, C7498al.f72487c);
        K80 k80A = J80.a(this.f78246a, 22);
        C8079g80 c8079g80A = abstractC9883x20A.c().b(EnumC9681v80.GET_SIGNALS, Mj0.h(c9853wo.f79526a)).e(new R80(k80A)).f(new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.lR
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) throws JSONException {
                return w10A.a(C4169y.b().k((Bundle) obj), c9853wo.f79538m, false);
            }
        }).b(EnumC9681v80.JS_SIGNALS).f(interfaceC7173SkA).a();
        W80 w80D = abstractC9883x20A.d();
        w80D.d(c9853wo.f79526a.getStringArrayList("ad_types"));
        w80D.f(c9853wo.f79526a.getBundle("extras"));
        V80.b(c8079g80A, w80D, k80A);
        if (((Boolean) C8768mg.f76850f.e()).booleanValue()) {
            AR ar2 = this.f78248c;
            Objects.requireNonNull(ar2);
            c8079g80A.addListener(new RunnableC8321iR(ar2), this.f78247b);
        }
        return c8079g80A;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8463jo
    public final void E5(C9853wo c9853wo, InterfaceC8998oo interfaceC8998oo) {
        K9(B9(c9853wo, Binder.getCallingUid()), interfaceC8998oo, c9853wo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream F9(com.google.common.util.concurrent.q qVar, com.google.common.util.concurrent.q qVar2, C9853wo c9853wo, K80 k80) throws Exception {
        String strE = ((C10067yo) qVar.get()).e();
        J9(new C9068pR((C10067yo) qVar.get(), (JSONObject) qVar2.get(), c9853wo.f79533h, strE, k80));
        return new ByteArrayInputStream(strE.getBytes(StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8463jo
    public final void r3(String str, InterfaceC8998oo interfaceC8998oo) {
        K9(E9(str), interfaceC8998oo, null);
    }
}
