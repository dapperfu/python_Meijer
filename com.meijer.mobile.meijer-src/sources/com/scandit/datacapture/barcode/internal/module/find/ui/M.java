package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class M extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123107a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(u0 u0Var) {
        super(1);
        this.f123107a = u0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CardsCarouselView it = (CardsCarouselView) obj;
        Intrinsics.j(it, "it");
        this.f123107a.f123243k.b();
        return Unit.f143329a;
    }
}
