package com.scandit.datacapture.barcode.internal.module.ar.feedback;

import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArListener;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSession;
import com.scandit.datacapture.barcode.ar.feedback.BarcodeArFeedback;
import com.scandit.datacapture.core.common.feedback.Feedback;
import com.scandit.datacapture.core.data.FrameData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class BarcodeArFeedbackEmitter implements BarcodeArListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeAr f122014a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f122015b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f122016c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f122017d;

    /* renamed from: e, reason: collision with root package name */
    private long f122018e;

    /* renamed from: f, reason: collision with root package name */
    private Feedback f122019f;

    /* renamed from: g, reason: collision with root package name */
    private Feedback f122020g;

    public final void a(BarcodeArFeedback userSetFeedback) {
        Intrinsics.j(userSetFeedback, "userSetFeedback");
        Feedback feedback = new Feedback(this.f122016c ? userSetFeedback.getTapped().getVibration() : null, this.f122015b ? userSetFeedback.getTapped().getSound() : null);
        Feedback feedback2 = this.f122019f;
        if (feedback2 != null) {
            feedback2.release();
        }
        this.f122019f = feedback;
        Feedback feedback3 = new Feedback(this.f122016c ? userSetFeedback.getScanned().getVibration() : null, this.f122015b ? userSetFeedback.getScanned().getSound() : null);
        Feedback feedback4 = this.f122020g;
        if (feedback4 != null) {
            feedback4.release();
        }
        this.f122020g = feedback3;
    }

    public final void c() {
        this.f122017d = true;
        this.f122014a.addListener(this);
        a(this.f122014a.getFeedback());
    }

    public BarcodeArFeedbackEmitter(BarcodeAr barcodeAr, boolean z10, boolean z11) {
        Intrinsics.j(barcodeAr, "barcodeAr");
        Intrinsics.j(barcodeAr, "barcodeAr");
        this.f122014a = barcodeAr;
        this.f122015b = z10;
        this.f122016c = z11;
        this.f122018e = -1L;
        this.f122019f = null;
        this.f122020g = null;
    }

    public final void b() {
        Feedback feedback;
        if (!this.f122017d || (feedback = this.f122019f) == null) {
            return;
        }
        feedback.emit();
    }

    @Override // com.scandit.datacapture.barcode.ar.capture.BarcodeArListener
    public final void onSessionUpdated(BarcodeAr barcodeAr, BarcodeArSession session, FrameData frameData) {
        Intrinsics.j(barcodeAr, "barcodeAr");
        Intrinsics.j(session, "session");
        Intrinsics.j(frameData, "frameData");
        if (session.getAddedTrackedBarcodes().isEmpty() || System.currentTimeMillis() - this.f122018e <= 500) {
            return;
        }
        Feedback feedback = this.f122020g;
        if (feedback != null) {
            feedback.emit();
        }
        this.f122018e = System.currentTimeMillis();
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
        this.f122017d = false;
        this.f122014a.removeListener(this);
        Feedback feedback = this.f122019f;
        if (feedback != null) {
            feedback.release();
        }
        Feedback feedback2 = this.f122020g;
        if (feedback2 != null) {
            feedback2.release();
        }
    }
}
