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
/* loaded from: classes11.dex */
public final class C13115h implements BarcodeCountViewUiLayoutHelper {

    /* renamed from: e, reason: collision with root package name */
    public static final int f121994e = PixelExtensionsKt.pxFromDp$default(25, (Context) null, 1, (Object) null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f121995f = PixelExtensionsKt.pxFromDp$default(39, (Context) null, 1, (Object) null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f121996g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f121997h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f121998i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f121999j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f122000k;

    /* renamed from: l, reason: collision with root package name */
    public static final Lazy f122001l;

    /* renamed from: m, reason: collision with root package name */
    public static final Lazy f122002m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f122003n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f122004o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f122005p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f122006q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f122007r;

    /* renamed from: a, reason: collision with root package name */
    public View f122008a;

    /* renamed from: b, reason: collision with root package name */
    public Size f122009b = new Size(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public Integer f122010c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f122011d;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final void a(RelativeLayout relativeLayout) {
        Intrinsics.j(relativeLayout, "<set-?>");
        this.f122008a = relativeLayout;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final void d() {
        this.f122010c = null;
        this.f122011d = null;
    }

    static {
        int i10 = AbstractC13103b.f121966d / 2;
        f121996g = i10;
        int iPxFromDp$default = PixelExtensionsKt.pxFromDp$default(80, (Context) null, 1, (Object) null);
        f121997h = iPxFromDp$default;
        f121998i = i10 - (iPxFromDp$default / 2);
        f121999j = PixelExtensionsKt.pxFromDp$default(100, (Context) null, 1, (Object) null);
        f122000k = PixelExtensionsKt.pxFromDp$default(HttpResponseStatus.SUCCESS_OK, (Context) null, 1, (Object) null);
        f122001l = LazyKt.b(C13109e.f121982a);
        f122002m = LazyKt.b(C13107d.f121977a);
        f122003n = PixelExtensionsKt.pxFromDp$default(16, (Context) null, 1, (Object) null);
        f122004o = PixelExtensionsKt.pxFromDp$default(360, (Context) null, 1, (Object) null);
        f122005p = PixelExtensionsKt.pxFromDp$default(32, (Context) null, 1, (Object) null);
        f122006q = PixelExtensionsKt.pxFromDp$default(480, (Context) null, 1, (Object) null);
        f122007r = PixelExtensionsKt.pxFromDp$default(12, (Context) null, 1, (Object) null);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final void a(Size previewSize) {
        Intrinsics.j(previewSize, "previewSize");
        this.f122009b = previewSize;
        this.f122010c = null;
        this.f122011d = null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final int c() {
        int iIntValue;
        Integer num = this.f122010c;
        if (num != null) {
            return num.intValue();
        }
        int iK = k();
        int i10 = AbstractC13113g.f121991a[i().ordinal()];
        if (i10 == 1) {
            iIntValue = (iK - f121998i) + ((Number) f122001l.getValue()).intValue();
        } else if (i10 == 2) {
            iIntValue = (iK - AbstractC13103b.f121966d) / 2;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iIntValue = ((iK / 2) - AbstractC13103b.f121966d) / 2;
        }
        int iF = RangesKt.f(iIntValue, 0);
        this.f122010c = Integer.valueOf(iF);
        return iF;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final Size e() {
        return this.f122009b;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final int h() {
        int height = this.f122009b.getHeight();
        int i10 = f122006q;
        if (height > i10) {
            return f122005p;
        }
        int height2 = this.f122009b.getHeight();
        int i11 = f122004o;
        if (height2 < i11) {
            return f122003n;
        }
        int height3 = this.f122009b.getHeight();
        float f10 = f122005p;
        float f11 = f122003n;
        float f12 = i11;
        return (int) ((((f10 - f11) / (i10 - f12)) * (height3 - f12)) + f11);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final int j() {
        int iIntValue;
        Integer num = this.f122011d;
        if (num != null) {
            return num.intValue();
        }
        int i10 = AbstractC13113g.f121991a[i().ordinal()];
        if (i10 == 1) {
            iIntValue = ((Number) f122001l.getValue()).intValue() + f121997h + ((Number) f122002m.getValue()).intValue();
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iIntValue = ((Number) f122002m.getValue()).intValue();
        }
        this.f122011d = Integer.valueOf(iIntValue);
        return iIntValue;
    }

    public final View l() {
        View view = this.f122008a;
        if (view != null) {
            return view;
        }
        Intrinsics.y("container");
        return null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final int b() {
        Context context = l().getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            return l().getHeight();
        }
        int i10 = AbstractC13113g.f121991a[i().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return l().getHeight() - (k() / 2);
                }
                throw new NoWhenBranchMatchedException();
            }
            return l().getHeight() - (k() / 2);
        }
        return (l().getHeight() - c()) - AbstractC13103b.f121966d;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final int f() {
        return ((c() + f121996g) - (AbstractC13103b.f121964b - (PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null) / 2))) - f122007r;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final int g() {
        Context context = l().getContext();
        Intrinsics.i(context, "getContext(...)");
        if (com.scandit.datacapture.barcode.internal.module.extensions.b.a(context)) {
            return f121995f;
        }
        return f121994e;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final BarcodeCountScreenRatioForUi i() {
        int iK = k();
        if (iK >= 0 && iK < f121999j) {
            return BarcodeCountScreenRatioForUi.SMALL;
        }
        int i10 = f121999j;
        if (iK < f122000k && i10 <= iK) {
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
            height2 = this.f122009b.getWidth();
        } else {
            height = l().getHeight();
            height2 = this.f122009b.getHeight();
        }
        return RangesKt.f(height - height2, 0);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.BarcodeCountViewUiLayoutHelper
    public final int a() {
        return (c() + f121996g) - (AbstractC13103b.f121964b - (PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null) / 2));
    }
}
