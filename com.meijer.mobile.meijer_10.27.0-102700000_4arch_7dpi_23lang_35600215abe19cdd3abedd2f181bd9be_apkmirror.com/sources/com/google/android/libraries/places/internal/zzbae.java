package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.a;
import com.google.android.libraries.places.internal.zzazy;
import com.google.android.libraries.places.internal.zzbae;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public abstract class zzbae<MessageType extends zzbae<MessageType, BuilderType>, BuilderType extends zzazy<MessageType, BuilderType>> extends zzaym<MessageType, BuilderType> {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb = -1;
    protected zzbcn zzc = zzbcn.zza();

    public static zzbad zzbp(zzbbl zzbblVar, Object obj, zzbbl zzbblVar2, zzbaj zzbajVar, int i10, zzbcx zzbcxVar, Class cls) {
        return new zzbad(zzbblVar, obj, zzbblVar2, new zzbac(null, 525004180, zzbcxVar, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zze(zzbae zzbaeVar, boolean z10) {
        byte bByteValue = ((Byte) zzbaeVar.zzb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzi = zzbbv.zza().zzb(zzbaeVar.getClass()).zzi(zzbaeVar);
        if (z10) {
            zzbaeVar.zzb(2, true != zZzi ? null : zzbaeVar, null);
        }
        return zZzi;
    }

    protected abstract Object zzb(int i10, Object obj, Object obj2);

    @Override // com.google.android.libraries.places.internal.zzbbm
    public final boolean zzbA() {
        return zze(this, true);
    }

    @Override // com.google.android.libraries.places.internal.zzbbm
    public final /* synthetic */ zzbbl zzbB() {
        return (zzbae) zzb(6, null, null);
    }

    final boolean zzbd() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    final void zzbe() {
        this.zzb &= a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final zzbbt zzbf() {
        return (zzbbt) zzb(7, null, null);
    }

    final zzbae zzbg() {
        return (zzbae) zzb(4, null, null);
    }

    protected final zzazy zzbj() {
        return (zzazy) zzb(5, null, null);
    }

    final void zzbk(int i10) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | a.e.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final /* synthetic */ zzbbk zzbx() {
        zzazy zzazyVar = (zzazy) zzb(5, null, null);
        zzazyVar.zzE(this);
        return zzazyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final /* synthetic */ zzbbk zzby() {
        return (zzazy) zzb(5, null, null);
    }

    static zzbae zzbm(Class cls) throws ClassNotFoundException {
        Map map = zze;
        zzbae zzbaeVar = (zzbae) map.get(cls);
        if (zzbaeVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzbaeVar = (zzbae) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzbaeVar != null) {
            return zzbaeVar;
        }
        zzbae zzbaeVar2 = (zzbae) ((zzbae) zzbct.zzc(cls)).zzb(6, null, null);
        if (zzbaeVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzbaeVar2);
        return zzbaeVar2;
    }

    protected static Object zzbo(zzbbl zzbblVar, String str, Object[] objArr) {
        return new zzbbx(zzbblVar, str, objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzbbv.zza().zzb(getClass()).zzb(this, (zzbae) obj);
    }

    protected static void zzbn(Class cls, zzbae zzbaeVar) {
        zzbaeVar.zzbe();
        zze.put(cls, zzbaeVar);
    }

    static Object zzbq(Method method, Object obj, Object... objArr) {
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

    protected static zzbam zzbr() {
        return zzbaf.zzd();
    }

    protected static zzbam zzbs(zzbam zzbamVar) {
        int size = zzbamVar.size();
        return zzbamVar.zzg(size + size);
    }

    protected static zzban zzbt() {
        return zzbba.zzd();
    }

    protected static zzbao zzbu() {
        return zzbbw.zzd();
    }

    protected static zzbao zzbv(zzbao zzbaoVar) {
        int size = zzbaoVar.size();
        return zzbaoVar.zzg(size + size);
    }

    private final int zzc(zzbbz zzbbzVar) {
        return zzbbv.zza().zzb(getClass()).zze(this);
    }

    public final int hashCode() {
        if (!zzbd()) {
            int i10 = this.zza;
            if (i10 == 0) {
                int iZzbh = zzbh();
                this.zza = iZzbh;
                return iZzbh;
            }
            return i10;
        }
        return zzbh();
    }

    public final String toString() {
        return zzbbn.zza(this, super.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzaym
    final int zzbb(zzbbz zzbbzVar) {
        if (zzbd()) {
            int iZze = zzbbzVar.zze(this);
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
            int iZze2 = zzbbzVar.zze(this);
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

    final int zzbh() {
        return zzbbv.zza().zzb(getClass()).zzc(this);
    }

    protected final void zzbi() {
        zzbbv.zza().zzb(getClass()).zzh(this);
        zzbe();
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final int zzbl() {
        if (zzbd()) {
            int iZzc = zzc(null);
            if (iZzc >= 0) {
                return iZzc;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iZzc);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZzc2 = zzc(null);
        if (iZzc2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iZzc2;
            return iZzc2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzc2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iZzc2);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzbbl
    public final void zzbz(zzazi zzaziVar) throws IOException {
        zzbbv.zza().zzb(getClass()).zzf(this, zzazj.zza(zzaziVar));
    }
}
