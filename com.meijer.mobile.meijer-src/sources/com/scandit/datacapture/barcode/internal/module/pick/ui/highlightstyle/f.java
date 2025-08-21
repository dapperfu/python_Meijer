package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle;

import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class f implements BarcodePickHighlightStyleIconsHolder {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f123722b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f123723c = new LinkedHashMap();

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder
    public final void a(ScanditIcon icon, BarcodePickState state) {
        Intrinsics.j(icon, "icon");
        Intrinsics.j(state, "state");
        this.f123722b.put(state, i.a(icon, l.f123732a));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder
    public final void b(Bitmap bitmap, BarcodePickState state) {
        Intrinsics.j(state, "state");
        this.f123722b.put(state, i.a(bitmap, l.f123732a));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder
    public final void a(Bitmap bitmap, BarcodePickState state) {
        Intrinsics.j(state, "state");
        this.f123723c.put(state, i.a(bitmap, m.f123733a));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder
    public final void b(int i10, BarcodePickState state) {
        Intrinsics.j(state, "state");
        this.f123722b.put(state, i.a(i10, l.f123732a));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder
    public final void b(ScanditIcon icon, BarcodePickState state) {
        Intrinsics.j(icon, "icon");
        Intrinsics.j(state, "state");
        this.f123723c.put(state, i.a(icon, m.f123733a));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickHighlightStyleIconsHolder
    public final void a(int i10, BarcodePickState state) {
        Intrinsics.j(state, "state");
        this.f123723c.put(state, i.a(i10, m.f123733a));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.c
    public final BarcodePickIcon b(BarcodePickState state) {
        Intrinsics.j(state, "state");
        BarcodePickIcon barcodePickIcon = (BarcodePickIcon) this.f123723c.get(state);
        return barcodePickIcon == null ? m.f123733a : barcodePickIcon;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.c
    public final BarcodePickIcon a(BarcodePickState state) {
        Intrinsics.j(state, "state");
        BarcodePickIcon barcodePickIcon = (BarcodePickIcon) this.f123722b.get(state);
        return barcodePickIcon == null ? m.f123733a : barcodePickIcon;
    }
}
