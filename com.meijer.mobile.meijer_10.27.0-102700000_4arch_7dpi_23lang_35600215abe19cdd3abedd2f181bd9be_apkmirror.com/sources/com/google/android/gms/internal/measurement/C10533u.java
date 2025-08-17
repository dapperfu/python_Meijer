package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10533u implements Iterable, InterfaceC10498q {

    /* renamed from: a, reason: collision with root package name */
    private final String f82422a;

    final /* synthetic */ String a() {
        return this.f82422a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final String zzc() {
        return this.f82422a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10533u) {
            return this.f82422a.equals(((C10533u) obj).f82422a);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v122 */
    /* JADX WARN: Type inference failed for: r1v123, types: [int] */
    /* JADX WARN: Type inference failed for: r1v156 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object, java.lang.String] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q f(String str, U1 u12, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c10;
        int i10;
        String strZzc;
        int i11;
        int i12;
        boolean z10;
        U1 u13;
        int i13;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                if (str.equals(str4)) {
                    c10 = 2;
                    break;
                } else {
                    c10 = 65535;
                    break;
                }
            case -1776922004:
                str5 = "charAt";
                str6 = "toString";
                if (str.equals(str6)) {
                    c10 = 14;
                    str4 = str2;
                    break;
                } else {
                    str4 = str2;
                    c10 = 65535;
                    break;
                }
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c10 = '\f';
                    str4 = str2;
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str6 = "toString";
                c10 = 65535;
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    str6 = "toString";
                    c10 = 0;
                    break;
                }
                str4 = str2;
                str6 = "toString";
                c10 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    c10 = 1;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c10 = 65535;
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c10 = '\r';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c10 = 65535;
                break;
            case -906336856:
                if (str.equals("search")) {
                    c10 = 7;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c10 = 65535;
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c10 = 11;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c10 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c10 = 4;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c10 = 65535;
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c10 = 15;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c10 = 65535;
                break;
            case 3568674:
                if (str.equals(str3)) {
                    c10 = 16;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c10 = 65535;
                break;
            case 103668165:
                if (str.equals("match")) {
                    c10 = 5;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c10 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c10 = '\b';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c10 = 65535;
                break;
            case 109648666:
                if (str.equals("split")) {
                    c10 = '\t';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c10 = 65535;
                break;
            case 530542161:
                if (str.equals("substring")) {
                    c10 = '\n';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c10 = 65535;
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    c10 = 6;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c10 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    c10 = 3;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c10 = 65535;
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                c10 = 65535;
                break;
        }
        String str7 = str5;
        switch (c10) {
            case 0:
                C10545v2.c(str7, 1, list);
                int i14 = !list.isEmpty() ? (int) C10545v2.i(u12.a((InterfaceC10498q) list.get(0)).zzd().doubleValue()) : 0;
                String str8 = this.f82422a;
                return (i14 < 0 || i14 >= str8.length()) ? InterfaceC10498q.f82349p3 : new C10533u(String.valueOf(str8.charAt(i14)));
            case 1:
                if (list.isEmpty()) {
                    return this;
                }
                StringBuilder sb2 = new StringBuilder(this.f82422a);
                for (int i15 = 0; i15 < list.size(); i15++) {
                    sb2.append(u12.a((InterfaceC10498q) list.get(i15)).zzc());
                }
                return new C10533u(sb2.toString());
            case 2:
                C10545v2.a(str4, 1, list);
                String str9 = this.f82422a;
                InterfaceC10498q interfaceC10498qA = u12.a((InterfaceC10498q) list.get(0));
                if ("length".equals(interfaceC10498qA.zzc())) {
                    return InterfaceC10498q.f82347n3;
                }
                double dDoubleValue = interfaceC10498qA.zzd().doubleValue();
                return (dDoubleValue != Math.floor(dDoubleValue) || (i10 = (int) dDoubleValue) < 0 || i10 >= str9.length()) ? InterfaceC10498q.f82348o3 : InterfaceC10498q.f82347n3;
            case 3:
                C10545v2.c("indexOf", 2, list);
                return new C10435j(Double.valueOf(this.f82422a.indexOf(list.size() > 0 ? u12.a((InterfaceC10498q) list.get(0)).zzc() : "undefined", (int) C10545v2.i(list.size() >= 2 ? u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue() : 0.0d))));
            case 4:
                C10545v2.c("lastIndexOf", 2, list);
                String str10 = this.f82422a;
                String strZzc2 = list.size() > 0 ? u12.a((InterfaceC10498q) list.get(0)).zzc() : "undefined";
                return new C10435j(Double.valueOf(str10.lastIndexOf(strZzc2, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue()) ? Double.POSITIVE_INFINITY : C10545v2.i(r1)))));
            case 5:
                C10545v2.c("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : u12.a((InterfaceC10498q) list.get(0)).zzc()).matcher(this.f82422a);
                return matcher.find() ? new C10399f(Arrays.asList(new C10533u(matcher.group()))) : InterfaceC10498q.f82343j3;
            case 6:
                C10545v2.c("replace", 2, list);
                InterfaceC10498q interfaceC10498qB = InterfaceC10498q.f82342i3;
                if (!list.isEmpty()) {
                    strZzc = u12.a((InterfaceC10498q) list.get(0)).zzc();
                    if (list.size() > 1) {
                        interfaceC10498qB = u12.a((InterfaceC10498q) list.get(1));
                    }
                }
                String str11 = strZzc;
                String str12 = this.f82422a;
                int iIndexOf = str12.indexOf(str11);
                if (iIndexOf < 0) {
                    return this;
                }
                if (interfaceC10498qB instanceof AbstractC10444k) {
                    i11 = 0;
                    interfaceC10498qB = ((AbstractC10444k) interfaceC10498qB).b(u12, Arrays.asList(new C10533u(str11), new C10435j(Double.valueOf(iIndexOf)), this));
                } else {
                    i11 = 0;
                }
                String strSubstring = str12.substring(i11, iIndexOf);
                String strZzc3 = interfaceC10498qB.zzc();
                String strSubstring2 = str12.substring(iIndexOf + str11.length());
                StringBuilder sb3 = new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzc3).length() + String.valueOf(strSubstring2).length());
                sb3.append(strSubstring);
                sb3.append(strZzc3);
                sb3.append(strSubstring2);
                return new C10533u(sb3.toString());
            case 7:
                C10545v2.c("search", 1, list);
                return Pattern.compile(list.isEmpty() ? "undefined" : u12.a((InterfaceC10498q) list.get(0)).zzc()).matcher(this.f82422a).find() ? new C10435j(Double.valueOf(r0.start())) : new C10435j(Double.valueOf(-1.0d));
            case '\b':
                C10545v2.c("slice", 2, list);
                String str13 = this.f82422a;
                double dI = C10545v2.i(!list.isEmpty() ? u12.a((InterfaceC10498q) list.get(0)).zzd().doubleValue() : 0.0d);
                double dMax = dI < 0.0d ? Math.max(str13.length() + dI, 0.0d) : Math.min(dI, str13.length());
                double dI2 = C10545v2.i(list.size() > 1 ? u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue() : str13.length());
                int i16 = (int) dMax;
                return new C10533u(str13.substring(i16, Math.max(0, ((int) (dI2 < 0.0d ? Math.max(str13.length() + dI2, 0.0d) : Math.min(dI2, str13.length()))) - i16) + i16));
            case '\t':
                C10545v2.c("split", 2, list);
                String str14 = this.f82422a;
                if (str14.length() == 0) {
                    return new C10399f(Arrays.asList(this));
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strZzc4 = u12.a((InterfaceC10498q) list.get(0)).zzc();
                    long jH = list.size() > 1 ? C10545v2.h(u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue()) : 2147483647L;
                    if (jH == 0) {
                        return new C10399f();
                    }
                    String[] strArrSplit = str14.split(Pattern.quote(strZzc4), ((int) jH) + 1);
                    int length = strArrSplit.length;
                    if (!strZzc4.isEmpty() || length <= 0) {
                        i12 = length;
                        z10 = false;
                    } else {
                        boolean zIsEmpty = strArrSplit[0].isEmpty();
                        i12 = length - 1;
                        if (!strArrSplit[i12].isEmpty()) {
                            i12 = length;
                        }
                        z10 = zIsEmpty;
                    }
                    if (length > jH) {
                        i12--;
                    }
                    for (?? r12 = z10; r12 < i12; r12++) {
                        arrayList.add(new C10533u(strArrSplit[r12]));
                    }
                }
                return new C10399f(arrayList);
            case '\n':
                C10545v2.c("substring", 2, list);
                String str15 = this.f82422a;
                if (list.isEmpty()) {
                    u13 = u12;
                    i13 = 0;
                } else {
                    u13 = u12;
                    i13 = (int) C10545v2.i(u13.a((InterfaceC10498q) list.get(0)).zzd().doubleValue());
                }
                int i17 = list.size() > 1 ? (int) C10545v2.i(u13.a((InterfaceC10498q) list.get(1)).zzd().doubleValue()) : str15.length();
                int iMin = Math.min(Math.max(i13, 0), str15.length());
                int iMin2 = Math.min(Math.max(i17, 0), str15.length());
                return new C10533u(str15.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 11:
                C10545v2.a("toLocaleUpperCase", 0, list);
                return new C10533u(this.f82422a.toUpperCase());
            case '\f':
                C10545v2.a("toLocaleLowerCase", 0, list);
                return new C10533u(this.f82422a.toLowerCase());
            case '\r':
                C10545v2.a("toLowerCase", 0, list);
                return new C10533u(this.f82422a.toLowerCase(Locale.ENGLISH));
            case 14:
                C10545v2.a(str6, 0, list);
                return this;
            case 15:
                C10545v2.a("toUpperCase", 0, list);
                return new C10533u(this.f82422a.toUpperCase(Locale.ENGLISH));
            case 16:
                C10545v2.a("toUpperCase", 0, list);
                return new C10533u(this.f82422a.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final int hashCode() {
        return this.f82422a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10524t(this);
    }

    public final String toString() {
        String str = this.f82422a;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Double zzd() {
        String str = this.f82422a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Boolean zze() {
        return Boolean.valueOf(!this.f82422a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Iterator zzf() {
        return new C10515s(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q zzt() {
        return new C10533u(this.f82422a);
    }

    public C10533u(String str) {
        if (str != null) {
            this.f82422a = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }
}
