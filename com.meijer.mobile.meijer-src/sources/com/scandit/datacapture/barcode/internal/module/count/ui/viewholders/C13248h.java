package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.widget.RelativeLayout;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountScreenRatioForUi;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13248h implements BarcodeCountViewUiLayoutHelper {

    /* renamed from: e, reason: collision with root package name */
    public static final int f122946e = PixelExtensionsKt.pxFromDp$default(25, (Context) null, 1, (Object) null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f122947f = PixelExtensionsKt.pxFromDp$default(39, (Context) null, 1, (Object) null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f122948g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f122949h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f122950i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f122951j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f122952k;

    /* renamed from: l, reason: collision with root package name */
    public static final Lazy f122953l;

    /* renamed from: m, reason: collision with root package name */
    public static final Lazy f122954m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f122955n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f122956o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f122957p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f122958q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f122959r;

    /* renamed from: a, reason: collision with root package name */
    public View f122960a;

    /* renamed from: b, reason: collision with root package name */
    public Size f122961b = new Size(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public Integer f122962c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f122963d;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final void a(RelativeLayout relativeLayout) {
        Intrinsics.j(relativeLayout, "<set-?>");
        this.f122960a = relativeLayout;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final void d() {
        this.f122962c = null;
        this.f122963d = null;
    }

    static {
        int i10 = AbstractC13236b.f122918d / 2;
        f122948g = i10;
        int iPxFromDp$default = PixelExtensionsKt.pxFromDp$default(80, (Context) null, 1, (Object) null);
        f122949h = iPxFromDp$default;
        f122950i = i10 - (iPxFromDp$default / 2);
        f122951j = PixelExtensionsKt.pxFromDp$default(100, (Context) null, 1, (Object) null);
        f122952k = PixelExtensionsKt.pxFromDp$default(HttpResponseStatus.SUCCESS_OK, (Context) null, 1, (Object) null);
        f122953l = LazyKt.b(C13242e.f122934a);
        f122954m = LazyKt.b(C13240d.f122929a);
        f122955n = PixelExtensionsKt.pxFromDp$default(16, (Context) null, 1, (Object) null);
        f122956o = PixelExtensionsKt.pxFromDp$default(360, (Context) null, 1, (Object) null);
        f122957p = PixelExtensionsKt.pxFromDp$default(32, (Context) null, 1, (Object) null);
        f122958q = PixelExtensionsKt.pxFromDp$default(480, (Context) null, 1, (Object) null);
        f122959r = PixelExtensionsKt.pxFromDp$default(12, (Context) null, 1, (Object) null);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final void a(Size previewSize) {
        Intrinsics.j(previewSize, "previewSize");
        this.f122961b = previewSize;
        this.f122962c = null;
        this.f122963d = null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final int c() {
        int iIntValue;
        Integer num = this.f122962c;
        if (num != null) {
            return num.intValue();
        }
        int iK = k();
        int i10 = AbstractC13246g.f122943a[i().ordinal()];
        if (i10 == 1) {
            iIntValue = (iK - f122950i) + ((Number) f122953l.getValue()).intValue();
        } else if (i10 == 2) {
            iIntValue = (iK - AbstractC13236b.f122918d) / 2;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iIntValue = ((iK / 2) - AbstractC13236b.f122918d) / 2;
        }
        int iF = RangesKt.f(iIntValue, 0);
        this.f122962c = Integer.valueOf(iF);
        return iF;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final Size e() {
        return this.f122961b;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final int h() {
        int height = this.f122961b.getHeight();
        int i10 = f122958q;
        if (height > i10) {
            return f122957p;
        }
        int height2 = this.f122961b.getHeight();
        int i11 = f122956o;
        if (height2 < i11) {
            return f122955n;
        }
        int height3 = this.f122961b.getHeight();
        float f10 = f122957p;
        float f11 = f122955n;
        float f12 = i11;
        return (int) ((((f10 - f11) / (i10 - f12)) * (height3 - f12)) + f11);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final int j() {
        int iIntValue;
        Integer num = this.f122963d;
        if (num != null) {
            return num.intValue();
        }
        int i10 = AbstractC13246g.f122943a[i().ordinal()];
        if (i10 == 1) {
            iIntValue = ((Number) f122953l.getValue()).intValue() + f122949h + ((Number) f122954m.getValue()).intValue();
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iIntValue = ((Number) f122954m.getValue()).intValue();
        }
        this.f122963d = Integer.valueOf(iIntValue);
        return iIntValue;
    }

    public final View l() {
        View view = this.f122960a;
        if (view != null) {
            return view;
        }
        Intrinsics.x("container");
        return null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final int b() {
        Context context = l().getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            return l().getHeight();
        }
        int i10 = AbstractC13246g.f122943a[i().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return l().getHeight() - (k() / 2);
                }
                throw new NoWhenBranchMatchedException();
            }
            return l().getHeight() - (k() / 2);
        }
        return (l().getHeight() - c()) - AbstractC13236b.f122918d;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final int f() {
        return ((c() + f122948g) - (AbstractC13236b.f122916b - (PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null) / 2))) - f122959r;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final int g() {
        Context context = l().getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            return f122947f;
        }
        return f122946e;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final BarcodeCountScreenRatioForUi i() {
        int iK = k();
        if (iK >= 0 && iK < f122951j) {
            return BarcodeCountScreenRatioForUi.SMALL;
        }
        int i10 = f122951j;
        if (iK < f122952k && i10 <= iK) {
            return BarcodeCountScreenRatioForUi.MEDIUM;
        }
        return BarcodeCountScreenRatioForUi.LARGE;
    }

    public final int k() {
        int height;
        int height2;
        Context context = l().getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            height = l().getWidth();
            height2 = this.f122961b.getWidth();
        } else {
            height = l().getHeight();
            height2 = this.f122961b.getHeight();
        }
        return RangesKt.f(height - height2, 0);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final int a() {
        return (c() + f122948g) - (AbstractC13236b.f122916b - (PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null) / 2));
    }
}
