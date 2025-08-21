package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC8337hP implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f75557a = new JSONObject();

    /* renamed from: b, reason: collision with root package name */
    private List f75558b;

    public final JSONObject a() throws JSONException {
        return this.f75557a;
    }

    final void b(SharedPreferences sharedPreferences, List list) throws JSONException {
        this.f75558b = list;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            onSharedPreferenceChanged(sharedPreferences, (String) it.next());
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) throws JSONException {
        if (str != null && this.f75558b.contains(str)) {
            try {
                Object obj = sharedPreferences.getAll().get(str);
                if (obj == null) {
                    this.f75557a.remove(str);
                } else {
                    this.f75557a.put(str, obj);
                }
            } catch (JSONException e10) {
                Nc.v.s().w(e10, "InspectorSharedPreferenceCollector.onSharedPreferenceChanged");
            }
        }
    }

    SharedPreferencesOnSharedPreferenceChangeListenerC8337hP() {
    }
}
