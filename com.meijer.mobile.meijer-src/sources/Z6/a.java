package Z6;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f43635a = new C0927a();

    /* renamed from: b, reason: collision with root package name */
    public static final a f43636b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final a f43637c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final a f43638d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final a f43639e = new e();

    /* renamed from: Z6.a$a, reason: collision with other inner class name */
    class C0927a extends a {
        @Override // Z6.a
        public boolean a() {
            return true;
        }

        @Override // Z6.a
        public boolean b() {
            return true;
        }

        @Override // Z6.a
        public boolean c(X6.a aVar) {
            return aVar == X6.a.REMOTE;
        }

        @Override // Z6.a
        public boolean d(boolean z10, X6.a aVar, X6.c cVar) {
            return (aVar == X6.a.RESOURCE_DISK_CACHE || aVar == X6.a.MEMORY_CACHE) ? false : true;
        }

        C0927a() {
        }
    }

    class c extends a {
        @Override // Z6.a
        public boolean a() {
            return true;
        }

        @Override // Z6.a
        public boolean b() {
            return false;
        }

        @Override // Z6.a
        public boolean d(boolean z10, X6.a aVar, X6.c cVar) {
            return false;
        }

        @Override // Z6.a
        public boolean c(X6.a aVar) {
            return (aVar == X6.a.DATA_DISK_CACHE || aVar == X6.a.MEMORY_CACHE) ? false : true;
        }

        c() {
        }
    }

    class d extends a {
        @Override // Z6.a
        public boolean a() {
            return false;
        }

        @Override // Z6.a
        public boolean b() {
            return true;
        }

        @Override // Z6.a
        public boolean c(X6.a aVar) {
            return false;
        }

        @Override // Z6.a
        public boolean d(boolean z10, X6.a aVar, X6.c cVar) {
            return (aVar == X6.a.RESOURCE_DISK_CACHE || aVar == X6.a.MEMORY_CACHE) ? false : true;
        }

        d() {
        }
    }

    class e extends a {
        @Override // Z6.a
        public boolean a() {
            return true;
        }

        @Override // Z6.a
        public boolean b() {
            return true;
        }

        @Override // Z6.a
        public boolean c(X6.a aVar) {
            return aVar == X6.a.REMOTE;
        }

        @Override // Z6.a
        public boolean d(boolean z10, X6.a aVar, X6.c cVar) {
            return ((z10 && aVar == X6.a.DATA_DISK_CACHE) || aVar == X6.a.LOCAL) && cVar == X6.c.TRANSFORMED;
        }

        e() {
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(X6.a aVar);

    public abstract boolean d(boolean z10, X6.a aVar, X6.c cVar);

    class b extends a {
        @Override // Z6.a
        public boolean a() {
            return false;
        }

        @Override // Z6.a
        public boolean b() {
            return false;
        }

        @Override // Z6.a
        public boolean c(X6.a aVar) {
            return false;
        }

        @Override // Z6.a
        public boolean d(boolean z10, X6.a aVar, X6.c cVar) {
            return false;
        }

        b() {
        }
    }
}
