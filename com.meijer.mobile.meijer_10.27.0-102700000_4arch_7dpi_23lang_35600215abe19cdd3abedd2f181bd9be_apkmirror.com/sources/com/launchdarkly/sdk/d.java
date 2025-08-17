package com.launchdarkly.sdk;

import mg.InterfaceC15616b;

@InterfaceC15616b(ContextKindTypeAdapter.class)
/* loaded from: classes7.dex */
public final class d implements Comparable<d>, com.launchdarkly.sdk.json.c {

    /* renamed from: b, reason: collision with root package name */
    public static final d f91300b = new d("user");

    /* renamed from: c, reason: collision with root package name */
    public static final d f91301c = new d("multi");

    /* renamed from: a, reason: collision with root package name */
    private final String f91302a;

    public static d e(String str) {
        if (str == null || str.isEmpty() || str.equals(f91300b.f91302a)) {
            return f91300b;
        }
        d dVar = f91301c;
        return str.equals(dVar.f91302a) ? dVar : new d(str);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        return this.f91302a.compareTo(dVar.f91302a);
    }

    public boolean b() {
        return this == f91300b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this == obj || this.f91302a.equals(((d) obj).f91302a);
        }
        return false;
    }

    public int hashCode() {
        return this.f91302a.hashCode();
    }

    public String toString() {
        return this.f91302a;
    }

    private d(String str) {
        this.f91302a = str;
    }

    String l() {
        if (b()) {
            return null;
        }
        if (this == f91301c) {
            return "context of kind \"multi\" must be created with NewMulti or NewMultiBuilder";
        }
        if (this.f91302a.equals("kind")) {
            return "\"kind\" is not a valid context kind";
        }
        for (int i10 = 0; i10 < this.f91302a.length(); i10++) {
            char cCharAt = this.f91302a.charAt(i10);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '.' && cCharAt != '_' && cCharAt != '-'))) {
                return "context kind contains disallowed characters";
            }
        }
        return null;
    }
}
