package s7;

/* loaded from: classes4.dex */
public abstract class c {

    private static class b extends c {

        /* renamed from: a, reason: collision with root package name */
        private volatile boolean f160071a;

        b() {
            super();
        }

        @Override // s7.c
        public void b(boolean z10) {
            this.f160071a = z10;
        }

        @Override // s7.c
        public void c() {
            if (this.f160071a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    abstract void b(boolean z10);

    public abstract void c();

    private c() {
    }

    public static c a() {
        return new b();
    }
}
