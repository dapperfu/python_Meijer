package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.t80, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9467t80 {

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.common.util.concurrent.q f78491d = Mj0.h(null);

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f78492a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f78493b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9574u80 f78494c;

    public AbstractC9467t80(Xj0 xj0, ScheduledExecutorService scheduledExecutorService, InterfaceC9574u80 interfaceC9574u80) {
        this.f78492a = xj0;
        this.f78493b = scheduledExecutorService;
        this.f78494c = interfaceC9574u80;
    }

    protected abstract String f(Object obj);

    public final C8293i80 a(Object obj, com.google.common.util.concurrent.q... qVarArr) {
        return new C8293i80(this, obj, Arrays.asList(qVarArr), null);
    }

    public final C9253r80 b(Object obj, com.google.common.util.concurrent.q qVar) {
        return new C9253r80(this, obj, qVar, Collections.singletonList(qVar), qVar);
    }
}
