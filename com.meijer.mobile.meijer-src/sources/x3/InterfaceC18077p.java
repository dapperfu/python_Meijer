package x3;

import java.io.IOException;
import java.util.List;

/* renamed from: x3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC18077p {
    void a(long j10, long j11);

    int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException;

    void c(r rVar);

    default InterfaceC18077p e() {
        return this;
    }

    boolean j(InterfaceC18078q interfaceC18078q) throws IOException;

    void release();

    default List<N> i() {
        return Ee.L.x();
    }
}
