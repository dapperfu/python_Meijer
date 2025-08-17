package ef;

import java.util.Arrays;

/* renamed from: ef.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C13653d {

    /* renamed from: ef.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f128709a;

        /* renamed from: b, reason: collision with root package name */
        private final a f128710b;

        /* renamed from: c, reason: collision with root package name */
        private a f128711c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f128712d;

        /* renamed from: ef.d$b$a */
        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            String f128713a;

            /* renamed from: b, reason: collision with root package name */
            Object f128714b;

            /* renamed from: c, reason: collision with root package name */
            a f128715c;

            private a() {
            }
        }

        private b(String str) {
            a aVar = new a();
            this.f128710b = aVar;
            this.f128711c = aVar;
            this.f128712d = false;
            this.f128709a = (String) C13655f.h(str);
        }

        private a c() {
            a aVar = new a();
            this.f128711c.f128715c = aVar;
            this.f128711c = aVar;
            return aVar;
        }

        public String toString() {
            boolean z10 = this.f128712d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f128709a);
            sb2.append('{');
            String str = "";
            for (a aVar = this.f128710b.f128715c; aVar != null; aVar = aVar.f128715c) {
                Object obj = aVar.f128714b;
                if (!z10 || obj != null) {
                    sb2.append(str);
                    String str2 = aVar.f128713a;
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
            c().f128714b = obj;
            return this;
        }

        private b e(String str, Object obj) {
            a aVarC = c();
            aVarC.f128714b = obj;
            aVarC.f128713a = (String) C13655f.h(str);
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
