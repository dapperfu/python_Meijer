package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import b2.C6184e;
import c2.h;
import com.fullstory.FS;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k2.g;

/* loaded from: classes.dex */
class a extends e {

    /* renamed from: b, reason: collision with root package name */
    private static Class<?> f53866b;

    /* renamed from: c, reason: collision with root package name */
    private static Constructor<?> f53867c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f53868d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f53869e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f53870f;

    private File k(ParcelFileDescriptor parcelFileDescriptor) throws ErrnoException {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // androidx.core.graphics.e
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) throws IOException {
        Typeface typefaceD;
        if (bVarArr.length < 1) {
            return null;
        }
        g.b bVarH = h(bVarArr, i10);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarH.d(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                File fileK = k(parcelFileDescriptorOpenFileDescriptor);
                if (fileK == null || !fileK.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceD = super.d(context, fileInputStream);
                        fileInputStream.close();
                    } finally {
                    }
                } else {
                    typefaceD = Typeface.createFromFile(fileK);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceD;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private static void l() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f53870f) {
            return;
        }
        f53870f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            FS.log_e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f53867c = constructor;
        f53866b = cls;
        f53868d = method2;
        f53869e = method;
    }

    a() {
    }

    private static boolean i(Object obj, String str, int i10, boolean z10) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        l();
        try {
            return ((Boolean) f53868d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface j(Object obj) throws NoSuchMethodException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        l();
        try {
            Object objNewInstance = Array.newInstance(f53866b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f53869e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Object m() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        l();
        try {
            return f53867c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.e
    public Typeface a(Context context, C6184e.c cVar, Resources resources, int i10) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Object objM = m();
        for (C6184e.d dVar : cVar.a()) {
            File fileE = h.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!h.c(fileE, resources, dVar.b())) {
                    return null;
                }
                if (!i(objM, fileE.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                fileE.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return j(objM);
    }
}
