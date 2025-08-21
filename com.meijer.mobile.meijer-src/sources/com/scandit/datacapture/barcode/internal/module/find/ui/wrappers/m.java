package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.find.ui.AbstractC13305q;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class m implements com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f123307a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f123308b;

    public m(com.scandit.datacapture.barcode.internal.module.find.ui.C shouldShow, com.scandit.datacapture.barcode.internal.module.find.ui.D dataCaptureViewGetter) {
        Intrinsics.j(shouldShow, "shouldShow");
        Intrinsics.j(dataCaptureViewGetter, "dataCaptureViewGetter");
        this.f123307a = shouldShow;
        this.f123308b = dataCaptureViewGetter;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d
    public final void a(View view, ViewGroup viewGroup) {
        com.scandit.datacapture.barcode.internal.module.ui.d view2 = (com.scandit.datacapture.barcode.internal.module.ui.d) view;
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.j(view2, "view");
        Intrinsics.j(parent, "parent");
        boolean zBooleanValue = ((Boolean) this.f123307a.invoke()).booleanValue();
        View view3 = (View) this.f123308b.invoke();
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
        Lazy lazy = AbstractC13305q.f123223c;
        if (width < ((Number) lazy.getValue()).intValue()) {
            Lazy lazy2 = AbstractC13305q.f123222b;
            layoutParams.setMargins(((Number) lazy2.getValue()).intValue(), ((Number) lazy2.getValue()).intValue(), ((Number) lazy2.getValue()).intValue(), 0);
        } else {
            int iIntValue = (width - ((Number) lazy.getValue()).intValue()) / 2;
            layoutParams.setMargins(iIntValue, ((Number) AbstractC13305q.f123222b.getValue()).intValue(), iIntValue, 0);
        }
        view2.setVisibility(zBooleanValue ? 0 : 4);
        view2.setLayoutParams(layoutParams);
    }
}
