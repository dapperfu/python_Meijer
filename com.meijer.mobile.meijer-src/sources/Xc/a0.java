package Xc;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f41926a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences.Editor f41927b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f41928c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f41929d = new Object();

    private final void k() {
        synchronized (this.f41929d) {
            try {
                if (this.f41926a != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f41928c.getSharedPreferences("query_info_shared_prefs", 0);
                this.f41926a = sharedPreferences;
                this.f41927b = sharedPreferences.edit();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    a0(Context context) {
        this.f41928c = context;
    }

    public final int a() {
        int i10;
        k();
        synchronized (this.f41929d) {
            i10 = this.f41926a.getInt("aav", -1);
        }
        return i10;
    }

    public final int b() {
        int i10;
        k();
        synchronized (this.f41929d) {
            i10 = this.f41926a.getInt("vc", -1);
        }
        return i10;
    }

    public final String c(String str) {
        String string;
        k();
        synchronized (this.f41929d) {
            string = this.f41926a.getString(str, null);
            this.f41927b.remove(str).commit();
        }
        return string;
    }

    public final String d() {
        String string;
        k();
        synchronized (this.f41929d) {
            string = this.f41926a.getString("dm", null);
        }
        return string;
    }

    public final String e() {
        String string;
        k();
        synchronized (this.f41929d) {
            string = this.f41926a.getString("pn", null);
        }
        return string;
    }

    public final Map f() {
        HashMap map;
        k();
        synchronized (this.f41929d) {
            try {
                Map<String, ?> all = this.f41926a.getAll();
                map = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    public final void g() {
        k();
        synchronized (this.f41929d) {
            this.f41927b.clear().commit();
        }
    }

    public final void h(String str, String str2) {
        k();
        synchronized (this.f41929d) {
            this.f41927b.putString(str, str2).commit();
        }
    }

    public final void i(String str, int i10, String str2, int i11) {
        k();
        synchronized (this.f41929d) {
            this.f41927b.putString("pn", str).putInt("vc", i10).putString("dm", str2).putInt("aav", i11).commit();
        }
    }

    public final boolean j(String str) {
        boolean zContains;
        k();
        synchronized (this.f41929d) {
            zContains = this.f41926a.contains(str);
        }
        return zContains;
    }
}
