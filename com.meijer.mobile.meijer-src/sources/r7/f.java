package r7;

/* loaded from: classes4.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        private volatile T f159414a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f159415b;

        a(b bVar) {
            this.f159415b = bVar;
        }

        @Override // r7.f.b
        public T get() {
            if (this.f159414a == null) {
                synchronized (this) {
                    try {
                        if (this.f159414a == null) {
                            this.f159414a = (T) k.d(this.f159415b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f159414a;
        }
    }

    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
