package Fe;

import De.p;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final e f10430a = new a();

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Character, String> f10431a;

        /* renamed from: b, reason: collision with root package name */
        private char f10432b;

        /* renamed from: c, reason: collision with root package name */
        private char f10433c;

        /* renamed from: d, reason: collision with root package name */
        private String f10434d;

        class a extends Fe.a {

            /* renamed from: f, reason: collision with root package name */
            private final char[] f10435f;

            a(Map map, char c10, char c11) {
                super((Map<Character, String>) map, c10, c11);
                this.f10435f = b.this.f10434d != null ? b.this.f10434d.toCharArray() : null;
            }

            @Override // Fe.a
            protected char[] e(char c10) {
                return this.f10435f;
            }
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            this.f10431a = new HashMap();
            this.f10432b = (char) 0;
            this.f10433c = (char) 65535;
            this.f10434d = null;
        }

        public e c() {
            return new a(this.f10431a, this.f10432b, this.f10433c);
        }

        public b b(char c10, String str) {
            p.q(str);
            this.f10431a.put(Character.valueOf(c10), str);
            return this;
        }
    }

    class a extends c {
        @Override // Fe.c
        protected char[] b(char c10) {
            return null;
        }

        a() {
        }

        @Override // Fe.e
        public String a(String str) {
            return (String) p.q(str);
        }
    }

    public static b a() {
        return new b(null);
    }
}
