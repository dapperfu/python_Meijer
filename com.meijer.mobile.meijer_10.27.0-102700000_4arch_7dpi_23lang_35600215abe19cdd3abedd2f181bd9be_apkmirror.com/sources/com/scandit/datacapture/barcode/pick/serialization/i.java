package com.scandit.datacapture.barcode.pick.serialization;

import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class i extends Lambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public static final i f123626a = new i();

    public i() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BarcodePickViewHighlightStyle.DotWithIcons style = (BarcodePickViewHighlightStyle.DotWithIcons) obj;
        BarcodePickState state = (BarcodePickState) obj3;
        Intrinsics.j(style, "style");
        Intrinsics.j(state, "state");
        style.setSelectedIconForState((Bitmap) obj2, state);
        return Unit.f142422a;
    }
}
