package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountStatus;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class L extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f122339h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.status.n f122340a;

    /* renamed from: b, reason: collision with root package name */
    public final C13213u f122341b;

    /* renamed from: c, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.status.m f122342c;

    /* renamed from: d, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.status.a f122343d;

    /* renamed from: e, reason: collision with root package name */
    public I f122344e;

    /* renamed from: f, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.status.b f122345f;

    /* renamed from: g, reason: collision with root package name */
    public W f122346g;

    public final void a(z clusterIndicatorInfo) {
        Intrinsics.j(clusterIndicatorInfo, "clusterIndicatorInfo");
        this.f122346g = W.f122368b;
        int i10 = AbstractC13197d.f122386a;
        C13213u normalView = this.f122341b;
        Intrinsics.j(normalView, "normalView");
        Intrinsics.j(clusterIndicatorInfo, "clusterIndicatorInfo");
        int iOrdinal = AbstractC13197d.a(clusterIndicatorInfo.f122452g, clusterIndicatorInfo.f122455j).ordinal();
        if (iOrdinal == 0) {
            Brush brush = clusterIndicatorInfo.f122450e;
            normalView.a(Integer.valueOf(R.drawable.sc_ic_barcode_dot), Integer.valueOf(brush.getFillColor()), clusterIndicatorInfo.f122453h);
        } else if (iOrdinal == 1) {
            W w10 = clusterIndicatorInfo.f122455j;
            NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme = clusterIndicatorInfo.f122453h;
            normalView.a(AbstractC13197d.a(w10, nativeBarcodeCountBasicOverlayColorScheme), nativeBarcodeCountBasicOverlayColorScheme);
        } else if (iOrdinal == 2) {
            W w11 = clusterIndicatorInfo.f122455j;
            Brush brush2 = clusterIndicatorInfo.f122450e;
            NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme2 = clusterIndicatorInfo.f122453h;
            normalView.a(AbstractC13197d.a(w11, nativeBarcodeCountBasicOverlayColorScheme2), Integer.valueOf(brush2.getFillColor()), nativeBarcodeCountBasicOverlayColorScheme2);
        }
        Y y10 = normalView.f122436b;
        if (y10 == null) {
            Intrinsics.x("warningBackground");
            y10 = null;
        }
        y10.setVisibility(8);
        normalView.a(R.string.sc_barcode_count_indicator_content_description_cluster_data, clusterIndicatorInfo.f122454i, R.string.sc_barcode_count_scan_status_scanned);
    }

    public final void b(boolean z10) {
        J jA = a();
        int i10 = jA == null ? -1 : K.f122338a[jA.ordinal()];
        if (i10 == 1) {
            a(this.f122341b, z10);
            com.scandit.datacapture.barcode.internal.module.count.ui.status.m mVar = this.f122342c;
            if (mVar.f122767a) {
                return;
            }
            mVar.f122767a = true;
            com.scandit.datacapture.barcode.internal.module.count.ui.status.m.f122766e.runOnMainThread(new com.scandit.datacapture.barcode.internal.module.count.ui.status.j(mVar, true, z10, new com.scandit.datacapture.barcode.internal.module.count.ui.status.h(mVar, z10)));
            return;
        }
        if (i10 == 2) {
            b(this.f122341b, z10);
            this.f122342c.a(z10);
        } else {
            if (i10 != 3) {
                return;
            }
            a(this.f122341b, z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Context context, com.scandit.datacapture.barcode.internal.module.count.ui.status.n statusShowingMode) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(statusShowingMode, "statusShowingMode");
        this.f122340a = statusShowingMode;
        int i10 = AbstractC13197d.f122386a;
        Intrinsics.j(context, "context");
        C13213u c13213u = new C13213u(context);
        this.f122341b = c13213u;
        Intrinsics.j(context, "context");
        Intrinsics.j(statusShowingMode, "statusShowingMode");
        com.scandit.datacapture.barcode.internal.module.count.ui.status.m mVar = new com.scandit.datacapture.barcode.internal.module.count.ui.status.m(context, statusShowingMode);
        this.f122342c = mVar;
        com.scandit.datacapture.barcode.internal.module.count.ui.status.a aVar = new com.scandit.datacapture.barcode.internal.module.count.ui.status.a(context, null, 0);
        this.f122343d = aVar;
        this.f122344e = I.f122331a;
        this.f122345f = com.scandit.datacapture.barcode.internal.module.count.ui.status.d.f122747a;
        mVar.setAlpha(0.0f);
        addView(c13213u, new FrameLayout.LayoutParams(-1, -1));
        addView(mVar, new FrameLayout.LayoutParams(-1, -1));
        addView(aVar, new FrameLayout.LayoutParams(-1, -1));
        int iOrdinal = statusShowingMode.ordinal();
        if (iOrdinal == 0) {
            a(aVar, false);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            b(aVar, false);
        }
    }

    public static void b(View view, boolean z10) {
        if (view.getAlpha() == 1.0f) {
            return;
        }
        if (z10) {
            view.animate().setDuration(500L).alpha(1.0f).start();
        } else {
            view.setAlpha(1.0f);
        }
    }

    public final void a(boolean z10) {
        a(this.f122343d, z10);
        if (a() == J.f122334a) {
            this.f122342c.a(true, z10);
        }
    }

    public final J a() {
        I i10 = this.f122344e;
        I i11 = I.f122331a;
        if (i10 == i11 && this.f122340a == com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f122771b) {
            com.scandit.datacapture.barcode.internal.module.count.ui.status.b bVar = this.f122345f;
            if (!Intrinsics.e(bVar, com.scandit.datacapture.barcode.internal.module.count.ui.status.d.f122747a) && !Intrinsics.e(bVar, com.scandit.datacapture.barcode.internal.module.count.ui.status.c.f122746a)) {
                if (!(bVar instanceof com.scandit.datacapture.barcode.internal.module.count.ui.status.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((com.scandit.datacapture.barcode.internal.module.count.ui.status.e) bVar).f122748a != BarcodeCountStatus.NONE) {
                    return J.f122334a;
                }
                return J.f122335b;
            }
            return J.f122334a;
        }
        if (i10 == i11 && this.f122340a == com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f122770a) {
            return J.f122334a;
        }
        if (i10 == I.f122332b) {
            return J.f122336c;
        }
        return null;
    }

    public static void a(View view, boolean z10) {
        if (view.getAlpha() == 0.0f) {
            return;
        }
        if (z10) {
            view.animate().setDuration(500L).alpha(0.0f).start();
        } else {
            view.setAlpha(0.0f);
        }
    }
}
