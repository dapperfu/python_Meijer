package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.find.ui.AbstractC13172q;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class m implements com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f122355a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f122356b;

    public m(com.scandit.datacapture.barcode.internal.module.find.ui.C shouldShow, com.scandit.datacapture.barcode.internal.module.find.ui.D dataCaptureViewGetter) {
        Intrinsics.j(shouldShow, "shouldShow");
        Intrinsics.j(dataCaptureViewGetter, "dataCaptureViewGetter");
        this.f122355a = shouldShow;
        this.f122356b = dataCaptureViewGetter;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d
    public final void a(View view, ViewGroup viewGroup) {
        com.scandit.datacapture.barcode.internal.module.ui.d view2 = (com.scandit.datacapture.barcode.internal.module.ui.d) view;
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.j(view2, "view");
        Intrinsics.j(parent, "parent");
        boolean zBooleanValue = ((Boolean) this.f122355a.invoke()).booleanValue();
        View view3 = (View) this.f122356b.invoke();
        int width = view3.getWidth();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, -2);
        if (width > 0) {
            int id2 = view3.getId();
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(18, id2);
            int id3 = view3.getId();
            Intrinsics.j(layoutParams, "<this>");
            layoutParams.addRule(19, id3);
        }
        Intrinsics.j(layoutParams, "<this>");
        layoutParams.addRule(10);
        Lazy lazy = AbstractC13172q.f122271c;
        if (width < ((Number) lazy.getValue()).intValue()) {
            Lazy lazy2 = AbstractC13172q.f122270b;
            layoutParams.setMargins(((Number) lazy2.getValue()).intValue(), ((Number) lazy2.getValue()).intValue(), ((Number) lazy2.getValue()).intValue(), 0);
        } else {
            int iIntValue = (width - ((Number) lazy.getValue()).intValue()) / 2;
            layoutParams.setMargins(iIntValue, ((Number) AbstractC13172q.f122270b.getValue()).intValue(), iIntValue, 0);
        }
        view2.setVisibility(zBooleanValue ? 0 : 4);
        view2.setLayoutParams(layoutParams);
    }
}
