package com.scandit.datacapture.barcode.internal.module.find.ui;

import android.graphics.PointF;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindKt;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindProxy;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewUiListener;
import com.scandit.datacapture.barcode.internal.module.find.capture.BarcodeFindCameraManager;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes12.dex */
public final class x0 implements BarcodeFindViewPresenter {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeFindProxy f123331a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodeFindViewLayout f123332b;

    /* renamed from: c, reason: collision with root package name */
    public final BarcodeFindCameraManager f123333c;

    /* renamed from: d, reason: collision with root package name */
    public v0 f123334d;

    /* renamed from: e, reason: collision with root package name */
    public v0 f123335e;

    /* renamed from: f, reason: collision with root package name */
    public Map f123336f;

    /* renamed from: g, reason: collision with root package name */
    public Set f123337g;

    /* renamed from: h, reason: collision with root package name */
    public List f123338h;

    /* renamed from: i, reason: collision with root package name */
    public Map f123339i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f123340j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f123341k;

    /* renamed from: l, reason: collision with root package name */
    public BarcodeFindViewUiListener f123342l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f123343m;

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(BarcodeFindViewUiListener barcodeFindViewUiListener) {
        synchronized (this.f123341k) {
            this.f123342l = barcodeFindViewUiListener;
            Unit unit = Unit.f143329a;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void d() {
        this.f123340j = false;
        this.f123333c.b();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void f() {
        this.f123340j = true;
        v0 v0Var = this.f123334d;
        v0 v0Var2 = this.f123335e;
        if (v0Var == v0Var2) {
            if (v0Var2 == v0.f123259a) {
                this.f123333c.e();
                return;
            }
            return;
        }
        int iOrdinal = v0Var.ordinal();
        if (iOrdinal == 0) {
            this.f123331a.start();
        } else if (iOrdinal == 1) {
            this.f123331a.pause();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f123331a.stop();
        }
    }

    public x0(BarcodeFindProxy barcodeFind, u0 barcodeFindViewLayout, com.scandit.datacapture.barcode.internal.module.find.capture.c cameraManager) {
        Intrinsics.j(barcodeFind, "barcodeFind");
        Intrinsics.j(barcodeFindViewLayout, "barcodeFindViewLayout");
        Intrinsics.j(cameraManager, "cameraManager");
        this.f123331a = barcodeFind;
        this.f123332b = barcodeFindViewLayout;
        this.f123333c = cameraManager;
        v0 v0Var = v0.f123261c;
        this.f123334d = v0Var;
        this.f123335e = v0Var;
        this.f123336f = MapsKt.k();
        this.f123337g = SetsKt.e();
        this.f123338h = CollectionsKt.m();
        this.f123339i = MapsKt.k();
        this.f123341k = new Object();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(boolean z10) {
        this.f123343m = z10;
        if (!z10) {
            this.f123332b.o();
            return;
        }
        if (this.f123335e != v0.f123259a || !z10) {
            this.f123332b.o();
            return;
        }
        Float fC = this.f123333c.c();
        if (fC != null) {
            this.f123332b.a(CollectionsKt.p(fC, Float.valueOf(1.0f)), this.f123333c.d());
        } else {
            this.f123332b.o();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void b() {
        int iOrdinal = this.f123335e.ordinal();
        if (iOrdinal == 0) {
            a();
        } else if (iOrdinal == 1) {
            h();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            h();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void c() {
        this.f123335e = v0.f123260b;
        this.f123332b.n();
        this.f123332b.g(false);
        this.f123332b.f(false);
        this.f123332b.a(this.f123336f);
        this.f123332b.f();
        this.f123332b.o();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final boolean e() {
        return this.f123343m;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void g() {
        this.f123334d = v0.f123261c;
        if (this.f123340j) {
            this.f123331a.stop();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void h() {
        this.f123334d = v0.f123259a;
        if (this.f123340j) {
            this.f123331a.start();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void onSearchStarted() {
        v0 v0Var = v0.f123259a;
        this.f123335e = v0Var;
        this.f123332b.d();
        this.f123332b.g(false);
        this.f123332b.f(true);
        this.f123332b.a();
        this.f123332b.g();
        if (this.f123335e != v0Var || !this.f123343m) {
            this.f123332b.o();
            return;
        }
        Float fC = this.f123333c.c();
        if (fC != null) {
            this.f123332b.a(CollectionsKt.p(fC, Float.valueOf(1.0f)), this.f123333c.d());
        } else {
            this.f123332b.o();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void i() {
        g();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a() {
        this.f123334d = v0.f123260b;
        if (this.f123340j) {
            this.f123331a.pause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.Collection r12, java.util.Collection r13, kotlin.jvm.functions.Function1 r14) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.find.ui.x0.a(java.util.Collection, java.util.Collection, kotlin.jvm.functions.Function1):void");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(Collection barcodes) {
        BarcodeFindViewUiListener barcodeFindViewUiListener;
        Intrinsics.j(barcodes, "barcodes");
        this.f123335e = v0.f123261c;
        this.f123332b.n();
        this.f123332b.g(false);
        this.f123332b.f(false);
        this.f123332b.o();
        synchronized (this.f123341k) {
            barcodeFindViewUiListener = this.f123342l;
        }
        if (barcodeFindViewUiListener != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = barcodes.iterator();
            while (it.hasNext()) {
                NativeBarcodeFindItem nativeBarcodeFindItem = (NativeBarcodeFindItem) it.next();
                Map map = this.f123339i;
                byte[] findableData = nativeBarcodeFindItem.getFindableData();
                Intrinsics.i(findableData, "getFindableData(...)");
                BarcodeFindItem barcodeFindItem = (BarcodeFindItem) map.get(BarcodeFindKt.toKeyable(findableData));
                if (barcodeFindItem != null) {
                    arrayList.add(barcodeFindItem);
                }
            }
            this.f123332b.a(new w0(barcodeFindViewUiListener, CollectionsKt.o1(arrayList)));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(float f10) {
        this.f123333c.a(f10);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(BarcodeFindItem barcodeFindItem) {
        if (this.f123335e == v0.f123259a || barcodeFindItem == null) {
            return;
        }
        this.f123332b.b(barcodeFindItem);
        this.f123332b.a(barcodeFindItem);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.listener.SearchedItemsUpdateListener
    public final void a(LinkedHashMap searchedItems) {
        Object next;
        Intrinsics.j(searchedItems, "searchedItems");
        this.f123339i = searchedItems;
        Map map = this.f123336f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (searchedItems.containsKey(BarcodeFindKt.toKeyable(((BarcodeFindItem) entry.getValue()).getSearchOptions().getBarcodeRawData()))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set set = this.f123337g;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BarcodeFindItem barcodeFindItem = (BarcodeFindItem) searchedItems.get(BarcodeFindKt.toKeyable((byte[]) it.next()));
            Pair pairA = barcodeFindItem != null ? TuplesKt.a(String.valueOf(barcodeFindItem.hashCode()), barcodeFindItem) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        Map mapT = MapsKt.t(linkedHashMap, arrayList);
        List<y0> list = this.f123338h;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
        for (y0 y0Var : list) {
            Iterator it2 = mapT.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                byte[] barcodeRawData = ((BarcodeFindItem) next).getSearchOptions().getBarcodeRawData();
                byte[] bytes = y0Var.f123346c.getBytes(Charsets.UTF_8);
                Intrinsics.i(bytes, "getBytes(...)");
                if (Arrays.equals(barcodeRawData, bytes)) {
                    break;
                }
            }
            PointF position = y0Var.f123344a;
            String barcodeData = y0Var.f123346c;
            Intrinsics.j(position, "position");
            Intrinsics.j(barcodeData, "barcodeData");
            arrayList2.add(new y0(position, (BarcodeFindItem) next, barcodeData));
        }
        this.f123332b.a(searchedItems, mapT);
        this.f123332b.a(arrayList2);
        this.f123332b.a(mapT.size(), searchedItems.size());
        this.f123336f = mapT;
        this.f123338h = arrayList2;
    }
}
