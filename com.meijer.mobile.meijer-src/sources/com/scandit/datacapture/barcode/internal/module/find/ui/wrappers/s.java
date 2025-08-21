package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.content.Context;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class s extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.f f123317a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.f fVar) {
        super(1);
        this.f123317a = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        FrameLayout frameLayout = new FrameLayout(it);
        frameLayout.setId(R.id.sc_find_shutter_button_container_view);
        frameLayout.setClipChildren(false);
        com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.f fVar = this.f123317a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        Unit unit = Unit.f143329a;
        frameLayout.addView(fVar, layoutParams);
        frameLayout.setVisibility(4);
        return frameLayout;
    }
}
