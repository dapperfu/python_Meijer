package com.google.maps.internal;

import com.google.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public class PolylineEncoding {
    public static String encode(List<LatLng> list) {
        StringBuilder sb2 = new StringBuilder();
        long j10 = 0;
        long j11 = 0;
        for (LatLng latLng : list) {
            long jRound = Math.round(latLng.lat * 100000.0d);
            long jRound2 = Math.round(latLng.lng * 100000.0d);
            encode(jRound - j10, sb2);
            encode(jRound2 - j11, sb2);
            j10 = jRound;
            j11 = jRound2;
        }
        return sb2.toString();
    }

    public static List<LatLng> decode(String str) {
        int i10;
        int i11;
        int i12;
        int i13;
        int length = str.length();
        ArrayList arrayList = new ArrayList(length / 2);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < length) {
            int i17 = 1;
            int i18 = 0;
            int i19 = 1;
            while (true) {
                i10 = i14 + 1;
                int iCharAt = str.charAt(i14) - '@';
                i19 += iCharAt << i18;
                i18 += 5;
                if (iCharAt < 31) {
                    break;
                }
                i14 = i10;
            }
            if ((i19 & 1) != 0) {
                i11 = ~(i19 >> 1);
            } else {
                i11 = i19 >> 1;
            }
            int i20 = i11 + i15;
            int i21 = 0;
            while (true) {
                i12 = i10 + 1;
                int iCharAt2 = str.charAt(i10) - '@';
                i17 += iCharAt2 << i21;
                i21 += 5;
                if (iCharAt2 < 31) {
                    break;
                }
                i10 = i12;
            }
            if ((i17 & 1) != 0) {
                i13 = ~(i17 >> 1);
            } else {
                i13 = i17 >> 1;
            }
            i16 += i13;
            arrayList.add(new LatLng(i20 * 1.0E-5d, i16 * 1.0E-5d));
            i15 = i20;
            i14 = i12;
        }
        return arrayList;
    }

    private static void encode(long j10, StringBuilder sb2) {
        long j11 = j10 << 1;
        if (j10 < 0) {
            j11 = ~j11;
        }
        while (j11 >= 32) {
            sb2.append(Character.toChars((int) ((32 | (31 & j11)) + 63)));
            j11 >>= 5;
        }
        sb2.append(Character.toChars((int) (j11 + 63)));
    }

    public static String encode(LatLng[] latLngArr) {
        return encode((List<LatLng>) Arrays.asList(latLngArr));
    }
}
