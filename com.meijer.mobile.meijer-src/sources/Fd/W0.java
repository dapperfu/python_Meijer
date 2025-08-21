package Fd;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* loaded from: classes6.dex */
final class W0 implements Df.f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9591a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9592b = false;

    /* renamed from: c, reason: collision with root package name */
    private Df.b f9593c;

    /* renamed from: d, reason: collision with root package name */
    private final S0 f9594d;

    final void a(Df.b bVar, boolean z10) {
        this.f9591a = false;
        this.f9593c = bVar;
        this.f9592b = z10;
    }

    private final void c() {
        if (this.f9591a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f9591a = true;
    }

    W0(S0 s02) {
        this.f9594d = s02;
    }

    @Override // Df.f
    public final Df.f b(String str) throws IOException {
        c();
        this.f9594d.h(this.f9593c, str, this.f9592b);
        return this;
    }

    @Override // Df.f
    public final Df.f g(boolean z10) throws IOException {
        c();
        this.f9594d.i(this.f9593c, z10 ? 1 : 0, this.f9592b);
        return this;
    }
}
