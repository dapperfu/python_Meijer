package com.google.android.gms.internal.pal;

import java.util.Set;

/* loaded from: classes6.dex */
public final class hf extends C10796ef {

    /* renamed from: a, reason: collision with root package name */
    private final wf f84000a = new wf();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof hf) && ((hf) obj).f84000a.equals(this.f84000a);
        }
        return true;
    }

    public final C10779df h(String str) {
        return (C10779df) this.f84000a.get("key");
    }

    public final int hashCode() {
        return this.f84000a.hashCode();
    }

    public final C10796ef k(String str) {
        return (C10796ef) this.f84000a.get(str);
    }

    public final hf l(String str) {
        return (hf) this.f84000a.get("keyData");
    }

    public final Set m() {
        return this.f84000a.entrySet();
    }

    public final void n(String str, C10796ef c10796ef) {
        this.f84000a.put(str, c10796ef);
    }

    public final boolean o(String str) {
        return this.f84000a.containsKey(str);
    }
}
