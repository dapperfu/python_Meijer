package com.google.android.gms.internal.vision;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class T1 extends Z1 {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ S1 f84478b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private T1(S1 s12) {
        super(s12, null);
        this.f84478b = s12;
    }

    /* synthetic */ T1(S1 s12, R1 r12) {
        this(s12);
    }

    @Override // com.google.android.gms.internal.vision.Z1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new U1(this.f84478b, null);
    }
}
