package com.scandit.datacapture.barcode.ar.ui.highlight;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.ar.ui.BarcodeArViewDefaults;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.module.ui.animation.PulsingView;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.internal.sdk.ui.icon.ScanditIconUtilsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 F2\u00020\u0001:\u0001FB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010/\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020(8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00103\u001a\u0002002\u0006\u0010\u0018\u001a\u0002008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u0010<\u001a\u00020(8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b7\u0010*\u0012\u0004\b:\u0010;\u001a\u0004\b8\u0010,\"\u0004\b9\u0010.R*\u0010E\u001a\u0004\u0018\u00010=8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\bD\u0010;\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArCircleHighlight;", "Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArHighlight;", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/barcode/data/Barcode;", "barcode", "Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArCircleHighlightPreset;", "preset", "<init>", "(Landroid/content/Context;Lcom/scandit/datacapture/barcode/data/Barcode;Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArCircleHighlightPreset;)V", "Landroid/view/View;", "view", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "barcodeLocation", "", "update", "(Landroid/view/View;Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;)V", "createView", "()Landroid/view/View;", "b", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "Lcom/scandit/datacapture/core/ui/style/Brush;", "value", "c", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "setBrush", "(Lcom/scandit/datacapture/core/ui/style/Brush;)V", "brush", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "d", "Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "getIcon", "()Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "setIcon", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;)V", BarcodePickDeserializer.FIELD_ICON, "", "e", "F", "getSize", "()F", "setSize", "(F)V", "size", "", "f", "Z", "isPulsing", "()Z", "setPulsing", "(Z)V", "h", "getSizeInPx$scandit_barcode_capture", "setSizeInPx$scandit_barcode_capture", "getSizeInPx$scandit_barcode_capture$annotations", "()V", "sizeInPx", "Lcom/scandit/datacapture/barcode/internal/module/ui/animation/PulsingView;", "i", "Lcom/scandit/datacapture/barcode/internal/module/ui/animation/PulsingView;", "getPulsingView$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/ui/animation/PulsingView;", "setPulsingView$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/ui/animation/PulsingView;)V", "getPulsingView$scandit_barcode_capture$annotations", "pulsingView", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeArCircleHighlight implements BarcodeArHighlight {
    public static final float MIN_SIZE_DP = 18.0f;

    /* renamed from: a, reason: collision with root package name */
    private final Context f120379a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Barcode barcode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Brush brush;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ScanditIcon icon;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float size;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isPulsing;

    /* renamed from: g, reason: collision with root package name */
    private GradientDrawable f120385g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float sizeInPx;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private PulsingView pulsingView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    private static final Lazy f120378j = LazyKt.b(a.f120399a);

    public static /* synthetic */ void getPulsingView$scandit_barcode_capture$annotations() {
    }

    public static /* synthetic */ void getSizeInPx$scandit_barcode_capture$annotations() {
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R!\u0010\r\u001a\u00020\u00078@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/highlight/BarcodeArCircleHighlight$Companion;", "", "", "MIN_SIZE_DP", "F", "getMIN_SIZE_DP$scandit_barcode_capture$annotations", "()V", "", "ADDED_PULSE_SIZE$delegate", "Lkotlin/Lazy;", "getADDED_PULSE_SIZE$scandit_barcode_capture", "()I", "getADDED_PULSE_SIZE$scandit_barcode_capture$annotations", "ADDED_PULSE_SIZE", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public static /* synthetic */ void getADDED_PULSE_SIZE$scandit_barcode_capture$annotations() {
        }

        public static /* synthetic */ void getMIN_SIZE_DP$scandit_barcode_capture$annotations() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final int getADDED_PULSE_SIZE$scandit_barcode_capture() {
            return ((Number) BarcodeArCircleHighlight.f120378j.getValue()).intValue();
        }
    }

    public BarcodeArCircleHighlight(Context context, Barcode barcode, BarcodeArCircleHighlightPreset preset) {
        Intrinsics.j(context, "context");
        Intrinsics.j(barcode, "barcode");
        Intrinsics.j(preset, "preset");
        this.f120379a = context;
        this.barcode = barcode;
        this.brush = BarcodeArViewDefaults.getDefaultCircleHighlightBrushFromPreset(preset);
        this.icon = BarcodeArViewDefaults.getDefaultHighlightIcon();
        this.size = BarcodeArViewDefaults.getDefaultCircleHighlightSizeFromPreset(preset);
        this.isPulsing = BarcodeArViewDefaults.getDefaultHighlightIsPulsing();
        Brush brush = this.brush;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke((int) PixelExtensionsKt.pxFromDp$default(brush.getStrokeWidth(), (Context) null, 1, (Object) null), ColorStateList.valueOf(brush.getStrokeColor()));
        gradientDrawable.setColor(brush.getFillColor());
        this.f120385g = gradientDrawable;
        this.sizeInPx = PixelExtensionsKt.pxFromDp$default(this.size, (Context) null, 1, (Object) null);
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.highlight.BarcodeArHighlight
    public View createView() {
        FrameLayout container = new FrameLayout(this.f120379a);
        container.setBackground(this.f120385g);
        container.setContentDescription(container.getResources().getString(R.string.sc_barcode_ar_highlight_circle_content_description, this.barcode.getData()));
        View imageView = new ImageView(container.getContext());
        imageView.setId(R.id.sc_ar_circle_highlight_icon);
        int i10 = (int) (this.sizeInPx / 2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i10);
        layoutParams.gravity = 17;
        container.addView(imageView, layoutParams);
        int i11 = PulsingView.f123291h;
        int aDDED_PULSE_SIZE$scandit_barcode_capture = (int) (this.sizeInPx + INSTANCE.getADDED_PULSE_SIZE$scandit_barcode_capture());
        int i12 = (int) this.sizeInPx;
        int fillColor = this.brush.getFillColor();
        Intrinsics.j(container, "container");
        int[] gradientColors = {com.scandit.datacapture.barcode.internal.module.extensions.a.a(fillColor, 0), com.scandit.datacapture.barcode.internal.module.extensions.a.a(fillColor, 0), fillColor};
        Intrinsics.j(container, "container");
        Intrinsics.j(gradientColors, "gradientColors");
        Context context = container.getContext();
        Intrinsics.i(context, "getContext(...)");
        PulsingView pulsingView = new PulsingView(context, aDDED_PULSE_SIZE$scandit_barcode_capture, i12, gradientColors);
        container.addView(pulsingView, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(aDDED_PULSE_SIZE$scandit_barcode_capture, aDDED_PULSE_SIZE$scandit_barcode_capture);
        layoutParams2.gravity = 17;
        pulsingView.setLayoutParams(layoutParams2);
        this.pulsingView = pulsingView;
        if (this.isPulsing) {
            pulsingView.start();
        } else {
            pulsingView.stop();
        }
        container.setClipChildren(false);
        container.setClipToOutline(false);
        return container;
    }

    public final Barcode getBarcode() {
        return this.barcode;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final ScanditIcon getIcon() {
        return this.icon;
    }

    /* renamed from: getPulsingView$scandit_barcode_capture, reason: from getter */
    public final PulsingView getPulsingView() {
        return this.pulsingView;
    }

    public final float getSize() {
        return this.size;
    }

    /* renamed from: getSizeInPx$scandit_barcode_capture, reason: from getter */
    public final float getSizeInPx() {
        return this.sizeInPx;
    }

    /* renamed from: isPulsing, reason: from getter */
    public final boolean getIsPulsing() {
        return this.isPulsing;
    }

    public final void setBrush(Brush value) {
        Intrinsics.j(value, "value");
        this.brush = value;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke((int) PixelExtensionsKt.pxFromDp$default(value.getStrokeWidth(), (Context) null, 1, (Object) null), ColorStateList.valueOf(value.getStrokeColor()));
        gradientDrawable.setColor(value.getFillColor());
        this.f120385g = gradientDrawable;
    }

    public final void setIcon(ScanditIcon scanditIcon) {
        this.icon = scanditIcon;
    }

    public final void setPulsing(boolean z10) {
        this.isPulsing = z10;
        if (z10) {
            PulsingView pulsingView = this.pulsingView;
            if (pulsingView != null) {
                pulsingView.start();
                return;
            }
            return;
        }
        PulsingView pulsingView2 = this.pulsingView;
        if (pulsingView2 != null) {
            pulsingView2.stop();
        }
    }

    public final void setPulsingView$scandit_barcode_capture(PulsingView pulsingView) {
        this.pulsingView = pulsingView;
    }

    public final void setSize(float f10) {
        float fE = RangesKt.e(f10, 18.0f);
        this.size = fE;
        this.sizeInPx = PixelExtensionsKt.pxFromDp$default(fE, (Context) null, 1, (Object) null);
    }

    public final void setSizeInPx$scandit_barcode_capture(float f10) {
        this.sizeInPx = f10;
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.highlight.BarcodeArHighlight
    public void update(View view, Quadrilateral barcodeLocation) {
        ImageView imageView;
        Intrinsics.j(view, "view");
        Intrinsics.j(barcodeLocation, "barcodeLocation");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        int i10 = (int) this.sizeInPx;
        layoutParams.width = i10;
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
        view.setX(QuadrilateralUtilsKt.getCenter(barcodeLocation).getX() - (layoutParams.width / 2.0f));
        view.setY(QuadrilateralUtilsKt.getCenter(barcodeLocation).getY() - (layoutParams.height / 2.0f));
        PulsingView pulsingView = this.pulsingView;
        if (pulsingView != null) {
            int fillColor = this.brush.getFillColor();
            pulsingView.a(new int[]{com.scandit.datacapture.barcode.internal.module.extensions.a.a(fillColor, 0), com.scandit.datacapture.barcode.internal.module.extensions.a.a(fillColor, 0), fillColor});
            pulsingView.invalidate();
        }
        PulsingView pulsingView2 = this.pulsingView;
        if (pulsingView2 != null) {
            pulsingView2.b((int) (this.sizeInPx + INSTANCE.getADDED_PULSE_SIZE$scandit_barcode_capture()));
        }
        PulsingView pulsingView3 = this.pulsingView;
        if (pulsingView3 != null) {
            pulsingView3.a((int) this.sizeInPx);
        }
        view.setBackground(this.f120385g);
        ScanditIcon scanditIcon = this.icon;
        if (scanditIcon == null || (imageView = (ImageView) view.findViewById(R.id.sc_ar_circle_highlight_icon)) == null) {
            return;
        }
        Intrinsics.g(imageView);
        Context context = imageView.getContext();
        Intrinsics.i(context, "getContext(...)");
        imageView.setImageDrawable(ScanditIconUtilsKt.getDrawableIgnoringBackground(scanditIcon, context));
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        int i11 = (int) (this.sizeInPx / 2);
        layoutParams2.width = i11;
        layoutParams2.height = i11;
        imageView.setLayoutParams(layoutParams2);
    }
}
