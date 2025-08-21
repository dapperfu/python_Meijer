package com.meijer.mobile.meijer.activity.home;

import Rn.C5283i;
import com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem;
import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import vm.C17693b;
import xj.C18187d;
import xm.C18197h;
import xu.InterfaceC18226d;
import yo.C18335a;
import zj.InterfaceC18491a;
import zl.C18499b;

/* loaded from: classes10.dex */
public final class HomeActivity_MembersInjector implements InterfaceC15612a<HomeActivity> {
    private final InterfaceC18226d<InterfaceC14523a> analyticsEngineProvider;
    private final InterfaceC18226d<C17693b> appBackgroundManagerProvider;
    private final InterfaceC18226d<C18335a> appPrefManagerProvider;
    private final InterfaceC18226d<C18499b> appUpdateConfigManagerProvider;
    private final InterfaceC18226d<Dk.b> baseBusProvider;
    private final InterfaceC18226d<C5283i> connectionChangeHelperProvider;
    private final InterfaceC18226d<Bl.g> featureEntryPointProvider;
    private final InterfaceC18226d<zl.k> featureManagerProvider;
    private final InterfaceC18226d<C18187d> firebaseLoggingUtilProvider;
    private final InterfaceC18226d<InterfaceC18491a> firebasePerformanceEngineProvider;
    private final InterfaceC18226d<Gh.b> inboxManagerProvider;
    private final InterfaceC18226d<Dl.e> meijerIntentProvider;
    private final InterfaceC18226d<NavBarItem> navBarItemProvider;
    private final InterfaceC18226d<C18197h> notificationManagerProvider;
    private final InterfaceC18226d<Ch.d> preferencesRepositoryProvider;
    private final InterfaceC18226d<yo.k> userManagerProvider;

    public static InterfaceC15612a<HomeActivity> create(InterfaceC18226d<C18335a> interfaceC18226d, InterfaceC18226d<Dk.b> interfaceC18226d2, InterfaceC18226d<C17693b> interfaceC18226d3, InterfaceC18226d<yo.k> interfaceC18226d4, InterfaceC18226d<C18197h> interfaceC18226d5, InterfaceC18226d<C18187d> interfaceC18226d6, InterfaceC18226d<C5283i> interfaceC18226d7, InterfaceC18226d<zl.k> interfaceC18226d8, InterfaceC18226d<C18499b> interfaceC18226d9, InterfaceC18226d<Dl.e> interfaceC18226d10, InterfaceC18226d<Bl.g> interfaceC18226d11, InterfaceC18226d<InterfaceC14523a> interfaceC18226d12, InterfaceC18226d<InterfaceC18491a> interfaceC18226d13, InterfaceC18226d<NavBarItem> interfaceC18226d14, InterfaceC18226d<Gh.b> interfaceC18226d15, InterfaceC18226d<Ch.d> interfaceC18226d16) {
        return new HomeActivity_MembersInjector(interfaceC18226d, interfaceC18226d2, interfaceC18226d3, interfaceC18226d4, interfaceC18226d5, interfaceC18226d6, interfaceC18226d7, interfaceC18226d8, interfaceC18226d9, interfaceC18226d10, interfaceC18226d11, interfaceC18226d12, interfaceC18226d13, interfaceC18226d14, interfaceC18226d15, interfaceC18226d16);
    }

    public static void injectInboxManager(HomeActivity homeActivity, Gh.b bVar) {
        homeActivity.inboxManager = bVar;
    }

    public static void injectNavBarItem(HomeActivity homeActivity, NavBarItem navBarItem) {
        homeActivity.navBarItem = navBarItem;
    }

    public static void injectPreferencesRepository(HomeActivity homeActivity, Ch.d dVar) {
        homeActivity.preferencesRepository = dVar;
    }

    public void injectMembers(HomeActivity homeActivity) {
        com.meijer.mobile.meijer.activity.o.c(homeActivity, this.appPrefManagerProvider.get());
        com.meijer.mobile.meijer.activity.o.e(homeActivity, this.baseBusProvider.get());
        com.meijer.mobile.meijer.activity.o.b(homeActivity, this.appBackgroundManagerProvider.get());
        com.meijer.mobile.meijer.activity.o.m(homeActivity, this.userManagerProvider.get());
        com.meijer.mobile.meijer.activity.o.l(homeActivity, this.notificationManagerProvider.get());
        com.meijer.mobile.meijer.activity.o.i(homeActivity, this.firebaseLoggingUtilProvider.get());
        com.meijer.mobile.meijer.activity.o.f(homeActivity, this.connectionChangeHelperProvider.get());
        com.meijer.mobile.meijer.activity.o.h(homeActivity, this.featureManagerProvider.get());
        com.meijer.mobile.meijer.activity.o.d(homeActivity, this.appUpdateConfigManagerProvider.get());
        com.meijer.mobile.meijer.activity.o.k(homeActivity, this.meijerIntentProvider.get());
        com.meijer.mobile.meijer.activity.o.g(homeActivity, this.featureEntryPointProvider.get());
        com.meijer.mobile.meijer.activity.o.a(homeActivity, this.analyticsEngineProvider.get());
        com.meijer.mobile.meijer.activity.o.j(homeActivity, this.firebasePerformanceEngineProvider.get());
        injectNavBarItem(homeActivity, this.navBarItemProvider.get());
        injectInboxManager(homeActivity, this.inboxManagerProvider.get());
        injectPreferencesRepository(homeActivity, this.preferencesRepositoryProvider.get());
    }

    private HomeActivity_MembersInjector(InterfaceC18226d<C18335a> interfaceC18226d, InterfaceC18226d<Dk.b> interfaceC18226d2, InterfaceC18226d<C17693b> interfaceC18226d3, InterfaceC18226d<yo.k> interfaceC18226d4, InterfaceC18226d<C18197h> interfaceC18226d5, InterfaceC18226d<C18187d> interfaceC18226d6, InterfaceC18226d<C5283i> interfaceC18226d7, InterfaceC18226d<zl.k> interfaceC18226d8, InterfaceC18226d<C18499b> interfaceC18226d9, InterfaceC18226d<Dl.e> interfaceC18226d10, InterfaceC18226d<Bl.g> interfaceC18226d11, InterfaceC18226d<InterfaceC14523a> interfaceC18226d12, InterfaceC18226d<InterfaceC18491a> interfaceC18226d13, InterfaceC18226d<NavBarItem> interfaceC18226d14, InterfaceC18226d<Gh.b> interfaceC18226d15, InterfaceC18226d<Ch.d> interfaceC18226d16) {
        this.appPrefManagerProvider = interfaceC18226d;
        this.baseBusProvider = interfaceC18226d2;
        this.appBackgroundManagerProvider = interfaceC18226d3;
        this.userManagerProvider = interfaceC18226d4;
        this.notificationManagerProvider = interfaceC18226d5;
        this.firebaseLoggingUtilProvider = interfaceC18226d6;
        this.connectionChangeHelperProvider = interfaceC18226d7;
        this.featureManagerProvider = interfaceC18226d8;
        this.appUpdateConfigManagerProvider = interfaceC18226d9;
        this.meijerIntentProvider = interfaceC18226d10;
        this.featureEntryPointProvider = interfaceC18226d11;
        this.analyticsEngineProvider = interfaceC18226d12;
        this.firebasePerformanceEngineProvider = interfaceC18226d13;
        this.navBarItemProvider = interfaceC18226d14;
        this.inboxManagerProvider = interfaceC18226d15;
        this.preferencesRepositoryProvider = interfaceC18226d16;
    }
}
