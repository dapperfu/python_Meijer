package com.google.android.libraries.places.internal;

import He.d;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class zzbqj {
    private static final long zza = TimeUnit.SECONDS.toNanos(1);

    public static List zzj(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!(list.get(i10) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i10), Integer.valueOf(i10), list));
            }
        }
        return list;
    }

    public static List zza(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List zzb(Map map, String str) {
        List listZza = zza(map, str);
        if (listZza == null) {
            return null;
        }
        zzj(listZza);
        return listZza;
    }

    public static List zzc(Map map, String str) {
        List listZza = zza(map, str);
        if (listZza == null) {
            return null;
        }
        for (int i10 = 0; i10 < listZza.size(); i10++) {
            if (!(listZza.get(i10) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listZza.get(i10), Integer.valueOf(i10), listZza));
            }
        }
        return listZza;
    }

    public static Map zzd(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static Double zze(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
            }
        }
        throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
    }

    public static Integer zzf(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            Double d10 = (Double) obj;
            int iIntValue = d10.intValue();
            if (iIntValue == d10.doubleValue()) {
                return Integer.valueOf(iIntValue);
            }
            new StringBuilder(String.valueOf(d10).length() + 31);
            throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(d10)));
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
    }

    public static String zzg(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long zzh(Map map, String str) throws NumberFormatException, ParseException {
        boolean z10;
        int iCharAt;
        boolean z11;
        String strZzg = zzg(map, str);
        if (strZzg == null) {
            return null;
        }
        try {
            boolean z12 = false;
            if (!strZzg.isEmpty() && strZzg.charAt(strZzg.length() - 1) == 's') {
                if (strZzg.charAt(0) == '-') {
                    strZzg = strZzg.substring(1);
                    z10 = true;
                } else {
                    z10 = false;
                }
                String strSubstring = strZzg.substring(0, strZzg.length() - 1);
                String strSubstring2 = "";
                int iIndexOf = strSubstring.indexOf(46);
                if (iIndexOf != -1) {
                    strSubstring2 = strSubstring.substring(iIndexOf + 1);
                    strSubstring = strSubstring.substring(0, iIndexOf);
                }
                long jA = Long.parseLong(strSubstring);
                if (strSubstring2.isEmpty()) {
                    iCharAt = 0;
                } else {
                    iCharAt = 0;
                    for (int i10 = 0; i10 < 9; i10++) {
                        iCharAt *= 10;
                        if (i10 < strSubstring2.length()) {
                            if (strSubstring2.charAt(i10) >= '0' && strSubstring2.charAt(i10) <= '9') {
                                iCharAt += strSubstring2.charAt(i10) - '0';
                            } else {
                                throw new ParseException("Invalid nanoseconds.", 0);
                            }
                        }
                    }
                }
                if (jA >= 0) {
                    if (z10) {
                        jA = -jA;
                        iCharAt = -iCharAt;
                    }
                    long j10 = iCharAt;
                    try {
                        long j11 = zza;
                        if (j10 <= (-j11) || j10 >= j11) {
                            jA = d.a(jA, j10 / j11);
                            iCharAt = (int) (j10 % j11);
                        }
                        if (jA > 0 && iCharAt < 0) {
                            jA--;
                            iCharAt = (int) (iCharAt + j11);
                        }
                        if (jA < 0 && iCharAt > 0) {
                            jA++;
                            iCharAt = (int) (iCharAt - j11);
                        }
                        if (jA >= -315576000000L && jA <= 315576000000L) {
                            long j12 = iCharAt;
                            if (j12 >= -999999999 && j12 < j11 && ((jA >= 0 && iCharAt >= 0) || (jA <= 0 && iCharAt <= 0))) {
                                long nanos = TimeUnit.SECONDS.toNanos(jA);
                                long j13 = nanos + j12;
                                long j14 = j12 ^ nanos;
                                if ((nanos ^ j13) >= 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (j14 < 0) {
                                    z12 = true;
                                }
                                if (!(z12 | z11)) {
                                    j13 = ((j13 >>> 63) ^ 1) + Long.MAX_VALUE;
                                }
                                return Long.valueOf(j13);
                            }
                        }
                        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(jA), Integer.valueOf(iCharAt)));
                    } catch (IllegalArgumentException unused) {
                        throw new ParseException("Duration value is out of range.", 0);
                    }
                }
                throw new ParseException("Invalid duration string: ".concat(strZzg), 0);
            }
            throw new ParseException("Invalid duration string: ".concat(strZzg), 0);
        } catch (ParseException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static Boolean zzi(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }
}
