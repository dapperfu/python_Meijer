package F;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9954a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Class<? extends g0>> f9955b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Class<? extends g0>> f9956c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f9957a = true;

        /* renamed from: b, reason: collision with root package name */
        private Set<Class<? extends g0>> f9958b;

        /* renamed from: c, reason: collision with root package name */
        private Set<Class<? extends g0>> f9959c;

        public h0 a() {
            return new h0(this.f9957a, this.f9958b, this.f9959c);
        }

        public b b(Set<Class<? extends g0>> set) {
            this.f9959c = new HashSet(set);
            return this;
        }

        public b c(Set<Class<? extends g0>> set) {
            this.f9958b = new HashSet(set);
            return this;
        }

        public b d(boolean z10) {
            this.f9957a = z10;
            return this;
        }
    }

    private h0(boolean z10, Set<Class<? extends g0>> set, Set<Class<? extends g0>> set2) {
        this.f9954a = z10;
        this.f9955b = set == null ? Collections.EMPTY_SET : new HashSet<>(set);
        this.f9956c = set2 == null ? Collections.EMPTY_SET : new HashSet<>(set2);
    }

    public static h0 b() {
        return new b().d(true).a();
    }

    public boolean a(Class<? extends g0> cls, boolean z10) {
        if (this.f9955b.contains(cls)) {
            return true;
        }
        return !this.f9956c.contains(cls) && this.f9954a && z10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        h0 h0Var = (h0) obj;
        return this.f9954a == h0Var.f9954a && Objects.equals(this.f9955b, h0Var.f9955b) && Objects.equals(this.f9956c, h0Var.f9956c);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f9954a), this.f9955b, this.f9956c);
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f9954a + ", forceEnabledQuirks=" + this.f9955b + ", forceDisabledQuirks=" + this.f9956c + '}';
    }
}
