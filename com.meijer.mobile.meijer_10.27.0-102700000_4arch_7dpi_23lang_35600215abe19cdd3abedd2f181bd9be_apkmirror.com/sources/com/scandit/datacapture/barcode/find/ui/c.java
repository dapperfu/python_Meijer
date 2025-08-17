package com.scandit.datacapture.barcode.find.ui;

import com.scandit.datacapture.barcode.internal.module.find.ui.u0;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureView f121009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f121010b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DataCaptureView dataCaptureView, u0 u0Var) {
        super(2);
        this.f121009a = dataCaptureView;
        this.f121010b = u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ViewExtensionsKt.runOnMainThread(this.f121009a, new b(this.f121010b, ((Number) obj).intValue(), ((Number) obj2).intValue()));
        return Unit.f142422a;
    }
}
