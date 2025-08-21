package com.scandit.datacapture.barcode.ar.ui.annotations;

import android.graphics.Typeface;
import com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationWidthPreset;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b7\b\u0080\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b&\u0010#J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003¢\u0006\u0004\b'\u0010(J~\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0018J\u001a\u0010.\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010 R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u0010\u0018R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b\u000e\u0010#R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010%R\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\b\u0011\u0010#R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010(¨\u0006J"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArHeaderFooterElementDataHolder;", "", "", "backgroundColor", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", BarcodePickDeserializer.FIELD_ICON, "", "text", "Landroid/graphics/Typeface;", "typeface", "", "textSize", "textColor", "", "isEntireAnnotationTappable", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "width", "isHeader", "Lkotlin/Function0;", "", "elementTapped", "<init>", "(ILcom/scandit/datacapture/core/ui/icon/ScanditIcon;Ljava/lang/String;Landroid/graphics/Typeface;FIZLcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;ZLkotlin/jvm/functions/Function0;)V", "component1", "()I", "component2", "()Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "component3", "()Ljava/lang/String;", "component4", "()Landroid/graphics/Typeface;", "component5", "()F", "component6", "component7", "()Z", "component8", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "component9", "component10", "()Lkotlin/jvm/functions/Function0;", "copy", "(ILcom/scandit/datacapture/core/ui/icon/ScanditIcon;Ljava/lang/String;Landroid/graphics/Typeface;FIZLcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;ZLkotlin/jvm/functions/Function0;)Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArHeaderFooterElementDataHolder;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getBackgroundColor", "b", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "getIcon", "c", "Ljava/lang/String;", "getText", "d", "Landroid/graphics/Typeface;", "getTypeface", "e", "F", "getTextSize", "f", "getTextColor", "g", "Z", "h", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationWidthPreset;", "getWidth", "i", "j", "Lkotlin/jvm/functions/Function0;", "getElementTapped", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final /* data */ class BarcodeArHeaderFooterElementDataHolder {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int backgroundColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ScanditIcon icon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Typeface typeface;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float textSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int textColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isEntireAnnotationTappable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final BarcodeArInfoAnnotationWidthPreset width;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean isHeader;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Function0 elementTapped;

    public static /* synthetic */ BarcodeArHeaderFooterElementDataHolder copy$default(BarcodeArHeaderFooterElementDataHolder barcodeArHeaderFooterElementDataHolder, int i10, ScanditIcon scanditIcon, String str, Typeface typeface, float f10, int i11, boolean z10, BarcodeArInfoAnnotationWidthPreset barcodeArInfoAnnotationWidthPreset, boolean z11, Function0 function0, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = barcodeArHeaderFooterElementDataHolder.backgroundColor;
        }
        if ((i12 & 2) != 0) {
            scanditIcon = barcodeArHeaderFooterElementDataHolder.icon;
        }
        if ((i12 & 4) != 0) {
            str = barcodeArHeaderFooterElementDataHolder.text;
        }
        if ((i12 & 8) != 0) {
            typeface = barcodeArHeaderFooterElementDataHolder.typeface;
        }
        if ((i12 & 16) != 0) {
            f10 = barcodeArHeaderFooterElementDataHolder.textSize;
        }
        if ((i12 & 32) != 0) {
            i11 = barcodeArHeaderFooterElementDataHolder.textColor;
        }
        if ((i12 & 64) != 0) {
            z10 = barcodeArHeaderFooterElementDataHolder.isEntireAnnotationTappable;
        }
        if ((i12 & 128) != 0) {
            barcodeArInfoAnnotationWidthPreset = barcodeArHeaderFooterElementDataHolder.width;
        }
        if ((i12 & 256) != 0) {
            z11 = barcodeArHeaderFooterElementDataHolder.isHeader;
        }
        if ((i12 & 512) != 0) {
            function0 = barcodeArHeaderFooterElementDataHolder.elementTapped;
        }
        boolean z12 = z11;
        Function0 function02 = function0;
        boolean z13 = z10;
        BarcodeArInfoAnnotationWidthPreset barcodeArInfoAnnotationWidthPreset2 = barcodeArInfoAnnotationWidthPreset;
        float f11 = f10;
        int i13 = i11;
        return barcodeArHeaderFooterElementDataHolder.copy(i10, scanditIcon, str, typeface, f11, i13, z13, barcodeArInfoAnnotationWidthPreset2, z12, function02);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Function0<Unit> component10() {
        return this.elementTapped;
    }

    /* renamed from: component2, reason: from getter */
    public final ScanditIcon getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final Typeface getTypeface() {
        return this.typeface;
    }

    /* renamed from: component5, reason: from getter */
    public final float getTextSize() {
        return this.textSize;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsEntireAnnotationTappable() {
        return this.isEntireAnnotationTappable;
    }

    /* renamed from: component8, reason: from getter */
    public final BarcodeArInfoAnnotationWidthPreset getWidth() {
        return this.width;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsHeader() {
        return this.isHeader;
    }

    public final BarcodeArHeaderFooterElementDataHolder copy(int backgroundColor, ScanditIcon icon, String text, Typeface typeface, float textSize, int textColor, boolean isEntireAnnotationTappable, BarcodeArInfoAnnotationWidthPreset width, boolean isHeader, Function0<Unit> elementTapped) {
        Intrinsics.j(typeface, "typeface");
        Intrinsics.j(width, "width");
        Intrinsics.j(elementTapped, "elementTapped");
        return new BarcodeArHeaderFooterElementDataHolder(backgroundColor, icon, text, typeface, textSize, textColor, isEntireAnnotationTappable, width, isHeader, elementTapped);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeArHeaderFooterElementDataHolder)) {
            return false;
        }
        BarcodeArHeaderFooterElementDataHolder barcodeArHeaderFooterElementDataHolder = (BarcodeArHeaderFooterElementDataHolder) other;
        return this.backgroundColor == barcodeArHeaderFooterElementDataHolder.backgroundColor && Intrinsics.e(this.icon, barcodeArHeaderFooterElementDataHolder.icon) && Intrinsics.e(this.text, barcodeArHeaderFooterElementDataHolder.text) && Intrinsics.e(this.typeface, barcodeArHeaderFooterElementDataHolder.typeface) && Float.compare(this.textSize, barcodeArHeaderFooterElementDataHolder.textSize) == 0 && this.textColor == barcodeArHeaderFooterElementDataHolder.textColor && this.isEntireAnnotationTappable == barcodeArHeaderFooterElementDataHolder.isEntireAnnotationTappable && this.width == barcodeArHeaderFooterElementDataHolder.width && this.isHeader == barcodeArHeaderFooterElementDataHolder.isHeader && Intrinsics.e(this.elementTapped, barcodeArHeaderFooterElementDataHolder.elementTapped);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.backgroundColor) * 31;
        ScanditIcon scanditIcon = this.icon;
        int iHashCode2 = (iHashCode + (scanditIcon == null ? 0 : scanditIcon.hashCode())) * 31;
        String str = this.text;
        return this.elementTapped.hashCode() + ((Boolean.hashCode(this.isHeader) + ((this.width.hashCode() + ((Boolean.hashCode(this.isEntireAnnotationTappable) + ((Integer.hashCode(this.textColor) + ((Float.hashCode(this.textSize) + ((this.typeface.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "BarcodeArHeaderFooterElementDataHolder(backgroundColor=" + this.backgroundColor + ", icon=" + this.icon + ", text=" + this.text + ", typeface=" + this.typeface + ", textSize=" + this.textSize + ", textColor=" + this.textColor + ", isEntireAnnotationTappable=" + this.isEntireAnnotationTappable + ", width=" + this.width + ", isHeader=" + this.isHeader + ", elementTapped=" + this.elementTapped + ')';
    }

    public BarcodeArHeaderFooterElementDataHolder(int i10, ScanditIcon scanditIcon, String str, Typeface typeface, float f10, int i11, boolean z10, BarcodeArInfoAnnotationWidthPreset width, boolean z11, Function0<Unit> elementTapped) {
        Intrinsics.j(typeface, "typeface");
        Intrinsics.j(width, "width");
        Intrinsics.j(elementTapped, "elementTapped");
        this.backgroundColor = i10;
        this.icon = scanditIcon;
        this.text = str;
        this.typeface = typeface;
        this.textSize = f10;
        this.textColor = i11;
        this.isEntireAnnotationTappable = z10;
        this.width = width;
        this.isHeader = z11;
        this.elementTapped = elementTapped;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Function0<Unit> getElementTapped() {
        return this.elementTapped;
    }

    public final ScanditIcon getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }

    public final BarcodeArInfoAnnotationWidthPreset getWidth() {
        return this.width;
    }

    public final boolean isEntireAnnotationTappable() {
        return this.isEntireAnnotationTappable;
    }

    public final boolean isHeader() {
        return this.isHeader;
    }
}
