package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListStatus;
import com.scandit.datacapture.barcode.internal.module.ui.popover.C13393m;
import com.scandit.datacapture.barcode.internal.module.ui.popover.EnumC13390j;
import com.scandit.datacapture.barcode.internal.module.ui.popover.InterfaceC13394n;
import com.scandit.datacapture.barcode.internal.module.ui.popover.InterfaceC13395o;
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

/* loaded from: classes12.dex */
public final class r extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13212t f122403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f122404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f122405c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f122406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f122407e;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        C13217y c13217y;
        TrackedBarcode trackedBarcode;
        C13212t c13212t = this.f122403a;
        long j10 = c13212t.f122417i;
        long j11 = this.f122404b;
        if (j10 != j11) {
            c13212t.f122417i = j11;
            c13212t.c();
        }
        C13212t.a(this.f122403a, this.f122405c, (ArrayList) this.f122406d);
        C13212t c13212t2 = this.f122403a;
        List infos = this.f122407e;
        com.scandit.datacapture.barcode.internal.module.count.ui.barcodeoverlay.a aVar = (com.scandit.datacapture.barcode.internal.module.count.ui.barcodeoverlay.a) c13212t2.f122424p.getValue();
        if (aVar != null) {
            Intrinsics.j(infos, "infos");
            aVar.f122457b = infos;
            aVar.invalidate();
        }
        C13217y c13217y2 = (C13217y) this.f122403a.f122411c;
        TrackedBarcode trackedBarcode2 = c13217y2.f122444e;
        int i10 = 0;
        if (trackedBarcode2 != null) {
            V barcodeInfo = ((U) c13217y2.f122442c).a(trackedBarcode2);
            com.scandit.datacapture.barcode.internal.module.count.ui.popover.h hVar = c13217y2.f122445f;
            NativeBarcodeCountNotInListStatus barcodeState = c13217y2.f122443d;
            hVar.getClass();
            Intrinsics.j(barcodeState, "barcodeState");
            Intrinsics.j(barcodeInfo, "barcodeInfo");
            boolean zA = ((C13393m) hVar.f122719c).a(0, barcodeState != NativeBarcodeCountNotInListStatus.REJECTED);
            boolean zA2 = ((C13393m) hVar.f122719c).a(1, barcodeState != NativeBarcodeCountNotInListStatus.ACCEPTED);
            if (zA || zA2) {
                hVar.f122721e = null;
            }
            int iFloatValue = (int) (((Number) com.scandit.datacapture.barcode.internal.module.count.ui.popover.h.f122716f.getValue()).floatValue() * barcodeInfo.f122367d);
            int x10 = (int) barcodeInfo.f122366c.getX();
            int y10 = (int) barcodeInfo.f122366c.getY();
            Lazy lazy = com.scandit.datacapture.barcode.internal.module.ui.popover.O.f124326f;
            com.scandit.datacapture.barcode.internal.module.ui.popover.O o10 = new com.scandit.datacapture.barcode.internal.module.ui.popover.O(x10, y10, ((Number) lazy.getValue()).intValue() + iFloatValue, ((Number) lazy.getValue()).intValue() + iFloatValue);
            InterfaceC13395o interfaceC13395o = hVar.f122720d;
            com.scandit.datacapture.barcode.internal.module.ui.popover.P p10 = hVar.f122721e;
            if (p10 == null) {
                p10 = new com.scandit.datacapture.barcode.internal.module.ui.popover.P(((C13393m) hVar.f122719c).b(EnumC13390j.f124348a), ((C13393m) hVar.f122719c).b(EnumC13390j.f124349b));
                hVar.f122721e = p10;
            }
            com.scandit.datacapture.barcode.internal.module.ui.popover.L lA = ((com.scandit.datacapture.barcode.internal.module.ui.popover.K) interfaceC13395o).a(o10, p10);
            ((C13393m) hVar.f122719c).a(lA.f124307a);
            InterfaceC13394n interfaceC13394n = hVar.f122719c;
            int i11 = lA.f124308b;
            int i12 = lA.f124309c;
            C13393m c13393m = (C13393m) interfaceC13394n;
            ViewGroup.LayoutParams layoutParams = c13393m.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = i11;
                layoutParams2.topMargin = i12;
                Lazy lazy2 = C13393m.f124353d;
                layoutParams2.rightMargin = ((Number) lazy2.getValue()).intValue();
                layoutParams2.bottomMargin = ((Number) lazy2.getValue()).intValue();
            } else {
                layoutParams2 = null;
            }
            c13393m.setLayoutParams(layoutParams2);
            if (lA.f124310d && (c13217y = (C13217y) ((C13216x) hVar.f122718b).f122438a.get()) != null && (trackedBarcode = c13217y.f122444e) != null) {
                c13217y.f122440a.didCancelNotInListBarcode(trackedBarcode);
            }
            C13393m c13393m2 = (C13393m) hVar.f122719c;
            c13393m2.getClass();
            c13393m2.setVisibility(0);
            c13217y2.f122441b.b().setVisibility(0);
            c13217y2.f122441b.h().setVisibility(0);
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null && c13217y2.f122441b.b().getVisibility() != 8) {
            c13217y2.f122441b.b().setVisibility(8);
            c13217y2.f122441b.h().setVisibility(8);
            C13393m c13393m3 = (C13393m) c13217y2.f122445f.f122719c;
            c13393m3.getClass();
            c13393m3.setVisibility(4);
        }
        G g10 = this.f122403a.f122425q;
        List<z> clusterDataList = this.f122406d;
        g10.getClass();
        Intrinsics.j(clusterDataList, "clusterDataList");
        HashSet hashSet = new HashSet();
        g10.f122326f.clear();
        for (z zVar : clusterDataList) {
            Iterator it = zVar.f122448c.iterator();
            while (it.hasNext()) {
                g10.f122326f.put(Integer.valueOf(((Number) it.next()).intValue()), Integer.valueOf(zVar.f122446a));
            }
            hashSet.add(Integer.valueOf(zVar.f122446a));
            Quadrilateral quadrilateral = zVar.f122449d;
            Vector vector = new Vector(QuadrilateralUtilsKt.getTopCenter(quadrilateral), QuadrilateralUtilsKt.getBottomCenter(quadrilateral));
            float length = vector.getLength();
            Vector normalizedVector = vector.normalized();
            Point center = QuadrilateralUtilsKt.getCenter(quadrilateral);
            LinkedHashMap linkedHashMap = g10.f122322b;
            Integer numValueOf = Integer.valueOf(zVar.f122446a);
            Object e10 = linkedHashMap.get(numValueOf);
            if (e10 == null) {
                e10 = new E(g10, center, length, normalizedVector, zVar);
                linkedHashMap.put(numValueOf, e10);
            }
            E e11 = (E) e10;
            Intrinsics.j(center, "center");
            Intrinsics.j(normalizedVector, "normalizedVector");
            int size = e11.f122318e.size();
            float fA = E.a(length, size);
            ArrayList arrayList = e11.f122318e;
            G g11 = e11.f122319f;
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
            e11.f122314a = center;
            e11.f122315b = length;
            e11.f122316c = normalizedVector;
            i10 = 0;
        }
        Iterator it3 = g10.f122322b.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            E e12 = (E) entry.getValue();
            if (!hashSet.contains(Integer.valueOf(iIntValue))) {
                Iterator it4 = e12.f122318e.iterator();
                while (it4.hasNext()) {
                    L l10 = (L) it4.next();
                    ViewParent parent = l10.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(l10);
                    }
                }
                e12.f122318e.clear();
                it3.remove();
            }
        }
        boolean z10 = (clusterDataList.size() == g10.f122324d && g10.f122322b.size() == g10.f122325e) ? false : true;
        if (z10) {
            g10.f122324d = clusterDataList.size();
            g10.f122325e = g10.f122322b.size();
        }
        if (z10) {
            g10.a();
        }
        if (!g10.f122322b.isEmpty() && g10.f122328h.f122298a) {
            for (E e13 : g10.f122322b.values()) {
                boolean z11 = g10.f122328h.f122299b;
                if (e13.f122318e.isEmpty()) {
                    int size2 = e13.f122317d.f122448c.size();
                    float fA2 = E.a(e13.f122315b, size2);
                    List list = e13.f122317d.f122448c;
                    G g12 = e13.f122319f;
                    int i15 = 0;
                    for (Object obj : list) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            CollectionsKt.w();
                        }
                        ((Number) obj).intValue();
                        L lA2 = e13.a(i15, new B(g12, e13, i15, fA2, size2));
                        int i17 = L.f122339h;
                        L.b(lA2.f122343d, true);
                        if (lA2.a() == J.f122334a) {
                            lA2.f122342c.a(false, true);
                        }
                        i15 = i16;
                    }
                } else {
                    Iterator it5 = e13.f122318e.iterator();
                    while (it5.hasNext()) {
                        L l11 = (L) it5.next();
                        L.b(l11.f122343d, z11);
                        if (l11.a() == J.f122334a) {
                            l11.f122342c.a(false, z11);
                        }
                    }
                }
            }
        }
        return Unit.f143329a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C13212t c13212t, long j10, List list, ArrayList arrayList, ArrayList arrayList2) {
        super(0);
        this.f122403a = c13212t;
        this.f122404b = j10;
        this.f122405c = list;
        this.f122406d = arrayList;
        this.f122407e = arrayList2;
    }
}
