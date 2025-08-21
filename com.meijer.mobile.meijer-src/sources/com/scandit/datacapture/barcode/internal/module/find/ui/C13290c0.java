package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.c0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13290c0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123139a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13290c0(u0 u0Var) {
        super(1);
        this.f123139a = u0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CardsCarouselView it = (CardsCarouselView) obj;
        Intrinsics.j(it, "it");
        this.f123139a.f123243k.b();
        return Unit.f143329a;
    }
}
