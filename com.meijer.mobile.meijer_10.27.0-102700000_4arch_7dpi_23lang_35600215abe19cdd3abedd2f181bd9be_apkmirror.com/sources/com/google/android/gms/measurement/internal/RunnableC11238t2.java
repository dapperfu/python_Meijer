package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.t2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11238t2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC11231s2 f85861a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85862b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f85863c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f85864d;

    /* renamed from: e, reason: collision with root package name */
    private final String f85865e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f85866f;

    @Override // java.lang.Runnable
    public final void run() {
        this.f85861a.a(this.f85865e, this.f85862b, this.f85863c, this.f85864d, this.f85866f);
    }

    /* synthetic */ RunnableC11238t2(String str, InterfaceC11231s2 interfaceC11231s2, int i10, Throwable th2, byte[] bArr, Map map, byte[] bArr2) {
        com.google.android.gms.common.internal.r.l(interfaceC11231s2);
        this.f85861a = interfaceC11231s2;
        this.f85862b = i10;
        this.f85863c = th2;
        this.f85864d = bArr;
        this.f85865e = str;
        this.f85866f = map;
    }
}
