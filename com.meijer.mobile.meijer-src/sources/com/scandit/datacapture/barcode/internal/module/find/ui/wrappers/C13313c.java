package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.find.ui.AbstractC13305q;
import com.scandit.datacapture.barcode.internal.module.find.ui.C13310w;
import com.scandit.datacapture.barcode.internal.module.find.ui.C13317x;
import com.scandit.datacapture.barcode.internal.module.find.ui.C13318y;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13313c implements com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d {

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f123284e = LazyKt.b(C13311a.f123283a);

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f123285a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f123286b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f123287c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f123288d;

    public C13313c(C13310w shouldShow, C13317x shutterButtonReferenceViewGetter, C13318y progressBarReferenceViewGetter, Function1 isTallFormFactor) {
        Intrinsics.j(shouldShow, "shouldShow");
        Intrinsics.j(shutterButtonReferenceViewGetter, "shutterButtonReferenceViewGetter");
        Intrinsics.j(progressBarReferenceViewGetter, "progressBarReferenceViewGetter");
        Intrinsics.j(isTallFormFactor, "isTallFormFactor");
        this.f123285a = shouldShow;
        this.f123286b = shutterButtonReferenceViewGetter;
        this.f123287c = progressBarReferenceViewGetter;
        this.f123288d = isTallFormFactor;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d
    public final void a(View view, ViewGroup viewGroup) {
        CardsCarouselView view2 = (CardsCarouselView) view;
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.j(view2, "view");
        Intrinsics.j(parent, "parent");
        boolean zBooleanValue = ((Boolean) this.f123285a.invoke()).booleanValue();
        int id2 = ((View) this.f123286b.invoke()).getId();
        int id3 = ((View) this.f123287c.invoke()).getId();
        boolean zBooleanValue2 = ((Boolean) this.f123288d.invoke(parent)).booleanValue();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (zBooleanValue2) {
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(2, id2);
            Lazy lazy = f123284e;
            int iIntValue = ((Number) lazy.getValue()).intValue();
            Lazy lazy2 = AbstractC13305q.f123222b;
            layoutParams.setMargins(iIntValue, ((Number) lazy2.getValue()).intValue(), ((Number) lazy.getValue()).intValue(), ((Number) lazy2.getValue()).intValue());
        } else {
            layoutParams.width = ((Number) AbstractC13305q.f123223c.getValue()).intValue();
            Lazy lazy3 = AbstractC13305q.f123222b;
            layoutParams.setMargins(0, ((Number) lazy3.getValue()).intValue(), 0, ((Number) lazy3.getValue()).intValue());
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(14);
        }
        Intrinsics.j(layoutParams, "<this>");
        layoutParams.addRule(3, id3);
        view2.setVisibility(zBooleanValue ? 0 : 4);
        view2.setLayoutParams(layoutParams);
        view2.prepareButtonBar();
    }
}
