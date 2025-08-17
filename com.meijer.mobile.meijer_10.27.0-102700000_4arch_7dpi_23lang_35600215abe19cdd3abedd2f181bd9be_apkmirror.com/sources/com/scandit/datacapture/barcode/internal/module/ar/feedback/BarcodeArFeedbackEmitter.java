package com.scandit.datacapture.barcode.internal.module.ar.feedback;

import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArListener;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSession;
import com.scandit.datacapture.barcode.ar.feedback.BarcodeArFeedback;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.data.FrameData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class BarcodeArFeedbackEmitter implements BarcodeArListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeAr f121062a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f121063b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f121064c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f121065d;

    /* renamed from: e, reason: collision with root package name */
    private long f121066e;

    /* renamed from: f, reason: collision with root package name */
    private Feedback f121067f;

    /* renamed from: g, reason: collision with root package name */
    private Feedback f121068g;

    public final void a(BarcodeArFeedback userSetFeedback) {
        Intrinsics.j(userSetFeedback, "userSetFeedback");
        Feedback feedback = new Feedback(this.f121064c ? userSetFeedback.getTapped().getVibration() : null, this.f121063b ? userSetFeedback.getTapped().getSound() : null);
        Feedback feedback2 = this.f121067f;
        if (feedback2 != null) {
            feedback2.release();
        }
        this.f121067f = feedback;
        Feedback feedback3 = new Feedback(this.f121064c ? userSetFeedback.getScanned().getVibration() : null, this.f121063b ? userSetFeedback.getScanned().getSound() : null);
        Feedback feedback4 = this.f121068g;
        if (feedback4 != null) {
            feedback4.release();
        }
        this.f121068g = feedback3;
    }

    public final void c() {
        this.f121065d = true;
        this.f121062a.addListener(this);
        a(this.f121062a.getFeedback());
    }

    public BarcodeArFeedbackEmitter(BarcodeAr barcodeAr, boolean z10, boolean z11) {
        Intrinsics.j(barcodeAr, "barcodeAr");
        Intrinsics.j(barcodeAr, "barcodeAr");
        this.f121062a = barcodeAr;
        this.f121063b = z10;
        this.f121064c = z11;
        this.f121066e = -1L;
        this.f121067f = null;
        this.f121068g = null;
    }

    public final void b() {
        Feedback feedback;
        if (!this.f121065d || (feedback = this.f121067f) == null) {
            return;
        }
        feedback.emit();
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArListener
    public final void onSessionUpdated(BarcodeAr barcodeAr, BarcodeArSession session, FrameData frameData) {
        Intrinsics.j(barcodeAr, "barcodeAr");
        Intrinsics.j(session, "session");
        Intrinsics.j(frameData, "frameData");
        if (session.getAddedTrackedBarcodes().isEmpty() || System.currentTimeMillis() - this.f121066e <= 500) {
            return;
        }
        Feedback feedback = this.f121068g;
        if (feedback != null) {
            feedback.emit();
        }
        this.f121066e = System.currentTimeMillis();
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArListener
    public final void onObservationStarted(BarcodeAr barcodeAr) {
        BarcodeArListener.DefaultImpls.onObservationStarted(this, barcodeAr);
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArListener
    public final void onObservationStopped(BarcodeAr barcodeAr) {
        BarcodeArListener.DefaultImpls.onObservationStopped(this, barcodeAr);
    }

    public final void a() {
        this.f121065d = false;
        this.f121062a.removeListener(this);
        Feedback feedback = this.f121067f;
        if (feedback != null) {
            feedback.release();
        }
        Feedback feedback2 = this.f121068g;
        if (feedback2 != null) {
            feedback2.release();
        }
    }
}
