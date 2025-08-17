package Qc;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final x f29977a;

    public static v a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new v(jSONObjectOptJSONObject == null ? new o(1, 0, 1.0d, false) : new o(jSONObjectOptJSONObject.optInt("max_attempts", 1), jSONObjectOptJSONObject.optInt("initial_backoff_ms", 0), jSONObjectOptJSONObject.optDouble("backoff_multiplier", 1.0d), jSONObjectOptJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    public final x b() {
        return this.f29977a;
    }

    private v(x xVar) {
        this.f29977a = xVar;
    }
}
