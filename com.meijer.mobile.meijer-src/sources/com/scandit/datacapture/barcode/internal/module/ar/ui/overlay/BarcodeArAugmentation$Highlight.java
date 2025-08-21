package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import android.view.View;
import com.scandit.datacapture.barcode.ar.ui.highlight.BarcodeArHighlight;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public final class BarcodeArAugmentation$Highlight {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeArHighlight f122145a;

    /* renamed from: b, reason: collision with root package name */
    private final View f122146b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BarcodeArAugmentation$Highlight)) {
            return false;
        }
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight = (BarcodeArAugmentation$Highlight) obj;
        return Intrinsics.e(this.f122145a, barcodeArAugmentation$Highlight.f122145a) && Intrinsics.e(this.f122146b, barcodeArAugmentation$Highlight.f122146b);
    }

    public final int hashCode() {
        return this.f122146b.hashCode() + (this.f122145a.hashCode() * 31);
    }

    public final String toString() {
        return "Highlight(highlight=" + this.f122145a + ", view=" + this.f122146b + ')';
    }

    public BarcodeArAugmentation$Highlight(BarcodeArHighlight highlight, View view) {
        Intrinsics.j(highlight, "highlight");
        Intrinsics.j(view, "view");
        this.f122145a = highlight;
        this.f122146b = view;
    }

    public final BarcodeArHighlight a() {
        return this.f122145a;
    }

    public final View b() {
        return this.f122146b;
    }

    public final Quadrilateral c() {
        if (!f.a(this.f122146b)) {
            return null;
        }
        float x10 = this.f122146b.getX() + this.f122146b.getLeft();
        float x11 = this.f122146b.getX() + this.f122146b.getRight();
        float y10 = this.f122146b.getY() + this.f122146b.getTop();
        float y11 = this.f122146b.getY() + this.f122146b.getBottom();
        Quadrilateral quadrilateral = new Quadrilateral(new Point(x10, y10), new Point(x11, y10), new Point(x11, y11), new Point(x10, y11));
        return QuadrilateralUtilsKt.rotatedRadians(quadrilateral, QuadrilateralUtilsKt.getCenter(quadrilateral), Math.toRadians(this.f122146b.getRotation()));
    }

    public final boolean d() {
        String name;
        Class<?> cls = this.f122145a.getClass();
        if (ArraysKt.Y(f.f122157a, cls)) {
            return true;
        }
        Package r12 = cls.getPackage();
        if (r12 == null || (name = r12.getName()) == null || !StringsKt.W(name, "com.scandit.datacapture.barcode.ar", false, 2, null)) {
            return false;
        }
        throw new IllegalStateException(("`" + cls.getSimpleName() + "` class with package `" + name + "` should be registered in `BARCODE_AR_HIGHLIGHT_CLASSES`").toString());
    }
}
