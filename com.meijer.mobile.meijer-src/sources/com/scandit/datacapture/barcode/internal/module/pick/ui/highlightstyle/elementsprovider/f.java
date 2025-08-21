package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRequest;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class f implements BarcodePickElementsCache {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodePickViewHighlightStyleCustomViewProvider f123712a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f123713b = false;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantReadWriteLock f123714c = new ReentrantReadWriteLock(true);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f123715d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f123716e = new LinkedHashMap();

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.k
    public final void a(String str) {
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.k
    public final void b(String str) {
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.j
    public final i a(String str, BarcodePickState state, BarcodePickState barcodePickState) {
        Intrinsics.j(state, "state");
        if (str == null) {
            return null;
        }
        e eVar = new e(str, state);
        ReentrantReadWriteLock.ReadLock lock = this.f123714c.readLock();
        lock.lock();
        try {
            h hVar = (h) this.f123715d.get(eVar);
            if (hVar != null) {
                return hVar;
            }
            if (barcodePickState != null && this.f123716e.get(eVar) != null) {
                return (h) this.f123715d.get(new e(str, barcodePickState));
            }
            Unit unit = Unit.f143329a;
            return null;
        } finally {
            lock.unlock();
        }
    }

    public f(BarcodePickViewHighlightStyleCustomViewProvider barcodePickViewHighlightStyleCustomViewProvider) {
        this.f123712a = barcodePickViewHighlightStyleCustomViewProvider;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.k
    public final void a(String itemData, String str, BarcodePickState state, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.c whenDone) {
        Intrinsics.j(itemData, "itemData");
        Intrinsics.j(state, "state");
        Intrinsics.j(whenDone, "whenDone");
        BarcodePickViewHighlightStyleCustomViewProvider barcodePickViewHighlightStyleCustomViewProvider = this.f123712a;
        if (barcodePickViewHighlightStyleCustomViewProvider == null) {
            return;
        }
        ReentrantReadWriteLock.ReadLock lock = this.f123714c.readLock();
        lock.lock();
        try {
            e eVar = new e(itemData, state);
            if (this.f123713b && (this.f123715d.containsKey(eVar) || this.f123716e.containsKey(eVar))) {
                return;
            }
            d dVar = new d(this, eVar, whenDone);
            ReentrantReadWriteLock reentrantReadWriteLock = this.f123714c;
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i10 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.f123716e.put(eVar, dVar);
                Unit unit = Unit.f143329a;
                while (i10 < readHoldCount) {
                    lock2.lock();
                    i10++;
                }
                writeLock.unlock();
                barcodePickViewHighlightStyleCustomViewProvider.customViewForRequest(new BarcodePickViewHighlightStyleRequest(itemData, str, state), dVar);
                Unit unit2 = Unit.f143329a;
            } catch (Throwable th2) {
                while (i10 < readHoldCount) {
                    lock2.lock();
                    i10++;
                }
                writeLock.unlock();
                throw th2;
            }
        } finally {
            lock.unlock();
        }
    }
}
