package com.google.android.gms.internal.ads;

import Oc.C4447y;
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
public final class BinderC9513sR extends AbstractBinderC8482io {

    /* renamed from: a, reason: collision with root package name */
    private final Context f79086a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f79087b;

    /* renamed from: c, reason: collision with root package name */
    private final AR f79088c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC9566sw f79089d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque f79090e;

    /* renamed from: f, reason: collision with root package name */
    private final Z80 f79091f;

    /* renamed from: g, reason: collision with root package name */
    private final C6827Eo f79092g;

    private final synchronized C9193pR G9(String str) {
        Iterator it = this.f79090e.iterator();
        while (it.hasNext()) {
            C9193pR c9193pR = (C9193pR) it.next();
            if (c9193pR.f78424c.equals(str)) {
                it.remove();
                return c9193pR;
            }
        }
        return null;
    }

    private final synchronized void J9(C9193pR c9193pR) {
        zzp();
        this.f79090e.addLast(c9193pR);
    }

    private final synchronized void zzp() {
        int iIntValue = ((Long) C9641tg.f79450b.e()).intValue();
        while (this.f79090e.size() >= iIntValue) {
            this.f79090e.removeFirst();
        }
    }

    private static com.google.common.util.concurrent.q H9(com.google.common.util.concurrent.q qVar, B80 b80, C7943dl c7943dl, W80 w80, K80 k80) {
        InterfaceC7298Sk interfaceC7298SkA = c7943dl.a("AFMA_getAdDictionary", C7623al.f73326b, new InterfaceC7365Uk() { // from class: com.google.android.gms.internal.ads.jR
            @Override // com.google.android.gms.internal.ads.InterfaceC7365Uk
            public final Object a(JSONObject jSONObject) {
                return new C10192yo(jSONObject);
            }
        });
        V80.d(qVar, k80);
        C8204g80 c8204g80A = b80.b(EnumC9806v80.BUILD_URL, qVar).f(interfaceC7298SkA).a();
        V80.c(c8204g80A, w80, k80);
        return c8204g80A;
    }

    private static com.google.common.util.concurrent.q I9(final C9978wo c9978wo, B80 b80, final AbstractC10008x20 abstractC10008x20) {
        InterfaceC9541sj0 interfaceC9541sj0 = new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.cR
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return abstractC10008x20.b().a(C4447y.b().k((Bundle) obj), c9978wo.f80378m, false);
            }
        };
        return b80.b(EnumC9806v80.GMS_SIGNALS, Mj0.h(c9978wo.f80366a)).f(interfaceC9541sj0).e(new InterfaceC7990e80() { // from class: com.google.android.gms.internal.ads.dR
            @Override // com.google.android.gms.internal.ads.InterfaceC7990e80
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                Rc.p0.k("Ad request signals:");
                Rc.p0.k(jSONObject.toString(2));
                return jSONObject;
            }
        }).a();
    }

    private final void K9(com.google.common.util.concurrent.q qVar, InterfaceC9123oo interfaceC9123oo, C9978wo c9978wo) {
        Mj0.r(Mj0.n(qVar, new InterfaceC9541sj0(this) { // from class: com.google.android.gms.internal.ads.kR
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) throws IOException {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
                C7033Kq.f69014a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.U60
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
        }, C7033Kq.f69014a), new C9086oR(this, c9978wo, interfaceC9123oo), C7033Kq.f69020g);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8588jo
    public final void A7(C9978wo c9978wo, InterfaceC9123oo interfaceC9123oo) {
        Bundle bundle;
        if (((Boolean) Oc.A.c().a(C8784lf.f77232k2)).booleanValue() && (bundle = c9978wo.f80378m) != null) {
            bundle.putLong(EnumC8014eN.SERVICE_CONNECTED.a(), Nc.v.c().a());
        }
        K9(D9(c9978wo, Binder.getCallingUid()), interfaceC9123oo, c9978wo);
    }

    public final com.google.common.util.concurrent.q B9(final C9978wo c9978wo, int i10) {
        if (!((Boolean) C9641tg.f79449a.e()).booleanValue()) {
            return Mj0.g(new Exception("Split request is disabled."));
        }
        C9163p70 c9163p70 = c9978wo.f80374i;
        if (c9163p70 == null) {
            return Mj0.g(new Exception("Pool configuration missing from request."));
        }
        if (c9163p70.f78343e == 0 || c9163p70.f78344f == 0) {
            return Mj0.g(new Exception("Caching is disabled."));
        }
        C7943dl c7943dlB = Nc.v.j().b(this.f79086a, Sc.a.B(), this.f79091f);
        AbstractC10008x20 abstractC10008x20A = this.f79089d.a(c9978wo, i10);
        B80 b80C = abstractC10008x20A.c();
        final com.google.common.util.concurrent.q qVarI9 = I9(c9978wo, b80C, abstractC10008x20A);
        W80 w80D = abstractC10008x20A.d();
        final K80 k80A = J80.a(this.f79086a, 9);
        final com.google.common.util.concurrent.q qVarH9 = H9(qVarI9, b80C, c7943dlB, w80D, k80A);
        return b80C.a(EnumC9806v80.GET_URL_AND_CACHE_KEY, qVarI9, qVarH9).a(new Callable() { // from class: com.google.android.gms.internal.ads.hR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f75560a.F9(qVarH9, qVarI9, c9978wo, k80A);
            }
        }).a();
    }

    public final com.google.common.util.concurrent.q E9(String str) {
        if (((Boolean) C9641tg.f79449a.e()).booleanValue()) {
            return G9(str) == null ? Mj0.g(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : Mj0.h(new C8979nR(this));
        }
        return Mj0.g(new Exception("Split request is disabled."));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8588jo
    public final void N6(C8162fo c8162fo, C9230po c9230po) {
        if (((Boolean) C6681Ag.f65995a.e()).booleanValue()) {
            this.f79089d.zzF();
            String str = c8162fo.f75016a;
            Mj0.r(Mj0.h(null), new C8872mR(this, c9230po, c8162fo), C7033Kq.f69020g);
        } else {
            try {
                c9230po.Z3("", c8162fo);
            } catch (RemoteException e10) {
                Rc.p0.l("Service can't call client", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8588jo
    public final void Z6(C9978wo c9978wo, InterfaceC9123oo interfaceC9123oo) {
        Bundle bundle;
        if (((Boolean) Oc.A.c().a(C8784lf.f77232k2)).booleanValue() && (bundle = c9978wo.f80378m) != null) {
            bundle.putLong(EnumC8014eN.SERVICE_CONNECTED.a(), Nc.v.c().a());
        }
        com.google.common.util.concurrent.q qVarC9 = C9(c9978wo, Binder.getCallingUid());
        K9(qVarC9, interfaceC9123oo, c9978wo);
        if (((Boolean) C8893mg.f77689e.e()).booleanValue()) {
            AR ar2 = this.f79088c;
            Objects.requireNonNull(ar2);
            qVarC9.addListener(new RunnableC8446iR(ar2), this.f79087b);
        }
    }

    public BinderC9513sR(Context context, Xj0 xj0, C6827Eo c6827Eo, InterfaceC9566sw interfaceC9566sw, AR ar2, ArrayDeque arrayDeque, C10048xR c10048xR, Z80 z80) {
        C8784lf.a(context);
        this.f79086a = context;
        this.f79087b = xj0;
        this.f79092g = c6827Eo;
        this.f79088c = ar2;
        this.f79089d = interfaceC9566sw;
        this.f79090e = arrayDeque;
        this.f79091f = z80;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8588jo
    public final void B3(String str, InterfaceC9123oo interfaceC9123oo) {
        K9(E9(str), interfaceC9123oo, null);
    }

    public final com.google.common.util.concurrent.q C9(final C9978wo c9978wo, int i10) {
        C9193pR c9193pRG9;
        K80 k80A;
        C8204g80 c8204g80A;
        C7943dl c7943dlB = Nc.v.j().b(this.f79086a, Sc.a.B(), this.f79091f);
        AbstractC10008x20 abstractC10008x20A = this.f79089d.a(c9978wo, i10);
        InterfaceC7298Sk interfaceC7298SkA = c7943dlB.a("google.afma.response.normalize", C9406rR.f78863d, C7623al.f73327c);
        if (!((Boolean) C9641tg.f79449a.e()).booleanValue()) {
            String str = c9978wo.f80375j;
            c9193pRG9 = null;
            if (str != null && !str.isEmpty()) {
                Rc.p0.k("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            c9193pRG9 = G9(c9978wo.f80373h);
            if (c9193pRG9 == null) {
                Rc.p0.k("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (c9193pRG9 == null) {
            k80A = J80.a(this.f79086a, 9);
        } else {
            k80A = c9193pRG9.f78425d;
        }
        W80 w80D = abstractC10008x20A.d();
        w80D.d(c9978wo.f80366a.getStringArrayList("ad_types"));
        C10262zR c10262zR = new C10262zR(c9978wo.f80372g, w80D, k80A);
        C9941wR c9941wR = new C9941wR(this.f79086a, c9978wo.f80367b.f34479a, this.f79092g, i10);
        B80 b80C = abstractC10008x20A.c();
        K80 k80A2 = J80.a(this.f79086a, 11);
        if (c9193pRG9 == null) {
            final com.google.common.util.concurrent.q qVarI9 = I9(c9978wo, b80C, abstractC10008x20A);
            final com.google.common.util.concurrent.q qVarH9 = H9(qVarI9, b80C, c7943dlB, w80D, k80A);
            K80 k80A3 = J80.a(this.f79086a, 10);
            final C8204g80 c8204g80A2 = b80C.a(EnumC9806v80.HTTP, qVarH9, qVarI9).a(new Callable() { // from class: com.google.android.gms.internal.ads.eR
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C9978wo c9978wo2;
                    Bundle bundle;
                    C10192yo c10192yo = (C10192yo) qVarH9.get();
                    if (((Boolean) Oc.A.c().a(C8784lf.f77232k2)).booleanValue() && (bundle = (c9978wo2 = c9978wo).f80378m) != null) {
                        bundle.putLong(EnumC8014eN.GET_AD_DICTIONARY_SDKCORE_START.a(), c10192yo.c());
                        c9978wo2.f80378m.putLong(EnumC8014eN.GET_AD_DICTIONARY_SDKCORE_END.a(), c10192yo.b());
                    }
                    return new C10155yR((JSONObject) qVarI9.get(), c10192yo);
                }
            }).e(c10262zR).e(new R80(k80A3)).e(c9941wR).a();
            V80.a(c8204g80A2, w80D, k80A3);
            V80.d(c8204g80A2, k80A2);
            c8204g80A = b80C.a(EnumC9806v80.PRE_PROCESS, qVarI9, qVarH9, c8204g80A2).a(new Callable() { // from class: com.google.android.gms.internal.ads.fR
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bundle bundle;
                    if (((Boolean) Oc.A.c().a(C8784lf.f77232k2)).booleanValue() && (bundle = c9978wo.f80378m) != null) {
                        bundle.putLong(EnumC8014eN.HTTP_RESPONSE_READY.a(), Nc.v.c().a());
                    }
                    return new C9406rR((C9834vR) c8204g80A2.get(), (JSONObject) qVarI9.get(), (C10192yo) qVarH9.get());
                }
            }).f(interfaceC7298SkA).a();
        } else {
            C10155yR c10155yR = new C10155yR(c9193pRG9.f78423b, c9193pRG9.f78422a);
            K80 k80A4 = J80.a(this.f79086a, 10);
            final C8204g80 c8204g80A3 = b80C.b(EnumC9806v80.HTTP, Mj0.h(c10155yR)).e(c10262zR).e(new R80(k80A4)).e(c9941wR).a();
            V80.a(c8204g80A3, w80D, k80A4);
            final com.google.common.util.concurrent.q qVarH = Mj0.h(c9193pRG9);
            V80.d(c8204g80A3, k80A2);
            c8204g80A = b80C.a(EnumC9806v80.PRE_PROCESS, c8204g80A3, qVarH).a(new Callable() { // from class: com.google.android.gms.internal.ads.bR
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C9834vR c9834vR = (C9834vR) c8204g80A3.get();
                    com.google.common.util.concurrent.q qVar = qVarH;
                    return new C9406rR(c9834vR, ((C9193pR) qVar.get()).f78423b, ((C9193pR) qVar.get()).f78422a);
                }
            }).f(interfaceC7298SkA).a();
        }
        V80.a(c8204g80A, w80D, k80A2);
        return c8204g80A;
    }

    public final com.google.common.util.concurrent.q D9(final C9978wo c9978wo, int i10) {
        C7943dl c7943dlB = Nc.v.j().b(this.f79086a, Sc.a.B(), this.f79091f);
        if (!((Boolean) C10176yg.f81103a.e()).booleanValue()) {
            return Mj0.g(new Exception("Signal collection disabled."));
        }
        AbstractC10008x20 abstractC10008x20A = this.f79089d.a(c9978wo, i10);
        final W10 w10A = abstractC10008x20A.a();
        InterfaceC7298Sk interfaceC7298SkA = c7943dlB.a("google.afma.request.getSignals", C7623al.f73326b, C7623al.f73327c);
        K80 k80A = J80.a(this.f79086a, 22);
        C8204g80 c8204g80A = abstractC10008x20A.c().b(EnumC9806v80.GET_SIGNALS, Mj0.h(c9978wo.f80366a)).e(new R80(k80A)).f(new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.lR
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) throws JSONException {
                return w10A.a(C4447y.b().k((Bundle) obj), c9978wo.f80378m, false);
            }
        }).b(EnumC9806v80.JS_SIGNALS).f(interfaceC7298SkA).a();
        W80 w80D = abstractC10008x20A.d();
        w80D.d(c9978wo.f80366a.getStringArrayList("ad_types"));
        w80D.f(c9978wo.f80366a.getBundle("extras"));
        V80.b(c8204g80A, w80D, k80A);
        if (((Boolean) C8893mg.f77690f.e()).booleanValue()) {
            AR ar2 = this.f79088c;
            Objects.requireNonNull(ar2);
            c8204g80A.addListener(new RunnableC8446iR(ar2), this.f79087b);
        }
        return c8204g80A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream F9(com.google.common.util.concurrent.q qVar, com.google.common.util.concurrent.q qVar2, C9978wo c9978wo, K80 k80) throws Exception {
        String strE = ((C10192yo) qVar.get()).e();
        J9(new C9193pR((C10192yo) qVar.get(), (JSONObject) qVar2.get(), c9978wo.f80373h, strE, k80));
        return new ByteArrayInputStream(strE.getBytes(StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8588jo
    public final void O5(C9978wo c9978wo, InterfaceC9123oo interfaceC9123oo) {
        K9(B9(c9978wo, Binder.getCallingUid()), interfaceC9123oo, c9978wo);
    }
}
