package Ef;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* loaded from: classes7.dex */
class i implements Bf.f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8973a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8974b = false;

    /* renamed from: c, reason: collision with root package name */
    private Bf.b f8975c;

    /* renamed from: d, reason: collision with root package name */
    private final f f8976d;

    void c(Bf.b bVar, boolean z10) {
        this.f8973a = false;
        this.f8975c = bVar;
        this.f8974b = z10;
    }

    private void b() {
        if (this.f8973a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f8973a = true;
    }

    i(f fVar) {
        this.f8976d = fVar;
    }

    @Override // Bf.f
    public Bf.f a(String str) throws IOException {
        b();
        this.f8976d.i(this.f8975c, str, this.f8974b);
        return this;
    }

    @Override // Bf.f
    public Bf.f g(boolean z10) throws IOException {
        b();
        this.f8976d.o(this.f8975c, z10, this.f8974b);
        return this;
    }
}
