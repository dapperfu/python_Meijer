package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class Q extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BarcodeFindItem f123113b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(u0 u0Var, BarcodeFindItem barcodeFindItem) {
        super(1);
        this.f123112a = u0Var;
        this.f123113b = barcodeFindItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CardsCarouselView it = (CardsCarouselView) obj;
        Intrinsics.j(it, "it");
        this.f123112a.f123241i.moveItemOnTopAndCollapse(String.valueOf(this.f123113b.hashCode()));
        return Unit.f143329a;
    }
}
