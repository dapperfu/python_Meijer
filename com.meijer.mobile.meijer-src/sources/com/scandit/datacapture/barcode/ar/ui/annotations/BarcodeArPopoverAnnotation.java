package com.scandit.datacapture.barcode.ar.ui.annotations;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.ar.ui.BarcodeArViewDefaults;
import com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationAnchor;
import com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationButton;
import com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationListener;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.internal.module.ui.popover.C13393m;
import com.scandit.datacapture.barcode.internal.module.ui.popover.EnumC13390j;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 F2\u00020\u0001:\u0001FB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010)\u001a\u00020%2\u0006\u0010&\u001a\u00020%8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u00105\u001a\u00020-2\u0006\u0010.\u001a\u00020-8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArPopoverAnnotation;", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotation;", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/barcode/data/Barcode;", "barcode", "", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationButton;", "buttons", "<init>", "(Landroid/content/Context;Lcom/scandit/datacapture/barcode/data/Barcode;Ljava/util/List;)V", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "barcodeLocation", "highlightViewLocation", "Landroid/view/View;", "view", "", "update", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;Landroid/view/View;)V", "createView", "()Landroid/view/View;", "b", "Lcom/scandit/datacapture/barcode/data/Barcode;", "getBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "c", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationListener;", "d", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationListener;", "getListener", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationListener;", "setListener", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationListener;)V", "listener", "", "value", "e", "Z", "isEntirePopoverTappable", "()Z", "setEntirePopoverTappable", "(Z)V", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationAnchor;", "<set-?>", "g", "Lkotlin/properties/ReadWriteProperty;", "getAnchor", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationAnchor;", "setAnchor", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationAnchor;)V", "anchor", "Lkotlin/Function0;", "i", "Lkotlin/jvm/functions/Function0;", "getOnAnnotationOrElementTap$scandit_barcode_capture", "()Lkotlin/jvm/functions/Function0;", "setOnAnnotationOrElementTap$scandit_barcode_capture", "(Lkotlin/jvm/functions/Function0;)V", "onAnnotationOrElementTap", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "j", "Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "getAnnotationTrigger", "()Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;", "setAnnotationTrigger", "(Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArAnnotationTrigger;)V", "annotationTrigger", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class BarcodeArPopoverAnnotation implements BarcodeArAnnotation {

    /* renamed from: a, reason: collision with root package name */
    private final Context f121207a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Barcode barcode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List buttons;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private BarcodeArPopoverAnnotationListener listener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isEntirePopoverTappable;

    /* renamed from: f, reason: collision with root package name */
    private boolean f121212f;

    /* renamed from: g, reason: collision with root package name */
    private final BarcodeArPopoverAnnotation$special$$inlined$distinctObservable$1 f121213g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f121214h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private /* synthetic */ Function0 onAnnotationOrElementTap;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private BarcodeArAnnotationTrigger annotationTrigger;

    /* renamed from: k, reason: collision with root package name */
    private com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.popover.e f121217k;

    /* renamed from: l, reason: collision with root package name */
    private final s f121218l;

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ KProperty[] f121205m = {a.a(BarcodeArPopoverAnnotation.class, "anchor", "getAnchor()Lcom/scandit/datacapture/barcode/ar/ui/annotations/popover/BarcodeArPopoverAnnotationAnchor;", 0)};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n, reason: collision with root package name */
    private static final Lazy f121206n = LazyKt.b(p.f121302a);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/ui/annotations/BarcodeArPopoverAnnotation$Companion;", "", "", "MARGIN$delegate", "Lkotlin/Lazy;", "getMARGIN$scandit_barcode_capture", "()I", "MARGIN", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final int getMARGIN$scandit_barcode_capture() {
            return ((Number) BarcodeArPopoverAnnotation.f121206n.getValue()).intValue();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArPopoverAnnotation$special$$inlined$distinctObservable$1] */
    public BarcodeArPopoverAnnotation(Context context, Barcode barcode, List<BarcodeArPopoverAnnotationButton> buttons) {
        Intrinsics.j(context, "context");
        Intrinsics.j(barcode, "barcode");
        Intrinsics.j(buttons, "buttons");
        this.f121207a = context;
        this.barcode = barcode;
        this.buttons = buttons;
        this.isEntirePopoverTappable = BarcodeArViewDefaults.getDefaultIsEntirePopoverTappable();
        final BarcodeArPopoverAnnotationAnchor defaultPopoverAnnotationAnchor = BarcodeArViewDefaults.getDefaultPopoverAnnotationAnchor();
        Delegates delegates = Delegates.f143781a;
        this.f121213g = new ObservableProperty<BarcodeArPopoverAnnotationAnchor>(defaultPopoverAnnotationAnchor) { // from class: com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArPopoverAnnotation$special$$inlined$distinctObservable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, BarcodeArPopoverAnnotationAnchor oldValue, BarcodeArPopoverAnnotationAnchor newValue) {
                Intrinsics.j(property, "property");
                if (Intrinsics.e(oldValue, newValue)) {
                    return;
                }
                this.f121212f = true;
            }
        };
        this.annotationTrigger = BarcodeArViewDefaults.getDefaultPopoverAnnotationTrigger();
        this.f121218l = new s(this);
        Iterator<T> it = buttons.iterator();
        while (it.hasNext()) {
            ((BarcodeArPopoverAnnotationButton) it.next()).setPropertyChangedListener$scandit_barcode_capture(this.f121218l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(View view) {
        Intrinsics.j(view, "$view");
        view.setVisibility(0);
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation
    public View createView() {
        EnumC13390j enumC13390j;
        FrameLayout frameLayout = new FrameLayout(this.f121207a);
        Companion companion = INSTANCE;
        frameLayout.setPadding(companion.getMARGIN$scandit_barcode_capture(), companion.getMARGIN$scandit_barcode_capture(), companion.getMARGIN$scandit_barcode_capture(), companion.getMARGIN$scandit_barcode_capture());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.setVisibility(4);
        frameLayout.setContentDescription(frameLayout.getResources().getString(R.string.sc_barcode_ar_annotation_popover_content_description, this.barcode.getData()));
        C13393m c13393m = new C13393m(this.f121207a);
        c13393m.setId(R.id.sc_ar_linear_popover_view);
        c13393m.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        r rVar = new r(this);
        Intrinsics.j(rVar, "<set-?>");
        c13393m.f124356c = rVar;
        boolean z10 = this.isEntirePopoverTappable;
        if (c13393m.f124355b != z10) {
            c13393m.f124355b = z10;
            c13393m.a();
        }
        int i10 = 0;
        c13393m.setVisibility(0);
        for (Object obj : this.buttons) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            BarcodeArPopoverAnnotationButton barcodeArPopoverAnnotationButton = (BarcodeArPopoverAnnotationButton) obj;
            c13393m.a(barcodeArPopoverAnnotationButton.getButtonSettings$scandit_barcode_capture(i10, this.isEntirePopoverTappable, this.f121207a), new q(this, barcodeArPopoverAnnotationButton, i10));
            c13393m.a(i10, true);
            i10 = i11;
        }
        this.f121217k = new com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.popover.e(c13393m);
        BarcodeArPopoverAnnotationAnchor anchor = getAnchor();
        Intrinsics.j(anchor, "anchor");
        int i12 = com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.popover.a.f122087a[anchor.ordinal()];
        if (i12 == 1 || i12 == 2) {
            enumC13390j = EnumC13390j.f124349b;
        } else {
            if (i12 != 3 && i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            enumC13390j = EnumC13390j.f124348a;
        }
        c13393m.a(enumC13390j);
        frameLayout.addView(c13393m);
        return frameLayout;
    }

    public final BarcodeArPopoverAnnotationAnchor getAnchor() {
        return getValue(this, f121205m[0]);
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation
    public BarcodeArAnnotationTrigger getAnnotationTrigger() {
        return this.annotationTrigger;
    }

    public final Barcode getBarcode() {
        return this.barcode;
    }

    public final List<BarcodeArPopoverAnnotationButton> getButtons() {
        return this.buttons;
    }

    public final BarcodeArPopoverAnnotationListener getListener() {
        return this.listener;
    }

    public final Function0<Unit> getOnAnnotationOrElementTap$scandit_barcode_capture() {
        return this.onAnnotationOrElementTap;
    }

    /* renamed from: isEntirePopoverTappable, reason: from getter */
    public final boolean getIsEntirePopoverTappable() {
        return this.isEntirePopoverTappable;
    }

    public final void setAnchor(BarcodeArPopoverAnnotationAnchor barcodeArPopoverAnnotationAnchor) {
        Intrinsics.j(barcodeArPopoverAnnotationAnchor, "<set-?>");
        setValue(this, f121205m[0], barcodeArPopoverAnnotationAnchor);
    }

    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation
    public void setAnnotationTrigger(BarcodeArAnnotationTrigger barcodeArAnnotationTrigger) {
        Intrinsics.j(barcodeArAnnotationTrigger, "<set-?>");
        this.annotationTrigger = barcodeArAnnotationTrigger;
    }

    public final void setEntirePopoverTappable(boolean z10) {
        this.isEntirePopoverTappable = z10;
        this.f121218l.invoke();
    }

    public final void setListener(BarcodeArPopoverAnnotationListener barcodeArPopoverAnnotationListener) {
        this.listener = barcodeArPopoverAnnotationListener;
    }

    public final void setOnAnnotationOrElementTap$scandit_barcode_capture(Function0<Unit> function0) {
        this.onAnnotationOrElementTap = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    @Override // com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void update(com.scandit.datacapture.core.common.geometry.Quadrilateral r12, com.scandit.datacapture.core.common.geometry.Quadrilateral r13, final android.view.View r14) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArPopoverAnnotation.update(com.scandit.datacapture.core.common.geometry.Quadrilateral, com.scandit.datacapture.core.common.geometry.Quadrilateral, android.view.View):void");
    }
}
