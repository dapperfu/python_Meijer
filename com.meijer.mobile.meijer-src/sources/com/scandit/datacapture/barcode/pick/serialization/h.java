package com.scandit.datacapture.barcode.pick.serialization;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class h extends Lambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f124577a = new h();

    public h() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BarcodePickViewHighlightStyle.RectangularWithIcons style = (BarcodePickViewHighlightStyle.RectangularWithIcons) obj;
        ScanditIcon scanditIcon = (ScanditIcon) obj2;
        BarcodePickState state = (BarcodePickState) obj3;
        Intrinsics.j(style, "style");
        Intrinsics.j(scanditIcon, "scanditIcon");
        Intrinsics.j(state, "state");
        style.setSelectedIconForState(scanditIcon, state);
        return Unit.f143329a;
    }
}
