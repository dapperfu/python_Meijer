package Ju;

/* loaded from: classes7.dex */
public abstract class a {

    public static abstract class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f16136a = new Ju.b();

        b() {
            super();
        }

        public static b a() {
            return f16136a;
        }
    }

    public static abstract class c extends a {
        c() {
            super();
        }

        public abstract i b();

        public static c a(i iVar) {
            Iu.c.c(iVar, "bucketBoundaries");
            return new Ju.c(iVar);
        }
    }

    private a() {
    }
}
