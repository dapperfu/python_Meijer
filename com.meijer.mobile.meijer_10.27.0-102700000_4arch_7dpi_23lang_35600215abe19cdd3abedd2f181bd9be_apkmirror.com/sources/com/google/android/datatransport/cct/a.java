package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import pc.C16279c;
import rc.g;

/* loaded from: classes4.dex */
public final class a implements g {

    /* renamed from: c, reason: collision with root package name */
    static final String f64412c;

    /* renamed from: d, reason: collision with root package name */
    static final String f64413d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f64414e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set<C16279c> f64415f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f64416g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f64417h;

    /* renamed from: a, reason: collision with root package name */
    private final String f64418a;

    /* renamed from: b, reason: collision with root package name */
    private final String f64419b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f64412c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f64413d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f64414e = strA3;
        f64415f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C16279c.b("proto"), C16279c.b("json"))));
        f64416g = new a(strA, null);
        f64417h = new a(strA2, strA3);
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // rc.g
    public Set<C16279c> a() {
        return f64415f;
    }

    public byte[] b() {
        String str = this.f64419b;
        if (str == null && this.f64418a == null) {
            return null;
        }
        String str2 = this.f64418a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f64419b;
    }

    public String e() {
        return this.f64418a;
    }

    @Override // rc.f
    public String getName() {
        return "cct";
    }

    public a(String str, String str2) {
        this.f64418a = str;
        this.f64419b = str2;
    }

    @Override // rc.f
    public byte[] getExtras() {
        return b();
    }
}
