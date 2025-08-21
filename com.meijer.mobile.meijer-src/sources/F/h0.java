package F;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f8721a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Class<? extends g0>> f8722b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Class<? extends g0>> f8723c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f8724a = true;

        /* renamed from: b, reason: collision with root package name */
        private Set<Class<? extends g0>> f8725b;

        /* renamed from: c, reason: collision with root package name */
        private Set<Class<? extends g0>> f8726c;

        public h0 a() {
            return new h0(this.f8724a, this.f8725b, this.f8726c);
        }

        public b b(Set<Class<? extends g0>> set) {
            this.f8726c = new HashSet(set);
            return this;
        }

        public b c(Set<Class<? extends g0>> set) {
            this.f8725b = new HashSet(set);
            return this;
        }

        public b d(boolean z10) {
            this.f8724a = z10;
            return this;
        }
    }

    private h0(boolean z10, Set<Class<? extends g0>> set, Set<Class<? extends g0>> set2) {
        this.f8721a = z10;
        this.f8722b = set == null ? Collections.EMPTY_SET : new HashSet<>(set);
        this.f8723c = set2 == null ? Collections.EMPTY_SET : new HashSet<>(set2);
    }

    public static h0 b() {
        return new b().d(true).a();
    }

    public boolean a(Class<? extends g0> cls, boolean z10) {
        if (this.f8722b.contains(cls)) {
            return true;
        }
        return !this.f8723c.contains(cls) && this.f8721a && z10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        h0 h0Var = (h0) obj;
        return this.f8721a == h0Var.f8721a && Objects.equals(this.f8722b, h0Var.f8722b) && Objects.equals(this.f8723c, h0Var.f8723c);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f8721a), this.f8722b, this.f8723c);
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f8721a + ", forceEnabledQuirks=" + this.f8722b + ", forceDisabledQuirks=" + this.f8723c + '}';
    }
}
