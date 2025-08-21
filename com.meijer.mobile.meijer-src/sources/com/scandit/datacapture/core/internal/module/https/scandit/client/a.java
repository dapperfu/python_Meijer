package com.scandit.datacapture.core.internal.module.https.scandit.client;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f125665a;

    public a() {
        AtomicInteger generator = (AtomicInteger) h.f125677a.getValue();
        Intrinsics.j(generator, "generator");
        this.f125665a = generator;
    }
}
