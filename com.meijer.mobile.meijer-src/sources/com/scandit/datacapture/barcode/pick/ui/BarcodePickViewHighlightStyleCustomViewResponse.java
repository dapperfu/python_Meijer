package com.scandit.datacapture.barcode.pick.ui;

import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewHighlightStyleCustomViewResponse;", "", "Landroid/view/View;", "view", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "statusIconStyle", "<init>", "(Landroid/view/View;Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;)V", "a", "Landroid/view/View;", "getView$scandit_barcode_capture", "()Landroid/view/View;", "b", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "getStatusIconStyle$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickStatusIconStyle;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodePickViewHighlightStyleCustomViewResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BarcodePickStatusIconStyle statusIconStyle;

    /* renamed from: getStatusIconStyle$scandit_barcode_capture, reason: from getter */
    public final BarcodePickStatusIconStyle getStatusIconStyle() {
        return this.statusIconStyle;
    }

    /* renamed from: getView$scandit_barcode_capture, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public BarcodePickViewHighlightStyleCustomViewResponse(View view, BarcodePickStatusIconStyle barcodePickStatusIconStyle) {
        this.view = view;
        this.statusIconStyle = barcodePickStatusIconStyle;
    }
}
