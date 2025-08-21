package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountStatus;
import com.scandit.datacapture.core.common.geometry.Point;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f122321a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f122322b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f122323c;

    /* renamed from: d, reason: collision with root package name */
    public int f122324d;

    /* renamed from: e, reason: collision with root package name */
    public int f122325e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f122326f;

    /* renamed from: g, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.status.n f122327g;

    /* renamed from: h, reason: collision with root package name */
    public A f122328h;

    public static final void a(G g10, L l10, Point point, float f10) {
        g10.getClass();
        S.f122360a.getClass();
        float fFloatValue = ((Number) Q.f122359b.getValue()).floatValue() / 2;
        l10.setX(point.getX() - fFloatValue);
        l10.setY(point.getY() - fFloatValue);
        l10.setScaleX(f10);
        l10.setScaleY(f10);
    }

    public G(FrameLayout indicatorLayer) {
        Intrinsics.j(indicatorLayer, "indicatorLayer");
        this.f122321a = indicatorLayer;
        this.f122322b = new LinkedHashMap();
        this.f122324d = -1;
        this.f122325e = -1;
        this.f122326f = new LinkedHashMap();
        this.f122327g = com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f122770a;
        this.f122328h = new A(false, false);
    }

    public final void a() {
        Integer num;
        if (O.e()) {
            this.f122328h = new A(false, false);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : O.c().entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                com.scandit.datacapture.barcode.internal.module.count.ui.status.b bVar = (com.scandit.datacapture.barcode.internal.module.count.ui.status.b) entry.getValue();
                if (!Intrinsics.e(bVar, com.scandit.datacapture.barcode.internal.module.count.ui.status.d.f122747a)) {
                    if (Intrinsics.e(bVar, com.scandit.datacapture.barcode.internal.module.count.ui.status.c.f122746a)) {
                        Integer num2 = (Integer) this.f122326f.get(Integer.valueOf(iIntValue));
                        if (num2 != null) {
                            a(linkedHashMap, num2.intValue(), bVar);
                        }
                    } else if (bVar instanceof com.scandit.datacapture.barcode.internal.module.count.ui.status.e) {
                        Integer num3 = ((com.scandit.datacapture.barcode.internal.module.count.ui.status.e) bVar).f122749b;
                        if (num3 != null) {
                            a(linkedHashMap, num3.intValue(), bVar);
                        } else {
                            Integer num4 = (Integer) this.f122326f.get(Integer.valueOf(iIntValue));
                            if (num4 != null) {
                                a(linkedHashMap, num4.intValue(), bVar);
                            }
                        }
                    }
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue2 = ((Number) entry2.getKey()).intValue();
                Set statuses = (Set) entry2.getValue();
                E e10 = (E) this.f122322b.get(Integer.valueOf(iIntValue2));
                if (e10 != null) {
                    Intrinsics.j(statuses, "statuses");
                    while (true) {
                        num = null;
                        if (e10.f122318e.size() <= statuses.size()) {
                            break;
                        }
                        L l10 = (L) CollectionsKt.N(e10.f122318e);
                        ViewParent parent = l10 != null ? l10.getParent() : null;
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeView(l10);
                        }
                    }
                    int size = e10.f122318e.size();
                    float fA = E.a(e10.f122315b, size);
                    if (!statuses.isEmpty()) {
                        List listY0 = CollectionsKt.Y0(statuses);
                        G g10 = e10.f122319f;
                        int i10 = 0;
                        for (Object obj : listY0) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                CollectionsKt.w();
                            }
                            L lA = e10.a(i10, new D(g10, e10, i10, fA, size));
                            I i12 = I.f122331a;
                            lA.getClass();
                            Intrinsics.j(i12, "<set-?>");
                            lA.f122344e = i12;
                            com.scandit.datacapture.barcode.internal.module.count.ui.status.e statusInternal = new com.scandit.datacapture.barcode.internal.module.count.ui.status.e((BarcodeCountStatus) obj, num);
                            Intrinsics.j(statusInternal, "statusInternal");
                            lA.f122345f = statusInternal;
                            com.scandit.datacapture.barcode.internal.module.count.ui.status.m mVar = lA.f122342c;
                            mVar.getClass();
                            Intrinsics.j(statusInternal, "statusInternal");
                            com.scandit.datacapture.barcode.internal.module.count.ui.status.m.f122766e.runOnMainThread(new com.scandit.datacapture.barcode.internal.module.count.ui.status.g(mVar, statusInternal));
                            if (g10.f122323c) {
                                L.b(lA, false);
                                lA.b(true);
                                lA.a(true);
                            } else {
                                L.a(lA, false);
                            }
                            i10 = i11;
                            num = null;
                        }
                    } else {
                        G g11 = e10.f122319f;
                        if (g11.f122327g == com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f122771b) {
                            L lA2 = e10.a(0, new C(g11, e10, fA, size));
                            I i13 = I.f122331a;
                            lA2.getClass();
                            Intrinsics.j(i13, "<set-?>");
                            lA2.f122344e = i13;
                            L.b(lA2.f122341b, true);
                            lA2.f122342c.a(true);
                        }
                    }
                }
            }
        }
    }

    public final void a(LinkedHashMap clusterMap, int i10, com.scandit.datacapture.barcode.internal.module.count.ui.status.b statusInternal) {
        Intrinsics.j(clusterMap, "clusterMap");
        Intrinsics.j(statusInternal, "statusInternal");
        int iOrdinal = this.f122327g.ordinal();
        if (iOrdinal == 0) {
            if (Intrinsics.e(statusInternal, com.scandit.datacapture.barcode.internal.module.count.ui.status.d.f122747a)) {
                return;
            }
            if (Intrinsics.e(statusInternal, com.scandit.datacapture.barcode.internal.module.count.ui.status.c.f122746a)) {
                Integer numValueOf = Integer.valueOf(i10);
                Object objNoneOf = clusterMap.get(numValueOf);
                if (objNoneOf == null) {
                    objNoneOf = EnumSet.noneOf(BarcodeCountStatus.class);
                    Intrinsics.i(objNoneOf, "noneOf(...)");
                    clusterMap.put(numValueOf, objNoneOf);
                }
                ((Set) objNoneOf).add(BarcodeCountStatus.NOT_AVAILABLE);
                return;
            }
            if (statusInternal instanceof com.scandit.datacapture.barcode.internal.module.count.ui.status.e) {
                Integer numValueOf2 = Integer.valueOf(i10);
                Object objNoneOf2 = clusterMap.get(numValueOf2);
                if (objNoneOf2 == null) {
                    objNoneOf2 = EnumSet.noneOf(BarcodeCountStatus.class);
                    Intrinsics.i(objNoneOf2, "noneOf(...)");
                    clusterMap.put(numValueOf2, objNoneOf2);
                }
                ((Set) objNoneOf2).add(((com.scandit.datacapture.barcode.internal.module.count.ui.status.e) statusInternal).f122748a);
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            return;
        }
        Integer numValueOf3 = Integer.valueOf(i10);
        Object objNoneOf3 = clusterMap.get(numValueOf3);
        if (objNoneOf3 == null) {
            objNoneOf3 = EnumSet.noneOf(BarcodeCountStatus.class);
            Intrinsics.i(objNoneOf3, "noneOf(...)");
            clusterMap.put(numValueOf3, objNoneOf3);
        }
        Set set = (Set) objNoneOf3;
        if (Intrinsics.e(statusInternal, com.scandit.datacapture.barcode.internal.module.count.ui.status.d.f122747a)) {
            return;
        }
        if (Intrinsics.e(statusInternal, com.scandit.datacapture.barcode.internal.module.count.ui.status.c.f122746a)) {
            set.add(BarcodeCountStatus.NOT_AVAILABLE);
            return;
        }
        if (statusInternal instanceof com.scandit.datacapture.barcode.internal.module.count.ui.status.e) {
            BarcodeCountStatus barcodeCountStatus = ((com.scandit.datacapture.barcode.internal.module.count.ui.status.e) statusInternal).f122748a;
            if (barcodeCountStatus == BarcodeCountStatus.NONE) {
                barcodeCountStatus = null;
            }
            if (barcodeCountStatus != null) {
                set.add(barcodeCountStatus);
            }
        }
    }
}
