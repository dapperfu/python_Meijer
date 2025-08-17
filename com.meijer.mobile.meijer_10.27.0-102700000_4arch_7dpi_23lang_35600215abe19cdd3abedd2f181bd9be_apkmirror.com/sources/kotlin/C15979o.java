package kotlin;

import kotlin.EnumC13827z;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lo0/n;", "", "a", "(Lo0/n;)I", "mainAxisViewportSize", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15979o {
    public static final int a(InterfaceC15978n interfaceC15978n) {
        long jA;
        if (interfaceC15978n.getOrientation() == EnumC13827z.f130585a) {
            jA = interfaceC15978n.a() & 4294967295L;
        } else {
            jA = interfaceC15978n.a() >> 32;
        }
        return (int) jA;
    }
}
