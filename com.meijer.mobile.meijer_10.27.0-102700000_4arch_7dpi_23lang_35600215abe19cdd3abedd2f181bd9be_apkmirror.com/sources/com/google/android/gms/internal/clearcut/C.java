package com.google.android.gms.internal.clearcut;

import java.util.Arrays;

/* loaded from: classes6.dex */
final class C implements E {
    private C() {
    }

    @Override // com.google.android.gms.internal.clearcut.E
    public final byte[] a(byte[] bArr, int i10, int i11) {
        return Arrays.copyOfRange(bArr, i10, i11 + i10);
    }

    /* synthetic */ C(B b10) {
        this();
    }
}
