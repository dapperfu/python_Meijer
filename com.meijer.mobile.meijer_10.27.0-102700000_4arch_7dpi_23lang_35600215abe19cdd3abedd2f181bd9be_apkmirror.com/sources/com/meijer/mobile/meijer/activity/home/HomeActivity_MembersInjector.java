package com.meijer.mobile.meijer.activity.home;

import Qn.C5145i;
import com.meijer.mobile.meijer.activity.home.legacy.viewmodel.NavBarItem;
import gi.InterfaceC14261a;
import pu.InterfaceC16421a;
import um.C17279b;
import wj.C17828d;
import wm.C17838h;
import yj.InterfaceC18215a;
import yl.C18223b;
import yo.C18264a;

/* loaded from: classes9.dex */
public final class HomeActivity_MembersInjector implements InterfaceC16421a<HomeActivity> {
    private final Bu.d<InterfaceC14261a> analyticsEngineProvider;
    private final Bu.d<C17279b> appBackgroundManagerProvider;
    private final Bu.d<C18264a> appPrefManagerProvider;
    private final Bu.d<C18223b> appUpdateConfigManagerProvider;
    private final Bu.d<Ck.b> baseBusProvider;
    private final Bu.d<C5145i> connectionChangeHelperProvider;
    private final Bu.d<Al.g> featureEntryPointProvider;
    private final Bu.d<yl.k> featureManagerProvider;
    private final Bu.d<C17828d> firebaseLoggingUtilProvider;
    private final Bu.d<InterfaceC18215a> firebasePerformanceEngineProvider;
    private final Bu.d<Fh.b> inboxManagerProvider;
    private final Bu.d<Cl.e> meijerIntentProvider;
    private final Bu.d<NavBarItem> navBarItemProvider;
    private final Bu.d<C17838h> notificationManagerProvider;
    private final Bu.d<Bh.d> preferencesRepositoryProvider;
    private final Bu.d<yo.k> userManagerProvider;

    public static InterfaceC16421a<HomeActivity> create(Bu.d<C18264a> dVar, Bu.d<Ck.b> dVar2, Bu.d<C17279b> dVar3, Bu.d<yo.k> dVar4, Bu.d<C17838h> dVar5, Bu.d<C17828d> dVar6, Bu.d<C5145i> dVar7, Bu.d<yl.k> dVar8, Bu.d<C18223b> dVar9, Bu.d<Cl.e> dVar10, Bu.d<Al.g> dVar11, Bu.d<InterfaceC14261a> dVar12, Bu.d<InterfaceC18215a> dVar13, Bu.d<NavBarItem> dVar14, Bu.d<Fh.b> dVar15, Bu.d<Bh.d> dVar16) {
        return new HomeActivity_MembersInjector(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16);
    }

    public static void injectInboxManager(HomeActivity homeActivity, Fh.b bVar) {
        homeActivity.inboxManager = bVar;
    }

    public static void injectNavBarItem(HomeActivity homeActivity, NavBarItem navBarItem) {
        homeActivity.navBarItem = navBarItem;
    }

    public static void injectPreferencesRepository(HomeActivity homeActivity, Bh.d dVar) {
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

    private HomeActivity_MembersInjector(Bu.d<C18264a> dVar, Bu.d<Ck.b> dVar2, Bu.d<C17279b> dVar3, Bu.d<yo.k> dVar4, Bu.d<C17838h> dVar5, Bu.d<C17828d> dVar6, Bu.d<C5145i> dVar7, Bu.d<yl.k> dVar8, Bu.d<C18223b> dVar9, Bu.d<Cl.e> dVar10, Bu.d<Al.g> dVar11, Bu.d<InterfaceC14261a> dVar12, Bu.d<InterfaceC18215a> dVar13, Bu.d<NavBarItem> dVar14, Bu.d<Fh.b> dVar15, Bu.d<Bh.d> dVar16) {
        this.appPrefManagerProvider = dVar;
        this.baseBusProvider = dVar2;
        this.appBackgroundManagerProvider = dVar3;
        this.userManagerProvider = dVar4;
        this.notificationManagerProvider = dVar5;
        this.firebaseLoggingUtilProvider = dVar6;
        this.connectionChangeHelperProvider = dVar7;
        this.featureManagerProvider = dVar8;
        this.appUpdateConfigManagerProvider = dVar9;
        this.meijerIntentProvider = dVar10;
        this.featureEntryPointProvider = dVar11;
        this.analyticsEngineProvider = dVar12;
        this.firebasePerformanceEngineProvider = dVar13;
        this.navBarItemProvider = dVar14;
        this.inboxManagerProvider = dVar15;
        this.preferencesRepositoryProvider = dVar16;
    }
}
