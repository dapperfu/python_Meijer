package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview;

import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f122628a;

    public j(BarcodePickViewSettings settings) {
        Intrinsics.j(settings, "settings");
        this.f122628a = settings.getDrawDebugInfo();
    }
}
