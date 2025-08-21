package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
final class S7 extends L7 {

    /* renamed from: a, reason: collision with root package name */
    private final String f83711a;

    /* renamed from: b, reason: collision with root package name */
    private final int f83712b;

    /* synthetic */ S7(String str, int i10, R7 r72) {
        this.f83711a = str;
        this.f83712b = i10;
    }

    public final String toString() {
        String str = this.f83711a;
        int i10 = this.f83712b - 2;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
