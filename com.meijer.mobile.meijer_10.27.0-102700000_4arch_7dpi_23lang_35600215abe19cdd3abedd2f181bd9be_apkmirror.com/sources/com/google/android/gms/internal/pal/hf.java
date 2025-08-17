package com.google.android.gms.internal.pal;

import java.util.Set;

/* loaded from: classes6.dex */
public final class hf extends C10671ef {

    /* renamed from: a, reason: collision with root package name */
    private final wf f83160a = new wf();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof hf) && ((hf) obj).f83160a.equals(this.f83160a);
        }
        return true;
    }

    public final C10654df h(String str) {
        return (C10654df) this.f83160a.get("key");
    }

    public final int hashCode() {
        return this.f83160a.hashCode();
    }

    public final C10671ef k(String str) {
        return (C10671ef) this.f83160a.get(str);
    }

    public final hf l(String str) {
        return (hf) this.f83160a.get("keyData");
    }

    public final Set m() {
        return this.f83160a.entrySet();
    }

    public final void n(String str, C10671ef c10671ef) {
        this.f83160a.put(str, c10671ef);
    }

    public final boolean o(String str) {
        return this.f83160a.containsKey(str);
    }
}
