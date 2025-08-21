package tc;

import java.util.Set;
import rc.C16883c;
import rc.InterfaceC16888h;
import rc.InterfaceC16889i;
import rc.InterfaceC16890j;

/* loaded from: classes4.dex */
final class q implements InterfaceC16890j {

    /* renamed from: a, reason: collision with root package name */
    private final Set<C16883c> f162476a;

    /* renamed from: b, reason: collision with root package name */
    private final p f162477b;

    /* renamed from: c, reason: collision with root package name */
    private final t f162478c;

    @Override // rc.InterfaceC16890j
    public <T> InterfaceC16889i<T> a(String str, Class<T> cls, C16883c c16883c, InterfaceC16888h<T, byte[]> interfaceC16888h) {
        if (this.f162476a.contains(c16883c)) {
            return new s(this.f162477b, str, c16883c, interfaceC16888h, this.f162478c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c16883c, this.f162476a));
    }

    q(Set<C16883c> set, p pVar, t tVar) {
        this.f162476a = set;
        this.f162477b = pVar;
        this.f162478c = tVar;
    }
}
