package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.f6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11265f6 implements InterfaceC11356s2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86395a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f86396b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q6 f86397c;

    C11265f6(q6 q6Var, String str, List list) {
        this.f86395a = str;
        this.f86396b = list;
        Objects.requireNonNull(q6Var);
        this.f86397c = q6Var;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC11356s2
    public final void a(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        this.f86397c.y(true, i10, th2, bArr, this.f86395a, this.f86396b);
    }
}
