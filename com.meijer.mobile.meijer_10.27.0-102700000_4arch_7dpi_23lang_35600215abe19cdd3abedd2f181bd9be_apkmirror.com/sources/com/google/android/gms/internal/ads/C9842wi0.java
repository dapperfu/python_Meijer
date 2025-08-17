package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.wi0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9842wi0 implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    private final Pattern f79519a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f79519a.matcher(str).matches();
    }

    public C9842wi0(Pattern pattern) {
        pattern.getClass();
        this.f79519a = pattern;
    }
}
