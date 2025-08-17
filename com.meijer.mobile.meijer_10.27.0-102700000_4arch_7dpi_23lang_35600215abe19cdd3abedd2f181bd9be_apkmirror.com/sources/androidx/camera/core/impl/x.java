package androidx.camera.core.impl;

import C.C2979w;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C5654e;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f47497a = new Range<>(0, 0);

    public abstract C2979w b();

    public abstract Range<Integer> c();

    public abstract k d();

    public abstract Size e();

    public abstract boolean f();

    public abstract a g();

    public static abstract class a {
        public abstract x a();

        public abstract a b(C2979w c2979w);

        public abstract a c(Range<Integer> range);

        public abstract a d(k kVar);

        public abstract a e(Size size);

        public abstract a f(boolean z10);

        a() {
        }
    }

    public static a a(Size size) {
        return new C5654e.b().e(size).c(f47497a).b(C2979w.f3533d).f(false);
    }
}
