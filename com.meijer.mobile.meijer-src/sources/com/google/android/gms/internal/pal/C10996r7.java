package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.pal.r7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10996r7 implements G7 {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f84674b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f84675a;

    private C10996r7(InputStream inputStream) {
        this.f84675a = inputStream;
    }

    public static G7 a(InputStream inputStream) throws IOException {
        return new C10996r7(inputStream);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0133  */
    @Override // com.google.android.gms.internal.pal.G7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.pal.Fd zzb() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.C10996r7.zzb():com.google.android.gms.internal.pal.Fd");
    }
}
