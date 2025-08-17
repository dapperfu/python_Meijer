package j$.time.format;

import j$.time.temporal.ChronoField;

/* loaded from: classes3.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138840a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f138841b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f138840a = i10;
        this.f138841b = obj;
    }

    @Override // j$.time.format.e
    public final boolean C(w wVar, StringBuilder sb2) {
        switch (this.f138840a) {
            case 0:
                Long lA = wVar.a(ChronoField.OFFSET_SECONDS);
                if (lA != null) {
                    sb2.append("GMT");
                    int intExact = Math.toIntExact(lA.longValue());
                    if (intExact != 0) {
                        int iAbs = Math.abs((intExact / 3600) % 100);
                        int iAbs2 = Math.abs((intExact / 60) % 60);
                        int iAbs3 = Math.abs(intExact % 60);
                        sb2.append(intExact < 0 ? "-" : "+");
                        if (((TextStyle) this.f138841b) == TextStyle.FULL) {
                            a(sb2, iAbs);
                            sb2.append(':');
                            a(sb2, iAbs2);
                            if (iAbs3 != 0) {
                                sb2.append(':');
                                a(sb2, iAbs3);
                                break;
                            }
                        } else {
                            if (iAbs >= 10) {
                                sb2.append((char) ((iAbs / 10) + 48));
                            }
                            sb2.append((char) ((iAbs % 10) + 48));
                            if (iAbs2 != 0 || iAbs3 != 0) {
                                sb2.append(':');
                                a(sb2, iAbs2);
                                if (iAbs3 != 0) {
                                    sb2.append(':');
                                    a(sb2, iAbs3);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                sb2.append((String) this.f138841b);
                break;
        }
        return true;
    }

    @Override // j$.time.format.e
    public final int H(v vVar, CharSequence charSequence, int i10) {
        int i11;
        int iB;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f138840a) {
            case 0:
                int length = charSequence.length();
                if (vVar.h(charSequence, i10, "GMT", 0, 3)) {
                    int i16 = i10 + 3;
                    if (i16 == length) {
                        return vVar.g(ChronoField.OFFSET_SECONDS, 0L, i10, i16);
                    }
                    char cCharAt = charSequence.charAt(i16);
                    if (cCharAt == '+') {
                        i11 = 1;
                    } else {
                        if (cCharAt != '-') {
                            return vVar.g(ChronoField.OFFSET_SECONDS, 0L, i10, i16);
                        }
                        i11 = -1;
                    }
                    int i17 = i10 + 4;
                    int i18 = 0;
                    if (((TextStyle) this.f138841b) == TextStyle.FULL) {
                        int i19 = i10 + 5;
                        int iB2 = b(charSequence, i17);
                        int i20 = i10 + 6;
                        int iB3 = b(charSequence, i19);
                        if (iB2 >= 0 && iB3 >= 0) {
                            int i21 = i10 + 7;
                            if (charSequence.charAt(i20) == ':') {
                                iB = (iB2 * 10) + iB3;
                                int iB4 = b(charSequence, i21);
                                i15 = i10 + 9;
                                int iB5 = b(charSequence, i10 + 8);
                                if (iB4 >= 0 && iB5 >= 0) {
                                    i14 = (iB4 * 10) + iB5;
                                    int i22 = i10 + 11;
                                    if (i22 < length && charSequence.charAt(i15) == ':') {
                                        int iB6 = b(charSequence, i10 + 10);
                                        int iB7 = b(charSequence, i22);
                                        if (iB6 >= 0 && iB7 >= 0) {
                                            i18 = (iB6 * 10) + iB7;
                                            i15 = i10 + 12;
                                        }
                                    }
                                    i12 = i18;
                                    i13 = i15;
                                }
                            }
                        }
                    } else {
                        int i23 = i10 + 5;
                        iB = b(charSequence, i17);
                        if (iB >= 0) {
                            if (i23 < length) {
                                int iB8 = b(charSequence, i23);
                                if (iB8 >= 0) {
                                    iB = (iB * 10) + iB8;
                                    i23 = i10 + 6;
                                }
                                int i24 = i23 + 2;
                                if (i24 < length && charSequence.charAt(i23) == ':' && i24 < length && charSequence.charAt(i23) == ':') {
                                    int iB9 = b(charSequence, i23 + 1);
                                    int iB10 = b(charSequence, i24);
                                    if (iB9 >= 0 && iB10 >= 0) {
                                        i14 = (iB9 * 10) + iB10;
                                        int i25 = i23 + 3;
                                        int i26 = i23 + 5;
                                        if (i26 < length && charSequence.charAt(i25) == ':') {
                                            int iB11 = b(charSequence, i23 + 4);
                                            int iB12 = b(charSequence, i26);
                                            if (iB11 >= 0 && iB12 >= 0) {
                                                i18 = (iB11 * 10) + iB12;
                                                i15 = i23 + 6;
                                                i12 = i18;
                                                i13 = i15;
                                            }
                                        }
                                        i13 = i25;
                                        i12 = 0;
                                    }
                                }
                            }
                            i12 = 0;
                            i13 = i23;
                            return vVar.g(ChronoField.OFFSET_SECONDS, ((i18 * 60) + (iB * 3600) + i12) * i11, i10, i13);
                        }
                    }
                    i18 = i14;
                    return vVar.g(ChronoField.OFFSET_SECONDS, ((i18 * 60) + (iB * 3600) + i12) * i11, i10, i13);
                }
                return ~i10;
            default:
                String str = (String) this.f138841b;
                if (i10 > charSequence.length() || i10 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                return !vVar.h(charSequence, i10, str, 0, str.length()) ? ~i10 : str.length() + i10;
        }
    }

    public final String toString() {
        switch (this.f138840a) {
            case 0:
                return "LocalizedOffset(" + ((TextStyle) this.f138841b) + ")";
            default:
                return "'" + ((String) this.f138841b).replace("'", "''") + "'";
        }
    }

    public static void a(StringBuilder sb2, int i10) {
        sb2.append((char) ((i10 / 10) + 48));
        sb2.append((char) ((i10 % 10) + 48));
    }

    public static int b(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }
}
