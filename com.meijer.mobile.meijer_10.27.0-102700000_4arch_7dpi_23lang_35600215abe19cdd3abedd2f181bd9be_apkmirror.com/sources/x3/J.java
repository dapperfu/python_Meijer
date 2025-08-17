package x3;

import d3.C13466a;

/* loaded from: classes.dex */
public interface J {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final K f169078a;

        /* renamed from: b, reason: collision with root package name */
        public final K f169079b;

        public a(K k10) {
            this(k10, k10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f169078a.equals(aVar.f169078a) && this.f169079b.equals(aVar.f169079b)) {
                    return true;
                }
            }
            return false;
        }

        public a(K k10, K k11) {
            this.f169078a = (K) C13466a.e(k10);
            this.f169079b = (K) C13466a.e(k11);
        }

        public int hashCode() {
            return (this.f169078a.hashCode() * 31) + this.f169079b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f169078a);
            if (this.f169078a.equals(this.f169079b)) {
                str = "";
            } else {
                str = ", " + this.f169079b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static class b implements J {

        /* renamed from: a, reason: collision with root package name */
        private final long f169080a;

        /* renamed from: b, reason: collision with root package name */
        private final a f169081b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // x3.J
        public boolean g() {
            return false;
        }

        public b(long j10, long j11) {
            this.f169080a = j10;
            this.f169081b = new a(j11 == 0 ? K.f169082c : new K(0L, j11));
        }

        @Override // x3.J
        public a d(long j10) {
            return this.f169081b;
        }

        @Override // x3.J
        public long l() {
            return this.f169080a;
        }
    }

    a d(long j10);

    boolean g();

    long l();
}
