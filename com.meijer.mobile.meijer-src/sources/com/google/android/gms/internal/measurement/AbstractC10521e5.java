package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.measurement.AbstractC10521e5;
import com.google.android.gms.internal.measurement.C10485a5;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.e5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10521e5<MessageType extends AbstractC10521e5<MessageType, BuilderType>, BuilderType extends C10485a5<MessageType, BuilderType>> extends AbstractC10628q4<MessageType, BuilderType> {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected C10549h6 zzc = C10549h6.a();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(AbstractC10521e5 abstractC10521e5, boolean z10) {
        byte bByteValue = ((Byte) abstractC10521e5.D(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zA = S5.a().b(abstractC10521e5.getClass()).a(abstractC10521e5);
        if (z10) {
            abstractC10521e5.D(2, true != zA ? null : abstractC10521e5, null);
        }
        return zA;
    }

    protected abstract Object D(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.K5
    public final /* synthetic */ J5 d() {
        return (C10485a5) D(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.L5
    public final boolean e() {
        return C(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.L5
    public final /* synthetic */ K5 f() {
        return (AbstractC10521e5) D(6, null, null);
    }

    final boolean k() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    final void l() {
        this.zzb &= a.e.API_PRIORITY_OTHER;
    }

    final AbstractC10521e5 m() {
        return (AbstractC10521e5) D(4, null, null);
    }

    protected final C10485a5 p() {
        return (C10485a5) D(5, null, null);
    }

    public final C10485a5 q() {
        C10485a5 c10485a5 = (C10485a5) D(5, null, null);
        c10485a5.r(this);
        return c10485a5;
    }

    final void r(int i10) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | a.e.API_PRIORITY_OTHER;
    }

    static AbstractC10521e5 s(Class cls) throws ClassNotFoundException {
        Map map = zzd;
        AbstractC10521e5 abstractC10521e5 = (AbstractC10521e5) map.get(cls);
        if (abstractC10521e5 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC10521e5 = (AbstractC10521e5) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC10521e5 != null) {
            return abstractC10521e5;
        }
        AbstractC10521e5 abstractC10521e52 = (AbstractC10521e5) ((AbstractC10521e5) C10603n6.h(cls)).D(6, null, null);
        if (abstractC10521e52 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC10521e52);
        return abstractC10521e52;
    }

    protected static Object u(K5 k52, String str, Object[] objArr) {
        return new U5(k52, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return S5.a().b(getClass()).zzb(this, (AbstractC10521e5) obj);
    }

    protected static InterfaceC10602n5 A(InterfaceC10602n5 interfaceC10602n5) {
        int size = interfaceC10602n5.size();
        return interfaceC10602n5.zzg(size + size);
    }

    private final int j(V5 v52) {
        return S5.a().b(getClass()).zze(this);
    }

    protected static void t(Class cls, AbstractC10521e5 abstractC10521e5) {
        abstractC10521e5.l();
        zzd.put(cls, abstractC10521e5);
    }

    static Object v(Method method, Object obj, Object... objArr) {
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

    protected static InterfaceC10584l5 w() {
        return C10530f5.e();
    }

    protected static InterfaceC10593m5 x() {
        return C10700y5.e();
    }

    protected static InterfaceC10593m5 y(InterfaceC10593m5 interfaceC10593m5) {
        int size = interfaceC10593m5.size();
        return interfaceC10593m5.zzg(size + size);
    }

    protected static InterfaceC10602n5 z() {
        return T5.e();
    }

    @Override // com.google.android.gms.internal.measurement.K5
    public final int a() {
        if (k()) {
            int iJ = j(null);
            if (iJ >= 0) {
                return iJ;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iJ).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iJ);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iJ2 = j(null);
        if (iJ2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iJ2;
            return iJ2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iJ2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iJ2);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.K5
    public final void c(K4 k42) throws IOException {
        S5.a().b(getClass()).d(this, L4.e(k42));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10628q4
    final int h(V5 v52) {
        if (k()) {
            int iZze = v52.zze(this);
            if (iZze >= 0) {
                return iZze;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZze).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iZze);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & a.e.API_PRIORITY_OTHER;
        if (i10 == Integer.MAX_VALUE) {
            int iZze2 = v52.zze(this);
            if (iZze2 >= 0) {
                this.zzb = (this.zzb & Integer.MIN_VALUE) | iZze2;
                return iZze2;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZze2).length() + 42);
            sb3.append("serialized size must be non-negative, was ");
            sb3.append(iZze2);
            throw new IllegalStateException(sb3.toString());
        }
        return i10;
    }

    public final int hashCode() {
        if (!k()) {
            int i10 = this.zza;
            if (i10 == 0) {
                int iN = n();
                this.zza = iN;
                return iN;
            }
            return i10;
        }
        return n();
    }

    final int n() {
        return S5.a().b(getClass()).zzc(this);
    }

    protected final void o() {
        S5.a().b(getClass()).b(this);
        l();
    }

    public final String toString() {
        return M5.a(this, super.toString());
    }
}
