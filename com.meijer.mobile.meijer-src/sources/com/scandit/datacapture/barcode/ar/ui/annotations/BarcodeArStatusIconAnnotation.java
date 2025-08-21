package com.scandit.datacapture.barcode.ar.ui.annotations;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.scandit.datacapture.barcode.ar.ui.BarcodeArViewDefaults;
import com.scandit.datacapture.barcode.ar.ui.annotations.statusicon.BarcodeArStatusIconAnnotationAnchor;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.internal.sdk.ui.icon.ScanditIconUtilsKt;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 S2\u00020\u0001:\u0001SB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R.\u00107\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010C\u001a\u0002088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>R+\u0010J\u001a\u00020D2\u0006\u0010\u001f\u001a\u00020D8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010!\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR*\u0010R\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010K8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010Q¨\u0006T"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArStatusIconAnnotation;", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotation;", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/barcode/data/Barcode;", "barcode", "<init>", "(Landroid/content/Context;Lcom/scandit/datacapture/barcode/data/Barcode;)V", "Landroid/view/View;", "createView", "()Landroid/view/View;", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "barcodeLocation", "highlightViewLocation", "view", "", "update", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;Landroid/view/View;)V", "b", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "c", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "getAnnotationTrigger", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "setAnnotationTrigger", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;)V", "annotationTrigger", "", "<set-?>", "e", "Lkotlin/properties/ReadWriteProperty;", "getHasTip", "()Z", "setHasTip", "(Z)V", "hasTip", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "f", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "getIcon", "()Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "setIcon", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;)V", BarcodePickDeserializer.FIELD_ICON, "", "value", "g", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "", "h", "I", "getTextColor", "()I", "setTextColor", "(I)V", "textColor", "i", "getBackgroundColor", "setBackgroundColor", "backgroundColor", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/statusicon/BarcodeArStatusIconAnnotationAnchor;", "j", "getAnchor", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/statusicon/BarcodeArStatusIconAnnotationAnchor;", "setAnchor", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/statusicon/BarcodeArStatusIconAnnotationAnchor;)V", "anchor", "Lkotlin/Function0;", "k", "Lkotlin/jvm/functions/Function0;", "getOnAnnotationOrElementTap$scandit_barcode_capture", "()Lkotlin/jvm/functions/Function0;", "setOnAnnotationOrElementTap$scandit_barcode_capture", "(Lkotlin/jvm/functions/Function0;)V", "onAnnotationOrElementTap", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class BarcodeArStatusIconAnnotation implements BarcodeArAnnotation {

    /* renamed from: a, reason: collision with root package name */
    private final Context f121221a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Barcode barcode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private BarcodeArAnnotationTrigger annotationTrigger;

    /* renamed from: d, reason: collision with root package name */
    private boolean f121224d;

    /* renamed from: e, reason: collision with root package name */
    private final BarcodeArStatusIconAnnotation$special$$inlined$distinctObservable$1 f121225e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ScanditIcon icon;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String text;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int textColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int backgroundColor;

    /* renamed from: j, reason: collision with root package name */
    private final BarcodeArStatusIconAnnotation$special$$inlined$distinctObservable$2 f121230j;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private /* synthetic */ Function0 onAnnotationOrElementTap;

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f121220l = {a.a(BarcodeArStatusIconAnnotation.class, "hasTip", "getHasTip()Z", 0), a.a(BarcodeArStatusIconAnnotation.class, "anchor", "getAnchor()Lcom/scandit/datacapture/barcode/ar/ui/annotations/statusicon/BarcodeArStatusIconAnnotationAnchor;", 0)};

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(View view) {
        Intrinsics.j(view, "$view");
        ((com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon.s) view).setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArStatusIconAnnotation$special$$inlined$distinctObservable$1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArStatusIconAnnotation$special$$inlined$distinctObservable$2] */
    public BarcodeArStatusIconAnnotation(Context context, Barcode barcode) {
        Intrinsics.j(context, "context");
        Intrinsics.j(barcode, "barcode");
        this.f121221a = context;
        this.barcode = barcode;
        this.annotationTrigger = BarcodeArViewDefaults.getDefaultStatusIconAnnotationTrigger();
        this.f121224d = true;
        final Boolean boolValueOf = Boolean.valueOf(BarcodeArViewDefaults.getDefaultStatusIconAnnotationHasTip());
        Delegates delegates = Delegates.f143781a;
        this.f121225e = new ObservableProperty<Boolean>(boolValueOf) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArStatusIconAnnotation$special$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                newValue.getClass();
                this.f121224d = true;
            }
        };
        this.icon = BarcodeArViewDefaults.getDefaultStatusIconAnnotationIcon();
        this.text = BarcodeArViewDefaults.getDefaultStatusIconAnnotationText();
        this.textColor = BarcodeArViewDefaults.getDefaultStatusIconAnnotationTextColor();
        this.backgroundColor = BarcodeArViewDefaults.getDefaultStatusIconAnnotationBackgroundColor();
        final BarcodeArStatusIconAnnotationAnchor defaultStatusIconAnnotationAnchor = BarcodeArViewDefaults.getDefaultStatusIconAnnotationAnchor();
        this.f121230j = new ObservableProperty<BarcodeArStatusIconAnnotationAnchor>(defaultStatusIconAnnotationAnchor) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArStatusIconAnnotation$special$$inlined$distinctObservable$2
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, BarcodeArStatusIconAnnotationAnchor oldValue, BarcodeArStatusIconAnnotationAnchor newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                this.f121224d = true;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon.s statusIconView, BarcodeArStatusIconAnnotation this$0, View view) {
        Intrinsics.j(statusIconView, "$statusIconView");
        Intrinsics.j(this$0, "this$0");
        statusIconView.f122128b.a();
        Function0 function0 = this$0.onAnnotationOrElementTap;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation
    public View createView() {
        final com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon.s sVar = new com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon.s(this.f121221a, this.barcode);
        sVar.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BarcodeArStatusIconAnnotation.a(sVar, this, view);
            }
        });
        sVar.setVisibility(4);
        return sVar;
    }

    public final BarcodeArStatusIconAnnotationAnchor getAnchor() {
        return getValue(this, f121220l[1]);
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation
    public BarcodeArAnnotationTrigger getAnnotationTrigger() {
        return this.annotationTrigger;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Barcode getBarcode() {
        return this.barcode;
    }

    public final boolean getHasTip() {
        return getValue(this, f121220l[0]).booleanValue();
    }

    public final ScanditIcon getIcon() {
        return this.icon;
    }

    public final Function0<Unit> getOnAnnotationOrElementTap$scandit_barcode_capture() {
        return this.onAnnotationOrElementTap;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final void setAnchor(BarcodeArStatusIconAnnotationAnchor barcodeArStatusIconAnnotationAnchor) {
        Intrinsics.j(barcodeArStatusIconAnnotationAnchor, "<set-?>");
        setValue(this, f121220l[1], barcodeArStatusIconAnnotationAnchor);
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation
    public void setAnnotationTrigger(BarcodeArAnnotationTrigger barcodeArAnnotationTrigger) {
        Intrinsics.j(barcodeArAnnotationTrigger, "<set-?>");
        this.annotationTrigger = barcodeArAnnotationTrigger;
    }

    public final void setBackgroundColor(int i10) {
        this.backgroundColor = i10;
    }

    public final void setHasTip(boolean z10) {
        setValue(this, f121220l[0], Boolean.valueOf(z10));
    }

    public final void setIcon(ScanditIcon scanditIcon) {
        Intrinsics.j(scanditIcon, "<set-?>");
        this.icon = scanditIcon;
    }

    public final void setOnAnnotationOrElementTap$scandit_barcode_capture(Function0<Unit> function0) {
        this.onAnnotationOrElementTap = function0;
    }

    public final void setText(String str) {
        if (str != null) {
            Intrinsics.j(str, "<this>");
            List<String> listA0 = StringsKt.A0(str);
            if (listA0.size() > 1) {
                str = CollectionsKt.B0(CollectionsKt.b1(listA0, 1), "\n", null, "…", 0, null, null, 58, null);
            }
            if (str.length() > 20) {
                str = StringsKt.C1(StringsKt.N1(str, 20)).toString() + (char) 8230;
            }
        } else {
            str = null;
        }
        this.text = str;
    }

    public final void setTextColor(int i10) {
        this.textColor = i10;
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation
    public void update(Quadrilateral barcodeLocation, Quadrilateral highlightViewLocation, final View view) {
        Intrinsics.j(barcodeLocation, "barcodeLocation");
        Intrinsics.j(view, "view");
        com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon.s sVar = view instanceof com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon.s ? (com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon.s) view : null;
        if (sVar != null) {
            if (this.f121224d) {
                this.f121224d = false;
                sVar.a(getAnchor(), getHasTip());
            }
            boolean hasTip = getHasTip();
            ScanditIcon icon = this.icon;
            String str = this.text;
            int i10 = this.textColor;
            int i11 = this.backgroundColor;
            Intrinsics.j(icon, "icon");
            com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon.a aVar = sVar.f122128b;
            aVar.getClass();
            Intrinsics.j(icon, "icon");
            Drawable background = aVar.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i11);
            }
            ImageView imageView = aVar.f122097b;
            Context context = aVar.getContext();
            Intrinsics.i(context, "getContext(...)");
            imageView.setImageDrawable(ScanditIconUtilsKt.getDrawable(icon, context));
            aVar.f122096a.setText(str);
            aVar.f122096a.setTextColor(i10);
            com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip.a aVar2 = sVar.f122127a;
            aVar2.getClass();
            aVar2.setVisibility(hasTip ? 0 : 8);
            aVar2.setColorFilter(i11, PorterDuff.Mode.SRC_IN);
            sVar.setLayoutParams(new FrameLayout.LayoutParams(-2, hasTip ? ((Number) com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon.l.f122118j.getValue()).intValue() : ((Number) com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon.l.f122117i.getValue()).intValue()));
            if (highlightViewLocation != null) {
                barcodeLocation = highlightViewLocation;
            }
            boolean zA = sVar.a(QuadrilateralUtilsKt.orderVerticesByPosition(barcodeLocation), getAnchor());
            if (((com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon.s) view).getVisibility() == 4 && zA) {
                view.post(new Runnable() { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        BarcodeArStatusIconAnnotation.a(view);
                    }
                });
            }
        }
    }
}
