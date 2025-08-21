package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes6.dex */
public final class P4 implements InterfaceC9049o4 {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f70080b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f70081c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f70082d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    static final Pattern f70083e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    static final Pattern f70084f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f70085g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f70086h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i, reason: collision with root package name */
    private static final N4 f70087i = new N4(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    private final XmlPullParserFactory f70088a;

    private static S4 e(S4 s42) {
        return s42 == null ? new S4() : s42;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long c(java.lang.String r13, com.google.android.gms.internal.ads.N4 r14) throws java.lang.NumberFormatException, com.google.android.gms.internal.ads.zzakb {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.P4.c(java.lang.String, com.google.android.gms.internal.ads.N4):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.S4 f(org.xmlpull.v1.XmlPullParser r16, com.google.android.gms.internal.ads.S4 r17) throws com.google.android.gms.internal.ads.zzakb {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.P4.f(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.S4):com.google.android.gms.internal.ads.S4");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:57|(1:(9:60|432|64|65|441|66|75|(2:77|91)(4:78|(1:80)(4:82|434|83|(2:85|(2:87|91)(2:449|88))(2:448|89))|77|91)|408)(1:61))(1:63)|62|432|64|65|441|66|75|(0)(0)|408) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0171, code lost:
    
        r26 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x018a, code lost:
    
        com.google.android.gms.internal.ads.C10042xL.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a7 A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, TRY_LEAVE, TryCatch #17 {IOException -> 0x008a, XmlPullParserException -> 0x008d, blocks: (B:3:0x0006, B:6:0x0056, B:8:0x0065, B:11:0x0071, B:14:0x007d, B:16:0x0085, B:22:0x0092, B:25:0x009c, B:29:0x00b0, B:31:0x00c9, B:33:0x00d9, B:35:0x00e0, B:37:0x00ec, B:40:0x00f6, B:75:0x0193, B:93:0x01eb, B:96:0x01fb, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0229, B:110:0x022f, B:112:0x0237, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0251, B:122:0x0259, B:125:0x0262, B:408:0x06f7, B:126:0x0285, B:128:0x028b, B:130:0x0294, B:132:0x02a3, B:134:0x02b0, B:136:0x02c6, B:138:0x02cc, B:275:0x0509, B:140:0x02d9, B:143:0x02e5, B:145:0x02eb, B:147:0x02f4, B:149:0x02fa, B:150:0x0301, B:153:0x0308, B:274:0x0504, B:156:0x031a, B:158:0x0322, B:162:0x0343, B:164:0x0349, B:166:0x0356, B:183:0x03a1, B:185:0x03a7, B:189:0x03b8, B:191:0x03be, B:193:0x03cb, B:210:0x0415, B:212:0x041d, B:232:0x0463, B:234:0x046d, B:260:0x04b4, B:195:0x03d6, B:196:0x03d7, B:197:0x03d8, B:198:0x03e0, B:201:0x03e8, B:204:0x03f2, B:206:0x03f8, B:208:0x0403, B:262:0x04c0, B:263:0x04c1, B:264:0x04c2, B:265:0x04cb, B:266:0x04d6, B:167:0x035f, B:168:0x0360, B:169:0x0361, B:171:0x036c, B:174:0x0376, B:177:0x037f, B:179:0x0385, B:181:0x0390, B:268:0x04dd, B:269:0x04de, B:270:0x04df, B:271:0x04e8, B:272:0x04f3, B:280:0x052b, B:283:0x054e, B:340:0x0608, B:318:0x05be, B:321:0x05c7, B:380:0x0681, B:328:0x05da, B:331:0x05e4, B:335:0x05f2, B:338:0x05f9, B:339:0x0601, B:345:0x061f, B:349:0x062b, B:353:0x0633, B:361:0x0645, B:364:0x064c, B:368:0x0655, B:370:0x0663, B:372:0x0668, B:78:0x019c, B:80:0x01a8, B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0, B:90:0x01d1, B:45:0x0112, B:48:0x0122, B:51:0x012c, B:53:0x0132, B:55:0x0139, B:57:0x013f, B:64:0x0154, B:66:0x015b, B:74:0x018a, B:70:0x017b, B:73:0x0189, B:384:0x069d, B:387:0x06ae, B:390:0x06b2, B:392:0x06bc, B:394:0x06c6, B:398:0x06d6, B:396:0x06cf, B:402:0x06e9, B:406:0x06f1, B:413:0x070f), top: B:444:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x041d A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, TRY_LEAVE, TryCatch #17 {IOException -> 0x008a, XmlPullParserException -> 0x008d, blocks: (B:3:0x0006, B:6:0x0056, B:8:0x0065, B:11:0x0071, B:14:0x007d, B:16:0x0085, B:22:0x0092, B:25:0x009c, B:29:0x00b0, B:31:0x00c9, B:33:0x00d9, B:35:0x00e0, B:37:0x00ec, B:40:0x00f6, B:75:0x0193, B:93:0x01eb, B:96:0x01fb, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0229, B:110:0x022f, B:112:0x0237, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0251, B:122:0x0259, B:125:0x0262, B:408:0x06f7, B:126:0x0285, B:128:0x028b, B:130:0x0294, B:132:0x02a3, B:134:0x02b0, B:136:0x02c6, B:138:0x02cc, B:275:0x0509, B:140:0x02d9, B:143:0x02e5, B:145:0x02eb, B:147:0x02f4, B:149:0x02fa, B:150:0x0301, B:153:0x0308, B:274:0x0504, B:156:0x031a, B:158:0x0322, B:162:0x0343, B:164:0x0349, B:166:0x0356, B:183:0x03a1, B:185:0x03a7, B:189:0x03b8, B:191:0x03be, B:193:0x03cb, B:210:0x0415, B:212:0x041d, B:232:0x0463, B:234:0x046d, B:260:0x04b4, B:195:0x03d6, B:196:0x03d7, B:197:0x03d8, B:198:0x03e0, B:201:0x03e8, B:204:0x03f2, B:206:0x03f8, B:208:0x0403, B:262:0x04c0, B:263:0x04c1, B:264:0x04c2, B:265:0x04cb, B:266:0x04d6, B:167:0x035f, B:168:0x0360, B:169:0x0361, B:171:0x036c, B:174:0x0376, B:177:0x037f, B:179:0x0385, B:181:0x0390, B:268:0x04dd, B:269:0x04de, B:270:0x04df, B:271:0x04e8, B:272:0x04f3, B:280:0x052b, B:283:0x054e, B:340:0x0608, B:318:0x05be, B:321:0x05c7, B:380:0x0681, B:328:0x05da, B:331:0x05e4, B:335:0x05f2, B:338:0x05f9, B:339:0x0601, B:345:0x061f, B:349:0x062b, B:353:0x0633, B:361:0x0645, B:364:0x064c, B:368:0x0655, B:370:0x0663, B:372:0x0668, B:78:0x019c, B:80:0x01a8, B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0, B:90:0x01d1, B:45:0x0112, B:48:0x0122, B:51:0x012c, B:53:0x0132, B:55:0x0139, B:57:0x013f, B:64:0x0154, B:66:0x015b, B:74:0x018a, B:70:0x017b, B:73:0x0189, B:384:0x069d, B:387:0x06ae, B:390:0x06b2, B:392:0x06bc, B:394:0x06c6, B:398:0x06d6, B:396:0x06cf, B:402:0x06e9, B:406:0x06f1, B:413:0x070f), top: B:444:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x046d A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, TRY_LEAVE, TryCatch #17 {IOException -> 0x008a, XmlPullParserException -> 0x008d, blocks: (B:3:0x0006, B:6:0x0056, B:8:0x0065, B:11:0x0071, B:14:0x007d, B:16:0x0085, B:22:0x0092, B:25:0x009c, B:29:0x00b0, B:31:0x00c9, B:33:0x00d9, B:35:0x00e0, B:37:0x00ec, B:40:0x00f6, B:75:0x0193, B:93:0x01eb, B:96:0x01fb, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0229, B:110:0x022f, B:112:0x0237, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0251, B:122:0x0259, B:125:0x0262, B:408:0x06f7, B:126:0x0285, B:128:0x028b, B:130:0x0294, B:132:0x02a3, B:134:0x02b0, B:136:0x02c6, B:138:0x02cc, B:275:0x0509, B:140:0x02d9, B:143:0x02e5, B:145:0x02eb, B:147:0x02f4, B:149:0x02fa, B:150:0x0301, B:153:0x0308, B:274:0x0504, B:156:0x031a, B:158:0x0322, B:162:0x0343, B:164:0x0349, B:166:0x0356, B:183:0x03a1, B:185:0x03a7, B:189:0x03b8, B:191:0x03be, B:193:0x03cb, B:210:0x0415, B:212:0x041d, B:232:0x0463, B:234:0x046d, B:260:0x04b4, B:195:0x03d6, B:196:0x03d7, B:197:0x03d8, B:198:0x03e0, B:201:0x03e8, B:204:0x03f2, B:206:0x03f8, B:208:0x0403, B:262:0x04c0, B:263:0x04c1, B:264:0x04c2, B:265:0x04cb, B:266:0x04d6, B:167:0x035f, B:168:0x0360, B:169:0x0361, B:171:0x036c, B:174:0x0376, B:177:0x037f, B:179:0x0385, B:181:0x0390, B:268:0x04dd, B:269:0x04de, B:270:0x04df, B:271:0x04e8, B:272:0x04f3, B:280:0x052b, B:283:0x054e, B:340:0x0608, B:318:0x05be, B:321:0x05c7, B:380:0x0681, B:328:0x05da, B:331:0x05e4, B:335:0x05f2, B:338:0x05f9, B:339:0x0601, B:345:0x061f, B:349:0x062b, B:353:0x0633, B:361:0x0645, B:364:0x064c, B:368:0x0655, B:370:0x0663, B:372:0x0668, B:78:0x019c, B:80:0x01a8, B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0, B:90:0x01d1, B:45:0x0112, B:48:0x0122, B:51:0x012c, B:53:0x0132, B:55:0x0139, B:57:0x013f, B:64:0x0154, B:66:0x015b, B:74:0x018a, B:70:0x017b, B:73:0x0189, B:384:0x069d, B:387:0x06ae, B:390:0x06b2, B:392:0x06bc, B:394:0x06c6, B:398:0x06d6, B:396:0x06cf, B:402:0x06e9, B:406:0x06f1, B:413:0x070f), top: B:444:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04d6 A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, TRY_LEAVE, TryCatch #17 {IOException -> 0x008a, XmlPullParserException -> 0x008d, blocks: (B:3:0x0006, B:6:0x0056, B:8:0x0065, B:11:0x0071, B:14:0x007d, B:16:0x0085, B:22:0x0092, B:25:0x009c, B:29:0x00b0, B:31:0x00c9, B:33:0x00d9, B:35:0x00e0, B:37:0x00ec, B:40:0x00f6, B:75:0x0193, B:93:0x01eb, B:96:0x01fb, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0229, B:110:0x022f, B:112:0x0237, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0251, B:122:0x0259, B:125:0x0262, B:408:0x06f7, B:126:0x0285, B:128:0x028b, B:130:0x0294, B:132:0x02a3, B:134:0x02b0, B:136:0x02c6, B:138:0x02cc, B:275:0x0509, B:140:0x02d9, B:143:0x02e5, B:145:0x02eb, B:147:0x02f4, B:149:0x02fa, B:150:0x0301, B:153:0x0308, B:274:0x0504, B:156:0x031a, B:158:0x0322, B:162:0x0343, B:164:0x0349, B:166:0x0356, B:183:0x03a1, B:185:0x03a7, B:189:0x03b8, B:191:0x03be, B:193:0x03cb, B:210:0x0415, B:212:0x041d, B:232:0x0463, B:234:0x046d, B:260:0x04b4, B:195:0x03d6, B:196:0x03d7, B:197:0x03d8, B:198:0x03e0, B:201:0x03e8, B:204:0x03f2, B:206:0x03f8, B:208:0x0403, B:262:0x04c0, B:263:0x04c1, B:264:0x04c2, B:265:0x04cb, B:266:0x04d6, B:167:0x035f, B:168:0x0360, B:169:0x0361, B:171:0x036c, B:174:0x0376, B:177:0x037f, B:179:0x0385, B:181:0x0390, B:268:0x04dd, B:269:0x04de, B:270:0x04df, B:271:0x04e8, B:272:0x04f3, B:280:0x052b, B:283:0x054e, B:340:0x0608, B:318:0x05be, B:321:0x05c7, B:380:0x0681, B:328:0x05da, B:331:0x05e4, B:335:0x05f2, B:338:0x05f9, B:339:0x0601, B:345:0x061f, B:349:0x062b, B:353:0x0633, B:361:0x0645, B:364:0x064c, B:368:0x0655, B:370:0x0663, B:372:0x0668, B:78:0x019c, B:80:0x01a8, B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0, B:90:0x01d1, B:45:0x0112, B:48:0x0122, B:51:0x012c, B:53:0x0132, B:55:0x0139, B:57:0x013f, B:64:0x0154, B:66:0x015b, B:74:0x018a, B:70:0x017b, B:73:0x0189, B:384:0x069d, B:387:0x06ae, B:390:0x06b2, B:392:0x06bc, B:394:0x06c6, B:398:0x06d6, B:396:0x06cf, B:402:0x06e9, B:406:0x06f1, B:413:0x070f), top: B:444:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0515 A[LOOP:1: B:128:0x028b->B:278:0x0515, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05aa A[PHI: r8
      0x05aa: PHI (r8v19 java.lang.Object) = 
      (r8v11 java.lang.Object)
      (r8v12 java.lang.Object)
      (r8v13 java.lang.Object)
      (r8v14 java.lang.Object)
      (r8v15 java.lang.Object)
      (r8v20 java.lang.Object)
     binds: [B:303:0x05a6, B:300:0x059c, B:297:0x0590, B:294:0x0583, B:291:0x0577, B:286:0x0562] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0668 A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, zzakb -> 0x066c, TRY_LEAVE, TryCatch #4 {zzakb -> 0x066c, blocks: (B:370:0x0663, B:372:0x0668), top: B:423:0x0663 }] */
    /* JADX WARN: Removed duplicated region for block: B:464:0x050f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019c A[Catch: IOException -> 0x008a, XmlPullParserException -> 0x008d, TryCatch #17 {IOException -> 0x008a, XmlPullParserException -> 0x008d, blocks: (B:3:0x0006, B:6:0x0056, B:8:0x0065, B:11:0x0071, B:14:0x007d, B:16:0x0085, B:22:0x0092, B:25:0x009c, B:29:0x00b0, B:31:0x00c9, B:33:0x00d9, B:35:0x00e0, B:37:0x00ec, B:40:0x00f6, B:75:0x0193, B:93:0x01eb, B:96:0x01fb, B:98:0x0201, B:100:0x0209, B:102:0x0211, B:104:0x0219, B:106:0x0221, B:108:0x0229, B:110:0x022f, B:112:0x0237, B:114:0x023f, B:116:0x0245, B:118:0x024b, B:120:0x0251, B:122:0x0259, B:125:0x0262, B:408:0x06f7, B:126:0x0285, B:128:0x028b, B:130:0x0294, B:132:0x02a3, B:134:0x02b0, B:136:0x02c6, B:138:0x02cc, B:275:0x0509, B:140:0x02d9, B:143:0x02e5, B:145:0x02eb, B:147:0x02f4, B:149:0x02fa, B:150:0x0301, B:153:0x0308, B:274:0x0504, B:156:0x031a, B:158:0x0322, B:162:0x0343, B:164:0x0349, B:166:0x0356, B:183:0x03a1, B:185:0x03a7, B:189:0x03b8, B:191:0x03be, B:193:0x03cb, B:210:0x0415, B:212:0x041d, B:232:0x0463, B:234:0x046d, B:260:0x04b4, B:195:0x03d6, B:196:0x03d7, B:197:0x03d8, B:198:0x03e0, B:201:0x03e8, B:204:0x03f2, B:206:0x03f8, B:208:0x0403, B:262:0x04c0, B:263:0x04c1, B:264:0x04c2, B:265:0x04cb, B:266:0x04d6, B:167:0x035f, B:168:0x0360, B:169:0x0361, B:171:0x036c, B:174:0x0376, B:177:0x037f, B:179:0x0385, B:181:0x0390, B:268:0x04dd, B:269:0x04de, B:270:0x04df, B:271:0x04e8, B:272:0x04f3, B:280:0x052b, B:283:0x054e, B:340:0x0608, B:318:0x05be, B:321:0x05c7, B:380:0x0681, B:328:0x05da, B:331:0x05e4, B:335:0x05f2, B:338:0x05f9, B:339:0x0601, B:345:0x061f, B:349:0x062b, B:353:0x0633, B:361:0x0645, B:364:0x064c, B:368:0x0655, B:370:0x0663, B:372:0x0668, B:78:0x019c, B:80:0x01a8, B:83:0x01b3, B:85:0x01b9, B:87:0x01c4, B:88:0x01cf, B:89:0x01d0, B:90:0x01d1, B:45:0x0112, B:48:0x0122, B:51:0x012c, B:53:0x0132, B:55:0x0139, B:57:0x013f, B:64:0x0154, B:66:0x015b, B:74:0x018a, B:70:0x017b, B:73:0x0189, B:384:0x069d, B:387:0x06ae, B:390:0x06b2, B:392:0x06bc, B:394:0x06c6, B:398:0x06d6, B:396:0x06cf, B:402:0x06e9, B:406:0x06f1, B:413:0x070f), top: B:444:0x0006 }] */
    /* JADX WARN: Type inference failed for: r46v1, types: [com.google.android.gms.internal.ads.S4, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.InterfaceC8621k4 b(byte[] r44, int r45, int r46) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, com.google.android.gms.internal.ads.zzakb, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.P4.b(byte[], int, int):com.google.android.gms.internal.ads.k4");
    }

    public P4() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f70088a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.text.Layout.Alignment d(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.C8571jf0.a(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L38;
                case 100571: goto L2e;
                case 3317767: goto L24;
                case 108511772: goto L1a;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r4
            goto L43
        L1a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r3
            goto L43
        L24:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 0
            goto L43
        L2e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r2
            goto L43
        L38:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r1
            goto L43
        L42:
            r5 = -1
        L43:
            if (r5 == 0) goto L55
            if (r5 == r4) goto L55
            if (r5 == r3) goto L52
            if (r5 == r2) goto L52
            if (r5 == r1) goto L4f
            r5 = 0
            return r5
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.P4.d(java.lang.String):android.text.Layout$Alignment");
    }

    private static String[] g(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        int i10 = OV.f69931a;
        return strTrim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9049o4
    public final void a(byte[] bArr, int i10, int i11, C8942n4 c8942n4, ME me2) {
        C8409i4.a(b(bArr, i10, i11), c8942n4, me2);
    }
}
