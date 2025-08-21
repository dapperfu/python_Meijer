package V3;

import U3.k;
import U3.l;
import U3.o;
import U3.p;
import V3.e;
import androidx.media3.extractor.text.SubtitleDecoderException;
import d3.C13599a;
import d3.P;
import g3.e;
import java.util.ArrayDeque;

/* loaded from: classes4.dex */
abstract class e implements l {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<b> f39724a = new ArrayDeque<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<p> f39725b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f39726c;

    /* renamed from: d, reason: collision with root package name */
    private b f39727d;

    /* renamed from: e, reason: collision with root package name */
    private long f39728e;

    /* renamed from: f, reason: collision with root package name */
    private long f39729f;

    /* renamed from: g, reason: collision with root package name */
    private long f39730g;

    private static final class b extends o implements Comparable<b> {

        /* renamed from: k, reason: collision with root package name */
        private long f39731k;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (u() != bVar.u()) {
                if (!u()) {
                    return -1;
                }
                return 1;
            }
            long j10 = this.f55691f - bVar.f55691f;
            if (j10 == 0) {
                j10 = this.f39731k - bVar.f39731k;
                if (j10 == 0) {
                    return 0;
                }
            }
            if (j10 <= 0) {
                return -1;
            }
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends p {

        /* renamed from: g, reason: collision with root package name */
        private e.a<c> f39732g;

        @Override // g3.e
        public final void E() {
            this.f39732g.a(this);
        }

        public c(e.a<c> aVar) {
            this.f39732g = aVar;
        }
    }

    protected abstract k g();

    protected abstract void h(o oVar);

    protected abstract boolean m();

    @Override // g3.d
    public void release() {
    }

    @Override // U3.l
    public void b(long j10) {
        this.f39728e = j10;
    }

    @Override // g3.d
    public final void d(long j10) {
        this.f39730g = j10;
    }

    @Override // g3.d
    public void flush() {
        this.f39729f = 0L;
        this.f39728e = 0L;
        while (!this.f39726c.isEmpty()) {
            o((b) P.h(this.f39726c.poll()));
        }
        b bVar = this.f39727d;
        if (bVar != null) {
            o(bVar);
            this.f39727d = null;
        }
    }

    @Override // g3.d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public o e() throws SubtitleDecoderException {
        C13599a.g(this.f39727d == null);
        if (this.f39724a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f39724a.pollFirst();
        this.f39727d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // g3.d
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public p a() throws SubtitleDecoderException {
        if (this.f39725b.isEmpty()) {
            return null;
        }
        while (!this.f39726c.isEmpty() && ((b) P.h(this.f39726c.peek())).f55691f <= this.f39728e) {
            b bVar = (b) P.h(this.f39726c.poll());
            if (bVar.u()) {
                p pVar = (p) P.h(this.f39725b.pollFirst());
                pVar.m(4);
                o(bVar);
                return pVar;
            }
            h(bVar);
            if (m()) {
                k kVarG = g();
                p pVar2 = (p) P.h(this.f39725b.pollFirst());
                pVar2.F(bVar.f55691f, kVarG, Long.MAX_VALUE);
                o(bVar);
                return pVar2;
            }
            o(bVar);
        }
        return null;
    }

    protected final p k() {
        return this.f39725b.pollFirst();
    }

    protected final long l() {
        return this.f39728e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    @Override // g3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(U3.o r7) throws androidx.media3.extractor.text.SubtitleDecoderException {
        /*
            r6 = this;
            V3.e$b r0 = r6.f39727d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            d3.C13599a.a(r0)
            V3.e$b r7 = (V3.e.b) r7
            boolean r0 = r7.u()
            if (r0 != 0) goto L2d
            long r0 = r7.f55691f
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2d
            long r2 = r6.f39730g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L2d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r6.o(r7)
            goto L3c
        L2d:
            long r0 = r6.f39729f
            r2 = 1
            long r2 = r2 + r0
            r6.f39729f = r2
            V3.e.b.K(r7, r0)
            java.util.ArrayDeque<V3.e$b> r0 = r6.f39726c
            r0.add(r7)
        L3c:
            r7 = 0
            r6.f39727d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.e.c(U3.o):void");
    }

    public e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f39724a.add(new b());
        }
        this.f39725b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f39725b.add(new c(new e.a() { // from class: V3.d
                @Override // g3.e.a
                public final void a(g3.e eVar) {
                    this.f39723a.p((e.c) eVar);
                }
            }));
        }
        this.f39726c = new ArrayDeque<>();
        this.f39730g = -9223372036854775807L;
    }

    private void o(b bVar) {
        bVar.o();
        this.f39724a.add(bVar);
    }

    protected void p(p pVar) {
        pVar.o();
        this.f39725b.add(pVar);
    }
}
