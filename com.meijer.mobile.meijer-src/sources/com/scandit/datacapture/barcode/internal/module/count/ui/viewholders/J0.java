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

/* loaded from: classes12.dex */
public final class J0 implements InterfaceC13280x0 {

    /* renamed from: m, reason: collision with root package name */
    public static final int f122842m = PixelExtensionsKt.pxFromDp$default(112, (Context) null, 1, (Object) null);

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f122843a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f122844b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f122845c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f122846d;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f122847e;

    /* renamed from: f, reason: collision with root package name */
    public final z1 f122848f;

    /* renamed from: g, reason: collision with root package name */
    public final z1 f122849g;

    /* renamed from: h, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.o f122850h;

    /* renamed from: i, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.o f122851i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f122852j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f122853k;

    /* renamed from: l, reason: collision with root package name */
    public final Lazy f122854l;

    public static final void c(J0 this$0) {
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar;
        Intrinsics.j(this$0, "this$0");
        if (this$0.f122846d && (oVar = this$0.f122851i) != null) {
            this$0.a(ObjectOverlayUtilsKt.getSize(this$0.f122849g.f123067a));
            com.scandit.datacapture.barcode.internal.module.count.ui.a aVar = (com.scandit.datacapture.barcode.internal.module.count.ui.a) this$0.f122854l.getValue();
            if (aVar != null) {
                oVar.f122711b.f122635c = aVar;
                oVar.setX(aVar.a());
                oVar.setY(aVar.b());
            }
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar2 = this$0.f122850h;
        if (oVar2 == null) {
            return;
        }
        oVar2.setLayoutParams(this$0.c());
    }

    public final void a(String value) {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = this.f122851i;
        if (oVar == null) {
            return;
        }
        oVar.setContentDescription(value);
    }

    public final void b(String value) {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = this.f122850h;
        if (oVar == null) {
            return;
        }
        oVar.setContentDescription(value);
    }

    public J0(C13248h layoutHelper, RelativeLayout shutterButtonContainer, FrameLayout floatingShutterButtonContainer) {
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(shutterButtonContainer, "shutterButtonContainer");
        Intrinsics.j(floatingShutterButtonContainer, "floatingShutterButtonContainer");
        this.f122843a = layoutHelper;
        this.f122844b = floatingShutterButtonContainer;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        this.f122845c = barcodeCountViewDefaults.getShouldShowShutterButton();
        this.f122846d = barcodeCountViewDefaults.getShouldShowFloatingShutterButton();
        barcodeCountViewDefaults.getShutterButtonContentDescription();
        barcodeCountViewDefaults.getFloatingShutterButtonContentDescription();
        this.f122847e = D0.f122813a;
        this.f122848f = new z1(shutterButtonContainer);
        this.f122849g = new z1(floatingShutterButtonContainer);
        this.f122854l = LazyKt.b(new C0(this));
    }

    public static final float b(J0 j02) {
        return (float) ((j02.f122843a.e().getHeight() * 0.6d) - (f122842m / 2));
    }

    public final void a(Size2 size2) {
        com.scandit.datacapture.barcode.internal.module.count.ui.a aVar;
        if (size2 == null || (aVar = (com.scandit.datacapture.barcode.internal.module.count.ui.a) this.f122854l.getValue()) == null) {
            return;
        }
        Size size = new Size((int) size2.getWidth(), (int) size2.getHeight());
        Intrinsics.j(size, "<set-?>");
        aVar.f122295d = size;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
        this.f122848f.b(this.f122850h, new B0(this));
        this.f122849g.b(this.f122851i, new C13284z0(this));
    }

    public static final float a(J0 j02) {
        return j02.f122843a.e().getWidth() - f122842m;
    }

    public final com.scandit.datacapture.barcode.internal.module.count.ui.o b(Context context) {
        int i10 = com.scandit.datacapture.barcode.internal.module.count.ui.o.f122709e;
        com.scandit.datacapture.barcode.internal.module.count.ui.m mode = com.scandit.datacapture.barcode.internal.module.count.ui.m.f122653a;
        Intrinsics.j(context, "context");
        Intrinsics.j(mode, "mode");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = new com.scandit.datacapture.barcode.internal.module.count.ui.o(context, 80, 140, mode);
        oVar.setId(100);
        oVar.setVisibility(4);
        oVar.setLayoutParams(c());
        oVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                J0.b(this.f27208a, view);
            }
        });
        oVar.setContentDescription(BarcodeCountViewDefaults.INSTANCE.getShutterButtonContentDescription());
        this.f122850h = oVar;
        return oVar;
    }

    public final com.scandit.datacapture.barcode.internal.module.count.ui.o a(Context context) {
        int i10 = com.scandit.datacapture.barcode.internal.module.count.ui.o.f122709e;
        com.scandit.datacapture.barcode.internal.module.count.ui.m mode = com.scandit.datacapture.barcode.internal.module.count.ui.m.f122654b;
        Intrinsics.j(context, "context");
        Intrinsics.j(mode, "mode");
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = new com.scandit.datacapture.barcode.internal.module.count.ui.o(context, 56, 112, mode);
        int i11 = f122842m;
        oVar.setLayoutParams(new FrameLayout.LayoutParams(i11, i11, 8388661));
        oVar.setVisibility(4);
        oVar.setOnClickListener(new View.OnClickListener() { // from class: Pt.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                J0.a(this.f27209a, view);
            }
        });
        oVar.setContentDescription(BarcodeCountViewDefaults.INSTANCE.getFloatingShutterButtonContentDescription());
        this.f122851i = oVar;
        return oVar;
    }

    public final RelativeLayout.LayoutParams c() {
        Context context = ((RelativeLayout) this.f122848f.f123067a).getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            int i10 = AbstractC13236b.f122918d;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
            layoutParams.addRule(15);
            layoutParams.addRule(21);
            layoutParams.setMarginEnd(this.f122843a.c());
            return layoutParams;
        }
        int i11 = AbstractC13236b.f122918d;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i11, i11);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = this.f122843a.c();
        return layoutParams2;
    }

    public static final void b(J0 this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f122853k = false;
        this$0.f122847e.invoke(Boolean.FALSE);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar = this.f122850h;
        if (oVar != null) {
            oVar.setVisibility(this.f122845c ? 0 : 4);
        }
        com.scandit.datacapture.barcode.internal.module.count.ui.o oVar2 = this.f122851i;
        if (oVar2 != null) {
            oVar2.setVisibility(this.f122846d ? 0 : 4);
        }
        Boolean bool = this.f122852j;
        if (bool != null) {
            AbstractC13274u0.a(this, bool.booleanValue());
        }
        this.f122844b.post(new Runnable() { // from class: Pt.b
            @Override // java.lang.Runnable
            public final void run() {
                J0.c(this.f27207a);
            }
        });
    }

    public static final void a(J0 this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.f122853k = false;
        this$0.f122847e.invoke(Boolean.TRUE);
    }
}
