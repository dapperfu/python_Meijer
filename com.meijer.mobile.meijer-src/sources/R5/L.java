package R5;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"CommitPrefEdits"})
/* loaded from: classes4.dex */
class L implements v {

    /* renamed from: c, reason: collision with root package name */
    private static final String f31910c = "L";

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f31911a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences.Editor f31912b;

    private void h() {
        if (this.f31912b.commit()) {
            return;
        }
        t.b("Services", f31910c, "Android SharedPreference unable to commit the persisted data", new Object[0]);
    }

    @Override // R5.v
    public Map<String, String> a(String str) {
        String string = this.f31911a.getString(str, null);
        HashMap map = new HashMap();
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    map.put(next, jSONObject.getString(next));
                } catch (JSONException e10) {
                    t.b("Services", f31910c, String.format("Unable to convert jsonObject key %s into map, %s", next, e10.getLocalizedMessage()), new Object[0]);
                }
            }
            return map;
        } catch (Exception e11) {
            t.b("Services", f31910c, String.format("Failed to convert [%s] to String Map, %s", string, e11.getLocalizedMessage()), new Object[0]);
            return null;
        }
    }

    @Override // R5.v
    public void b(String str, long j10) {
        this.f31912b.putLong(str, j10);
        h();
    }

    @Override // R5.v
    public void c(String str, int i10) {
        SharedPreferences.Editor editor = this.f31912b;
        if (editor == null) {
            return;
        }
        editor.putInt(str, i10);
        h();
    }

    @Override // R5.v
    public boolean contains(String str) {
        return this.f31911a.contains(str);
    }

    @Override // R5.v
    public void d(String str, String str2) {
        this.f31912b.putString(str, str2);
        h();
    }

    @Override // R5.v
    public void e(String str, Map<String, String> map) {
        try {
            this.f31912b.putString(str, new JSONObject(map).toString());
            h();
        } catch (NullPointerException unused) {
            t.b("Services", f31910c, "Map contains null key.", new Object[0]);
        }
    }

    @Override // R5.v
    public void f(String str, boolean z10) {
        this.f31912b.putBoolean(str, z10);
        h();
    }

    @Override // R5.v
    public void g() {
        this.f31912b.clear();
        h();
    }

    @Override // R5.v
    public boolean getBoolean(String str, boolean z10) {
        return this.f31911a.getBoolean(str, z10);
    }

    @Override // R5.v
    public int getInt(String str, int i10) {
        return this.f31911a.getInt(str, i10);
    }

    @Override // R5.v
    public long getLong(String str, long j10) {
        return this.f31911a.getLong(str, j10);
    }

    @Override // R5.v
    public String getString(String str, String str2) {
        return this.f31911a.getString(str, str2);
    }

    @Override // R5.v
    public void remove(String str) {
        this.f31912b.remove(str);
        h();
    }

    L(SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        this.f31911a = sharedPreferences;
        this.f31912b = editor;
    }
}
