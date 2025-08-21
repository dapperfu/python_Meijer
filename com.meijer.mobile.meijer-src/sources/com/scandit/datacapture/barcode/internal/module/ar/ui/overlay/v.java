package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import android.view.View;
import com.scandit.datacapture.barcode.ar.capture.BarcodeArSession;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArAnnotationTrigger;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArPopoverAnnotation;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final b f122200a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f122201b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f122202c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f122203d;

    /* renamed from: e, reason: collision with root package name */
    public final Function3 f122204e;

    /* renamed from: f, reason: collision with root package name */
    public final Function3 f122205f;

    /* renamed from: g, reason: collision with root package name */
    public final Function2 f122206g;

    /* renamed from: h, reason: collision with root package name */
    public final Function0 f122207h;

    /* renamed from: i, reason: collision with root package name */
    public final Function0 f122208i;

    /* renamed from: j, reason: collision with root package name */
    public final MainThreadHelper f122209j;

    /* renamed from: k, reason: collision with root package name */
    public final ReentrantReadWriteLock f122210k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f122211l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f122212m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f122213n;

    /* renamed from: o, reason: collision with root package name */
    public int f122214o;

    public final void a(a aVar) {
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = aVar.f122151e;
        if (barcodeArAugmentation$Annotation != null) {
            this.f122209j.runOnMainThread(new l(this, barcodeArAugmentation$Annotation, aVar.f122150d));
        }
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight = aVar.f122150d;
        if (barcodeArAugmentation$Highlight != null) {
            this.f122209j.runOnMainThread(new m(this, barcodeArAugmentation$Highlight));
        }
    }

    public final ArrayList b() {
        ReentrantReadWriteLock.ReadLock lock = this.f122210k.readLock();
        lock.lock();
        try {
            Collection collectionValues = this.f122212m.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                a aVar = (a) obj;
                BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = aVar.f122151e;
                if (barcodeArAugmentation$Annotation != null && (barcodeArAugmentation$Annotation.a() instanceof BarcodeArPopoverAnnotation) && aVar.f122151e.b().getParent() != null && aVar.f122151e.a().getAnnotationTrigger() == BarcodeArAnnotationTrigger.HIGHLIGHT_TAP) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } finally {
            lock.unlock();
        }
    }

    public v(e augmentationDataFactory, com.scandit.datacapture.barcode.ar.ui.o addHighlight, com.scandit.datacapture.barcode.ar.ui.p updateHighlight, com.scandit.datacapture.barcode.ar.ui.q removeHighlight, com.scandit.datacapture.barcode.ar.ui.r addAnnotation, com.scandit.datacapture.barcode.ar.ui.s updateAnnotation, com.scandit.datacapture.barcode.ar.ui.t removeAnnotation, com.scandit.datacapture.barcode.ar.ui.j showScrim, com.scandit.datacapture.barcode.ar.ui.k hideScrim, MainThreadHelper mainThreadHelper) {
        Intrinsics.j(augmentationDataFactory, "augmentationDataFactory");
        Intrinsics.j(addHighlight, "addHighlight");
        Intrinsics.j(updateHighlight, "updateHighlight");
        Intrinsics.j(removeHighlight, "removeHighlight");
        Intrinsics.j(addAnnotation, "addAnnotation");
        Intrinsics.j(updateAnnotation, "updateAnnotation");
        Intrinsics.j(removeAnnotation, "removeAnnotation");
        Intrinsics.j(showScrim, "showScrim");
        Intrinsics.j(hideScrim, "hideScrim");
        Intrinsics.j(mainThreadHelper, "mainThreadHelper");
        this.f122200a = augmentationDataFactory;
        this.f122201b = addHighlight;
        this.f122202c = updateHighlight;
        this.f122203d = removeHighlight;
        this.f122204e = addAnnotation;
        this.f122205f = updateAnnotation;
        this.f122206g = removeAnnotation;
        this.f122207h = showScrim;
        this.f122208i = hideScrim;
        this.f122209j = mainThreadHelper;
        this.f122210k = new ReentrantReadWriteLock(true);
        this.f122211l = new LinkedHashMap();
        this.f122212m = new LinkedHashMap();
        this.f122213n = new AtomicBoolean(false);
    }

    public final void a(BarcodeArSession session) {
        Intrinsics.j(session, "session");
        if (this.f122213n.get()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = 1000 + jCurrentTimeMillis;
            ReentrantReadWriteLock reentrantReadWriteLock = this.f122210k;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i10 = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i11 = 0; i11 < readHoldCount; i11++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                Iterator it = this.f122211l.values().iterator();
                while (it.hasNext()) {
                    if (((k) it.next()).f122169a <= jCurrentTimeMillis) {
                        it.remove();
                    }
                }
                Iterator<T> it2 = session.getAddedTrackedBarcodes().iterator();
                while (it2.hasNext()) {
                    a((TrackedBarcode) it2.next());
                }
                Iterator<Map.Entry<Integer, TrackedBarcode>> it3 = session.getTrackedBarcodes().entrySet().iterator();
                while (it3.hasNext()) {
                    b(it3.next().getValue());
                }
                Iterator<T> it4 = session.getRemovedTrackedBarcodes().iterator();
                while (it4.hasNext()) {
                    a(((Number) it4.next()).intValue(), j10);
                }
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

    public final void b(TrackedBarcode track) {
        a data = (a) this.f122212m.get(Integer.valueOf(track.getIdentifier()));
        if (data == null) {
            e eVar = (e) this.f122200a;
            eVar.getClass();
            Intrinsics.j(track, "track");
            a aVar = new a((Quadrilateral) eVar.f122156c.invoke(track.getLocationIgnoringLicense$scandit_barcode_capture()), (Quadrilateral) eVar.f122156c.invoke(track.getLocation()), track, null, null);
            a aVar2 = (a) this.f122212m.remove(Integer.valueOf(track.getIdentifier()));
            if (aVar2 != null) {
                a(aVar2);
            }
            this.f122212m.put(Integer.valueOf(track.getIdentifier()), aVar);
            this.f122209j.runOnMainThread(new p(this, track));
            return;
        }
        e eVar2 = (e) this.f122200a;
        eVar2.getClass();
        Intrinsics.j(data, "data");
        a aVar3 = new a((Quadrilateral) eVar2.f122156c.invoke(data.f122149c.getLocationIgnoringLicense$scandit_barcode_capture()), (Quadrilateral) eVar2.f122156c.invoke(data.f122149c.getLocation()), data.f122149c, data.f122150d, data.f122151e);
        this.f122212m.put(Integer.valueOf(data.f122149c.getIdentifier()), aVar3);
        this.f122209j.runOnMainThread(new u(aVar3, this));
    }

    public final void a() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f122210k;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Iterator it = this.f122212m.values().iterator();
            while (it.hasNext()) {
                a((a) it.next());
                it.remove();
            }
            this.f122211l.clear();
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

    public final void a(TrackedBarcode track) {
        k kVar = (k) this.f122211l.remove(track.getBarcode().get_uniqueHash());
        if (kVar != null) {
            a aVar = (a) this.f122212m.remove(Integer.valueOf(track.getIdentifier()));
            if (aVar != null) {
                a(aVar);
            }
            b bVar = this.f122200a;
            a aVar2 = kVar.f122171c;
            BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight = aVar2.f122150d;
            BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = aVar2.f122151e;
            e eVar = (e) bVar;
            eVar.getClass();
            Intrinsics.j(track, "track");
            a aVar3 = new a((Quadrilateral) eVar.f122156c.invoke(track.getLocationIgnoringLicense$scandit_barcode_capture()), (Quadrilateral) eVar.f122156c.invoke(track.getLocation()), track, barcodeArAugmentation$Highlight, barcodeArAugmentation$Annotation);
            this.f122212m.put(Integer.valueOf(track.getIdentifier()), aVar3);
            this.f122209j.runOnMainThread(new t(this, kVar, aVar3));
            return;
        }
        e eVar2 = (e) this.f122200a;
        eVar2.getClass();
        Intrinsics.j(track, "track");
        a aVar4 = new a((Quadrilateral) eVar2.f122156c.invoke(track.getLocationIgnoringLicense$scandit_barcode_capture()), (Quadrilateral) eVar2.f122156c.invoke(track.getLocation()), track, null, null);
        a aVar5 = (a) this.f122212m.remove(Integer.valueOf(track.getIdentifier()));
        if (aVar5 != null) {
            a(aVar5);
        }
        this.f122212m.put(Integer.valueOf(track.getIdentifier()), aVar4);
        this.f122209j.runOnMainThread(new p(this, track));
    }

    public final void a(int i10, long j10) {
        View viewB;
        a aVar = (a) this.f122212m.remove(Integer.valueOf(i10));
        if (aVar != null) {
            String str = aVar.f122149c.getBarcode().get_uniqueHash();
            LinkedHashMap linkedHashMap = this.f122211l;
            BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = aVar.f122151e;
            linkedHashMap.put(str, new k(j10, ((barcodeArAugmentation$Annotation == null || (viewB = barcodeArAugmentation$Annotation.b()) == null) ? null : viewB.getParent()) != null, aVar));
            a(aVar);
        }
    }

    public static final void a(v vVar, int i10, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight) {
        a aVar = (a) vVar.f122212m.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        a aVar2 = new a(aVar.f122147a, aVar.f122148b, aVar.f122149c, barcodeArAugmentation$Highlight, aVar.f122151e);
        vVar.f122212m.put(Integer.valueOf(i10), aVar2);
        vVar.f122209j.runOnMainThread(new r(aVar, vVar, barcodeArAugmentation$Highlight, aVar2));
    }

    public static final void a(v vVar, int i10, BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation) {
        a aVar = (a) vVar.f122212m.get(Integer.valueOf(i10));
        if (aVar == null) {
            return;
        }
        a aVar2 = new a(aVar.f122147a, aVar.f122148b, aVar.f122149c, aVar.f122150d, barcodeArAugmentation$Annotation);
        vVar.f122212m.put(Integer.valueOf(i10), aVar2);
        vVar.f122209j.runOnMainThread(new q(aVar, barcodeArAugmentation$Annotation, vVar, aVar2));
    }

    public final void a(Quadrilateral quadrilateral, TrackedBarcode trackedBarcode, BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight) {
        if (barcodeArAugmentation$Annotation.a() instanceof BarcodeArPopoverAnnotation) {
            int i10 = this.f122214o + 1;
            this.f122214o = i10;
            if (i10 > 0) {
                this.f122207h.invoke();
            }
        }
        this.f122204e.invoke(trackedBarcode, barcodeArAugmentation$Annotation, barcodeArAugmentation$Highlight);
        this.f122205f.invoke(quadrilateral, barcodeArAugmentation$Annotation, barcodeArAugmentation$Highlight);
    }

    public final void a(BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight) {
        if ((barcodeArAugmentation$Annotation.a() instanceof BarcodeArPopoverAnnotation) && barcodeArAugmentation$Annotation.b().getParent() != null) {
            int i10 = this.f122214o - 1;
            this.f122214o = i10;
            if (i10 <= 0) {
                this.f122208i.invoke();
            }
        }
        this.f122206g.invoke(barcodeArAugmentation$Annotation, barcodeArAugmentation$Highlight);
    }
}
