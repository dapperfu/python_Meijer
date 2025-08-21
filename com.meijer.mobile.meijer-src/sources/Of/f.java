package Of;

import Of.b;

/* loaded from: classes8.dex */
public abstract class f {

    public static abstract class a {
        public abstract f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j10);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();

    public static a a() {
        return new b.C0382b().d(0L);
    }
}
