package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8013fc {

    /* renamed from: a, reason: collision with root package name */
    final long f74127a;

    /* renamed from: b, reason: collision with root package name */
    final String f74128b;

    /* renamed from: c, reason: collision with root package name */
    final int f74129c;

    C8013fc(long j10, String str, int i10) {
        this.f74127a = j10;
        this.f74128b = str;
        this.f74129c = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C8013fc)) {
            C8013fc c8013fc = (C8013fc) obj;
            if (c8013fc.f74127a == this.f74127a && c8013fc.f74129c == this.f74129c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f74127a;
    }
}
