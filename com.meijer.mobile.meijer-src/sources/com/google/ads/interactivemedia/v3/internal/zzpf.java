package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class zzpf {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzpg zzc;
    private final zznt zzd;
    private final zzno zze;
    private zzou zzf;
    private final Object zzg = new Object();

    public zzpf(Context context, zzpg zzpgVar, zznt zzntVar, zzno zznoVar) {
        this.zzb = context;
        this.zzc = zzpgVar;
        this.zzd = zzntVar;
        this.zze = zznoVar;
    }

    private final synchronized Class zzd(zzov zzovVar) throws zzpe {
        try {
            String strZzj = zzovVar.zza().zzj();
            HashMap map = zza;
            Class cls = (Class) map.get(strZzj);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzovVar.zzc())) {
                    throw new zzpe(2026, "VM did not pass signature verification");
                }
                try {
                    File fileZzb = zzovVar.zzb();
                    if (!fileZzb.exists()) {
                        fileZzb.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzovVar.zzc().getAbsolutePath(), fileZzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZzj, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e10) {
                    e = e10;
                    throw new zzpe(2008, e);
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    throw new zzpe(2008, e);
                } catch (SecurityException e12) {
                    e = e12;
                    throw new zzpe(2008, e);
                }
            } catch (GeneralSecurityException e13) {
                throw new zzpe(2026, e13);
            }
        } finally {
        }
    }

    public final zznw zza() {
        zzou zzouVar;
        synchronized (this.zzg) {
            zzouVar = this.zzf;
        }
        return zzouVar;
    }

    public final zzov zzb() {
        synchronized (this.zzg) {
            try {
                zzou zzouVar = this.zzf;
                if (zzouVar == null) {
                    return null;
                }
                return zzouVar.zzf();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzc(zzov zzovVar) throws IllegalAccessException, zzpe, InstantiationException, IllegalArgumentException, InvocationTargetException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzou zzouVar = new zzou(zzd(zzovVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzovVar.zze(), null, new Bundle(), 2), zzovVar, this.zzc, this.zzd);
                if (zzouVar.zzh()) {
                    int iZze = zzouVar.zze();
                    if (iZze == 0) {
                        synchronized (this.zzg) {
                            zzou zzouVar2 = this.zzf;
                            if (zzouVar2 != null) {
                                try {
                                    zzouVar2.zzg();
                                } catch (zzpe e10) {
                                    this.zzd.zzc(e10.zza(), -1L, e10);
                                }
                                this.zzf = zzouVar;
                            } else {
                                this.zzf = zzouVar;
                            }
                        }
                        this.zzd.zzd(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                        return true;
                    }
                    throw new zzpe(4001, "ci: " + iZze);
                }
                throw new zzpe(4000, "init failed");
            } catch (Exception e11) {
                throw new zzpe(2004, e11);
            }
        } catch (zzpe e12) {
            this.zzd.zzc(e12.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e13);
            return false;
        }
    }
}
