package gf;

import java.util.Arrays;

/* renamed from: gf.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C14357d {

    /* renamed from: gf.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f134177a;

        /* renamed from: b, reason: collision with root package name */
        private final a f134178b;

        /* renamed from: c, reason: collision with root package name */
        private a f134179c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f134180d;

        /* renamed from: gf.d$b$a */
        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            String f134181a;

            /* renamed from: b, reason: collision with root package name */
            Object f134182b;

            /* renamed from: c, reason: collision with root package name */
            a f134183c;

            private a() {
            }
        }

        private b(String str) {
            a aVar = new a();
            this.f134178b = aVar;
            this.f134179c = aVar;
            this.f134180d = false;
            this.f134177a = (String) C14359f.h(str);
        }

        private a c() {
            a aVar = new a();
            this.f134179c.f134183c = aVar;
            this.f134179c = aVar;
            return aVar;
        }

        public String toString() {
            boolean z10 = this.f134180d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f134177a);
            sb2.append('{');
            String str = "";
            for (a aVar = this.f134178b.f134183c; aVar != null; aVar = aVar.f134183c) {
                Object obj = aVar.f134182b;
                if (!z10 || obj != null) {
                    sb2.append(str);
                    String str2 = aVar.f134181a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        private b d(Object obj) {
            c().f134182b = obj;
            return this;
        }

        private b e(String str, Object obj) {
            a aVarC = c();
            aVarC.f134182b = obj;
            aVarC.f134181a = (String) C14359f.h(str);
            return this;
        }

        public b a(String str, int i10) {
            return e(str, String.valueOf(i10));
        }

        public b b(String str, Object obj) {
            return e(str, obj);
        }

        public b f(Object obj) {
            return d(obj);
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

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
