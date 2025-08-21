package com.meijer.mobile.serverapi.rxjava.observables.accounts;

import Ch.e;
import mv.AbstractC15779K;
import rh.C16908b;
import xu.InterfaceC18226d;

/* loaded from: classes12.dex */
public final class ValidatePhoneNumberCallChain_Factory implements InterfaceC18226d {
    private final InterfaceC18226d<C16908b> accountLinkingRepositoryProvider;
    private final InterfaceC18226d<AbstractC15779K> ioDispatcherProvider;
    private final InterfaceC18226d<e> profileRepositoryProvider;

    public static ValidatePhoneNumberCallChain_Factory create(InterfaceC18226d<e> interfaceC18226d, InterfaceC18226d<C16908b> interfaceC18226d2, InterfaceC18226d<AbstractC15779K> interfaceC18226d3) {
        return new ValidatePhoneNumberCallChain_Factory(interfaceC18226d, interfaceC18226d2, interfaceC18226d3);
    }

    public static ValidatePhoneNumberCallChain newInstance(e eVar, C16908b c16908b, AbstractC15779K abstractC15779K) {
        return new ValidatePhoneNumberCallChain(eVar, c16908b, abstractC15779K);
    }

    @Override // gv.InterfaceC14411a
    public ValidatePhoneNumberCallChain get() {
        return newInstance(this.profileRepositoryProvider.get(), this.accountLinkingRepositoryProvider.get(), this.ioDispatcherProvider.get());
    }

    private ValidatePhoneNumberCallChain_Factory(InterfaceC18226d<e> interfaceC18226d, InterfaceC18226d<C16908b> interfaceC18226d2, InterfaceC18226d<AbstractC15779K> interfaceC18226d3) {
        this.profileRepositoryProvider = interfaceC18226d;
        this.accountLinkingRepositoryProvider = interfaceC18226d2;
        this.ioDispatcherProvider = interfaceC18226d3;
    }
}
