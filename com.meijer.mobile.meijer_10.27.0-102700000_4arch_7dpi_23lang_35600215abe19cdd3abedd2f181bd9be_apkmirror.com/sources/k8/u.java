package k8;

import g8.x;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    private static final String f141762e = x.f133195a + "UserPrivacyOptions";

    /* renamed from: a, reason: collision with root package name */
    private final EnumC15124j f141763a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f141764b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f141765c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f141766d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private EnumC15124j f141767a = EnumC15124j.OFF;

        /* renamed from: b, reason: collision with root package name */
        private boolean f141768b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f141769c = false;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f141770d = null;

        public u e() {
            return new u(this);
        }

        public b f(boolean z10) {
            if (this.f141770d == null) {
                this.f141769c = z10;
            }
            return this;
        }

        public b g(boolean z10) {
            this.f141768b = z10;
            return this;
        }

        public b h(EnumC15124j enumC15124j) {
            if (enumC15124j != null) {
                this.f141767a = enumC15124j;
                return this;
            }
            if (x.f133196b) {
                x8.f.w(u.f141762e, "dataCollectionLevel == null is not allowed");
            }
            return this;
        }

        public b i(Boolean bool) {
            this.f141770d = bool;
            if (bool != null) {
                this.f141769c = bool.booleanValue();
            }
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (this.f141763a == uVar.f141763a && this.f141764b == uVar.f141764b && this.f141765c == uVar.f141765c && Objects.equals(this.f141766d, uVar.f141766d)) {
                return true;
            }
        }
        return false;
    }

    private u(b bVar) {
        this.f141763a = bVar.f141767a;
        this.f141764b = bVar.f141768b;
        this.f141765c = bVar.f141769c;
        this.f141766d = bVar.f141770d;
    }

    public EnumC15124j b() {
        return this.f141763a;
    }

    public boolean c() {
        return this.f141764b;
    }

    public int hashCode() {
        int iHashCode = ((((this.f141763a.hashCode() * 31) + (this.f141764b ? 1 : 0)) * 31) + (this.f141765c ? 1 : 0)) * 31;
        Boolean bool = this.f141766d;
        return iHashCode + ((bool == null || !bool.booleanValue()) ? 0 : 1);
    }

    public String toString() {
        return "UserPrivacyOptions{dataCollectionLevel=" + this.f141763a + ", crashReportingOptedIn=" + this.f141764b + ", crashReplayOptedIn=" + this.f141765c + ", screenRecordOptedIn=" + this.f141766d + '}';
    }
}
