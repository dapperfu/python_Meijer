package com.meijer.mobile.meijer.activity.home;

import gi.InterfaceC14261a;
import pu.InterfaceC16421a;

/* loaded from: classes9.dex */
public final class ExpiryPointsDialogFragment_MembersInjector implements InterfaceC16421a<ExpiryPointsDialogFragment> {
    private final Bu.d<InterfaceC14261a> analyticsEngineProvider;
    private final Bu.d<Al.g> featureEntryPointProvider;

    public static InterfaceC16421a<ExpiryPointsDialogFragment> create(Bu.d<Al.g> dVar, Bu.d<InterfaceC14261a> dVar2) {
        return new ExpiryPointsDialogFragment_MembersInjector(dVar, dVar2);
    }

    public static void injectAnalyticsEngine(ExpiryPointsDialogFragment expiryPointsDialogFragment, InterfaceC14261a interfaceC14261a) {
        expiryPointsDialogFragment.analyticsEngine = interfaceC14261a;
    }

    public static void injectFeatureEntryPoint(ExpiryPointsDialogFragment expiryPointsDialogFragment, Al.g gVar) {
        expiryPointsDialogFragment.featureEntryPoint = gVar;
    }

    public void injectMembers(ExpiryPointsDialogFragment expiryPointsDialogFragment) {
        injectFeatureEntryPoint(expiryPointsDialogFragment, this.featureEntryPointProvider.get());
        injectAnalyticsEngine(expiryPointsDialogFragment, this.analyticsEngineProvider.get());
    }

    private ExpiryPointsDialogFragment_MembersInjector(Bu.d<Al.g> dVar, Bu.d<InterfaceC14261a> dVar2) {
        this.featureEntryPointProvider = dVar;
        this.analyticsEngineProvider = dVar2;
    }
}
