package com.google.ads.interactivemedia.v3.internal;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class zzta implements FilenameFilter {
    private final Pattern zza;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.zza.matcher(str).matches();
    }

    public zzta(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }
}
