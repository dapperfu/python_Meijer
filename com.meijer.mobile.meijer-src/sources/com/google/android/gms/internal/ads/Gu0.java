package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.ads.Au0;
import com.google.android.gms.internal.ads.Gu0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public abstract class Gu0<MessageType extends Gu0<MessageType, BuilderType>, BuilderType extends Au0<MessageType, BuilderType>> extends Ht0<MessageType, BuilderType> {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, Gu0<?, ?>> zzc = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzd = -1;
    protected Vv0 zzt = Vv0.c();

    protected static <T extends Gu0<T, ?>> T M(T t10, byte[] bArr) throws zzgyg {
        int length = bArr.length;
        C9350qu0 c9350qu0 = C9350qu0.f78705c;
        int i10 = C10207yv0.f81149d;
        T t11 = (T) Z(t10, bArr, 0, length, C9350qu0.f78705c);
        X(t11);
        return t11;
    }

    protected static <T extends Gu0<T, ?>> T P(T t10, byte[] bArr, C9350qu0 c9350qu0) throws zzgyg {
        T t11 = (T) Z(t10, bArr, 0, bArr.length, c9350qu0);
        X(t11);
        return t11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9352qv0
    public final boolean C() {
        return a0(this, true);
    }

    void D() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    void S(int i10) {
        this.zzq = i10;
    }

    boolean U() {
        return m() == 0;
    }

    boolean V() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object W(Fu0 fu0, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.Ht0
    int d() {
        return this.zzd & a.e.API_PRIORITY_OTHER;
    }

    int m() {
        return this.zzq;
    }

    void y() {
        this.zzq = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9245pv0
    public int zzaY() {
        return e(null);
    }

    static <T extends Gu0> T I(Class<T> cls) throws ClassNotFoundException {
        Gu0<?, ?> gu0 = zzc.get(cls);
        if (gu0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                gu0 = zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (gu0 != null) {
            return gu0;
        }
        Gu0<?, ?> gu0A = ((Gu0) C7753bw0.o(cls)).A();
        if (gu0A == null) {
            throw new IllegalStateException();
        }
        zzc.put(cls, gu0A);
        return gu0A;
    }

    protected static <T extends Gu0<T, ?>> T L(T t10, Zt0 zt0) throws zzgyg {
        C9350qu0 c9350qu0 = C9350qu0.f78705c;
        int i10 = C10207yv0.f81149d;
        T t11 = (T) N(t10, zt0, C9350qu0.f78705c);
        X(t11);
        return t11;
    }

    protected static <T extends Gu0<T, ?>> T O(T t10, InputStream inputStream, C9350qu0 c9350qu0) throws zzgyg {
        T t11 = (T) Q(t10, AbstractC8068eu0.e(inputStream, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT), c9350qu0);
        X(t11);
        return t11;
    }

    private int R(Hv0<?> hv0) {
        if (hv0 != null) {
            return hv0.zza(this);
        }
        return C10207yv0.a().b(getClass()).zza(this);
    }

    private static <T extends Gu0<T, ?>> T X(T t10) throws zzgyg {
        if (t10 == null || t10.C()) {
            return t10;
        }
        throw t10.f().a();
    }

    private static <T extends Gu0<T, ?>> T Z(T t10, byte[] bArr, int i10, int i11, C9350qu0 c9350qu0) throws zzgyg {
        if (i11 == 0) {
            return t10;
        }
        T t11 = (T) t10.K();
        try {
            Hv0 hv0B = C10207yv0.a().b(t11.getClass());
            hv0B.a(t11, bArr, i10, i10 + i11, new Mt0(c9350qu0));
            hv0B.zzf(t11);
            return t11;
        } catch (zzgyg e10) {
            if (e10.b()) {
                throw new zzgyg(e10);
            }
            throw e10;
        } catch (zzhag e11) {
            throw e11.a();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgyg) {
                throw ((zzgyg) e12.getCause());
            }
            throw new zzgyg(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends Gu0<T, ?>> boolean a0(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.W(Fu0.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = C10207yv0.a().b(t10.getClass()).zzl(t10);
        if (z10) {
            t10.W(Fu0.SET_MEMOIZED_IS_INITIALIZED, true != zZzl ? null : t10, null);
        }
        return zZzl;
    }

    protected static Object x(InterfaceC9245pv0 interfaceC9245pv0, String str, Object[] objArr) {
        return new Av0(interfaceC9245pv0, str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9245pv0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final BuilderType b() {
        return (BuilderType) W(Fu0.NEW_BUILDER, null, null);
    }

    public final BuilderType H() {
        BuilderType buildertype = (BuilderType) W(Fu0.NEW_BUILDER, null, null);
        buildertype.n(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9352qv0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final MessageType A() {
        return (MessageType) W(Fu0.GET_DEFAULT_INSTANCE, null, null);
    }

    MessageType K() {
        return (MessageType) W(Fu0.NEW_MUTABLE_INSTANCE, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C10207yv0.a().b(getClass()).zzk(this, (Gu0) obj);
    }

    @Override // com.google.android.gms.internal.ads.Ht0
    void h(int i10) {
        if (i10 >= 0) {
            this.zzd = i10 | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i10);
    }

    protected final <MessageType extends Gu0<MessageType, BuilderType>, BuilderType extends Au0<MessageType, BuilderType>> BuilderType n() {
        return (BuilderType) W(Fu0.NEW_BUILDER, null, null);
    }

    public final InterfaceC9993wv0<MessageType> u() {
        return (InterfaceC9993wv0) W(Fu0.GET_PARSER, null, null);
    }

    Object v() throws Exception {
        return W(Fu0.BUILD_MESSAGE_INFO, null, null);
    }

    protected static <T extends Gu0> void E(Class<T> cls, T t10) {
        t10.D();
        zzc.put(cls, t10);
    }

    protected static <T extends Gu0<T, ?>> T N(T t10, Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        T t11 = (T) Y(t10, zt0, c9350qu0);
        X(t11);
        return t11;
    }

    static <T extends Gu0<T, ?>> T Q(T t10, AbstractC8068eu0 abstractC8068eu0, C9350qu0 c9350qu0) throws zzgyg {
        T t11 = (T) t10.K();
        try {
            Hv0 hv0B = C10207yv0.a().b(t11.getClass());
            hv0B.b(t11, C8175fu0.l(abstractC8068eu0), c9350qu0);
            hv0B.zzf(t11);
            return t11;
        } catch (zzgyg e10) {
            if (e10.b()) {
                throw new zzgyg(e10);
            }
            throw e10;
        } catch (zzhag e11) {
            throw e11.a();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzgyg) {
                throw ((zzgyg) e12.getCause());
            }
            throw new zzgyg(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzgyg) {
                throw ((zzgyg) e13.getCause());
            }
            throw e13;
        }
    }

    private static <T extends Gu0<T, ?>> T Y(T t10, Zt0 zt0, C9350qu0 c9350qu0) throws zzgyg {
        AbstractC8068eu0 abstractC8068eu0Q = zt0.q();
        T t11 = (T) Q(t10, abstractC8068eu0Q, c9350qu0);
        abstractC8068eu0Q.z(0);
        return t11;
    }

    protected static Ou0 o() {
        return Hu0.h();
    }

    protected static Ou0 p(Ou0 ou0) {
        int size = ou0.size();
        return ou0.zzf(size + size);
    }

    protected static Ru0 q() {
        return C8070ev0.k();
    }

    protected static Ru0 r(Ru0 ru0) {
        int size = ru0.size();
        return ru0.zzf(size + size);
    }

    protected static <E> Su0<E> s() {
        return C10314zv0.e();
    }

    protected static <E> Su0<E> t(Su0<E> su0) {
        int size = su0.size();
        return su0.zzf(size + size);
    }

    static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    protected void B() {
        C10207yv0.a().b(getClass()).zzf(this);
        D();
    }

    protected final <MessageType extends Gu0<MessageType, BuilderType>, BuilderType extends Au0<MessageType, BuilderType>> BuilderType F(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) n();
        buildertype.n(messagetype);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9245pv0
    public void c(AbstractC8708ku0 abstractC8708ku0) throws IOException {
        C10207yv0.a().b(getClass()).c(this, C8815lu0.d(abstractC8708ku0));
    }

    @Override // com.google.android.gms.internal.ads.Ht0
    int e(Hv0 hv0) {
        if (V()) {
            int iR = R(hv0);
            if (iR >= 0) {
                return iR;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iR);
        }
        if (d() != Integer.MAX_VALUE) {
            return d();
        }
        int iR2 = R(hv0);
        h(iR2);
        return iR2;
    }

    public int hashCode() {
        if (V()) {
            return l();
        }
        if (U()) {
            S(l());
        }
        return m();
    }

    int l() {
        return C10207yv0.a().b(getClass()).zzb(this);
    }

    public String toString() {
        return C9458rv0.a(this, super.toString());
    }

    void z() {
        h(a.e.API_PRIORITY_OTHER);
    }
}
