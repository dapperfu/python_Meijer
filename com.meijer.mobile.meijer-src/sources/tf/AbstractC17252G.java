package tf;

/* renamed from: tf.G, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC17252G {

    /* renamed from: tf.G$a */
    public static abstract class a {
        public abstract String a();

        public abstract int c();

        public abstract nf.f d();

        public abstract String e();

        public abstract String f();

        public abstract String g();

        public static a b(String str, String str2, String str3, String str4, int i10, nf.f fVar) {
            return new C17248C(str, str2, str3, str4, i10, fVar);
        }
    }

    /* renamed from: tf.G$b */
    public static abstract class b {
        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();

        public static b c(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
            return new C17249D(i10, str, i11, j10, j11, z10, i12, str2, str3);
        }
    }

    /* renamed from: tf.G$c */
    public static abstract class c {
        public abstract boolean b();

        public abstract String c();

        public abstract String d();

        public static c a(String str, String str2, boolean z10) {
            return new C17250E(str, str2, z10);
        }
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();

    public static AbstractC17252G b(a aVar, c cVar, b bVar) {
        return new C17247B(aVar, cVar, bVar);
    }
}
