package com.google.ads.interactivemedia.v3.internal;

import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
final class zzafe<T> implements zzaft<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzago.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzafb zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzagh zzm;
    private final zzadl zzn;

    private zzafe(int[] iArr, Object[] objArr, int i10, int i11, zzafb zzafbVar, boolean z10, int[] iArr2, int i12, int i13, zzafg zzafgVar, zzaeo zzaeoVar, zzagh zzaghVar, zzadl zzadlVar, zzaew zzaewVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzafbVar instanceof zzady;
        boolean z11 = false;
        if (zzadlVar != null && (zzafbVar instanceof zzadv)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzaghVar;
        this.zzn = zzadlVar;
        this.zzg = zzafbVar;
    }

    private static boolean zzM(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static int zzt(int i10) {
        return (i10 >>> 20) & l3.f92484c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0714 A[PHI: r0
      0x0714: PHI (r0v2 com.google.ads.interactivemedia.v3.internal.zzafe<T>) = 
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v39 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
      (r0v1 com.google.ads.interactivemedia.v3.internal.zzafe<T>)
     binds: [B:18:0x004f, B:278:0x0707, B:248:0x0643, B:225:0x05b3, B:218:0x0580, B:138:0x036e, B:135:0x0356, B:132:0x033e, B:129:0x0326, B:126:0x030e, B:123:0x02f6, B:120:0x02de, B:117:0x02c6, B:114:0x02ad, B:111:0x0296, B:108:0x027f, B:105:0x0268, B:102:0x0251, B:97:0x0235, B:83:0x01e1, B:85:0x01ef, B:80:0x01c7, B:77:0x01b9, B:74:0x01a3, B:71:0x018d, B:68:0x0176, B:65:0x0168, B:62:0x015a, B:59:0x014b, B:53:0x0120, B:50:0x010c, B:46:0x00ee, B:43:0x00d9, B:40:0x00c3, B:36:0x00b4, B:32:0x00a5, B:29:0x008b, B:25:0x0070, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzafe.zza(java.lang.Object):int");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final int zzb(Object obj) {
        int i10;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int iZzu = zzu(i13);
            int[] iArr = this.zzc;
            int i14 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i15 = iArr[i13];
            long j10 = i14;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i10 = i12 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzago.zza(obj, j10));
                    byte[] bArr = zzaee.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 1:
                    i10 = i12 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzago.zzb(obj, j10));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 2:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzago.zzd(obj, j10);
                    byte[] bArr2 = zzaee.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 3:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzago.zzd(obj, j10);
                    byte[] bArr3 = zzaee.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 4:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzago.zzc(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 5:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzago.zzd(obj, j10);
                    byte[] bArr4 = zzaee.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 6:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzago.zzc(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 7:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzaee.zza(zzago.zzw(obj, j10));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 8:
                    i10 = i12 * 53;
                    iFloatToIntBits = ((String) zzago.zzf(obj, j10)).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object objZzf = zzago.zzf(obj, j10);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i12 = i11 + iHashCode;
                    break;
                case 10:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzago.zzf(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 11:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzago.zzc(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 12:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzago.zzc(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 13:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzago.zzc(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 14:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzago.zzd(obj, j10);
                    byte[] bArr5 = zzaee.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 15:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzago.zzc(obj, j10);
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 16:
                    i10 = i12 * 53;
                    jDoubleToLongBits = zzago.zzd(obj, j10);
                    byte[] bArr6 = zzaee.zzb;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object objZzf2 = zzago.zzf(obj, j10);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i12 = i11 + iHashCode;
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
                    i10 = i12 * 53;
                    iFloatToIntBits = zzago.zzf(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 50:
                    i10 = i12 * 53;
                    iFloatToIntBits = zzago.zzf(obj, j10).hashCode();
                    i12 = i10 + iFloatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j10));
                        byte[] bArr7 = zzaee.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j10));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr8 = zzaee.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr9 = zzaee.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzp(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr10 = zzaee.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzp(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzaee.zza(zzS(obj, j10));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = ((String) zzago.zzf(obj, j10)).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzago.zzf(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzago.zzf(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzp(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzp(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzp(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr11 = zzaee.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzp(obj, j10);
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        jDoubleToLongBits = zzv(obj, j10);
                        byte[] bArr12 = zzaee.zzb;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        iFloatToIntBits = zzago.zzf(obj, j10).hashCode();
                        i12 = i10 + iFloatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i12 * 53) + ((zzady) obj).zzc.hashCode();
        return this.zzh ? (iHashCode2 * 53) + ((zzadv) obj).zzb.zza.hashCode() : iHashCode2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.ads.interactivemedia.v3.internal.zzacl r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzafe.zzc(java.lang.Object, byte[], int, int, int, com.google.ads.interactivemedia.v3.internal.zzacl):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        r2 = r3;
        r5 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0610 A[LOOP:3: B:202:0x060c->B:204:0x0610, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[SYNTHETIC] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r12, com.google.ads.interactivemedia.v3.internal.zzafl r13, com.google.ads.interactivemedia.v3.internal.zzadk r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzafe.zzh(java.lang.Object, com.google.ads.interactivemedia.v3.internal.zzafl, com.google.ads.interactivemedia.v3.internal.zzadk):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzacl zzaclVar) throws IOException {
        zzc(obj, bArr, i10, i11, 0, zzaclVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(java.lang.Object r19, com.google.ads.interactivemedia.v3.internal.zzagu r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzafe.zzj(java.lang.Object, com.google.ads.interactivemedia.v3.internal.zzagu):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzF;
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            long j10 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i10) || Double.doubleToLongBits(zzago.zza(obj, j10)) != Double.doubleToLongBits(zzago.zza(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i10) || Float.floatToIntBits(zzago.zzb(obj, j10)) != Float.floatToIntBits(zzago.zzb(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i10) || zzago.zzd(obj, j10) != zzago.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i10) || zzago.zzd(obj, j10) != zzago.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i10) || zzago.zzc(obj, j10) != zzago.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i10) || zzago.zzd(obj, j10) != zzago.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i10) || zzago.zzc(obj, j10) != zzago.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i10) || zzago.zzw(obj, j10) != zzago.zzw(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i10) || !zzafv.zzF(zzago.zzf(obj, j10), zzago.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i10) || !zzafv.zzF(zzago.zzf(obj, j10), zzago.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i10) || !zzafv.zzF(zzago.zzf(obj, j10), zzago.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i10) || zzago.zzc(obj, j10) != zzago.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i10) || zzago.zzc(obj, j10) != zzago.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i10) || zzago.zzc(obj, j10) != zzago.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i10) || zzago.zzd(obj, j10) != zzago.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i10) || zzago.zzc(obj, j10) != zzago.zzc(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i10) || zzago.zzd(obj, j10) != zzago.zzd(obj2, j10)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i10) || !zzafv.zzF(zzago.zzf(obj, j10), zzago.zzf(obj2, j10))) {
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
                    zZzF = zzafv.zzF(zzago.zzf(obj, j10), zzago.zzf(obj2, j10));
                    break;
                case 50:
                    zZzF = zzafv.zzF(zzago.zzf(obj, j10), zzago.zzf(obj2, j10));
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
                    long jZzr = zzr(i10) & 1048575;
                    if (zzago.zzc(obj, jZzr) != zzago.zzc(obj2, jZzr) || !zzafv.zzF(zzago.zzf(obj, j10), zzago.zzf(obj2, j10))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zZzF) {
                return false;
            }
        }
        if (!((zzady) obj).zzc.equals(((zzady) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzadv) obj).zzb.equals(((zzadv) obj2).zzb);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzafe.zzl(java.lang.Object):boolean");
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzR(obj2, i11, i10)) {
            int iZzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzaft zzaftVarZzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzaftVarZzx.zze();
                    zzaftVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object objZze2 = zzaftVarZzx.zze();
                zzaftVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzaftVarZzx.zzg(object2, object);
        }
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzady) {
            return ((zzady) obj).zzaP();
        }
        return true;
    }

    private static final void zzT(int i10, Object obj, zzagu zzaguVar) throws IOException {
        if (obj instanceof String) {
            zzaguVar.zzG(i10, (String) obj);
        } else {
            zzaguVar.zzd(i10, (zzacw) obj);
        }
    }

    static zzagi zzd(Object obj) {
        zzady zzadyVar = (zzady) obj;
        zzagi zzagiVar = zzadyVar.zzc;
        if (zzagiVar != zzagi.zzc()) {
            return zzagiVar;
        }
        zzagi zzagiVarZzf = zzagi.zzf();
        zzadyVar.zzc = zzagiVarZzf;
        return zzagiVarZzf;
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
    static com.google.ads.interactivemedia.v3.internal.zzafe zzm(java.lang.Class r32, com.google.ads.interactivemedia.v3.internal.zzaey r33, com.google.ads.interactivemedia.v3.internal.zzafg r34, com.google.ads.interactivemedia.v3.internal.zzaeo r35, com.google.ads.interactivemedia.v3.internal.zzagh r36, com.google.ads.interactivemedia.v3.internal.zzadl r37, com.google.ads.interactivemedia.v3.internal.zzaew r38) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzafe.zzm(java.lang.Class, com.google.ads.interactivemedia.v3.internal.zzaey, com.google.ads.interactivemedia.v3.internal.zzafg, com.google.ads.interactivemedia.v3.internal.zzaeo, com.google.ads.interactivemedia.v3.internal.zzagh, com.google.ads.interactivemedia.v3.internal.zzadl, com.google.ads.interactivemedia.v3.internal.zzaew):com.google.ads.interactivemedia.v3.internal.zzafe");
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzs(i10, 0);
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private final zzaeb zzw(int i10) {
        int i11 = i10 / 3;
        return (zzaeb) this.zzd[i11 + i11 + 1];
    }

    private final zzaft zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzaft zzaftVar = (zzaft) objArr[i12];
        if (zzaftVar != null) {
            return zzaftVar;
        }
        zzaft zzaftVarZzb = zzafi.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzaftVarZzb;
        return zzaftVarZzb;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzagh zzaghVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object objZzf = zzago.zzf(obj, zzu(i10) & 1048575);
        if (objZzf == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final Object zze() {
        return ((zzady) this.zzg).zzaB();
    }

    private final Object zzA(Object obj, int i10) {
        zzaft zzaftVarZzx = zzx(i10);
        int iZzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzaftVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzaftVarZzx.zze();
        if (object != null) {
            zzaftVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzaft zzaftVarZzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzaftVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzaftVarZzx.zze();
        if (object != null) {
            zzaftVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzD(Object obj) {
        if (zzQ(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (!zzN(obj2, i10)) {
            return;
        }
        int iZzu = zzu(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j10 = iZzu;
        Object object = unsafe.getObject(obj2, j10);
        if (object != null) {
            zzaft zzaftVarZzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, j10, object);
                } else {
                    Object objZze = zzaftVarZzx.zze();
                    zzaftVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object objZze2 = zzaftVarZzx.zze();
                zzaftVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzaftVarZzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzG(Object obj, int i10, zzafl zzaflVar) throws IOException {
        long j10 = i10 & 1048575;
        if (zzM(i10)) {
            zzago.zzs(obj, j10, zzaflVar.zzs());
        } else if (this.zzi) {
            zzago.zzs(obj, j10, zzaflVar.zzr());
        } else {
            zzago.zzs(obj, j10, zzaflVar.zzp());
        }
    }

    private final void zzH(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j10 = 1048575 & iZzr;
        if (j10 == 1048575) {
            return;
        }
        zzago.zzq(obj, j10, (1 << (iZzr >>> 20)) | zzago.zzc(obj, j10));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzago.zzq(obj, zzr(i11) & 1048575, i10);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        if (zzN(obj, i10) == zzN(obj2, i10)) {
            return true;
        }
        return false;
    }

    private final boolean zzN(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j10 = iZzr & 1048575;
        if (j10 == 1048575) {
            int iZzu = zzu(i10);
            long j11 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzago.zza(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzago.zzb(obj, j11)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzago.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzago.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzago.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzago.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzago.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzago.zzw(obj, j11);
                case 8:
                    Object objZzf = zzago.zzf(obj, j11);
                    if (objZzf instanceof String) {
                        if (((String) objZzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (objZzf instanceof zzacw) {
                        if (zzacw.zzb.equals(objZzf)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzago.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzacw.zzb.equals(zzago.zzf(obj, j11))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzago.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzago.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzago.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzago.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzago.zzc(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzago.zzd(obj, j11) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzago.zzf(obj, j11) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzago.zzc(obj, j10) & (1 << (iZzr >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzN(obj, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzP(Object obj, int i10, zzaft zzaftVar) {
        return zzaftVar.zzl(zzago.zzf(obj, i10 & 1048575));
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        if (zzago.zzc(obj, zzr(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzago.zzf(obj, j10)).booleanValue();
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzago.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzago.zzf(obj, j10)).floatValue();
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzago.zzf(obj, j10)).intValue();
    }

    private static long zzv(Object obj, long j10) {
        return ((Long) zzago.zzf(obj, j10)).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzQ(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.ads.interactivemedia.v3.internal.zzady
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.ads.interactivemedia.v3.internal.zzady r0 = (com.google.ads.interactivemedia.v3.internal.zzady) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzaN(r2)
            r0.zza = r1
            r0.zzaL()
        L1b:
            int[] r0 = r7.zzc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.zzu(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzt(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L71
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L71;
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
            goto L84
        L3d:
            sun.misc.Unsafe r2 = com.google.ads.interactivemedia.v3.internal.zzafe.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.ads.interactivemedia.v3.internal.zzaev r6 = (com.google.ads.interactivemedia.v3.internal.zzaev) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.ads.interactivemedia.v3.internal.zzago.zzf(r8, r3)
            com.google.ads.interactivemedia.v3.internal.zzaed r2 = (com.google.ads.interactivemedia.v3.internal.zzaed) r2
            r2.zzb()
            goto L84
        L59:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzR(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.ads.interactivemedia.v3.internal.zzaft r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.ads.interactivemedia.v3.internal.zzafe.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
            goto L84
        L71:
            boolean r2 = r7.zzN(r8, r1)
            if (r2 == 0) goto L84
            com.google.ads.interactivemedia.v3.internal.zzaft r2 = r7.zzx(r1)
            sun.misc.Unsafe r5 = com.google.ads.interactivemedia.v3.internal.zzafe.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zzf(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.ads.interactivemedia.v3.internal.zzagh r0 = r7.zzm
            r0.zzi(r8)
            boolean r0 = r7.zzh
            if (r0 == 0) goto L95
            com.google.ads.interactivemedia.v3.internal.zzadl r0 = r7.zzn
            r0.zza(r8)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzafe.zzf(java.lang.Object):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaft
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            int i11 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i12 = iArr[i10];
            long j10 = i11;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzago.zzo(obj, j10, zzago.zza(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i10)) {
                        zzago.zzp(obj, j10, zzago.zzb(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i10)) {
                        zzago.zzr(obj, j10, zzago.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i10)) {
                        zzago.zzr(obj, j10, zzago.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i10)) {
                        zzago.zzq(obj, j10, zzago.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i10)) {
                        zzago.zzr(obj, j10, zzago.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i10)) {
                        zzago.zzq(obj, j10, zzago.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i10)) {
                        zzago.zzm(obj, j10, zzago.zzw(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i10)) {
                        zzago.zzs(obj, j10, zzago.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (zzN(obj2, i10)) {
                        zzago.zzs(obj, j10, zzago.zzf(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i10)) {
                        zzago.zzq(obj, j10, zzago.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i10)) {
                        zzago.zzq(obj, j10, zzago.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i10)) {
                        zzago.zzq(obj, j10, zzago.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i10)) {
                        zzago.zzr(obj, j10, zzago.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i10)) {
                        zzago.zzq(obj, j10, zzago.zzc(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i10)) {
                        zzago.zzr(obj, j10, zzago.zzd(obj2, j10));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i10);
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
                    zzaed zzaedVarZzd = (zzaed) zzago.zzf(obj, j10);
                    zzaed zzaedVar = (zzaed) zzago.zzf(obj2, j10);
                    int size = zzaedVarZzd.size();
                    int size2 = zzaedVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzaedVarZzd.zzc()) {
                            zzaedVarZzd = zzaedVarZzd.zzd(size2 + size);
                        }
                        zzaedVarZzd.addAll(zzaedVar);
                    }
                    if (size > 0) {
                        zzaedVar = zzaedVarZzd;
                    }
                    zzago.zzs(obj, j10, zzaedVar);
                    break;
                case 50:
                    int i13 = zzafv.zza;
                    zzago.zzs(obj, j10, zzaew.zzb(zzago.zzf(obj, j10), zzago.zzf(obj2, j10)));
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
                    if (zzR(obj2, i12, i10)) {
                        zzago.zzs(obj, j10, zzago.zzf(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i12, i10)) {
                        zzago.zzs(obj, j10, zzago.zzf(obj2, j10));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i10);
                    break;
            }
        }
        zzafv.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzafv.zzp(this.zzn, obj, obj2);
        }
    }
}
