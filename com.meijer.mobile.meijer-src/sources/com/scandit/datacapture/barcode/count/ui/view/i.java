package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.t;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class i implements t {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f121810a;

    public i(BarcodeCountView owner) {
        Intrinsics.j(owner, "owner");
        this.f121810a = new WeakReference(owner);
    }
}
