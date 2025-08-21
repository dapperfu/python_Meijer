package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.uf0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9747uf0 extends AbstractC9320qf0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f79728a;

    @Override // com.google.android.gms.internal.ads.AbstractC9320qf0
    public final C9213pf0 a(CharSequence charSequence) {
        return new C9640tf0(this.f79728a.matcher(charSequence));
    }

    public final String toString() {
        return this.f79728a.toString();
    }

    C9747uf0(Pattern pattern) {
        pattern.getClass();
        this.f79728a = pattern;
    }
}
