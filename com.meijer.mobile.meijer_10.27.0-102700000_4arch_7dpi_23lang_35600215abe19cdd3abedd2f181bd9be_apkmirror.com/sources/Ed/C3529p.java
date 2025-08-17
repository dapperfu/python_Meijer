package Ed;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: Ed.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3529p implements Bf.f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8640a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8641b = false;

    /* renamed from: c, reason: collision with root package name */
    private Bf.b f8642c;

    /* renamed from: d, reason: collision with root package name */
    private final C3501l f8643d;

    final void b(Bf.b bVar, boolean z10) {
        this.f8640a = false;
        this.f8642c = bVar;
        this.f8641b = z10;
    }

    private final void c() {
        if (this.f8640a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f8640a = true;
    }

    C3529p(C3501l c3501l) {
        this.f8643d = c3501l;
    }

    @Override // Bf.f
    public final Bf.f a(String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        c();
        this.f8643d.h(this.f8642c, str, this.f8641b);
        return this;
    }

    @Override // Bf.f
    public final Bf.f g(boolean z10) throws IOException {
        c();
        this.f8643d.i(this.f8642c, z10 ? 1 : 0, this.f8641b);
        return this;
    }
}
