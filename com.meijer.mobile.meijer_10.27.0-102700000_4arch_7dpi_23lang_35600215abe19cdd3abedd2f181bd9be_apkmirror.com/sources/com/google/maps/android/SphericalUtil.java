package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* loaded from: classes7.dex */
public class SphericalUtil {
    public static double computeSignedArea(List<LatLng> list) {
        return computeSignedArea(list, 6371009.0d);
    }

    private static double distanceRadians(double d10, double d11, double d12, double d13) {
        return MathUtil.arcHav(MathUtil.havDistance(d10, d12, d11 - d13));
    }

    private static double polarTriangleArea(double d10, double d11, double d12, double d13) {
        double d14 = d11 - d13;
        double d15 = d10 * d12;
        return Math.atan2(Math.sin(d14) * d15, (d15 * Math.cos(d14)) + 1.0d) * 2.0d;
    }

    static double computeAngleBetween(LatLng latLng, LatLng latLng2) {
        return distanceRadians(Math.toRadians(latLng.f84814a), Math.toRadians(latLng.f84815b), Math.toRadians(latLng2.f84814a), Math.toRadians(latLng2.f84815b));
    }

    public static double computeHeading(LatLng latLng, LatLng latLng2) {
        double radians = Math.toRadians(latLng.f84814a);
        double radians2 = Math.toRadians(latLng.f84815b);
        double radians3 = Math.toRadians(latLng2.f84814a);
        double radians4 = Math.toRadians(latLng2.f84815b) - radians2;
        return MathUtil.wrap(Math.toDegrees(Math.atan2(Math.sin(radians4) * Math.cos(radians3), (Math.cos(radians) * Math.sin(radians3)) - ((Math.sin(radians) * Math.cos(radians3)) * Math.cos(radians4)))), -180.0d, 180.0d);
    }

    public static LatLng computeOffsetOrigin(LatLng latLng, double d10, double d11) {
        double radians = Math.toRadians(d11);
        double d12 = d10 / 6371009.0d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12) * Math.cos(radians);
        double dSin2 = Math.sin(d12) * Math.sin(radians);
        double dSin3 = Math.sin(Math.toRadians(latLng.f84814a));
        double d13 = dCos * dCos;
        double d14 = dSin * dSin;
        double d15 = ((d14 * d13) + (d13 * d13)) - ((d13 * dSin3) * dSin3);
        if (d15 < 0.0d) {
            return null;
        }
        double d16 = dSin * dSin3;
        double d17 = d13 + d14;
        double dSqrt = (d16 + Math.sqrt(d15)) / d17;
        double d18 = (dSin3 - (dSin * dSqrt)) / dCos;
        double dAtan2 = Math.atan2(d18, dSqrt);
        if (dAtan2 < -1.5707963267948966d || dAtan2 > 1.5707963267948966d) {
            dAtan2 = Math.atan2(d18, (d16 - Math.sqrt(d15)) / d17);
        }
        if (dAtan2 < -1.5707963267948966d || dAtan2 > 1.5707963267948966d) {
            return null;
        }
        return new LatLng(Math.toDegrees(dAtan2), Math.toDegrees(Math.toRadians(latLng.f84815b) - Math.atan2(dSin2, (dCos * Math.cos(dAtan2)) - (dSin * Math.sin(dAtan2)))));
    }

    static double computeSignedArea(List<LatLng> list, double d10) {
        int size = list.size();
        double dPolarTriangleArea = 0.0d;
        if (size < 3) {
            return 0.0d;
        }
        LatLng latLng = list.get(size - 1);
        double dTan = Math.tan((1.5707963267948966d - Math.toRadians(latLng.f84814a)) / 2.0d);
        double radians = Math.toRadians(latLng.f84815b);
        double d11 = dTan;
        double d12 = radians;
        for (LatLng latLng2 : list) {
            double dTan2 = Math.tan((1.5707963267948966d - Math.toRadians(latLng2.f84814a)) / 2.0d);
            double radians2 = Math.toRadians(latLng2.f84815b);
            dPolarTriangleArea += polarTriangleArea(dTan2, radians2, d11, d12);
            d11 = dTan2;
            d12 = radians2;
        }
        return dPolarTriangleArea * d10 * d10;
    }

    public static LatLng interpolate(LatLng latLng, LatLng latLng2, double d10) {
        double radians = Math.toRadians(latLng.f84814a);
        double radians2 = Math.toRadians(latLng.f84815b);
        double radians3 = Math.toRadians(latLng2.f84814a);
        double radians4 = Math.toRadians(latLng2.f84815b);
        double dCos = Math.cos(radians);
        double dCos2 = Math.cos(radians3);
        double dComputeAngleBetween = computeAngleBetween(latLng, latLng2);
        double dSin = Math.sin(dComputeAngleBetween);
        if (dSin < 1.0E-6d) {
            double d11 = latLng.f84814a;
            double d12 = d11 + ((latLng2.f84814a - d11) * d10);
            double d13 = latLng.f84815b;
            return new LatLng(d12, d13 + ((latLng2.f84815b - d13) * d10));
        }
        double dSin2 = Math.sin((1.0d - d10) * dComputeAngleBetween) / dSin;
        double dSin3 = Math.sin(dComputeAngleBetween * d10) / dSin;
        double d14 = dCos * dSin2;
        double d15 = dCos2 * dSin3;
        double dCos3 = (Math.cos(radians2) * d14) + (Math.cos(radians4) * d15);
        double dSin4 = (d14 * Math.sin(radians2)) + (d15 * Math.sin(radians4));
        return new LatLng(Math.toDegrees(Math.atan2((Math.sin(radians) * dSin2) + (dSin3 * Math.sin(radians3)), Math.sqrt((dCos3 * dCos3) + (dSin4 * dSin4)))), Math.toDegrees(Math.atan2(dSin4, dCos3)));
    }

    private SphericalUtil() {
    }

    public static double computeArea(List<LatLng> list) {
        return Math.abs(computeSignedArea(list));
    }

    public static double computeDistanceBetween(LatLng latLng, LatLng latLng2) {
        return computeAngleBetween(latLng, latLng2) * 6371009.0d;
    }

    public static double computeLength(List<LatLng> list) {
        double dDistanceRadians = 0.0d;
        if (list.size() < 2) {
            return 0.0d;
        }
        LatLng latLng = null;
        for (LatLng latLng2 : list) {
            if (latLng != null) {
                dDistanceRadians += distanceRadians(Math.toRadians(latLng.f84814a), Math.toRadians(latLng.f84815b), Math.toRadians(latLng2.f84814a), Math.toRadians(latLng2.f84815b));
            }
            latLng = latLng2;
        }
        return dDistanceRadians * 6371009.0d;
    }

    public static LatLng computeOffset(LatLng latLng, double d10, double d11) {
        double d12 = d10 / 6371009.0d;
        double radians = Math.toRadians(d11);
        double radians2 = Math.toRadians(latLng.f84814a);
        double radians3 = Math.toRadians(latLng.f84815b);
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double dSin2 = Math.sin(radians2);
        double dCos2 = dSin * Math.cos(radians2);
        double dCos3 = (dCos * dSin2) + (Math.cos(radians) * dCos2);
        return new LatLng(Math.toDegrees(Math.asin(dCos3)), Math.toDegrees(radians3 + Math.atan2(dCos2 * Math.sin(radians), dCos - (dSin2 * dCos3))));
    }
}
