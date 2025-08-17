package n2;

import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C15768a {

    /* renamed from: a, reason: collision with root package name */
    private static final C2333a[] f150967a = {new C2333a(99, 99, -1, -1), new C2333a(35, 36, -1, -1), new C2333a(71, 72, -1, -1), new C2333a(96, 96, -1, -1), new C2333a(85, 86, -1, -1), new C2333a(90, 96, -1, -1), new C2333a(80, 81, -1, -1), new C2333a(6, 6, -1, -1), new C2333a(20, 20, -1, -1), new C2333a(19, 19, -1, -1), new C2333a(32, 34, -1, -1), new C2333a(96, 96, -1, -1), new C2333a(30, 31, -1, -1), new C2333a(96, 96, -1, -1), new C2333a(96, 96, -1, -1), new C2333a(50, 52, -1, -1), new C2333a(83, 83, -1, -1), new C2333a(60, 62, -1, -1), new C2333a(46, 47, -1, -1), new C2333a(66, 67, 73, -1), new C2333a(40, 42, -1, -1), new C2333a(70, 71, -1, -1), new C2333a(1, 2, -1, -1), new C2333a(20, 21, -1, -1), new C2333a(3, 4, -1, -1), new C2333a(96, 96, -1, -1), new C2333a(48, 49, -1, -1), new C2333a(55, 56, -1, -1), new C2333a(63, 65, -1, -1), new C2333a(96, 96, -1, -1), new C2333a(38, 39, -1, -1), new C2333a(55, 56, -1, -1), new C2333a(27, 28, -1, -1), new C2333a(58, 58, -1, -1), new C2333a(68, 69, -1, -1), new C2333a(3, 4, -1, -1), new C2333a(7, 8, -1, -1), new C2333a(87, 88, 86, -1), new C2333a(88, 89, 96, -1), new C2333a(10, 14, 0, 6), new C2333a(43, 45, -1, -1), new C2333a(73, 74, -1, -1), new C2333a(97, 97, -1, -1), new C2333a(15, 19, -1, -1), new C2333a(6, 6, 0, 9), new C2333a(96, 96, -1, -1), new C2333a(2, 2, -1, -1), new C2333a(29, 29, -1, -1), new C2333a(57, 57, -1, -1), new C2333a(37, 38, -1, -1), new C2333a(75, 79, 87, 88), new C2333a(84, 84, -1, -1), new C2333a(22, 24, 20, -1), new C2333a(6, 9, -1, -1), new C2333a(5, 5, -1, -1), new C2333a(98, 99, -1, -1), new C2333a(53, 54, -1, -1), new C2333a(24, 26, -1, -1), new C2333a(82, 83, -1, -1)};

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f150968b = Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f150969c = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f150970d = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f150971e = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f150972f = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f150973g = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    private static boolean b(String str) throws NumberFormatException {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (Character.isDigit(str.charAt(i11))) {
                i10++;
            }
        }
        if (i10 > 5) {
            return false;
        }
        Matcher matcher = f150972f.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int i12 = Integer.parseInt(matcher.group(1));
        if (i12 == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i13 = i12 % 10;
        if (i13 == 1) {
            return lowerCase.equals(i12 % 100 != 11 ? "st" : "th");
        }
        if (i13 == 2) {
            return lowerCase.equals(i12 % 100 != 12 ? "nd" : "th");
        }
        if (i13 != 3) {
            return lowerCase.equals("th");
        }
        return lowerCase.equals(i12 % 100 != 13 ? "rd" : "th");
    }

    private static boolean e(String str, MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int iGroupCount = matchResult.groupCount();
        while (true) {
            if (iGroupCount <= 0) {
                break;
            }
            int i10 = iGroupCount - 1;
            if (matchResult.group(iGroupCount) != null) {
                iGroupCount = i10;
                break;
            }
            iGroupCount = i10;
        }
        return f150973g.matcher(str).matches() && f150967a[iGroupCount].a(str);
    }

    public static MatchResult f(String str, int i10) {
        if (i10 > 0 && ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(i10 - 1)) == -1) {
            return null;
        }
        Matcher matcherRegion = f150969c.matcher(str).region(i10, str.length());
        if (matcherRegion.lookingAt()) {
            MatchResult matchResult = matcherRegion.toMatchResult();
            if (b(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }

    public static MatchResult g(String str, int i10) {
        if (i10 > 0 && ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(i10 - 1)) == -1) {
            return null;
        }
        Matcher matcherRegion = f150970d.matcher(str).region(i10, str.length());
        if (matcherRegion.lookingAt()) {
            return matcherRegion.toMatchResult();
        }
        return null;
    }

    /* renamed from: n2.a$a, reason: collision with other inner class name */
    private static class C2333a {

        /* renamed from: a, reason: collision with root package name */
        int f150974a;

        /* renamed from: b, reason: collision with root package name */
        int f150975b;

        /* renamed from: c, reason: collision with root package name */
        int f150976c;

        /* renamed from: d, reason: collision with root package name */
        int f150977d;

        boolean a(String str) throws NumberFormatException {
            int i10 = Integer.parseInt(str.substring(0, 2));
            return (this.f150974a <= i10 && i10 <= this.f150975b) || i10 == this.f150976c || i10 == this.f150977d;
        }

        C2333a(int i10, int i11, int i12, int i13) {
            this.f150974a = i10;
            this.f150975b = i11;
            this.f150976c = i12;
            this.f150977d = i13;
        }
    }

    static String c(String str) {
        Matcher matcher = f150969c.matcher(str);
        int iEnd = 0;
        while (matcher.find(iEnd)) {
            if (b(matcher.group(0))) {
                int iStart = matcher.start();
                int iA = a(str, matcher);
                if (iA > 0) {
                    return str.substring(iStart, iA);
                }
                iEnd = -iA;
            } else {
                iEnd = matcher.end();
            }
        }
        return null;
    }

    public static boolean d(String str) {
        return f150971e.matcher(str).matches();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d5, code lost:
    
        if (r10 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d8, code lost:
    
        if (r9 <= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00db, code lost:
    
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00dd, code lost:
    
        return -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        return -r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(java.lang.String r13, java.util.regex.MatchResult r14) {
        /*
            int r14 = r14.end()
            java.util.regex.Pattern r0 = n2.C15768a.f150968b
            java.util.regex.Matcher r0 = r0.matcher(r13)
            r1 = -1
            r2 = 1
            r3 = 0
            java.lang.String r4 = ""
            r9 = r1
            r10 = r9
            r5 = r2
            r6 = r5
            r7 = r6
            r8 = r3
        L15:
            int r11 = r13.length()
            if (r14 >= r11) goto Ld5
            boolean r11 = r0.find(r14)
            if (r11 != 0) goto L27
            int r13 = r13.length()
        L25:
            int r13 = -r13
            return r13
        L27:
            int r11 = r0.end()
            int r12 = r0.start()
            int r11 = r11 - r12
            r12 = 25
            if (r11 <= r12) goto L39
            int r13 = r0.end()
            goto L25
        L39:
            int r11 = r0.start()
            if (r14 >= r11) goto L51
            int r11 = r14 + 1
            char r14 = r13.charAt(r14)
            java.lang.String r12 = "\n\u000b\f\r\u0085\u2028\u2029"
            int r14 = r12.indexOf(r14)
            if (r14 == r1) goto L4f
            int r5 = r5 + 1
        L4f:
            r14 = r11
            goto L39
        L51:
            r11 = 5
            if (r5 <= r11) goto L56
            goto Ld5
        L56:
            int r6 = r6 + r2
            r12 = 14
            if (r6 <= r12) goto L5d
            goto Ld5
        L5d:
            java.util.regex.MatchResult r12 = f(r13, r14)
            if (r12 == 0) goto L6d
            if (r7 == 0) goto L69
            if (r5 <= r2) goto L69
            int r13 = -r14
            return r13
        L69:
            if (r9 != r1) goto Lcb
            r9 = r14
            goto Lcb
        L6d:
            java.lang.String r7 = r0.group(r3)
            boolean r7 = d(r7)
            if (r7 == 0) goto L7a
            r8 = r2
        L78:
            r7 = r3
            goto Lcb
        L7a:
            if (r6 != r11) goto L83
            if (r8 != 0) goto L83
            int r14 = r0.end()
            goto Ld5
        L83:
            if (r8 == 0) goto L78
            r7 = 4
            if (r6 <= r7) goto L78
            java.util.regex.MatchResult r14 = g(r13, r14)
            if (r14 == 0) goto L78
            java.lang.String r7 = "et"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto La7
            java.lang.String r4 = r14.group(r3)
            java.lang.String r7 = "al"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto La7
            int r14 = r14.end()
            goto Ld5
        La7:
            java.util.regex.Pattern r4 = n2.C15768a.f150968b
            java.util.regex.Matcher r4 = r4.matcher(r13)
            int r7 = r14.end()
            boolean r7 = r4.find(r7)
            if (r7 == 0) goto Lc6
            java.lang.String r7 = r4.group(r3)
            boolean r14 = e(r7, r14)
            if (r14 == 0) goto L78
            int r13 = r4.end()
            return r13
        Lc6:
            int r10 = r14.end()
            goto L78
        Lcb:
            java.lang.String r4 = r0.group(r3)
            int r14 = r0.end()
            goto L15
        Ld5:
            if (r10 <= 0) goto Ld8
            return r10
        Ld8:
            if (r9 <= 0) goto Ldb
            goto Ldc
        Ldb:
            r9 = r14
        Ldc:
            int r13 = -r9
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.C15768a.a(java.lang.String, java.util.regex.MatchResult):int");
    }
}
