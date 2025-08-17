package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.google.android.gms.internal.pal.ef, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10671ef {
    public int a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final hf f() {
        if (this instanceof hf) {
            return (hf) this;
        }
        toString();
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            H h10 = new H(stringWriter);
            h10.m(true);
            D.f82535V.b(h10, this);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
