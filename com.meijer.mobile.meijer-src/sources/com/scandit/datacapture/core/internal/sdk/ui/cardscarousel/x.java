package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.content.Context;
import android.view.GestureDetector;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class x extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f126669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExpandedCardsView f126670b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, ExpandedCardsView expandedCardsView) {
        super(0);
        this.f126669a = context;
        this.f126670b = expandedCardsView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new GestureDetector(this.f126669a, this.f126670b.f126594h);
    }
}
