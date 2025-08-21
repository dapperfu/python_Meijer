package Sc;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class w {
    public abstract int a();

    public abstract int b();

    public abstract boolean c();

    public static w d(JSONObject jSONObject) {
        return new n(jSONObject.optInt("impression_prerequisite", 0), jSONObject.optInt("click_prerequisite", 0), jSONObject.optBoolean("notification_flow_enabled", false));
    }
}
