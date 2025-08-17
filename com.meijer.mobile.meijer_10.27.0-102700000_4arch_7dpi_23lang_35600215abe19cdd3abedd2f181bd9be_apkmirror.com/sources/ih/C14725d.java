package ih;

import ih.InterfaceC14722a;

/* renamed from: ih.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C14725d implements InterfaceC14722a {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC14722a f137766a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC14723b f137767b;

    /* renamed from: ih.d$a */
    private class a implements InterfaceC14722a.InterfaceC2175a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC14722a.InterfaceC2175a f137768a;

        public a(InterfaceC14722a.InterfaceC2175a interfaceC2175a) {
            this.f137768a = interfaceC2175a;
        }

        @Override // ih.InterfaceC14722a.InterfaceC2175a
        public boolean d(EnumC14723b enumC14723b) {
            return C14725d.this.f137767b.compareTo(enumC14723b) <= 0 && this.f137768a.d(enumC14723b);
        }

        @Override // ih.InterfaceC14722a.InterfaceC2175a
        public void a(EnumC14723b enumC14723b, String str, Object obj, Object obj2) {
            if (d(enumC14723b)) {
                this.f137768a.a(enumC14723b, str, obj, obj2);
            }
        }

        @Override // ih.InterfaceC14722a.InterfaceC2175a
        public void b(EnumC14723b enumC14723b, String str, Object... objArr) {
            if (d(enumC14723b)) {
                this.f137768a.b(enumC14723b, str, objArr);
            }
        }

        @Override // ih.InterfaceC14722a.InterfaceC2175a
        public void c(EnumC14723b enumC14723b, String str, Object obj) {
            if (d(enumC14723b)) {
                this.f137768a.c(enumC14723b, str, obj);
            }
        }

        @Override // ih.InterfaceC14722a.InterfaceC2175a
        public void e(EnumC14723b enumC14723b, Object obj) {
            if (d(enumC14723b)) {
                this.f137768a.e(enumC14723b, obj);
            }
        }
    }

    @Override // ih.InterfaceC14722a
    public InterfaceC14722a.InterfaceC2175a a(String str) {
        return new a(this.f137766a.a(str));
    }

    public C14725d(InterfaceC14722a interfaceC14722a, EnumC14723b enumC14723b) {
        this.f137766a = interfaceC14722a;
        this.f137767b = enumC14723b == null ? EnumC14723b.DEBUG : enumC14723b;
    }
}
