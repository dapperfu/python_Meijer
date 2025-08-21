package com.scandit.datacapture.core.capture;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureContext f125014a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DataCaptureContext dataCaptureContext) {
        super(0);
        this.f125014a = dataCaptureContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f125014a.getF125005a().onActivityStopped();
        return Unit.f143329a;
    }
}
