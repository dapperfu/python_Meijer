package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Xa {

    /* renamed from: a, reason: collision with root package name */
    private HashMap f83806a = new HashMap();

    public final C10724ab a() {
        if (this.f83806a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        C10724ab c10724ab = new C10724ab(Collections.unmodifiableMap(this.f83806a), null);
        this.f83806a = null;
        return c10724ab;
    }
}
