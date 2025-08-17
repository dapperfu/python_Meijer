package com.google.android.libraries.places.internal;

import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import fsimpl.C14045dq;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes6.dex */
final class zzbzn {
    private static final int[] zza = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, BinsView.TOTE_HEIGHT_DP, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    private static final byte[] zzb = {C14045dq.DARKEN, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, C14045dq.XOR, C14045dq.DARKEN, 6, 8, C14045dq.DST_ATOP, 10, 10, 8, C14045dq.DST_ATOP, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, C14045dq.MULTIPLY, 6, C14045dq.XOR, 10, C14045dq.DARKEN, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, C14045dq.DARKEN, 19, C14045dq.DARKEN, C14045dq.LIGHTEN, 6, C14045dq.MULTIPLY, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, C14045dq.MULTIPLY, C14045dq.DST_ATOP, C14045dq.LIGHTEN, C14045dq.DARKEN, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
    private static final zzbzn zzc = new zzbzn();
    private final zzbzm zzd = new zzbzm();

    public static zzbzn zza() {
        return zzc;
    }

    final byte[] zzb(byte[] bArr) throws IOException {
        int i10;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzbzm zzbzmVar = this.zzd;
        int i11 = 0;
        zzbzm zzbzmVar2 = zzbzmVar;
        int i12 = 0;
        int iZzc = 0;
        while (i11 < bArr.length) {
            int i13 = bArr[i11] & 255;
            int i14 = i12 << 8;
            iZzc += 8;
            while (true) {
                i10 = i14 | i13;
                if (iZzc >= 8) {
                    int i15 = iZzc - 8;
                    zzbzmVar2 = zzbzmVar2.zza()[(i10 >>> i15) & l3.f92484c];
                    if (zzbzmVar2.zza() == null) {
                        byteArrayOutputStream.write(zzbzmVar2.zzb());
                        iZzc -= zzbzmVar2.zzc();
                        zzbzmVar2 = zzbzmVar;
                    } else {
                        iZzc = i15;
                    }
                }
            }
            i11++;
            i12 = i10;
        }
        while (iZzc > 0) {
            zzbzm zzbzmVar3 = zzbzmVar2.zza()[(i12 << (8 - iZzc)) & l3.f92484c];
            if (zzbzmVar3.zza() != null || zzbzmVar3.zzc() > iZzc) {
                break;
            }
            byteArrayOutputStream.write(zzbzmVar3.zzb());
            iZzc -= zzbzmVar3.zzc();
            zzbzmVar2 = zzbzmVar;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private zzbzn() {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = zza[i10];
            int i12 = zzb[i10];
            zzbzm zzbzmVar = new zzbzm(i10, i12);
            zzbzm zzbzmVar2 = this.zzd;
            while (i12 > 8) {
                i12 -= 8;
                int i13 = (i11 >>> i12) & l3.f92484c;
                if (zzbzmVar2.zza() != null) {
                    if (zzbzmVar2.zza()[i13] == null) {
                        zzbzmVar2.zza()[i13] = new zzbzm();
                    }
                    zzbzmVar2 = zzbzmVar2.zza()[i13];
                } else {
                    throw new IllegalStateException("invalid dictionary: prefix not unique");
                }
            }
            int i14 = 8 - i12;
            int i15 = (i11 << i14) & l3.f92484c;
            for (int i16 = i15; i16 < (1 << i14) + i15; i16++) {
                zzbzmVar2.zza()[i16] = zzbzmVar;
            }
        }
    }
}
