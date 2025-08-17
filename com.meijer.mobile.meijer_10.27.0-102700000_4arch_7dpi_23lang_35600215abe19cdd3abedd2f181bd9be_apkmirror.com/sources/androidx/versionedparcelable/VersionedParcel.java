package androidx.versionedparcelable;

import Z.C5503a;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class VersionedParcel {

    /* renamed from: a, reason: collision with root package name */
    protected final C5503a<String, Method> f58911a;

    /* renamed from: b, reason: collision with root package name */
    protected final C5503a<String, Method> f58912b;

    /* renamed from: c, reason: collision with root package name */
    protected final C5503a<String, Class> f58913c;

    public static class ParcelException extends RuntimeException {
    }

    protected abstract void A(byte[] bArr);

    protected abstract void C(CharSequence charSequence);

    protected abstract void E(int i10);

    protected abstract void G(Parcelable parcelable);

    protected abstract void I(String str);

    protected abstract void a();

    protected abstract VersionedParcel b();

    public boolean f() {
        return false;
    }

    protected abstract boolean g();

    protected abstract byte[] i();

    protected abstract CharSequence k();

    protected abstract boolean m(int i10);

    protected abstract int o();

    protected abstract <T extends Parcelable> T q();

    protected abstract String s();

    protected abstract void w(int i10);

    public void x(boolean z10, boolean z11) {
    }

    protected abstract void y(boolean z10);

    private Class c(Class<? extends I4.a> cls) throws ClassNotFoundException {
        Class cls2 = this.f58913c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f58913c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        Method method = this.f58911a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.f58911a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method = this.f58912b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.f58912b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected void L(I4.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (aVar == null) {
            I(null);
            return;
        }
        N(aVar);
        VersionedParcel versionedParcelB = b();
        K(aVar, versionedParcelB);
        versionedParcelB.a();
    }

    public VersionedParcel(C5503a<String, Method> c5503a, C5503a<String, Method> c5503a2, C5503a<String, Class> c5503a3) {
        this.f58911a = c5503a;
        this.f58912b = c5503a2;
        this.f58913c = c5503a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(I4.a aVar) {
        try {
            I(c(aVar.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(aVar.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    public void B(byte[] bArr, int i10) {
        w(i10);
        A(bArr);
    }

    public void D(CharSequence charSequence, int i10) {
        w(i10);
        C(charSequence);
    }

    public void F(int i10, int i11) {
        w(i11);
        E(i10);
    }

    public void H(Parcelable parcelable, int i10) {
        w(i10);
        G(parcelable);
    }

    public void J(String str, int i10) {
        w(i10);
        I(str);
    }

    protected <T extends I4.a> void K(T t10, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            e(t10.getClass()).invoke(null, t10, versionedParcel);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public void M(I4.a aVar, int i10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        w(i10);
        L(aVar);
    }

    public boolean h(boolean z10, int i10) {
        if (!m(i10)) {
            return z10;
        }
        return g();
    }

    public byte[] j(byte[] bArr, int i10) {
        if (!m(i10)) {
            return bArr;
        }
        return i();
    }

    public CharSequence l(CharSequence charSequence, int i10) {
        if (!m(i10)) {
            return charSequence;
        }
        return k();
    }

    protected <T extends I4.a> T n(String str, VersionedParcel versionedParcel) {
        try {
            return (T) d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public int p(int i10, int i11) {
        if (!m(i11)) {
            return i10;
        }
        return o();
    }

    public <T extends Parcelable> T r(T t10, int i10) {
        if (!m(i10)) {
            return t10;
        }
        return (T) q();
    }

    public String t(String str, int i10) {
        if (!m(i10)) {
            return str;
        }
        return s();
    }

    protected <T extends I4.a> T u() {
        String strS = s();
        if (strS == null) {
            return null;
        }
        return (T) n(strS, b());
    }

    public <T extends I4.a> T v(T t10, int i10) {
        if (!m(i10)) {
            return t10;
        }
        return (T) u();
    }

    public void z(boolean z10, int i10) {
        w(i10);
        y(z10);
    }
}
