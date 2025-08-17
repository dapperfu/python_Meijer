package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class SharedPreferencesEditorC10418h0 implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    boolean f82196a;

    /* renamed from: b, reason: collision with root package name */
    final Set f82197b;

    /* renamed from: c, reason: collision with root package name */
    final Map f82198c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ SharedPreferencesC10427i0 f82199d;

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f82196a = true;
        return this;
    }

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f82198c.put(str, obj);
        } else {
            remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f82196a) {
            this.f82199d.a().clear();
        }
        SharedPreferencesC10427i0 sharedPreferencesC10427i0 = this.f82199d;
        Set set = this.f82197b;
        sharedPreferencesC10427i0.a().keySet().removeAll(set);
        Map map = this.f82198c;
        for (Map.Entry entry : map.entrySet()) {
            sharedPreferencesC10427i0.a().put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : sharedPreferencesC10427i0.b()) {
            Ce.y0 it = Ce.s0.k(set, map.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC10427i0, (String) it.next());
            }
        }
        return (!this.f82196a && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f82197b.add(str);
        return this;
    }

    /* synthetic */ SharedPreferencesEditorC10418h0(SharedPreferencesC10427i0 sharedPreferencesC10427i0, byte[] bArr) {
        Objects.requireNonNull(sharedPreferencesC10427i0);
        this.f82199d = sharedPreferencesC10427i0;
        this.f82196a = false;
        this.f82197b = new HashSet();
        this.f82198c = new HashMap();
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }
}
