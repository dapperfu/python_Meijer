package com.scandit.datacapture.core.internal.module.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureTextureView f126182a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DataCaptureTextureView dataCaptureTextureView) {
        super(0);
        this.f126182a = dataCaptureTextureView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f126182a.f126082a._setNeedsRedraw();
        this.f126182a.f126088g.set(true);
        return Unit.f143329a;
    }
}
