package p7;

/* loaded from: classes4.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        private volatile T f155657a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f155658b;

        a(b bVar) {
            this.f155658b = bVar;
        }

        @Override // p7.f.b
        public T get() {
            if (this.f155657a == null) {
                synchronized (this) {
                    try {
                        if (this.f155657a == null) {
                            this.f155657a = (T) k.d(this.f155658b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f155657a;
        }
    }

    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
