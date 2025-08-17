package com.meijer.mobile.meijer.activity.home;

import gi.InterfaceC14261a;
import pu.InterfaceC16421a;

/* loaded from: classes9.dex */
public final class RoutingActivity_MembersInjector implements InterfaceC16421a<RoutingActivity> {
    private final Bu.d<InterfaceC14261a> analyticsEngineProvider;
    private final Bu.d<Al.g> featureEntryPointProvider;

    public static InterfaceC16421a<RoutingActivity> create(Bu.d<Al.g> dVar, Bu.d<InterfaceC14261a> dVar2) {
        return new RoutingActivity_MembersInjector(dVar, dVar2);
    }

    public static void injectAnalyticsEngine(RoutingActivity routingActivity, InterfaceC14261a interfaceC14261a) {
        routingActivity.analyticsEngine = interfaceC14261a;
    }

    public static void injectFeatureEntryPoint(RoutingActivity routingActivity, Al.g gVar) {
        routingActivity.featureEntryPoint = gVar;
    }

    public void injectMembers(RoutingActivity routingActivity) {
        injectFeatureEntryPoint(routingActivity, this.featureEntryPointProvider.get());
        injectAnalyticsEngine(routingActivity, this.analyticsEngineProvider.get());
    }

    private RoutingActivity_MembersInjector(Bu.d<Al.g> dVar, Bu.d<InterfaceC14261a> dVar2) {
        this.featureEntryPointProvider = dVar;
        this.analyticsEngineProvider = dVar2;
    }
}
