package Dd;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* loaded from: classes6.dex */
final class W0 implements Bf.f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5558a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5559b = false;

    /* renamed from: c, reason: collision with root package name */
    private Bf.b f5560c;

    /* renamed from: d, reason: collision with root package name */
    private final S0 f5561d;

    final void b(Bf.b bVar, boolean z10) {
        this.f5558a = false;
        this.f5560c = bVar;
        this.f5559b = z10;
    }

    private final void c() {
        if (this.f5558a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f5558a = true;
    }

    W0(S0 s02) {
        this.f5561d = s02;
    }

    @Override // Bf.f
    public final Bf.f a(String str) throws IOException {
        c();
        this.f5561d.h(this.f5560c, str, this.f5559b);
        return this;
    }

    @Override // Bf.f
    public final Bf.f g(boolean z10) throws IOException {
        c();
        this.f5561d.i(this.f5560c, z10 ? 1 : 0, this.f5559b);
        return this;
    }
}
