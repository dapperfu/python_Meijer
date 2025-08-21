package jh;

import jh.InterfaceC15032a;

/* renamed from: jh.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C15035d implements InterfaceC15032a {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC15032a f140652a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC15033b f140653b;

    /* renamed from: jh.d$a */
    private class a implements InterfaceC15032a.InterfaceC2226a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC15032a.InterfaceC2226a f140654a;

        public a(InterfaceC15032a.InterfaceC2226a interfaceC2226a) {
            this.f140654a = interfaceC2226a;
        }

        @Override // jh.InterfaceC15032a.InterfaceC2226a
        public boolean a(EnumC15033b enumC15033b) {
            return C15035d.this.f140653b.compareTo(enumC15033b) <= 0 && this.f140654a.a(enumC15033b);
        }

        @Override // jh.InterfaceC15032a.InterfaceC2226a
        public void b(EnumC15033b enumC15033b, String str, Object obj) {
            if (a(enumC15033b)) {
                this.f140654a.b(enumC15033b, str, obj);
            }
        }

        @Override // jh.InterfaceC15032a.InterfaceC2226a
        public void c(EnumC15033b enumC15033b, String str, Object... objArr) {
            if (a(enumC15033b)) {
                this.f140654a.c(enumC15033b, str, objArr);
            }
        }

        @Override // jh.InterfaceC15032a.InterfaceC2226a
        public void d(EnumC15033b enumC15033b, String str, Object obj, Object obj2) {
            if (a(enumC15033b)) {
                this.f140654a.d(enumC15033b, str, obj, obj2);
            }
        }

        @Override // jh.InterfaceC15032a.InterfaceC2226a
        public void e(EnumC15033b enumC15033b, Object obj) {
            if (a(enumC15033b)) {
                this.f140654a.e(enumC15033b, obj);
            }
        }
    }

    @Override // jh.InterfaceC15032a
    public InterfaceC15032a.InterfaceC2226a a(String str) {
        return new a(this.f140652a.a(str));
    }

    public C15035d(InterfaceC15032a interfaceC15032a, EnumC15033b enumC15033b) {
        this.f140652a = interfaceC15032a;
        this.f140653b = enumC15033b == null ? EnumC15033b.DEBUG : enumC15033b;
    }
}
