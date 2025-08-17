package com.medallia.digital.mobilesdk;

/* loaded from: classes7.dex */
class i6 {

    /* renamed from: a, reason: collision with root package name */
    private final int f92237a;

    /* renamed from: b, reason: collision with root package name */
    private final a f92238b;

    enum a {
        NO_CONNECTION,
        TIMEOUT,
        OTHER;

        public static a a(int i10) {
            return (i10 == 408 || i10 == 504 || i10 == -46) ? TIMEOUT : i10 == -45 ? NO_CONNECTION : OTHER;
        }
    }

    protected i6(int i10) {
        this.f92237a = i10;
        this.f92238b = a.a(i10);
    }

    protected a a() {
        return this.f92238b;
    }

    protected int b() {
        return this.f92237a;
    }
}
