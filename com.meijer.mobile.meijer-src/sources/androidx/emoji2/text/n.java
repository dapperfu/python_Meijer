package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final I2.b f54873a;

    /* renamed from: b, reason: collision with root package name */
    private final char[] f54874b;

    /* renamed from: c, reason: collision with root package name */
    private final a f54875c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    private final Typeface f54876d;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray<a> f54877a;

        /* renamed from: b, reason: collision with root package name */
        private p f54878b;

        private a() {
            this(1);
        }

        a(int i10) {
            this.f54877a = new SparseArray<>(i10);
        }

        a a(int i10) {
            SparseArray<a> sparseArray = this.f54877a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        final p b() {
            return this.f54878b;
        }

        void c(p pVar, int i10, int i11) {
            a aVarA = a(pVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f54877a.put(pVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(pVar, i10 + 1, i11);
            } else {
                aVarA.f54878b = pVar;
            }
        }
    }

    public static n b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            j2.n.a("EmojiCompat.MetadataRepo.create");
            return new n(typeface, m.b(byteBuffer));
        } finally {
            j2.n.b();
        }
    }

    public char[] c() {
        return this.f54874b;
    }

    public I2.b d() {
        return this.f54873a;
    }

    int e() {
        return this.f54873a.l();
    }

    a f() {
        return this.f54875c;
    }

    Typeface g() {
        return this.f54876d;
    }

    void h(p pVar) {
        o2.i.h(pVar, "emoji metadata cannot be null");
        o2.i.b(pVar.c() > 0, "invalid metadata codepoint length");
        this.f54875c.c(pVar, 0, pVar.c() - 1);
    }

    private n(Typeface typeface, I2.b bVar) {
        this.f54876d = typeface;
        this.f54873a = bVar;
        this.f54874b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(I2.b bVar) {
        int iK = bVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            p pVar = new p(this, i10);
            Character.toChars(pVar.f(), this.f54874b, i10 * 2);
            h(pVar);
        }
    }
}
