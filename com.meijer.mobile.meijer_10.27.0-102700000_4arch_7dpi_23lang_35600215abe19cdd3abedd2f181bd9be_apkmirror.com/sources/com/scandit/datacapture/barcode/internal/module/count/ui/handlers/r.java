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

/* loaded from: classes11.dex */
public final class r implements BarcodeCountBrushHandler {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC13091a f121667a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f121668b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f121669c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f121670d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f121671e;

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f121672f;

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final void a(TrackedBarcode barcode, Brush brush) {
        Intrinsics.j(barcode, "barcode");
        ConcurrentHashMap concurrentHashMap = this.f121668b;
        Integer numValueOf = Integer.valueOf(barcode.getGlobalId$scandit_barcode_capture());
        if (brush == null) {
            brush = Brush.INSTANCE.transparent();
        }
        concurrentHashMap.put(numValueOf, brush);
    }

    public r(BarcodeCountBasicOverlay delegate) {
        Intrinsics.j(delegate, "delegate");
        this.f121667a = delegate;
        this.f121668b = new ConcurrentHashMap();
        this.f121669c = new ConcurrentHashMap();
        this.f121670d = new ConcurrentHashMap();
        this.f121671e = new ConcurrentHashMap();
        this.f121672f = new ConcurrentHashMap();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final Brush a(TrackedBarcode barcode, W status) {
        Intrinsics.j(barcode, "barcode");
        Intrinsics.j(status, "status");
        return ((Boolean) a(status, barcode, new n(this, barcode), new o(this, barcode), p.f121663a, new q(status, this, barcode))).booleanValue() ? (Brush) a(status, barcode, new C13100j(this, barcode), new k(this, barcode), l.f121655a, new m(status, this, barcode)) : this.f121667a.isListenerSet() ? (Brush) a(status, barcode, new C13096f(this), new C13097g(this), new C13098h(this), new C13099i(status, this)) : (Brush) a(status, Unit.f142422a, new C13092b(this), new C13093c(this), new C13094d(this), new C13095e(status, this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final void b(TrackedBarcode barcode, Brush brush) {
        Intrinsics.j(barcode, "barcode");
        ConcurrentHashMap concurrentHashMap = this.f121671e;
        Integer numValueOf = Integer.valueOf(barcode.getGlobalId$scandit_barcode_capture());
        if (brush == null) {
            brush = Brush.INSTANCE.transparent();
        }
        concurrentHashMap.put(numValueOf, brush);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final void c(TrackedBarcode barcode, Brush brush) {
        Intrinsics.j(barcode, "barcode");
        ConcurrentHashMap concurrentHashMap = this.f121672f;
        Integer numValueOf = Integer.valueOf(barcode.getGlobalId$scandit_barcode_capture());
        if (brush == null) {
            brush = Brush.INSTANCE.transparent();
        }
        concurrentHashMap.put(numValueOf, brush);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final void d(TrackedBarcode barcode, Brush brush) {
        Intrinsics.j(barcode, "barcode");
        ConcurrentHashMap concurrentHashMap = this.f121670d;
        Integer numValueOf = Integer.valueOf(barcode.getGlobalId$scandit_barcode_capture());
        if (brush == null) {
            brush = Brush.INSTANCE.transparent();
        }
        concurrentHashMap.put(numValueOf, brush);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.handlers.BarcodeCountBrushHandler
    public final Brush a() {
        W status = W.f121421g;
        Intrinsics.j(status, "status");
        return (Brush) a(status, Unit.f142422a, new C13092b(this), new C13093c(this), new C13094d(this), new C13095e(status, this));
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
