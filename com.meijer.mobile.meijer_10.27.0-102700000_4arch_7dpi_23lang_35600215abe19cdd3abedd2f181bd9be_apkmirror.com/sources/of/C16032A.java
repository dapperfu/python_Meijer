package of;

import java.io.File;
import java.io.IOException;

/* renamed from: of.A, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C16032A {

    /* renamed from: a, reason: collision with root package name */
    private final String f153416a;

    /* renamed from: b, reason: collision with root package name */
    private final uf.g f153417b;

    private File b() {
        return this.f153417b.g(this.f153416a);
    }

    public C16032A(String str, uf.g gVar) {
        this.f153416a = str;
        this.f153417b = gVar;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            lf.g.f().e("Error creating marker: " + this.f153416a, e10);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
