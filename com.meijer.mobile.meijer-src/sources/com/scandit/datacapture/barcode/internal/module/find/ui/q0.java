package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class q0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f123225b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(u0 u0Var, String str) {
        super(1);
        this.f123224a = u0Var;
        this.f123225b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CardsCarouselView it = (CardsCarouselView) obj;
        Intrinsics.j(it, "it");
        this.f123224a.f123241i.setCollapseButtonText(this.f123225b);
        return Unit.f143329a;
    }
}
