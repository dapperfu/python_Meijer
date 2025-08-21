package com.google.crypto.tink.internal;

import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Ye.a f89074a = Ye.a.a(new byte[0]);

    public static final Ye.a a(int i10) {
        return Ye.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final Ye.a b(int i10) {
        return Ye.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
