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
public final class C9405rQ {

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f78851l = Pattern.compile("\\?");

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9135ou f78852a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f78853b;

    /* renamed from: c, reason: collision with root package name */
    private final Sc.a f78854c;

    /* renamed from: d, reason: collision with root package name */
    private final C9695u60 f78855d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f78856e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f78857f;

    /* renamed from: g, reason: collision with root package name */
    private final String f78858g;

    /* renamed from: h, reason: collision with root package name */
    private final W80 f78859h;

    /* renamed from: i, reason: collision with root package name */
    private final C9296qN f78860i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f78861j = new Object();

    /* renamed from: k, reason: collision with root package name */
    private final C6827Eo f78862k;

    private final com.google.common.util.concurrent.q d(String str, final String str2) {
        String string;
        com.google.common.util.concurrent.q qVarH;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            return Mj0.g(new zzegu(15, "Invalid ad string."));
        }
        K80 k80A = J80.a(this.f78853b, 11);
        k80A.zzi();
        C7943dl c7943dlA = Nc.v.j().a(this.f78853b, this.f78854c, this.f78852a.F());
        InterfaceC7464Xk interfaceC7464Xk = C7623al.f73326b;
        final InterfaceC7298Sk interfaceC7298SkA = c7943dlA.a("google.afma.response.normalize", interfaceC7464Xk, interfaceC7464Xk);
        if (((Boolean) Oc.A.c().a(C8784lf.f76985S6)).booleanValue()) {
            try {
                string = new JSONObject(str).optString("fetch_url", "");
            } catch (JSONException unused) {
                string = "";
            }
            if (TextUtils.isEmpty(string)) {
                qVarH = Mj0.h(str);
                this.f78860i.c("sst", "1");
            } else {
                this.f78860i.c("sst", "2");
                String str4 = (String) Oc.A.c().a(C8784lf.f77013U6);
                if (((Boolean) Oc.A.c().a(C8784lf.f76999T6)).booleanValue()) {
                    List listF = C7325Tf0.c(f78851l).f(string);
                    if (listF.size() < 2) {
                        qVarH = Mj0.g(new zzegu(1, "Invalid fetch URL."));
                    } else {
                        str3 = (String) listF.get(1);
                        Nc.v.t();
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        final C9727uR c9727uR = new C9727uR(string, 60000, new HashMap(), str3.getBytes(StandardCharsets.UTF_8), str4, false);
                        qVarH = (Cj0) Mj0.f((Cj0) Mj0.o(Cj0.D(C7033Kq.f69014a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.pQ
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.f78420a.c(c9727uR);
                            }
                        })), ((Integer) Oc.A.c().a(C8784lf.f77027V6)).intValue(), TimeUnit.MILLISECONDS, this.f78857f), Exception.class, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.qQ
                            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                            public final com.google.common.util.concurrent.q zza(Object obj) {
                                zzegu zzeguVar;
                                Exception exc = (Exception) obj;
                                Nc.v.s().w(exc, "PreloadedLoader.getTypeTwoAdResponseString");
                                if (exc instanceof TimeoutException) {
                                    zzeguVar = new zzegu(1, "Timed out waiting for ad response.");
                                } else if (exc instanceof zzegu) {
                                    zzeguVar = (zzegu) exc;
                                } else {
                                    zzeguVar = new zzegu(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                                }
                                return Mj0.g(zzeguVar);
                            }
                        }, this.f78856e);
                    }
                } else {
                    final C9727uR c9727uR2 = new C9727uR(string, 60000, new HashMap(), str3.getBytes(StandardCharsets.UTF_8), str4, false);
                    qVarH = (Cj0) Mj0.f((Cj0) Mj0.o(Cj0.D(C7033Kq.f69014a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.pQ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.f78420a.c(c9727uR2);
                        }
                    })), ((Integer) Oc.A.c().a(C8784lf.f77027V6)).intValue(), TimeUnit.MILLISECONDS, this.f78857f), Exception.class, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.qQ
                        @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
                        public final com.google.common.util.concurrent.q zza(Object obj) {
                            zzegu zzeguVar;
                            Exception exc = (Exception) obj;
                            Nc.v.s().w(exc, "PreloadedLoader.getTypeTwoAdResponseString");
                            if (exc instanceof TimeoutException) {
                                zzeguVar = new zzegu(1, "Timed out waiting for ad response.");
                            } else if (exc instanceof zzegu) {
                                zzeguVar = (zzegu) exc;
                            } else {
                                zzeguVar = new zzegu(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                            }
                            return Mj0.g(zzeguVar);
                        }
                    }, this.f78856e);
                }
            }
        } else {
            qVarH = Mj0.h(str);
            this.f78860i.c("sst", "1");
        }
        com.google.common.util.concurrent.q qVarN = Mj0.n(Mj0.n(Mj0.n(qVarH, new InterfaceC9541sj0(this) { // from class: com.google.android.gms.internal.ads.mQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
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
        }, this.f78856e), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.nQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return interfaceC7298SkA.zzb((JSONObject) obj);
            }
        }, this.f78856e), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.oQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f78206a.b((JSONObject) obj);
            }
        }, this.f78856e);
        V80.a(qVarN, this.f78859h, k80A);
        return qVarN;
    }

    private final String e(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && com.google.ads.interactivemedia.v3.impl.data.zzbz.UNKNOWN_CONTENT_TYPE.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f78858g));
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            Sc.p.g("Failed to update the ad types for rendering. ".concat(e10.toString()));
            return str;
        }
    }

    private final void f(EnumC8014eN enumC8014eN) {
        Bundle bundleA = this.f78860i.a();
        if (((Boolean) Oc.A.c().a(C8784lf.f77055X6)).booleanValue()) {
            bundleA.putLong(enumC8014eN.a(), Nc.v.c().a());
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9405rQ.a():com.google.common.util.concurrent.q");
    }

    final /* synthetic */ com.google.common.util.concurrent.q b(JSONObject jSONObject) throws Exception {
        return Mj0.h(new C8733l60(new C8307h60(this.f78855d), C8519j60.a(new StringReader(jSONObject.toString()), null)));
    }

    final /* synthetic */ String c(C9727uR c9727uR) throws Exception {
        f(EnumC8014eN.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i10 = 0;
        int i11 = -1;
        while (true) {
            try {
                if (i10 >= ((Integer) Oc.A.c().a(C8784lf.f77041W6)).intValue()) {
                    throw new zzegu(1, "Received HTTP error code from ad server: " + i11);
                }
                C9834vR c9834vRA = new C9941wR(this.f78853b, this.f78854c.f34479a, this.f78862k, Binder.getCallingUid()).zza(c9727uR);
                int i12 = c9834vRA.f79895a;
                if (((Boolean) Oc.A.c().a(C8784lf.f77055X6)).booleanValue()) {
                    this.f78860i.c("fr", String.valueOf(i10));
                }
                if (i12 == 200) {
                    f(EnumC8014eN.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return c9834vRA.f79897c;
                }
                i10++;
                i11 = i12;
            } catch (Exception e10) {
                throw new zzegu(1, e10.getMessage() == null ? "Fetch failed." : e10.getMessage(), e10);
            }
        }
    }

    C9405rQ(AbstractC9135ou abstractC9135ou, Context context, Sc.a aVar, C9695u60 c9695u60, Executor executor, String str, W80 w80, C9296qN c9296qN, C6827Eo c6827Eo, C10048xR c10048xR, ScheduledExecutorService scheduledExecutorService) {
        this.f78852a = abstractC9135ou;
        this.f78853b = context;
        this.f78854c = aVar;
        this.f78855d = c9695u60;
        this.f78856e = executor;
        this.f78858g = str;
        this.f78859h = w80;
        abstractC9135ou.D();
        this.f78860i = c9296qN;
        this.f78862k = c6827Eo;
        this.f78857f = scheduledExecutorService;
    }
}
