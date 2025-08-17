package com.google.android.gms.internal.pal;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.ab, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10599ab {

    /* renamed from: b, reason: collision with root package name */
    public static final C10599ab f83052b = new Xa().a();

    /* renamed from: a, reason: collision with root package name */
    private final Map f83053a;

    public final Map a() {
        return this.f83053a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10599ab) {
            return this.f83053a.equals(((C10599ab) obj).f83053a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f83053a.hashCode();
    }

    public final String toString() {
        return this.f83053a.toString();
    }
}
