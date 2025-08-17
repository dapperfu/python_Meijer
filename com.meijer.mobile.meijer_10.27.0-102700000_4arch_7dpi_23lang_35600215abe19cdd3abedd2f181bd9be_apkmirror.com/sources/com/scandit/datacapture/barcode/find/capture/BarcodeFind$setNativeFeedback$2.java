package com.scandit.datacapture.barcode.find.capture;

import com.scandit.datacapture.barcode.find.feedback.BarcodeFindFeedback;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback;
import com.scandit.datacapture.core.internal.sdk.extensions.FeedbackExtensionsKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"com/scandit/datacapture/barcode/find/capture/BarcodeFind$setNativeFeedback$2", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeFeedback;", "", "emit", "()V", "onFreeResources", "onLoadResources", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeFind$setNativeFeedback$2 extends NativeFeedback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BarcodeFindFeedback f120944a;

    BarcodeFind$setNativeFeedback$2(BarcodeFindFeedback barcodeFindFeedback) {
        this.f120944a = barcodeFindFeedback;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
    public void emit() {
        this.f120944a.getItemListUpdated().emit();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
    public void onFreeResources() {
        this.f120944a.getItemListUpdated().release();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
    public void onLoadResources() {
        FeedbackExtensionsKt.loadSoundResource(this.f120944a.getItemListUpdated());
    }
}
