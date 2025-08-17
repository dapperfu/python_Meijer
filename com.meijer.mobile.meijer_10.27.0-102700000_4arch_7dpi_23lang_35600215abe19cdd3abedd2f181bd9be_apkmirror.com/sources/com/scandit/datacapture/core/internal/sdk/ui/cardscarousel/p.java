package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class p extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardsCarouselView f125698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f125699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(CardsCarouselView cardsCarouselView, String str) {
        super(0);
        this.f125698a = cardsCarouselView;
        this.f125699b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CardsCarouselView cardsCarouselView = this.f125698a;
        List list = cardsCarouselView.f125579c;
        final String str = this.f125699b;
        cardsCarouselView.setData(CollectionsKt.Z0(list, new Comparator() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView$moveItemOnTopAndCollapse$1$invoke$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.d(Boolean.valueOf(Intrinsics.e(((CardData) t11).getItemId(), str)), Boolean.valueOf(Intrinsics.e(((CardData) t10).getItemId(), str)));
            }
        }));
        return Unit.f142422a;
    }
}
