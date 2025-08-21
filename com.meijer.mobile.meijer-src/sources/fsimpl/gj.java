package fsimpl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes15.dex */
public final class gj extends gi {

    /* renamed from: a, reason: collision with root package name */
    public static final gj f133594a = new gj();

    @Override // fsimpl.gi
    public ByteBuffer a(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }
}
