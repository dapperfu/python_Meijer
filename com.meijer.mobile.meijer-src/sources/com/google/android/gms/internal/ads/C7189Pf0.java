package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Pf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7189Pf0 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CharSequence f70242a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7325Tf0 f70243b;

    C7189Pf0(C7325Tf0 c7325Tf0, CharSequence charSequence) {
        this.f70242a = charSequence;
        this.f70243b = c7325Tf0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f70243b.g(this.f70242a);
    }

    public final String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        C9854vf0.b(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
