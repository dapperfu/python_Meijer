package fsimpl;

/* renamed from: fsimpl.ac, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
abstract class AbstractC14076ac {
    AbstractC14076ac() {
    }

    static AbstractC14076ac a(C14138ck c14138ck) {
        return c14138ck.S() ? new C14078ae() : new C14079af();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EnumC14080ag b(C14252y c14252y) {
        return c14252y.a() ? EnumC14080ag.Masked : c14252y.b() ? EnumC14080ag.Unmasked : EnumC14080ag.Unknown;
    }

    abstract void a(Object obj, aK aKVar, EnumC14080ag enumC14080ag, dQ dQVar);

    abstract void a(Object obj, aK aKVar, EnumC14080ag enumC14080ag, Object obj2);

    abstract void a(Object obj, aK aKVar, EnumC14080ag enumC14080ag, String str);

    abstract void a(Object obj, aK aKVar, C14252y c14252y, dQ dQVar);

    abstract void a(Object obj, aK aKVar, C14252y c14252y, Object obj2);

    abstract void a(Object obj, aK aKVar, C14252y c14252y, String str);
}
