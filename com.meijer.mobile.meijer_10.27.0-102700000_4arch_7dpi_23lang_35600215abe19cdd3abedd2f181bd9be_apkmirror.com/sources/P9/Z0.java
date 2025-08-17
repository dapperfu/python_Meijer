package P9;

import da.InterfaceC13499a;
import i9.InterfaceC14709a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LP9/Y0;", "a", "()LP9/Y0;", "emarsysComponent", "", "c", "(LP9/Y0;)V", "", "b", "()Z", "emarsys-sdk_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Z0 {
    public static final Y0 a() {
        Y0 y0A = Y0.INSTANCE.a();
        if (y0A != null) {
            return y0A;
        }
        throw new IllegalStateException("DependencyContainer has to be setup first!");
    }

    public static final boolean b() {
        return (Y0.INSTANCE.a() == null || InterfaceC13499a.INSTANCE.a() == null || Ha.a.INSTANCE.a() == null || InterfaceC14709a.INSTANCE.a() == null) ? false : true;
    }

    public static final void c(Y0 emarsysComponent) {
        Intrinsics.j(emarsysComponent, "emarsysComponent");
        Y0.INSTANCE.b(emarsysComponent);
        InterfaceC13499a.INSTANCE.b(emarsysComponent);
        Ha.a.INSTANCE.b(emarsysComponent);
        InterfaceC14709a.INSTANCE.c(emarsysComponent);
    }
}
