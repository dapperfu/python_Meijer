package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import b2.C6184e;
import c2.h;
import com.fullstory.FS;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import k2.g;

/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: g, reason: collision with root package name */
    protected final Class<?> f53875g;

    /* renamed from: h, reason: collision with root package name */
    protected final Constructor<?> f53876h;

    /* renamed from: i, reason: collision with root package name */
    protected final Method f53877i;

    /* renamed from: j, reason: collision with root package name */
    protected final Method f53878j;

    /* renamed from: k, reason: collision with root package name */
    protected final Method f53879k;

    /* renamed from: l, reason: collision with root package name */
    protected final Method f53880l;

    /* renamed from: m, reason: collision with root package name */
    protected final Method f53881m;

    private Object m() {
        try {
            return this.f53876h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private boolean o(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f53877i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // androidx.core.graphics.a, androidx.core.graphics.e
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceJ;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (r()) {
            Map<Uri, ByteBuffer> mapH = h.h(context, bVarArr, cancellationSignal);
            Object objM = m();
            if (objM == null) {
                return null;
            }
            int length = bVarArr.length;
            int i11 = 0;
            boolean z10 = false;
            while (i11 < length) {
                g.b bVar = bVarArr[i11];
                ByteBuffer byteBuffer = mapH.get(bVar.d());
                if (byteBuffer == null) {
                    obj = objM;
                } else {
                    boolean zP = p(objM, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0);
                    obj = objM;
                    if (!zP) {
                        n(obj);
                        return null;
                    }
                    z10 = true;
                }
                i11++;
                objM = obj;
                z10 = z10;
            }
            Object obj2 = objM;
            if (!z10) {
                n(obj2);
                return null;
            }
            if (q(obj2) && (typefaceJ = j(obj2)) != null) {
                return FS.typefaceCreateDerived(typefaceJ, i10);
            }
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
                Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarH.e()).setItalic(bVarH.f()).build();
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceBuild;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    protected Typeface j(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.f53875g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f53881m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method v(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Constructor<?> x(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(null);
    }

    private void n(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f53880l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean p(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f53878j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q(Object obj) {
        try {
            return ((Boolean) this.f53879k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean r() {
        if (this.f53877i == null) {
            FS.log_w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f53877i != null;
    }

    protected Method s(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", null);
    }

    protected Method t(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    protected Method u(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Class<?> w() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Method y(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", null);
    }

    public c() {
        Class<?> clsW;
        Constructor<?> constructorX;
        Method methodT;
        Method methodU;
        Method methodY;
        Method methodS;
        Method methodV;
        try {
            clsW = w();
            constructorX = x(clsW);
            methodT = t(clsW);
            methodU = u(clsW);
            methodY = y(clsW);
            methodS = s(clsW);
            methodV = v(clsW);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            FS.log_e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            clsW = null;
            constructorX = null;
            methodT = null;
            methodU = null;
            methodY = null;
            methodS = null;
            methodV = null;
        }
        this.f53875g = clsW;
        this.f53876h = constructorX;
        this.f53877i = methodT;
        this.f53878j = methodU;
        this.f53879k = methodY;
        this.f53880l = methodS;
        this.f53881m = methodV;
    }

    @Override // androidx.core.graphics.a, androidx.core.graphics.e
    public Typeface a(Context context, C6184e.c cVar, Resources resources, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!r()) {
            return super.a(context, cVar, resources, i10);
        }
        Object objM = m();
        if (objM == null) {
            return null;
        }
        C6184e.d[] dVarArrA = cVar.a();
        int length = dVarArrA.length;
        int i11 = 0;
        while (i11 < length) {
            C6184e.d dVar = dVarArrA[i11];
            Context context2 = context;
            if (!o(context2, objM, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                n(objM);
                return null;
            }
            i11++;
            context = context2;
        }
        if (!q(objM)) {
            return null;
        }
        return j(objM);
    }

    @Override // androidx.core.graphics.e
    public /* bridge */ /* synthetic */ Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        return super.c(context, cancellationSignal, list, i10);
    }

    @Override // androidx.core.graphics.e
    public Typeface e(Context context, Resources resources, int i10, String str, int i11) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!r()) {
            return super.e(context, resources, i10, str, i11);
        }
        Object objM = m();
        if (objM == null) {
            return null;
        }
        if (!o(context, objM, str, 0, -1, -1, null)) {
            n(objM);
            return null;
        }
        if (!q(objM)) {
            return null;
        }
        return j(objM);
    }
}
