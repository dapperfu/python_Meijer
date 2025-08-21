package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickActionCallback;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickActionListener;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c implements BarcodePickActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f123382a;

    public c(BarcodePickInternal owner) {
        Intrinsics.j(owner, "owner");
        this.f123382a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickActionListener
    public final void onPick(String itemData, BarcodePickActionCallback callback) {
        CopyOnWriteArraySet copyOnWriteArraySetE;
        Intrinsics.j(itemData, "itemData");
        Intrinsics.j(callback, "callback");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f123382a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySetE = barcodePickInternal.e()) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySetE.iterator();
        while (it.hasNext()) {
            ((BarcodePickActionListener) it.next()).onPick(itemData, callback);
        }
    }

    @Override // com.scandit.datacapture.barcode.pick.capture.BarcodePickActionListener
    public final void onUnpick(String itemData, BarcodePickActionCallback callback) {
        CopyOnWriteArraySet copyOnWriteArraySetE;
        Intrinsics.j(itemData, "itemData");
        Intrinsics.j(callback, "callback");
        BarcodePickInternal barcodePickInternal = (BarcodePickInternal) this.f123382a.get();
        if (barcodePickInternal == null || (copyOnWriteArraySetE = barcodePickInternal.e()) == null) {
            return;
        }
        Iterator it = copyOnWriteArraySetE.iterator();
        while (it.hasNext()) {
            ((BarcodePickActionListener) it.next()).onUnpick(itemData, callback);
        }
    }
}
