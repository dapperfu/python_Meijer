package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.t2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11363t2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC11356s2 f86701a;

    /* renamed from: b, reason: collision with root package name */
    private final int f86702b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f86703c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f86704d;

    /* renamed from: e, reason: collision with root package name */
    private final String f86705e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f86706f;

    @Override // java.lang.Runnable
    public final void run() {
        this.f86701a.a(this.f86705e, this.f86702b, this.f86703c, this.f86704d, this.f86706f);
    }

    /* synthetic */ RunnableC11363t2(String str, InterfaceC11356s2 interfaceC11356s2, int i10, Throwable th2, byte[] bArr, Map map, byte[] bArr2) {
        com.google.android.gms.common.internal.r.l(interfaceC11356s2);
        this.f86701a = interfaceC11356s2;
        this.f86702b = i10;
        this.f86703c = th2;
        this.f86704d = bArr;
        this.f86705e = str;
        this.f86706f = map;
    }
}
