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

/* loaded from: classes11.dex */
public final class SparkScanViewScanButtonView extends RelativeLayout {

    /* renamed from: l, reason: collision with root package name */
    private static final Lazy f123057l = LazyKt.b(j.f123111a);

    /* renamed from: m, reason: collision with root package name */
    private static final Lazy f123058m = LazyKt.b(i.f123110a);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f123059n = 0;

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanViewScanButtonTouchListener f123060a;

    /* renamed from: b, reason: collision with root package name */
    private final SparkScanStateManager f123061b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f123062c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f123063d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f123064e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f123065f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f123066g;

    /* renamed from: h, reason: collision with root package name */
    private c f123067h;

    /* renamed from: i, reason: collision with root package name */
    private e f123068i;

    /* renamed from: j, reason: collision with root package name */
    private k f123069j;

    /* renamed from: k, reason: collision with root package name */
    private ViewGroup f123070k;

    public final void a(Bitmap bitmap) {
        if (Intrinsics.e(bitmap, this.f123062c)) {
            return;
        }
        this.f123062c = bitmap;
        c cVar = this.f123067h;
        if (cVar != null) {
            cVar.a(bitmap);
        }
        e eVar = this.f123068i;
        if (eVar == null) {
            return;
        }
        eVar.a(bitmap);
    }

    public final Integer b() {
        return this.f123063d;
    }

    public final void c(Integer num) {
        if (Intrinsics.e(num, this.f123064e)) {
            return;
        }
        this.f123064e = num;
        e eVar = this.f123068i;
        if (eVar == null) {
            return;
        }
        eVar.f123087i = num;
        eVar.a(eVar.f123080b);
    }

    public final Integer d() {
        return this.f123064e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkScanViewScanButtonView(Context context, SparkScanViewScanButtonTouchListener scanButtonTouchListener, SparkScanStateManager stateManager) {
        super(context);
        Intrinsics.j(context, "context");
        Intrinsics.j(scanButtonTouchListener, "scanButtonTouchListener");
        Intrinsics.j(stateManager, "stateManager");
        this.f123060a = scanButtonTouchListener;
        this.f123061b = stateManager;
        this.f123062c = SparkScanViewDefaults.getDefaultTriggerButtonImage();
        this.f123063d = SparkScanViewDefaults.getDefaultTriggerButtonAnimationColor();
        this.f123064e = SparkScanViewDefaults.getDefaultTriggerButtonExpandedColor();
        this.f123065f = SparkScanViewDefaults.getDefaultTriggerButtonTintColor();
        this.f123066g = SparkScanViewDefaults.getDefaultTriggerButtonCollapsedColor();
        SparkScanViewDefaults.getDefaultTriggerButtonVisible();
        setClipChildren(false);
    }

    public final void b(Integer num) {
        if (Intrinsics.e(this.f123066g, num)) {
            return;
        }
        this.f123066g = num;
        c cVar = this.f123067h;
        if (cVar == null) {
            return;
        }
        cVar.f123076d = num;
        cVar.b(false);
    }

    public final void d(Integer num) {
        if (Intrinsics.e(this.f123065f, num)) {
            return;
        }
        this.f123065f = num;
        c cVar = this.f123067h;
        if (cVar != null) {
            cVar.f123077e = num;
            cVar.a();
        }
        e eVar = this.f123068i;
        if (eVar == null) {
            return;
        }
        eVar.f123088j = num;
        eVar.a(eVar.f123080b);
    }

    public final Bitmap e() {
        return this.f123062c;
    }

    public final Integer f() {
        return this.f123065f;
    }

    public final void g() {
        this.f123060a.a();
        a((View) this.f123068i);
    }

    public final void h() {
        e eVar = this.f123068i;
        if (eVar != null) {
            eVar.f123079a.b();
        }
    }

    public final void i() {
        e eVar = this.f123068i;
        if (eVar != null) {
            eVar.removeAllViews();
        }
        this.f123068i = null;
        removeAllViews();
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        c cVar = new c(context, this.f123062c, this.f123066g, this.f123065f, this.f123060a, this.f123069j);
        this.f123067h = cVar;
        int iIntValue = ((Number) E.f122991u.getValue()).intValue();
        Lazy lazy = E.f122992v;
        int iIntValue2 = ((Number) lazy.getValue()).intValue();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iIntValue, iIntValue2);
        layoutParams.width = iIntValue;
        layoutParams.height = iIntValue2;
        layoutParams.height = ((Number) lazy.getValue()).intValue();
        Unit unit = Unit.f142422a;
        addView(cVar, layoutParams);
        a(this.f123067h);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point pointA = a(new Size(i10, i11), true);
        float x10 = pointA.getX();
        float y10 = pointA.getY();
        if (y10 >= 0.0f && x10 >= 0.0f) {
            if (this.f123061b.x() < 0.0f || this.f123061b.w() < 0.0f) {
                this.f123060a.a(y10);
                this.f123060a.b(x10);
            }
            a((View) this.f123067h);
        }
    }

    private final Point a(Size size, boolean z10) {
        int iIntValue;
        int iIntValue2;
        float fE;
        if (z10) {
            iIntValue = ((Number) E.f122991u.getValue()).intValue();
        } else {
            iIntValue = ((Number) E.f122986p.getValue()).intValue();
        }
        if (z10) {
            iIntValue2 = ((Number) E.f122992v.getValue()).intValue();
        } else {
            iIntValue2 = ((Number) E.f122985o.getValue()).intValue();
        }
        float fE2 = RangesKt.e((size.getHeight() * 2) / 3.0f, size.getHeight() - ((Number) f123058m.getValue()).floatValue());
        if (l.f123112a[this.f123061b.o().ordinal()] == 1) {
            fE = RangesKt.j(size.getWidth() / 3.0f, ((Number) f123057l.getValue()).floatValue());
        } else {
            fE = RangesKt.e((size.getWidth() * 2) / 3.0f, size.getWidth() - ((Number) f123057l.getValue()).floatValue());
        }
        return new Point(fE - (iIntValue / 2.0f), fE2 - (iIntValue2 / 2.0f));
    }

    public final Integer c() {
        return this.f123066g;
    }

    public final void b(SparkScanViewState state) {
        Intrinsics.j(state, "state");
        e eVar = this.f123068i;
        if (eVar != null) {
            eVar.a(state);
        }
    }

    public final void a(Integer num) {
        if (Intrinsics.e(num, this.f123063d)) {
            return;
        }
        this.f123063d = num;
        e eVar = this.f123068i;
        if (eVar == null) {
            return;
        }
        eVar.f123089k = num;
        eVar.a(eVar.f123080b);
    }

    public final void a(ViewGroup container) {
        Intrinsics.j(container, "container");
        if (getParent() != null) {
            return;
        }
        this.f123070k = container;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.width = -1;
        layoutParams.height = -1;
        container.addView(this, layoutParams);
    }

    public final void a(k kVar) {
        this.f123069j = kVar;
    }

    public final void a() {
        this.f123069j = null;
        e eVar = this.f123068i;
        if (eVar != null) {
            eVar.removeAllViews();
        }
        this.f123068i = null;
        c cVar = this.f123067h;
        if (cVar != null) {
            cVar.removeAllViews();
        }
        this.f123067h = null;
        removeAllViews();
    }

    public final void a(SparkScanViewState viewState) {
        Intrinsics.j(viewState, "viewState");
        c cVar = this.f123067h;
        if (cVar != null) {
            cVar.setVisibility(4);
        }
        if (this.f123068i == null) {
            Context context = getContext();
            Intrinsics.i(context, "getContext(...)");
            e eVar = new e(context, this.f123062c, this.f123064e, this.f123065f, this.f123063d, this.f123060a, viewState, this.f123069j);
            this.f123068i = eVar;
            int iIntValue = ((Number) E.f122984n.getValue()).intValue();
            int iIntValue2 = ((Number) E.f122985o.getValue()).intValue();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iIntValue, iIntValue2);
            layoutParams.width = iIntValue;
            layoutParams.height = iIntValue2;
            addView(eVar, layoutParams);
            a(this.f123068i);
            return;
        }
        b(viewState);
    }

    private final void a(View view) {
        Point pointA;
        if (view == null) {
            return;
        }
        ViewGroup viewGroup = this.f123070k;
        if (viewGroup == null) {
            Intrinsics.y("container");
            viewGroup = null;
        }
        Size correctedViewSize = ViewExtensionsKt.getCorrectedViewSize(viewGroup, this.f123061b.z());
        int height = correctedViewSize.getHeight();
        int width = correctedViewSize.getWidth();
        if (width <= 0 || height <= 0) {
            return;
        }
        SparkScanStateManager sparkScanStateManager = this.f123061b;
        if ((sparkScanStateManager.w() <= 0.0f || sparkScanStateManager.x() <= 0.0f) && !this.f123061b.h()) {
            Intrinsics.j(view, "<this>");
            pointA = a(correctedViewSize, view instanceof c);
        } else {
            Intrinsics.j(view, "<this>");
            if (view instanceof e) {
                pointA = this.f123060a.b(width, height);
            } else {
                pointA = this.f123060a.a(width, height);
            }
        }
        view.animate().cancel();
        view.setX(pointA.getX());
        view.setY(pointA.getY());
    }

    public final void a(boolean z10) {
        float fFloatValue;
        c cVar = this.f123067h;
        if (cVar != null) {
            cVar.a(z10);
        }
        e eVar = this.f123068i;
        if (eVar != null) {
            eVar.f123090l = z10;
            if (z10) {
                fFloatValue = ((Number) E.f122982l.getValue()).floatValue();
            } else {
                if (z10) {
                    throw new NoWhenBranchMatchedException();
                }
                fFloatValue = 0.0f;
            }
            eVar.f123084f.setElevation(fFloatValue);
        }
    }
}
