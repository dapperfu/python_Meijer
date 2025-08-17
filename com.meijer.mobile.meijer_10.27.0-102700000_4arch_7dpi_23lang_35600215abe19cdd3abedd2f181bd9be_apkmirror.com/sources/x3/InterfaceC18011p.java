package x3;

import java.io.IOException;
import java.util.List;

/* renamed from: x3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC18011p {
    void a(long j10, long j11);

    int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException;

    void c(r rVar);

    default InterfaceC18011p e() {
        return this;
    }

    boolean j(InterfaceC18012q interfaceC18012q) throws IOException;

    void release();

    default List<N> i() {
        return Ce.L.x();
    }
}
