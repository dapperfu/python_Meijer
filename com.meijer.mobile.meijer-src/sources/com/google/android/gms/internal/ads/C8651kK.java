package com.google.android.gms.internal.ads;

import Oc.BinderC4426q1;
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
public final class C8651kK {

    /* renamed from: a, reason: collision with root package name */
    private final Context f76446a;

    /* renamed from: b, reason: collision with root package name */
    private final NJ f76447b;

    /* renamed from: c, reason: collision with root package name */
    private final M9 f76448c;

    /* renamed from: d, reason: collision with root package name */
    private final Sc.a f76449d;

    /* renamed from: e, reason: collision with root package name */
    private final Nc.a f76450e;

    /* renamed from: f, reason: collision with root package name */
    private final C7517Zc f76451f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f76452g;

    /* renamed from: h, reason: collision with root package name */
    private final C7088Mg f76453h;

    /* renamed from: i, reason: collision with root package name */
    private final DK f76454i;

    /* renamed from: j, reason: collision with root package name */
    private final UL f76455j;

    /* renamed from: k, reason: collision with root package name */
    private final ScheduledExecutorService f76456k;

    /* renamed from: l, reason: collision with root package name */
    private final C9080oL f76457l;

    /* renamed from: m, reason: collision with root package name */
    private final C9937wN f76458m;

    /* renamed from: n, reason: collision with root package name */
    private final R90 f76459n;

    /* renamed from: o, reason: collision with root package name */
    private final C9835vS f76460o;

    /* renamed from: p, reason: collision with root package name */
    private final GS f76461p;

    /* renamed from: q, reason: collision with root package name */
    private final C10123y60 f76462q;

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
            return Mj0.h(new BinderC7021Kg(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return m(jSONObject.optBoolean("require"), Mj0.m(this.f76447b.b(strOptString, dOptDouble, zOptBoolean), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.YJ
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                return new BinderC7021Kg(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.f76452g), null);
    }

    final /* synthetic */ BinderC6953Ig a(JSONObject jSONObject, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numQ = q(jSONObject, "bg_color");
        Integer numQ2 = q(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new BinderC6953Ig(strOptString, list, numQ, numQ2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.f76453h.f69526e, zOptBoolean);
    }

    public static final BinderC4426q1 i(JSONObject jSONObject) {
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
            return AbstractC8042eh0.t();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return AbstractC8042eh0.t();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            BinderC4426q1 binderC4426q1R = r(jSONArrayOptJSONArray.optJSONObject(i10));
            if (binderC4426q1R != null) {
                arrayList.add(binderC4426q1R);
            }
        }
        return AbstractC8042eh0.r(arrayList);
    }

    private final Oc.d2 k(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return Oc.d2.b0();
            }
            i10 = 0;
        }
        return new Oc.d2(this.f76446a, new Gc.e(i10, i11));
    }

    private static com.google.common.util.concurrent.q l(com.google.common.util.concurrent.q qVar, Object obj) {
        final Object obj2 = null;
        return Mj0.f(qVar, Exception.class, new InterfaceC9541sj0(obj2) { // from class: com.google.android.gms.internal.ads.fK
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj3) {
                Rc.p0.l("Error during loading assets.", (Exception) obj3);
                return Mj0.h(null);
            }
        }, C7033Kq.f69020g);
    }

    private static com.google.common.util.concurrent.q m(boolean z10, final com.google.common.util.concurrent.q qVar, Object obj) {
        return z10 ? Mj0.n(qVar, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.gK
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj2) {
                return obj2 != null ? qVar : Mj0.g(new zzegu(1, "Retrieve required value in native ad response failed."));
            }
        }, C7033Kq.f69020g) : l(qVar, null);
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
        return Mj0.m(Mj0.d(arrayList), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.dK
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (BinderC7021Kg binderC7021Kg : (List) obj) {
                    if (binderC7021Kg != null) {
                        arrayList2.add(binderC7021Kg);
                    }
                }
                return arrayList2;
            }
        }, this.f76452g);
    }

    private final com.google.common.util.concurrent.q p(JSONObject jSONObject, Z50 z50, C7773c60 c7773c60) {
        final com.google.common.util.concurrent.q qVarB = this.f76454i.b(jSONObject.optString("base_url"), jSONObject.optString("html"), z50, c7773c60, k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return Mj0.n(qVarB, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.aK
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) throws zzegu {
                InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
                if (interfaceC9133ot == null || interfaceC9133ot.zzq() == null) {
                    throw new zzegu(1, "Retrieve video view in html5 ad response failed.");
                }
                return qVarB;
            }
        }, C7033Kq.f69020g);
    }

    private static final BinderC4426q1 r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new BinderC4426q1(strOptString, strOptString2);
    }

    final /* synthetic */ com.google.common.util.concurrent.q b(Oc.d2 d2Var, Z50 z50, C7773c60 c7773c60, String str, String str2, Object obj) throws Exception {
        InterfaceC9133ot interfaceC9133otA = this.f76455j.a(d2Var, z50, c7773c60);
        final C7236Qq c7236QqD = C7236Qq.d(interfaceC9133otA);
        C8759lL c8759lLB = this.f76457l.b();
        interfaceC9133otA.zzN().N0(c8759lLB, c8759lLB, c8759lLB, c8759lLB, c8759lLB, false, null, new Nc.b(this.f76446a, null, null), null, null, this.f76460o, this.f76459n, this.f76458m, null, c8759lLB, null, null, null, null);
        interfaceC9133otA.h0("/getNativeAdViewSignals", C7160Oi.f69990s);
        interfaceC9133otA.h0("/getNativeClickMeta", C7160Oi.f69991t);
        interfaceC9133otA.zzN().a0(true);
        interfaceC9133otA.zzN().P(new InterfaceC8067eu() { // from class: com.google.android.gms.internal.ads.hK
            @Override // com.google.android.gms.internal.ads.InterfaceC8067eu
            public final void a(boolean z10, int i10, String str3, String str4) {
                C7236Qq c7236Qq = c7236QqD;
                if (z10) {
                    c7236Qq.e();
                    return;
                }
                c7236Qq.c(new zzegu(1, "Image Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        interfaceC9133otA.I0(str, str2, null);
        return c7236QqD;
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(String str, Object obj) throws Exception {
        Nc.v.a();
        InterfaceC9133ot interfaceC9133otA = C6798Dt.a(this.f76446a, C8493iu.a(), "native-omid", false, false, this.f76448c, null, this.f76449d, null, null, this.f76450e, this.f76451f, null, null, this.f76461p, this.f76462q);
        final C7236Qq c7236QqD = C7236Qq.d(interfaceC9133otA);
        interfaceC9133otA.zzN().P(new InterfaceC8067eu() { // from class: com.google.android.gms.internal.ads.XJ
            @Override // com.google.android.gms.internal.ads.InterfaceC8067eu
            public final void a(boolean z10, int i10, String str2, String str3) {
                c7236QqD.e();
            }
        });
        if (((Boolean) Oc.A.c().a(C8784lf.f77207i5)).booleanValue()) {
            interfaceC9133otA.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
            return c7236QqD;
        }
        interfaceC9133otA.loadData(str, "text/html", "UTF-8");
        return c7236QqD;
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
        return m(jSONObjectOptJSONObject.optBoolean("require"), Mj0.m(o(jSONArrayOptJSONArray, false, true), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.eK
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                return this.f74649a.a(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.f76452g), null);
    }

    public final com.google.common.util.concurrent.q e(JSONObject jSONObject, String str) {
        return n(jSONObject.optJSONObject(str), this.f76453h.f69523b);
    }

    public final com.google.common.util.concurrent.q f(JSONObject jSONObject, String str) {
        C7088Mg c7088Mg = this.f76453h;
        return o(jSONObject.optJSONArray("images"), c7088Mg.f69523b, c7088Mg.f69525d);
    }

    public final com.google.common.util.concurrent.q g(JSONObject jSONObject, String str, final Z50 z50, final C7773c60 c7773c60) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77002T9)).booleanValue()) {
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
        final Oc.d2 d2VarK = k(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return Mj0.h(null);
        }
        final com.google.common.util.concurrent.q qVarN = Mj0.n(Mj0.h(null), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.bK
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f73625a.b(d2VarK, z50, c7773c60, strOptString, strOptString2, obj);
            }
        }, C7033Kq.f69019f);
        return Mj0.n(qVarN, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.cK
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) throws zzegu {
                if (((InterfaceC9133ot) obj) != null) {
                    return qVarN;
                }
                throw new zzegu(1, "Retrieve Web View from image ad response failed.");
            }
        }, C7033Kq.f69020g);
    }

    public final com.google.common.util.concurrent.q h(JSONObject jSONObject, Z50 z50, C7773c60 c7773c60) {
        com.google.common.util.concurrent.q qVarA;
        JSONObject jSONObjectH = Rc.U.h(jSONObject, "html_containers", "instream");
        if (jSONObjectH != null) {
            return p(jSONObjectH, z50, c7773c60);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return Mj0.h(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z10 = false;
        if (((Boolean) Oc.A.c().a(C8784lf.f76988S9)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z10 = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z10) {
                qVarA = this.f76454i.a(jSONObjectOptJSONObject);
            }
            return l(Mj0.o(qVarA, ((Integer) Oc.A.c().a(C8784lf.f76982S3)).intValue(), TimeUnit.SECONDS, this.f76456k), null);
        }
        if (!z10) {
            Sc.p.g("Required field 'vast_xml' or 'html' is missing");
            return Mj0.h(null);
        }
        qVarA = p(jSONObjectOptJSONObject, z50, c7773c60);
        return l(Mj0.o(qVarA, ((Integer) Oc.A.c().a(C8784lf.f76982S3)).intValue(), TimeUnit.SECONDS, this.f76456k), null);
    }

    public C8651kK(Context context, NJ nj2, M9 m92, Sc.a aVar, Nc.a aVar2, C7517Zc c7517Zc, Executor executor, C9695u60 c9695u60, DK dk2, UL ul2, ScheduledExecutorService scheduledExecutorService, C9937wN c9937wN, R90 r90, C9835vS c9835vS, C9080oL c9080oL, GS gs2, C10123y60 c10123y60) {
        this.f76446a = context;
        this.f76447b = nj2;
        this.f76448c = m92;
        this.f76449d = aVar;
        this.f76450e = aVar2;
        this.f76451f = c7517Zc;
        this.f76452g = executor;
        this.f76453h = c9695u60.f79583i;
        this.f76454i = dk2;
        this.f76455j = ul2;
        this.f76456k = scheduledExecutorService;
        this.f76458m = c9937wN;
        this.f76459n = r90;
        this.f76460o = c9835vS;
        this.f76457l = c9080oL;
        this.f76461p = gs2;
        this.f76462q = c10123y60;
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
