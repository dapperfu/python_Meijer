package com.meijer.mobile.serverapi.rxjava.observables.accounts;

import Bh.e;
import Bu.d;
import qh.C16527b;
import qv.AbstractC16618K;

/* loaded from: classes11.dex */
public final class ValidatePhoneNumberCallChain_Factory implements d {
    private final d<C16527b> accountLinkingRepositoryProvider;
    private final d<AbstractC16618K> ioDispatcherProvider;
    private final d<e> profileRepositoryProvider;

    public static ValidatePhoneNumberCallChain_Factory create(d<e> dVar, d<C16527b> dVar2, d<AbstractC16618K> dVar3) {
        return new ValidatePhoneNumberCallChain_Factory(dVar, dVar2, dVar3);
    }

    public static ValidatePhoneNumberCallChain newInstance(e eVar, C16527b c16527b, AbstractC16618K abstractC16618K) {
        return new ValidatePhoneNumberCallChain(eVar, c16527b, abstractC16618K);
    }

    @Override // kv.InterfaceC15323a
    public ValidatePhoneNumberCallChain get() {
        return newInstance(this.profileRepositoryProvider.get(), this.accountLinkingRepositoryProvider.get(), this.ioDispatcherProvider.get());
    }

    private ValidatePhoneNumberCallChain_Factory(d<e> dVar, d<C16527b> dVar2, d<AbstractC16618K> dVar3) {
        this.profileRepositoryProvider = dVar;
        this.accountLinkingRepositoryProvider = dVar2;
        this.ioDispatcherProvider = dVar3;
    }
}
