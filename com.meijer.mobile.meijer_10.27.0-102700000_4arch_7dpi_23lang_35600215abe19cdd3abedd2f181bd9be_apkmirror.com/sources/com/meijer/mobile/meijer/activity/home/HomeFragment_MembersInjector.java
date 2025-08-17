package com.meijer.mobile.meijer.activity.home;

import Jk.AppVersion;
import gi.InterfaceC14261a;
import pu.InterfaceC16421a;
import tp.C17129c;
import um.C17279b;
import yo.C18264a;

/* loaded from: classes9.dex */
public final class HomeFragment_MembersInjector implements InterfaceC16421a<HomeFragment> {
    private final Bu.d<InterfaceC14261a> analyticsEngineProvider;
    private final Bu.d<C17279b> appBackgroundManagerProvider;
    private final Bu.d<C18264a> appPrefManagerProvider;
    private final Bu.d<AppVersion> appVersionProvider;
    private final Bu.d<Al.g> featureEntryPointProvider;
    private final Bu.d<yl.k> featureManagerProvider;
    private final Bu.d<Cl.e> meijerIntentProvider;
    private final Bu.d<C17129c> rateAndTipUpdaterProvider;
    private final Bu.d<Tq.j> storeProvider;
    private final Bu.d<yo.k> userManagerProvider;

    public static InterfaceC16421a<HomeFragment> create(Bu.d<Cl.e> dVar, Bu.d<C18264a> dVar2, Bu.d<yl.k> dVar3, Bu.d<Tq.j> dVar4, Bu.d<yo.k> dVar5, Bu.d<Al.g> dVar6, Bu.d<InterfaceC14261a> dVar7, Bu.d<C17279b> dVar8, Bu.d<C17129c> dVar9, Bu.d<AppVersion> dVar10) {
        return new HomeFragment_MembersInjector(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10);
    }

    public static void injectAnalyticsEngine(HomeFragment homeFragment, InterfaceC14261a interfaceC14261a) {
        homeFragment.analyticsEngine = interfaceC14261a;
    }

    public static void injectAppBackgroundManager(HomeFragment homeFragment, C17279b c17279b) {
        homeFragment.appBackgroundManager = c17279b;
    }

    public static void injectAppPrefManager(HomeFragment homeFragment, C18264a c18264a) {
        homeFragment.appPrefManager = c18264a;
    }

    public static void injectAppVersion(HomeFragment homeFragment, AppVersion appVersion) {
        homeFragment.appVersion = appVersion;
    }

    public static void injectFeatureEntryPoint(HomeFragment homeFragment, Al.g gVar) {
        homeFragment.featureEntryPoint = gVar;
    }

    public static void injectFeatureManager(HomeFragment homeFragment, yl.k kVar) {
        homeFragment.featureManager = kVar;
    }

    public static void injectMeijerIntent(HomeFragment homeFragment, Cl.e eVar) {
        homeFragment.meijerIntent = eVar;
    }

    public static void injectRateAndTipUpdater(HomeFragment homeFragment, C17129c c17129c) {
        homeFragment.rateAndTipUpdater = c17129c;
    }

    public static void injectStoreProvider(HomeFragment homeFragment, Tq.j jVar) {
        homeFragment.storeProvider = jVar;
    }

    public static void injectUserManager(HomeFragment homeFragment, yo.k kVar) {
        homeFragment.userManager = kVar;
    }

    public void injectMembers(HomeFragment homeFragment) {
        injectMeijerIntent(homeFragment, this.meijerIntentProvider.get());
        injectAppPrefManager(homeFragment, this.appPrefManagerProvider.get());
        injectFeatureManager(homeFragment, this.featureManagerProvider.get());
        injectStoreProvider(homeFragment, this.storeProvider.get());
        injectUserManager(homeFragment, this.userManagerProvider.get());
        injectFeatureEntryPoint(homeFragment, this.featureEntryPointProvider.get());
        injectAnalyticsEngine(homeFragment, this.analyticsEngineProvider.get());
        injectAppBackgroundManager(homeFragment, this.appBackgroundManagerProvider.get());
        injectRateAndTipUpdater(homeFragment, this.rateAndTipUpdaterProvider.get());
        injectAppVersion(homeFragment, this.appVersionProvider.get());
    }

    private HomeFragment_MembersInjector(Bu.d<Cl.e> dVar, Bu.d<C18264a> dVar2, Bu.d<yl.k> dVar3, Bu.d<Tq.j> dVar4, Bu.d<yo.k> dVar5, Bu.d<Al.g> dVar6, Bu.d<InterfaceC14261a> dVar7, Bu.d<C17279b> dVar8, Bu.d<C17129c> dVar9, Bu.d<AppVersion> dVar10) {
        this.meijerIntentProvider = dVar;
        this.appPrefManagerProvider = dVar2;
        this.featureManagerProvider = dVar3;
        this.storeProvider = dVar4;
        this.userManagerProvider = dVar5;
        this.featureEntryPointProvider = dVar6;
        this.analyticsEngineProvider = dVar7;
        this.appBackgroundManagerProvider = dVar8;
        this.rateAndTipUpdaterProvider = dVar9;
        this.appVersionProvider = dVar10;
    }
}
