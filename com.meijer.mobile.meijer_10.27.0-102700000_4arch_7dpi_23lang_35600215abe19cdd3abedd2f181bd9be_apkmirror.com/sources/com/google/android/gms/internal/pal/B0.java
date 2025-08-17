package com.google.android.gms.internal.pal;

import com.google.android.gms.internal.pal.B0;
import com.google.android.gms.internal.pal.C10976y0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public abstract class B0<MessageType extends B0<MessageType, BuilderType>, BuilderType extends C10976y0<MessageType, BuilderType>> extends K<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected K1 zzc = K1.c();
    protected int zzd = -1;

    protected static B0 o(B0 b02, byte[] bArr, C10833p0 c10833p0) throws zzadi {
        B0 b0S = s(b02, bArr, 0, bArr.length, c10833p0);
        e(b0S);
        return b0S;
    }

    private static B0 s(B0 b02, byte[] bArr, int i10, int i11, C10833p0 c10833p0) throws zzadi {
        B0 b03 = (B0) b02.r(4, null, null);
        try {
            InterfaceC10881s1 interfaceC10881s1B = C10818o1.a().b(b03.getClass());
            interfaceC10881s1B.a(b03, bArr, 0, i11, new N(c10833p0));
            interfaceC10881s1B.zzf(b03);
            if (b03.zza == 0) {
                return b03;
            }
            throw new RuntimeException();
        } catch (zzadi e10) {
            e10.h(b03);
            throw e10;
        } catch (zzafh e11) {
            zzadi zzadiVarA = e11.a();
            zzadiVarA.h(b03);
            throw zzadiVarA;
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzadi) {
                throw ((zzadi) e12.getCause());
            }
            zzadi zzadiVar = new zzadi(e12);
            zzadiVar.h(b03);
            throw zzadiVar;
        } catch (IndexOutOfBoundsException unused) {
            zzadi zzadiVarI = zzadi.i();
            zzadiVarI.h(b03);
            throw zzadiVarI;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10706h1
    public final /* synthetic */ InterfaceC10690g1 C() {
        return (B0) r(6, null, null);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10690g1
    public final /* synthetic */ InterfaceC10674f1 F() {
        return (C10976y0) r(5, null, null);
    }

    @Override // com.google.android.gms.internal.pal.K
    final int c() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.pal.K
    final void d(int i10) {
        this.zzd = i10;
    }

    public final boolean k() {
        byte bByteValue = ((Byte) r(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = C10818o1.a().b(getClass()).zzl(this);
        r(2, true != zZzl ? null : this, null);
        return zZzl;
    }

    protected final C10976y0 l() {
        return (C10976y0) r(5, null, null);
    }

    protected abstract Object r(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.pal.InterfaceC10690g1
    public final /* synthetic */ InterfaceC10674f1 x() {
        C10976y0 c10976y0 = (C10976y0) r(5, null, null);
        c10976y0.f(this);
        return c10976y0;
    }

    private static B0 e(B0 b02) throws zzadi {
        if (b02 == null || b02.k()) {
            return b02;
        }
        zzadi zzadiVarA = new zzafh(b02).a();
        zzadiVarA.h(b02);
        throw zzadiVarA;
    }

    protected static Object h(InterfaceC10690g1 interfaceC10690g1, String str, Object[] objArr) {
        return new C10850q1(interfaceC10690g1, str, objArr);
    }

    protected static void j(Class cls, B0 b02) {
        zzb.put(cls, b02);
    }

    static B0 m(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        B0 b02 = (B0) map.get(cls);
        if (b02 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                b02 = (B0) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (b02 != null) {
            return b02;
        }
        B0 b03 = (B0) ((B0) T1.j(cls)).r(6, null, null);
        if (b03 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, b03);
        return b03;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10690g1
    public final int D() {
        int i10 = this.zzd;
        if (i10 != -1) {
            return i10;
        }
        int iZza = C10818o1.a().b(getClass()).zza(this);
        this.zzd = iZza;
        return iZza;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C10818o1.a().b(getClass()).zzk(this, (B0) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iZzb = C10818o1.a().b(getClass()).zzb(this);
        this.zza = iZzb;
        return iZzb;
    }

    protected static I0 f(I0 i02) {
        int i10;
        int size = i02.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return i02.zzd(i10);
    }

    static Object g(Method method, Object obj, Object... objArr) {
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

    protected static B0 n(B0 b02, AbstractC10605b0 abstractC10605b0, C10833p0 c10833p0) throws zzadi {
        AbstractC10689g0 abstractC10689g0M = abstractC10605b0.m();
        B0 b03 = (B0) b02.r(4, null, null);
        try {
            InterfaceC10881s1 interfaceC10881s1B = C10818o1.a().b(b03.getClass());
            interfaceC10881s1B.c(b03, C10705h0.m(abstractC10689g0M), c10833p0);
            interfaceC10881s1B.zzf(b03);
            try {
                abstractC10689g0M.g(0);
                e(b03);
                return b03;
            } catch (zzadi e10) {
                e10.h(b03);
                throw e10;
            }
        } catch (zzadi e11) {
            e11.h(b03);
            throw e11;
        } catch (zzafh e12) {
            zzadi zzadiVarA = e12.a();
            zzadiVarA.h(b03);
            throw zzadiVarA;
        } catch (IOException e13) {
            if (e13.getCause() instanceof zzadi) {
                throw ((zzadi) e13.getCause());
            }
            zzadi zzadiVar = new zzadi(e13);
            zzadiVar.h(b03);
            throw zzadiVar;
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof zzadi) {
                throw ((zzadi) e14.getCause());
            }
            throw e14;
        }
    }

    protected static H0 p() {
        return D0.e();
    }

    protected static I0 q() {
        return C10834p1.a();
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10690g1
    public final void b(AbstractC10753k0 abstractC10753k0) throws IOException {
        C10818o1.a().b(getClass()).b(this, C10769l0.l(abstractC10753k0));
    }

    public final String toString() {
        return C10722i1.a(this, super.toString());
    }
}
