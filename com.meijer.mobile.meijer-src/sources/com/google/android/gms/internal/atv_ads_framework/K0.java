package com.google.android.gms.internal.atv_ads_framework;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.atv_ads_framework.I0;
import com.google.android.gms.internal.atv_ads_framework.K0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public abstract class K0<MessageType extends K0<MessageType, BuilderType>, BuilderType extends I0<MessageType, BuilderType>> extends AbstractC10335d0<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected R1 zzc = R1.c();

    final boolean c() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object e(int i10, Object obj, Object obj2);

    protected final I0 g() {
        return (I0) e(5, null, null);
    }

    final K0 i() {
        return (K0) e(4, null, null);
    }

    final void n() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    final void p(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10375q1
    public final /* synthetic */ InterfaceC10372p1 zzl() {
        return (K0) e(6, null, null);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10372p1
    public final /* synthetic */ InterfaceC10369o1 zzs() {
        return (I0) e(5, null, null);
    }

    private final int d(InterfaceC10401z1 interfaceC10401z1) {
        if (interfaceC10401z1 != null) {
            return interfaceC10401z1.zza(this);
        }
        return C10395x1.a().b(getClass()).zza(this);
    }

    static K0 h(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        K0 k02 = (K0) map.get(cls);
        if (k02 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                k02 = (K0) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (k02 != null) {
            return k02;
        }
        K0 k03 = (K0) ((K0) C10326a2.j(cls)).e(6, null, null);
        if (k03 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, k03);
        return k03;
    }

    protected static Object l(InterfaceC10372p1 interfaceC10372p1, String str, Object[] objArr) {
        return new C10398y1(interfaceC10372p1, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C10395x1.a().b(getClass()).zzg(this, (K0) obj);
    }

    protected static P0 j() {
        return L0.e();
    }

    static Object k(Method method, Object obj, Object... objArr) {
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

    protected static void o(Class cls, K0 k02) {
        k02.n();
        zzb.put(cls, k02);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10372p1
    public final void a(AbstractC10394x0 abstractC10394x0) throws IOException {
        C10395x1.a().b(getClass()).b(this, C10397y0.x(abstractC10394x0));
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10335d0
    final int b(InterfaceC10401z1 interfaceC10401z1) {
        if (c()) {
            int iD = d(interfaceC10401z1);
            if (iD >= 0) {
                return iD;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iD);
        }
        int i10 = this.zzd & a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iD2 = d(interfaceC10401z1);
        if (iD2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iD2;
            return iD2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iD2);
    }

    final int f() {
        return C10395x1.a().b(getClass()).zzb(this);
    }

    public final int hashCode() {
        if (!c()) {
            int i10 = this.zza;
            if (i10 == 0) {
                int iF = f();
                this.zza = iF;
                return iF;
            }
            return i10;
        }
        return f();
    }

    protected final void m() {
        C10395x1.a().b(getClass()).a(this);
        n();
    }

    public final String toString() {
        return C10377r1.a(this, super.toString());
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.InterfaceC10372p1
    public final int zzn() {
        if (c()) {
            int iD = d(null);
            if (iD >= 0) {
                return iD;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iD);
        }
        int i10 = this.zzd & a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iD2 = d(null);
        if (iD2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iD2;
            return iD2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iD2);
    }
}
