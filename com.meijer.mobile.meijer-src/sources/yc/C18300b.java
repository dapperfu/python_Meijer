package yc;

/* renamed from: yc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18300b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i10, TInput tinput, InterfaceC18299a<TInput, TResult, TException> interfaceC18299a, InterfaceC18301c<TInput, TResult> interfaceC18301c) throws Throwable {
        TResult tresultApply;
        if (i10 < 1) {
            return interfaceC18299a.apply(tinput);
        }
        do {
            tresultApply = interfaceC18299a.apply(tinput);
            tinput = interfaceC18301c.a(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return tresultApply;
    }
}
