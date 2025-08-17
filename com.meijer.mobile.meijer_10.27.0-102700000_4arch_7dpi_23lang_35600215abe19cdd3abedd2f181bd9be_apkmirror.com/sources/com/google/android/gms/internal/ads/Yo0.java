package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class Yo0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Et0 f71613a = Et0.b(new byte[0]);

    public static final Et0 a(int i10) {
        return Et0.b(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final Et0 b(int i10) {
        return Et0.b(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
