package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Pf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7064Pf0 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CharSequence f69402a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7200Tf0 f69403b;

    C7064Pf0(C7200Tf0 c7200Tf0, CharSequence charSequence) {
        this.f69402a = charSequence;
        this.f69403b = c7200Tf0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f69403b.g(this.f69402a);
    }

    public final String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        C9729vf0.b(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
