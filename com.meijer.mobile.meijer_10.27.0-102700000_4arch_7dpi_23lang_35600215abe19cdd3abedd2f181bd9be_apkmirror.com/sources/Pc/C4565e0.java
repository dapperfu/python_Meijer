package Pc;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.C8659lf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: Pc.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4565e0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f25136a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f25137b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f25138c;

    final synchronized void b(String str) {
        try {
            if (this.f25136a.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f25138c) : this.f25138c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC4563d0 sharedPreferencesOnSharedPreferenceChangeListenerC4563d0 = new SharedPreferencesOnSharedPreferenceChangeListenerC4563d0(this, str);
            this.f25136a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC4563d0);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC4563d0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void d(C4559b0 c4559b0) {
        this.f25137b.add(c4559b0);
    }

    public final void c() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76442na)).booleanValue()) {
            Lc.v.t();
            Map mapB0 = D0.b0((String) Mc.A.c().a(C8659lf.f76512sa));
            Iterator it = mapB0.keySet().iterator();
            while (it.hasNext()) {
                b((String) it.next());
            }
            d(new C4559b0(mapB0));
        }
    }

    C4565e0(Context context) {
        this.f25138c = context;
    }
}
