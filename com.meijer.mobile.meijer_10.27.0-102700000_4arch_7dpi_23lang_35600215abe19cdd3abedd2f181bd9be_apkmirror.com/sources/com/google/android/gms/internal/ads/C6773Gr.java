package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Gr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6773Gr {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f67277a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67278b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67279c;

    /* renamed from: d, reason: collision with root package name */
    public final int f67280d;

    /* renamed from: e, reason: collision with root package name */
    public final int f67281e;

    /* renamed from: f, reason: collision with root package name */
    public final int f67282f;

    /* renamed from: g, reason: collision with root package name */
    public final int f67283g;

    /* renamed from: h, reason: collision with root package name */
    public final int f67284h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f67285i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f67286j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f67287k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f67288l;

    /* renamed from: m, reason: collision with root package name */
    public final long f67289m;

    /* renamed from: n, reason: collision with root package name */
    public final long f67290n;

    private static final int b(JSONObject jSONObject, String str, AbstractC7593bf abstractC7593bf) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) Mc.A.c().a(abstractC7593bf)).intValue();
    }

    private static final long c(JSONObject jSONObject, String str, AbstractC7593bf abstractC7593bf) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) Mc.A.c().a(abstractC7593bf)).longValue();
    }

    public C6773Gr(String str) throws JSONException {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f67277a = a(jSONObject, "aggressive_media_codec_release", C8659lf.f76180V);
        this.f67278b = b(jSONObject, "byte_buffer_precache_limit", C8659lf.f76361i);
        this.f67279c = b(jSONObject, "exo_cache_buffer_size", C8659lf.f76501s);
        this.f67280d = b(jSONObject, "exo_connect_timeout_millis", C8659lf.f76305e);
        AbstractC7593bf abstractC7593bf = C8659lf.f76291d;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.f67281e = b(jSONObject, "exo_read_timeout_millis", C8659lf.f76319f);
        this.f67282f = b(jSONObject, "load_check_interval_bytes", C8659lf.f76333g);
        this.f67283g = b(jSONObject, "player_precache_limit", C8659lf.f76347h);
        this.f67284h = b(jSONObject, "socket_receive_buffer_size", C8659lf.f76375j);
        this.f67285i = a(jSONObject, "use_cache_data_source", C8659lf.f76464p4);
        b(jSONObject, "min_retry_count", C8659lf.f76389k);
        this.f67286j = a(jSONObject, "treat_load_exception_as_non_fatal", C8659lf.f76417m);
        this.f67287k = a(jSONObject, "enable_multiple_video_playback", C8659lf.f76238Z1);
        this.f67288l = a(jSONObject, "use_range_http_data_source", C8659lf.f76266b2);
        this.f67289m = c(jSONObject, "range_http_data_source_high_water_mark", C8659lf.f76280c2);
        this.f67290n = c(jSONObject, "range_http_data_source_low_water_mark", C8659lf.f76294d2);
    }

    private static final boolean a(JSONObject jSONObject, String str, AbstractC7593bf abstractC7593bf) {
        boolean zBooleanValue = ((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }
}
