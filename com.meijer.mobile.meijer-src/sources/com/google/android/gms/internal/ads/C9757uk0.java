package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.ads.uk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9757uk0 {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f79741a;

    private C9757uk0(OutputStream outputStream) {
        this.f79741a = outputStream;
    }

    public static C9757uk0 b(OutputStream outputStream) {
        return new C9757uk0(outputStream);
    }

    public final void a(C8811ls0 c8811ls0) throws IOException {
        try {
            c8811ls0.i(this.f79741a);
        } finally {
            this.f79741a.close();
        }
    }
}
