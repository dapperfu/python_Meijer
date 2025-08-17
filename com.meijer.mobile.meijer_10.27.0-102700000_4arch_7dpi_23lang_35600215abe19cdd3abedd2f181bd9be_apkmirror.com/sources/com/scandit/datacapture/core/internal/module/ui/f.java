package com.scandit.datacapture.core.internal.module.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureTextureView f125230a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DataCaptureTextureView dataCaptureTextureView) {
        super(0);
        this.f125230a = dataCaptureTextureView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f125230a.f125130a._setNeedsRedraw();
        this.f125230a.f125136g.set(true);
        return Unit.f142422a;
    }
}
