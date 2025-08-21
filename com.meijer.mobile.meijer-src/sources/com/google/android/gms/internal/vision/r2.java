package com.google.android.gms.internal.vision;

/* loaded from: classes6.dex */
final class r2 extends IllegalArgumentException {
    r2(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Unpaired surrogate at index ");
        sb2.append(i10);
        sb2.append(" of ");
        sb2.append(i11);
        super(sb2.toString());
    }
}
