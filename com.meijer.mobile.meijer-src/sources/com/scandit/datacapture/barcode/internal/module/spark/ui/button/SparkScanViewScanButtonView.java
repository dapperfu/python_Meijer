package com.scandit.datacapture.barcode.internal.module.spark.ui.button;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.ui.E;
import com.scandit.datacapture.barcode.spark.capture.SparkScanViewDefaults;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewState;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes12.dex */
public final class SparkScanViewScanButtonView extends RelativeLayout {

    /* renamed from: l, reason: collision with root package name */
    private static final Lazy f124009l = LazyKt.b(j.f124063a);

    /* renamed from: m, reason: collision with root package name */
    private static final Lazy f124010m = LazyKt.b(i.f124062a);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f124011n = 0;

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanViewScanButtonTouchListener f124012a;

    /* renamed from: b, reason: collision with root package name */
    private final SparkScanStateManager f124013b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f124014c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f124015d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f124016e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f124017f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f124018g;

    /* renamed from: h, reason: collision with root package name */
    private c f124019h;

    /* renamed from: i, reason: collision with root package name */
    private e f124020i;

    /* renamed from: j, reason: collision with root package name */
    private k f124021j;

    /* renamed from: k, reason: collision with root package name */
    private ViewGroup f124022k;

    public final void a(Bitmap bitmap) {
        if (Intrinsics.e(bitmap, this.f124014c)) {
            return;
        }
        this.f124014c = bitmap;
        c cVar = this.f124019h;
        if (cVar != null) {
            cVar.a(bitmap);
        }
        e eVar = this.f124020i;
        if (eVar == null) {
            return;
        }
        eVar.a(bitmap);
    }

    public final Integer b() {
        return this.f124015d;
    }

    public final void c(Integer num) {
        if (Intrinsics.e(num, this.f124016e)) {
            return;
        }
        this.f124016e = num;
        e eVar = this.f124020i;
        if (eVar == null) {
            return;
        }
        eVar.f124039i = num;
        eVar.a(eVar.f124032b);
    }

    public final Integer d() {
        return this.f124016e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkScanViewScanButtonView(Context context, SparkScanViewScanButtonTouchListener scanButtonTouchListener, SparkScanStateManager stateManager) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(scanButtonTouchListener, "scanButtonTouchListener");
        Intrinsics.j(stateManager, "stateManager");
        this.f124012a = scanButtonTouchListener;
        this.f124013b = stateManager;
        this.f124014c = SparkScanViewDefaults.getDefaultTriggerButtonImage();
        this.f124015d = SparkScanViewDefaults.getDefaultTriggerButtonAnimationColor();
        this.f124016e = SparkScanViewDefaults.getDefaultTriggerButtonExpandedColor();
        this.f124017f = SparkScanViewDefaults.getDefaultTriggerButtonTintColor();
        this.f124018g = SparkScanViewDefaults.getDefaultTriggerButtonCollapsedColor();
        SparkScanViewDefaults.getDefaultTriggerButtonVisible();
        setClipChildren(false);
    }

    public final void b(Integer num) {
        if (Intrinsics.e(this.f124018g, num)) {
            return;
        }
        this.f124018g = num;
        c cVar = this.f124019h;
        if (cVar == null) {
            return;
        }
        cVar.f124028d = num;
        cVar.b(false);
    }

    public final void d(Integer num) {
        if (Intrinsics.e(this.f124017f, num)) {
            return;
        }
        this.f124017f = num;
        c cVar = this.f124019h;
        if (cVar != null) {
            cVar.f124029e = num;
            cVar.a();
        }
        e eVar = this.f124020i;
        if (eVar == null) {
            return;
        }
        eVar.f124040j = num;
        eVar.a(eVar.f124032b);
    }

    public final Bitmap e() {
        return this.f124014c;
    }

    public final Integer f() {
        return this.f124017f;
    }

    public final void g() {
        this.f124012a.a();
        a((View) this.f124020i);
    }

    public final void h() {
        e eVar = this.f124020i;
        if (eVar != null) {
            eVar.f124031a.b();
        }
    }

    public final void i() {
        e eVar = this.f124020i;
        if (eVar != null) {
            eVar.removeAllViews();
        }
        this.f124020i = null;
        removeAllViews();
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        c cVar = new c(context, this.f124014c, this.f124018g, this.f124017f, this.f124012a, this.f124021j);
        this.f124019h = cVar;
        int iIntValue = ((Number) E.f123943u.getValue()).intValue();
        Lazy lazy = E.f123944v;
        int iIntValue2 = ((Number) lazy.getValue()).intValue();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iIntValue, iIntValue2);
        layoutParams.width = iIntValue;
        layoutParams.height = iIntValue2;
        layoutParams.height = ((Number) lazy.getValue()).intValue();
        Unit unit = Unit.f143329a;
        addView(cVar, layoutParams);
        a(this.f124019h);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point pointA = a(new Size(i10, i11), true);
        float x10 = pointA.getX();
        float y10 = pointA.getY();
        if (y10 >= 0.0f && x10 >= 0.0f) {
            if (this.f124013b.x() < 0.0f || this.f124013b.w() < 0.0f) {
                this.f124012a.a(y10);
                this.f124012a.b(x10);
            }
            a((View) this.f124019h);
        }
    }

    private final Point a(Size size, boolean z10) {
        int iIntValue;
        int iIntValue2;
        float fE;
        if (z10) {
            iIntValue = ((Number) E.f123943u.getValue()).intValue();
        } else {
            iIntValue = ((Number) E.f123938p.getValue()).intValue();
        }
        if (z10) {
            iIntValue2 = ((Number) E.f123944v.getValue()).intValue();
        } else {
            iIntValue2 = ((Number) E.f123937o.getValue()).intValue();
        }
        float fE2 = RangesKt.e((size.getHeight() * 2) / 3.0f, size.getHeight() - ((Number) f124010m.getValue()).floatValue());
        if (l.f124064a[this.f124013b.o().ordinal()] == 1) {
            fE = RangesKt.j(size.getWidth() / 3.0f, ((Number) f124009l.getValue()).floatValue());
        } else {
            fE = RangesKt.e((size.getWidth() * 2) / 3.0f, size.getWidth() - ((Number) f124009l.getValue()).floatValue());
        }
        return new Point(fE - (iIntValue / 2.0f), fE2 - (iIntValue2 / 2.0f));
    }

    public final Integer c() {
        return this.f124018g;
    }

    public final void b(SparkScanViewState state) {
        Intrinsics.j(state, "state");
        e eVar = this.f124020i;
        if (eVar != null) {
            eVar.a(state);
        }
    }

    public final void a(Integer num) {
        if (Intrinsics.e(num, this.f124015d)) {
            return;
        }
        this.f124015d = num;
        e eVar = this.f124020i;
        if (eVar == null) {
            return;
        }
        eVar.f124041k = num;
        eVar.a(eVar.f124032b);
    }

    public final void a(ViewGroup container) {
        Intrinsics.j(container, "container");
        if (getParent() != null) {
            return;
        }
        this.f124022k = container;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.width = -1;
        layoutParams.height = -1;
        container.addView(this, layoutParams);
    }

    public final void a(k kVar) {
        this.f124021j = kVar;
    }

    public final void a() {
        this.f124021j = null;
        e eVar = this.f124020i;
        if (eVar != null) {
            eVar.removeAllViews();
        }
        this.f124020i = null;
        c cVar = this.f124019h;
        if (cVar != null) {
            cVar.removeAllViews();
        }
        this.f124019h = null;
        removeAllViews();
    }

    public final void a(SparkScanViewState viewState) {
        Intrinsics.j(viewState, "viewState");
        c cVar = this.f124019h;
        if (cVar != null) {
            cVar.setVisibility(4);
        }
        if (this.f124020i == null) {
            Context context = getContext();
            Intrinsics.i(context, "getContext(...)");
            e eVar = new e(context, this.f124014c, this.f124016e, this.f124017f, this.f124015d, this.f124012a, viewState, this.f124021j);
            this.f124020i = eVar;
            int iIntValue = ((Number) E.f123936n.getValue()).intValue();
            int iIntValue2 = ((Number) E.f123937o.getValue()).intValue();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iIntValue, iIntValue2);
            layoutParams.width = iIntValue;
            layoutParams.height = iIntValue2;
            addView(eVar, layoutParams);
            a(this.f124020i);
            return;
        }
        b(viewState);
    }

    private final void a(View view) {
        Point pointA;
        if (view == null) {
            return;
        }
        ViewGroup viewGroup = this.f124022k;
        if (viewGroup == null) {
            Intrinsics.x("container");
            viewGroup = null;
        }
        Size correctedViewSize = ViewExtensionsKt.getCorrectedViewSize(viewGroup, this.f124013b.z());
        int height = correctedViewSize.getHeight();
        int width = correctedViewSize.getWidth();
        if (width <= 0 || height <= 0) {
            return;
        }
        SparkScanStateManager sparkScanStateManager = this.f124013b;
        if ((sparkScanStateManager.w() <= 0.0f || sparkScanStateManager.x() <= 0.0f) && !this.f124013b.h()) {
            Intrinsics.j(view, "<this>");
            pointA = a(correctedViewSize, view instanceof c);
        } else {
            Intrinsics.j(view, "<this>");
            if (view instanceof e) {
                pointA = this.f124012a.b(width, height);
            } else {
                pointA = this.f124012a.a(width, height);
            }
        }
        view.animate().cancel();
        view.setX(pointA.getX());
        view.setY(pointA.getY());
    }

    public final void a(boolean z10) {
        float fFloatValue;
        c cVar = this.f124019h;
        if (cVar != null) {
            cVar.a(z10);
        }
        e eVar = this.f124020i;
        if (eVar != null) {
            eVar.f124042l = z10;
            if (z10) {
                fFloatValue = ((Number) E.f123934l.getValue()).floatValue();
            } else {
                if (z10) {
                    throw new NoWhenBranchMatchedException();
                }
                fFloatValue = 0.0f;
            }
            eVar.f124036f.setElevation(fFloatValue);
        }
    }
}
