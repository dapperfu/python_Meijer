package com.google.android.gms.internal.pal;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.ab, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10724ab {

    /* renamed from: b, reason: collision with root package name */
    public static final C10724ab f83892b = new Xa().a();

    /* renamed from: a, reason: collision with root package name */
    private final Map f83893a;

    public final Map a() {
        return this.f83893a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10724ab) {
            return this.f83893a.equals(((C10724ab) obj).f83893a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f83893a.hashCode();
    }

    public final String toString() {
        return this.f83893a.toString();
    }
}
