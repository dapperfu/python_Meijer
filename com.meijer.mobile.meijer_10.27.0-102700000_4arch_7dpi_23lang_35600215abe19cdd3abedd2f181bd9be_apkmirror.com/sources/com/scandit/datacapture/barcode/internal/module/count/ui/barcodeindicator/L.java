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

/* loaded from: classes11.dex */
public final class L extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f121387h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.status.n f121388a;

    /* renamed from: b, reason: collision with root package name */
    public final C13080u f121389b;

    /* renamed from: c, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.status.m f121390c;

    /* renamed from: d, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.count.ui.status.a f121391d;

    /* renamed from: e, reason: collision with root package name */
    public I f121392e;

    /* renamed from: f, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.status.b f121393f;

    /* renamed from: g, reason: collision with root package name */
    public W f121394g;

    public final void a(z clusterIndicatorInfo) {
        Intrinsics.j(clusterIndicatorInfo, "clusterIndicatorInfo");
        this.f121394g = W.f121416b;
        int i10 = AbstractC13064d.f121434a;
        C13080u normalView = this.f121389b;
        Intrinsics.j(normalView, "normalView");
        Intrinsics.j(clusterIndicatorInfo, "clusterIndicatorInfo");
        int iOrdinal = AbstractC13064d.a(clusterIndicatorInfo.f121500g, clusterIndicatorInfo.f121503j).ordinal();
        if (iOrdinal == 0) {
            Brush brush = clusterIndicatorInfo.f121498e;
            normalView.a(Integer.valueOf(R.drawable.sc_ic_barcode_dot), Integer.valueOf(brush.getFillColor()), clusterIndicatorInfo.f121501h);
        } else if (iOrdinal == 1) {
            W w10 = clusterIndicatorInfo.f121503j;
            NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme = clusterIndicatorInfo.f121501h;
            normalView.a(AbstractC13064d.a(w10, nativeBarcodeCountBasicOverlayColorScheme), nativeBarcodeCountBasicOverlayColorScheme);
        } else if (iOrdinal == 2) {
            W w11 = clusterIndicatorInfo.f121503j;
            Brush brush2 = clusterIndicatorInfo.f121498e;
            NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme2 = clusterIndicatorInfo.f121501h;
            normalView.a(AbstractC13064d.a(w11, nativeBarcodeCountBasicOverlayColorScheme2), Integer.valueOf(brush2.getFillColor()), nativeBarcodeCountBasicOverlayColorScheme2);
        }
        Y y10 = normalView.f121484b;
        if (y10 == null) {
            Intrinsics.y("warningBackground");
            y10 = null;
        }
        y10.setVisibility(8);
        normalView.a(R.string.sc_barcode_count_indicator_content_description_cluster_data, clusterIndicatorInfo.f121502i, R.string.sc_barcode_count_scan_status_scanned);
    }

    public final void b(boolean z10) {
        J jA = a();
        int i10 = jA == null ? -1 : K.f121386a[jA.ordinal()];
        if (i10 == 1) {
            a(this.f121389b, z10);
            com.scandit.datacapture.barcode.internal.module.count.ui.status.m mVar = this.f121390c;
            if (mVar.f121815a) {
                return;
            }
            mVar.f121815a = true;
            com.scandit.datacapture.barcode.internal.module.count.ui.status.m.f121814e.runOnMainThread(new com.scandit.datacapture.barcode.internal.module.count.ui.status.j(mVar, true, z10, new com.scandit.datacapture.barcode.internal.module.count.ui.status.h(mVar, z10)));
            return;
        }
        if (i10 == 2) {
            b(this.f121389b, z10);
            this.f121390c.a(z10);
        } else {
            if (i10 != 3) {
                return;
            }
            a(this.f121389b, z10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Context context, com.scandit.datacapture.barcode.internal.module.count.ui.status.n statusShowingMode) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(statusShowingMode, "statusShowingMode");
        this.f121388a = statusShowingMode;
        int i10 = AbstractC13064d.f121434a;
        Intrinsics.j(context, "context");
        C13080u c13080u = new C13080u(context);
        this.f121389b = c13080u;
        Intrinsics.j(context, "context");
        Intrinsics.j(statusShowingMode, "statusShowingMode");
        com.scandit.datacapture.barcode.internal.module.count.ui.status.m mVar = new com.scandit.datacapture.barcode.internal.module.count.ui.status.m(context, statusShowingMode);
        this.f121390c = mVar;
        com.scandit.datacapture.barcode.internal.module.count.ui.status.a aVar = new com.scandit.datacapture.barcode.internal.module.count.ui.status.a(context, null, 0);
        this.f121391d = aVar;
        this.f121392e = I.f121379a;
        this.f121393f = com.scandit.datacapture.barcode.internal.module.count.ui.status.d.f121795a;
        mVar.setAlpha(0.0f);
        addView(c13080u, new FrameLayout.LayoutParams(-1, -1));
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
        a(this.f121391d, z10);
        if (a() == J.f121382a) {
            this.f121390c.a(true, z10);
        }
    }

    public final J a() {
        I i10 = this.f121392e;
        I i11 = I.f121379a;
        if (i10 == i11 && this.f121388a == com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f121819b) {
            com.scandit.datacapture.barcode.internal.module.count.ui.status.b bVar = this.f121393f;
            if (!Intrinsics.e(bVar, com.scandit.datacapture.barcode.internal.module.count.ui.status.d.f121795a) && !Intrinsics.e(bVar, com.scandit.datacapture.barcode.internal.module.count.ui.status.c.f121794a)) {
                if (!(bVar instanceof com.scandit.datacapture.barcode.internal.module.count.ui.status.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((com.scandit.datacapture.barcode.internal.module.count.ui.status.e) bVar).f121796a != BarcodeCountStatus.NONE) {
                    return J.f121382a;
                }
                return J.f121383b;
            }
            return J.f121382a;
        }
        if (i10 == i11 && this.f121388a == com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f121818a) {
            return J.f121382a;
        }
        if (i10 == I.f121380b) {
            return J.f121384c;
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
