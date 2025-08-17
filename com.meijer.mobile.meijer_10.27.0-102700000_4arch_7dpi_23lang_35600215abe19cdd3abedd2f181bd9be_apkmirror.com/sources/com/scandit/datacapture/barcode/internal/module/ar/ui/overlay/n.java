package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class n extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f121225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f121226b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v vVar, TrackedBarcode trackedBarcode) {
        super(1);
        this.f121225a = vVar;
        this.f121226b = trackedBarcode;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight = (BarcodeArAugmentation$Highlight) obj;
        v vVar = this.f121225a;
        ReentrantReadWriteLock reentrantReadWriteLock = vVar.f121258k;
        TrackedBarcode trackedBarcode = this.f121226b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            v.a(vVar, trackedBarcode.getIdentifier(), barcodeArAugmentation$Highlight);
            Unit unit = Unit.f142422a;
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            return Unit.f142422a;
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
