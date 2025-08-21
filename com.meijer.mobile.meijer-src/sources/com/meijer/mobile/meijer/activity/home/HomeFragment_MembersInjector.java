package com.meijer.mobile.meijer.activity.home;

import Kk.AppVersion;
import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import tp.C17278c;
import vm.C17693b;
import xu.InterfaceC18226d;
import yo.C18335a;

/* loaded from: classes10.dex */
public final class HomeFragment_MembersInjector implements InterfaceC15612a<HomeFragment> {
    private final InterfaceC18226d<InterfaceC14523a> analyticsEngineProvider;
    private final InterfaceC18226d<C17693b> appBackgroundManagerProvider;
    private final InterfaceC18226d<C18335a> appPrefManagerProvider;
    private final InterfaceC18226d<AppVersion> appVersionProvider;
    private final InterfaceC18226d<Bl.g> featureEntryPointProvider;
    private final InterfaceC18226d<zl.k> featureManagerProvider;
    private final InterfaceC18226d<Dl.e> meijerIntentProvider;
    private final InterfaceC18226d<C17278c> rateAndTipUpdaterProvider;
    private final InterfaceC18226d<Tq.j> storeProvider;
    private final InterfaceC18226d<yo.k> userManagerProvider;

    public static InterfaceC15612a<HomeFragment> create(InterfaceC18226d<Dl.e> interfaceC18226d, InterfaceC18226d<C18335a> interfaceC18226d2, InterfaceC18226d<zl.k> interfaceC18226d3, InterfaceC18226d<Tq.j> interfaceC18226d4, InterfaceC18226d<yo.k> interfaceC18226d5, InterfaceC18226d<Bl.g> interfaceC18226d6, InterfaceC18226d<InterfaceC14523a> interfaceC18226d7, InterfaceC18226d<C17693b> interfaceC18226d8, InterfaceC18226d<C17278c> interfaceC18226d9, InterfaceC18226d<AppVersion> interfaceC18226d10) {
        return new HomeFragment_MembersInjector(interfaceC18226d, interfaceC18226d2, interfaceC18226d3, interfaceC18226d4, interfaceC18226d5, interfaceC18226d6, interfaceC18226d7, interfaceC18226d8, interfaceC18226d9, interfaceC18226d10);
    }

    public static void injectAnalyticsEngine(HomeFragment homeFragment, InterfaceC14523a interfaceC14523a) {
        homeFragment.analyticsEngine = interfaceC14523a;
    }

    public static void injectAppBackgroundManager(HomeFragment homeFragment, C17693b c17693b) {
        homeFragment.appBackgroundManager = c17693b;
    }

    public static void injectAppPrefManager(HomeFragment homeFragment, C18335a c18335a) {
        homeFragment.appPrefManager = c18335a;
    }

    public static void injectAppVersion(HomeFragment homeFragment, AppVersion appVersion) {
        homeFragment.appVersion = appVersion;
    }

    public static void injectFeatureEntryPoint(HomeFragment homeFragment, Bl.g gVar) {
        homeFragment.featureEntryPoint = gVar;
    }

    public static void injectFeatureManager(HomeFragment homeFragment, zl.k kVar) {
        homeFragment.featureManager = kVar;
    }

    public static void injectMeijerIntent(HomeFragment homeFragment, Dl.e eVar) {
        homeFragment.meijerIntent = eVar;
    }

    public static void injectRateAndTipUpdater(HomeFragment homeFragment, C17278c c17278c) {
        homeFragment.rateAndTipUpdater = c17278c;
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

    private HomeFragment_MembersInjector(InterfaceC18226d<Dl.e> interfaceC18226d, InterfaceC18226d<C18335a> interfaceC18226d2, InterfaceC18226d<zl.k> interfaceC18226d3, InterfaceC18226d<Tq.j> interfaceC18226d4, InterfaceC18226d<yo.k> interfaceC18226d5, InterfaceC18226d<Bl.g> interfaceC18226d6, InterfaceC18226d<InterfaceC14523a> interfaceC18226d7, InterfaceC18226d<C17693b> interfaceC18226d8, InterfaceC18226d<C17278c> interfaceC18226d9, InterfaceC18226d<AppVersion> interfaceC18226d10) {
        this.meijerIntentProvider = interfaceC18226d;
        this.appPrefManagerProvider = interfaceC18226d2;
        this.featureManagerProvider = interfaceC18226d3;
        this.storeProvider = interfaceC18226d4;
        this.userManagerProvider = interfaceC18226d5;
        this.featureEntryPointProvider = interfaceC18226d6;
        this.analyticsEngineProvider = interfaceC18226d7;
        this.appBackgroundManagerProvider = interfaceC18226d8;
        this.rateAndTipUpdaterProvider = interfaceC18226d9;
        this.appVersionProvider = interfaceC18226d10;
    }
}
