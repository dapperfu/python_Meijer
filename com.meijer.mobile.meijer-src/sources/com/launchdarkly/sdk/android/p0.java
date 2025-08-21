package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.LDContext;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import jh.C15034c;
import nh.InterfaceC15944b;
import nh.InterfaceC15947e;
import nh.InterfaceC15948f;

/* loaded from: classes8.dex */
final class p0 implements InterfaceC15947e {

    /* renamed from: a, reason: collision with root package name */
    private final LDContext f92076a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15948f f92077b;

    /* renamed from: c, reason: collision with root package name */
    final long f92078c;

    /* renamed from: d, reason: collision with root package name */
    final long f92079d;

    /* renamed from: e, reason: collision with root package name */
    long f92080e;

    /* renamed from: f, reason: collision with root package name */
    private final M f92081f;

    /* renamed from: g, reason: collision with root package name */
    private final n0 f92082g;

    /* renamed from: h, reason: collision with root package name */
    private final v0 f92083h;

    /* renamed from: i, reason: collision with root package name */
    private final C15034c f92084i;

    /* renamed from: j, reason: collision with root package name */
    final AtomicReference<ScheduledFuture<?>> f92085j = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: private */
    public void e(InterfaceC15944b<Boolean> interfaceC15944b) {
        long j10 = this.f92080e;
        if (j10 > 0) {
            this.f92080e = j10 - 1;
            F.h(this.f92081f, this.f92076a, this.f92077b, interfaceC15944b, this.f92084i);
        } else {
            ScheduledFuture<?> andSet = this.f92085j.getAndSet(null);
            if (andSet != null) {
                andSet.cancel(true);
            }
        }
    }

    @Override // nh.InterfaceC15947e
    public void a(final InterfaceC15944b<Boolean> interfaceC15944b) {
        if (this.f92080e <= 0) {
            interfaceC15944b.onSuccess(Boolean.TRUE);
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.launchdarkly.sdk.android.o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f92074a.e(interfaceC15944b);
            }
        };
        this.f92084i.d("Scheduling polling task with interval of {}ms, starting after {}ms, with number of polls {}", Long.valueOf(this.f92079d), Long.valueOf(this.f92078c), Long.valueOf(this.f92080e));
        this.f92085j.set(this.f92083h.y0(runnable, this.f92078c, this.f92079d));
    }

    @Override // nh.InterfaceC15947e
    public void c(InterfaceC15944b<Void> interfaceC15944b) {
        ScheduledFuture<?> andSet = this.f92085j.getAndSet(null);
        if (andSet != null) {
            andSet.cancel(true);
        }
        interfaceC15944b.onSuccess(null);
    }

    p0(LDContext lDContext, InterfaceC15948f interfaceC15948f, long j10, long j11, long j12, M m10, n0 n0Var, v0 v0Var, C15034c c15034c) {
        this.f92076a = lDContext;
        this.f92077b = interfaceC15948f;
        this.f92078c = j10;
        this.f92079d = j11;
        this.f92080e = j12;
        this.f92081f = m10;
        this.f92082g = n0Var;
        this.f92083h = v0Var;
        this.f92084i = c15034c;
    }
}
