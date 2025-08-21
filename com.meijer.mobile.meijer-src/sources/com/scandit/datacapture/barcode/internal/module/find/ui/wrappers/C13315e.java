package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13315e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardsCarouselView f123289a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13315e(CardsCarouselView cardsCarouselView) {
        super(1);
        this.f123289a = cardsCarouselView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        return this.f123289a;
    }
}
