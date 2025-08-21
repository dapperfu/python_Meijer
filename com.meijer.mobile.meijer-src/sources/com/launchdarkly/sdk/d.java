package com.launchdarkly.sdk;

import og.InterfaceC16126b;

@InterfaceC16126b(ContextKindTypeAdapter.class)
/* loaded from: classes8.dex */
public final class d implements Comparable<d>, com.launchdarkly.sdk.json.c {

    /* renamed from: b, reason: collision with root package name */
    public static final d f92139b = new d("user");

    /* renamed from: c, reason: collision with root package name */
    public static final d f92140c = new d("multi");

    /* renamed from: a, reason: collision with root package name */
    private final String f92141a;

    public static d e(String str) {
        if (str == null || str.isEmpty() || str.equals(f92139b.f92141a)) {
            return f92139b;
        }
        d dVar = f92140c;
        return str.equals(dVar.f92141a) ? dVar : new d(str);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        return this.f92141a.compareTo(dVar.f92141a);
    }

    public boolean b() {
        return this == f92139b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this == obj || this.f92141a.equals(((d) obj).f92141a);
        }
        return false;
    }

    public int hashCode() {
        return this.f92141a.hashCode();
    }

    public String toString() {
        return this.f92141a;
    }

    private d(String str) {
        this.f92141a = str;
    }

    String l() {
        if (b()) {
            return null;
        }
        if (this == f92140c) {
            return "context of kind \"multi\" must be created with NewMulti or NewMultiBuilder";
        }
        if (this.f92141a.equals("kind")) {
            return "\"kind\" is not a valid context kind";
        }
        for (int i10 = 0; i10 < this.f92141a.length(); i10++) {
            char cCharAt = this.f92141a.charAt(i10);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '.' && cCharAt != '_' && cCharAt != '-'))) {
                return "context kind contains disallowed characters";
            }
        }
        return null;
    }
}
