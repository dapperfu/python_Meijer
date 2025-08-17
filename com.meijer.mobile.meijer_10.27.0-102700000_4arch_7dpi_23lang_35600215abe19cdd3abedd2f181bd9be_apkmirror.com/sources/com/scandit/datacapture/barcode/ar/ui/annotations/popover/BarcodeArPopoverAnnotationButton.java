package com.scandit.datacapture.barcode.ar.ui.annotations.popover;

import android.content.Context;
import android.graphics.Typeface;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.ar.ui.BarcodeArViewDefaults;
import com.scandit.datacapture.barcode.internal.module.ui.popover.LinearPopoverButtonViewSettings;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.internal.sdk.ui.icon.ScanditIconUtilsKt;
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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR+\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020 8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R+\u0010/\u001a\u00020)2\u0006\u0010!\u001a\u00020)8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010#\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u00105\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u0010#\u001a\u0004\b1\u00102\"\u0004\b3\u00104R+\u0010;\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010#\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationButton;", "", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", BarcodePickDeserializer.FIELD_ICON, "", "text", "<init>", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;Ljava/lang/String;)V", "Lkotlin/Function0;", "", "listener", "setPropertyChangedListener$scandit_barcode_capture", "(Lkotlin/jvm/functions/Function0;)V", "setPropertyChangedListener", "", "index", "", "isEntirePopoverTappable", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/barcode/internal/module/ui/popover/LinearPopoverButtonViewSettings;", "getButtonSettings$scandit_barcode_capture", "(IZLandroid/content/Context;)Lcom/scandit/datacapture/barcode/internal/module/ui/popover/LinearPopoverButtonViewSettings;", "getButtonSettings", "a", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "getIcon", "()Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "b", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "", "<set-?>", "d", "Lkotlin/properties/ReadWriteProperty;", "getTextSize", "()F", "setTextSize", "(F)V", "textSize", "Landroid/graphics/Typeface;", "e", "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "typeface", "f", "getTextColor", "()I", "setTextColor", "(I)V", "textColor", "g", "getEnabled", "()Z", "setEnabled", "(Z)V", "enabled", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BarcodeArPopoverAnnotationButton {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f120353h = {com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArPopoverAnnotationButton.class, "textSize", "getTextSize()F", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArPopoverAnnotationButton.class, "typeface", "getTypeface()Landroid/graphics/Typeface;", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArPopoverAnnotationButton.class, "textColor", "getTextColor()I", 0), com.scandit.datacapture.barcode.ar.ui.annotations.a.a(BarcodeArPopoverAnnotationButton.class, "enabled", "getEnabled()Z", 0)};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ScanditIcon icon;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference f120356c;

    /* renamed from: d, reason: collision with root package name */
    private final BarcodeArPopoverAnnotationButton$special$$inlined$distinctObservable$1 f120357d;

    /* renamed from: e, reason: collision with root package name */
    private final BarcodeArPopoverAnnotationButton$special$$inlined$distinctObservable$2 f120358e;

    /* renamed from: f, reason: collision with root package name */
    private final BarcodeArPopoverAnnotationButton$special$$inlined$distinctObservable$3 f120359f;

    /* renamed from: g, reason: collision with root package name */
    private final BarcodeArPopoverAnnotationButton$special$$inlined$distinctObservable$4 f120360g;

    /* JADX WARN: Type inference failed for: r3v3, types: [com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationButton$special$$inlined$distinctObservable$1] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationButton$special$$inlined$distinctObservable$2] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationButton$special$$inlined$distinctObservable$3] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationButton$special$$inlined$distinctObservable$4] */
    public BarcodeArPopoverAnnotationButton(ScanditIcon icon, String text) {
        Intrinsics.j(icon, "icon");
        Intrinsics.j(text, "text");
        this.icon = icon;
        this.text = text;
        this.f120356c = new WeakReference(a.f120365a);
        final Float fValueOf = Float.valueOf(BarcodeArViewDefaults.getDefaultBarcodeArPopoverAnnotationButtonTextSize());
        Delegates delegates = Delegates.f142874a;
        this.f120357d = new ObservableProperty<Float>(fValueOf) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationButton$special$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Float oldValue, Float newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArPopoverAnnotationButton.access$propertyChanged(this, Float.valueOf(newValue.floatValue()));
            }
        };
        final Typeface defaultBarcodeArPopoverAnnotationButtonTypeFace = BarcodeArViewDefaults.getDefaultBarcodeArPopoverAnnotationButtonTypeFace();
        this.f120358e = new ObservableProperty<Typeface>(defaultBarcodeArPopoverAnnotationButtonTypeFace) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationButton$special$$inlined$distinctObservable$2
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Typeface oldValue, Typeface newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArPopoverAnnotationButton.access$propertyChanged(this, newValue);
            }
        };
        final Integer numValueOf = Integer.valueOf(BarcodeArViewDefaults.getDefaultBarcodeArPopoverAnnotationButtonTextColor());
        this.f120359f = new ObservableProperty<Integer>(numValueOf) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationButton$special$$inlined$distinctObservable$3
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Integer oldValue, Integer newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                BarcodeArPopoverAnnotationButton.access$propertyChanged(this, Integer.valueOf(newValue.intValue()));
            }
        };
        final Boolean boolValueOf = Boolean.valueOf(BarcodeArViewDefaults.getDefaultBarcodeArPopoverAnnotationButtonEnabled());
        this.f120360g = new ObservableProperty<Boolean>(boolValueOf) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationButton$special$$inlined$distinctObservable$4
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                Boolean bool = newValue;
                bool.getClass();
                BarcodeArPopoverAnnotationButton.access$propertyChanged(this, bool);
            }
        };
    }

    public static final void access$propertyChanged(BarcodeArPopoverAnnotationButton barcodeArPopoverAnnotationButton, Object obj) {
        Function0 function0 = (Function0) barcodeArPopoverAnnotationButton.f120356c.get();
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final /* synthetic */ LinearPopoverButtonViewSettings getButtonSettings$scandit_barcode_capture(int index, boolean isEntirePopoverTappable, Context context) {
        Intrinsics.j(context, "context");
        return new LinearPopoverButtonViewSettings(index, ScanditIconUtilsKt.getDrawable(this.icon, context), this.text, isEntirePopoverTappable ? null : context.getResources().getString(R.string.sc_barcode_ar_annotation_popover_button_content_description, this.text), getTextSize(), getTextColor(), getTypeface(), getEnabled(), !isEntirePopoverTappable, 128);
    }

    public final boolean getEnabled() {
        return getValue(this, f120353h[3]).booleanValue();
    }

    public final ScanditIcon getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return getValue(this, f120353h[2]).intValue();
    }

    public final float getTextSize() {
        return getValue(this, f120353h[0]).floatValue();
    }

    public final Typeface getTypeface() {
        return getValue(this, f120353h[1]);
    }

    public final void setEnabled(boolean z10) {
        setValue(this, f120353h[3], Boolean.valueOf(z10));
    }

    public final void setPropertyChangedListener$scandit_barcode_capture(Function0<Unit> listener) {
        Intrinsics.j(listener, "listener");
        this.f120356c = new WeakReference(listener);
    }

    public final void setTextColor(int i10) {
        setValue(this, f120353h[2], Integer.valueOf(i10));
    }

    public final void setTextSize(float f10) {
        setValue(this, f120353h[0], Float.valueOf(f10));
    }

    public final void setTypeface(Typeface typeface) {
        Intrinsics.j(typeface, "<set-?>");
        setValue(this, f120353h[1], typeface);
    }
}
