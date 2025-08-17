package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.c60, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7648c60 {

    /* renamed from: a, reason: collision with root package name */
    public final List f73102a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73103b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73104c;

    /* renamed from: d, reason: collision with root package name */
    public final int f73105d;

    /* renamed from: e, reason: collision with root package name */
    public final String f73106e;

    /* renamed from: f, reason: collision with root package name */
    public final int f73107f;

    /* renamed from: g, reason: collision with root package name */
    public final long f73108g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f73109h;

    /* renamed from: i, reason: collision with root package name */
    public final String f73110i;

    /* renamed from: j, reason: collision with root package name */
    public final C7542b60 f73111j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f73112k;

    /* renamed from: l, reason: collision with root package name */
    public final String f73113l;

    /* renamed from: m, reason: collision with root package name */
    public final String f73114m;

    /* renamed from: n, reason: collision with root package name */
    public final String f73115n;

    /* renamed from: o, reason: collision with root package name */
    public final JSONObject f73116o;

    /* renamed from: p, reason: collision with root package name */
    public final JSONObject f73117p;

    /* renamed from: q, reason: collision with root package name */
    public final String f73118q;

    /* renamed from: r, reason: collision with root package name */
    public final int f73119r;

    /* renamed from: s, reason: collision with root package name */
    public long f73120s;

    /* renamed from: t, reason: collision with root package name */
    public long f73121t;

    private static final long a(double d10) {
        if (d10 > 9.223372036854776E18d || d10 < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d10;
    }

    C7648c60(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List listD = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String strNextString = "";
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        int iNextInt = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        C7542b60 c7542b60 = null;
        long jA = -1;
        long jA2 = -1;
        long jNextLong = 0;
        int iNextInt3 = -1;
        int iMax = 1;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listD = Pc.U.d(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt3 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString6 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                String str = strNextString3;
                if (((Boolean) Mc.A.c().a(C8659lf.f76356h8)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    c7542b60 = new C7542b60(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString7 = jsonReader.nextString();
                } else {
                    if (((Boolean) Mc.A.c().a(C8659lf.f76442na)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString3 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(strNextName)) {
                        if (((Boolean) Mc.A.c().a(C8659lf.f75949E6)).booleanValue()) {
                            try {
                                try {
                                    Bundle bundleA = Pc.U.a(Pc.U.i(jsonReader));
                                    if (bundleA != null) {
                                        bundle = bundleA;
                                    }
                                } catch (IOException | JSONException unused) {
                                }
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(strNextName)) {
                        if (((Boolean) Mc.A.c().a(C8659lf.f76357h9)).booleanValue()) {
                            strNextString5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(strNextName)) {
                        if (((Boolean) Mc.A.c().a(C8659lf.f76357h9)).booleanValue()) {
                            strNextString4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        AbstractC7593bf abstractC7593bf = C8659lf.f76371i9;
                        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                            strNextString2 = jsonReader.nextString();
                        } else if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                            jSONObject = Pc.U.i(jsonReader);
                        } else if (Objects.equals(strNextName, "max_parallel_renderers")) {
                            iMax = Math.max(1, jsonReader.nextInt());
                        } else {
                            if (((Boolean) Mc.A.c().a(C8659lf.f76469p9)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = Pc.U.i(jsonReader);
                            } else {
                                if (((Boolean) Mc.A.c().a(C8659lf.f76406l2)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                    try {
                                        Bundle bundleA2 = Pc.U.a(Pc.U.i(jsonReader));
                                        if (bundleA2 != null) {
                                            jA2 = a(bundleA2.getDouble("start_time"));
                                            jA = a(bundleA2.getDouble("end_time"));
                                        }
                                    } catch (IllegalStateException unused3) {
                                        jsonReader.skipValue();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                        }
                    }
                }
                strNextString3 = str;
            }
        }
        String str2 = strNextString3;
        jsonReader.endObject();
        this.f73102a = listD;
        this.f73104c = iNextInt;
        if (((Boolean) C9409sg.f78284c.e()).booleanValue()) {
            this.f73105d = -1;
        } else {
            C7266Vf c7266Vf = C7398Zf.f72219a;
            if (((Long) c7266Vf.e()).longValue() > -1) {
                this.f73105d = ((Long) c7266Vf.e()).intValue();
            } else {
                this.f73105d = iNextInt3;
            }
        }
        this.f73103b = strNextString;
        this.f73106e = strNextString6;
        this.f73107f = iNextInt2;
        this.f73108g = jNextLong;
        this.f73111j = c7542b60;
        this.f73109h = zNextBoolean;
        this.f73110i = strNextString7;
        this.f73112k = bundle;
        this.f73113l = strNextString4;
        this.f73114m = strNextString5;
        this.f73115n = strNextString2;
        this.f73116o = jSONObject;
        this.f73117p = jSONObject2;
        this.f73118q = str2;
        C7266Vf c7266Vf2 = C9196qg.f77827a;
        this.f73119r = ((Long) c7266Vf2.e()).longValue() > 0 ? ((Long) c7266Vf2.e()).intValue() : iMax;
        this.f73120s = jA2;
        this.f73121t = jA;
    }
}
