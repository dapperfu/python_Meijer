package x3;

import d3.C13599a;

/* loaded from: classes.dex */
public interface J {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final K f170166a;

        /* renamed from: b, reason: collision with root package name */
        public final K f170167b;

        public a(K k10) {
            this(k10, k10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f170166a.equals(aVar.f170166a) && this.f170167b.equals(aVar.f170167b)) {
                    return true;
                }
            }
            return false;
        }

        public a(K k10, K k11) {
            this.f170166a = (K) C13599a.e(k10);
            this.f170167b = (K) C13599a.e(k11);
        }

        public int hashCode() {
            return (this.f170166a.hashCode() * 31) + this.f170167b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f170166a);
            if (this.f170166a.equals(this.f170167b)) {
                str = "";
            } else {
                str = ", " + this.f170167b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static class b implements J {

        /* renamed from: a, reason: collision with root package name */
        private final long f170168a;

        /* renamed from: b, reason: collision with root package name */
        private final a f170169b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // x3.J
        public boolean g() {
            return false;
        }

        public b(long j10, long j11) {
            this.f170168a = j10;
            this.f170169b = new a(j11 == 0 ? K.f170170c : new K(0L, j11));
        }

        @Override // x3.J
        public a d(long j10) {
            return this.f170169b;
        }

        @Override // x3.J
        public long l() {
            return this.f170168a;
        }
    }

    a d(long j10);

    boolean g();

    long l();
}
