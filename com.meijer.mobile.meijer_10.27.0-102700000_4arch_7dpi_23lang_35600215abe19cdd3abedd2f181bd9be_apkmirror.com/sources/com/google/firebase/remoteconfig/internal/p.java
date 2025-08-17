package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import dg.InterfaceC13515c;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes7.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC13515c> f89275a;

    /* renamed from: b, reason: collision with root package name */
    private final s f89276b;

    /* renamed from: c, reason: collision with root package name */
    private final m f89277c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.f f89278d;

    /* renamed from: e, reason: collision with root package name */
    private final Jf.e f89279e;

    /* renamed from: f, reason: collision with root package name */
    private final f f89280f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f89281g;

    /* renamed from: h, reason: collision with root package name */
    private final String f89282h;

    /* renamed from: i, reason: collision with root package name */
    private final t f89283i;

    /* renamed from: j, reason: collision with root package name */
    private final ScheduledExecutorService f89284j;

    private synchronized void a() {
        if (!this.f89275a.isEmpty()) {
            this.f89276b.C();
        }
    }

    public synchronized void b(boolean z10) {
        this.f89276b.z(z10);
        if (!z10) {
            a();
        }
    }

    public p(com.google.firebase.f fVar, Jf.e eVar, m mVar, f fVar2, Context context, String str, t tVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f89275a = linkedHashSet;
        this.f89276b = new s(fVar, eVar, mVar, fVar2, context, str, linkedHashSet, tVar, scheduledExecutorService);
        this.f89278d = fVar;
        this.f89277c = mVar;
        this.f89279e = eVar;
        this.f89280f = fVar2;
        this.f89281g = context;
        this.f89282h = str;
        this.f89283i = tVar;
        this.f89284j = scheduledExecutorService;
    }
}
