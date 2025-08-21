package Ke;

import com.google.crypto.tink.shaded.protobuf.C11444o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Ke.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3887b implements r {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f16582a;

    public static r b(byte[] bArr) {
        return new C3887b(new ByteArrayInputStream(bArr));
    }

    @Override // Ke.r
    public We.t a() throws IOException {
        try {
            return We.t.c0(this.f16582a, C11444o.b());
        } finally {
            this.f16582a.close();
        }
    }

    @Override // Ke.r
    public We.C read() throws IOException {
        try {
            return We.C.h0(this.f16582a, C11444o.b());
        } finally {
            this.f16582a.close();
        }
    }

    private C3887b(InputStream inputStream) {
        this.f16582a = inputStream;
    }
}
