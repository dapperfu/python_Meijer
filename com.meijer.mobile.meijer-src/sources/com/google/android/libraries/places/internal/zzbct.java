package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class zzbct {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzbcs zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    private zzbct() {
    }

    static boolean zza() {
        return zzh;
    }

    static boolean zzb() {
        return zzg;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbct.<clinit>():void");
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i10 = zzayq.zza;
        Field fieldZzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (fieldZzC != null) {
            return fieldZzC;
        }
        Field fieldZzC2 = zzC(Buffer.class, PlaceTypes.ADDRESS);
        if (fieldZzC2 == null || fieldZzC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzC2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j10, byte b10) {
        Unsafe unsafe = zzf.zza;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(l3.f93323c << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j10, byte b10) {
        Unsafe unsafe = zzf.zza;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        unsafe.putInt(obj, j11, ((255 & b10) << i10) | (unsafe.getInt(obj, j11) & (~(l3.f93323c << i10))));
    }

    static Object zzc(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static int zzd(Object obj, long j10) {
        return zzf.zza.getInt(obj, j10);
    }

    static void zze(Object obj, long j10, int i10) {
        zzf.zza.putInt(obj, j10, i10);
    }

    static long zzf(Object obj, long j10) {
        return zzf.zza.getLong(obj, j10);
    }

    static void zzg(Object obj, long j10, long j11) {
        zzf.zza.putLong(obj, j10, j11);
    }

    static boolean zzh(Object obj, long j10) {
        return zzf.zzb(obj, j10);
    }

    static void zzi(Object obj, long j10, boolean z10) {
        zzf.zzc(obj, j10, z10);
    }

    static float zzj(Object obj, long j10) {
        return zzf.zzd(obj, j10);
    }

    static void zzk(Object obj, long j10, float f10) {
        zzf.zze(obj, j10, f10);
    }

    static double zzl(Object obj, long j10) {
        return zzf.zzf(obj, j10);
    }

    static void zzm(Object obj, long j10, double d10) {
        zzf.zzg(obj, j10, d10);
    }

    static Object zzn(Object obj, long j10) {
        return zzf.zza.getObject(obj, j10);
    }

    static void zzo(Object obj, long j10, Object obj2) {
        zzf.zza.putObject(obj, j10, obj2);
    }

    static void zzp(byte[] bArr, long j10, byte b10) {
        zzf.zza(bArr, zza + j10, b10);
    }

    static Unsafe zzq() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzbcp());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzr(Class cls) {
        int i10 = zzayq.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ boolean zzu(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & l3.f93323c)) != 0;
    }

    static /* synthetic */ boolean zzv(Object obj, long j10) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & l3.f93323c)) != 0;
    }

    static /* synthetic */ void zzy(Throwable th2) {
        Logger.getLogger(zzbct.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
