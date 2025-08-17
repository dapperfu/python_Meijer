package Pc;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* renamed from: Pc.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class SharedPreferencesOnSharedPreferenceChangeListenerC4563d0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f25134a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4565e0 f25135b;

    public SharedPreferencesOnSharedPreferenceChangeListenerC4563d0(C4565e0 c4565e0, String str) {
        this.f25135b = c4565e0;
        this.f25134a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f25135b) {
            try {
                for (C4559b0 c4559b0 : this.f25135b.f25137b) {
                    String str2 = this.f25134a;
                    Map map = c4559b0.f25130a;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        Lc.v.s().j().y(false);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
