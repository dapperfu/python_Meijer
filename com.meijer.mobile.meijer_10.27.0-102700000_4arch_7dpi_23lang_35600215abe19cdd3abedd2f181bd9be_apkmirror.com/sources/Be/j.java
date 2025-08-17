package Be;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes6.dex */
public final class j {

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f2203a;

        /* renamed from: b, reason: collision with root package name */
        private final C0045b f2204b;

        /* renamed from: c, reason: collision with root package name */
        private C0045b f2205c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2206d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2207e;

        private static final class a extends C0045b {
            private a() {
            }
        }

        public b m() {
            this.f2206d = true;
            return this;
        }

        /* renamed from: Be.j$b$b, reason: collision with other inner class name */
        static class C0045b {

            /* renamed from: a, reason: collision with root package name */
            String f2208a;

            /* renamed from: b, reason: collision with root package name */
            Object f2209b;

            /* renamed from: c, reason: collision with root package name */
            C0045b f2210c;

            C0045b() {
            }
        }

        private b(String str) {
            C0045b c0045b = new C0045b();
            this.f2204b = c0045b;
            this.f2205c = c0045b;
            this.f2206d = false;
            this.f2207e = false;
            this.f2203a = (String) p.q(str);
        }

        private C0045b f() {
            C0045b c0045b = new C0045b();
            this.f2205c.f2210c = c0045b;
            this.f2205c = c0045b;
            return c0045b;
        }

        private a i() {
            a aVar = new a();
            this.f2205c.f2210c = aVar;
            this.f2205c = aVar;
            return aVar;
        }

        private static boolean l(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof m ? !((m) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r7 = this;
                boolean r0 = r7.f2206d
                boolean r1 = r7.f2207e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 32
                r2.<init>(r3)
                java.lang.String r3 = r7.f2203a
                r2.append(r3)
                r3 = 123(0x7b, float:1.72E-43)
                r2.append(r3)
                Be.j$b$b r3 = r7.f2204b
                Be.j$b$b r3 = r3.f2210c
                java.lang.String r4 = ""
            L1b:
                if (r3 == 0) goto L65
                java.lang.Object r5 = r3.f2209b
                boolean r6 = r3 instanceof Be.j.b.a
                if (r6 != 0) goto L30
                if (r5 != 0) goto L28
                if (r0 != 0) goto L62
                goto L30
            L28:
                if (r1 == 0) goto L30
                boolean r6 = l(r5)
                if (r6 != 0) goto L62
            L30:
                r2.append(r4)
                java.lang.String r4 = r3.f2208a
                if (r4 == 0) goto L3f
                r2.append(r4)
                r4 = 61
                r2.append(r4)
            L3f:
                if (r5 == 0) goto L5d
                java.lang.Class r4 = r5.getClass()
                boolean r4 = r4.isArray()
                if (r4 == 0) goto L5d
                java.lang.Object[] r4 = new java.lang.Object[]{r5}
                java.lang.String r4 = java.util.Arrays.deepToString(r4)
                int r5 = r4.length()
                r6 = 1
                int r5 = r5 - r6
                r2.append(r4, r6, r5)
                goto L60
            L5d:
                r2.append(r5)
            L60:
                java.lang.String r4 = ", "
            L62:
                Be.j$b$b r3 = r3.f2210c
                goto L1b
            L65:
                r0 = 125(0x7d, float:1.75E-43)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Be.j.b.toString():java.lang.String");
        }

        private b g(Object obj) {
            f().f2209b = obj;
            return this;
        }

        private b h(String str, Object obj) {
            C0045b c0045bF = f();
            c0045bF.f2209b = obj;
            c0045bF.f2208a = (String) p.q(str);
            return this;
        }

        private b j(String str, Object obj) {
            a aVarI = i();
            aVarI.f2209b = obj;
            aVarI.f2208a = (String) p.q(str);
            return this;
        }

        public b a(String str, double d10) {
            return j(str, String.valueOf(d10));
        }

        public b b(String str, int i10) {
            return j(str, String.valueOf(i10));
        }

        public b c(String str, long j10) {
            return j(str, String.valueOf(j10));
        }

        public b d(String str, Object obj) {
            return h(str, obj);
        }

        public b e(String str, boolean z10) {
            return j(str, String.valueOf(z10));
        }

        public b k(Object obj) {
            return g(obj);
        }
    }

    public static <T> T a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    public static b c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
