package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class SharedPreferencesEditorC10543h0 implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    boolean f83036a;

    /* renamed from: b, reason: collision with root package name */
    final Set f83037b;

    /* renamed from: c, reason: collision with root package name */
    final Map f83038c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ SharedPreferencesC10552i0 f83039d;

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f83036a = true;
        return this;
    }

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f83038c.put(str, obj);
        } else {
            remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f83036a) {
            this.f83039d.a().clear();
        }
        SharedPreferencesC10552i0 sharedPreferencesC10552i0 = this.f83039d;
        Set set = this.f83037b;
        sharedPreferencesC10552i0.a().keySet().removeAll(set);
        Map map = this.f83038c;
        for (Map.Entry entry : map.entrySet()) {
            sharedPreferencesC10552i0.a().put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : sharedPreferencesC10552i0.b()) {
            Ee.y0 it = Ee.s0.k(set, map.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC10552i0, (String) it.next());
            }
        }
        return (!this.f83036a && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f83037b.add(str);
        return this;
    }

    /* synthetic */ SharedPreferencesEditorC10543h0(SharedPreferencesC10552i0 sharedPreferencesC10552i0, byte[] bArr) {
        Objects.requireNonNull(sharedPreferencesC10552i0);
        this.f83039d = sharedPreferencesC10552i0;
        this.f83036a = false;
        this.f83037b = new HashSet();
        this.f83038c = new HashMap();
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
