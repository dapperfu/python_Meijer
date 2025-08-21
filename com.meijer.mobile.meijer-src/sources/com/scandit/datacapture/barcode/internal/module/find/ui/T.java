package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class T extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f123116a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(Function0 function0) {
        super(1);
        this.f123116a = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DataCaptureView it = (DataCaptureView) obj;
        Intrinsics.j(it, "it");
        this.f123116a.invoke();
        return Unit.f143329a;
    }
}
