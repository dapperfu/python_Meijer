package Bu;

import kv.InterfaceC15323a;

/* loaded from: classes11.dex */
public final class e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15323a f3267a;

        a(InterfaceC15323a interfaceC15323a) {
            this.f3267a = interfaceC15323a;
        }

        @Override // kv.InterfaceC15323a
        public T get() {
            return (T) this.f3267a.get();
        }
    }

    public static <T> d<T> a(InterfaceC15323a<T> interfaceC15323a) {
        c.b(interfaceC15323a);
        if (interfaceC15323a instanceof d) {
            return (d) interfaceC15323a;
        }
        return new a(interfaceC15323a);
    }
}
