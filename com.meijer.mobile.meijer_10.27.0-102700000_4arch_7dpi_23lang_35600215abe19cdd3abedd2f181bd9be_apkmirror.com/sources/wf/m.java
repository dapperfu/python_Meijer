package wf;

import of.E;
import org.json.JSONException;
import org.json.JSONObject;
import wf.C17818d;

/* loaded from: classes7.dex */
class m implements i {
    private static C17818d.a b(JSONObject jSONObject) {
        return new C17818d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static C17818d.b c(JSONObject jSONObject) {
        return new C17818d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long d(E e10, long j10, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : e10.a() + (j10 * 1000);
    }

    @Override // wf.i
    public C17818d a(E e10, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C17818d(d(e10, iOptInt2, jSONObject), jSONObject.has("session") ? c(jSONObject.getJSONObject("session")) : c(new JSONObject()), b(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }

    m() {
    }
}
