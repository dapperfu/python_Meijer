package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes6.dex */
public final class M60 {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f69368a;

    public final String a(String str) {
        Pattern pattern = this.f69368a;
        if (pattern == null || str == null) {
            return null;
        }
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public M60() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) Oc.A.c().a(C8784lf.f76831H6));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f69368a = patternCompile;
    }
}
