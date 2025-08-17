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

/* loaded from: classes11.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f121369a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f121370b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f121371c;

    /* renamed from: d, reason: collision with root package name */
    public int f121372d;

    /* renamed from: e, reason: collision with root package name */
    public int f121373e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f121374f;

    /* renamed from: g, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.count.ui.status.n f121375g;

    /* renamed from: h, reason: collision with root package name */
    public A f121376h;

    public static final void a(G g10, L l10, Point point, float f10) {
        g10.getClass();
        S.f121408a.getClass();
        float fFloatValue = ((Number) Q.f121407b.getValue()).floatValue() / 2;
        l10.setX(point.getX() - fFloatValue);
        l10.setY(point.getY() - fFloatValue);
        l10.setScaleX(f10);
        l10.setScaleY(f10);
    }

    public G(FrameLayout indicatorLayer) {
        Intrinsics.j(indicatorLayer, "indicatorLayer");
        this.f121369a = indicatorLayer;
        this.f121370b = new LinkedHashMap();
        this.f121372d = -1;
        this.f121373e = -1;
        this.f121374f = new LinkedHashMap();
        this.f121375g = com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f121818a;
        this.f121376h = new A(false, false);
    }

    public final void a() {
        Integer num;
        if (O.e()) {
            this.f121376h = new A(false, false);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : O.c().entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                com.scandit.datacapture.barcode.internal.module.count.ui.status.b bVar = (com.scandit.datacapture.barcode.internal.module.count.ui.status.b) entry.getValue();
                if (!Intrinsics.e(bVar, com.scandit.datacapture.barcode.internal.module.count.ui.status.d.f121795a)) {
                    if (Intrinsics.e(bVar, com.scandit.datacapture.barcode.internal.module.count.ui.status.c.f121794a)) {
                        Integer num2 = (Integer) this.f121374f.get(Integer.valueOf(iIntValue));
                        if (num2 != null) {
                            a(linkedHashMap, num2.intValue(), bVar);
                        }
                    } else if (bVar instanceof com.scandit.datacapture.barcode.internal.module.count.ui.status.e) {
                        Integer num3 = ((com.scandit.datacapture.barcode.internal.module.count.ui.status.e) bVar).f121797b;
                        if (num3 != null) {
                            a(linkedHashMap, num3.intValue(), bVar);
                        } else {
                            Integer num4 = (Integer) this.f121374f.get(Integer.valueOf(iIntValue));
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
                E e10 = (E) this.f121370b.get(Integer.valueOf(iIntValue2));
                if (e10 != null) {
                    Intrinsics.j(statuses, "statuses");
                    while (true) {
                        num = null;
                        if (e10.f121366e.size() <= statuses.size()) {
                            break;
                        }
                        L l10 = (L) CollectionsKt.N(e10.f121366e);
                        ViewParent parent = l10 != null ? l10.getParent() : null;
                        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup != null) {
                            viewGroup.removeView(l10);
                        }
                    }
                    int size = e10.f121366e.size();
                    float fA = E.a(e10.f121363b, size);
                    if (!statuses.isEmpty()) {
                        List listY0 = CollectionsKt.Y0(statuses);
                        G g10 = e10.f121367f;
                        int i10 = 0;
                        for (Object obj : listY0) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                CollectionsKt.w();
                            }
                            L lA = e10.a(i10, new D(g10, e10, i10, fA, size));
                            I i12 = I.f121379a;
                            lA.getClass();
                            Intrinsics.j(i12, "<set-?>");
                            lA.f121392e = i12;
                            com.scandit.datacapture.barcode.internal.module.count.ui.status.e statusInternal = new com.scandit.datacapture.barcode.internal.module.count.ui.status.e((BarcodeCountStatus) obj, num);
                            Intrinsics.j(statusInternal, "statusInternal");
                            lA.f121393f = statusInternal;
                            com.scandit.datacapture.barcode.internal.module.count.ui.status.m mVar = lA.f121390c;
                            mVar.getClass();
                            Intrinsics.j(statusInternal, "statusInternal");
                            com.scandit.datacapture.barcode.internal.module.count.ui.status.m.f121814e.runOnMainThread(new com.scandit.datacapture.barcode.internal.module.count.ui.status.g(mVar, statusInternal));
                            if (g10.f121371c) {
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
                        G g11 = e10.f121367f;
                        if (g11.f121375g == com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f121819b) {
                            L lA2 = e10.a(0, new C(g11, e10, fA, size));
                            I i13 = I.f121379a;
                            lA2.getClass();
                            Intrinsics.j(i13, "<set-?>");
                            lA2.f121392e = i13;
                            L.b(lA2.f121389b, true);
                            lA2.f121390c.a(true);
                        }
                    }
                }
            }
        }
    }

    public final void a(LinkedHashMap clusterMap, int i10, com.scandit.datacapture.barcode.internal.module.count.ui.status.b statusInternal) {
        Intrinsics.j(clusterMap, "clusterMap");
        Intrinsics.j(statusInternal, "statusInternal");
        int iOrdinal = this.f121375g.ordinal();
        if (iOrdinal == 0) {
            if (Intrinsics.e(statusInternal, com.scandit.datacapture.barcode.internal.module.count.ui.status.d.f121795a)) {
                return;
            }
            if (Intrinsics.e(statusInternal, com.scandit.datacapture.barcode.internal.module.count.ui.status.c.f121794a)) {
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
                ((Set) objNoneOf2).add(((com.scandit.datacapture.barcode.internal.module.count.ui.status.e) statusInternal).f121796a);
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
        if (Intrinsics.e(statusInternal, com.scandit.datacapture.barcode.internal.module.count.ui.status.d.f121795a)) {
            return;
        }
        if (Intrinsics.e(statusInternal, com.scandit.datacapture.barcode.internal.module.count.ui.status.c.f121794a)) {
            set.add(BarcodeCountStatus.NOT_AVAILABLE);
            return;
        }
        if (statusInternal instanceof com.scandit.datacapture.barcode.internal.module.count.ui.status.e) {
            BarcodeCountStatus barcodeCountStatus = ((com.scandit.datacapture.barcode.internal.module.count.ui.status.e) statusInternal).f121796a;
            if (barcodeCountStatus == BarcodeCountStatus.NONE) {
                barcodeCountStatus = null;
            }
            if (barcodeCountStatus != null) {
                set.add(barcodeCountStatus);
            }
        }
    }
}
