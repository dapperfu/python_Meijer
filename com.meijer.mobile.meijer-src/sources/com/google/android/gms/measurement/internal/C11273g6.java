package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.g6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11273g6 implements InterfaceC11356s2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86429a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t6 f86430b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q6 f86431c;

    C11273g6(q6 q6Var, String str, t6 t6Var) {
        this.f86429a = str;
        this.f86430b = t6Var;
        Objects.requireNonNull(q6Var);
        this.f86431c = q6Var;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC11356s2
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f86431c.t(this.f86429a, i10, th2, bArr, this.f86430b);
    }
}
