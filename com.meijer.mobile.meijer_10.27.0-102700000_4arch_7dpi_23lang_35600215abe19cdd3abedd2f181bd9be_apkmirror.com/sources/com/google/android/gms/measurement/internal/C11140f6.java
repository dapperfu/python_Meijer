package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.f6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11140f6 implements InterfaceC11231s2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85555a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f85556b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q6 f85557c;

    C11140f6(q6 q6Var, String str, List list) {
        this.f85555a = str;
        this.f85556b = list;
        Objects.requireNonNull(q6Var);
        this.f85557c = q6Var;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC11231s2
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f85557c.y(true, i10, th2, bArr, this.f85555a, this.f85556b);
    }
}
