package com.google.android.gms.internal.ads;

import Mc.BinderC4148q1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.kK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8526kK {

    /* renamed from: a, reason: collision with root package name */
    private final Context f75606a;

    /* renamed from: b, reason: collision with root package name */
    private final NJ f75607b;

    /* renamed from: c, reason: collision with root package name */
    private final M9 f75608c;

    /* renamed from: d, reason: collision with root package name */
    private final Qc.a f75609d;

    /* renamed from: e, reason: collision with root package name */
    private final Lc.a f75610e;

    /* renamed from: f, reason: collision with root package name */
    private final C7392Zc f75611f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f75612g;

    /* renamed from: h, reason: collision with root package name */
    private final C6963Mg f75613h;

    /* renamed from: i, reason: collision with root package name */
    private final DK f75614i;

    /* renamed from: j, reason: collision with root package name */
    private final UL f75615j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f75616k;

    /* renamed from: l, reason: collision with root package name */
    private final C8955oL f75617l;

    /* renamed from: m, reason: collision with root package name */
    private final C9812wN f75618m;

    /* renamed from: n, reason: collision with root package name */
    private final R90 f75619n;

    /* renamed from: o, reason: collision with root package name */
    private final C9710vS f75620o;

    /* renamed from: p, reason: collision with root package name */
    private final GS f75621p;

    /* renamed from: q, reason: collision with root package name */
    private final C9998y60 f75622q;

    private final com.google.common.util.concurrent.q n(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            return Mj0.h(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return Mj0.h(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z10) {
            return Mj0.h(new BinderC6896Kg(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return m(jSONObject.optBoolean("require"), Mj0.m(this.f75607b.b(strOptString, dOptDouble, zOptBoolean), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.YJ
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return new BinderC6896Kg(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.f75612g), null);
    }

    final /* synthetic */ BinderC6828Ig a(JSONObject jSONObject, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numQ = q(jSONObject, "bg_color");
        Integer numQ2 = q(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new BinderC6828Ig(strOptString, list, numQ, numQ2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.f75613h.f68686e, zOptBoolean);
    }

    public static final BinderC4148q1 i(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return r(jSONObjectOptJSONObject);
    }

    public static final List j(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return AbstractC7917eh0.t();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return AbstractC7917eh0.t();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            BinderC4148q1 binderC4148q1R = r(jSONArrayOptJSONArray.optJSONObject(i10));
            if (binderC4148q1R != null) {
                arrayList.add(binderC4148q1R);
            }
        }
        return AbstractC7917eh0.r(arrayList);
    }

    private final Mc.d2 k(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return Mc.d2.c0();
            }
            i10 = 0;
        }
        return new Mc.d2(this.f75606a, new Ec.e(i10, i11));
    }

    private static com.google.common.util.concurrent.q l(com.google.common.util.concurrent.q qVar, Object obj) {
        final Object obj2 = null;
        return Mj0.f(qVar, Exception.class, new InterfaceC9416sj0(obj2) { // from class: com.google.android.gms.internal.ads.fK
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj3) {
                Pc.p0.l("Error during loading assets.", (Exception) obj3);
                return Mj0.h(null);
            }
        }, C6908Kq.f68180g);
    }

    private static com.google.common.util.concurrent.q m(boolean z10, final com.google.common.util.concurrent.q qVar, Object obj) {
        return z10 ? Mj0.n(qVar, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.gK
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj2) {
                return obj2 != null ? qVar : Mj0.g(new zzegu(1, "Retrieve required value in native ad response failed."));
            }
        }, C6908Kq.f68180g) : l(qVar, null);
    }

    private final com.google.common.util.concurrent.q o(JSONArray jSONArray, boolean z10, boolean z11) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return Mj0.h(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z11 ? jSONArray.length() : 1;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(n(jSONArray.optJSONObject(i10), z10));
        }
        return Mj0.m(Mj0.d(arrayList), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.dK
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (BinderC6896Kg binderC6896Kg : (List) obj) {
                    if (binderC6896Kg != null) {
                        arrayList2.add(binderC6896Kg);
                    }
                }
                return arrayList2;
            }
        }, this.f75612g);
    }

    private final com.google.common.util.concurrent.q p(JSONObject jSONObject, Z50 z50, C7648c60 c7648c60) {
        final com.google.common.util.concurrent.q qVarB = this.f75614i.b(jSONObject.optString("base_url"), jSONObject.optString("html"), z50, c7648c60, k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return Mj0.n(qVarB, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.aK
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) throws zzegu {
                InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
                if (interfaceC9008ot == null || interfaceC9008ot.zzq() == null) {
                    throw new zzegu(1, "Retrieve video view in html5 ad response failed.");
                }
                return qVarB;
            }
        }, C6908Kq.f68180g);
    }

    private static final BinderC4148q1 r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new BinderC4148q1(strOptString, strOptString2);
    }

    final /* synthetic */ com.google.common.util.concurrent.q b(Mc.d2 d2Var, Z50 z50, C7648c60 c7648c60, String str, String str2, Object obj) throws Exception {
        InterfaceC9008ot interfaceC9008otA = this.f75615j.a(d2Var, z50, c7648c60);
        final C7111Qq c7111QqD = C7111Qq.d(interfaceC9008otA);
        C8634lL c8634lLB = this.f75617l.b();
        interfaceC9008otA.zzN().r0(c8634lLB, c8634lLB, c8634lLB, c8634lLB, c8634lLB, false, null, new Lc.b(this.f75606a, null, null), null, null, this.f75620o, this.f75619n, this.f75618m, null, c8634lLB, null, null, null, null);
        interfaceC9008otA.h0("/getNativeAdViewSignals", C7035Oi.f69150s);
        interfaceC9008otA.h0("/getNativeClickMeta", C7035Oi.f69151t);
        interfaceC9008otA.zzN().a0(true);
        interfaceC9008otA.zzN().P(new InterfaceC7942eu() { // from class: com.google.android.gms.internal.ads.hK
            @Override // com.google.android.gms.internal.ads.InterfaceC7942eu
            public final void a(boolean z10, int i10, String str3, String str4) {
                C7111Qq c7111Qq = c7111QqD;
                if (z10) {
                    c7111Qq.e();
                    return;
                }
                c7111Qq.c(new zzegu(1, "Image Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        interfaceC9008otA.J0(str, str2, null);
        return c7111QqD;
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(String str, Object obj) throws Exception {
        Lc.v.a();
        InterfaceC9008ot interfaceC9008otA = C6673Dt.a(this.f75606a, C8368iu.a(), "native-omid", false, false, this.f75608c, null, this.f75609d, null, null, this.f75610e, this.f75611f, null, null, this.f75621p, this.f75622q);
        final C7111Qq c7111QqD = C7111Qq.d(interfaceC9008otA);
        interfaceC9008otA.zzN().P(new InterfaceC7942eu() { // from class: com.google.android.gms.internal.ads.XJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7942eu
            public final void a(boolean z10, int i10, String str2, String str3) {
                c7111QqD.e();
            }
        });
        if (((Boolean) Mc.A.c().a(C8659lf.f76367i5)).booleanValue()) {
            interfaceC9008otA.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
            return c7111QqD;
        }
        interfaceC9008otA.loadData(str, "text/html", "UTF-8");
        return c7111QqD;
    }

    public final com.google.common.util.concurrent.q d(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return Mj0.h(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return m(jSONObjectOptJSONObject.optBoolean("require"), Mj0.m(o(jSONArrayOptJSONArray, false, true), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.eK
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return this.f73809a.a(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.f75612g), null);
    }

    public final com.google.common.util.concurrent.q e(JSONObject jSONObject, String str) {
        return n(jSONObject.optJSONObject(str), this.f75613h.f68683b);
    }

    public final com.google.common.util.concurrent.q f(JSONObject jSONObject, String str) {
        C6963Mg c6963Mg = this.f75613h;
        return o(jSONObject.optJSONArray("images"), c6963Mg.f68683b, c6963Mg.f68685d);
    }

    public final com.google.common.util.concurrent.q g(JSONObject jSONObject, String str, final Z50 z50, final C7648c60 c7648c60) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76162T9)).booleanValue()) {
            return Mj0.h(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return Mj0.h(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return Mj0.h(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final Mc.d2 d2VarK = k(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return Mj0.h(null);
        }
        final com.google.common.util.concurrent.q qVarN = Mj0.n(Mj0.h(null), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.bK
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f72785a.b(d2VarK, z50, c7648c60, strOptString, strOptString2, obj);
            }
        }, C6908Kq.f68179f);
        return Mj0.n(qVarN, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.cK
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) throws zzegu {
                if (((InterfaceC9008ot) obj) != null) {
                    return qVarN;
                }
                throw new zzegu(1, "Retrieve Web View from image ad response failed.");
            }
        }, C6908Kq.f68180g);
    }

    public final com.google.common.util.concurrent.q h(JSONObject jSONObject, Z50 z50, C7648c60 c7648c60) {
        com.google.common.util.concurrent.q qVarA;
        JSONObject jSONObjectH = Pc.U.h(jSONObject, "html_containers", "instream");
        if (jSONObjectH != null) {
            return p(jSONObjectH, z50, c7648c60);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return Mj0.h(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z10 = false;
        if (((Boolean) Mc.A.c().a(C8659lf.f76148S9)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z10 = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z10) {
                qVarA = this.f75614i.a(jSONObjectOptJSONObject);
            }
            return l(Mj0.o(qVarA, ((Integer) Mc.A.c().a(C8659lf.f76142S3)).intValue(), TimeUnit.SECONDS, this.f75616k), null);
        }
        if (!z10) {
            Qc.p.g("Required field 'vast_xml' or 'html' is missing");
            return Mj0.h(null);
        }
        qVarA = p(jSONObjectOptJSONObject, z50, c7648c60);
        return l(Mj0.o(qVarA, ((Integer) Mc.A.c().a(C8659lf.f76142S3)).intValue(), TimeUnit.SECONDS, this.f75616k), null);
    }

    public C8526kK(Context context, NJ nj2, M9 m92, Qc.a aVar, Lc.a aVar2, C7392Zc c7392Zc, Executor executor, C9570u60 c9570u60, DK dk2, UL ul2, ScheduledExecutorService scheduledExecutorService, C9812wN c9812wN, R90 r90, C9710vS c9710vS, C8955oL c8955oL, GS gs2, C9998y60 c9998y60) {
        this.f75606a = context;
        this.f75607b = nj2;
        this.f75608c = m92;
        this.f75609d = aVar;
        this.f75610e = aVar2;
        this.f75611f = c7392Zc;
        this.f75612g = executor;
        this.f75613h = c9570u60.f78743i;
        this.f75614i = dk2;
        this.f75615j = ul2;
        this.f75616k = scheduledExecutorService;
        this.f75618m = c9812wN;
        this.f75619n = r90;
        this.f75620o = c9710vS;
        this.f75617l = c8955oL;
        this.f75621p = gs2;
        this.f75622q = c9998y60;
    }

    private static Integer q(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }
}
