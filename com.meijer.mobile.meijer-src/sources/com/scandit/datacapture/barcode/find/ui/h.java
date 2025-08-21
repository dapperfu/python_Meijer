package com.scandit.datacapture.barcode.find.ui;

import android.content.Context;
import android.util.Size;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class h implements ScreenSizeCategoryHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f121967a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121968b;

    /* renamed from: c, reason: collision with root package name */
    public final int f121969c;

    /* renamed from: d, reason: collision with root package name */
    public ScreenSizeCategory f121970d;

    public h() {
        g isTallFormFactor = new g();
        Intrinsics.j(isTallFormFactor, "isTallFormFactor");
        this.f121967a = isTallFormFactor;
        this.f121968b = BinsView.TOTE_HEIGHT_DP;
        this.f121969c = HttpResponseStatus.SUCCESS_OK;
    }

    @Override // com.scandit.datacapture.barcode.find.ui.ScreenSizeCategoryHandler
    public final ScreenSizeCategory getScreenCategory() {
        ScreenSizeCategory screenSizeCategory = this.f121970d;
        if (screenSizeCategory != null) {
            return screenSizeCategory;
        }
        throw new IllegalStateException("An unexpected error occurred setting up views in BarcodeFind. \nThe screen category wasn't initialized while the views are being laid out and \npositioned.                  ");
    }

    @Override // com.scandit.datacapture.barcode.find.ui.ScreenSizeCategoryHandler
    public final void onPreviewSizeMeasured(Size size, Size parentSize) {
        Intrinsics.j(size, "size");
        Intrinsics.j(parentSize, "parentSize");
        boolean zBooleanValue = ((Boolean) this.f121967a.invoke(parentSize)).booleanValue();
        float fDpFromPx$default = PixelExtensionsKt.dpFromPx$default((zBooleanValue ? parentSize.getHeight() : parentSize.getWidth()) - (zBooleanValue ? size.getHeight() : size.getWidth()), (Context) null, 1, (Object) null);
        this.f121970d = fDpFromPx$default < ((float) this.f121968b) ? ScreenSizeCategory.SMALL : fDpFromPx$default < ((float) this.f121969c) ? ScreenSizeCategory.MID : ScreenSizeCategory.LARGE;
    }
}
