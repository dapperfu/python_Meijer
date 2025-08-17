package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class S7 extends L7 {

    /* renamed from: a, reason: collision with root package name */
    private final String f82871a;

    /* renamed from: b, reason: collision with root package name */
    private final int f82872b;

    /* synthetic */ S7(String str, int i10, R7 r72) {
        this.f82871a = str;
        this.f82872b = i10;
    }

    public final String toString() {
        String str = this.f82871a;
        int i10 = this.f82872b - 2;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
