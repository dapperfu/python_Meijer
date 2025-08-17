package da;

import i9.InterfaceC14709a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lda/a;", "b", "()Lda/a;", "", "a", "()Z", "mobile-engage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: da.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13500b {
    public static final boolean a() {
        return (InterfaceC13499a.INSTANCE.a() == null || InterfaceC14709a.INSTANCE.a() == null) ? false : true;
    }

    public static final InterfaceC13499a b() {
        InterfaceC13499a interfaceC13499aA = InterfaceC13499a.INSTANCE.a();
        if (interfaceC13499aA != null) {
            return interfaceC13499aA;
        }
        throw new IllegalStateException("DependencyContainer has to be setup first!");
    }
}
