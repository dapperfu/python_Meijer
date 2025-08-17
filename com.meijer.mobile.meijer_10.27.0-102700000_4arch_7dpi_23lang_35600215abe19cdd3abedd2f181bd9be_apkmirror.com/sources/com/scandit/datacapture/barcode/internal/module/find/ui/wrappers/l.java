package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class l extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c f122354a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c cVar) {
        super(1);
        this.f122354a = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        Intrinsics.j(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.sc_find_exit_button_wrapper_view);
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c cVar = this.f122354a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        Unit unit = Unit.f142422a;
        frameLayout.addView(cVar, layoutParams);
        frameLayout.setVisibility(4);
        return frameLayout;
    }
}
