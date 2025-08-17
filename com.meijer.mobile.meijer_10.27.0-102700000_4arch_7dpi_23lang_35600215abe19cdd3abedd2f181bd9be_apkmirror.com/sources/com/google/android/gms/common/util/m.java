package com.google.android.gms.common.util;

import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes4.dex */
public class m {
    public static int a(byte[] bArr, int i10, int i11, int i12) {
        int i13;
        int i14 = i10;
        while (true) {
            i13 = (i11 & (-4)) + i10;
            if (i14 >= i13) {
                break;
            }
            int i15 = ((bArr[i14] & l3.f92484c) | ((bArr[i14 + 1] & l3.f92484c) << 8) | ((bArr[i14 + 2] & l3.f92484c) << 16) | (bArr[i14 + 3] << 24)) * (-862048943);
            int i16 = i12 ^ (((i15 >>> 17) | (i15 << 15)) * 461845907);
            i12 = (((i16 >>> 19) | (i16 << 13)) * 5) - 430675100;
            i14 += 4;
        }
        int i17 = i11 & 3;
        if (i17 == 1) {
            int i18 = ((bArr[i13] & l3.f92484c) | i) * (-862048943);
            i12 ^= ((i18 >>> 17) | (i18 << 15)) * 461845907;
        } else {
            if (i17 != 2) {
                i = i17 == 3 ? (bArr[i13 + 2] & l3.f92484c) << 16 : 0;
            }
            i |= (bArr[i13 + 1] & l3.f92484c) << 8;
            int i182 = ((bArr[i13] & l3.f92484c) | i) * (-862048943);
            i12 ^= ((i182 >>> 17) | (i182 << 15)) * 461845907;
        }
        int i19 = i12 ^ i11;
        int i20 = (i19 ^ (i19 >>> 16)) * (-2048144789);
        int i21 = (i20 ^ (i20 >>> 13)) * (-1028477387);
        return i21 ^ (i21 >>> 16);
    }
}
