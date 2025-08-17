package io.constructor.data.local;

import Bu.d;
import android.content.SharedPreferences;
import kv.InterfaceC15323a;

/* loaded from: classes6.dex */
public final class PreferencesHelper_Factory implements d {
    private final InterfaceC15323a<SharedPreferences> preferencesProvider;

    public static PreferencesHelper_Factory create(InterfaceC15323a<SharedPreferences> interfaceC15323a) {
        return new PreferencesHelper_Factory(interfaceC15323a);
    }

    public static PreferencesHelper newInstance(SharedPreferences sharedPreferences) {
        return new PreferencesHelper(sharedPreferences);
    }

    @Override // kv.InterfaceC15323a
    public PreferencesHelper get() {
        return newInstance(this.preferencesProvider.get());
    }

    public PreferencesHelper_Factory(InterfaceC15323a<SharedPreferences> interfaceC15323a) {
        this.preferencesProvider = interfaceC15323a;
    }
}
