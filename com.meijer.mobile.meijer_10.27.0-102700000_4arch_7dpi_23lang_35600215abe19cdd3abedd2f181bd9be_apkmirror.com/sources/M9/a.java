package M9;

import G9.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f19068a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f19069b = new ArrayList();

    public static a a(JSONObject jSONObject) {
        b.c(jSONObject, "JsonObject must not be null!");
        return new a(jSONObject);
    }

    public a b(String str) {
        b.c(str, "FieldName must not be null!");
        if (!this.f19068a.has(str)) {
            this.f19069b.add(String.format("Missing field: '%s'", str));
        }
        return this;
    }

    public a c(String str, Class cls) throws JSONException {
        b.c(str, "FieldName must not be null!");
        b.c(cls, "FieldType must not be null!");
        if (!this.f19068a.has(str)) {
            this.f19069b.add(String.format("Missing field: '%s' with type: %s", str, cls));
            return this;
        }
        try {
            Object obj = this.f19068a.get(str);
            if (cls != obj.getClass()) {
                this.f19069b.add(String.format("Type mismatch for key: '%s', expected type: %s, but was: %s", str, cls, obj.getClass()));
            }
        } catch (JSONException unused) {
        }
        return this;
    }

    public List<String> d() {
        return this.f19069b;
    }

    private a(JSONObject jSONObject) {
        this.f19068a = jSONObject;
    }
}
