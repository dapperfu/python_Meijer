package b7;

import java.util.Queue;

/* loaded from: classes4.dex */
public class n<A, B> {

    /* renamed from: a, reason: collision with root package name */
    private final p7.h<b<A>, B> f60002a;

    class a extends p7.h<b<A>, B> {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p7.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b<A> bVar, B b10) {
            bVar.c();
        }
    }

    static final class b<A> {

        /* renamed from: d, reason: collision with root package name */
        private static final Queue<b<?>> f60004d = p7.l.f(0);

        /* renamed from: a, reason: collision with root package name */
        private int f60005a;

        /* renamed from: b, reason: collision with root package name */
        private int f60006b;

        /* renamed from: c, reason: collision with root package name */
        private A f60007c;

        static <A> b<A> a(A a10, int i10, int i11) {
            b<A> bVar;
            Queue<b<?>> queue = f60004d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a10, i10, i11);
            return bVar;
        }

        private void b(A a10, int i10, int i11) {
            this.f60007c = a10;
            this.f60006b = i10;
            this.f60005a = i11;
        }

        public void c() {
            Queue<b<?>> queue = f60004d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f60006b == bVar.f60006b && this.f60005a == bVar.f60005a && this.f60007c.equals(bVar.f60007c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f60005a * 31) + this.f60006b) * 31) + this.f60007c.hashCode();
        }

        private b() {
        }
    }

    public n(long j10) {
        this.f60002a = new a(j10);
    }

    public B a(A a10, int i10, int i11) {
        b<A> bVarA = b.a(a10, i10, i11);
        B bG = this.f60002a.g(bVarA);
        bVarA.c();
        return bG;
    }

    public void b(A a10, int i10, int i11, B b10) {
        this.f60002a.k(b.a(a10, i10, i11), b10);
    }
}
