package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.m;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.p;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleAsyncProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRequest;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c implements BarcodePickElementsCache {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodePickViewHighlightStyleAsyncProvider f122746a;

    /* renamed from: b, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.i f122747b;

    /* renamed from: c, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.c f122748c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f122749d;

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantReadWriteLock f122750e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f122751f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f122752g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f122753h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f122754i;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.j
    public final i a(String str, BarcodePickState state, BarcodePickState barcodePickState) {
        g gVar;
        Intrinsics.j(state, "state");
        ReentrantReadWriteLock.ReadLock lock = this.f122750e.readLock();
        lock.lock();
        try {
            if (str == null) {
                gVar = new g(this.f122748c.a(state), ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j) this.f122747b).a(state), null);
            } else if (this.f122751f.contains(str)) {
                gVar = a(str, state);
            } else {
                gVar = (g) this.f122753h.get(new b(str, state));
                if (gVar == null) {
                    gVar = new g(this.f122748c.a(state), ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j) this.f122747b).a(state), null);
                }
            }
            return gVar;
        } finally {
            lock.unlock();
        }
    }

    public c(BarcodePickViewHighlightStyleAsyncProvider barcodePickViewHighlightStyleAsyncProvider, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j brushProvider, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.iconprovider.c iconProvider, boolean z10) {
        Intrinsics.j(brushProvider, "brushProvider");
        Intrinsics.j(iconProvider, "iconProvider");
        this.f122746a = barcodePickViewHighlightStyleAsyncProvider;
        this.f122747b = brushProvider;
        this.f122748c = iconProvider;
        this.f122749d = z10;
        this.f122750e = new ReentrantReadWriteLock(true);
        this.f122751f = new HashSet();
        this.f122752g = new LinkedHashMap();
        this.f122753h = new LinkedHashMap();
        this.f122754i = new LinkedHashMap();
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.k
    public final void b(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f122750e;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            if (CollectionsKt.h0(this.f122751f, str)) {
                a(str);
            } else if (str != null) {
                ReentrantReadWriteLock reentrantReadWriteLock2 = this.f122750e;
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock2.readLock();
                int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                for (int i12 = 0; i12 < readHoldCount2; i12++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                writeLock2.lock();
                try {
                    this.f122751f.add(str);
                    for (int i13 = 0; i13 < readHoldCount2; i13++) {
                        lock2.lock();
                    }
                    writeLock2.unlock();
                } catch (Throwable th2) {
                    for (int i14 = 0; i14 < readHoldCount2; i14++) {
                        lock2.lock();
                    }
                    writeLock2.unlock();
                    throw th2;
                }
            }
            Unit unit = Unit.f142422a;
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
        } catch (Throwable th3) {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th3;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.k
    public final void a(String itemData, String str, BarcodePickState state, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.c whenDone) {
        Intrinsics.j(itemData, "itemData");
        Intrinsics.j(state, "state");
        Intrinsics.j(whenDone, "whenDone");
        BarcodePickViewHighlightStyleAsyncProvider barcodePickViewHighlightStyleAsyncProvider = this.f122746a;
        if (barcodePickViewHighlightStyleAsyncProvider == null) {
            return;
        }
        ReentrantReadWriteLock.ReadLock lock = this.f122750e.readLock();
        lock.lock();
        try {
            b bVar = new b(itemData, state);
            if (this.f122749d && (this.f122753h.containsKey(bVar) || this.f122754i.containsKey(bVar))) {
                return;
            }
            a aVar = new a(this, bVar, whenDone);
            ReentrantReadWriteLock reentrantReadWriteLock = this.f122750e;
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i10 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.f122754i.put(bVar, aVar);
                Unit unit = Unit.f142422a;
                while (i10 < readHoldCount) {
                    lock2.lock();
                    i10++;
                }
                writeLock.unlock();
                barcodePickViewHighlightStyleAsyncProvider.styleForRequest(new BarcodePickViewHighlightStyleRequest(itemData, str, state), aVar);
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

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.k
    public final void a(String str) {
        if (str != null) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.f122750e;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i10 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.f122751f.remove(str);
            } finally {
                while (i10 < readHoldCount) {
                    lock.lock();
                    i10++;
                }
                writeLock.unlock();
            }
        }
    }

    public final g a(String str, BarcodePickState state) {
        BarcodePickBrush pVar;
        g gVar = (g) this.f122752g.get(new b(str, state));
        if (gVar != null) {
            return gVar;
        }
        BarcodePickIcon barcodePickIconB = this.f122748c.b(state);
        if (Intrinsics.e(barcodePickIconB, m.f122781a)) {
            barcodePickIconB = this.f122748c.a(state);
        }
        com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j jVar = (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j) this.f122747b;
        jVar.getClass();
        Intrinsics.j(state, "state");
        Brush brush = (Brush) jVar.f122738b.invoke(state);
        if (brush == null) {
            pVar = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k.f122779b;
        } else {
            Intrinsics.j(brush, "brush");
            pVar = new p(brush);
        }
        if (Intrinsics.e(pVar, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k.f122779b)) {
            pVar = ((com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider.j) this.f122747b).a(state);
        }
        return new g(barcodePickIconB, pVar, null);
    }
}
