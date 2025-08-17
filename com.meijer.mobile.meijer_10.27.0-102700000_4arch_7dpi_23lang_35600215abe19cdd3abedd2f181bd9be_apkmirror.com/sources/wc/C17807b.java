package wc;

/* renamed from: wc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17807b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i10, TInput tinput, InterfaceC17806a<TInput, TResult, TException> interfaceC17806a, InterfaceC17808c<TInput, TResult> interfaceC17808c) throws Throwable {
        TResult tresultApply;
        if (i10 < 1) {
            return interfaceC17806a.apply(tinput);
        }
        do {
            tresultApply = interfaceC17806a.apply(tinput);
            tinput = interfaceC17808c.a(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return tresultApply;
    }
}
