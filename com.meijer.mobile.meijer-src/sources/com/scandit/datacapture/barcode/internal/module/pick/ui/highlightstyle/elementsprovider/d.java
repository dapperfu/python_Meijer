package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider;

import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewAsyncCallback;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewResponse;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class d implements BarcodePickViewHighlightStyleCustomViewAsyncCallback {

    /* renamed from: a, reason: collision with root package name */
    public final e f123707a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f123708b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f123709c;

    public d(f fVar, e key, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.c whenDone) {
        Intrinsics.j(key, "key");
        Intrinsics.j(whenDone, "whenDone");
        this.f123709c = fVar;
        this.f123707a = key;
        this.f123708b = whenDone;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewAsyncCallback
    public final void onData(BarcodePickViewHighlightStyleCustomViewResponse barcodePickViewHighlightStyleCustomViewResponse) {
        f fVar = this.f123709c;
        ReentrantReadWriteLock reentrantReadWriteLock = fVar.f123714c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            if (barcodePickViewHighlightStyleCustomViewResponse == null) {
                fVar.f123715d.remove(this.f123707a);
            } else {
                fVar.f123715d.put(this.f123707a, new h(barcodePickViewHighlightStyleCustomViewResponse.getView(), barcodePickViewHighlightStyleCustomViewResponse.getStatusIconStyle()));
            }
            fVar.f123716e.remove(this.f123707a);
            this.f123708b.invoke();
            Unit unit = Unit.f143329a;
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th2;
        }
    }
}
