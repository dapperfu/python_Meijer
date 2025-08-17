package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C11538y {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f90756a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f90757b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f90758c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f90759d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f90760e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC11522h f90761f;

    /* renamed from: com.google.protobuf.y$a */
    public interface a extends i<Boolean> {
    }

    /* renamed from: com.google.protobuf.y$b */
    public interface b extends i<Double> {
    }

    /* renamed from: com.google.protobuf.y$c */
    public interface c {
        int g();
    }

    /* renamed from: com.google.protobuf.y$d */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* renamed from: com.google.protobuf.y$e */
    public interface e {
        boolean a(int i10);
    }

    /* renamed from: com.google.protobuf.y$f */
    public interface f extends i<Float> {
    }

    /* renamed from: com.google.protobuf.y$g */
    public interface g extends i<Integer> {
        @Override // com.google.protobuf.C11538y.i
        i<Integer> b(int i10);

        void c2(int i10);

        int getInt(int i10);
    }

    /* renamed from: com.google.protobuf.y$h */
    public interface h extends i<Long> {
    }

    /* renamed from: com.google.protobuf.y$i */
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

    static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static {
        byte[] bArr = new byte[0];
        f90759d = bArr;
        f90760e = ByteBuffer.wrap(bArr);
        f90761f = AbstractC11522h.g(bArr);
    }

    static <T> T b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    static Object h(Object obj, Object obj2) {
        return ((P) obj).b().W0((P) obj2).h();
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f90757b);
    }

    static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static boolean g(byte[] bArr) {
        return q0.m(bArr);
    }
}
