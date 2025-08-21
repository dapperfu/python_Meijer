package com.scandit.datacapture.core.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureContext f125020a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DataCaptureContext dataCaptureContext) {
        super(0);
        this.f125020a = dataCaptureContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f125020a;
    }
}
