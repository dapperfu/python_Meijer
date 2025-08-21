package com.scandit.datacapture.barcode.pick.ui;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.pick.ui.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13398a implements BarcodePickStatusListenerInternal {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f124675a;

    public C13398a(BarcodePickView owner) {
        Intrinsics.j(owner, "owner");
        this.f124675a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void a() {
        BarcodePickView barcodePickView = (BarcodePickView) this.f124675a.get();
        if (barcodePickView != null) {
            barcodePickView.onStatusListenerStarted$scandit_barcode_capture();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void b() {
        BarcodePickView barcodePickView = (BarcodePickView) this.f124675a.get();
        if (barcodePickView != null) {
            barcodePickView.onStatusListenerStopped$scandit_barcode_capture();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void c() {
        BarcodePickView barcodePickView = (BarcodePickView) this.f124675a.get();
        if (barcodePickView != null) {
            barcodePickView.onStatusListenerFreezed$scandit_barcode_capture();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void d() {
        BarcodePickView barcodePickView = (BarcodePickView) this.f124675a.get();
        if (barcodePickView != null) {
            barcodePickView.onStatusListenerPaused$scandit_barcode_capture();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void onObservationStarted(BarcodePick mode) {
        Intrinsics.j(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void onObservationStopped(BarcodePick mode) {
        Intrinsics.j(mode, "mode");
    }
}
