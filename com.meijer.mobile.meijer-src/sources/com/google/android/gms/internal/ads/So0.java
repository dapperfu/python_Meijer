package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class So0 {

    /* renamed from: b, reason: collision with root package name */
    private static final So0 f71001b = new So0();

    /* renamed from: c, reason: collision with root package name */
    private static final Qo0 f71002c = new Qo0(null);

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f71003a = new AtomicReference();

    public static So0 b() {
        return f71001b;
    }

    public final Do0 a() {
        Do0 do0 = (Do0) this.f71003a.get();
        return do0 == null ? f71002c : do0;
    }
}
