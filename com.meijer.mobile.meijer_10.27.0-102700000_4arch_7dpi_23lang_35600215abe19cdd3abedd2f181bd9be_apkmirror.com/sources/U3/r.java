package U3;

import Ce.L;
import d3.InterfaceC13477l;
import java.util.Objects;

/* loaded from: classes4.dex */
public interface r {

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35728a = new C0782a();

        /* renamed from: U3.r$a$a, reason: collision with other inner class name */
        class C0782a implements a {
            @Override // U3.r.a
            public boolean a(a3.t tVar) {
                return false;
            }

            @Override // U3.r.a
            public int b(a3.t tVar) {
                return 1;
            }

            @Override // U3.r.a
            public r c(a3.t tVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            C0782a() {
            }
        }

        boolean a(a3.t tVar);

        int b(a3.t tVar);

        r c(a3.t tVar);
    }

    public static class b {

        /* renamed from: c, reason: collision with root package name */
        private static final b f35729c = new b(-9223372036854775807L, false);

        /* renamed from: a, reason: collision with root package name */
        public final long f35730a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35731b;

        public static b b() {
            return f35729c;
        }

        public static b c(long j10) {
            return new b(j10, true);
        }

        private b(long j10, boolean z10) {
            this.f35730a = j10;
            this.f35731b = z10;
        }
    }

    void a(byte[] bArr, int i10, int i11, b bVar, InterfaceC13477l<e> interfaceC13477l);

    int c();

    default void reset() {
    }

    default k b(byte[] bArr, int i10, int i11) {
        final L.a aVarP = L.p();
        b bVar = b.f35729c;
        Objects.requireNonNull(aVarP);
        a(bArr, i10, i11, bVar, new InterfaceC13477l() { // from class: U3.q
            @Override // d3.InterfaceC13477l
            public final void accept(Object obj) {
                aVarP.a((e) obj);
            }
        });
        return new g(aVarP.k());
    }
}
