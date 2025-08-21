package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* loaded from: classes8.dex */
public class PolyUtil {
    public static final double DEFAULT_TOLERANCE = 0.1d;

    public static boolean containsLocation(LatLng latLng, List<LatLng> list, boolean z10) {
        return containsLocation(latLng.f85654a, latLng.f85655b, list, z10);
    }

    public static String encode(List<LatLng> list) {
        StringBuffer stringBuffer = new StringBuffer();
        long j10 = 0;
        long j11 = 0;
        for (LatLng latLng : list) {
            long jRound = Math.round(latLng.f85654a * 100000.0d);
            long jRound2 = Math.round(latLng.f85655b * 100000.0d);
            encode(jRound - j10, stringBuffer);
            encode(jRound2 - j11, stringBuffer);
            j10 = jRound;
            j11 = jRound2;
        }
        return stringBuffer.toString();
    }

    public static boolean isClosedPolygon(List<LatLng> list) {
        return list.get(0).equals(list.get(list.size() - 1));
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z10, double d10) {
        return isLocationOnEdgeOrPath(latLng, list, true, z10, d10);
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z10, double d10) {
        return isLocationOnEdgeOrPath(latLng, list, false, z10, d10);
    }

    public static int locationIndexOnPath(LatLng latLng, List<LatLng> list, boolean z10, double d10) {
        return locationIndexOnEdgeOrPath(latLng, list, false, z10, d10);
    }

    public static boolean containsLocation(double d10, double d11, List<LatLng> list, boolean z10) {
        int size = list.size();
        boolean z11 = false;
        if (size == 0) {
            return false;
        }
        double radians = Math.toRadians(d10);
        double radians2 = Math.toRadians(d11);
        LatLng latLng = list.get(size - 1);
        double radians3 = Math.toRadians(latLng.f85654a);
        double radians4 = Math.toRadians(latLng.f85655b);
        int i10 = 0;
        double d12 = radians3;
        for (LatLng latLng2 : list) {
            double dWrap = MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
            if (radians == d12 && dWrap == 0.0d) {
                return true;
            }
            boolean z12 = z11;
            double radians5 = Math.toRadians(latLng2.f85654a);
            double radians6 = Math.toRadians(latLng2.f85655b);
            if (intersects(d12, radians5, MathUtil.wrap(radians6 - radians4, -3.141592653589793d, 3.141592653589793d), radians, dWrap, z10)) {
                i10++;
            }
            d12 = radians5;
            z11 = z12;
            radians4 = radians6;
        }
        boolean z13 = z11;
        if ((i10 & 1) != 0) {
            return true;
        }
        return z13;
    }

    public static double distanceToLine(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        if (latLng2.equals(latLng3)) {
            return SphericalUtil.computeDistanceBetween(latLng3, latLng);
        }
        double radians = Math.toRadians(latLng.f85654a);
        double radians2 = Math.toRadians(latLng.f85655b);
        double radians3 = Math.toRadians(latLng2.f85654a);
        double radians4 = Math.toRadians(latLng2.f85655b);
        double radians5 = Math.toRadians(latLng3.f85654a);
        double radians6 = Math.toRadians(latLng3.f85655b);
        double dCos = Math.cos(radians3);
        double d10 = radians5 - radians3;
        double d11 = (radians6 - radians4) * dCos;
        double d12 = (((radians - radians3) * d10) + (((radians2 - radians4) * dCos) * d11)) / ((d10 * d10) + (d11 * d11));
        if (d12 <= 0.0d) {
            return SphericalUtil.computeDistanceBetween(latLng, latLng2);
        }
        if (d12 >= 1.0d) {
            return SphericalUtil.computeDistanceBetween(latLng, latLng3);
        }
        double d13 = latLng2.f85654a;
        double d14 = d13 + ((latLng3.f85654a - d13) * d12);
        double d15 = latLng2.f85655b;
        return SphericalUtil.computeDistanceBetween(latLng, new LatLng(d14, d15 + (d12 * (latLng3.f85655b - d15))));
    }

    private static boolean intersects(double d10, double d11, double d12, double d13, double d14, boolean z10) {
        if ((d14 >= 0.0d && d14 >= d12) || ((d14 < 0.0d && d14 < d12) || d13 <= -1.5707963267948966d || d10 <= -1.5707963267948966d || d11 <= -1.5707963267948966d || d10 >= 1.5707963267948966d || d11 >= 1.5707963267948966d || d12 <= -3.141592653589793d)) {
            return false;
        }
        double d15 = (((d12 - d14) * d10) + (d11 * d14)) / d12;
        if (d10 >= 0.0d && d11 >= 0.0d && d13 < d15) {
            return false;
        }
        if ((d10 > 0.0d || d11 > 0.0d || d13 < d15) && d13 < 1.5707963267948966d) {
            return z10 ? Math.tan(d13) >= tanLatGC(d10, d11, d12, d14) : MathUtil.mercator(d13) >= mercatorLatRhumb(d10, d11, d12, d14);
        }
        return true;
    }

    public static boolean isLocationOnEdge(LatLng latLng, List<LatLng> list, boolean z10) {
        return isLocationOnEdge(latLng, list, z10, 0.1d);
    }

    public static boolean isLocationOnPath(LatLng latLng, List<LatLng> list, boolean z10) {
        return isLocationOnPath(latLng, list, z10, 0.1d);
    }

    private static boolean isOnSegmentGC(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        double dHavDistance = MathUtil.havDistance(d10, d14, d11 - d15);
        if (dHavDistance <= d16) {
            return true;
        }
        double dHavDistance2 = MathUtil.havDistance(d12, d14, d13 - d15);
        if (dHavDistance2 <= d16) {
            return true;
        }
        double dHavFromSin = MathUtil.havFromSin(MathUtil.sinFromHav(dHavDistance) * sinDeltaBearing(d10, d11, d12, d13, d14, d15));
        if (dHavFromSin > d16) {
            return false;
        }
        double dHavDistance3 = MathUtil.havDistance(d10, d12, d11 - d13);
        double d17 = ((1.0d - (dHavDistance3 * 2.0d)) * dHavFromSin) + dHavDistance3;
        if (dHavDistance <= d17 && dHavDistance2 <= d17) {
            if (dHavDistance3 < 0.74d) {
                return true;
            }
            double d18 = 1.0d - (2.0d * dHavFromSin);
            if (MathUtil.sinSumFromHav((dHavDistance - dHavFromSin) / d18, (dHavDistance2 - dHavFromSin) / d18) > 0.0d) {
                return true;
            }
        }
        return false;
    }

    public static int locationIndexOnEdgeOrPath(LatLng latLng, List<LatLng> list, boolean z10, boolean z11, double d10) {
        int i10;
        double d11;
        int size = list.size();
        int i11 = -1;
        if (size == 0) {
            return -1;
        }
        double d12 = d10 / 6371009.0d;
        double dHav = MathUtil.hav(d12);
        double radians = Math.toRadians(latLng.f85654a);
        double radians2 = Math.toRadians(latLng.f85655b);
        int i12 = 0;
        LatLng latLng2 = list.get(z10 ? size - 1 : 0);
        double radians3 = Math.toRadians(latLng2.f85654a);
        double radians4 = Math.toRadians(latLng2.f85655b);
        if (z11) {
            int i13 = 0;
            double d13 = radians3;
            double d14 = radians4;
            for (LatLng latLng3 : list) {
                double radians5 = Math.toRadians(latLng3.f85654a);
                double radians6 = Math.toRadians(latLng3.f85655b);
                if (isOnSegmentGC(d13, d14, radians5, radians6, radians, radians2, dHav)) {
                    return Math.max(0, i13 - 1);
                }
                i13++;
                d13 = radians5;
                d14 = radians6;
            }
        } else {
            double d15 = radians - d12;
            double d16 = d12 + radians;
            double dMercator = MathUtil.mercator(radians3);
            double dMercator2 = MathUtil.mercator(radians);
            Iterator<LatLng> it = list.iterator();
            int i14 = 0;
            while (it.hasNext()) {
                LatLng next = it.next();
                int i15 = i11;
                double d17 = d16;
                double radians7 = Math.toRadians(next.f85654a);
                double dMercator3 = MathUtil.mercator(radians7);
                int i16 = i12;
                Iterator<LatLng> it2 = it;
                double radians8 = Math.toRadians(next.f85655b);
                if (Math.max(radians3, radians7) < d15 || Math.min(radians3, radians7) > d17) {
                    i10 = i16;
                    d11 = radians;
                } else {
                    double dWrap = MathUtil.wrap(radians8 - radians4, -3.141592653589793d, 3.141592653589793d);
                    double dWrap2 = MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
                    double[] dArr = new double[3];
                    dArr[i16] = dWrap2;
                    dArr[1] = dWrap2 + 6.283185307179586d;
                    dArr[2] = dWrap2 - 6.283185307179586d;
                    int i17 = i16;
                    while (i17 < 3) {
                        double d18 = dArr[i17];
                        double d19 = dMercator3 - dMercator;
                        double d20 = (dWrap * dWrap) + (d19 * d19);
                        double dClamp = d20 > 0.0d ? MathUtil.clamp(((d18 * dWrap) + ((dMercator2 - dMercator) * d19)) / d20, 0.0d, 1.0d) : 0.0d;
                        double d21 = radians;
                        if (MathUtil.havDistance(d21, MathUtil.inverseMercator(dMercator + (dClamp * d19)), d18 - (dClamp * dWrap)) < dHav) {
                            return Math.max(i16, i14 - 1);
                        }
                        i17++;
                        radians = d21;
                    }
                    d11 = radians;
                    i10 = i16;
                }
                i14++;
                i12 = i10;
                radians4 = radians8;
                radians3 = radians7;
                i11 = i15;
                d16 = d17;
                dMercator = dMercator3;
                it = it2;
                radians = d11;
            }
        }
        return i11;
    }

    public static int locationIndexOnPath(LatLng latLng, List<LatLng> list, boolean z10) {
        return locationIndexOnPath(latLng, list, z10, 0.1d);
    }

    public static List<LatLng> simplify(List<LatLng> list, double d10) {
        LatLng latLng;
        int size = list.size();
        int i10 = 1;
        if (size < 1) {
            throw new IllegalArgumentException("Polyline must have at least 1 point");
        }
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("Tolerance must be greater than zero");
        }
        boolean zIsClosedPolygon = isClosedPolygon(list);
        if (zIsClosedPolygon) {
            latLng = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(new LatLng(latLng.f85654a + 1.0E-11d, latLng.f85655b + 1.0E-11d));
        } else {
            latLng = null;
        }
        Stack stack = new Stack();
        double[] dArr = new double[size];
        int i11 = 0;
        dArr[0] = 1.0d;
        int i12 = size - 1;
        dArr[i12] = 1.0d;
        if (size > 2) {
            stack.push(new int[]{0, i12});
            int i13 = 0;
            while (stack.size() > 0) {
                int[] iArr = (int[]) stack.pop();
                int i14 = iArr[0] + i10;
                double d11 = 0.0d;
                while (i14 < iArr[i10]) {
                    int i15 = i10;
                    double dDistanceToLine = distanceToLine(list.get(i14), list.get(iArr[0]), list.get(iArr[i15]));
                    if (dDistanceToLine > d11) {
                        i13 = i14;
                        d11 = dDistanceToLine;
                    }
                    i14++;
                    i10 = i15;
                }
                int i16 = i10;
                if (d11 > d10) {
                    dArr[i13] = d11;
                    stack.push(new int[]{iArr[0], i13});
                    stack.push(new int[]{i13, iArr[i16]});
                }
                i10 = i16;
            }
        }
        if (zIsClosedPolygon) {
            list.remove(list.size() - 1);
            list.add(latLng);
        }
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng2 : list) {
            if (dArr[i11] != 0.0d) {
                arrayList.add(latLng2);
            }
            i11++;
        }
        return arrayList;
    }

    private PolyUtil() {
    }

    public static List<LatLng> decode(String str) {
        int i10;
        int i11;
        int i12;
        int i13;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
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

    private static boolean isLocationOnEdgeOrPath(LatLng latLng, List<LatLng> list, boolean z10, boolean z11, double d10) {
        if (locationIndexOnEdgeOrPath(latLng, list, z10, z11, d10) >= 0) {
            return true;
        }
        return false;
    }

    private static double mercatorLatRhumb(double d10, double d11, double d12, double d13) {
        return ((MathUtil.mercator(d10) * (d12 - d13)) + (MathUtil.mercator(d11) * d13)) / d12;
    }

    private static double sinDeltaBearing(double d10, double d11, double d12, double d13, double d14, double d15) {
        double dSin = Math.sin(d10);
        double dCos = Math.cos(d12);
        double dCos2 = Math.cos(d14);
        double d16 = d15 - d11;
        double d17 = d13 - d11;
        double dSin2 = Math.sin(d16) * dCos2;
        double dSin3 = Math.sin(d17) * dCos;
        double d18 = dSin * 2.0d;
        double dSin4 = Math.sin(d14 - d10) + (dCos2 * d18 * MathUtil.hav(d16));
        double dSin5 = Math.sin(d12 - d10) + (d18 * dCos * MathUtil.hav(d17));
        double d19 = ((dSin2 * dSin2) + (dSin4 * dSin4)) * ((dSin3 * dSin3) + (dSin5 * dSin5));
        if (d19 <= 0.0d) {
            return 1.0d;
        }
        return ((dSin2 * dSin5) - (dSin4 * dSin3)) / Math.sqrt(d19);
    }

    private static double tanLatGC(double d10, double d11, double d12, double d13) {
        return ((Math.tan(d10) * Math.sin(d12 - d13)) + (Math.tan(d11) * Math.sin(d13))) / Math.sin(d12);
    }

    private static void encode(long j10, StringBuffer stringBuffer) {
        long j11 = j10 << 1;
        if (j10 < 0) {
            j11 = ~j11;
        }
        while (j11 >= 32) {
            stringBuffer.append(Character.toChars((int) ((32 | (31 & j11)) + 63)));
            j11 >>= 5;
        }
        stringBuffer.append(Character.toChars((int) (j11 + 63)));
    }
}
