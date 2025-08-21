package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.scandit.datacapture.core.internal.sdk.ui.icon.ScanditIconUtilsKt;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import com.scandit.datacapture.core.ui.icon.ScanditIconSerializer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class n implements BarcodePickIcon {

    /* renamed from: a, reason: collision with root package name */
    public final ScanditIcon f123734a;

    public n(ScanditIcon scanditIcon) {
        Intrinsics.j(scanditIcon, "scanditIcon");
        this.f123734a = scanditIcon;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon
    public final Drawable a(Context context) {
        Intrinsics.j(context, "context");
        return ScanditIconUtilsKt.getDrawable(this.f123734a, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.e(n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.h(obj, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.PickScanditIcon");
        return Intrinsics.e(this.f123734a, ((n) obj).f123734a);
    }

    public final int hashCode() {
        return this.f123734a.hashCode();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon
    public final String toJson() {
        return ScanditIconSerializer.toJson(this.f123734a);
    }
}
