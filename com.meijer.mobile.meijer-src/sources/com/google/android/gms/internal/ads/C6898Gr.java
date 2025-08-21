package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Gr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6898Gr {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f68117a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68118b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68119c;

    /* renamed from: d, reason: collision with root package name */
    public final int f68120d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68121e;

    /* renamed from: f, reason: collision with root package name */
    public final int f68122f;

    /* renamed from: g, reason: collision with root package name */
    public final int f68123g;

    /* renamed from: h, reason: collision with root package name */
    public final int f68124h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f68125i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f68126j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f68127k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f68128l;

    /* renamed from: m, reason: collision with root package name */
    public final long f68129m;

    /* renamed from: n, reason: collision with root package name */
    public final long f68130n;

    private static final int b(JSONObject jSONObject, String str, AbstractC7718bf abstractC7718bf) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) Oc.A.c().a(abstractC7718bf)).intValue();
    }

    private static final long c(JSONObject jSONObject, String str, AbstractC7718bf abstractC7718bf) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) Oc.A.c().a(abstractC7718bf)).longValue();
    }

    public C6898Gr(String str) throws JSONException {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f68117a = a(jSONObject, "aggressive_media_codec_release", C8784lf.f77020V);
        this.f68118b = b(jSONObject, "byte_buffer_precache_limit", C8784lf.f77201i);
        this.f68119c = b(jSONObject, "exo_cache_buffer_size", C8784lf.f77341s);
        this.f68120d = b(jSONObject, "exo_connect_timeout_millis", C8784lf.f77145e);
        AbstractC7718bf abstractC7718bf = C8784lf.f77131d;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.f68121e = b(jSONObject, "exo_read_timeout_millis", C8784lf.f77159f);
        this.f68122f = b(jSONObject, "load_check_interval_bytes", C8784lf.f77173g);
        this.f68123g = b(jSONObject, "player_precache_limit", C8784lf.f77187h);
        this.f68124h = b(jSONObject, "socket_receive_buffer_size", C8784lf.f77215j);
        this.f68125i = a(jSONObject, "use_cache_data_source", C8784lf.f77304p4);
        b(jSONObject, "min_retry_count", C8784lf.f77229k);
        this.f68126j = a(jSONObject, "treat_load_exception_as_non_fatal", C8784lf.f77257m);
        this.f68127k = a(jSONObject, "enable_multiple_video_playback", C8784lf.f77078Z1);
        this.f68128l = a(jSONObject, "use_range_http_data_source", C8784lf.f77106b2);
        this.f68129m = c(jSONObject, "range_http_data_source_high_water_mark", C8784lf.f77120c2);
        this.f68130n = c(jSONObject, "range_http_data_source_low_water_mark", C8784lf.f77134d2);
    }

    private static final boolean a(JSONObject jSONObject, String str, AbstractC7718bf abstractC7718bf) {
        boolean zBooleanValue = ((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }
}
