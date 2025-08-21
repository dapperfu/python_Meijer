package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.AnchorExtensionsKt;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* loaded from: classes12.dex */
public final class n1 implements i1 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f122992h = {com.scandit.datacapture.barcode.ar.ui.annotations.a.a(n1.class, "showTorchButton", "getShowTorchButton()Z", 0)};

    /* renamed from: a, reason: collision with root package name */
    public final Context f122993a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodeCountViewUiLayoutHelper f122994b;

    /* renamed from: c, reason: collision with root package name */
    public final BarcodeCountDataCaptureViewHolder f122995c;

    /* renamed from: d, reason: collision with root package name */
    public final m1 f122996d;

    /* renamed from: e, reason: collision with root package name */
    public Anchor f122997e;

    /* renamed from: f, reason: collision with root package name */
    public Set f122998f;

    /* renamed from: g, reason: collision with root package name */
    public final TorchSwitchControl f122999g;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void b() {
    }

    public n1(Context context, C13248h layoutHelper, C13234a controlHandler) {
        Intrinsics.j(context, "context");
        Intrinsics.j(layoutHelper, "layoutHelper");
        Intrinsics.j(controlHandler, "controlHandler");
        this.f122993a = context;
        this.f122994b = layoutHelper;
        this.f122995c = controlHandler;
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        Boolean boolValueOf = Boolean.valueOf(barcodeCountViewDefaults.getShouldShowTorchControl());
        Delegates delegates = Delegates.f143781a;
        this.f122996d = new m1(boolValueOf, this);
        this.f122997e = barcodeCountViewDefaults.getTorchControlPosition();
        this.f122998f = SetsKt.e();
        this.f122999g = new TorchSwitchControl(context);
    }

    public final void c() {
        Anchor anchorRotate90DegreesCounterClockwise;
        PointWithUnit PointWithUnit;
        this.f122995c.a(this.f122999g);
        if (((Boolean) this.f122996d.getValue(this, f122992h[0])).booleanValue()) {
            boolean zA = com.scandit.datacapture.barcode.internal.module.extensions.b.a(this.f122993a);
            Anchor anchor = this.f122997e;
            if (zA) {
                int i10 = j1.f122975a[anchor.ordinal()];
                anchorRotate90DegreesCounterClockwise = AnchorExtensionsKt.rotate90DegreesCounterClockwise(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Anchor.TOP_LEFT : Anchor.BOTTOM_RIGHT : Anchor.TOP_RIGHT : Anchor.BOTTOM_LEFT : Anchor.TOP_LEFT);
            } else {
                int i11 = j1.f122975a[anchor.ordinal()];
                anchorRotate90DegreesCounterClockwise = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? Anchor.TOP_LEFT : Anchor.BOTTOM_RIGHT : Anchor.TOP_RIGHT : Anchor.BOTTOM_LEFT : Anchor.TOP_LEFT;
            }
            if (zA) {
                k1 k1Var = new k1(this);
                int i12 = j1.f122975a[anchorRotate90DegreesCounterClockwise.ordinal()];
                if (i12 == 1 || i12 == 2) {
                    PointWithUnit = PointWithUnitUtilsKt.PointWithUnit(AbstractC13236b.f122924j, this.f122994b.h() + AbstractC13236b.f122921g, MeasureUnit.PIXEL);
                } else if (i12 == 3) {
                    PointWithUnit = (PointWithUnit) k1Var.invoke(Boolean.valueOf(this.f122998f.contains(Anchor.BOTTOM_RIGHT)));
                } else {
                    if (i12 != 4) {
                        throw new IllegalStateException("Unsupported anchor");
                    }
                    PointWithUnit = (PointWithUnit) k1Var.invoke(Boolean.valueOf(this.f122998f.contains(Anchor.BOTTOM_LEFT)));
                }
            } else {
                l1 l1Var = new l1(this);
                int i13 = j1.f122975a[anchorRotate90DegreesCounterClockwise.ordinal()];
                if (i13 == 1) {
                    float f10 = AbstractC13236b.f122922h;
                    PointWithUnit = PointWithUnitUtilsKt.PointWithUnit(f10, f10, MeasureUnit.PIXEL);
                } else {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 != 4) {
                                throw new IllegalStateException(("Unreachable anchor " + anchorRotate90DegreesCounterClockwise).toString());
                            }
                        }
                        float f102 = AbstractC13236b.f122922h;
                        PointWithUnit = PointWithUnitUtilsKt.PointWithUnit(f102, f102, MeasureUnit.PIXEL);
                    }
                    PointWithUnit = (PointWithUnit) l1Var.invoke(Boolean.valueOf(this.f122998f.contains(anchorRotate90DegreesCounterClockwise)));
                }
            }
            Pair pairA = TuplesKt.a(anchorRotate90DegreesCounterClockwise, PointWithUnit);
            this.f122995c.a(this.f122999g, (Anchor) pairA.a(), (PointWithUnit) pairA.b());
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.InterfaceC13238c
    public final void a() {
        c();
    }
}
