package Mv;

import com.medallia.digital.mobilesdk.q2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 *2\u00020\u0001:\u0001\u001cB[\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058G¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0006\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028G¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b\u0007\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\b\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8G¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b\n\u0010&R\u0017\u0010\u000b\u001a\u00020\t8G¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b\u000b\u0010&R\u0017\u0010\f\u001a\u00020\t8G¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b\f\u0010&R\u0017\u0010\r\u001a\u00020\t8G¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b\r\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028G¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b\u000e\u0010\u0018¨\u0006+"}, d2 = {"LMv/i;", "", "", "name", "value", "", "expiresAt", "domain", "path", "", "secure", "httpOnly", "persistent", "hostOnly", "sameSite", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "forObsoleteRfc2965", "f", "(Z)Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "b", "g", "c", "J", "()J", "d", "Z", "()Z", "h", "i", "j", "k", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f20466l = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f20467m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f20468n = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f20469o = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long expiresAt;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String domain;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String path;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean secure;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean httpOnly;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean persistent;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean hostOnly;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String sameSite;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b \u0010!J%\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0$2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&R\u001c\u0010)\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010+\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u001c\u0010,\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001c\u0010-\u001a\n (*\u0004\u0018\u00010'0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*¨\u0006."}, d2 = {"LMv/i$a;", "", "<init>", "()V", "", "urlHost", "domain", "", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "s", "", "pos", "limit", "", "g", "(Ljava/lang/String;II)J", "input", "invert", "a", "(Ljava/lang/String;IIZ)I", "h", "(Ljava/lang/String;)J", "f", "(Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "url", "setCookie", "LMv/i;", "c", "(Lokhttp3/HttpUrl;Ljava/lang/String;)LMv/i;", "currentTimeMillis", "d", "(JLokhttp3/HttpUrl;Ljava/lang/String;)LMv/i;", "Lokhttp3/Headers;", "headers", "", "e", "(Lokhttp3/HttpUrl;Lokhttp3/Headers;)Ljava/util/List;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "YEAR_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "DAY_OF_MONTH_PATTERN", "TIME_PATTERN", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Mv.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String f(String s10) {
            if (StringsKt.G(s10, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strK = Nv.f.k(StringsKt.K0(s10, "."));
            if (strK != null) {
                return strK;
            }
            throw new IllegalArgumentException();
        }

        private Companion() {
        }

        private final int a(String input, int pos, int limit, boolean invert) {
            while (pos < limit) {
                char cCharAt = input.charAt(pos);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!invert)) {
                    return pos;
                }
                pos++;
            }
            return limit;
        }

        private final long g(String s10, int pos, int limit) throws NumberFormatException {
            int iA = a(s10, pos, limit, false);
            Matcher matcher = i.f20469o.matcher(s10);
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int iQ0 = -1;
            int i13 = -1;
            int i14 = -1;
            while (iA < limit) {
                int iA2 = a(s10, iA + 1, limit, true);
                matcher.region(iA, iA2);
                if (i11 == -1 && matcher.usePattern(i.f20469o).matches()) {
                    String strGroup = matcher.group(1);
                    Intrinsics.i(strGroup, "group(...)");
                    i11 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    Intrinsics.i(strGroup2, "group(...)");
                    i13 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    Intrinsics.i(strGroup3, "group(...)");
                    i14 = Integer.parseInt(strGroup3);
                } else if (i12 == -1 && matcher.usePattern(i.f20468n).matches()) {
                    String strGroup4 = matcher.group(1);
                    Intrinsics.i(strGroup4, "group(...)");
                    i12 = Integer.parseInt(strGroup4);
                } else if (iQ0 == -1 && matcher.usePattern(i.f20467m).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.i(strGroup5, "group(...)");
                    Locale US = Locale.US;
                    Intrinsics.i(US, "US");
                    String lowerCase = strGroup5.toLowerCase(US);
                    Intrinsics.i(lowerCase, "toLowerCase(...)");
                    String strPattern = i.f20467m.pattern();
                    Intrinsics.i(strPattern, "pattern(...)");
                    iQ0 = StringsKt.q0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i10 == -1 && matcher.usePattern(i.f20466l).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.i(strGroup6, "group(...)");
                    i10 = Integer.parseInt(strGroup6);
                }
                iA = a(s10, iA2 + 1, limit, false);
            }
            if (70 <= i10 && i10 < 100) {
                i10 += 1900;
            }
            if (i10 >= 0 && i10 < 70) {
                i10 += 2000;
            }
            if (i10 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iQ0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i12 || i12 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i11 < 0 || i11 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i14 < 0 || i14 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Nv.k.f22780a);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i10);
            gregorianCalendar.set(2, iQ0 - 1);
            gregorianCalendar.set(5, i12);
            gregorianCalendar.set(11, i11);
            gregorianCalendar.set(12, i13);
            gregorianCalendar.set(13, i14);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String s10) throws NumberFormatException {
            try {
                long j10 = Long.parseLong(s10);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new Regex("-?\\d+").j(s10)) {
                    return StringsKt.W(s10, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        @JvmStatic
        public final i c(HttpUrl url, String setCookie) {
            Intrinsics.j(url, "url");
            Intrinsics.j(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        public final i d(long currentTimeMillis, HttpUrl url, String setCookie) throws NumberFormatException {
            long j10;
            Intrinsics.j(url, "url");
            Intrinsics.j(setCookie, "setCookie");
            int iL = Nv.h.l(setCookie, ';', 0, 0, 6, null);
            int iL2 = Nv.h.l(setCookie, '=', 0, iL, 2, null);
            i iVar = null;
            if (iL2 == iL) {
                return null;
            }
            String strF = Nv.h.F(setCookie, 0, iL2, 1, null);
            if (strF.length() == 0 || Nv.h.p(strF) != -1) {
                return null;
            }
            String strE = Nv.h.E(setCookie, iL2 + 1, iL);
            if (Nv.h.p(strE) != -1) {
                return null;
            }
            int i10 = iL + 1;
            int length = setCookie.length();
            String strF2 = null;
            String str = null;
            String str2 = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long jH = -1;
            long jG = 253402300799999L;
            while (i10 < length) {
                int iJ = Nv.h.j(setCookie, ';', i10, length);
                int iJ2 = Nv.h.j(setCookie, '=', i10, iJ);
                String strE2 = Nv.h.E(setCookie, i10, iJ2);
                String strE3 = iJ2 < iJ ? Nv.h.E(setCookie, iJ2 + 1, iJ) : "";
                i iVar2 = iVar;
                if (StringsKt.H(strE2, "expires", true)) {
                    try {
                        jG = g(strE3, 0, strE3.length());
                        z11 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (StringsKt.H(strE2, "max-age", true)) {
                    jH = h(strE3);
                    z11 = true;
                } else if (StringsKt.H(strE2, "domain", true)) {
                    strF2 = f(strE3);
                    z13 = false;
                } else if (StringsKt.H(strE2, "path", true)) {
                    str = strE3;
                } else if (StringsKt.H(strE2, "secure", true)) {
                    z12 = true;
                } else if (StringsKt.H(strE2, "httponly", true)) {
                    z10 = true;
                } else if (StringsKt.H(strE2, "samesite", true)) {
                    str2 = strE3;
                }
                i10 = iJ + 1;
                iVar = iVar2;
            }
            i iVar3 = iVar;
            if (jH == Long.MIN_VALUE) {
                j10 = Long.MIN_VALUE;
            } else if (jH != -1) {
                long j11 = currentTimeMillis + (jH <= 9223372036854775L ? jH * 1000 : Long.MAX_VALUE);
                j10 = (j11 < currentTimeMillis || j11 > 253402300799999L) ? 253402300799999L : j11;
            } else {
                j10 = jG;
            }
            String host = url.getHost();
            if (strF2 == null) {
                strF2 = host;
            } else if (!b(host, strF2)) {
                return iVar3;
            }
            if (host.length() != strF2.length() && PublicSuffixDatabase.INSTANCE.c().c(strF2) == null) {
                return iVar3;
            }
            String strSubstring = q2.f93563c;
            if (str == null || !StringsKt.W(str, q2.f93563c, false, 2, iVar3)) {
                String strC = url.c();
                int iW0 = StringsKt.w0(strC, '/', 0, false, 6, null);
                if (iW0 != 0) {
                    strSubstring = strC.substring(0, iW0);
                    Intrinsics.i(strSubstring, "substring(...)");
                }
                str = strSubstring;
            }
            return new i(strF, strE, j10, strF2, str, z12, z10, z11, z13, str2, null);
        }

        @JvmStatic
        public final List<i> e(HttpUrl url, Headers headers) {
            Intrinsics.j(url, "url");
            Intrinsics.j(headers, "headers");
            List<String> listQ = headers.q("Set-Cookie");
            int size = listQ.size();
            List<i> listUnmodifiableList = null;
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                i iVarC = c(url, listQ.get(i10));
                if (iVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(iVarC);
                }
            }
            if (arrayList != null) {
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                Intrinsics.i(listUnmodifiableList, "unmodifiableList(...)");
            }
            return listUnmodifiableList == null ? CollectionsKt.m() : listUnmodifiableList;
        }

        private final boolean b(String urlHost, String domain) {
            if (Intrinsics.e(urlHost, domain)) {
                return true;
            }
            if (StringsKt.G(urlHost, domain, false, 2, null) && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !Nv.f.a(urlHost)) {
                return true;
            }
            return false;
        }
    }

    public /* synthetic */ i(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13, str5);
    }

    public String toString() {
        return f(false);
    }

    private i(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j10;
        this.domain = str3;
        this.path = str4;
        this.secure = z10;
        this.httpOnly = z11;
        this.persistent = z12;
        this.hostOnly = z13;
        this.sameSite = str5;
    }

    @JvmName
    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return Intrinsics.e(iVar.name, this.name) && Intrinsics.e(iVar.value, this.value) && iVar.expiresAt == this.expiresAt && Intrinsics.e(iVar.domain, this.domain) && Intrinsics.e(iVar.path, this.path) && iVar.secure == this.secure && iVar.httpOnly == this.httpOnly && iVar.persistent == this.persistent && iVar.hostOnly == this.hostOnly && Intrinsics.e(iVar.sameSite, this.sameSite);
    }

    public final String f(boolean forObsoleteRfc2965) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.name);
        sb2.append('=');
        sb2.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(Sv.c.b(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb2.append("; domain=");
            if (forObsoleteRfc2965) {
                sb2.append(".");
            }
            sb2.append(this.domain);
        }
        sb2.append("; path=");
        sb2.append(this.path);
        if (this.secure) {
            sb2.append("; secure");
        }
        if (this.httpOnly) {
            sb2.append("; httponly");
        }
        if (this.sameSite != null) {
            sb2.append("; samesite=");
            sb2.append(this.sameSite);
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    @JvmName
    /* renamed from: g, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int iHashCode = (((((((((((((((((527 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.secure)) * 31) + Boolean.hashCode(this.httpOnly)) * 31) + Boolean.hashCode(this.persistent)) * 31) + Boolean.hashCode(this.hostOnly)) * 31;
        String str = this.sameSite;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
