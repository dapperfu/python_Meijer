package com.scandit.datacapture.barcode.ar.ui.annotations;

import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationWidthPreset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010¨\u0006$"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArBodyElementDataHolder;", "", "", "backgroundColor", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "width", "", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArBodyElementRowDataHolder;", "bodyElements", "<init>", "(ILcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;Ljava/util/List;)V", "component1", "()I", "component2", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "component3", "()Ljava/util/List;", "copy", "(ILcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;Ljava/util/List;)Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArBodyElementDataHolder;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getBackgroundColor", "b", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "getWidth", "c", "Ljava/util/List;", "getBodyElements", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final /* data */ class BarcodeArBodyElementDataHolder {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int backgroundColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BarcodeArInfoAnnotationWidthPreset width;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List bodyElements;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarcodeArBodyElementDataHolder copy$default(BarcodeArBodyElementDataHolder barcodeArBodyElementDataHolder, int i10, BarcodeArInfoAnnotationWidthPreset barcodeArInfoAnnotationWidthPreset, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = barcodeArBodyElementDataHolder.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            barcodeArInfoAnnotationWidthPreset = barcodeArBodyElementDataHolder.width;
        }
        if ((i11 & 4) != 0) {
            list = barcodeArBodyElementDataHolder.bodyElements;
        }
        return barcodeArBodyElementDataHolder.copy(i10, barcodeArInfoAnnotationWidthPreset, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final BarcodeArInfoAnnotationWidthPreset getWidth() {
        return this.width;
    }

    public final List<BarcodeArBodyElementRowDataHolder> component3() {
        return this.bodyElements;
    }

    public final BarcodeArBodyElementDataHolder copy(int backgroundColor, BarcodeArInfoAnnotationWidthPreset width, List<BarcodeArBodyElementRowDataHolder> bodyElements) {
        Intrinsics.j(width, "width");
        Intrinsics.j(bodyElements, "bodyElements");
        return new BarcodeArBodyElementDataHolder(backgroundColor, width, bodyElements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeArBodyElementDataHolder)) {
            return false;
        }
        BarcodeArBodyElementDataHolder barcodeArBodyElementDataHolder = (BarcodeArBodyElementDataHolder) other;
        return this.backgroundColor == barcodeArBodyElementDataHolder.backgroundColor && this.width == barcodeArBodyElementDataHolder.width && Intrinsics.e(this.bodyElements, barcodeArBodyElementDataHolder.bodyElements);
    }

    public int hashCode() {
        return this.bodyElements.hashCode() + ((this.width.hashCode() + (Integer.hashCode(this.backgroundColor) * 31)) * 31);
    }

    public String toString() {
        return "BarcodeArBodyElementDataHolder(backgroundColor=" + this.backgroundColor + ", width=" + this.width + ", bodyElements=" + this.bodyElements + ')';
    }

    public BarcodeArBodyElementDataHolder(int i10, BarcodeArInfoAnnotationWidthPreset width, List<BarcodeArBodyElementRowDataHolder> bodyElements) {
        Intrinsics.j(width, "width");
        Intrinsics.j(bodyElements, "bodyElements");
        this.backgroundColor = i10;
        this.width = width;
        this.bodyElements = bodyElements;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<BarcodeArBodyElementRowDataHolder> getBodyElements() {
        return this.bodyElements;
    }

    public final BarcodeArInfoAnnotationWidthPreset getWidth() {
        return this.width;
    }
}
