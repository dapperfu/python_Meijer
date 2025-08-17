package com.scandit.datacapture.barcode.ar.ui.annotations.info;

import android.graphics.Typeface;
import com.scandit.datacapture.barcode.ar.ui.BarcodeArViewDefaults;
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

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R/\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010 \u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010'\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010,\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u0014\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010+R+\u00100\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010\u0014\u001a\u0004\b.\u0010\u0010\"\u0004\b/\u0010+R/\u00107\u001a\u0004\u0018\u0001012\b\u0010\u0012\u001a\u0004\u0018\u0001018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0014\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u00109\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010\u0014\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R/\u0010C\u001a\u0004\u0018\u00010=2\b\u0010\u0012\u001a\u0004\u0018\u00010=8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\u0014\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR+\u0010E\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\u0014\u001a\u0004\bE\u0010:\"\u0004\bF\u0010<R/\u0010J\u001a\u0004\u0018\u00010=2\b\u0010\u0012\u001a\u0004\u0018\u00010=8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010\u0014\u001a\u0004\bH\u0010@\"\u0004\bI\u0010B¨\u0006K"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/info/BarcodeArInfoAnnotationBodyComponent;", "", "<init>", "()V", "Lkotlin/Function0;", "", "listener", "setPropertyChangedListener$scandit_barcode_capture", "(Lkotlin/jvm/functions/Function0;)V", "setPropertyChangedListener", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "<set-?>", "b", "Lkotlin/properties/ReadWriteProperty;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "Landroid/graphics/Typeface;", "c", "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "typeface", "", "d", "getTextSize", "()F", "setTextSize", "(F)V", "textSize", "e", "getTextColor", "setTextColor", "(I)V", "textColor", "f", "getTextAlignment", "setTextAlignment", "textAlignment", "", "g", "getStyledText", "()Ljava/lang/CharSequence;", "setStyledText", "(Ljava/lang/CharSequence;)V", "styledText", "h", "isLeftIconTappable", "()Z", "setLeftIconTappable", "(Z)V", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "i", "getLeftIcon", "()Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "setLeftIcon", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;)V", "leftIcon", "j", "isRightIconTappable", "setRightIconTappable", "k", "getRightIcon", "setRightIcon", "rightIcon", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BarcodeArInfoAnnotationBodyComponent {

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f120291l = {com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationBodyComponent.class, "text", "getText()Ljava/lang/String;", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationBodyComponent.class, "typeface", "getTypeface()Landroid/graphics/Typeface;", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationBodyComponent.class, "textSize", "getTextSize()F", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationBodyComponent.class, "textColor", "getTextColor()I", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationBodyComponent.class, "textAlignment", "getTextAlignment()I", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationBodyComponent.class, "styledText", "getStyledText()Ljava/lang/CharSequence;", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationBodyComponent.class, "isLeftIconTappable", "isLeftIconTappable()Z", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationBodyComponent.class, "leftIcon", "getLeftIcon()Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationBodyComponent.class, "isRightIconTappable", "isRightIconTappable()Z", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArInfoAnnotationBodyComponent.class, "rightIcon", "getRightIcon()Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private WeakReference f120292a = new WeakReference(a.f120343a);

    /* renamed from: b, reason: collision with root package name */
    private final BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$1 f120293b;

    /* renamed from: c, reason: collision with root package name */
    private final BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$2 f120294c;

    /* renamed from: d, reason: collision with root package name */
    private final BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$3 f120295d;

    /* renamed from: e, reason: collision with root package name */
    private final BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$4 f120296e;

    /* renamed from: f, reason: collision with root package name */
    private final BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$5 f120297f;

    /* renamed from: g, reason: collision with root package name */
    private final BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$6 f120298g;

    /* renamed from: h, reason: collision with root package name */
    private final BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$7 f120299h;

    /* renamed from: i, reason: collision with root package name */
    private final BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$8 f120300i;

    /* renamed from: j, reason: collision with root package name */
    private final BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$9 f120301j;

    /* renamed from: k, reason: collision with root package name */
    private final BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$10 f120302k;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(BarcodeArInfoAnnotationBodyComponent.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent");
        BarcodeArInfoAnnotationBodyComponent barcodeArInfoAnnotationBodyComponent = (BarcodeArInfoAnnotationBodyComponent) other;
        return Intrinsics.e(getText(), barcodeArInfoAnnotationBodyComponent.getText()) && Intrinsics.e(getTypeface(), barcodeArInfoAnnotationBodyComponent.getTypeface()) && getTextSize() == barcodeArInfoAnnotationBodyComponent.getTextSize() && getTextColor() == barcodeArInfoAnnotationBodyComponent.getTextColor() && getTextAlignment() == barcodeArInfoAnnotationBodyComponent.getTextAlignment() && Intrinsics.e(getStyledText(), barcodeArInfoAnnotationBodyComponent.getStyledText()) && isLeftIconTappable() == barcodeArInfoAnnotationBodyComponent.isLeftIconTappable() && Intrinsics.e(getLeftIcon(), barcodeArInfoAnnotationBodyComponent.getLeftIcon()) && isRightIconTappable() == barcodeArInfoAnnotationBodyComponent.isRightIconTappable() && Intrinsics.e(getRightIcon(), barcodeArInfoAnnotationBodyComponent.getRightIcon());
    }

    public static final void access$propertyChanged(BarcodeArInfoAnnotationBodyComponent barcodeArInfoAnnotationBodyComponent, Object obj) {
        Function0 function0 = (Function0) barcodeArInfoAnnotationBodyComponent.f120292a.get();
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final ScanditIcon getLeftIcon() {
        return getValue(this, f120291l[7]);
    }

    public final ScanditIcon getRightIcon() {
        return getValue(this, f120291l[9]);
    }

    public final CharSequence getStyledText() {
        return getValue(this, f120291l[5]);
    }

    public final String getText() {
        return getValue(this, f120291l[0]);
    }

    public final int getTextAlignment() {
        return getValue(this, f120291l[4]).intValue();
    }

    public final int getTextColor() {
        return getValue(this, f120291l[3]).intValue();
    }

    public final float getTextSize() {
        return getValue(this, f120291l[2]).floatValue();
    }

    public final Typeface getTypeface() {
        return getValue(this, f120291l[1]);
    }

    public final boolean isLeftIconTappable() {
        return getValue(this, f120291l[6]).booleanValue();
    }

    public final boolean isRightIconTappable() {
        return getValue(this, f120291l[8]).booleanValue();
    }

    public final void setLeftIcon(ScanditIcon scanditIcon) {
        setValue(this, f120291l[7], scanditIcon);
    }

    public final void setLeftIconTappable(boolean z10) {
        setValue(this, f120291l[6], Boolean.valueOf(z10));
    }

    public final void setPropertyChangedListener$scandit_barcode_capture(Function0<Unit> listener) {
        Intrinsics.j(listener, "listener");
        this.f120292a = new WeakReference(listener);
    }

    public final void setRightIcon(ScanditIcon scanditIcon) {
        setValue(this, f120291l[9], scanditIcon);
    }

    public final void setRightIconTappable(boolean z10) {
        setValue(this, f120291l[8], Boolean.valueOf(z10));
    }

    public final void setStyledText(CharSequence charSequence) {
        setValue(this, f120291l[5], charSequence);
    }

    public final void setText(String str) {
        setValue(this, f120291l[0], str);
    }

    public final void setTextAlignment(int i10) {
        setValue(this, f120291l[4], Integer.valueOf(i10));
    }

    public final void setTextColor(int i10) {
        setValue(this, f120291l[3], Integer.valueOf(i10));
    }

    public final void setTextSize(float f10) {
        setValue(this, f120291l[2], Float.valueOf(f10));
    }

    public final void setTypeface(Typeface typeface) {
        Intrinsics.j(typeface, "<set-?>");
        setValue(this, f120291l[1], typeface);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$9] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$10] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$1] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$2] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$3] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$4] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$5] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$6] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$7] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$8] */
    public BarcodeArInfoAnnotationBodyComponent() {
        final String defaultInfoAnnotationBodyElementText = BarcodeArViewDefaults.getDefaultInfoAnnotationBodyElementText();
        Delegates delegates = Delegates.f142874a;
        this.f120293b = new ObservableProperty<String>(defaultInfoAnnotationBodyElementText) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, String oldValue, String newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationBodyComponent.access$propertyChanged(this, newValue);
            }
        };
        final Typeface defaultInfoAnnotationBodyElementTypeface = BarcodeArViewDefaults.getDefaultInfoAnnotationBodyElementTypeface();
        this.f120294c = new ObservableProperty<Typeface>(defaultInfoAnnotationBodyElementTypeface) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$2
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Typeface oldValue, Typeface newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationBodyComponent.access$propertyChanged(this, newValue);
            }
        };
        final Float fValueOf = Float.valueOf(BarcodeArViewDefaults.getDefaultInfoAnnotationBodyElementTextSize());
        this.f120295d = new ObservableProperty<Float>(fValueOf) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$3
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Float oldValue, Float newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationBodyComponent.access$propertyChanged(this, Float.valueOf(newValue.floatValue()));
            }
        };
        final Integer numValueOf = Integer.valueOf(BarcodeArViewDefaults.getDefaultInfoAnnotationBodyElementTextColor());
        this.f120296e = new ObservableProperty<Integer>(numValueOf) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$4
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationBodyComponent.access$propertyChanged(this, Integer.valueOf(newValue.intValue()));
            }
        };
        final Integer numValueOf2 = Integer.valueOf(BarcodeArViewDefaults.getDefaultInfoAnnotationBodyElementTextAlignment());
        this.f120297f = new ObservableProperty<Integer>(numValueOf2) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$5
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationBodyComponent.access$propertyChanged(this, Integer.valueOf(newValue.intValue()));
            }
        };
        final CharSequence defaultInfoAnnotationBodyElementStyledText = BarcodeArViewDefaults.getDefaultInfoAnnotationBodyElementStyledText();
        this.f120298g = new ObservableProperty<CharSequence>(defaultInfoAnnotationBodyElementStyledText) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$6
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, CharSequence oldValue, CharSequence newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationBodyComponent.access$propertyChanged(this, newValue);
            }
        };
        final Boolean boolValueOf = Boolean.valueOf(BarcodeArViewDefaults.getDefaultInfoAnnotationBodyElementLeftIconTappable());
        this.f120299h = new ObservableProperty<Boolean>(boolValueOf) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$7
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                Boolean bool = newValue;
                bool.getClass();
                BarcodeArInfoAnnotationBodyComponent.access$propertyChanged(this, bool);
            }
        };
        final ScanditIcon defaultInfoAnnotationBodyElementLeftIcon = BarcodeArViewDefaults.getDefaultInfoAnnotationBodyElementLeftIcon();
        this.f120300i = new ObservableProperty<ScanditIcon>(defaultInfoAnnotationBodyElementLeftIcon) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$8
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, ScanditIcon oldValue, ScanditIcon newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationBodyComponent.access$propertyChanged(this, newValue);
            }
        };
        final Boolean boolValueOf2 = Boolean.valueOf(BarcodeArViewDefaults.getDefaultInfoAnnotationBodyElementRightIconTappable());
        this.f120301j = new ObservableProperty<Boolean>(boolValueOf2) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$9
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                Boolean bool = newValue;
                bool.getClass();
                BarcodeArInfoAnnotationBodyComponent.access$propertyChanged(this, bool);
            }
        };
        final ScanditIcon defaultInfoAnnotationBodyElementRightIcon = BarcodeArViewDefaults.getDefaultInfoAnnotationBodyElementRightIcon();
        this.f120302k = new ObservableProperty<ScanditIcon>(defaultInfoAnnotationBodyElementRightIcon) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyComponent$special$$inlined$distinctObservable$10
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, ScanditIcon oldValue, ScanditIcon newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArInfoAnnotationBodyComponent.access$propertyChanged(this, newValue);
            }
        };
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        String text = getText();
        int iHashCode4 = 0;
        if (text != null) {
            iHashCode = text.hashCode();
        } else {
            iHashCode = 0;
        }
        int textAlignment = (getTextAlignment() + ((getTextColor() + ((Float.hashCode(getTextSize()) + ((getTypeface().hashCode() + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31;
        CharSequence styledText = getStyledText();
        if (styledText != null) {
            iHashCode2 = styledText.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int iHashCode5 = (Boolean.hashCode(isLeftIconTappable()) + ((textAlignment + iHashCode2) * 31)) * 31;
        ScanditIcon leftIcon = getLeftIcon();
        if (leftIcon != null) {
            iHashCode3 = leftIcon.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int iHashCode6 = (Boolean.hashCode(isRightIconTappable()) + ((iHashCode5 + iHashCode3) * 31)) * 31;
        ScanditIcon rightIcon = getRightIcon();
        if (rightIcon != null) {
            iHashCode4 = rightIcon.hashCode();
        }
        return iHashCode6 + iHashCode4;
    }
}
