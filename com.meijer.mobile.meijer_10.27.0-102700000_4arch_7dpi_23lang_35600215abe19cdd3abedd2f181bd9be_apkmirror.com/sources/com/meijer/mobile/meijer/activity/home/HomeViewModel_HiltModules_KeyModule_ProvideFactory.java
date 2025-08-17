package com.meijer.mobile.meijer.activity.home;

import com.meijer.mobile.meijer.activity.home.HomeViewModel_HiltModules;

/* loaded from: classes9.dex */
public final class HomeViewModel_HiltModules_KeyModule_ProvideFactory implements Bu.d {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final HomeViewModel_HiltModules_KeyModule_ProvideFactory f109708a = new HomeViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static HomeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return a.f109708a;
    }

    @Override // kv.InterfaceC15323a
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static boolean provide() {
        return HomeViewModel_HiltModules.KeyModule.provide();
    }
}
