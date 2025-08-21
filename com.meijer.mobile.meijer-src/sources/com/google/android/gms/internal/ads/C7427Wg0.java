package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Wg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7427Wg0 {
    static int a(int i10) {
        return (int) (Integer.rotateLeft((int) (i10 * (-862048943)), 15) * 461845907);
    }

    static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
