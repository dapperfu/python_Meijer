package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6100y {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f54705a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f54706b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f54707c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f54708d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f54709e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC6084h f54710f;

    /* renamed from: androidx.datastore.preferences.protobuf.y$a */
    public interface a extends i<Boolean> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$b */
    public interface b extends i<Double> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$c */
    public interface c {
        int g();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$d */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$e */
    public interface e {
        boolean a(int i10);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$f */
    public interface f extends i<Float> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$g */
    public interface g extends i<Integer> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$h */
    public interface h extends i<Long> {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$i */
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
        f54708d = bArr;
        f54709e = ByteBuffer.wrap(bArr);
        f54710f = AbstractC6084h.i(bArr);
    }

    static <T> T b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    static Object g(Object obj, Object obj2) {
        return ((P) obj).b().T((P) obj2).h();
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
