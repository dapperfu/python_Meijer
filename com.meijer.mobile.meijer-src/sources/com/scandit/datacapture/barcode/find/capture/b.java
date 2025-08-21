package com.scandit.datacapture.barcode.find.capture;

import com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindItem;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession;
import com.scandit.datacapture.core.data.FrameData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b implements InternalBarcodeFindListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f121913a;

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(BarcodeFind mode) {
        Intrinsics.j(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void b(BarcodeFind mode) {
        Intrinsics.j(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void c(HashSet barcodes) {
        Intrinsics.j(barcodes, "barcodes");
    }

    public b(BarcodeFind owner) {
        Intrinsics.j(owner, "owner");
        this.f121913a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(BarcodeFind mode, NativeBarcodeFindSession session, FrameData data) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        BarcodeFind barcodeFind = (BarcodeFind) this.f121913a.get();
        if (barcodeFind != null) {
            Iterator it = barcodeFind.f121890f.iterator();
            while (it.hasNext()) {
                ((BarcodeFindListener) it.next()).onSessionUpdated(new BarcodeFindSessionImpl(session));
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void b(HashSet barcodes) {
        Intrinsics.j(barcodes, "barcodes");
        BarcodeFind barcodeFind = (BarcodeFind) this.f121913a.get();
        if (barcodeFind == null || barcodeFind.f121890f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = barcodes.iterator();
        while (it.hasNext()) {
            NativeBarcodeFindItem nativeBarcodeFindItem = (NativeBarcodeFindItem) it.next();
            Map mapAccess$getSearchedItems = BarcodeFind.access$getSearchedItems(barcodeFind);
            byte[] findableData = nativeBarcodeFindItem.getFindableData();
            Intrinsics.i(findableData, "getFindableData(...)");
            BarcodeFindItem barcodeFindItem = (BarcodeFindItem) mapAccess$getSearchedItems.get(BarcodeFindKt.toKeyable(findableData));
            if (barcodeFindItem != null) {
                arrayList.add(barcodeFindItem);
            }
        }
        Set<BarcodeFindItem> setO1 = CollectionsKt.o1(arrayList);
        Iterator it2 = barcodeFind.f121890f.iterator();
        while (it2.hasNext()) {
            ((BarcodeFindListener) it2.next()).onSearchStopped(setO1);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void onSearchStarted() {
        BarcodeFind barcodeFind = (BarcodeFind) this.f121913a.get();
        if (barcodeFind != null) {
            Iterator it = barcodeFind.f121890f.iterator();
            while (it.hasNext()) {
                ((BarcodeFindListener) it.next()).onSearchStarted();
            }
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(HashSet barcodes) {
        Intrinsics.j(barcodes, "barcodes");
        BarcodeFind barcodeFind = (BarcodeFind) this.f121913a.get();
        if (barcodeFind == null || barcodeFind.f121890f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = barcodes.iterator();
        while (it.hasNext()) {
            NativeBarcodeFindItem nativeBarcodeFindItem = (NativeBarcodeFindItem) it.next();
            Map mapAccess$getSearchedItems = BarcodeFind.access$getSearchedItems(barcodeFind);
            byte[] findableData = nativeBarcodeFindItem.getFindableData();
            Intrinsics.i(findableData, "getFindableData(...)");
            BarcodeFindItem barcodeFindItem = (BarcodeFindItem) mapAccess$getSearchedItems.get(BarcodeFindKt.toKeyable(findableData));
            if (barcodeFindItem != null) {
                arrayList.add(barcodeFindItem);
            }
        }
        Set<BarcodeFindItem> setO1 = CollectionsKt.o1(arrayList);
        Iterator it2 = barcodeFind.f121890f.iterator();
        while (it2.hasNext()) {
            ((BarcodeFindListener) it2.next()).onSearchPaused(setO1);
        }
    }
}
