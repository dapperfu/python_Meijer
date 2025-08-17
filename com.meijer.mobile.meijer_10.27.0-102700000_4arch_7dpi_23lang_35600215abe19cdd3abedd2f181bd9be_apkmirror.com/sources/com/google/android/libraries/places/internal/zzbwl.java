package com.google.android.libraries.places.internal;

import com.google.common.io.BaseEncoding;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzbwl {
    private static final Logger zza = Logger.getLogger(zzbwl.class.getName());
    private static final byte[] zzb = "-bin".getBytes(StandardCharsets.US_ASCII);

    private zzbwl() {
    }

    public static byte[][] zzb(byte[][] bArr) {
        int i10 = 0;
        while (i10 < bArr.length) {
            byte[] bArr2 = bArr[i10];
            int i11 = i10 + 1;
            byte[] bArr3 = bArr[i11];
            byte[] bArr4 = zzb;
            if (zzc(bArr2, bArr4)) {
                for (byte b10 : bArr3) {
                    if (b10 == 44) {
                        ArrayList arrayList = new ArrayList(bArr.length + 10);
                        for (int i12 = 0; i12 < i10; i12++) {
                            arrayList.add(bArr[i12]);
                        }
                        while (i10 < bArr.length) {
                            byte[] bArr5 = bArr[i10];
                            byte[] bArr6 = bArr[i10 + 1];
                            if (zzc(bArr5, bArr4)) {
                                int i13 = 0;
                                int i14 = 0;
                                while (true) {
                                    int length = bArr6.length;
                                    if (i13 <= length) {
                                        if (i13 == length || bArr6[i13] == 44) {
                                            byte[] bArrC = BaseEncoding.b().c(new String(bArr6, i14, i13 - i14, StandardCharsets.US_ASCII));
                                            arrayList.add(bArr5);
                                            arrayList.add(bArrC);
                                            i14 = i13 + 1;
                                        }
                                        i13++;
                                    }
                                }
                            } else {
                                arrayList.add(bArr5);
                                arrayList.add(bArr6);
                            }
                            i10 += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i11] = BaseEncoding.b().c(new String(bArr3, StandardCharsets.US_ASCII));
            }
            i10 += 2;
        }
        return bArr;
    }

    private static boolean zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i10 = length; i10 < bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10 - length]) {
                return false;
            }
        }
        return true;
    }

    public static byte[][] zza(zzbip zzbipVar) {
        int length;
        int i10;
        byte[][] bArrZzc = zzbhh.zzc(zzbipVar);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            length = bArrZzc.length;
            if (i11 >= length) {
                break;
            }
            byte[] bArr = bArrZzc[i11];
            byte[] bArr2 = bArrZzc[i11 + 1];
            if (zzc(bArr, zzb)) {
                i10 = i12 + 2;
                bArrZzc[i12] = bArr;
                bArrZzc[i12 + 1] = zzbhh.zzb.f(bArr2).getBytes(StandardCharsets.US_ASCII);
            } else {
                for (byte b10 : bArr2) {
                    if (b10 < 32 || b10 > 126) {
                        String str = new String(bArr, StandardCharsets.US_ASCII);
                        Logger logger = zza;
                        Level level = Level.WARNING;
                        String string = Arrays.toString(bArr2);
                        StringBuilder sb2 = new StringBuilder(str.length() + 21 + String.valueOf(string).length() + 34);
                        sb2.append("Metadata key=");
                        sb2.append(str);
                        sb2.append(", value=");
                        sb2.append(string);
                        sb2.append(" contains invalid ASCII characters");
                        logger.logp(level, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", sb2.toString());
                        break;
                    }
                }
                i10 = i12 + 2;
                bArrZzc[i12] = bArr;
                bArrZzc[i12 + 1] = bArr2;
            }
            i12 = i10;
            i11 += 2;
        }
        if (i12 == length) {
            return bArrZzc;
        }
        return (byte[][]) Arrays.copyOfRange(bArrZzc, 0, i12);
    }
}
