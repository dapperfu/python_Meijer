package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.g6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11148g6 implements InterfaceC11231s2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85589a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t6 f85590b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q6 f85591c;

    C11148g6(q6 q6Var, String str, t6 t6Var) {
        this.f85589a = str;
        this.f85590b = t6Var;
        Objects.requireNonNull(q6Var);
        this.f85591c = q6Var;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC11231s2
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f85591c.t(this.f85589a, i10, th2, bArr, this.f85590b);
    }
}
