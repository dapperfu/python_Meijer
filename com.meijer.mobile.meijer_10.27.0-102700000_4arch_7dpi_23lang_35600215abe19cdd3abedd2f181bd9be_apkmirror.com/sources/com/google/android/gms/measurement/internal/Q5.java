package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.EnumC10476n4;
import com.google.android.gms.internal.measurement.EnumC10485o4;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Q5 {

    /* renamed from: a, reason: collision with root package name */
    static final Ce.L f85184a = Ce.L.E("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    static int b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    static final boolean c(EnumC10476n4 enumC10476n4, Ce.M m10, Ce.M m11, Ce.O o10, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        int i15;
        int i16;
        Ce.O o11;
        String str4;
        P5 p52;
        char c10;
        int iE = e(enumC10476n4, m10, m11, o10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (iE > 0) {
            i16 = i12;
            if (i16 == 1) {
                i15 = i11;
                if (i15 != 1) {
                    i16 = 1;
                } else {
                    i15 = 1;
                    i16 = 1;
                }
            } else {
                i15 = i11;
            }
            cArr[iE] = '2';
        } else {
            i15 = i11;
            i16 = i12;
        }
        if (i(enumC10476n4, m10, m11, o10, cArr, i10, i15, i16, i13, i14, str, str2, str3, z10, z11, true) == EnumC10485o4.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c10 = '3';
        } else {
            int i17 = i14;
            if (enumC10476n4 == EnumC10476n4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                o11 = o10;
                str4 = str;
                if (i17 == 1) {
                    if (o11.contains(str4)) {
                        if (iE > 0 && cArr[iE] != '2') {
                            cArr[iE] = '1';
                        }
                        return true;
                    }
                    i17 = 1;
                }
            } else {
                o11 = o10;
                str4 = str;
            }
            if (m10.containsKey(enumC10476n4) && (p52 = (P5) m10.get(enumC10476n4)) != null) {
                int iOrdinal = p52.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return i(enumC10476n4, m10, m11, o10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) == EnumC10485o4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? h(enumC10476n4, m10, m11, o10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : g(enumC10476n4, m10, m11, o10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        if (iOrdinal == 3) {
                            return i(enumC10476n4, m10, m11, o11, cArr, i10, i15, i16, i13, i17, str4, str2, str3, z10, z11, true) == EnumC10485o4.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? g(enumC10476n4, m10, m11, o10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) : h(enumC10476n4, m10, m11, o10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                        }
                        c10 = '0';
                    } else if (i(enumC10476n4, m10, m11, o10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != EnumC10485o4.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return h(enumC10476n4, m10, m11, o10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                    }
                } else if (i(enumC10476n4, m10, m11, o10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true) != EnumC10485o4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return g(enumC10476n4, m10, m11, o10, cArr, i10, i15, i16, i13, i17, str, str2, str3, z10, z11, true);
                }
                c10 = '8';
            } else {
                c10 = '0';
            }
        }
        if (iE <= 0 || cArr[iE] == '2') {
            return false;
        }
        cArr[iE] = c10;
        return false;
    }

    public static final Map d(Ce.M m10, Ce.M m11, Ce.O o10, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (!z12) {
            return Ce.M.n();
        }
        EnumC10476n4 enumC10476n4 = EnumC10476n4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        EnumC10485o4 enumC10485o4 = (EnumC10485o4) m11.get(enumC10476n4);
        EnumC10476n4 enumC10476n42 = EnumC10476n4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        EnumC10485o4 enumC10485o42 = (EnumC10485o4) m11.get(enumC10476n42);
        EnumC10476n4 enumC10476n43 = EnumC10476n4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        EnumC10485o4 enumC10485o43 = (EnumC10485o4) m11.get(enumC10476n43);
        EnumC10476n4 enumC10476n44 = EnumC10476n4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        EnumC10485o4 enumC10485o44 = (EnumC10485o4) m11.get(enumC10476n44);
        return Ce.M.a().f("Version", "2").f("VendorConsent", true != z10 ? "0" : "1").f("VendorLegitimateInterest", true != z11 ? "0" : "1").f("gdprApplies", i12 != 1 ? "0" : "1").f("EnableAdvertiserConsentMode", i11 != 1 ? "0" : "1").f("PolicyVersion", String.valueOf(i13)).f("CmpSdkID", String.valueOf(i10)).f("PurposeOneTreatment", i14 != 1 ? "0" : "1").f("PublisherCC", str).f("PublisherRestrictions1", String.valueOf(enumC10485o4 != null ? enumC10485o4.zza() : EnumC10485o4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions3", String.valueOf(enumC10485o42 != null ? enumC10485o42.zza() : EnumC10485o4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions4", String.valueOf(enumC10485o43 != null ? enumC10485o43.zza() : EnumC10485o4.PURPOSE_RESTRICTION_UNDEFINED.zza())).f("PublisherRestrictions7", String.valueOf(enumC10485o44 != null ? enumC10485o44.zza() : EnumC10485o4.PURPOSE_RESTRICTION_UNDEFINED.zza())).i(Ce.M.s("Purpose1", f(enumC10476n4, m10, m11, o10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose3", f(enumC10476n42, m10, m11, o10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose4", f(enumC10476n43, m10, m11, o10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true), "Purpose7", f(enumC10476n44, m10, m11, o10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true))).i(Ce.M.v("AuthorizePurpose1", true != c(enumC10476n4, m10, m11, o10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose3", true != c(enumC10476n42, m10, m11, o10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose4", true != c(enumC10476n43, m10, m11, o10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "AuthorizePurpose7", true != c(enumC10476n44, m10, m11, o10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).c();
    }

    static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    private static final int e(EnumC10476n4 enumC10476n4, Ce.M m10, Ce.M m11, Ce.O o10, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        if (enumC10476n4 == EnumC10476n4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (enumC10476n4 == EnumC10476n4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (enumC10476n4 == EnumC10476n4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return enumC10476n4 == EnumC10476n4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final boolean g(EnumC10476n4 enumC10476n4, Ce.M m10, Ce.M m11, Ce.O o10, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iE = e(enumC10476n4, m10, m11, o10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z10) {
            c10 = '4';
        } else {
            if (str2.length() >= enumC10476n4.zza()) {
                char cCharAt = str2.charAt(enumC10476n4.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    cArr[iE] = cCharAt != '1' ? '6' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c10;
        }
        return false;
    }

    private static final boolean h(EnumC10476n4 enumC10476n4, Ce.M m10, Ce.M m11, Ce.O o10, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        char c10;
        int iE = e(enumC10476n4, m10, m11, o10, cArr, i10, i11, i12, i13, i14, str, str2, str3, z10, z11, true);
        if (!z11) {
            c10 = '5';
        } else {
            if (str3.length() >= enumC10476n4.zza()) {
                char cCharAt = str3.charAt(enumC10476n4.zza() - 1);
                boolean z13 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    cArr[iE] = cCharAt != '1' ? '7' : '1';
                }
                return z13;
            }
            c10 = '0';
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c10;
        }
        return false;
    }

    private static final EnumC10485o4 i(EnumC10476n4 enumC10476n4, Ce.M m10, Ce.M m11, Ce.O o10, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        return (EnumC10485o4) m11.getOrDefault(enumC10476n4, EnumC10485o4.PURPOSE_RESTRICTION_UNDEFINED);
    }

    private static final String f(EnumC10476n4 enumC10476n4, Ce.M m10, Ce.M m11, Ce.O o10, char[] cArr, int i10, int i11, int i12, int i13, int i14, String str, String str2, String str3, boolean z10, boolean z11, boolean z12) {
        String strValueOf;
        String strValueOf2 = "0";
        if (TextUtils.isEmpty(str2) || str2.length() < enumC10476n4.zza()) {
            strValueOf = "0";
        } else {
            strValueOf = String.valueOf(str2.charAt(enumC10476n4.zza() - 1));
        }
        if (!TextUtils.isEmpty(str3) && str3.length() >= enumC10476n4.zza()) {
            strValueOf2 = String.valueOf(str3.charAt(enumC10476n4.zza() - 1));
        }
        return String.valueOf(strValueOf).concat(String.valueOf(strValueOf2));
    }
}
