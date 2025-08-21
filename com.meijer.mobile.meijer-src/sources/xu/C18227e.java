package xu;

import gv.InterfaceC14411a;

/* renamed from: xu.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18227e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: xu.e$a */
    class a<T> implements InterfaceC18226d<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC14411a f171031a;

        a(InterfaceC14411a interfaceC14411a) {
            this.f171031a = interfaceC14411a;
        }

        @Override // gv.InterfaceC14411a
        public T get() {
            return (T) this.f171031a.get();
        }
    }

    public static <T> InterfaceC18226d<T> a(InterfaceC14411a<T> interfaceC14411a) {
        C18225c.b(interfaceC14411a);
        if (interfaceC14411a instanceof InterfaceC18226d) {
            return (InterfaceC18226d) interfaceC14411a;
        }
        return new a(interfaceC14411a);
    }
}
