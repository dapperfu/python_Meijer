package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.clearcut.g1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10422g1 extends C10440m1 {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C10413d1 f82301b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private C10422g1(C10413d1 c10413d1) {
        super(c10413d1, null);
        this.f82301b = c10413d1;
    }

    @Override // com.google.android.gms.internal.clearcut.C10440m1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C10419f1(this.f82301b, null);
    }

    /* synthetic */ C10422g1(C10413d1 c10413d1, C10416e1 c10416e1) {
        this(c10413d1);
    }
}
