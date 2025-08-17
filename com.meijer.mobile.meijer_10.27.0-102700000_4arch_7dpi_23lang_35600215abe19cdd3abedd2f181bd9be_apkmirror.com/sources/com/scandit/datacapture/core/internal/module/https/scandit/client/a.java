package com.scandit.datacapture.core.internal.module.https.scandit.client;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f124713a;

    public a() {
        AtomicInteger generator = (AtomicInteger) h.f124725a.getValue();
        Intrinsics.j(generator, "generator");
        this.f124713a = generator;
    }
}
