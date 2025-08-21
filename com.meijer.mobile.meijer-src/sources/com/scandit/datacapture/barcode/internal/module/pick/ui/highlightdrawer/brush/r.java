package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class r extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f123539a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Function1 function1) {
        super(1);
        this.f123539a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a drawData = (a) obj;
        Intrinsics.j(drawData, "drawData");
        this.f123539a.invoke(drawData.f123505f);
        return Unit.f143329a;
    }
}
