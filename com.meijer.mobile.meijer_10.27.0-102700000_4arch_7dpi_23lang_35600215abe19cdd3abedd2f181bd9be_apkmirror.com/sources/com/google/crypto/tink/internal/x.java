package com.google.crypto.tink.internal;

import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final We.a f88234a = We.a.a(new byte[0]);

    public static final We.a a(int i10) {
        return We.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final We.a b(int i10) {
        return We.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
