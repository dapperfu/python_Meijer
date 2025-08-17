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

/* loaded from: classes11.dex */
public final class x0 implements BarcodeFindViewPresenter {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeFindProxy f122379a;

    /* renamed from: b, reason: collision with root package name */
    public final BarcodeFindViewLayout f122380b;

    /* renamed from: c, reason: collision with root package name */
    public final BarcodeFindCameraManager f122381c;

    /* renamed from: d, reason: collision with root package name */
    public v0 f122382d;

    /* renamed from: e, reason: collision with root package name */
    public v0 f122383e;

    /* renamed from: f, reason: collision with root package name */
    public Map f122384f;

    /* renamed from: g, reason: collision with root package name */
    public Set f122385g;

    /* renamed from: h, reason: collision with root package name */
    public List f122386h;

    /* renamed from: i, reason: collision with root package name */
    public Map f122387i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f122388j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f122389k;

    /* renamed from: l, reason: collision with root package name */
    public BarcodeFindViewUiListener f122390l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f122391m;

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(BarcodeFindViewUiListener barcodeFindViewUiListener) {
        synchronized (this.f122389k) {
            this.f122390l = barcodeFindViewUiListener;
            Unit unit = Unit.f142422a;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void d() {
        this.f122388j = false;
        this.f122381c.b();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void f() {
        this.f122388j = true;
        v0 v0Var = this.f122382d;
        v0 v0Var2 = this.f122383e;
        if (v0Var == v0Var2) {
            if (v0Var2 == v0.f122307a) {
                this.f122381c.e();
                return;
            }
            return;
        }
        int iOrdinal = v0Var.ordinal();
        if (iOrdinal == 0) {
            this.f122379a.start();
        } else if (iOrdinal == 1) {
            this.f122379a.pause();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f122379a.stop();
        }
    }

    public x0(BarcodeFindProxy barcodeFind, u0 barcodeFindViewLayout, com.scandit.datacapture.barcode.internal.module.find.capture.c cameraManager) {
        Intrinsics.j(barcodeFind, "barcodeFind");
        Intrinsics.j(barcodeFindViewLayout, "barcodeFindViewLayout");
        Intrinsics.j(cameraManager, "cameraManager");
        this.f122379a = barcodeFind;
        this.f122380b = barcodeFindViewLayout;
        this.f122381c = cameraManager;
        v0 v0Var = v0.f122309c;
        this.f122382d = v0Var;
        this.f122383e = v0Var;
        this.f122384f = MapsKt.k();
        this.f122385g = SetsKt.e();
        this.f122386h = CollectionsKt.m();
        this.f122387i = MapsKt.k();
        this.f122389k = new Object();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(boolean z10) {
        this.f122391m = z10;
        if (!z10) {
            this.f122380b.o();
            return;
        }
        if (this.f122383e != v0.f122307a || !z10) {
            this.f122380b.o();
            return;
        }
        Float fC = this.f122381c.c();
        if (fC != null) {
            this.f122380b.a(CollectionsKt.p(fC, Float.valueOf(1.0f)), this.f122381c.d());
        } else {
            this.f122380b.o();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void b() {
        int iOrdinal = this.f122383e.ordinal();
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
        this.f122383e = v0.f122308b;
        this.f122380b.n();
        this.f122380b.g(false);
        this.f122380b.f(false);
        this.f122380b.a(this.f122384f);
        this.f122380b.f();
        this.f122380b.o();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final boolean e() {
        return this.f122391m;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void g() {
        this.f122382d = v0.f122309c;
        if (this.f122388j) {
            this.f122379a.stop();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void h() {
        this.f122382d = v0.f122307a;
        if (this.f122388j) {
            this.f122379a.start();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void onSearchStarted() {
        v0 v0Var = v0.f122307a;
        this.f122383e = v0Var;
        this.f122380b.d();
        this.f122380b.g(false);
        this.f122380b.f(true);
        this.f122380b.a();
        this.f122380b.g();
        if (this.f122383e != v0Var || !this.f122391m) {
            this.f122380b.o();
            return;
        }
        Float fC = this.f122381c.c();
        if (fC != null) {
            this.f122380b.a(CollectionsKt.p(fC, Float.valueOf(1.0f)), this.f122381c.d());
        } else {
            this.f122380b.o();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void i() {
        g();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a() {
        this.f122382d = v0.f122308b;
        if (this.f122388j) {
            this.f122379a.pause();
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
        this.f122383e = v0.f122309c;
        this.f122380b.n();
        this.f122380b.g(false);
        this.f122380b.f(false);
        this.f122380b.o();
        synchronized (this.f122389k) {
            barcodeFindViewUiListener = this.f122390l;
        }
        if (barcodeFindViewUiListener != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = barcodes.iterator();
            while (it.hasNext()) {
                NativeBarcodeFindItem nativeBarcodeFindItem = (NativeBarcodeFindItem) it.next();
                Map map = this.f122387i;
                byte[] findableData = nativeBarcodeFindItem.getFindableData();
                Intrinsics.i(findableData, "getFindableData(...)");
                BarcodeFindItem barcodeFindItem = (BarcodeFindItem) map.get(BarcodeFindKt.toKeyable(findableData));
                if (barcodeFindItem != null) {
                    arrayList.add(barcodeFindItem);
                }
            }
            this.f122380b.a(new w0(barcodeFindViewUiListener, CollectionsKt.o1(arrayList)));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(float f10) {
        this.f122381c.a(f10);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter
    public final void a(BarcodeFindItem barcodeFindItem) {
        if (this.f122383e == v0.f122307a || barcodeFindItem == null) {
            return;
        }
        this.f122380b.b(barcodeFindItem);
        this.f122380b.a(barcodeFindItem);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.ui.listener.SearchedItemsUpdateListener
    public final void a(LinkedHashMap searchedItems) {
        Object next;
        Intrinsics.j(searchedItems, "searchedItems");
        this.f122387i = searchedItems;
        Map map = this.f122384f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (searchedItems.containsKey(BarcodeFindKt.toKeyable(((BarcodeFindItem) entry.getValue()).getSearchOptions().getBarcodeRawData()))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set set = this.f122385g;
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
        List<y0> list = this.f122386h;
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
                byte[] bytes = y0Var.f122394c.getBytes(Charsets.UTF_8);
                Intrinsics.i(bytes, "getBytes(...)");
                if (Arrays.equals(barcodeRawData, bytes)) {
                    break;
                }
            }
            PointF position = y0Var.f122392a;
            String barcodeData = y0Var.f122394c;
            Intrinsics.j(position, "position");
            Intrinsics.j(barcodeData, "barcodeData");
            arrayList2.add(new y0(position, (BarcodeFindItem) next, barcodeData));
        }
        this.f122380b.a(searchedItems, mapT);
        this.f122380b.a(arrayList2);
        this.f122380b.a(mapT.size(), searchedItems.size());
        this.f122384f = mapT;
        this.f122386h = arrayList2;
    }
}
