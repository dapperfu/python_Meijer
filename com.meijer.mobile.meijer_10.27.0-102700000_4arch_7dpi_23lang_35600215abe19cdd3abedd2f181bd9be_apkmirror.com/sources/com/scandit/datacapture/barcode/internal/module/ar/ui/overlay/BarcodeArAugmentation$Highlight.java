package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import android.view.View;
import com.scandit.datacapture.barcode.ar.ui.highlight.BarcodeArHighlight;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes11.dex */
public final class BarcodeArAugmentation$Highlight {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeArHighlight f121193a;

    /* renamed from: b, reason: collision with root package name */
    private final View f121194b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BarcodeArAugmentation$Highlight)) {
            return false;
        }
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight = (BarcodeArAugmentation$Highlight) obj;
        return Intrinsics.e(this.f121193a, barcodeArAugmentation$Highlight.f121193a) && Intrinsics.e(this.f121194b, barcodeArAugmentation$Highlight.f121194b);
    }

    public final int hashCode() {
        return this.f121194b.hashCode() + (this.f121193a.hashCode() * 31);
    }

    public final String toString() {
        return "Highlight(highlight=" + this.f121193a + ", view=" + this.f121194b + ')';
    }

    public BarcodeArAugmentation$Highlight(BarcodeArHighlight highlight, View view) {
        Intrinsics.j(highlight, "highlight");
        Intrinsics.j(view, "view");
        this.f121193a = highlight;
        this.f121194b = view;
    }

    public final BarcodeArHighlight a() {
        return this.f121193a;
    }

    public final View b() {
        return this.f121194b;
    }

    public final Quadrilateral c() {
        if (!f.a(this.f121194b)) {
            return null;
        }
        float x10 = this.f121194b.getX() + this.f121194b.getLeft();
        float x11 = this.f121194b.getX() + this.f121194b.getRight();
        float y10 = this.f121194b.getY() + this.f121194b.getTop();
        float y11 = this.f121194b.getY() + this.f121194b.getBottom();
        Quadrilateral quadrilateral = new Quadrilateral(new Point(x10, y10), new Point(x11, y10), new Point(x11, y11), new Point(x10, y11));
        return QuadrilateralUtilsKt.rotatedRadians(quadrilateral, QuadrilateralUtilsKt.getCenter(quadrilateral), Math.toRadians(this.f121194b.getRotation()));
    }

    public final boolean d() {
        String name;
        Class<?> cls = this.f121193a.getClass();
        if (ArraysKt.Y(f.f121205a, cls)) {
            return true;
        }
        Package r12 = cls.getPackage();
        if (r12 == null || (name = r12.getName()) == null || !StringsKt.W(name, "com.scandit.datacapture.barcode.ar", false, 2, null)) {
            return false;
        }
        throw new IllegalStateException(("`" + cls.getSimpleName() + "` class with package `" + name + "` should be registered in `BARCODE_AR_HIGHLIGHT_CLASSES`").toString());
    }
}
