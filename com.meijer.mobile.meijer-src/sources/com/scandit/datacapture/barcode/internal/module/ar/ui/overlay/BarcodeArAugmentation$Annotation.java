package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import android.view.View;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public final class BarcodeArAugmentation$Annotation {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeArAnnotation f122143a;

    /* renamed from: b, reason: collision with root package name */
    private final View f122144b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BarcodeArAugmentation$Annotation)) {
            return false;
        }
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = (BarcodeArAugmentation$Annotation) obj;
        return Intrinsics.e(this.f122143a, barcodeArAugmentation$Annotation.f122143a) && Intrinsics.e(this.f122144b, barcodeArAugmentation$Annotation.f122144b);
    }

    public final int hashCode() {
        return this.f122144b.hashCode() + (this.f122143a.hashCode() * 31);
    }

    public final String toString() {
        return "Annotation(annotation=" + this.f122143a + ", view=" + this.f122144b + ')';
    }

    public BarcodeArAugmentation$Annotation(BarcodeArAnnotation annotation, View view) {
        Intrinsics.j(annotation, "annotation");
        Intrinsics.j(view, "view");
        this.f122143a = annotation;
        this.f122144b = view;
    }

    public final BarcodeArAnnotation a() {
        return this.f122143a;
    }

    public final View b() {
        return this.f122144b;
    }

    public final boolean c() {
        String name;
        Class<?> cls = this.f122143a.getClass();
        if (ArraysKt.Y(f.f122158b, cls)) {
            return true;
        }
        Package r12 = cls.getPackage();
        if (r12 == null || (name = r12.getName()) == null || !StringsKt.W(name, "com.scandit.datacapture.barcode.ar", false, 2, null)) {
            return false;
        }
        throw new IllegalStateException(("`" + cls.getSimpleName() + "` class with package `" + name + "` should be registered in `BARCODE_AR_ANNOTATION_CLASSES`").toString());
    }
}
