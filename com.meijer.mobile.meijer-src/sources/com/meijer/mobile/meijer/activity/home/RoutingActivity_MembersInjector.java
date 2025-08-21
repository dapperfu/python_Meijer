package com.meijer.mobile.meijer.activity.home;

import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import xu.InterfaceC18226d;

/* loaded from: classes10.dex */
public final class RoutingActivity_MembersInjector implements InterfaceC15612a<RoutingActivity> {
    private final InterfaceC18226d<InterfaceC14523a> analyticsEngineProvider;
    private final InterfaceC18226d<Bl.g> featureEntryPointProvider;

    public static InterfaceC15612a<RoutingActivity> create(InterfaceC18226d<Bl.g> interfaceC18226d, InterfaceC18226d<InterfaceC14523a> interfaceC18226d2) {
        return new RoutingActivity_MembersInjector(interfaceC18226d, interfaceC18226d2);
    }

    public static void injectAnalyticsEngine(RoutingActivity routingActivity, InterfaceC14523a interfaceC14523a) {
        routingActivity.analyticsEngine = interfaceC14523a;
    }

    public static void injectFeatureEntryPoint(RoutingActivity routingActivity, Bl.g gVar) {
        routingActivity.featureEntryPoint = gVar;
    }

    public void injectMembers(RoutingActivity routingActivity) {
        injectFeatureEntryPoint(routingActivity, this.featureEntryPointProvider.get());
        injectAnalyticsEngine(routingActivity, this.analyticsEngineProvider.get());
    }

    private RoutingActivity_MembersInjector(InterfaceC18226d<Bl.g> interfaceC18226d, InterfaceC18226d<InterfaceC14523a> interfaceC18226d2) {
        this.featureEntryPointProvider = interfaceC18226d;
        this.analyticsEngineProvider = interfaceC18226d2;
    }
}
