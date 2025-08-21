package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.m;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.p;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleAsyncCallback;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleResponse;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a implements BarcodePickViewHighlightStyleAsyncCallback {

    /* renamed from: a, reason: collision with root package name */
    public final b f123693a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f123694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f123695c;

    public a(c cVar, b key, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.c whenDone) {
        Intrinsics.j(key, "key");
        Intrinsics.j(whenDone, "whenDone");
        this.f123695c = cVar;
        this.f123693a = key;
        this.f123694b = whenDone;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleAsyncCallback
    public final void onData(BarcodePickViewHighlightStyleResponse barcodePickViewHighlightStyleResponse) {
        c cVar = this.f123695c;
        ReentrantReadWriteLock reentrantReadWriteLock = cVar.f123702e;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            if (barcodePickViewHighlightStyleResponse == null) {
                cVar.f123705h.remove(this.f123693a);
                cVar.f123704g.remove(this.f123693a);
            } else {
                cVar.f123705h.put(this.f123693a, new g(barcodePickViewHighlightStyleResponse.getCom.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer.FIELD_ICON java.lang.String(), barcodePickViewHighlightStyleResponse.getBrush(), barcodePickViewHighlightStyleResponse.getStatusIconStyle()));
                LinkedHashMap linkedHashMap = cVar.f123704g;
                b bVar = this.f123693a;
                BarcodePickState barcodePickState = bVar.f123697b;
                BarcodePickIcon selectedIcon = barcodePickViewHighlightStyleResponse.getSelectedIcon();
                m mVar = m.f123733a;
                if (Intrinsics.e(selectedIcon, mVar)) {
                    selectedIcon = cVar.f123700c.b(barcodePickState);
                    if (Intrinsics.e(selectedIcon, mVar)) {
                        selectedIcon = barcodePickViewHighlightStyleResponse.getCom.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer.FIELD_ICON java.lang.String();
                        if (Intrinsics.e(selectedIcon, mVar)) {
                            selectedIcon = cVar.f123700c.a(barcodePickState);
                        }
                    }
                }
                BarcodePickState state = this.f123693a.f123697b;
                BarcodePickBrush selectedBrush = barcodePickViewHighlightStyleResponse.getSelectedBrush();
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k kVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k.f123731b;
                if (Intrinsics.e(selectedBrush, kVar)) {
                    com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j jVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j) cVar.f123699b;
                    jVar.getClass();
                    Intrinsics.j(state, "state");
                    Brush brush = (Brush) jVar.f123690b.invoke(state);
                    if (brush == null) {
                        selectedBrush = kVar;
                    } else {
                        Intrinsics.j(brush, "brush");
                        selectedBrush = new p(brush);
                    }
                    if (Intrinsics.e(selectedBrush, kVar)) {
                        selectedBrush = barcodePickViewHighlightStyleResponse.getBrush();
                        if (Intrinsics.e(selectedBrush, kVar)) {
                            selectedBrush = ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j) cVar.f123699b).a(state);
                        }
                    }
                }
                linkedHashMap.put(bVar, new g(selectedIcon, selectedBrush, barcodePickViewHighlightStyleResponse.getStatusIconStyle()));
            }
            cVar.f123706i.remove(this.f123693a);
            this.f123694b.invoke();
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
