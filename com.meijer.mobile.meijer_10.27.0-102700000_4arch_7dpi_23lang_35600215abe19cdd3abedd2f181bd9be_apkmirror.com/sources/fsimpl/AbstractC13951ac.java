package fsimpl;

/* renamed from: fsimpl.ac, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
abstract class AbstractC13951ac {
    AbstractC13951ac() {
    }

    static AbstractC13951ac a(C14013ck c14013ck) {
        return c14013ck.S() ? new C13953ae() : new C13954af();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EnumC13955ag b(C14127y c14127y) {
        return c14127y.a() ? EnumC13955ag.Masked : c14127y.b() ? EnumC13955ag.Unmasked : EnumC13955ag.Unknown;
    }

    abstract void a(Object obj, aK aKVar, EnumC13955ag enumC13955ag, dQ dQVar);

    abstract void a(Object obj, aK aKVar, EnumC13955ag enumC13955ag, Object obj2);

    abstract void a(Object obj, aK aKVar, EnumC13955ag enumC13955ag, String str);

    abstract void a(Object obj, aK aKVar, C14127y c14127y, dQ dQVar);

    abstract void a(Object obj, aK aKVar, C14127y c14127y, Object obj2);

    abstract void a(Object obj, aK aKVar, C14127y c14127y, String str);
}
