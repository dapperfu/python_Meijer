package com.scandit.datacapture.core.ui.control;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureContext f127019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameSource f127020b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DataCaptureContext dataCaptureContext, FrameSource frameSource) {
        super(0);
        this.f127019a = dataCaptureContext;
        this.f127020b = frameSource;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DataCaptureContext.setFrameSource$default(this.f127019a, this.f127020b, null, 2, null);
        FrameSource frameSource = this.f127020b;
        if (frameSource != null) {
            FrameSource.DefaultImpls.switchToDesiredState$default(frameSource, FrameSourceState.ON, null, 2, null);
        }
        return Unit.f143329a;
    }
}
