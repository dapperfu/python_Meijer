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
public final class C7773c60 {

    /* renamed from: a, reason: collision with root package name */
    public final List f73942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73943b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73944c;

    /* renamed from: d, reason: collision with root package name */
    public final int f73945d;

    /* renamed from: e, reason: collision with root package name */
    public final String f73946e;

    /* renamed from: f, reason: collision with root package name */
    public final int f73947f;

    /* renamed from: g, reason: collision with root package name */
    public final long f73948g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f73949h;

    /* renamed from: i, reason: collision with root package name */
    public final String f73950i;

    /* renamed from: j, reason: collision with root package name */
    public final C7667b60 f73951j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f73952k;

    /* renamed from: l, reason: collision with root package name */
    public final String f73953l;

    /* renamed from: m, reason: collision with root package name */
    public final String f73954m;

    /* renamed from: n, reason: collision with root package name */
    public final String f73955n;

    /* renamed from: o, reason: collision with root package name */
    public final JSONObject f73956o;

    /* renamed from: p, reason: collision with root package name */
    public final JSONObject f73957p;

    /* renamed from: q, reason: collision with root package name */
    public final String f73958q;

    /* renamed from: r, reason: collision with root package name */
    public final int f73959r;

    /* renamed from: s, reason: collision with root package name */
    public long f73960s;

    /* renamed from: t, reason: collision with root package name */
    public long f73961t;

    private static final long a(double d10) {
        if (d10 > 9.223372036854776E18d || d10 < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d10;
    }

    C7773c60(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
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
        C7667b60 c7667b60 = null;
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
                listD = Rc.U.d(jsonReader);
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
                if (((Boolean) Oc.A.c().a(C8784lf.f77196h8)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    c7667b60 = new C7667b60(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString7 = jsonReader.nextString();
                } else {
                    if (((Boolean) Oc.A.c().a(C8784lf.f77282na)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString3 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(strNextName)) {
                        if (((Boolean) Oc.A.c().a(C8784lf.f76789E6)).booleanValue()) {
                            try {
                                try {
                                    Bundle bundleA = Rc.U.a(Rc.U.i(jsonReader));
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
                        if (((Boolean) Oc.A.c().a(C8784lf.f77197h9)).booleanValue()) {
                            strNextString5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(strNextName)) {
                        if (((Boolean) Oc.A.c().a(C8784lf.f77197h9)).booleanValue()) {
                            strNextString4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        AbstractC7718bf abstractC7718bf = C8784lf.f77211i9;
                        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                            strNextString2 = jsonReader.nextString();
                        } else if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                            jSONObject = Rc.U.i(jsonReader);
                        } else if (Objects.equals(strNextName, "max_parallel_renderers")) {
                            iMax = Math.max(1, jsonReader.nextInt());
                        } else {
                            if (((Boolean) Oc.A.c().a(C8784lf.f77309p9)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = Rc.U.i(jsonReader);
                            } else {
                                if (((Boolean) Oc.A.c().a(C8784lf.f77246l2)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                    try {
                                        Bundle bundleA2 = Rc.U.a(Rc.U.i(jsonReader));
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
        this.f73942a = listD;
        this.f73944c = iNextInt;
        if (((Boolean) C9534sg.f79124c.e()).booleanValue()) {
            this.f73945d = -1;
        } else {
            C7391Vf c7391Vf = C7523Zf.f73059a;
            if (((Long) c7391Vf.e()).longValue() > -1) {
                this.f73945d = ((Long) c7391Vf.e()).intValue();
            } else {
                this.f73945d = iNextInt3;
            }
        }
        this.f73943b = strNextString;
        this.f73946e = strNextString6;
        this.f73947f = iNextInt2;
        this.f73948g = jNextLong;
        this.f73951j = c7667b60;
        this.f73949h = zNextBoolean;
        this.f73950i = strNextString7;
        this.f73952k = bundle;
        this.f73953l = strNextString4;
        this.f73954m = strNextString5;
        this.f73955n = strNextString2;
        this.f73956o = jSONObject;
        this.f73957p = jSONObject2;
        this.f73958q = str2;
        C7391Vf c7391Vf2 = C9321qg.f78667a;
        this.f73959r = ((Long) c7391Vf2.e()).longValue() > 0 ? ((Long) c7391Vf2.e()).intValue() : iMax;
        this.f73960s = jA2;
        this.f73961t = jA;
    }
}
