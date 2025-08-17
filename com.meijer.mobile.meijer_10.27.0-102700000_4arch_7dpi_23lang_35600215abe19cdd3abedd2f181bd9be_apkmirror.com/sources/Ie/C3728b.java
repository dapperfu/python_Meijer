package Ie;

import com.google.crypto.tink.shaded.protobuf.C11319o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Ie.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3728b implements r {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f13836a;

    public static r b(byte[] bArr) {
        return new C3728b(new ByteArrayInputStream(bArr));
    }

    @Override // Ie.r
    public Ue.t a() throws IOException {
        try {
            return Ue.t.c0(this.f13836a, C11319o.b());
        } finally {
            this.f13836a.close();
        }
    }

    @Override // Ie.r
    public Ue.C read() throws IOException {
        try {
            return Ue.C.h0(this.f13836a, C11319o.b());
        } finally {
            this.f13836a.close();
        }
    }

    private C3728b(InputStream inputStream) {
        this.f13836a = inputStream;
    }
}
