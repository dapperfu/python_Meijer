package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.zzadu;
import com.google.ads.interactivemedia.v3.internal.zzady;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public abstract class zzady<MessageType extends zzady<MessageType, BuilderType>, BuilderType extends zzadu<MessageType, BuilderType>> extends zzach<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzagi zzc = zzagi.zzc();

    protected static zzady zzaE(zzady zzadyVar, byte[] bArr, zzadk zzadkVar) throws zzaeg {
        zzady zzadyVarZze = zze(zzadyVar, bArr, 0, bArr.length, zzadkVar);
        zzd(zzadyVarZze);
        return zzadyVarZze;
    }

    protected static final boolean zzaO(zzady zzadyVar, boolean z10) {
        byte bByteValue = ((Byte) zzadyVar.zzm(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzafi.zza().zzb(zzadyVar.getClass()).zzl(zzadyVar);
        if (z10) {
            zzadyVar.zzm(2, true != zZzl ? null : zzadyVar, null);
        }
        return zZzl;
    }

    final zzady zzaB() {
        return (zzady) zzm(4, null, null);
    }

    final void zzaL() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    final void zzaN(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | a.e.API_PRIORITY_OTHER;
    }

    final boolean zzaP() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafb
    public final /* synthetic */ zzafa zzaQ() {
        return (zzadu) zzm(5, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafc
    public final /* synthetic */ zzafb zzaS() {
        return (zzady) zzm(6, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafc
    public final boolean zzaT() {
        return zzaO(this, true);
    }

    protected final zzadu zzay() {
        return (zzadu) zzm(5, null, null);
    }

    public final zzadu zzaz() {
        zzadu zzaduVar = (zzadu) zzm(5, null, null);
        zzaduVar.zzaj(this);
        return zzaduVar;
    }

    protected abstract Object zzm(int i10, Object obj, Object obj2);

    static zzady zzaA(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        zzady zzadyVar = (zzady) map.get(cls);
        if (zzadyVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzadyVar = (zzady) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzadyVar != null) {
            return zzadyVar;
        }
        zzady zzadyVar2 = (zzady) ((zzady) zzago.zze(cls)).zzm(6, null, null);
        if (zzadyVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzadyVar2);
        return zzadyVar2;
    }

    protected static zzady zzaC(zzady zzadyVar, zzacw zzacwVar) throws zzaeg {
        int i10 = zzadk.zzb;
        int i11 = zzafi.zza;
        zzadk zzadkVar = zzadk.zza;
        zzada zzadaVarZzk = zzacwVar.zzk();
        zzady zzadyVarZzaB = zzadyVar.zzaB();
        try {
            zzaft zzaftVarZzb = zzafi.zza().zzb(zzadyVarZzaB.getClass());
            zzaftVarZzb.zzh(zzadyVarZzaB, zzadb.zzq(zzadaVarZzk), zzadkVar);
            zzaftVarZzb.zzf(zzadyVarZzaB);
            zzadaVarZzk.zzy(0);
            zzd(zzadyVarZzaB);
            zzd(zzadyVarZzaB);
            return zzadyVarZzaB;
        } catch (zzaeg e10) {
            throw e10;
        } catch (zzagg e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaeg) {
                throw ((zzaeg) e12.getCause());
            }
            throw new zzaeg(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzaeg) {
                throw ((zzaeg) e13.getCause());
            }
            throw e13;
        }
    }

    protected static Object zzaJ(zzafb zzafbVar, String str, Object[] objArr) {
        return new zzafk(zzafbVar, str, objArr);
    }

    private static zzady zzd(zzady zzadyVar) throws zzaeg {
        if (zzadyVar == null || zzaO(zzadyVar, true)) {
            return zzadyVar;
        }
        throw new zzagg(zzadyVar).zza();
    }

    private static zzady zze(zzady zzadyVar, byte[] bArr, int i10, int i11, zzadk zzadkVar) throws zzaeg {
        if (i11 == 0) {
            return zzadyVar;
        }
        zzady zzadyVarZzaB = zzadyVar.zzaB();
        try {
            zzaft zzaftVarZzb = zzafi.zza().zzb(zzadyVarZzaB.getClass());
            zzaftVarZzb.zzi(zzadyVarZzaB, bArr, 0, i11, new zzacl(zzadkVar));
            zzaftVarZzb.zzf(zzadyVarZzaB);
            return zzadyVarZzaB;
        } catch (zzaeg e10) {
            throw e10;
        } catch (zzagg e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaeg) {
                throw ((zzaeg) e12.getCause());
            }
            throw new zzaeg(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzaeg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzafi.zza().zzb(getClass()).zzk(this, (zzady) obj);
    }

    protected static zzady zzaD(zzady zzadyVar, zzacw zzacwVar, zzadk zzadkVar) throws zzaeg {
        zzada zzadaVarZzk = zzacwVar.zzk();
        zzady zzadyVarZzaB = zzadyVar.zzaB();
        try {
            zzaft zzaftVarZzb = zzafi.zza().zzb(zzadyVarZzaB.getClass());
            zzaftVarZzb.zzh(zzadyVarZzaB, zzadb.zzq(zzadaVarZzk), zzadkVar);
            zzaftVarZzb.zzf(zzadyVarZzaB);
            zzadaVarZzk.zzy(0);
            zzd(zzadyVarZzaB);
            return zzadyVarZzaB;
        } catch (zzaeg e10) {
            throw e10;
        } catch (zzagg e11) {
            throw e11.zza();
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaeg) {
                throw ((zzaeg) e12.getCause());
            }
            throw new zzaeg(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzaeg) {
                throw ((zzaeg) e13.getCause());
            }
            throw e13;
        }
    }

    protected static zzaec zzaF() {
        return zzadz.zzf();
    }

    protected static zzaed zzaG() {
        return zzafj.zze();
    }

    protected static zzaed zzaH(zzaed zzaedVar) {
        int i10;
        int size = zzaedVar.size();
        if (size == 0) {
            i10 = 10;
        } else {
            i10 = size + size;
        }
        return zzaedVar.zzd(i10);
    }

    static Object zzaI(Method method, Object obj, Object... objArr) {
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

    protected static void zzaM(Class cls, zzady zzadyVar) {
        zzadyVar.zzaL();
        zzb.put(cls, zzadyVar);
    }

    private final int zzc(zzaft zzaftVar) {
        return zzafi.zza().zzb(getClass()).zza(this);
    }

    public final int hashCode() {
        if (!zzaP()) {
            int i10 = this.zza;
            if (i10 == 0) {
                int iZzaw = zzaw();
                this.zza = iZzaw;
                return iZzaw;
            }
            return i10;
        }
        return zzaw();
    }

    public final String toString() {
        return zzafd.zza(this, super.toString());
    }

    protected final void zzaK() {
        zzafi.zza().zzb(getClass()).zzf(this);
        zzaL();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafb
    public final void zzaR(zzadf zzadfVar) throws IOException {
        zzafi.zza().zzb(getClass()).zzj(this, zzadg.zza(zzadfVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzach
    final int zzat(zzaft zzaftVar) {
        if (zzaP()) {
            int iZza = zzaftVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i10 = this.zzd & a.e.API_PRIORITY_OTHER;
        if (i10 == Integer.MAX_VALUE) {
            int iZza2 = zzaftVar.zza(this);
            if (iZza2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
                return iZza2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
        }
        return i10;
    }

    final int zzaw() {
        return zzafi.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafb
    public final int zzax() {
        if (zzaP()) {
            int iZzc = zzc(null);
            if (iZzc >= 0) {
                return iZzc;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZzc);
        }
        int i10 = this.zzd & a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZzc2 = zzc(null);
        if (iZzc2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzc2;
            return iZzc2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZzc2);
    }
}
