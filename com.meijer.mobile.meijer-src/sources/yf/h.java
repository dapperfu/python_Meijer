package yf;

import org.json.JSONException;
import org.json.JSONObject;
import qf.E;

/* loaded from: classes8.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final E f171414a;

    private static i a(int i10) {
        if (i10 == 3) {
            return new m();
        }
        nf.g.f().d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
        return new C18309b();
    }

    public C18311d b(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt("settings_version")).a(this.f171414a, jSONObject);
    }

    h(E e10) {
        this.f171414a = e10;
    }
}
