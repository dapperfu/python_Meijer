package androidx.core.graphics;

import Z.n0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import b2.C6324e;
import c2.h;
import com.fullstory.FS;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import k2.g;

/* loaded from: classes.dex */
class b extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f54095b;

    /* renamed from: c, reason: collision with root package name */
    private static final Constructor<?> f54096c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f54097d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f54098e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            FS.log_e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f54096c = constructor;
        f54095b = cls;
        f54097d = method2;
        f54098e = method;
    }

    private static Typeface j(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(f54095b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f54098e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    private static Object l() {
        try {
            return f54096c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean i(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f54097d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static boolean k() {
        Method method = f54097d;
        if (method == null) {
            FS.log_w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    b() {
    }

    @Override // androidx.core.graphics.e
    public Typeface a(Context context, C6324e.c cVar, Resources resources, int i10) {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        for (C6324e.d dVar : cVar.a()) {
            ByteBuffer byteBufferB = h.b(context, resources, dVar.b());
            if (byteBufferB == null || !i(objL, byteBufferB, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return j(objL);
    }

    @Override // androidx.core.graphics.e
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        n0 n0Var = new n0();
        for (g.b bVar : bVarArr) {
            Uri uriD = bVar.d();
            ByteBuffer byteBufferF = (ByteBuffer) n0Var.get(uriD);
            if (byteBufferF == null) {
                byteBufferF = h.f(context, cancellationSignal, uriD);
                n0Var.put(uriD, byteBufferF);
            }
            if (byteBufferF == null || !i(objL, byteBufferF, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface typefaceJ = j(objL);
        if (typefaceJ == null) {
            return null;
        }
        return FS.typefaceCreateDerived(typefaceJ, i10);
    }
}
