package com.meijer.mobile.meijer.activity.home;

import com.meijer.mobile.meijer.activity.home.HomeViewModel_HiltModules;
import xu.InterfaceC18226d;

/* loaded from: classes10.dex */
public final class HomeViewModel_HiltModules_KeyModule_ProvideFactory implements InterfaceC18226d {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final HomeViewModel_HiltModules_KeyModule_ProvideFactory f110569a = new HomeViewModel_HiltModules_KeyModule_ProvideFactory();
    }

    public static HomeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return a.f110569a;
    }

    @Override // gv.InterfaceC14411a
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static boolean provide() {
        return HomeViewModel_HiltModules.KeyModule.provide();
    }
}
