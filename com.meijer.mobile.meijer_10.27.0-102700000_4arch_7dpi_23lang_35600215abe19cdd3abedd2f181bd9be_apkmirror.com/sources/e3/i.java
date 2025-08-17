package e3;

import d3.C13466a;
import d3.D;
import d3.P;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final b f128177a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<D> f128178b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<a> f128179c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityQueue<a> f128180d = new PriorityQueue<>();

    /* renamed from: e, reason: collision with root package name */
    private int f128181e = -1;

    /* renamed from: f, reason: collision with root package name */
    private a f128182f;

    private static final class a implements Comparable<a> {

        /* renamed from: b, reason: collision with root package name */
        public long f128184b = -9223372036854775807L;

        /* renamed from: a, reason: collision with root package name */
        public final List<D> f128183a = new ArrayList();

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f128184b, aVar.f128184b);
        }

        public void b(long j10, D d10) {
            boolean z10;
            if (j10 != -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            C13466a.a(z10);
            C13466a.g(this.f128183a.isEmpty());
            this.f128184b = j10;
            this.f128183a.add(d10);
        }
    }

    public interface b {
        void a(long j10, D d10);
    }

    public void d() {
        e(0);
    }

    private D c(D d10) {
        D d11 = this.f128178b.isEmpty() ? new D() : this.f128178b.pop();
        d11.S(d10.a());
        System.arraycopy(d10.e(), d10.f(), d11.e(), 0, d11.a());
        return d11;
    }

    private void e(int i10) {
        while (this.f128180d.size() > i10) {
            a aVar = (a) P.h(this.f128180d.poll());
            for (int i11 = 0; i11 < aVar.f128183a.size(); i11++) {
                this.f128177a.a(aVar.f128184b, aVar.f128183a.get(i11));
                this.f128178b.push(aVar.f128183a.get(i11));
            }
            aVar.f128183a.clear();
            a aVar2 = this.f128182f;
            if (aVar2 != null && aVar2.f128184b == aVar.f128184b) {
                this.f128182f = null;
            }
            this.f128179c.push(aVar);
        }
    }

    public void a(long j10, D d10) {
        int i10 = this.f128181e;
        if (i10 == 0 || (i10 != -1 && this.f128180d.size() >= this.f128181e && j10 < ((a) P.h(this.f128180d.peek())).f128184b)) {
            this.f128177a.a(j10, d10);
            return;
        }
        D dC = c(d10);
        a aVar = this.f128182f;
        if (aVar != null && j10 == aVar.f128184b) {
            aVar.f128183a.add(dC);
            return;
        }
        a aVar2 = this.f128179c.isEmpty() ? new a() : this.f128179c.pop();
        aVar2.b(j10, dC);
        this.f128180d.add(aVar2);
        this.f128182f = aVar2;
        int i11 = this.f128181e;
        if (i11 != -1) {
            e(i11);
        }
    }

    public void b() {
        this.f128180d.clear();
    }

    public int f() {
        return this.f128181e;
    }

    public void g(int i10) {
        C13466a.g(i10 >= 0);
        this.f128181e = i10;
        e(i10);
    }

    public i(b bVar) {
        this.f128177a = bVar;
    }
}
