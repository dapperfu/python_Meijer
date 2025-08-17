package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9280rQ {

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f78011l = Pattern.compile("\\?");

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9010ou f78012a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f78013b;

    /* renamed from: c, reason: collision with root package name */
    private final Qc.a f78014c;

    /* renamed from: d, reason: collision with root package name */
    private final C9570u60 f78015d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f78016e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f78017f;

    /* renamed from: g, reason: collision with root package name */
    private final String f78018g;

    /* renamed from: h, reason: collision with root package name */
    private final W80 f78019h;

    /* renamed from: i, reason: collision with root package name */
    private final C9171qN f78020i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f78021j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private final C6702Eo f78022k;

    private final com.google.common.util.concurrent.q d(String str, final String str2) {
        String string;
        com.google.common.util.concurrent.q qVarH;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return Mj0.g(new zzegu(15, "Invalid ad string."));
        }
        K80 k80A = J80.a(this.f78013b, 11);
        k80A.zzi();
        C7818dl c7818dlA = Lc.v.j().a(this.f78013b, this.f78014c, this.f78012a.F());
        InterfaceC7339Xk interfaceC7339Xk = C7498al.f72486b;
        final InterfaceC7173Sk interfaceC7173SkA = c7818dlA.a("google.afma.response.normalize", interfaceC7339Xk, interfaceC7339Xk);
        if (((Boolean) Mc.A.c().a(C8659lf.f76145S6)).booleanValue()) {
            try {
                string = new JSONObject(str).optString("fetch_url", "");
            } catch (JSONException unused) {
                string = "";
            }
            if (TextUtils.isEmpty(string)) {
                qVarH = Mj0.h(str);
                this.f78020i.c("sst", "1");
            } else {
                this.f78020i.c("sst", "2");
                String str4 = (String) Mc.A.c().a(C8659lf.f76173U6);
                if (((Boolean) Mc.A.c().a(C8659lf.f76159T6)).booleanValue()) {
                    List listF = C7200Tf0.c(f78011l).f(string);
                    if (listF.size() < 2) {
                        qVarH = Mj0.g(new zzegu(1, "Invalid fetch URL."));
                    } else {
                        str3 = (String) listF.get(1);
                        Lc.v.t();
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        final C9602uR c9602uR = new C9602uR(string, 60000, new HashMap(), str3.getBytes(StandardCharsets.UTF_8), str4, false);
                        qVarH = (Cj0) Mj0.f((Cj0) Mj0.o(Cj0.D(C6908Kq.f68174a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.pQ
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.f77580a.c(c9602uR);
                            }
                        })), ((Integer) Mc.A.c().a(C8659lf.f76187V6)).intValue(), TimeUnit.MILLISECONDS, this.f78017f), Exception.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.qQ
                            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                            public final com.google.common.util.concurrent.q zza(Object obj) {
                                zzegu zzeguVar;
                                Exception exc = (Exception) obj;
                                Lc.v.s().w(exc, "PreloadedLoader.getTypeTwoAdResponseString");
                                if (exc instanceof TimeoutException) {
                                    zzeguVar = new zzegu(1, "Timed out waiting for ad response.");
                                } else if (exc instanceof zzegu) {
                                    zzeguVar = (zzegu) exc;
                                } else {
                                    zzeguVar = new zzegu(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                                }
                                return Mj0.g(zzeguVar);
                            }
                        }, this.f78016e);
                    }
                } else {
                    final C9602uR c9602uR2 = new C9602uR(string, 60000, new HashMap(), str3.getBytes(StandardCharsets.UTF_8), str4, false);
                    qVarH = (Cj0) Mj0.f((Cj0) Mj0.o(Cj0.D(C6908Kq.f68174a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.pQ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f77580a.c(c9602uR2);
                        }
                    })), ((Integer) Mc.A.c().a(C8659lf.f76187V6)).intValue(), TimeUnit.MILLISECONDS, this.f78017f), Exception.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.qQ
                        @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
                        public final com.google.common.util.concurrent.q zza(Object obj) {
                            zzegu zzeguVar;
                            Exception exc = (Exception) obj;
                            Lc.v.s().w(exc, "PreloadedLoader.getTypeTwoAdResponseString");
                            if (exc instanceof TimeoutException) {
                                zzeguVar = new zzegu(1, "Timed out waiting for ad response.");
                            } else if (exc instanceof zzegu) {
                                zzeguVar = (zzegu) exc;
                            } else {
                                zzeguVar = new zzegu(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                            }
                            return Mj0.g(zzeguVar);
                        }
                    }, this.f78016e);
                }
            }
        } else {
            qVarH = Mj0.h(str);
            this.f78020i.c("sst", "1");
        }
        com.google.common.util.concurrent.q qVarN = Mj0.n(Mj0.n(Mj0.n(qVarH, new InterfaceC9416sj0(this) { // from class: com.google.android.gms.internal.ads.mQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) throws JSONException {
                String str5 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str6 = str2;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str5);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str6));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return Mj0.h(jSONObject);
                } catch (JSONException e10) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e10.getCause())));
                }
            }
        }, this.f78016e), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.nQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return interfaceC7173SkA.zzb((JSONObject) obj);
            }
        }, this.f78016e), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.oQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f77366a.b((JSONObject) obj);
            }
        }, this.f78016e);
        V80.a(qVarN, this.f78019h, k80A);
        return qVarN;
    }

    private final String e(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && com.google.ads.interactivemedia.v3.impl.data.zzbz.UNKNOWN_CONTENT_TYPE.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f78018g));
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            Qc.p.g("Failed to update the ad types for rendering. ".concat(e10.toString()));
            return str;
        }
    }

    private final void f(EnumC7889eN enumC7889eN) {
        Bundle bundleA = this.f78020i.a();
        if (((Boolean) Mc.A.c().a(C8659lf.f76215X6)).booleanValue()) {
            bundleA.putLong(enumC7889eN.a(), Lc.v.c().a());
        }
    }

    private static final String g(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0181 A[Catch: all -> 0x008d, TryCatch #4 {, blocks: (B:18:0x0051, B:20:0x006f, B:22:0x0077, B:24:0x008a, B:29:0x0092, B:32:0x009a, B:34:0x00a2, B:36:0x00a8, B:40:0x00b1, B:49:0x00e9, B:43:0x00c3, B:48:0x00d2, B:51:0x00ee, B:28:0x0090, B:52:0x0104, B:59:0x011d, B:62:0x0125, B:66:0x0149, B:68:0x015e, B:72:0x0181, B:74:0x0196, B:77:0x01aa, B:79:0x01b0, B:80:0x01bd, B:82:0x01bf, B:85:0x01c8, B:84:0x01c5, B:73:0x018b, B:69:0x0171, B:65:0x0133, B:56:0x010d, B:57:0x0112), top: B:117:0x0051, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b A[Catch: all -> 0x008d, TryCatch #4 {, blocks: (B:18:0x0051, B:20:0x006f, B:22:0x0077, B:24:0x008a, B:29:0x0092, B:32:0x009a, B:34:0x00a2, B:36:0x00a8, B:40:0x00b1, B:49:0x00e9, B:43:0x00c3, B:48:0x00d2, B:51:0x00ee, B:28:0x0090, B:52:0x0104, B:59:0x011d, B:62:0x0125, B:66:0x0149, B:68:0x015e, B:72:0x0181, B:74:0x0196, B:77:0x01aa, B:79:0x01b0, B:80:0x01bd, B:82:0x01bf, B:85:0x01c8, B:84:0x01c5, B:73:0x018b, B:69:0x0171, B:65:0x0133, B:56:0x010d, B:57:0x0112), top: B:117:0x0051, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c5 A[Catch: all -> 0x008d, TryCatch #4 {, blocks: (B:18:0x0051, B:20:0x006f, B:22:0x0077, B:24:0x008a, B:29:0x0092, B:32:0x009a, B:34:0x00a2, B:36:0x00a8, B:40:0x00b1, B:49:0x00e9, B:43:0x00c3, B:48:0x00d2, B:51:0x00ee, B:28:0x0090, B:52:0x0104, B:59:0x011d, B:62:0x0125, B:66:0x0149, B:68:0x015e, B:72:0x0181, B:74:0x0196, B:77:0x01aa, B:79:0x01b0, B:80:0x01bd, B:82:0x01bf, B:85:0x01c8, B:84:0x01c5, B:73:0x018b, B:69:0x0171, B:65:0x0133, B:56:0x010d, B:57:0x0112), top: B:117:0x0051, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.q a() {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9280rQ.a():com.google.common.util.concurrent.q");
    }

    final /* synthetic */ com.google.common.util.concurrent.q b(JSONObject jSONObject) throws Exception {
        return Mj0.h(new C8608l60(new C8182h60(this.f78015d), C8394j60.a(new StringReader(jSONObject.toString()), null)));
    }

    final /* synthetic */ String c(C9602uR c9602uR) throws Exception {
        f(EnumC7889eN.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i10 = 0;
        int i11 = -1;
        while (true) {
            try {
                if (i10 >= ((Integer) Mc.A.c().a(C8659lf.f76201W6)).intValue()) {
                    throw new zzegu(1, "Received HTTP error code from ad server: " + i11);
                }
                C9709vR c9709vRA = new C9816wR(this.f78013b, this.f78014c.f29929a, this.f78022k, Binder.getCallingUid()).zza(c9602uR);
                int i12 = c9709vRA.f79055a;
                if (((Boolean) Mc.A.c().a(C8659lf.f76215X6)).booleanValue()) {
                    this.f78020i.c("fr", String.valueOf(i10));
                }
                if (i12 == 200) {
                    f(EnumC7889eN.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return c9709vRA.f79057c;
                }
                i10++;
                i11 = i12;
            } catch (Exception e10) {
                throw new zzegu(1, e10.getMessage() == null ? "Fetch failed." : e10.getMessage(), e10);
            }
        }
    }

    C9280rQ(AbstractC9010ou abstractC9010ou, Context context, Qc.a aVar, C9570u60 c9570u60, Executor executor, String str, W80 w80, C9171qN c9171qN, C6702Eo c6702Eo, C9923xR c9923xR, ScheduledExecutorService scheduledExecutorService) {
        this.f78012a = abstractC9010ou;
        this.f78013b = context;
        this.f78014c = aVar;
        this.f78015d = c9570u60;
        this.f78016e = executor;
        this.f78018g = str;
        this.f78019h = w80;
        abstractC9010ou.D();
        this.f78020i = c9171qN;
        this.f78022k = c6702Eo;
        this.f78017f = scheduledExecutorService;
    }
}
