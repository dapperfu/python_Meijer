package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodePickSession f123499a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NativeBarcodePickSession nativeBarcodePickSession) {
        super(0);
        this.f123499a = nativeBarcodePickSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f123499a;
    }
}
