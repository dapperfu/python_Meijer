package Gf;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* loaded from: classes8.dex */
class i implements Df.f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12525a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12526b = false;

    /* renamed from: c, reason: collision with root package name */
    private Df.b f12527c;

    /* renamed from: d, reason: collision with root package name */
    private final f f12528d;

    void c(Df.b bVar, boolean z10) {
        this.f12525a = false;
        this.f12527c = bVar;
        this.f12526b = z10;
    }

    private void a() {
        if (this.f12525a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f12525a = true;
    }

    i(f fVar) {
        this.f12528d = fVar;
    }

    @Override // Df.f
    public Df.f b(String str) throws IOException {
        a();
        this.f12528d.i(this.f12527c, str, this.f12526b);
        return this;
    }

    @Override // Df.f
    public Df.f g(boolean z10) throws IOException {
        a();
        this.f12528d.o(this.f12527c, z10, this.f12526b);
        return this;
    }
}
