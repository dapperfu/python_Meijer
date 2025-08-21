package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import fg.InterfaceC13988c;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes8.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC13988c> f90117a;

    /* renamed from: b, reason: collision with root package name */
    private final s f90118b;

    /* renamed from: c, reason: collision with root package name */
    private final m f90119c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.f f90120d;

    /* renamed from: e, reason: collision with root package name */
    private final Lf.e f90121e;

    /* renamed from: f, reason: collision with root package name */
    private final f f90122f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f90123g;

    /* renamed from: h, reason: collision with root package name */
    private final String f90124h;

    /* renamed from: i, reason: collision with root package name */
    private final t f90125i;

    /* renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f90126j;

    private synchronized void a() {
        if (!this.f90117a.isEmpty()) {
            this.f90118b.C();
        }
    }

    public synchronized void b(boolean z10) {
        this.f90118b.z(z10);
        if (!z10) {
            a();
        }
    }

    public p(com.google.firebase.f fVar, Lf.e eVar, m mVar, f fVar2, Context context, String str, t tVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f90117a = linkedHashSet;
        this.f90118b = new s(fVar, eVar, mVar, fVar2, context, str, linkedHashSet, tVar, scheduledExecutorService);
        this.f90120d = fVar;
        this.f90119c = mVar;
        this.f90121e = eVar;
        this.f90122f = fVar2;
        this.f90123g = context;
        this.f90124h = str;
        this.f90125i = tVar;
        this.f90126j = scheduledExecutorService;
    }
}
