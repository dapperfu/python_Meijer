package com.scandit.datacapture.barcode.ar.ui.annotations;

import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationAnchor;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationWidthPreset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b+\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ^\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0013J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010\u001bJ\u001a\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u001bR\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b\f\u0010\u0019R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001e¨\u00069"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArInfoAnnotationDataHolder;", "", "", "barcodeData", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "width", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationAnchor;", "anchor", "", "hasTip", "", "tipColor", "isEntireAnnotationTappable", "Lkotlin/Function0;", "", "annotationTapped", "<init>", "(Ljava/lang/String;Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationAnchor;ZIZLkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "component3", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationAnchor;", "component4", "()Z", "component5", "()I", "component6", "component7", "()Lkotlin/jvm/functions/Function0;", "copy", "(Ljava/lang/String;Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationAnchor;ZIZLkotlin/jvm/functions/Function0;)Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArInfoAnnotationDataHolder;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBarcodeData", "b", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "getWidth", "c", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationAnchor;", "getAnchor", "d", "Z", "getHasTip", "e", "I", "getTipColor", "f", "g", "Lkotlin/jvm/functions/Function0;", "getAnnotationTapped", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final /* data */ class BarcodeArInfoAnnotationDataHolder {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String barcodeData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BarcodeArInfoAnnotationWidthPreset width;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final BarcodeArInfoAnnotationAnchor anchor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean hasTip;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int tipColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isEntireAnnotationTappable;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function0 annotationTapped;

    public static /* synthetic */ BarcodeArInfoAnnotationDataHolder copy$default(BarcodeArInfoAnnotationDataHolder barcodeArInfoAnnotationDataHolder, String str, BarcodeArInfoAnnotationWidthPreset barcodeArInfoAnnotationWidthPreset, BarcodeArInfoAnnotationAnchor barcodeArInfoAnnotationAnchor, boolean z10, int i10, boolean z11, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = barcodeArInfoAnnotationDataHolder.barcodeData;
        }
        if ((i11 & 2) != 0) {
            barcodeArInfoAnnotationWidthPreset = barcodeArInfoAnnotationDataHolder.width;
        }
        if ((i11 & 4) != 0) {
            barcodeArInfoAnnotationAnchor = barcodeArInfoAnnotationDataHolder.anchor;
        }
        if ((i11 & 8) != 0) {
            z10 = barcodeArInfoAnnotationDataHolder.hasTip;
        }
        if ((i11 & 16) != 0) {
            i10 = barcodeArInfoAnnotationDataHolder.tipColor;
        }
        if ((i11 & 32) != 0) {
            z11 = barcodeArInfoAnnotationDataHolder.isEntireAnnotationTappable;
        }
        if ((i11 & 64) != 0) {
            function0 = barcodeArInfoAnnotationDataHolder.annotationTapped;
        }
        boolean z12 = z11;
        Function0 function02 = function0;
        int i12 = i10;
        BarcodeArInfoAnnotationAnchor barcodeArInfoAnnotationAnchor2 = barcodeArInfoAnnotationAnchor;
        return barcodeArInfoAnnotationDataHolder.copy(str, barcodeArInfoAnnotationWidthPreset, barcodeArInfoAnnotationAnchor2, z10, i12, z12, function02);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBarcodeData() {
        return this.barcodeData;
    }

    /* renamed from: component2, reason: from getter */
    public final BarcodeArInfoAnnotationWidthPreset getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final BarcodeArInfoAnnotationAnchor getAnchor() {
        return this.anchor;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasTip() {
        return this.hasTip;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTipColor() {
        return this.tipColor;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsEntireAnnotationTappable() {
        return this.isEntireAnnotationTappable;
    }

    public final Function0<Unit> component7() {
        return this.annotationTapped;
    }

    public final BarcodeArInfoAnnotationDataHolder copy(String barcodeData, BarcodeArInfoAnnotationWidthPreset width, BarcodeArInfoAnnotationAnchor anchor, boolean hasTip, int tipColor, boolean isEntireAnnotationTappable, Function0<Unit> annotationTapped) {
        Intrinsics.j(width, "width");
        Intrinsics.j(anchor, "anchor");
        Intrinsics.j(annotationTapped, "annotationTapped");
        return new BarcodeArInfoAnnotationDataHolder(barcodeData, width, anchor, hasTip, tipColor, isEntireAnnotationTappable, annotationTapped);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeArInfoAnnotationDataHolder)) {
            return false;
        }
        BarcodeArInfoAnnotationDataHolder barcodeArInfoAnnotationDataHolder = (BarcodeArInfoAnnotationDataHolder) other;
        return Intrinsics.e(this.barcodeData, barcodeArInfoAnnotationDataHolder.barcodeData) && this.width == barcodeArInfoAnnotationDataHolder.width && this.anchor == barcodeArInfoAnnotationDataHolder.anchor && this.hasTip == barcodeArInfoAnnotationDataHolder.hasTip && this.tipColor == barcodeArInfoAnnotationDataHolder.tipColor && this.isEntireAnnotationTappable == barcodeArInfoAnnotationDataHolder.isEntireAnnotationTappable && Intrinsics.e(this.annotationTapped, barcodeArInfoAnnotationDataHolder.annotationTapped);
    }

    public int hashCode() {
        String str = this.barcodeData;
        return this.annotationTapped.hashCode() + ((Boolean.hashCode(this.isEntireAnnotationTappable) + ((Integer.hashCode(this.tipColor) + ((Boolean.hashCode(this.hasTip) + ((this.anchor.hashCode() + ((this.width.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "BarcodeArInfoAnnotationDataHolder(barcodeData=" + this.barcodeData + ", width=" + this.width + ", anchor=" + this.anchor + ", hasTip=" + this.hasTip + ", tipColor=" + this.tipColor + ", isEntireAnnotationTappable=" + this.isEntireAnnotationTappable + ", annotationTapped=" + this.annotationTapped + ')';
    }

    public BarcodeArInfoAnnotationDataHolder(String str, BarcodeArInfoAnnotationWidthPreset width, BarcodeArInfoAnnotationAnchor anchor, boolean z10, int i10, boolean z11, Function0<Unit> annotationTapped) {
        Intrinsics.j(width, "width");
        Intrinsics.j(anchor, "anchor");
        Intrinsics.j(annotationTapped, "annotationTapped");
        this.barcodeData = str;
        this.width = width;
        this.anchor = anchor;
        this.hasTip = z10;
        this.tipColor = i10;
        this.isEntireAnnotationTappable = z11;
        this.annotationTapped = annotationTapped;
    }

    public final BarcodeArInfoAnnotationAnchor getAnchor() {
        return this.anchor;
    }

    public final Function0<Unit> getAnnotationTapped() {
        return this.annotationTapped;
    }

    public final String getBarcodeData() {
        return this.barcodeData;
    }

    public final boolean getHasTip() {
        return this.hasTip;
    }

    public final int getTipColor() {
        return this.tipColor;
    }

    public final BarcodeArInfoAnnotationWidthPreset getWidth() {
        return this.width;
    }

    public final boolean isEntireAnnotationTappable() {
        return this.isEntireAnnotationTappable;
    }
}
