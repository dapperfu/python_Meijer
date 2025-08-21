package androidx.camera.core.impl;

import C.C3037w;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C5796e;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f47721a = new Range<>(0, 0);

    public abstract C3037w b();

    public abstract Range<Integer> c();

    public abstract k d();

    public abstract Size e();

    public abstract boolean f();

    public abstract a g();

    public static abstract class a {
        public abstract x a();

        public abstract a b(C3037w c3037w);

        public abstract a c(Range<Integer> range);

        public abstract a d(k kVar);

        public abstract a e(Size size);

        public abstract a f(boolean z10);

        a() {
        }
    }

    public static a a(Size size) {
        return new C5796e.b().e(size).c(f47721a).b(C3037w.f3991d).f(false);
    }
}
