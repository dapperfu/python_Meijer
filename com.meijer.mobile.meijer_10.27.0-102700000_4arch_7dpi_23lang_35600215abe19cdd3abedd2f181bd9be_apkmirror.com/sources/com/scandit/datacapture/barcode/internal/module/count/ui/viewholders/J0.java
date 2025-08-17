package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.J0;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtilsKt;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class J0 implements InterfaceC13147x0 {

    /* renamed from: m, reason: collision with root package name */
    public static final int f121890m = PixelExtensionsKt.pxFromDp$default(112, (Context) null, 1, (Object) null);

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f121891a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f121892b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f121893c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f121894d;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f121895e;

    /* renamed from: f, reason: collision with root package name */
    public final z1 f121896f;

    /* renamed from: g, reason: collision with root package name */
    public final z1 f121897g;

    /* renamed from: h, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.o f121898h;

    /* renamed from: i, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.o f121899i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f121900j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f121901k;

    /* renamed from: l, reason: collision with root package name */
    public final Lazy f121902l;

    public static final void c(J0 this$0) {
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar;
        Intrinsics.j(this$0, "this$0");
        if (this$0.f121894d && (oVar = this$0.f121899i) != null) {
            this$0.a(ObjectOverlayUtilsKt.getSize(this$0.f121897g.f122115a));
            com.scandit.datacapture.barcode.internal.module.count.ui.a aVar = (com.scandit.datacapture.barcode.internal.module.count.ui.a) this$0.f121902l.getValue();
            if (aVar != null) {
                oVar.f121759b.f121683c = aVar;
                oVar.setX(aVar.a());
                oVar.setY(aVar.b());
            }
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar2 = this$0.f121898h;
        if (oVar2 == null) {
            return;
        }
        oVar2.setLayoutParams(this$0.c());
    }

    public final void a(String value) {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = this.f121899i;
        if (oVar == null) {
            return;
        }
        oVar.setContentDescription(value);
    }

    public final void b(String value) {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = this.f121898h;
        if (oVar == null) {
            return;
        }
        oVar.setContentDescription(value);
    }

    public J0(C13115h layoutHelper, RelativeLayout shutterButtonContainer, FrameLayout floatingShutterButtonContainer) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(shutterButtonContainer, "shutterButtonContainer");
        Intrinsics.j(floatingShutterButtonContainer, "floatingShutterButtonContainer");
        this.f121891a = layoutHelper;
        this.f121892b = floatingShutterButtonContainer;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.f121893c = barcodeCountViewDefaults.getShouldShowShutterButton();
        this.f121894d = barcodeCountViewDefaults.getShouldShowFloatingShutterButton();
        barcodeCountViewDefaults.getShutterButtonContentDescription();
        barcodeCountViewDefaults.getFloatingShutterButtonContentDescription();
        this.f121895e = D0.f121861a;
        this.f121896f = new z1(shutterButtonContainer);
        this.f121897g = new z1(floatingShutterButtonContainer);
        this.f121902l = LazyKt.b(new C0(this));
    }

    public static final float b(J0 j02) {
        return (float) ((j02.f121891a.e().getHeight() * 0.6d) - (f121890m / 2));
    }

    public final void a(Size2 size2) {
        com.scandit.datacapture.barcode.internal.module.count.ui.a aVar;
        if (size2 == null || (aVar = (com.scandit.datacapture.barcode.internal.module.count.ui.a) this.f121902l.getValue()) == null) {
            return;
        }
        Size size = new Size((int) size2.getWidth(), (int) size2.getHeight());
        Intrinsics.j(size, "<set-?>");
        aVar.f121343d = size;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void b() {
        this.f121896f.b(this.f121898h, new B0(this));
        this.f121897g.b(this.f121899i, new C13151z0(this));
    }

    public static final float a(J0 j02) {
        return j02.f121891a.e().getWidth() - f121890m;
    }

    public final com.scandit.datacapture.barcode.internal.module.count.ui.o b(Context context) {
        int i10 = com.scandit.datacapture.barcode.internal.module.count.ui.o.f121757e;
        com.scandit.datacapture.barcode.internal.module.count.ui.m mode = com.scandit.datacapture.barcode.internal.module.count.ui.m.f121701a;
        Intrinsics.j(context, "context");
        Intrinsics.j(mode, "mode");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = new com.scandit.datacapture.barcode.internal.module.count.ui.o(context, 80, 140, mode);
        oVar.setId(100);
        oVar.setVisibility(4);
        oVar.setLayoutParams(c());
        oVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                J0.b(this.f29326a, view);
            }
        });
        oVar.setContentDescription(BarcodeCountViewDefaults.INSTANCE.getShutterButtonContentDescription());
        this.f121898h = oVar;
        return oVar;
    }

    public final com.scandit.datacapture.barcode.internal.module.count.ui.o a(Context context) {
        int i10 = com.scandit.datacapture.barcode.internal.module.count.ui.o.f121757e;
        com.scandit.datacapture.barcode.internal.module.count.ui.m mode = com.scandit.datacapture.barcode.internal.module.count.ui.m.f121702b;
        Intrinsics.j(context, "context");
        Intrinsics.j(mode, "mode");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = new com.scandit.datacapture.barcode.internal.module.count.ui.o(context, 56, 112, mode);
        int i11 = f121890m;
        oVar.setLayoutParams(new FrameLayout.LayoutParams(i11, i11, 8388661));
        oVar.setVisibility(4);
        oVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                J0.a(this.f29327a, view);
            }
        });
        oVar.setContentDescription(BarcodeCountViewDefaults.INSTANCE.getFloatingShutterButtonContentDescription());
        this.f121899i = oVar;
        return oVar;
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f121896f.f122115a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            int i10 = AbstractC13103b.f121966d;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
            layoutParams.addRule(15);
            layoutParams.addRule(21);
            layoutParams.setMarginEnd(this.f121891a.c());
            return layoutParams;
        }
        int i11 = AbstractC13103b.f121966d;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i11, i11);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = this.f121891a.c();
        return layoutParams2;
    }

    public static final void b(J0 this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f121901k = false;
        this$0.f121895e.invoke(Boolean.FALSE);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13105c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = this.f121898h;
        if (oVar != null) {
            oVar.setVisibility(this.f121893c ? 0 : 4);
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar2 = this.f121899i;
        if (oVar2 != null) {
            oVar2.setVisibility(this.f121894d ? 0 : 4);
        }
        Boolean bool = this.f121900j;
        if (bool != null) {
            AbstractC13141u0.a(this, bool.booleanValue());
        }
        this.f121892b.post(new Runnable() { // from class: Pt.b
            @Override // java.lang.Runnable
            public final void run() {
                J0.c(this.f29325a);
            }
        });
    }

    public static final void a(J0 this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f121901k = false;
        this$0.f121895e.invoke(Boolean.TRUE);
    }
}
