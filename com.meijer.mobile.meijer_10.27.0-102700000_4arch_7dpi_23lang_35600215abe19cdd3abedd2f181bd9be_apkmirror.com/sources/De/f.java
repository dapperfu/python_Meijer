package De;

import Be.p;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final e f6397a = new a();

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Character, String> f6398a;

        /* renamed from: b, reason: collision with root package name */
        private char f6399b;

        /* renamed from: c, reason: collision with root package name */
        private char f6400c;

        /* renamed from: d, reason: collision with root package name */
        private String f6401d;

        class a extends De.a {

            /* renamed from: f, reason: collision with root package name */
            private final char[] f6402f;

            a(Map map, char c10, char c11) {
                super((Map<Character, String>) map, c10, c11);
                this.f6402f = b.this.f6401d != null ? b.this.f6401d.toCharArray() : null;
            }

            @Override // De.a
            protected char[] e(char c10) {
                return this.f6402f;
            }
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            this.f6398a = new HashMap();
            this.f6399b = (char) 0;
            this.f6400c = (char) 65535;
            this.f6401d = null;
        }

        public e c() {
            return new a(this.f6398a, this.f6399b, this.f6400c);
        }

        public b b(char c10, String str) {
            p.q(str);
            this.f6398a.put(Character.valueOf(c10), str);
            return this;
        }
    }

    class a extends c {
        @Override // De.c
        protected char[] b(char c10) {
            return null;
        }

        a() {
        }

        @Override // De.e
        public String a(String str) {
            return (String) p.q(str);
        }
    }

    public static b a() {
        return new b(null);
    }
}
