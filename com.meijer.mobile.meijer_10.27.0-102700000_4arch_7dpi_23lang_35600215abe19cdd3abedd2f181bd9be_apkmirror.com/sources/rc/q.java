package rc;

import java.util.Set;
import pc.C16279c;
import pc.InterfaceC16284h;
import pc.InterfaceC16285i;
import pc.InterfaceC16286j;

/* loaded from: classes4.dex */
final class q implements InterfaceC16286j {

    /* renamed from: a, reason: collision with root package name */
    private final Set<C16279c> f157986a;

    /* renamed from: b, reason: collision with root package name */
    private final p f157987b;

    /* renamed from: c, reason: collision with root package name */
    private final t f157988c;

    @Override // pc.InterfaceC16286j
    public <T> InterfaceC16285i<T> a(String str, Class<T> cls, C16279c c16279c, InterfaceC16284h<T, byte[]> interfaceC16284h) {
        if (this.f157986a.contains(c16279c)) {
            return new s(this.f157987b, str, c16279c, interfaceC16284h, this.f157988c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c16279c, this.f157986a));
    }

    q(Set<C16279c> set, p pVar, t tVar) {
        this.f157986a = set;
        this.f157987b = pVar;
        this.f157988c = tVar;
    }
}
