package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.tk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9650tk0 {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f79458a;

    private C9650tk0(InputStream inputStream) {
        this.f79458a = inputStream;
    }

    public static C9650tk0 b(byte[] bArr) {
        return new C9650tk0(new ByteArrayInputStream(bArr));
    }

    public final C8811ls0 a() throws IOException {
        try {
            return C8811ls0.g0(this.f79458a, C9350qu0.a());
        } finally {
            this.f79458a.close();
        }
    }
}
