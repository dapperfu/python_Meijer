package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class Q extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f122160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeFindItem f122161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(u0 u0Var, BarcodeFindItem barcodeFindItem) {
        super(1);
        this.f122160a = u0Var;
        this.f122161b = barcodeFindItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CardsCarouselView it = (CardsCarouselView) obj;
        Intrinsics.j(it, "it");
        this.f122160a.f122289i.moveItemOnTopAndCollapse(String.valueOf(this.f122161b.hashCode()));
        return Unit.f142422a;
    }
}
