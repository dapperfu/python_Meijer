package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.W;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class r implements BarcodeCountBrushHandler {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC13224a f122619a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f122620b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f122621c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f122622d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f122623e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f122624f;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final void a(TrackedBarcode barcode, Brush brush) {
        Intrinsics.j(barcode, "barcode");
        ConcurrentHashMap concurrentHashMap = this.f122620b;
        Integer numValueOf = Integer.valueOf(barcode.getGlobalId$scandit_barcode_capture());
        if (brush == null) {
            brush = Brush.INSTANCE.transparent();
        }
        concurrentHashMap.put(numValueOf, brush);
    }

    public r(BarcodeCountBasicOverlay delegate) {
        Intrinsics.j(delegate, "delegate");
        this.f122619a = delegate;
        this.f122620b = new ConcurrentHashMap();
        this.f122621c = new ConcurrentHashMap();
        this.f122622d = new ConcurrentHashMap();
        this.f122623e = new ConcurrentHashMap();
        this.f122624f = new ConcurrentHashMap();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final Brush a(TrackedBarcode barcode, W status) {
        Intrinsics.j(barcode, "barcode");
        Intrinsics.j(status, "status");
        return ((Boolean) a(status, barcode, new n(this, barcode), new o(this, barcode), p.f122615a, new q(status, this, barcode))).booleanValue() ? (Brush) a(status, barcode, new C13233j(this, barcode), new k(this, barcode), l.f122607a, new m(status, this, barcode)) : this.f122619a.isListenerSet() ? (Brush) a(status, barcode, new C13229f(this), new C13230g(this), new C13231h(this), new C13232i(status, this)) : (Brush) a(status, Unit.f143329a, new C13225b(this), new C13226c(this), new C13227d(this), new C13228e(status, this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final void b(TrackedBarcode barcode, Brush brush) {
        Intrinsics.j(barcode, "barcode");
        ConcurrentHashMap concurrentHashMap = this.f122623e;
        Integer numValueOf = Integer.valueOf(barcode.getGlobalId$scandit_barcode_capture());
        if (brush == null) {
            brush = Brush.INSTANCE.transparent();
        }
        concurrentHashMap.put(numValueOf, brush);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final void c(TrackedBarcode barcode, Brush brush) {
        Intrinsics.j(barcode, "barcode");
        ConcurrentHashMap concurrentHashMap = this.f122624f;
        Integer numValueOf = Integer.valueOf(barcode.getGlobalId$scandit_barcode_capture());
        if (brush == null) {
            brush = Brush.INSTANCE.transparent();
        }
        concurrentHashMap.put(numValueOf, brush);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final void d(TrackedBarcode barcode, Brush brush) {
        Intrinsics.j(barcode, "barcode");
        ConcurrentHashMap concurrentHashMap = this.f122622d;
        Integer numValueOf = Integer.valueOf(barcode.getGlobalId$scandit_barcode_capture());
        if (brush == null) {
            brush = Brush.INSTANCE.transparent();
        }
        concurrentHashMap.put(numValueOf, brush);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final Brush a() {
        W status = W.f122373g;
        Intrinsics.j(status, "status");
        return (Brush) a(status, Unit.f143329a, new C13225b(this), new C13226c(this), new C13227d(this), new C13228e(status, this));
    }

    public static Object a(W w10, Object obj, Function1 function1, Function1 function12, Function1 function13, Function1 function14) {
        int iOrdinal = w10.ordinal();
        if (iOrdinal == 0) {
            return function1.invoke(obj);
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return function14.invoke(obj);
        }
        if (iOrdinal == 4) {
            return function12.invoke(obj);
        }
        if (iOrdinal == 5) {
            return function13.invoke(obj);
        }
        throw new NoWhenBranchMatchedException();
    }
}
