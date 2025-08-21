package De;

/* loaded from: classes6.dex */
public abstract class d implements q<Character> {

    private static final class a extends AbstractC0113d {

        /* renamed from: b, reason: collision with root package name */
        static final d f6136b = new a();

        a() {
            super("CharMatcher.ascii()");
        }

        @Override // De.d
        public boolean g(char c10) {
            return c10 <= 127;
        }
    }

    static abstract class b extends d {
        @Override // De.q
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch2) {
            return super.b(ch2);
        }

        b() {
        }
    }

    private static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final char f6137a;

        @Override // De.d
        public boolean g(char c10) {
            return c10 == this.f6137a;
        }

        public String toString() {
            return "CharMatcher.is('" + d.j(this.f6137a) + "')";
        }

        c(char c10) {
            this.f6137a = c10;
        }
    }

    /* renamed from: De.d$d, reason: collision with other inner class name */
    static abstract class AbstractC0113d extends b {

        /* renamed from: a, reason: collision with root package name */
        private final String f6138a;

        public final String toString() {
            return this.f6138a;
        }

        AbstractC0113d(String str) {
            this.f6138a = (String) p.q(str);
        }
    }

    private static final class e extends AbstractC0113d {

        /* renamed from: b, reason: collision with root package name */
        static final d f6139b = new e();

        @Override // De.d
        public boolean g(char c10) {
            return false;
        }

        private e() {
            super("CharMatcher.none()");
        }

        @Override // De.d
        public int d(CharSequence charSequence) {
            p.q(charSequence);
            return 0;
        }

        @Override // De.d
        public int e(CharSequence charSequence, int i10) {
            p.t(i10, charSequence.length());
            return -1;
        }

        @Override // De.d
        public boolean h(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }
    }

    static final class f extends AbstractC0113d {

        /* renamed from: b, reason: collision with root package name */
        static final int f6140b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c, reason: collision with root package name */
        static final d f6141c = new f();

        f() {
            super("CharMatcher.whitespace()");
        }

        @Override // De.d
        public boolean g(char c10) {
            if ("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c10) >>> f6140b) == c10) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String j(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public int d(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (g(charSequence.charAt(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public abstract boolean g(char c10);

    public static d c() {
        return a.f6136b;
    }

    public static d f(char c10) {
        return new c(c10);
    }

    public static d i() {
        return e.f6139b;
    }

    public static d k() {
        return f.f6141c;
    }

    protected d() {
    }

    @Deprecated
    public boolean b(Character ch2) {
        return g(ch2.charValue());
    }

    public int e(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        p.t(i10, length);
        while (i10 < length) {
            if (g(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public boolean h(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!g(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }
}
