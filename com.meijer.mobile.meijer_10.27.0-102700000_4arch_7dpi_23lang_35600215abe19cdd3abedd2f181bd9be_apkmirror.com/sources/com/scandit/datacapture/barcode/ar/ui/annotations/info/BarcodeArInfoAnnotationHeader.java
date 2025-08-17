package com.scandit.datacapture.barcode.ar.ui.annotations.info;

import android.graphics.Typeface;
import com.scandit.datacapture.barcode.ar.ui.BarcodeArViewDefaults;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R/\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R/\u0010 \u001a\u0004\u0018\u00010\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010'\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010.\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010\u0014\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R+\u00103\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0014\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u00102R+\u00107\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0014\u001a\u0004\b5\u0010\u0010\"\u0004\b6\u00102¨\u00068"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationHeader;", "", "<init>", "()V", "Lkotlin/Function0;", "", "listener", "setPropertyChangedListener$scandit_barcode_capture", "(Lkotlin/jvm/functions/Function0;)V", "setPropertyChangedListener", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "<set-?>", "b", "Lkotlin/properties/ReadWriteProperty;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "c", "getIcon", "()Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "setIcon", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;)V", BarcodePickDeserializer.FIELD_ICON, "", "d", "getTextSize", "()F", "setTextSize", "(F)V", "textSize", "Landroid/graphics/Typeface;", "e", "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "typeface", "f", "getTextColor", "setTextColor", "(I)V", "textColor", "g", "getBackgroundColor", "setBackgroundColor", "backgroundColor", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BarcodeArInfoAnnotationHeader {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f120327h = {com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationHeader.class, "text", "getText()Ljava/lang/String;", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationHeader.class, BarcodePickDeserializer.FIELD_ICON, "getIcon()Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationHeader.class, "textSize", "getTextSize()F", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationHeader.class, "typeface", "getTypeface()Landroid/graphics/Typeface;", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationHeader.class, "textColor", "getTextColor()I", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationHeader.class, "backgroundColor", "getBackgroundColor()I", 0)};

    /* renamed from: a, reason: collision with root package name */
    private WeakReference f120328a = new WeakReference(c.f120345a);

    /* renamed from: b, reason: collision with root package name */
    private final BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$1 f120329b;

    /* renamed from: c, reason: collision with root package name */
    private final BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$2 f120330c;

    /* renamed from: d, reason: collision with root package name */
    private final BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$3 f120331d;

    /* renamed from: e, reason: collision with root package name */
    private final BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$4 f120332e;

    /* renamed from: f, reason: collision with root package name */
    private final BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$5 f120333f;

    /* renamed from: g, reason: collision with root package name */
    private final BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$6 f120334g;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeArInfoAnnotationHeader)) {
            return false;
        }
        BarcodeArInfoAnnotationHeader barcodeArInfoAnnotationHeader = (BarcodeArInfoAnnotationHeader) other;
        return Intrinsics.e(getText(), barcodeArInfoAnnotationHeader.getText()) && Intrinsics.e(getIcon(), barcodeArInfoAnnotationHeader.getIcon()) && getTextSize() == barcodeArInfoAnnotationHeader.getTextSize() && Intrinsics.e(getTypeface(), barcodeArInfoAnnotationHeader.getTypeface()) && getTextColor() == barcodeArInfoAnnotationHeader.getTextColor() && getBackgroundColor() == barcodeArInfoAnnotationHeader.getBackgroundColor();
    }

    public static final void access$propertyChanged(BarcodeArInfoAnnotationHeader barcodeArInfoAnnotationHeader, Object obj) {
        Function0 function0 = (Function0) barcodeArInfoAnnotationHeader.f120328a.get();
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final int getBackgroundColor() {
        return getValue(this, f120327h[5]).intValue();
    }

    public final ScanditIcon getIcon() {
        return getValue(this, f120327h[1]);
    }

    public final String getText() {
        return getValue(this, f120327h[0]);
    }

    public final int getTextColor() {
        return getValue(this, f120327h[4]).intValue();
    }

    public final float getTextSize() {
        return getValue(this, f120327h[2]).floatValue();
    }

    public final Typeface getTypeface() {
        return getValue(this, f120327h[3]);
    }

    public final void setBackgroundColor(int i10) {
        setValue(this, f120327h[5], Integer.valueOf(i10));
    }

    public final void setIcon(ScanditIcon scanditIcon) {
        setValue(this, f120327h[1], scanditIcon);
    }

    public final void setPropertyChangedListener$scandit_barcode_capture(Function0<Unit> listener) {
        Intrinsics.j(listener, "listener");
        this.f120328a = new WeakReference(listener);
    }

    public final void setText(String str) {
        setValue(this, f120327h[0], str);
    }

    public final void setTextColor(int i10) {
        setValue(this, f120327h[4], Integer.valueOf(i10));
    }

    public final void setTextSize(float f10) {
        setValue(this, f120327h[2], Float.valueOf(f10));
    }

    public final void setTypeface(Typeface typeface) {
        Intrinsics.j(typeface, "<set-?>");
        setValue(this, f120327h[3], typeface);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$2] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$3] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$4] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$5] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$6] */
    public BarcodeArInfoAnnotationHeader() {
        final String defaultInfoAnnotationHeaderText = BarcodeArViewDefaults.getDefaultInfoAnnotationHeaderText();
        Delegates delegates = Delegates.f142874a;
        this.f120329b = new ObservableProperty<String>(defaultInfoAnnotationHeaderText) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, String oldValue, String newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationHeader.access$propertyChanged(this, newValue);
            }
        };
        final ScanditIcon defaultInfoAnnotationHeaderIcon = BarcodeArViewDefaults.getDefaultInfoAnnotationHeaderIcon();
        this.f120330c = new ObservableProperty<ScanditIcon>(defaultInfoAnnotationHeaderIcon) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$2
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, ScanditIcon oldValue, ScanditIcon newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationHeader.access$propertyChanged(this, newValue);
            }
        };
        final Float fValueOf = Float.valueOf(BarcodeArViewDefaults.getDefaultInfoAnnotationHeaderTextSize());
        this.f120331d = new ObservableProperty<Float>(fValueOf) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$3
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Float oldValue, Float newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationHeader.access$propertyChanged(this, Float.valueOf(newValue.floatValue()));
            }
        };
        final Typeface defaultInfoAnnotationHeaderTypeface = BarcodeArViewDefaults.getDefaultInfoAnnotationHeaderTypeface();
        this.f120332e = new ObservableProperty<Typeface>(defaultInfoAnnotationHeaderTypeface) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$4
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Typeface oldValue, Typeface newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationHeader.access$propertyChanged(this, newValue);
            }
        };
        final Integer numValueOf = Integer.valueOf(BarcodeArViewDefaults.getDefaultInfoAnnotationHeaderTextColor());
        this.f120333f = new ObservableProperty<Integer>(numValueOf) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$5
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationHeader.access$propertyChanged(this, Integer.valueOf(newValue.intValue()));
            }
        };
        final Integer numValueOf2 = Integer.valueOf(BarcodeArViewDefaults.getDefaultInfoAnnotationHeaderBackgroundColor());
        this.f120334g = new ObservableProperty<Integer>(numValueOf2) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationHeader$special$$inlined$distinctObservable$6
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationHeader.access$propertyChanged(this, Integer.valueOf(newValue.intValue()));
            }
        };
    }

    public int hashCode() {
        int iHashCode;
        String text = getText();
        int iHashCode2 = 0;
        if (text != null) {
            iHashCode = text.hashCode();
        } else {
            iHashCode = 0;
        }
        int i10 = iHashCode * 31;
        ScanditIcon icon = getIcon();
        if (icon != null) {
            iHashCode2 = icon.hashCode();
        }
        return getBackgroundColor() + ((getTextColor() + ((getTypeface().hashCode() + ((Float.hashCode(getTextSize()) + ((i10 + iHashCode2) * 31)) * 31)) * 31)) * 31);
    }
}
