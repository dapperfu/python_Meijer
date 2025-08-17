package wf;

import of.E;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final E f166092a;

    private static i a(int i10) {
        if (i10 == 3) {
            return new m();
        }
        lf.g.f().d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new C17816b();
    }

    public C17818d b(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt("settings_version")).a(this.f166092a, jSONObject);
    }

    h(E e10) {
        this.f166092a = e10;
    }
}
