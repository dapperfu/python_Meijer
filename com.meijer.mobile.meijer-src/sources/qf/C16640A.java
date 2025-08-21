package qf;

import java.io.File;
import java.io.IOException;

/* renamed from: qf.A, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C16640A {

    /* renamed from: a, reason: collision with root package name */
    private final String f158268a;

    /* renamed from: b, reason: collision with root package name */
    private final wf.g f158269b;

    private File b() {
        return this.f158269b.g(this.f158268a);
    }

    public C16640A(String str, wf.g gVar) {
        this.f158268a = str;
        this.f158269b = gVar;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e10) {
            nf.g.f().e("Error creating marker: " + this.f158268a, e10);
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
