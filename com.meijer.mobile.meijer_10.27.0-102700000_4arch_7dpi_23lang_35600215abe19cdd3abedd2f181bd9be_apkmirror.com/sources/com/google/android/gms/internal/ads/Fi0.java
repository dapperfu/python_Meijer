package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class Fi0 {
    public static char a(long j10) {
        char c10 = (char) j10;
        C6657Df0.h(((long) c10) == j10, "Out of range: %s", j10);
        return c10;
    }

    public static char b(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }
}
