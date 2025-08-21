package com.meijer.mobile.meijer.activity.home;

import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import xu.InterfaceC18226d;

/* loaded from: classes10.dex */
public final class ExpiryPointsDialogFragment_MembersInjector implements InterfaceC15612a<ExpiryPointsDialogFragment> {
    private final InterfaceC18226d<InterfaceC14523a> analyticsEngineProvider;
    private final InterfaceC18226d<Bl.g> featureEntryPointProvider;

    public static InterfaceC15612a<ExpiryPointsDialogFragment> create(InterfaceC18226d<Bl.g> interfaceC18226d, InterfaceC18226d<InterfaceC14523a> interfaceC18226d2) {
        return new ExpiryPointsDialogFragment_MembersInjector(interfaceC18226d, interfaceC18226d2);
    }

    public static void injectAnalyticsEngine(ExpiryPointsDialogFragment expiryPointsDialogFragment, InterfaceC14523a interfaceC14523a) {
        expiryPointsDialogFragment.analyticsEngine = interfaceC14523a;
    }

    public static void injectFeatureEntryPoint(ExpiryPointsDialogFragment expiryPointsDialogFragment, Bl.g gVar) {
        expiryPointsDialogFragment.featureEntryPoint = gVar;
    }

    public void injectMembers(ExpiryPointsDialogFragment expiryPointsDialogFragment) {
        injectFeatureEntryPoint(expiryPointsDialogFragment, this.featureEntryPointProvider.get());
        injectAnalyticsEngine(expiryPointsDialogFragment, this.analyticsEngineProvider.get());
    }

    private ExpiryPointsDialogFragment_MembersInjector(InterfaceC18226d<Bl.g> interfaceC18226d, InterfaceC18226d<InterfaceC14523a> interfaceC18226d2) {
        this.featureEntryPointProvider = interfaceC18226d;
        this.analyticsEngineProvider = interfaceC18226d2;
    }
}
