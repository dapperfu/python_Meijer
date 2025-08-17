package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.bq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7615bq {

    /* renamed from: a, reason: collision with root package name */
    private final Map f72875a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f72876b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f72877c;

    /* renamed from: d, reason: collision with root package name */
    private final C6974Mp f72878d;

    final synchronized void c(String str) {
        try {
            if (this.f72875a.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f72877c) : this.f72877c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC7508aq sharedPreferencesOnSharedPreferenceChangeListenerC7508aq = new SharedPreferencesOnSharedPreferenceChangeListenerC7508aq(this, str);
            this.f72875a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC7508aq);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC7508aq);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void d(C7410Zp c7410Zp) {
        this.f72876b.add(c7410Zp);
    }

    C7615bq(Context context, C6974Mp c6974Mp) {
        this.f72877c = context;
        this.f72878d = c6974Mp;
    }

    final /* synthetic */ void b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f72878d.d();
        }
    }
}
