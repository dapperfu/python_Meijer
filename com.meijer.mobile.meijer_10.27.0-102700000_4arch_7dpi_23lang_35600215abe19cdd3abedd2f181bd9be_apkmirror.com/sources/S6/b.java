package S6;

import S6.i;
import S6.j;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static final i.f<byte[]> f33247a = new a();

    /* renamed from: b, reason: collision with root package name */
    static final j.a<byte[]> f33248b = new C0748b();

    class a implements i.f<byte[]> {
        a() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public byte[] a(i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return b.a(iVar);
        }
    }

    /* renamed from: S6.b$b, reason: collision with other inner class name */
    class C0748b implements j.a<byte[]> {
        C0748b() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, byte[] bArr) throws IOException {
            b.b(bArr, jVar);
        }
    }

    public static void b(byte[] bArr, j jVar) throws IOException {
        if (bArr == null) {
            jVar.n();
        } else if (bArr.length == 0) {
            jVar.i("\"\"");
        } else {
            jVar.k(bArr);
        }
    }

    public static byte[] a(i iVar) throws IOException {
        return iVar.D();
    }
}
