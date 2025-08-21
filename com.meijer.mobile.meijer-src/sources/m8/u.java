package m8;

import i8.x;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    private static final String f150908e = x.f137411a + "UserPrivacyOptions";

    /* renamed from: a, reason: collision with root package name */
    private final EnumC15695j f150909a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f150910b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f150911c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f150912d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private EnumC15695j f150913a = EnumC15695j.OFF;

        /* renamed from: b, reason: collision with root package name */
        private boolean f150914b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f150915c = false;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f150916d = null;

        public u e() {
            return new u(this);
        }

        public b f(boolean z10) {
            if (this.f150916d == null) {
                this.f150915c = z10;
            }
            return this;
        }

        public b g(boolean z10) {
            this.f150914b = z10;
            return this;
        }

        public b h(EnumC15695j enumC15695j) {
            if (enumC15695j != null) {
                this.f150913a = enumC15695j;
                return this;
            }
            if (x.f137412b) {
                z8.f.w(u.f150908e, "dataCollectionLevel == null is not allowed");
            }
            return this;
        }

        public b i(Boolean bool) {
            this.f150916d = bool;
            if (bool != null) {
                this.f150915c = bool.booleanValue();
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
            if (this.f150909a == uVar.f150909a && this.f150910b == uVar.f150910b && this.f150911c == uVar.f150911c && Objects.equals(this.f150912d, uVar.f150912d)) {
                return true;
            }
        }
        return false;
    }

    private u(b bVar) {
        this.f150909a = bVar.f150913a;
        this.f150910b = bVar.f150914b;
        this.f150911c = bVar.f150915c;
        this.f150912d = bVar.f150916d;
    }

    public EnumC15695j b() {
        return this.f150909a;
    }

    public boolean c() {
        return this.f150910b;
    }

    public int hashCode() {
        int iHashCode = ((((this.f150909a.hashCode() * 31) + (this.f150910b ? 1 : 0)) * 31) + (this.f150911c ? 1 : 0)) * 31;
        Boolean bool = this.f150912d;
        return iHashCode + ((bool == null || !bool.booleanValue()) ? 0 : 1);
    }

    public String toString() {
        return "UserPrivacyOptions{dataCollectionLevel=" + this.f150909a + ", crashReportingOptedIn=" + this.f150910b + ", crashReplayOptedIn=" + this.f150911c + ", screenRecordOptedIn=" + this.f150912d + '}';
    }
}
