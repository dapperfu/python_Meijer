package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.f5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8090f5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f74866a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f74867b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    private static final Map f74868c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f74869d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(com.medallia.digital.mobilesdk.l3.f93323c, com.medallia.digital.mobilesdk.l3.f93323c, com.medallia.digital.mobilesdk.l3.f93323c)));
        map.put("lime", Integer.valueOf(Color.rgb(0, com.medallia.digital.mobilesdk.l3.f93323c, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, com.medallia.digital.mobilesdk.l3.f93323c, com.medallia.digital.mobilesdk.l3.f93323c)));
        map.put("red", Integer.valueOf(Color.rgb(com.medallia.digital.mobilesdk.l3.f93323c, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(com.medallia.digital.mobilesdk.l3.f93323c, com.medallia.digital.mobilesdk.l3.f93323c, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(com.medallia.digital.mobilesdk.l3.f93323c, 0, com.medallia.digital.mobilesdk.l3.f93323c)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, com.medallia.digital.mobilesdk.l3.f93323c)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f74868c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(com.medallia.digital.mobilesdk.l3.f93323c, com.medallia.digital.mobilesdk.l3.f93323c, com.medallia.digital.mobilesdk.l3.f93323c)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, com.medallia.digital.mobilesdk.l3.f93323c, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, com.medallia.digital.mobilesdk.l3.f93323c, com.medallia.digital.mobilesdk.l3.f93323c)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(com.medallia.digital.mobilesdk.l3.f93323c, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(com.medallia.digital.mobilesdk.l3.f93323c, com.medallia.digital.mobilesdk.l3.f93323c, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(com.medallia.digital.mobilesdk.l3.f93323c, 0, com.medallia.digital.mobilesdk.l3.f93323c)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, com.medallia.digital.mobilesdk.l3.f93323c)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f74869d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.text.SpannedString a(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8090f5.a(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    static C7443Ww b(String str) {
        C7877d5 c7877d5 = new C7877d5();
        h(str, c7877d5);
        return c7877d5.a();
    }

    public static Y4 c(GQ gq2, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strP = gq2.P(charset);
        if (strP != null) {
            Pattern pattern = f74866a;
            Matcher matcher = pattern.matcher(strP);
            if (matcher.matches()) {
                return e(null, matcher, gq2, list);
            }
            String strP2 = gq2.P(charset);
            if (strP2 != null) {
                Matcher matcher2 = pattern.matcher(strP2);
                if (matcher2.matches()) {
                    return e(strP.trim(), matcher2, gq2, list);
                }
            }
        }
        return null;
    }

    private static Y4 e(String str, Matcher matcher, GQ gq2, List list) {
        C7877d5 c7877d5 = new C7877d5();
        try {
            String strGroup = matcher.group(1);
            if (strGroup == null) {
                throw null;
            }
            c7877d5.f74190a = C8304h5.b(strGroup);
            String strGroup2 = matcher.group(2);
            if (strGroup2 == null) {
                throw null;
            }
            c7877d5.f74191b = C8304h5.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            h(strGroup3, c7877d5);
            StringBuilder sb2 = new StringBuilder();
            String strP = gq2.P(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strP)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strP.trim());
                strP = gq2.P(StandardCharsets.UTF_8);
            }
            c7877d5.f74192c = a(str, sb2.toString(), list);
            return new Y4(c7877d5.a().p(), c7877d5.f74190a, c7877d5.f74191b);
        } catch (NumberFormatException unused) {
            C10042xL.f("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List f(List list, String str, C7664b5 c7664b5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            X4 x42 = (X4) list.get(i10);
            int iG = x42.g(str, c7664b5.f73551a, c7664b5.f73554d, c7664b5.f73553c);
            if (iG > 0) {
                arrayList.add(new C7770c5(iG, x42));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(java.lang.String r18, com.google.android.gms.internal.ads.C7664b5 r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8090f5.g(java.lang.String, com.google.android.gms.internal.ads.b5, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void h(String str, C7877d5 c7877d5) {
        Matcher matcher = f74867b.matcher(str);
        while (matcher.find()) {
            int i10 = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i11 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                char c10 = 65535;
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals("center")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals("end")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c10 == 0) {
                            i11 = 0;
                        } else if (c10 == 1 || c10 == 2) {
                            i11 = 1;
                        } else if (c10 != 3) {
                            C10042xL.f("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                            i11 = Integer.MIN_VALUE;
                        }
                        c7877d5.f74196g = i11;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        c7877d5.f74194e = C8304h5.a(strGroup2);
                        c7877d5.f74195f = 0;
                    } else {
                        c7877d5.f74194e = Integer.parseInt(strGroup2);
                        c7877d5.f74195f = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2.hashCode()) {
                        case -1364013995:
                            if (strGroup2.equals("center")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (strGroup2.equals("middle")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 100571:
                            if (strGroup2.equals("end")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 3317767:
                            if (strGroup2.equals("left")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 108511772:
                            if (strGroup2.equals("right")) {
                                c10 = 5;
                                break;
                            }
                            break;
                        case 109757538:
                            if (strGroup2.equals("start")) {
                                c10 = 0;
                                break;
                            }
                            break;
                    }
                    if (c10 != 0) {
                        if (c10 == 1) {
                            i10 = 4;
                        } else if (c10 == 2 || c10 == 3) {
                            i10 = 2;
                        } else if (c10 == 4) {
                            i10 = 3;
                        } else if (c10 != 5) {
                            C10042xL.f("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i10 = 2;
                        } else {
                            i10 = 5;
                        }
                    }
                    c7877d5.f74193d = i10;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2.hashCode()) {
                            case -1842484672:
                                if (strSubstring2.equals("line-left")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (strSubstring2.equals("center")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (strSubstring2.equals("line-right")) {
                                    c10 = 4;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring2.equals("middle")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strSubstring2.equals("end")) {
                                    c10 = 5;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strSubstring2.equals("start")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                        }
                        if (c10 == 0 || c10 == 1) {
                            i10 = 0;
                        } else if (c10 != 2 && c10 != 3) {
                            if (c10 == 4 || c10 == 5) {
                                i10 = 2;
                            } else {
                                C10042xL.f("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i10 = Integer.MIN_VALUE;
                            }
                        }
                        c7877d5.f74198i = i10;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    c7877d5.f74197h = C8304h5.a(strGroup2);
                } else if ("size".equals(strGroup)) {
                    c7877d5.f74199j = C8304h5.a(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            c10 = 0;
                        }
                    } else if (strGroup2.equals("lr")) {
                        c10 = 1;
                    }
                    if (c10 != 0) {
                        if (c10 != 1) {
                            C10042xL.f("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i10 = Integer.MIN_VALUE;
                        } else {
                            i10 = 2;
                        }
                    }
                    c7877d5.f74200k = i10;
                } else {
                    C10042xL.f("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                C10042xL.f("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }

    private static int d(List list, String str, C7664b5 c7664b5) {
        List listF = f(list, str, c7664b5);
        for (int i10 = 0; i10 < listF.size(); i10++) {
            X4 x42 = ((C7770c5) listF.get(i10)).f73933b;
            if (x42.f() != -1) {
                return x42.f();
            }
        }
        return -1;
    }
}
