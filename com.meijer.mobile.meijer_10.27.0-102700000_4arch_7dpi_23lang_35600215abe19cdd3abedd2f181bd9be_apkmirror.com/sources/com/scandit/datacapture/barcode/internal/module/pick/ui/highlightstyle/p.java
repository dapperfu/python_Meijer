package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle;

import com.scandit.datacapture.core.ui.style.Brush;
import com.scandit.datacapture.core.ui.style.BrushSerializer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class p implements BarcodePickBrush {

    /* renamed from: b, reason: collision with root package name */
    public final Brush f122785b;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush
    public final Brush asBrush() {
        return this.f122785b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && Intrinsics.e(this.f122785b, ((p) obj).f122785b);
    }

    public final int hashCode() {
        return this.f122785b.hashCode();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush
    public final String toJson() {
        return BrushSerializer.toJson(this.f122785b);
    }

    public final String toString() {
        return "SetBrush(brush=" + this.f122785b + ')';
    }

    public /* synthetic */ p(Brush brush) {
        this.f122785b = brush;
    }
}
