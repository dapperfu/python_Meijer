package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.uf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9622uf0 extends AbstractC9195qf0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f78888a;

    @Override // com.google.android.gms.internal.ads.AbstractC9195qf0
    public final C9088pf0 a(CharSequence charSequence) {
        return new C9515tf0(this.f78888a.matcher(charSequence));
    }

    public final String toString() {
        return this.f78888a.toString();
    }

    C9622uf0(Pattern pattern) {
        pattern.getClass();
        this.f78888a = pattern;
    }
}
