package Fu;

/* loaded from: classes8.dex */
public abstract class a {

    public static abstract class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f10935a = new Fu.b();

        b() {
            super();
        }

        public static b a() {
            return f10935a;
        }
    }

    public static abstract class c extends a {
        c() {
            super();
        }

        public abstract i b();

        public static c a(i iVar) {
            Eu.c.c(iVar, "bucketBoundaries");
            return new Fu.c(iVar);
        }
    }

    private a() {
    }
}
