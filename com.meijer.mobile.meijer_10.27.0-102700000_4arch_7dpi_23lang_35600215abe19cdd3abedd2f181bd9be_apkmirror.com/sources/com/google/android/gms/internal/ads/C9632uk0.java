package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.ads.uk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9632uk0 {

    /* renamed from: a, reason: collision with root package name */
    private final OutputStream f78901a;

    private C9632uk0(OutputStream outputStream) {
        this.f78901a = outputStream;
    }

    public static C9632uk0 b(OutputStream outputStream) {
        return new C9632uk0(outputStream);
    }

    public final void a(C8686ls0 c8686ls0) throws IOException {
        try {
            c8686ls0.i(this.f78901a);
        } finally {
            this.f78901a.close();
        }
    }
}
