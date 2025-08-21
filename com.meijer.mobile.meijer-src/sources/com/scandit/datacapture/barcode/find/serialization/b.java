package com.scandit.datacapture.barcode.find.serialization;

import com.scandit.datacapture.barcode.internal.module.find.serialization.e;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f121925a;

    public b(BarcodeFindDeserializer owner) {
        Intrinsics.j(owner, "owner");
        this.f121925a = new WeakReference(owner);
    }
}
