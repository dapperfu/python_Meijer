package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardData;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.TextCardData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class j0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f123176b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(u0 u0Var, Map map) {
        super(1);
        this.f123175a = u0Var;
        this.f123176b = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CardsCarouselView it = (CardsCarouselView) obj;
        Intrinsics.j(it, "it");
        CardsCarouselView cardsCarouselView = this.f123175a.f123241i;
        List<CardData> data = cardsCarouselView.getData();
        Intrinsics.h(data, "null cannot be cast to non-null type kotlin.collections.List<com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.TextCardData>");
        u0 u0Var = this.f123175a;
        Map map = this.f123176b;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(data, 10));
        Iterator<T> it2 = data.iterator();
        while (it2.hasNext()) {
            TextCardData textCardData = (TextCardData) it2.next();
            boolean zContainsKey = map.containsKey(textCardData.getItemId());
            u0Var.getClass();
            arrayList.add(TextCardData.copy$default(textCardData, null, null, null, 0, 0, zContainsKey ? Integer.valueOf(R.drawable.sc_magnifying_glass_check) : null, false, null, null, 479, null));
        }
        cardsCarouselView.setData(arrayList);
        this.f123175a.f123241i.setCollapsed(true, false);
        this.f123175a.f123243k.b();
        return Unit.f143329a;
    }
}
