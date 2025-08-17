package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class Oc {

    /* renamed from: a, reason: collision with root package name */
    private static final F0 f82818a = new Nc();

    public static int a(int i10) {
        if (i10 != 1) {
            return i10 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 4;
        }
        if (i10 == 3) {
            return 5;
        }
        if (i10 != 4) {
            return i10 != 5 ? 0 : 7;
        }
        return 6;
    }
}
