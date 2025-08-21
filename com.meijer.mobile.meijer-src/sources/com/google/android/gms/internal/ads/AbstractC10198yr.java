package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.yr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10198yr {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f81138a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f81139b = new AtomicInteger(0);

    protected static AtomicInteger u() {
        return f81138a;
    }

    protected static AtomicInteger v() {
        return f81139b;
    }

    public abstract void A(int i10);

    public abstract void B(int i10);

    public abstract void C(InterfaceC10091xr interfaceC10091xr);

    public abstract void D(int i10);

    public abstract void E(int i10);

    public abstract void F(boolean z10);

    public abstract void G(Integer num);

    public abstract void H(boolean z10);

    public abstract void I(int i10);

    public abstract void J(Surface surface, boolean z10) throws IOException;

    public abstract void K(float f10, boolean z10) throws IOException;

    public abstract void L();

    public abstract boolean M();

    public abstract int N();

    public abstract int P();

    public abstract long R();

    public abstract long S();

    public abstract long T();

    public abstract long U();

    public abstract long V();

    public abstract long r();

    public abstract long s();

    public abstract Integer t();

    public abstract void w(Uri[] uriArr, String str);

    public abstract void x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10);

    public abstract void y();

    public abstract void z(long j10);

    public static int O() {
        return f81138a.get();
    }

    public static int Q() {
        return f81139b.get();
    }
}
