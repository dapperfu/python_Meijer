package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9572u70 implements InterfaceC9358s70 {

    /* renamed from: a, reason: collision with root package name */
    private final String f78755a;

    public C9572u70(String str) {
        this.f78755a = str;
    }

    public final String toString() {
        return this.f78755a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9572u70) {
            return this.f78755a.equals(((C9572u70) obj).f78755a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f78755a.hashCode();
    }
}
