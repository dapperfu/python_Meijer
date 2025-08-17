package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.clearcut.g1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10297g1 extends C10315m1 {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C10288d1 f81461b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C10297g1(C10288d1 c10288d1) {
        super(c10288d1, null);
        this.f81461b = c10288d1;
    }

    @Override // com.google.android.gms.internal.clearcut.C10315m1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C10294f1(this.f81461b, null);
    }

    /* synthetic */ C10297g1(C10288d1 c10288d1, C10291e1 c10291e1) {
        this(c10288d1);
    }
}
