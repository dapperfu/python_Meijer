package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class p0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123220a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(u0 u0Var) {
        super(1);
        this.f123220a = u0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DataCaptureView it = (DataCaptureView) obj;
        Intrinsics.j(it, "it");
        this.f123220a.f123243k.b();
        return Unit.f143329a;
    }
}
