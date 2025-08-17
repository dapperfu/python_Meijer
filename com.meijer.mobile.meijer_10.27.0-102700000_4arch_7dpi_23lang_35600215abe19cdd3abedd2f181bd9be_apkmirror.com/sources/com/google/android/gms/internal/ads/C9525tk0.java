package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.tk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9525tk0 {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f78618a;

    private C9525tk0(InputStream inputStream) {
        this.f78618a = inputStream;
    }

    public static C9525tk0 b(byte[] bArr) {
        return new C9525tk0(new ByteArrayInputStream(bArr));
    }

    public final C8686ls0 a() throws IOException {
        try {
            return C8686ls0.g0(this.f78618a, C9225qu0.a());
        } finally {
            this.f78618a.close();
        }
    }
}
