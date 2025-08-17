package com.scandit.datacapture.barcode.count.ui.view;

import com.scandit.datacapture.barcode.internal.module.count.ui.handlers.t;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class i implements t {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f120858a;

    public i(BarcodeCountView owner) {
        Intrinsics.j(owner, "owner");
        this.f120858a = new WeakReference(owner);
    }
}
