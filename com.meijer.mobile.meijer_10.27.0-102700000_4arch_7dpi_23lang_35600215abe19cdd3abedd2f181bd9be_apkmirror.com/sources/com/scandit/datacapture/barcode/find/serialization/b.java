package com.scandit.datacapture.barcode.find.serialization;

import com.scandit.datacapture.barcode.internal.module.find.serialization.e;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f120973a;

    public b(BarcodeFindDeserializer owner) {
        Intrinsics.j(owner, "owner");
        this.f120973a = new WeakReference(owner);
    }
}
