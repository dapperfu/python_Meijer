package com.scandit.datacapture.barcode.find.ui;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class f implements ScreenSizeCategoryHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ScreenSizeCategory f121014a;

    @Override // com.scandit.datacapture.barcode.find.ui.ScreenSizeCategoryHandler
    public final void onPreviewSizeMeasured(Size size, Size parentSize) {
        Intrinsics.j(size, "size");
        Intrinsics.j(parentSize, "parentSize");
    }

    public f(ScreenSizeCategory screenCategory) {
        Intrinsics.j(screenCategory, "screenCategory");
        this.f121014a = screenCategory;
    }

    @Override // com.scandit.datacapture.barcode.find.ui.ScreenSizeCategoryHandler
    public final ScreenSizeCategory getScreenCategory() {
        return this.f121014a;
    }
}
