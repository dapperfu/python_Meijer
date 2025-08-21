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
final class C7740bq {

    /* renamed from: a, reason: collision with root package name */
    private final Map f73715a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List f73716b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Context f73717c;

    /* renamed from: d, reason: collision with root package name */
    private final C7099Mp f73718d;

    final synchronized void c(String str) {
        try {
            if (this.f73715a.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f73717c) : this.f73717c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC7633aq sharedPreferencesOnSharedPreferenceChangeListenerC7633aq = new SharedPreferencesOnSharedPreferenceChangeListenerC7633aq(this, str);
            this.f73715a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC7633aq);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC7633aq);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized void d(C7535Zp c7535Zp) {
        this.f73716b.add(c7535Zp);
    }

    C7740bq(Context context, C7099Mp c7099Mp) {
        this.f73717c = context;
        this.f73718d = c7099Mp;
    }

    final /* synthetic */ void b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f73718d.d();
        }
    }
}
