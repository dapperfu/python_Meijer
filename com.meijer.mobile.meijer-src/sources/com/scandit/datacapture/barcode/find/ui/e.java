package com.scandit.datacapture.barcode.find.ui;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class e implements PreviewResolutionRatioHandler {

    /* renamed from: a, reason: collision with root package name */
    public float f121964a = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    public Function1 f121965b;

    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        new Object(defaultConstructorMarker) { // from class: com.scandit.datacapture.barcode.find.ui.PreviewResolutionRatioHandlerImpl$Companion
        };
    }

    @Override // com.scandit.datacapture.barcode.find.ui.PreviewResolutionRatioHandler
    public final boolean getCloseToFourByThree() {
        float f10 = this.f121964a;
        return f10 != -1.0f && Math.abs(f10 - 1.3333334f) < 0.1f;
    }

    @Override // com.scandit.datacapture.barcode.find.ui.PreviewResolutionRatioHandler
    public final Function1 getListener() {
        return this.f121965b;
    }

    @Override // com.scandit.datacapture.barcode.find.ui.PreviewResolutionRatioHandler
    public final float getRatio() {
        return this.f121964a;
    }

    @Override // com.scandit.datacapture.barcode.find.ui.PreviewResolutionRatioHandler
    public final void setListener(Function1 function1) {
        this.f121965b = function1;
    }

    @Override // com.scandit.datacapture.barcode.find.ui.PreviewResolutionRatioHandler
    public final void onResolutionChanged(int i10, int i11) {
        float fMax = Math.max(i10, i11) / Math.min(i10, i11);
        this.f121964a = fMax;
        Function1 function1 = this.f121965b;
        if (function1 != null) {
            function1.invoke(Float.valueOf(fMax));
        }
    }
}
