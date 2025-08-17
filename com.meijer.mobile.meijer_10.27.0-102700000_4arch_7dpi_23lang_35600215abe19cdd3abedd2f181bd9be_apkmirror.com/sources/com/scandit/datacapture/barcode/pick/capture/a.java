package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements BarcodePickStatusListenerInternal {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f123587a;

    public a(BarcodePick owner) {
        Intrinsics.j(owner, "owner");
        this.f123587a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void a() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        BarcodePick barcodePick = (BarcodePick) this.f123587a.get();
        if (barcodePick == null || (copyOnWriteArraySet = barcodePick.f123560b) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickStatusListenerInternal) it.next()).a();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void b() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        BarcodePick barcodePick = (BarcodePick) this.f123587a.get();
        if (barcodePick == null || (copyOnWriteArraySet = barcodePick.f123560b) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickStatusListenerInternal) it.next()).b();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void c() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        BarcodePick barcodePick = (BarcodePick) this.f123587a.get();
        if (barcodePick == null || (copyOnWriteArraySet = barcodePick.f123560b) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickStatusListenerInternal) it.next()).c();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void d() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        BarcodePick barcodePick = (BarcodePick) this.f123587a.get();
        if (barcodePick == null || (copyOnWriteArraySet = barcodePick.f123560b) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BarcodePickStatusListenerInternal) it.next()).d();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void onObservationStarted(BarcodePick mode) {
        Intrinsics.j(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickStatusListenerInternal
    public final void onObservationStopped(BarcodePick mode) {
        Intrinsics.j(mode, "mode");
    }
}
