package X6;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39157a = new C0842a();

    /* renamed from: b, reason: collision with root package name */
    public static final a f39158b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final a f39159c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final a f39160d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final a f39161e = new e();

    /* renamed from: X6.a$a, reason: collision with other inner class name */
    class C0842a extends a {
        @Override // X6.a
        public boolean a() {
            return true;
        }

        @Override // X6.a
        public boolean b() {
            return true;
        }

        @Override // X6.a
        public boolean c(V6.a aVar) {
            return aVar == V6.a.REMOTE;
        }

        @Override // X6.a
        public boolean d(boolean z10, V6.a aVar, V6.c cVar) {
            return (aVar == V6.a.RESOURCE_DISK_CACHE || aVar == V6.a.MEMORY_CACHE) ? false : true;
        }

        C0842a() {
        }
    }

    class c extends a {
        @Override // X6.a
        public boolean a() {
            return true;
        }

        @Override // X6.a
        public boolean b() {
            return false;
        }

        @Override // X6.a
        public boolean d(boolean z10, V6.a aVar, V6.c cVar) {
            return false;
        }

        @Override // X6.a
        public boolean c(V6.a aVar) {
            return (aVar == V6.a.DATA_DISK_CACHE || aVar == V6.a.MEMORY_CACHE) ? false : true;
        }

        c() {
        }
    }

    class d extends a {
        @Override // X6.a
        public boolean a() {
            return false;
        }

        @Override // X6.a
        public boolean b() {
            return true;
        }

        @Override // X6.a
        public boolean c(V6.a aVar) {
            return false;
        }

        @Override // X6.a
        public boolean d(boolean z10, V6.a aVar, V6.c cVar) {
            return (aVar == V6.a.RESOURCE_DISK_CACHE || aVar == V6.a.MEMORY_CACHE) ? false : true;
        }

        d() {
        }
    }

    class e extends a {
        @Override // X6.a
        public boolean a() {
            return true;
        }

        @Override // X6.a
        public boolean b() {
            return true;
        }

        @Override // X6.a
        public boolean c(V6.a aVar) {
            return aVar == V6.a.REMOTE;
        }

        @Override // X6.a
        public boolean d(boolean z10, V6.a aVar, V6.c cVar) {
            return ((z10 && aVar == V6.a.DATA_DISK_CACHE) || aVar == V6.a.LOCAL) && cVar == V6.c.TRANSFORMED;
        }

        e() {
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(V6.a aVar);

    public abstract boolean d(boolean z10, V6.a aVar, V6.c cVar);

    class b extends a {
        @Override // X6.a
        public boolean a() {
            return false;
        }

        @Override // X6.a
        public boolean b() {
            return false;
        }

        @Override // X6.a
        public boolean c(V6.a aVar) {
            return false;
        }

        @Override // X6.a
        public boolean d(boolean z10, V6.a aVar, V6.c cVar) {
            return false;
        }

        b() {
        }
    }
}
