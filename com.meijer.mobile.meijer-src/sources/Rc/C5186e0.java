package Rc;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.C8784lf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: Rc.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5186e0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f32350a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f32351b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f32352c;

    final synchronized void b(String str) {
        try {
            if (this.f32350a.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f32352c) : this.f32352c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC5184d0 sharedPreferencesOnSharedPreferenceChangeListenerC5184d0 = new SharedPreferencesOnSharedPreferenceChangeListenerC5184d0(this, str);
            this.f32350a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC5184d0);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC5184d0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void d(C5180b0 c5180b0) {
        this.f32351b.add(c5180b0);
    }

    public final void c() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77282na)).booleanValue()) {
            Nc.v.t();
            Map mapB0 = D0.b0((String) Oc.A.c().a(C8784lf.f77352sa));
            Iterator it = mapB0.keySet().iterator();
            while (it.hasNext()) {
                b((String) it.next());
            }
            d(new C5180b0(mapB0));
        }
    }

    C5186e0(Context context) {
        this.f32352c = context;
    }
}
