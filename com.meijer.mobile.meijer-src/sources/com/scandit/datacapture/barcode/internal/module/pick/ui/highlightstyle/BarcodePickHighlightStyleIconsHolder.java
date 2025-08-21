package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle;

import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;

/* loaded from: classes12.dex */
public interface BarcodePickHighlightStyleIconsHolder extends com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f123688a = 0;

    void a(int i10, BarcodePickState barcodePickState);

    void a(Bitmap bitmap, BarcodePickState barcodePickState);

    void a(ScanditIcon scanditIcon, BarcodePickState barcodePickState);

    void b(int i10, BarcodePickState barcodePickState);

    void b(Bitmap bitmap, BarcodePickState barcodePickState);

    void b(ScanditIcon scanditIcon, BarcodePickState barcodePickState);
}
