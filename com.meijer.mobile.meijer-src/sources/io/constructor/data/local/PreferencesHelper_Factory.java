package io.constructor.data.local;

import android.content.SharedPreferences;
import gv.InterfaceC14411a;
import xu.InterfaceC18226d;

/* loaded from: classes6.dex */
public final class PreferencesHelper_Factory implements InterfaceC18226d {
    private final InterfaceC14411a<SharedPreferences> preferencesProvider;

    public static PreferencesHelper_Factory create(InterfaceC14411a<SharedPreferences> interfaceC14411a) {
        return new PreferencesHelper_Factory(interfaceC14411a);
    }

    public static PreferencesHelper newInstance(SharedPreferences sharedPreferences) {
        return new PreferencesHelper(sharedPreferences);
    }

    @Override // gv.InterfaceC14411a
    public PreferencesHelper get() {
        return newInstance(this.preferencesProvider.get());
    }

    public PreferencesHelper_Factory(InterfaceC14411a<SharedPreferences> interfaceC14411a) {
        this.preferencesProvider = interfaceC14411a;
    }
}
