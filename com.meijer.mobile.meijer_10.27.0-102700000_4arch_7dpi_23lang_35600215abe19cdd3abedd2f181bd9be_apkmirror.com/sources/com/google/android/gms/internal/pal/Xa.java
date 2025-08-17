package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Xa {

    /* renamed from: a, reason: collision with root package name */
    private HashMap f82966a = new HashMap();

    public final C10599ab a() {
        if (this.f82966a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        C10599ab c10599ab = new C10599ab(Collections.unmodifiableMap(this.f82966a), null);
        this.f82966a = null;
        return c10599ab;
    }
}
