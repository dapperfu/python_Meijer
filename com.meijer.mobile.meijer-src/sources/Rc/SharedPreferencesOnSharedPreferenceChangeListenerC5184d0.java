package Rc;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* renamed from: Rc.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class SharedPreferencesOnSharedPreferenceChangeListenerC5184d0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f32348a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5186e0 f32349b;

    public SharedPreferencesOnSharedPreferenceChangeListenerC5184d0(C5186e0 c5186e0, String str) {
        this.f32349b = c5186e0;
        this.f32348a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f32349b) {
            try {
                for (C5180b0 c5180b0 : this.f32349b.f32351b) {
                    String str2 = this.f32348a;
                    Map map = c5180b0.f32344a;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        Nc.v.s().j().y(false);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
