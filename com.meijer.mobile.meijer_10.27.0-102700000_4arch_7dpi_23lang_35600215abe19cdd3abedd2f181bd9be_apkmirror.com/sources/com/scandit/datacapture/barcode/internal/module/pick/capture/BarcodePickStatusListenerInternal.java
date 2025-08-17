package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.pick.capture.BarcodePick;

/* loaded from: classes11.dex */
public interface BarcodePickStatusListenerInternal {
    void a();

    void b();

    void c();

    void d();

    void onObservationStarted(BarcodePick barcodePick);

    void onObservationStopped(BarcodePick barcodePick);
}
