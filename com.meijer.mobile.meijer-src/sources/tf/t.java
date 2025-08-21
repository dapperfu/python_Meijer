package tf;

import tf.AbstractC17251F;

/* loaded from: classes8.dex */
final class t extends AbstractC17251F.e.d.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f163010a;

    /* renamed from: b, reason: collision with root package name */
    private final int f163011b;

    /* renamed from: c, reason: collision with root package name */
    private final int f163012c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f163013d;

    static final class b extends AbstractC17251F.e.d.a.c.AbstractC2566a {

        /* renamed from: a, reason: collision with root package name */
        private String f163014a;

        /* renamed from: b, reason: collision with root package name */
        private int f163015b;

        /* renamed from: c, reason: collision with root package name */
        private int f163016c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f163017d;

        /* renamed from: e, reason: collision with root package name */
        private byte f163018e;

        @Override // tf.AbstractC17251F.e.d.a.c.AbstractC2566a
        public AbstractC17251F.e.d.a.c a() {
            String str;
            if (this.f163018e == 7 && (str = this.f163014a) != null) {
                return new t(str, this.f163015b, this.f163016c, this.f163017d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f163014a == null) {
                sb2.append(" processName");
            }
            if ((this.f163018e & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.f163018e & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.f163018e & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.e.d.a.c.AbstractC2566a
        public AbstractC17251F.e.d.a.c.AbstractC2566a b(boolean z10) {
            this.f163017d = z10;
            this.f163018e = (byte) (this.f163018e | 4);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.c.AbstractC2566a
        public AbstractC17251F.e.d.a.c.AbstractC2566a c(int i10) {
            this.f163016c = i10;
            this.f163018e = (byte) (this.f163018e | 2);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.c.AbstractC2566a
        public AbstractC17251F.e.d.a.c.AbstractC2566a d(int i10) {
            this.f163015b = i10;
            this.f163018e = (byte) (this.f163018e | 1);
            return this;
        }

        @Override // tf.AbstractC17251F.e.d.a.c.AbstractC2566a
        public AbstractC17251F.e.d.a.c.AbstractC2566a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f163014a = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.e.d.a.c) {
            AbstractC17251F.e.d.a.c cVar = (AbstractC17251F.e.d.a.c) obj;
            if (this.f163010a.equals(cVar.d()) && this.f163011b == cVar.c() && this.f163012c == cVar.b() && this.f163013d == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    private t(String str, int i10, int i11, boolean z10) {
        this.f163010a = str;
        this.f163011b = i10;
        this.f163012c = i11;
        this.f163013d = z10;
    }

    @Override // tf.AbstractC17251F.e.d.a.c
    public int b() {
        return this.f163012c;
    }

    @Override // tf.AbstractC17251F.e.d.a.c
    public int c() {
        return this.f163011b;
    }

    @Override // tf.AbstractC17251F.e.d.a.c
    public String d() {
        return this.f163010a;
    }

    @Override // tf.AbstractC17251F.e.d.a.c
    public boolean e() {
        return this.f163013d;
    }

    public int hashCode() {
        return ((((((this.f163010a.hashCode() ^ 1000003) * 1000003) ^ this.f163011b) * 1000003) ^ this.f163012c) * 1000003) ^ (this.f163013d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f163010a + ", pid=" + this.f163011b + ", importance=" + this.f163012c + ", defaultProcess=" + this.f163013d + "}";
    }
}
