package M4;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class a implements j {

    /* renamed from: c, reason: collision with root package name */
    private static final Set<a> f18913c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final String f18914a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18915b;

    /* renamed from: M4.a$a, reason: collision with other inner class name */
    private static class C0323a {

        /* renamed from: a, reason: collision with root package name */
        static final Set<String> f18916a = new HashSet(Arrays.asList(u.d().a()));
    }

    public static class e extends a {
        @Override // M4.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }

        e(String str, String str2) {
            super(str, str2);
        }
    }

    public static class f extends a {
        @Override // M4.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }

        f(String str, String str2) {
            super(str, str2);
        }
    }

    public static class g extends a {
        @Override // M4.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }

        g(String str, String str2) {
            super(str, str2);
        }
    }

    public static class h extends a {
        @Override // M4.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }

        h(String str, String str2) {
            super(str, str2);
        }
    }

    public static class i extends a {
        @Override // M4.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }

        i(String str, String str2) {
            super(str, str2);
        }
    }

    public abstract boolean c();

    public static class b extends a {
        @Override // M4.a
        public final boolean c() {
            return true;
        }

        b(String str, String str2) {
            super(str, str2);
        }
    }

    public static class c extends a {
        @Override // M4.a
        public final boolean c() {
            return true;
        }

        c(String str, String str2) {
            super(str, str2);
        }
    }

    public static class d extends a {
        @Override // M4.a
        public final boolean c() {
            return false;
        }

        d(String str, String str2) {
            super(str, str2);
        }
    }

    public static Set<a> e() {
        return Collections.unmodifiableSet(f18913c);
    }

    @Override // M4.j
    public String b() {
        return this.f18914a;
    }

    public boolean d() {
        return mw.a.b(C0323a.f18916a, this.f18915b);
    }

    a(String str, String str2) {
        this.f18914a = str;
        this.f18915b = str2;
        f18913c.add(this);
    }

    @Override // M4.j
    public boolean a() {
        if (!c() && !d()) {
            return false;
        }
        return true;
    }
}
