package com.scandit.datacapture.barcode.internal.module.batch.ui.overlay;

import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements TrackedObjectAugmenter.Factory {
    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Factory
    public final TrackedObjectAugmenter forHost(TrackedObjectAugmenter.Host host) {
        Intrinsics.j(host, "host");
        return new e(host);
    }
}
