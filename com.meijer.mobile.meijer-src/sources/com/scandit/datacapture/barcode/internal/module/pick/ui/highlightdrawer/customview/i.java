package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f123579a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.g gVar) {
        super(1);
        this.f123579a = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a drawData = (a) obj;
        Intrinsics.j(drawData, "drawData");
        this.f123579a.invoke(drawData.f123557e);
        return Unit.f143329a;
    }
}
