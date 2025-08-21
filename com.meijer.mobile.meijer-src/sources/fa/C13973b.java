package fa;

import k9.InterfaceC15112a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfa/a;", "b", "()Lfa/a;", "", "a", "()Z", "mobile-engage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: fa.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13973b {
    public static final boolean a() {
        return (InterfaceC13972a.INSTANCE.a() == null || InterfaceC15112a.INSTANCE.a() == null) ? false : true;
    }

    public static final InterfaceC13972a b() {
        InterfaceC13972a interfaceC13972aA = InterfaceC13972a.INSTANCE.a();
        if (interfaceC13972aA != null) {
            return interfaceC13972aA;
        }
        throw new IllegalStateException("DependencyContainer has to be setup first!");
    }
}
