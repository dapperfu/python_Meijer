package Gd;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: Gd.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3721p implements Df.f {

    /* renamed from: a, reason: collision with root package name */
    private boolean f12192a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f12193b = false;

    /* renamed from: c, reason: collision with root package name */
    private Df.b f12194c;

    /* renamed from: d, reason: collision with root package name */
    private final C3693l f12195d;

    final void a(Df.b bVar, boolean z10) {
        this.f12192a = false;
        this.f12194c = bVar;
        this.f12193b = z10;
    }

    private final void c() {
        if (this.f12192a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f12192a = true;
    }

    C3721p(C3693l c3693l) {
        this.f12195d = c3693l;
    }

    @Override // Df.f
    public final Df.f b(String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        c();
        this.f12195d.h(this.f12194c, str, this.f12193b);
        return this;
    }

    @Override // Df.f
    public final Df.f g(boolean z10) throws IOException {
        c();
        this.f12195d.i(this.f12194c, z10 ? 1 : 0, this.f12193b);
        return this;
    }
}
