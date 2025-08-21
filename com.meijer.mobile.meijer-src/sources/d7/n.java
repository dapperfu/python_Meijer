package d7;

import java.util.Queue;

/* loaded from: classes4.dex */
public class n<A, B> {

    /* renamed from: a, reason: collision with root package name */
    private final r7.h<b<A>, B> f128237a;

    class a extends r7.h<b<A>, B> {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // r7.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b<A> bVar, B b10) {
            bVar.c();
        }
    }

    static final class b<A> {

        /* renamed from: d, reason: collision with root package name */
        private static final Queue<b<?>> f128239d = r7.l.f(0);

        /* renamed from: a, reason: collision with root package name */
        private int f128240a;

        /* renamed from: b, reason: collision with root package name */
        private int f128241b;

        /* renamed from: c, reason: collision with root package name */
        private A f128242c;

        static <A> b<A> a(A a10, int i10, int i11) {
            b<A> bVar;
            Queue<b<?>> queue = f128239d;
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
            this.f128242c = a10;
            this.f128241b = i10;
            this.f128240a = i11;
        }

        public void c() {
            Queue<b<?>> queue = f128239d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f128241b == bVar.f128241b && this.f128240a == bVar.f128240a && this.f128242c.equals(bVar.f128242c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f128240a * 31) + this.f128241b) * 31) + this.f128242c.hashCode();
        }

        private b() {
        }
    }

    public n(long j10) {
        this.f128237a = new a(j10);
    }

    public B a(A a10, int i10, int i11) {
        b<A> bVarA = b.a(a10, i10, i11);
        B bG = this.f128237a.g(bVarA);
        bVarA.c();
        return bG;
    }

    public void b(A a10, int i10, int i11, B b10) {
        this.f128237a.k(b.a(a10, i10, i11), b10);
    }
}
