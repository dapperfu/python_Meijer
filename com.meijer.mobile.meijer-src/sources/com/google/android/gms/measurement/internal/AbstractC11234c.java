package com.google.android.gms.measurement.internal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC11234c {

    /* renamed from: a, reason: collision with root package name */
    final String f86208a;

    /* renamed from: b, reason: collision with root package name */
    final int f86209b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f86210c;

    /* renamed from: d, reason: collision with root package name */
    Boolean f86211d;

    /* renamed from: e, reason: collision with root package name */
    Long f86212e;

    /* renamed from: f, reason: collision with root package name */
    Long f86213f;

    AbstractC11234c(String str, int i10) {
        this.f86208a = str;
        this.f86209b = i10;
    }

    private static Boolean d(String str, int i10, boolean z10, String str2, List list, String str3, C11343q2 c11343q2) {
        if (i10 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && i10 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i10 - 1) {
            case 1:
                if (str3 != null) {
                    try {
                        break;
                    } catch (PatternSyntaxException unused) {
                        if (c11343q2 != null) {
                            c11343q2.p().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                }
                break;
            case 6:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    abstract int a();

    abstract boolean b();

    abstract boolean c();

    static Boolean e(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    static Boolean g(long j10, com.google.android.gms.internal.measurement.F1 f12) {
        try {
            return j(new BigDecimal(j10), f12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean h(double d10, com.google.android.gms.internal.measurement.F1 f12) {
        try {
            return j(new BigDecimal(d10), f12, Math.ulp(d10));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean f(String str, com.google.android.gms.internal.measurement.L1 l12, C11343q2 c11343q2) {
        String strG;
        List list;
        String str2;
        com.google.android.gms.common.internal.r.l(l12);
        if (str == null || !l12.E() || l12.N() == 1 || (l12.N() != 7 ? !l12.F() : l12.K() == 0)) {
            return null;
        }
        int iN = l12.N();
        boolean zI = l12.I();
        if (!zI && iN != 2 && iN != 7) {
            strG = l12.G().toUpperCase(Locale.ENGLISH);
        } else {
            strG = l12.G();
        }
        String str3 = strG;
        if (l12.K() == 0) {
            list = null;
        } else {
            List listJ = l12.J();
            if (!zI) {
                ArrayList arrayList = new ArrayList(listJ.size());
                Iterator it = listJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listJ = Collections.unmodifiableList(arrayList);
            }
            list = listJ;
        }
        if (iN == 2) {
            str2 = str3;
        } else {
            str2 = null;
        }
        return d(str, iN, zI, str3, list, str2, c11343q2);
    }

    static Boolean i(String str, com.google.android.gms.internal.measurement.F1 f12) {
        if (!u6.M(str)) {
            return null;
        }
        try {
            return j(new BigDecimal(str), f12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean j(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.F1 f12, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        com.google.android.gms.common.internal.r.l(f12);
        if (f12.E()) {
            boolean z10 = true;
            if (f12.P() != 1) {
                if (f12.P() == 5) {
                    if (!f12.J() || !f12.L()) {
                        return null;
                    }
                } else if (!f12.H()) {
                    return null;
                }
                int iP = f12.P();
                if (f12.P() == 5) {
                    if (u6.M(f12.K()) && u6.M(f12.M())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(f12.K());
                            bigDecimal4 = new BigDecimal(f12.M());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!u6.M(f12.I())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(f12.I());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iP == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = iP - 1;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4 || bigDecimal3 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        }
                        if (bigDecimal2 == null) {
                            return null;
                        }
                        if (d10 != 0.0d) {
                            if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) >= 0) {
                                z10 = false;
                            }
                            return Boolean.valueOf(z10);
                        }
                        if (bigDecimal.compareTo(bigDecimal2) != 0) {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        }
        return null;
    }
}
