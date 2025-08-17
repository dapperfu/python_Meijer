package com.scandit.datacapture.core.capture;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureMode f124063a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DataCaptureMode dataCaptureMode) {
        super(1);
        this.f124063a = dataCaptureMode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DataCaptureMode existingMode = (DataCaptureMode) obj;
        Intrinsics.j(existingMode, "existingMode");
        return Boolean.valueOf(!existingMode._dataCaptureModeImpl().canCoexistWithMode(this.f124063a._dataCaptureModeImpl()));
    }
}
