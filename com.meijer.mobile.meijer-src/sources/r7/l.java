package r7;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.fullstory.FS;
import d7.m;
import fsimpl.C14170dq;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import o7.AbstractC16076a;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f159427a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f159428b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    private static volatile Handler f159429c;

    private static String e(byte[] bArr, char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f159427a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & C14170dq.MULTIPLY];
        }
        return new String(cArr);
    }

    public static int g(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * i(config);
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f159430a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f159430a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f159430a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f159430a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f159430a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f159430a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static boolean b(AbstractC16076a<?> abstractC16076a, AbstractC16076a<?> abstractC16076a2) {
        return abstractC16076a == null ? abstractC16076a2 == null : abstractC16076a.F(abstractC16076a2);
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj instanceof m ? ((m) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static <T> Queue<T> f(int i10) {
        return new ArrayDeque(i10);
    }

    public static int i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f159430a[config.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2 && i10 != 3) {
                return i10 != 4 ? 4 : 8;
            }
        }
        return i11;
    }

    public static <T> List<T> j(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t10 : collection) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    private static Handler k() {
        if (f159429c == null) {
            synchronized (l.class) {
                try {
                    if (f159429c == null) {
                        f159429c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f159429c;
    }

    public static int l(float f10) {
        return m(f10, 17);
    }

    public static int n(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static int o(Object obj, int i10) {
        return n(obj == null ? 0 : obj.hashCode(), i10);
    }

    public static boolean s(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    public static String w(byte[] bArr) {
        String strE;
        char[] cArr = f159428b;
        synchronized (cArr) {
            strE = e(bArr, cArr);
        }
        return strE;
    }

    private l() {
    }

    public static void a() {
        if (r()) {
        } else {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    @TargetApi(19)
    public static int h(Bitmap bitmap) {
        if (!FS.bitmap_isRecycled(bitmap)) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int m(float f10, int i10) {
        return n(Float.floatToIntBits(f10), i10);
    }

    public static int p(boolean z10, int i10) {
        return n(z10 ? 1 : 0, i10);
    }

    public static boolean q() {
        return !r();
    }

    public static boolean r() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static boolean t(int i10, int i11) {
        if (s(i10) && s(i11)) {
            return true;
        }
        return false;
    }

    public static void u(Runnable runnable) {
        k().post(runnable);
    }

    public static void v(Runnable runnable) {
        k().removeCallbacks(runnable);
    }
}
