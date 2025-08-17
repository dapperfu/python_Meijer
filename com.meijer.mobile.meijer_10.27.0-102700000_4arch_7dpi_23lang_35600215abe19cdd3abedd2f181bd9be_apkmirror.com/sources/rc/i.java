package rc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import rc.C16746b;

/* loaded from: classes4.dex */
public abstract class i {
    protected abstract Map<String, String> c();

    public abstract Integer d();

    public abstract h e();

    public abstract long f();

    public abstract byte[] g();

    public abstract byte[] h();

    public abstract Integer l();

    public abstract String m();

    public abstract String n();

    public abstract long o();

    public static abstract class a {
        public abstract i d();

        protected abstract Map<String, String> e();

        protected abstract a f(Map<String, String> map);

        public abstract a g(Integer num);

        public abstract a h(h hVar);

        public abstract a i(long j10);

        public abstract a j(byte[] bArr);

        public abstract a k(byte[] bArr);

        public abstract a l(Integer num);

        public abstract a m(String str);

        public abstract a n(String str);

        public abstract a o(long j10);

        public final a a(String str, int i10) {
            e().put(str, String.valueOf(i10));
            return this;
        }

        public final a b(String str, long j10) {
            e().put(str, String.valueOf(j10));
            return this;
        }

        public final a c(String str, String str2) {
            e().put(str, str2);
            return this;
        }
    }

    public static a a() {
        return new C16746b.C2445b().f(new HashMap());
    }

    public a p() {
        return new C16746b.C2445b().n(n()).g(d()).l(l()).m(m()).j(g()).k(h()).h(e()).i(f()).o(o()).f(new HashMap(c()));
    }

    public final String b(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int i(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long j(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> k() {
        return Collections.unmodifiableMap(c());
    }
}
