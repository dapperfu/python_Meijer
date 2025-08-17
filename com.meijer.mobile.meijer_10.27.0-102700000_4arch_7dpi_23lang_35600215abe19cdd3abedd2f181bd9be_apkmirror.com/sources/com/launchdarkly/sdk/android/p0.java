package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDContext;
import ih.C14724c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import mh.InterfaceC15621b;
import mh.InterfaceC15624e;
import mh.InterfaceC15625f;

/* loaded from: classes7.dex */
final class p0 implements InterfaceC15624e {

    /* renamed from: a, reason: collision with root package name */
    private final LDContext f91237a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15625f f91238b;

    /* renamed from: c, reason: collision with root package name */
    final long f91239c;

    /* renamed from: d, reason: collision with root package name */
    final long f91240d;

    /* renamed from: e, reason: collision with root package name */
    long f91241e;

    /* renamed from: f, reason: collision with root package name */
    private final M f91242f;

    /* renamed from: g, reason: collision with root package name */
    private final n0 f91243g;

    /* renamed from: h, reason: collision with root package name */
    private final v0 f91244h;

    /* renamed from: i, reason: collision with root package name */
    private final C14724c f91245i;

    /* renamed from: j, reason: collision with root package name */
    final AtomicReference<ScheduledFuture<?>> f91246j = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: private */
    public void e(InterfaceC15621b<Boolean> interfaceC15621b) {
        long j10 = this.f91241e;
        if (j10 > 0) {
            this.f91241e = j10 - 1;
            F.h(this.f91242f, this.f91237a, this.f91238b, interfaceC15621b, this.f91245i);
        } else {
            ScheduledFuture<?> andSet = this.f91246j.getAndSet(null);
            if (andSet != null) {
                andSet.cancel(true);
            }
        }
    }

    @Override // mh.InterfaceC15624e
    public void b(InterfaceC15621b<Void> interfaceC15621b) {
        ScheduledFuture<?> andSet = this.f91246j.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(true);
        }
        interfaceC15621b.onSuccess(null);
    }

    @Override // mh.InterfaceC15624e
    public void c(final InterfaceC15621b<Boolean> interfaceC15621b) {
        if (this.f91241e <= 0) {
            interfaceC15621b.onSuccess(Boolean.TRUE);
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.launchdarkly.sdk.android.o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f91235a.e(interfaceC15621b);
            }
        };
        this.f91245i.d("Scheduling polling task with interval of {}ms, starting after {}ms, with number of polls {}", Long.valueOf(this.f91240d), Long.valueOf(this.f91239c), Long.valueOf(this.f91241e));
        this.f91246j.set(this.f91244h.A0(runnable, this.f91239c, this.f91240d));
    }

    p0(LDContext lDContext, InterfaceC15625f interfaceC15625f, long j10, long j11, long j12, M m10, n0 n0Var, v0 v0Var, C14724c c14724c) {
        this.f91237a = lDContext;
        this.f91238b = interfaceC15625f;
        this.f91239c = j10;
        this.f91240d = j11;
        this.f91241e = j12;
        this.f91242f = m10;
        this.f91243g = n0Var;
        this.f91244h = v0Var;
        this.f91245i = c14724c;
    }
}
