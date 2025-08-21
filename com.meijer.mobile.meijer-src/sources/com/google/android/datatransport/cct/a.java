package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import rc.C16883c;
import tc.g;

/* loaded from: classes4.dex */
public final class a implements g {

    /* renamed from: c, reason: collision with root package name */
    static final String f65252c;

    /* renamed from: d, reason: collision with root package name */
    static final String f65253d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f65254e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set<C16883c> f65255f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f65256g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f65257h;

    /* renamed from: a, reason: collision with root package name */
    private final String f65258a;

    /* renamed from: b, reason: collision with root package name */
    private final String f65259b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f65252c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f65253d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f65254e = strA3;
        f65255f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C16883c.b("proto"), C16883c.b("json"))));
        f65256g = new a(strA, null);
        f65257h = new a(strA2, strA3);
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

    @Override // tc.g
    public Set<C16883c> a() {
        return f65255f;
    }

    public byte[] b() {
        String str = this.f65259b;
        if (str == null && this.f65258a == null) {
            return null;
        }
        String str2 = this.f65258a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f65259b;
    }

    public String e() {
        return this.f65258a;
    }

    @Override // tc.f
    public String getName() {
        return "cct";
    }

    public a(String str, String str2) {
        this.f65258a = str;
        this.f65259b = str2;
    }

    @Override // tc.f
    public byte[] getExtras() {
        return b();
    }
}
