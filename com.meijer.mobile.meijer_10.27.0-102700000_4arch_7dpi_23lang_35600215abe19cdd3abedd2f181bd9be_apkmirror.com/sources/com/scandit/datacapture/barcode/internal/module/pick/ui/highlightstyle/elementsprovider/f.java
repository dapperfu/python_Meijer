package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRequest;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class f implements BarcodePickElementsCache {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodePickViewHighlightStyleCustomViewProvider f122760a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f122761b = false;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantReadWriteLock f122762c = new ReentrantReadWriteLock(true);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f122763d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f122764e = new LinkedHashMap();

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
        ReentrantReadWriteLock.ReadLock lock = this.f122762c.readLock();
        lock.lock();
        try {
            h hVar = (h) this.f122763d.get(eVar);
            if (hVar != null) {
                return hVar;
            }
            if (barcodePickState != null && this.f122764e.get(eVar) != null) {
                return (h) this.f122763d.get(new e(str, barcodePickState));
            }
            Unit unit = Unit.f142422a;
            return null;
        } finally {
            lock.unlock();
        }
    }

    public f(BarcodePickViewHighlightStyleCustomViewProvider barcodePickViewHighlightStyleCustomViewProvider) {
        this.f122760a = barcodePickViewHighlightStyleCustomViewProvider;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.k
    public final void a(String itemData, String str, BarcodePickState state, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.c whenDone) {
        Intrinsics.j(itemData, "itemData");
        Intrinsics.j(state, "state");
        Intrinsics.j(whenDone, "whenDone");
        BarcodePickViewHighlightStyleCustomViewProvider barcodePickViewHighlightStyleCustomViewProvider = this.f122760a;
        if (barcodePickViewHighlightStyleCustomViewProvider == null) {
            return;
        }
        ReentrantReadWriteLock.ReadLock lock = this.f122762c.readLock();
        lock.lock();
        try {
            e eVar = new e(itemData, state);
            if (this.f122761b && (this.f122763d.containsKey(eVar) || this.f122764e.containsKey(eVar))) {
                return;
            }
            d dVar = new d(this, eVar, whenDone);
            ReentrantReadWriteLock reentrantReadWriteLock = this.f122762c;
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i10 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.f122764e.put(eVar, dVar);
                Unit unit = Unit.f142422a;
                while (i10 < readHoldCount) {
                    lock2.lock();
                    i10++;
                }
                writeLock.unlock();
                barcodePickViewHighlightStyleCustomViewProvider.customViewForRequest(new BarcodePickViewHighlightStyleRequest(itemData, str, state), dVar);
                Unit unit2 = Unit.f142422a;
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
