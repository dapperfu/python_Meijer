package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.Z;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes6.dex */
abstract class S<T extends Z<T>> {
    S() {
    }

    abstract int a(Map.Entry<?, ?> entry);

    abstract W<T> b(Object obj);

    abstract void c(M1 m12, Map.Entry<?, ?> entry) throws IOException;

    abstract void d(Object obj, W<T> w10);

    abstract W<T> e(Object obj);

    abstract void f(Object obj);

    abstract boolean g(J0 j02);
}
