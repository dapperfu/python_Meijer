package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.t80, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9592t80 {

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.common.util.concurrent.q f79331d = Mj0.h(null);

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f79332a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f79333b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9699u80 f79334c;

    public AbstractC9592t80(Xj0 xj0, ScheduledExecutorService scheduledExecutorService, InterfaceC9699u80 interfaceC9699u80) {
        this.f79332a = xj0;
        this.f79333b = scheduledExecutorService;
        this.f79334c = interfaceC9699u80;
    }

    protected abstract String f(Object obj);

    public final C8418i80 a(Object obj, com.google.common.util.concurrent.q... qVarArr) {
        return new C8418i80(this, obj, Arrays.asList(qVarArr), null);
    }

    public final C9378r80 b(Object obj, com.google.common.util.concurrent.q qVar) {
        return new C9378r80(this, obj, qVar, Collections.singletonList(qVar), qVar);
    }
}
