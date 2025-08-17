package com.scandit.datacapture.barcode.internal.module.pick.ui;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodePickGuidanceHandler {
    public abstract void hideLoadingPopup();

    public abstract void setInitialGuidance(boolean z10, String str);

    public abstract void setMoveCloserGuidance(boolean z10, String str);

    public abstract void setTapShutterToPauseGuidance(boolean z10, String str);

    public abstract void showLoadingPopup(boolean z10);
}
