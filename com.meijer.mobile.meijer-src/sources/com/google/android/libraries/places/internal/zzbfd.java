package com.google.android.libraries.places.internal;

import De.j;
import De.p;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class zzbfd {
    public static final zzbfd zza;
    private final zzbgg zzb;
    private final Executor zzc;
    private final Object[][] zzd;
    private final List zze;
    private final Boolean zzf;
    private final Integer zzg;
    private final Integer zzh;

    /* synthetic */ zzbfd(zzbfb zzbfbVar, byte[] bArr) {
        this.zzb = zzbfbVar.zza;
        this.zzc = zzbfbVar.zzb;
        this.zzd = zzbfbVar.zzc;
        this.zze = zzbfbVar.zzd;
        this.zzf = zzbfbVar.zze;
        this.zzg = zzbfbVar.zzf;
        this.zzh = zzbfbVar.zzg;
    }

    private static zzbfb zzp(zzbfd zzbfdVar) {
        zzbfb zzbfbVar = new zzbfb();
        zzbfbVar.zza = zzbfdVar.zzb;
        zzbfbVar.zzb = zzbfdVar.zzc;
        zzbfbVar.zzc = zzbfdVar.zzd;
        zzbfbVar.zzd = zzbfdVar.zze;
        zzbfbVar.zze = zzbfdVar.zzf;
        zzbfbVar.zzf = zzbfdVar.zzg;
        zzbfbVar.zzg = zzbfdVar.zzh;
        return zzbfbVar;
    }

    public final zzbgg zzb() {
        return this.zzb;
    }

    public final List zzg() {
        return this.zze;
    }

    public final Executor zzj() {
        return this.zzc;
    }

    public final Integer zzn() {
        return this.zzg;
    }

    public final Integer zzo() {
        return this.zzh;
    }

    static {
        zzbfb zzbfbVar = new zzbfb();
        zzbfbVar.zzc = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        zzbfbVar.zzd = Collections.EMPTY_LIST;
        zza = new zzbfd(zzbfbVar, null);
    }

    public final zzbfd zzf(zzbfm zzbfmVar) {
        List list = this.zze;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(zzbfmVar);
        zzbfb zzbfbVarZzp = zzp(this);
        zzbfbVarZzp.zzd = Collections.unmodifiableList(arrayList);
        return new zzbfd(zzbfbVarZzp, null);
    }

    public final zzbfd zzh(zzbfc zzbfcVar, Object obj) {
        Object[][] objArr;
        int length;
        p.r(zzbfcVar, "key");
        p.r(obj, "value");
        zzbfb zzbfbVarZzp = zzp(this);
        int i10 = 0;
        while (true) {
            objArr = this.zzd;
            length = objArr.length;
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (zzbfcVar.equals(objArr[i10][0])) {
                break;
            }
            i10++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, (i10 == -1 ? 1 : 0) + length, 2);
        zzbfbVarZzp.zzc = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, length);
        if (i10 == -1) {
            zzbfbVarZzp.zzc[length] = new Object[]{zzbfcVar, obj};
        } else {
            zzbfbVarZzp.zzc[i10] = new Object[]{zzbfcVar, obj};
        }
        return new zzbfd(zzbfbVarZzp, null);
    }

    public final Object zzi(zzbfc zzbfcVar) {
        p.r(zzbfcVar, "key");
        int i10 = 0;
        while (true) {
            Object[][] objArr = this.zzd;
            if (i10 >= objArr.length) {
                return null;
            }
            if (zzbfcVar.equals(objArr[i10][0])) {
                return objArr[i10][1];
            }
            i10++;
        }
    }

    public final boolean zzk() {
        return Boolean.TRUE.equals(this.zzf);
    }

    public final zzbfd zzl(int i10) {
        p.h(i10 >= 0, "invalid maxsize %s", i10);
        zzbfb zzbfbVarZzp = zzp(this);
        zzbfbVarZzp.zzf = Integer.valueOf(i10);
        return new zzbfd(zzbfbVarZzp, null);
    }

    public final zzbfd zzm(int i10) {
        p.h(i10 >= 0, "invalid maxsize %s", i10);
        zzbfb zzbfbVarZzp = zzp(this);
        zzbfbVarZzp.zzg = Integer.valueOf(i10);
        return new zzbfd(zzbfbVarZzp, null);
    }

    public final String toString() {
        Class<?> cls;
        j.b bVarD = j.c(this).d("deadline", this.zzb).d("authority", null).d("callCredentials", null);
        Executor executor = this.zzc;
        if (executor != null) {
            cls = executor.getClass();
        } else {
            cls = null;
        }
        return bVarD.d("executor", cls).d("compressorName", null).d("customOptions", Arrays.deepToString(this.zzd)).e("waitForReady", zzk()).d("maxInboundMessageSize", this.zzg).d("maxOutboundMessageSize", this.zzh).d("onReadyThreshold", null).d("streamTracerFactories", this.zze).toString();
    }

    public final zzbfd zza(zzbgg zzbggVar) {
        zzbfb zzbfbVarZzp = zzp(this);
        zzbfbVarZzp.zza = zzbggVar;
        return new zzbfd(zzbfbVarZzp, null);
    }

    public final zzbfd zzc() {
        zzbfb zzbfbVarZzp = zzp(this);
        zzbfbVarZzp.zze = Boolean.TRUE;
        return new zzbfd(zzbfbVarZzp, null);
    }

    public final zzbfd zzd() {
        zzbfb zzbfbVarZzp = zzp(this);
        zzbfbVarZzp.zze = Boolean.FALSE;
        return new zzbfd(zzbfbVarZzp, null);
    }

    public final zzbfd zze(Executor executor) {
        zzbfb zzbfbVarZzp = zzp(this);
        zzbfbVarZzp.zzb = executor;
        return new zzbfd(zzbfbVarZzp, null);
    }
}
