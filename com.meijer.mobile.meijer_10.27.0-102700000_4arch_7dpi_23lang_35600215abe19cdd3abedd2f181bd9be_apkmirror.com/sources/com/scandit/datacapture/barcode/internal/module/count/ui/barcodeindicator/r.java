package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListStatus;
import com.scandit.datacapture.barcode.internal.module.ui.popover.C13260m;
import com.scandit.datacapture.barcode.internal.module.ui.popover.EnumC13257j;
import com.scandit.datacapture.barcode.internal.module.ui.popover.InterfaceC13261n;
import com.scandit.datacapture.barcode.internal.module.ui.popover.InterfaceC13262o;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.internal.sdk.common.geometry.Vector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class r extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13079t f121451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f121452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f121453c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f121454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f121455e;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        C13084y c13084y;
        TrackedBarcode trackedBarcode;
        C13079t c13079t = this.f121451a;
        long j10 = c13079t.f121465i;
        long j11 = this.f121452b;
        if (j10 != j11) {
            c13079t.f121465i = j11;
            c13079t.c();
        }
        C13079t.a(this.f121451a, this.f121453c, (ArrayList) this.f121454d);
        C13079t c13079t2 = this.f121451a;
        List infos = this.f121455e;
        com.scandit.datacapture.barcode.internal.module.count.ui.barcodeoverlay.a aVar = (com.scandit.datacapture.barcode.internal.module.count.ui.barcodeoverlay.a) c13079t2.f121472p.getValue();
        if (aVar != null) {
            Intrinsics.j(infos, "infos");
            aVar.f121505b = infos;
            aVar.invalidate();
        }
        C13084y c13084y2 = (C13084y) this.f121451a.f121459c;
        TrackedBarcode trackedBarcode2 = c13084y2.f121492e;
        int i10 = 0;
        if (trackedBarcode2 != null) {
            V barcodeInfo = ((U) c13084y2.f121490c).a(trackedBarcode2);
            com.scandit.datacapture.barcode.internal.module.count.ui.popover.h hVar = c13084y2.f121493f;
            NativeBarcodeCountNotInListStatus barcodeState = c13084y2.f121491d;
            hVar.getClass();
            Intrinsics.j(barcodeState, "barcodeState");
            Intrinsics.j(barcodeInfo, "barcodeInfo");
            boolean zA = ((C13260m) hVar.f121767c).a(0, barcodeState != NativeBarcodeCountNotInListStatus.REJECTED);
            boolean zA2 = ((C13260m) hVar.f121767c).a(1, barcodeState != NativeBarcodeCountNotInListStatus.ACCEPTED);
            if (zA || zA2) {
                hVar.f121769e = null;
            }
            int iFloatValue = (int) (((Number) com.scandit.datacapture.barcode.internal.module.count.ui.popover.h.f121764f.getValue()).floatValue() * barcodeInfo.f121415d);
            int x10 = (int) barcodeInfo.f121414c.getX();
            int y10 = (int) barcodeInfo.f121414c.getY();
            Lazy lazy = com.scandit.datacapture.barcode.internal.module.ui.popover.O.f123374f;
            com.scandit.datacapture.barcode.internal.module.ui.popover.O o10 = new com.scandit.datacapture.barcode.internal.module.ui.popover.O(x10, y10, ((Number) lazy.getValue()).intValue() + iFloatValue, ((Number) lazy.getValue()).intValue() + iFloatValue);
            InterfaceC13262o interfaceC13262o = hVar.f121768d;
            com.scandit.datacapture.barcode.internal.module.ui.popover.P p10 = hVar.f121769e;
            if (p10 == null) {
                p10 = new com.scandit.datacapture.barcode.internal.module.ui.popover.P(((C13260m) hVar.f121767c).b(EnumC13257j.f123396a), ((C13260m) hVar.f121767c).b(EnumC13257j.f123397b));
                hVar.f121769e = p10;
            }
            com.scandit.datacapture.barcode.internal.module.ui.popover.L lA = ((com.scandit.datacapture.barcode.internal.module.ui.popover.K) interfaceC13262o).a(o10, p10);
            ((C13260m) hVar.f121767c).a(lA.f123355a);
            InterfaceC13261n interfaceC13261n = hVar.f121767c;
            int i11 = lA.f123356b;
            int i12 = lA.f123357c;
            C13260m c13260m = (C13260m) interfaceC13261n;
            ViewGroup.LayoutParams layoutParams = c13260m.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = i11;
                layoutParams2.topMargin = i12;
                Lazy lazy2 = C13260m.f123401d;
                layoutParams2.rightMargin = ((Number) lazy2.getValue()).intValue();
                layoutParams2.bottomMargin = ((Number) lazy2.getValue()).intValue();
            } else {
                layoutParams2 = null;
            }
            c13260m.setLayoutParams(layoutParams2);
            if (lA.f123358d && (c13084y = (C13084y) ((C13083x) hVar.f121766b).f121486a.get()) != null && (trackedBarcode = c13084y.f121492e) != null) {
                c13084y.f121488a.didCancelNotInListBarcode(trackedBarcode);
            }
            C13260m c13260m2 = (C13260m) hVar.f121767c;
            c13260m2.getClass();
            c13260m2.setVisibility(0);
            c13084y2.f121489b.b().setVisibility(0);
            c13084y2.f121489b.h().setVisibility(0);
            unit = Unit.f142422a;
        } else {
            unit = null;
        }
        if (unit == null && c13084y2.f121489b.b().getVisibility() != 8) {
            c13084y2.f121489b.b().setVisibility(8);
            c13084y2.f121489b.h().setVisibility(8);
            C13260m c13260m3 = (C13260m) c13084y2.f121493f.f121767c;
            c13260m3.getClass();
            c13260m3.setVisibility(4);
        }
        G g10 = this.f121451a.f121473q;
        List<z> clusterDataList = this.f121454d;
        g10.getClass();
        Intrinsics.j(clusterDataList, "clusterDataList");
        HashSet hashSet = new HashSet();
        g10.f121374f.clear();
        for (z zVar : clusterDataList) {
            Iterator it = zVar.f121496c.iterator();
            while (it.hasNext()) {
                g10.f121374f.put(Integer.valueOf(((Number) it.next()).intValue()), Integer.valueOf(zVar.f121494a));
            }
            hashSet.add(Integer.valueOf(zVar.f121494a));
            Quadrilateral quadrilateral = zVar.f121497d;
            Vector vector = new Vector(QuadrilateralUtilsKt.getTopCenter(quadrilateral), QuadrilateralUtilsKt.getBottomCenter(quadrilateral));
            float length = vector.getLength();
            Vector normalizedVector = vector.normalized();
            Point center = QuadrilateralUtilsKt.getCenter(quadrilateral);
            LinkedHashMap linkedHashMap = g10.f121370b;
            Integer numValueOf = Integer.valueOf(zVar.f121494a);
            Object e10 = linkedHashMap.get(numValueOf);
            if (e10 == null) {
                e10 = new E(g10, center, length, normalizedVector, zVar);
                linkedHashMap.put(numValueOf, e10);
            }
            E e11 = (E) e10;
            Intrinsics.j(center, "center");
            Intrinsics.j(normalizedVector, "normalizedVector");
            int size = e11.f121366e.size();
            float fA = E.a(length, size);
            ArrayList arrayList = e11.f121366e;
            G g11 = e11.f121367f;
            Iterator it2 = arrayList.iterator();
            int i13 = i10;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.w();
                }
                G.a(g11, (L) next, E.a(i13, center, fA, size, normalizedVector), fA);
                i13 = i14;
            }
            e11.f121362a = center;
            e11.f121363b = length;
            e11.f121364c = normalizedVector;
            i10 = 0;
        }
        Iterator it3 = g10.f121370b.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            E e12 = (E) entry.getValue();
            if (!hashSet.contains(Integer.valueOf(iIntValue))) {
                Iterator it4 = e12.f121366e.iterator();
                while (it4.hasNext()) {
                    L l10 = (L) it4.next();
                    ViewParent parent = l10.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(l10);
                    }
                }
                e12.f121366e.clear();
                it3.remove();
            }
        }
        boolean z10 = (clusterDataList.size() == g10.f121372d && g10.f121370b.size() == g10.f121373e) ? false : true;
        if (z10) {
            g10.f121372d = clusterDataList.size();
            g10.f121373e = g10.f121370b.size();
        }
        if (z10) {
            g10.a();
        }
        if (!g10.f121370b.isEmpty() && g10.f121376h.f121346a) {
            for (E e13 : g10.f121370b.values()) {
                boolean z11 = g10.f121376h.f121347b;
                if (e13.f121366e.isEmpty()) {
                    int size2 = e13.f121365d.f121496c.size();
                    float fA2 = E.a(e13.f121363b, size2);
                    List list = e13.f121365d.f121496c;
                    G g12 = e13.f121367f;
                    int i15 = 0;
                    for (Object obj : list) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            CollectionsKt.w();
                        }
                        ((Number) obj).intValue();
                        L lA2 = e13.a(i15, new B(g12, e13, i15, fA2, size2));
                        int i17 = L.f121387h;
                        L.b(lA2.f121391d, true);
                        if (lA2.a() == J.f121382a) {
                            lA2.f121390c.a(false, true);
                        }
                        i15 = i16;
                    }
                } else {
                    Iterator it5 = e13.f121366e.iterator();
                    while (it5.hasNext()) {
                        L l11 = (L) it5.next();
                        L.b(l11.f121391d, z11);
                        if (l11.a() == J.f121382a) {
                            l11.f121390c.a(false, z11);
                        }
                    }
                }
            }
        }
        return Unit.f142422a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C13079t c13079t, long j10, List list, ArrayList arrayList, ArrayList arrayList2) {
        super(0);
        this.f121451a = c13079t;
        this.f121452b = j10;
        this.f121453c = list;
        this.f121454d = arrayList;
        this.f121455e = arrayList2;
    }
}
