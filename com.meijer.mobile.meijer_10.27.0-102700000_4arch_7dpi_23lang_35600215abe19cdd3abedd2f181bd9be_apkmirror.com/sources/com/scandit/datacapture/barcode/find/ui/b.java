package com.scandit.datacapture.barcode.find.ui;

import com.scandit.datacapture.barcode.internal.module.find.ui.u0;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f121006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f121007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f121008c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(u0 u0Var, int i10, int i11) {
        super(1);
        this.f121006a = u0Var;
        this.f121007b = i10;
        this.f121008c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DataCaptureView it = (DataCaptureView) obj;
        Intrinsics.j(it, "it");
        u0 u0Var = this.f121006a;
        u0Var.f122283c.onResolutionChanged(this.f121007b, this.f121008c);
        u0Var.f122291k.b();
        return Unit.f142422a;
    }
}
