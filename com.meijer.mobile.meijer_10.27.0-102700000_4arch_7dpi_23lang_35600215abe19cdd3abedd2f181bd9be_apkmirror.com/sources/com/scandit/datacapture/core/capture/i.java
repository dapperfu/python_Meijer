package com.scandit.datacapture.core.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureContext f124066a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DataCaptureContext dataCaptureContext) {
        super(0);
        this.f124066a = dataCaptureContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f124066a;
    }
}
