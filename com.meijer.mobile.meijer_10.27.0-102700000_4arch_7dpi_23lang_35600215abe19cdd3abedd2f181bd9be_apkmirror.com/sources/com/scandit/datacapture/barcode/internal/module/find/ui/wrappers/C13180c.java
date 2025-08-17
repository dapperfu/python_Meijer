package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.find.ui.AbstractC13172q;
import com.scandit.datacapture.barcode.internal.module.find.ui.C13177w;
import com.scandit.datacapture.barcode.internal.module.find.ui.C13184x;
import com.scandit.datacapture.barcode.internal.module.find.ui.C13185y;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.wrappers.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13180c implements com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d {

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f122332e = LazyKt.b(C13178a.f122331a);

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f122333a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f122334b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f122335c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f122336d;

    public C13180c(C13177w shouldShow, C13184x shutterButtonReferenceViewGetter, C13185y progressBarReferenceViewGetter, Function1 isTallFormFactor) {
        Intrinsics.j(shouldShow, "shouldShow");
        Intrinsics.j(shutterButtonReferenceViewGetter, "shutterButtonReferenceViewGetter");
        Intrinsics.j(progressBarReferenceViewGetter, "progressBarReferenceViewGetter");
        Intrinsics.j(isTallFormFactor, "isTallFormFactor");
        this.f122333a = shouldShow;
        this.f122334b = shutterButtonReferenceViewGetter;
        this.f122335c = progressBarReferenceViewGetter;
        this.f122336d = isTallFormFactor;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d
    public final void a(View view, ViewGroup viewGroup) {
        CardsCarouselView view2 = (CardsCarouselView) view;
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.j(view2, "view");
        Intrinsics.j(parent, "parent");
        boolean zBooleanValue = ((Boolean) this.f122333a.invoke()).booleanValue();
        int id2 = ((View) this.f122334b.invoke()).getId();
        int id3 = ((View) this.f122335c.invoke()).getId();
        boolean zBooleanValue2 = ((Boolean) this.f122336d.invoke(parent)).booleanValue();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (zBooleanValue2) {
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(2, id2);
            Lazy lazy = f122332e;
            int iIntValue = ((Number) lazy.getValue()).intValue();
            Lazy lazy2 = AbstractC13172q.f122270b;
            layoutParams.setMargins(iIntValue, ((Number) lazy2.getValue()).intValue(), ((Number) lazy.getValue()).intValue(), ((Number) lazy2.getValue()).intValue());
        } else {
            layoutParams.width = ((Number) AbstractC13172q.f122271c.getValue()).intValue();
            Lazy lazy3 = AbstractC13172q.f122270b;
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
