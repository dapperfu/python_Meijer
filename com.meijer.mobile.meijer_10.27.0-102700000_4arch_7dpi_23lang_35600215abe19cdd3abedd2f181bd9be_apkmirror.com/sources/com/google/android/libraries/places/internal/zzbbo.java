package com.google.android.libraries.places.internal;

import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
final class zzbbo<T> implements zzbbz<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzbct.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzbbl zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzbcm zzm;
    private final zzazq zzn;

    private zzbbo(int[] iArr, Object[] objArr, int i10, int i11, zzbbl zzbblVar, boolean z10, int[] iArr2, int i12, int i13, zzbbr zzbbrVar, zzbay zzbayVar, zzbcm zzbcmVar, zzazq zzazqVar, zzbbg zzbbgVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzbblVar instanceof zzbae;
        boolean z11 = false;
        if (zzazqVar != null && (zzbblVar instanceof zzbab)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzbcmVar;
        this.zzn = zzazqVar;
        this.zzg = zzbblVar;
    }

    private static boolean zzA(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static int zzz(int i10) {
        return (i10 >>> 20) & l3.f92484c;
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzB;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzx = zzx(i10);
            long j10 = iZzx & 1048575;
            switch (zzz(iZzx)) {
                case 0:
                    if (!zzI(obj, obj2, i10) || Double.doubleToLongBits(zzbct.zzl(obj, j10)) != Double.doubleToLongBits(zzbct.zzl(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzI(obj, obj2, i10) || Float.floatToIntBits(zzbct.zzj(obj, j10)) != Float.floatToIntBits(zzbct.zzj(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzI(obj, obj2, i10) || zzbct.zzf(obj, j10) != zzbct.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzI(obj, obj2, i10) || zzbct.zzf(obj, j10) != zzbct.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzI(obj, obj2, i10) || zzbct.zzd(obj, j10) != zzbct.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzI(obj, obj2, i10) || zzbct.zzf(obj, j10) != zzbct.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzI(obj, obj2, i10) || zzbct.zzd(obj, j10) != zzbct.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzI(obj, obj2, i10) || zzbct.zzh(obj, j10) != zzbct.zzh(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzI(obj, obj2, i10) || !zzbcb.zzB(zzbct.zzn(obj, j10), zzbct.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzI(obj, obj2, i10) || !zzbcb.zzB(zzbct.zzn(obj, j10), zzbct.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzI(obj, obj2, i10) || !zzbcb.zzB(zzbct.zzn(obj, j10), zzbct.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzI(obj, obj2, i10) || zzbct.zzd(obj, j10) != zzbct.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzI(obj, obj2, i10) || zzbct.zzd(obj, j10) != zzbct.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzI(obj, obj2, i10) || zzbct.zzd(obj, j10) != zzbct.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzI(obj, obj2, i10) || zzbct.zzf(obj, j10) != zzbct.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzI(obj, obj2, i10) || zzbct.zzd(obj, j10) != zzbct.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzI(obj, obj2, i10) || zzbct.zzf(obj, j10) != zzbct.zzf(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzI(obj, obj2, i10) || !zzbcb.zzB(zzbct.zzn(obj, j10), zzbct.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case l3.f92486e /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzB = zzbcb.zzB(zzbct.zzn(obj, j10), zzbct.zzn(obj2, j10));
                    break;
                case 50:
                    zZzB = zzbcb.zzB(zzbct.zzn(obj, j10), zzbct.zzn(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzy = zzy(i10) & 1048575;
                    if (zzbct.zzd(obj, jZzy) != zzbct.zzd(obj2, jZzy) || !zzbcb.zzB(zzbct.zzn(obj, j10), zzbct.zzn(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzB) {
                return false;
            }
        }
        if (!((zzbae) obj).zzc.equals(((zzbae) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzbab) obj).zzb.equals(((zzbab) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final int zzc(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i12 >= iArr.length) {
                int iHashCode = (i13 * 53) + ((zzbae) obj).zzc.hashCode();
                return this.zzh ? (iHashCode * 53) + ((zzbab) obj).zzb.zza.hashCode() : iHashCode;
            }
            int iZzx = zzx(i12);
            int i14 = 1048575 & iZzx;
            int iZzz = zzz(iZzx);
            int i15 = iArr[i12];
            long j10 = i14;
            int iHashCode2 = 37;
            switch (iZzz) {
                case 0:
                    i10 = i13 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzbct.zzl(obj, j10));
                    byte[] bArr = zzbap.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i13 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzbct.zzj(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzbct.zzf(obj, j10);
                    byte[] bArr2 = zzbap.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzbct.zzf(obj, j10);
                    byte[] bArr3 = zzbap.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzbct.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzbct.zzf(obj, j10);
                    byte[] bArr4 = zzbap.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzbct.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzbap.zzb(zzbct.zzh(obj, j10));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i13 * 53;
                    iFloatToIntBits = ((String) zzbct.zzn(obj, j10)).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i13 * 53;
                    Object objZzn = zzbct.zzn(obj, j10);
                    if (objZzn != null) {
                        iHashCode2 = objZzn.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 10:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzbct.zzn(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzbct.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzbct.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzbct.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzbct.zzf(obj, j10);
                    byte[] bArr5 = zzbap.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzbct.zzd(obj, j10);
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i13 * 53;
                    jDoubleToLongBits = zzbct.zzf(obj, j10);
                    byte[] bArr6 = zzbap.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i13 * 53;
                    Object objZzn2 = zzbct.zzn(obj, j10);
                    if (objZzn2 != null) {
                        iHashCode2 = objZzn2.hashCode();
                    }
                    i13 = i11 + iHashCode2;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case l3.f92486e /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzbct.zzn(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i13 * 53;
                    iFloatToIntBits = zzbct.zzn(obj, j10).hashCode();
                    i13 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzD(obj, j10));
                        byte[] bArr7 = zzbap.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzE(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzG(obj, j10);
                        byte[] bArr8 = zzbap.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzG(obj, j10);
                        byte[] bArr9 = zzbap.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzF(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzG(obj, j10);
                        byte[] bArr10 = zzbap.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzF(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzbap.zzb(zzH(obj, j10));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = ((String) zzbct.zzn(obj, j10)).hashCode();
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzbct.zzn(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzbct.zzn(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzF(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzF(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzF(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzG(obj, j10);
                        byte[] bArr11 = zzbap.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzF(obj, j10);
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        jDoubleToLongBits = zzG(obj, j10);
                        byte[] bArr12 = zzbap.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzM(obj, i15, i12)) {
                        break;
                    } else {
                        i10 = i13 * 53;
                        iFloatToIntBits = zzbct.zzn(obj, j10).hashCode();
                        i13 = i10 + iFloatToIntBits;
                        break;
                    }
            }
            i12 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.android.libraries.places.internal.zzbbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzi(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbbo.zzi(java.lang.Object):boolean");
    }

    private static boolean zzB(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzbae) {
            return ((zzbae) obj).zzbd();
        }
        return true;
    }

    private static final void zzO(int i10, Object obj, zzbcz zzbczVar) throws IOException {
        if (obj instanceof String) {
            zzbczVar.zzm(i10, (String) obj);
        } else {
            zzbczVar.zzn(i10, (zzayz) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.libraries.places.internal.zzbbo zzj(java.lang.Class r32, com.google.android.libraries.places.internal.zzbbi r33, com.google.android.libraries.places.internal.zzbbr r34, com.google.android.libraries.places.internal.zzbay r35, com.google.android.libraries.places.internal.zzbcm r36, com.google.android.libraries.places.internal.zzazq r37, com.google.android.libraries.places.internal.zzbbg r38) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbbo.zzj(java.lang.Class, com.google.android.libraries.places.internal.zzbbi, com.google.android.libraries.places.internal.zzbbr, com.google.android.libraries.places.internal.zzbay, com.google.android.libraries.places.internal.zzbcm, com.google.android.libraries.places.internal.zzazq, com.google.android.libraries.places.internal.zzbbg):com.google.android.libraries.places.internal.zzbbo");
    }

    private final void zzm(Object obj, Object obj2, int i10) {
        int[] iArr = this.zzc;
        int i11 = iArr[i10];
        if (zzM(obj2, i11, i10)) {
            int iZzx = zzx(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzx;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                int i12 = iArr[i10];
                String string = obj2.toString();
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 38 + string.length());
                sb2.append("Source subfield ");
                sb2.append(i12);
                sb2.append(" is present but null: ");
                sb2.append(string);
                throw new IllegalStateException(sb2.toString());
            }
            zzbbz zzbbzVarZzn = zzn(i10);
            if (!zzM(obj, i11, i10)) {
                if (zzB(object)) {
                    Object objZza = zzbbzVarZzn.zza();
                    zzbbzVarZzn.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzN(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzB(object2)) {
                Object objZza2 = zzbbzVarZzn.zza();
                zzbbzVarZzn.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zzbbzVarZzn.zzd(object2, object);
        }
    }

    private final zzbbz zzn(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzbbz zzbbzVar = (zzbbz) objArr[i12];
        if (zzbbzVar != null) {
            return zzbbzVar;
        }
        zzbbz zzbbzVarZzb = zzbbv.zza().zzb((Class) objArr[i12 + 1]);
        objArr[i12] = zzbbzVarZzb;
        return zzbbzVarZzb;
    }

    private final Object zzo(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final zzbak zzp(int i10) {
        int i11 = i10 / 3;
        return (zzbak) this.zzd[i11 + i11 + 1];
    }

    private final void zzr(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzx(i10) & 1048575, obj2);
        zzL(obj, i10);
    }

    private final void zzt(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzx(i11) & 1048575, obj2);
        zzN(obj, i10, i11);
    }

    private final Object zzu(Object obj, int i10, Object obj2, zzbcm zzbcmVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object objZzn = zzbct.zzn(obj, zzx(i10) & 1048575);
        if (objZzn == null || zzp(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final int zzx(int i10) {
        return this.zzc[i10 + 1];
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 2];
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final Object zza() {
        return ((zzbae) this.zzg).zzbg();
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x047a  */
    @Override // com.google.android.libraries.places.internal.zzbbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zze(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 2022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbbo.zze(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.android.libraries.places.internal.zzbbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r21, com.google.android.libraries.places.internal.zzbcz r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbbo.zzf(java.lang.Object, com.google.android.libraries.places.internal.zzbcz):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:260:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x08af A[LOOP:4: B:264:0x08ab->B:266:0x08af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0881 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x088e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ac A[Catch: all -> 0x0089, TryCatch #10 {all -> 0x0089, blocks: (B:35:0x0083, B:39:0x0090, B:41:0x0098, B:42:0x009c, B:75:0x019f, B:83:0x01c4, B:80:0x01ac, B:82:0x01b2, B:44:0x00a2, B:45:0x00ac, B:46:0x00b6, B:47:0x00c0, B:48:0x00ca, B:49:0x00d1, B:50:0x00d2, B:51:0x00dc, B:52:0x00e2, B:54:0x00ea, B:56:0x00ff, B:57:0x010a, B:58:0x010f, B:59:0x011b, B:61:0x0123, B:63:0x0138, B:64:0x0143, B:65:0x0148, B:66:0x0153, B:67:0x0158, B:68:0x0161, B:69:0x016a, B:70:0x0173, B:71:0x017c, B:72:0x0185, B:73:0x018e, B:74:0x0197, B:86:0x01cb, B:87:0x01ce, B:89:0x01d1), top: B:279:0x0083 }] */
    @Override // com.google.android.libraries.places.internal.zzbbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzg(java.lang.Object r19, com.google.android.libraries.places.internal.zzbby r20, com.google.android.libraries.places.internal.zzazp r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbbo.zzg(java.lang.Object, com.google.android.libraries.places.internal.zzbby, com.google.android.libraries.places.internal.zzazp):void");
    }

    private static void zzC(Object obj) {
        if (zzB(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static double zzD(Object obj, long j10) {
        return ((Double) zzbct.zzn(obj, j10)).doubleValue();
    }

    private static float zzE(Object obj, long j10) {
        return ((Float) zzbct.zzn(obj, j10)).floatValue();
    }

    private static int zzF(Object obj, long j10) {
        return ((Integer) zzbct.zzn(obj, j10)).intValue();
    }

    private static long zzG(Object obj, long j10) {
        return ((Long) zzbct.zzn(obj, j10)).longValue();
    }

    private static boolean zzH(Object obj, long j10) {
        return ((Boolean) zzbct.zzn(obj, j10)).booleanValue();
    }

    private final boolean zzI(Object obj, Object obj2, int i10) {
        if (zzK(obj, i10) == zzK(obj2, i10)) {
            return true;
        }
        return false;
    }

    private final boolean zzJ(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzK(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private final boolean zzK(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j10 = iZzy & 1048575;
        if (j10 == 1048575) {
            int iZzx = zzx(i10);
            long j11 = iZzx & 1048575;
            switch (zzz(iZzx)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzbct.zzl(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzbct.zzj(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzbct.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzbct.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzbct.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzbct.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzbct.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzbct.zzh(obj, j11);
                case 8:
                    Object objZzn = zzbct.zzn(obj, j11);
                    if (objZzn instanceof String) {
                        if (((String) objZzn).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (objZzn instanceof zzayz) {
                        if (zzayz.zzb.equals(objZzn)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzbct.zzn(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzayz.zzb.equals(zzbct.zzn(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzbct.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzbct.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzbct.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzbct.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzbct.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzbct.zzf(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzbct.zzn(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzbct.zzd(obj, j10) & (1 << (iZzy >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final void zzL(Object obj, int i10) {
        int iZzy = zzy(i10);
        long j10 = 1048575 & iZzy;
        if (j10 == 1048575) {
            return;
        }
        zzbct.zze(obj, j10, (1 << (iZzy >>> 20)) | zzbct.zzd(obj, j10));
    }

    private final boolean zzM(Object obj, int i10, int i11) {
        if (zzbct.zzd(obj, zzy(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private final void zzN(Object obj, int i10, int i11) {
        zzbct.zze(obj, zzy(i11) & 1048575, i10);
    }

    private static Field zzk(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(string);
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    private final void zzl(Object obj, Object obj2, int i10) {
        if (!zzK(obj2, i10)) {
            return;
        }
        int iZzx = zzx(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = iZzx;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzbbz zzbbzVarZzn = zzn(i10);
            if (!zzK(obj, i10)) {
                if (!zzB(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object objZza = zzbbzVarZzn.zza();
                    zzbbzVarZzn.zzd(objZza, object);
                    unsafe.putObject(obj, j10, objZza);
                }
                zzL(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzB(object2)) {
                Object objZza2 = zzbbzVarZzn.zza();
                zzbbzVarZzn.zzd(objZza2, object2);
                unsafe.putObject(obj, j10, objZza2);
                object2 = objZza2;
            }
            zzbbzVarZzn.zzd(object2, object);
            return;
        }
        int i11 = this.zzc[i10];
        String string = obj2.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 38 + string.length());
        sb2.append("Source subfield ");
        sb2.append(i11);
        sb2.append(" is present but null: ");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString());
    }

    private final Object zzq(Object obj, int i10) {
        zzbbz zzbbzVarZzn = zzn(i10);
        int iZzx = zzx(i10) & 1048575;
        if (!zzK(obj, i10)) {
            return zzbbzVarZzn.zza();
        }
        Object object = zzb.getObject(obj, iZzx);
        if (zzB(object)) {
            return object;
        }
        Object objZza = zzbbzVarZzn.zza();
        if (object != null) {
            zzbbzVarZzn.zzd(objZza, object);
        }
        return objZza;
    }

    private final Object zzs(Object obj, int i10, int i11) {
        zzbbz zzbbzVarZzn = zzn(i11);
        if (!zzM(obj, i10, i11)) {
            return zzbbzVarZzn.zza();
        }
        Object object = zzb.getObject(obj, zzx(i11) & 1048575);
        if (zzB(object)) {
            return object;
        }
        Object objZza = zzbbzVarZzn.zza();
        if (object != null) {
            zzbbzVarZzn.zzd(objZza, object);
        }
        return objZza;
    }

    private static boolean zzv(Object obj, int i10, zzbbz zzbbzVar) {
        return zzbbzVar.zzi(zzbct.zzn(obj, i10 & 1048575));
    }

    private final void zzw(Object obj, int i10, zzbby zzbbyVar) throws IOException {
        long j10 = i10 & 1048575;
        if (zzA(i10)) {
            zzbct.zzo(obj, j10, zzbbyVar.zzn());
        } else if (this.zzi) {
            zzbct.zzo(obj, j10, zzbbyVar.zzm());
        } else {
            zzbct.zzo(obj, j10, zzbbyVar.zzs());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbbz
    public final void zzd(Object obj, Object obj2) {
        zzC(obj);
        obj2.getClass();
        int i10 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i10 < iArr.length) {
                int iZzx = zzx(i10);
                int i11 = 1048575 & iZzx;
                int iZzz = zzz(iZzx);
                int i12 = iArr[i10];
                long j10 = i11;
                switch (iZzz) {
                    case 0:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zzm(obj, j10, zzbct.zzl(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 1:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zzk(obj, j10, zzbct.zzj(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 2:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zzg(obj, j10, zzbct.zzf(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 3:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zzg(obj, j10, zzbct.zzf(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 4:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zze(obj, j10, zzbct.zzd(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 5:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zzg(obj, j10, zzbct.zzf(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 6:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zze(obj, j10, zzbct.zzd(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 7:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zzi(obj, j10, zzbct.zzh(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 8:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zzo(obj, j10, zzbct.zzn(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 9:
                        zzl(obj, obj2, i10);
                        break;
                    case 10:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zzo(obj, j10, zzbct.zzn(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 11:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zze(obj, j10, zzbct.zzd(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 12:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zze(obj, j10, zzbct.zzd(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 13:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zze(obj, j10, zzbct.zzd(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 14:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zzg(obj, j10, zzbct.zzf(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 15:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zze(obj, j10, zzbct.zzd(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 16:
                        if (!zzK(obj2, i10)) {
                            break;
                        } else {
                            zzbct.zzg(obj, j10, zzbct.zzf(obj2, j10));
                            zzL(obj, i10);
                            break;
                        }
                    case 17:
                        zzl(obj, obj2, i10);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case l3.f92486e /* 32 */:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zzbao zzbaoVarZzg = (zzbao) zzbct.zzn(obj, j10);
                        zzbao zzbaoVar = (zzbao) zzbct.zzn(obj2, j10);
                        int size = zzbaoVarZzg.size();
                        int size2 = zzbaoVar.size();
                        if (size > 0 && size2 > 0) {
                            if (!zzbaoVarZzg.zza()) {
                                zzbaoVarZzg = zzbaoVarZzg.zzg(size2 + size);
                            }
                            zzbaoVarZzg.addAll(zzbaoVar);
                        }
                        if (size > 0) {
                            zzbaoVar = zzbaoVarZzg;
                        }
                        zzbct.zzo(obj, j10, zzbaoVar);
                        break;
                    case 50:
                        int i13 = zzbcb.zza;
                        zzbct.zzo(obj, j10, zzbbg.zza(zzbct.zzn(obj, j10), zzbct.zzn(obj2, j10)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!zzM(obj2, i12, i10)) {
                            break;
                        } else {
                            zzbct.zzo(obj, j10, zzbct.zzn(obj2, j10));
                            zzN(obj, i12, i10);
                            break;
                        }
                    case 60:
                        zzm(obj, obj2, i10);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!zzM(obj2, i12, i10)) {
                            break;
                        } else {
                            zzbct.zzo(obj, j10, zzbct.zzn(obj2, j10));
                            zzN(obj, i12, i10);
                            break;
                        }
                    case 68:
                        zzm(obj, obj2, i10);
                        break;
                }
                i10 += 3;
            } else {
                zzbcb.zzD(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzbcb.zzC(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    @Override // com.google.android.libraries.places.internal.zzbbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzB(r8)
            if (r0 != 0) goto L8
            goto L93
        L8:
            boolean r0 = r8 instanceof com.google.android.libraries.places.internal.zzbae
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.libraries.places.internal.zzbae r0 = (com.google.android.libraries.places.internal.zzbae) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzbk(r2)
            r0.zza = r1
            r0.zzbe()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L85
            int r2 = r7.zzx(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzz(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L6f
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L6f;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L82
        L3d:
            sun.misc.Unsafe r2 = com.google.android.libraries.places.internal.zzbbo.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L82
            r6 = r5
            com.google.android.libraries.places.internal.zzbbf r6 = (com.google.android.libraries.places.internal.zzbbf) r6
            r6.zzd()
            r2.putObject(r8, r3, r5)
            goto L82
        L4f:
            java.lang.Object r2 = com.google.android.libraries.places.internal.zzbct.zzn(r8, r3)
            com.google.android.libraries.places.internal.zzbao r2 = (com.google.android.libraries.places.internal.zzbao) r2
            r2.zzb()
            goto L82
        L59:
            r2 = r0[r1]
            boolean r2 = r7.zzM(r8, r2, r1)
            if (r2 == 0) goto L82
            com.google.android.libraries.places.internal.zzbbz r2 = r7.zzn(r1)
            sun.misc.Unsafe r5 = com.google.android.libraries.places.internal.zzbbo.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzh(r3)
            goto L82
        L6f:
            boolean r2 = r7.zzK(r8, r1)
            if (r2 == 0) goto L82
            com.google.android.libraries.places.internal.zzbbz r2 = r7.zzn(r1)
            sun.misc.Unsafe r5 = com.google.android.libraries.places.internal.zzbbo.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzh(r3)
        L82:
            int r1 = r1 + 3
            goto L1d
        L85:
            com.google.android.libraries.places.internal.zzbcm r0 = r7.zzm
            r0.zzj(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L93
            com.google.android.libraries.places.internal.zzazq r0 = r7.zzn
            r0.zzb(r8)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbbo.zzh(java.lang.Object):void");
    }
}
