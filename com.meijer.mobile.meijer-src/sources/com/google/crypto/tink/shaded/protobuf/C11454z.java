package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C11454z {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f89431a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f89432b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f89433c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f89434d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f89435e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC11438i f89436f;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$a */
    public interface a extends i<Boolean> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$b */
    public interface b extends i<Double> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$c */
    public interface c {
        int g();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$d */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$e */
    public interface e {
        boolean a(int i10);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$f */
    public interface f extends i<Float> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$g */
    public interface g extends i<Integer> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$h */
    public interface h extends i<Long> {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$i */
    public interface i<E> extends List<E>, RandomAccess {
        i<E> b(int i10);

        void d();

        boolean j();
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    static int h(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static {
        byte[] bArr = new byte[0];
        f89434d = bArr;
        f89435e = ByteBuffer.wrap(bArr);
        f89436f = AbstractC11438i.i(bArr);
    }

    static <T> T b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    static Object g(Object obj, Object obj2) {
        return ((Q) obj).b().L2((Q) obj2).h();
    }

    static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    static int e(byte[] bArr, int i10, int i11) {
        int iH = h(i11, bArr, i10, i11);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }
}
