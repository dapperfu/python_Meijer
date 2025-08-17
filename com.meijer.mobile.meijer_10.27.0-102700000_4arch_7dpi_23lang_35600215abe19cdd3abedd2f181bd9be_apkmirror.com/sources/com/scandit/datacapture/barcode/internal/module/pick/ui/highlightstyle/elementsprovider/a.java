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

/* loaded from: classes11.dex */
public final class a implements BarcodePickViewHighlightStyleAsyncCallback {

    /* renamed from: a, reason: collision with root package name */
    public final b f122741a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f122742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f122743c;

    public a(c cVar, b key, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.c whenDone) {
        Intrinsics.j(key, "key");
        Intrinsics.j(whenDone, "whenDone");
        this.f122743c = cVar;
        this.f122741a = key;
        this.f122742b = whenDone;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleAsyncCallback
    public final void onData(BarcodePickViewHighlightStyleResponse barcodePickViewHighlightStyleResponse) {
        c cVar = this.f122743c;
        ReentrantReadWriteLock reentrantReadWriteLock = cVar.f122750e;
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
                cVar.f122753h.remove(this.f122741a);
                cVar.f122752g.remove(this.f122741a);
            } else {
                cVar.f122753h.put(this.f122741a, new g(barcodePickViewHighlightStyleResponse.getCom.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer.FIELD_ICON java.lang.String(), barcodePickViewHighlightStyleResponse.getBrush(), barcodePickViewHighlightStyleResponse.getStatusIconStyle()));
                LinkedHashMap linkedHashMap = cVar.f122752g;
                b bVar = this.f122741a;
                BarcodePickState barcodePickState = bVar.f122745b;
                BarcodePickIcon selectedIcon = barcodePickViewHighlightStyleResponse.getSelectedIcon();
                m mVar = m.f122781a;
                if (Intrinsics.e(selectedIcon, mVar)) {
                    selectedIcon = cVar.f122748c.b(barcodePickState);
                    if (Intrinsics.e(selectedIcon, mVar)) {
                        selectedIcon = barcodePickViewHighlightStyleResponse.getCom.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer.FIELD_ICON java.lang.String();
                        if (Intrinsics.e(selectedIcon, mVar)) {
                            selectedIcon = cVar.f122748c.a(barcodePickState);
                        }
                    }
                }
                BarcodePickState state = this.f122741a.f122745b;
                BarcodePickBrush selectedBrush = barcodePickViewHighlightStyleResponse.getSelectedBrush();
                com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k kVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k.f122779b;
                if (Intrinsics.e(selectedBrush, kVar)) {
                    com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j jVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j) cVar.f122747b;
                    jVar.getClass();
                    Intrinsics.j(state, "state");
                    Brush brush = (Brush) jVar.f122738b.invoke(state);
                    if (brush == null) {
                        selectedBrush = kVar;
                    } else {
                        Intrinsics.j(brush, "brush");
                        selectedBrush = new p(brush);
                    }
                    if (Intrinsics.e(selectedBrush, kVar)) {
                        selectedBrush = barcodePickViewHighlightStyleResponse.getBrush();
                        if (Intrinsics.e(selectedBrush, kVar)) {
                            selectedBrush = ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j) cVar.f122747b).a(state);
                        }
                    }
                }
                linkedHashMap.put(bVar, new g(selectedIcon, selectedBrush, barcodePickViewHighlightStyleResponse.getStatusIconStyle()));
            }
            cVar.f122754i.remove(this.f122741a);
            this.f122742b.invoke();
            Unit unit = Unit.f142422a;
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
