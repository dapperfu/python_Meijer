package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u70, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9697u70 implements InterfaceC9483s70 {

    /* renamed from: a, reason: collision with root package name */
    private final String f79595a;

    public C9697u70(String str) {
        this.f79595a = str;
    }

    public final String toString() {
        return this.f79595a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9697u70) {
            return this.f79595a.equals(((C9697u70) obj).f79595a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f79595a.hashCode();
    }
}
