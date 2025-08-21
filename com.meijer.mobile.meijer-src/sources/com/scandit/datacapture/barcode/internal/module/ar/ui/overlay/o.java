package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class o extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f122179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f122180b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v vVar, TrackedBarcode trackedBarcode) {
        super(1);
        this.f122179a = vVar;
        this.f122180b = trackedBarcode;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = (BarcodeArAugmentation$Annotation) obj;
        v vVar = this.f122179a;
        ReentrantReadWriteLock reentrantReadWriteLock = vVar.f122210k;
        TrackedBarcode trackedBarcode = this.f122180b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            v.a(vVar, trackedBarcode.getIdentifier(), barcodeArAugmentation$Annotation);
            Unit unit = Unit.f143329a;
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            return Unit.f143329a;
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
