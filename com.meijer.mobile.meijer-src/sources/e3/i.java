package e3;

import d3.C13599a;
import d3.D;
import d3.P;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final b f129513a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<D> f129514b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<a> f129515c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final PriorityQueue<a> f129516d = new PriorityQueue<>();

    /* renamed from: e, reason: collision with root package name */
    private int f129517e = -1;

    /* renamed from: f, reason: collision with root package name */
    private a f129518f;

    private static final class a implements Comparable<a> {

        /* renamed from: b, reason: collision with root package name */
        public long f129520b = -9223372036854775807L;

        /* renamed from: a, reason: collision with root package name */
        public final List<D> f129519a = new ArrayList();

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f129520b, aVar.f129520b);
        }

        public void b(long j10, D d10) {
            boolean z10;
            if (j10 != -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            C13599a.a(z10);
            C13599a.g(this.f129519a.isEmpty());
            this.f129520b = j10;
            this.f129519a.add(d10);
        }
    }

    public interface b {
        void a(long j10, D d10);
    }

    public void d() {
        e(0);
    }

    private D c(D d10) {
        D d11 = this.f129514b.isEmpty() ? new D() : this.f129514b.pop();
        d11.S(d10.a());
        System.arraycopy(d10.e(), d10.f(), d11.e(), 0, d11.a());
        return d11;
    }

    private void e(int i10) {
        while (this.f129516d.size() > i10) {
            a aVar = (a) P.h(this.f129516d.poll());
            for (int i11 = 0; i11 < aVar.f129519a.size(); i11++) {
                this.f129513a.a(aVar.f129520b, aVar.f129519a.get(i11));
                this.f129514b.push(aVar.f129519a.get(i11));
            }
            aVar.f129519a.clear();
            a aVar2 = this.f129518f;
            if (aVar2 != null && aVar2.f129520b == aVar.f129520b) {
                this.f129518f = null;
            }
            this.f129515c.push(aVar);
        }
    }

    public void a(long j10, D d10) {
        int i10 = this.f129517e;
        if (i10 == 0 || (i10 != -1 && this.f129516d.size() >= this.f129517e && j10 < ((a) P.h(this.f129516d.peek())).f129520b)) {
            this.f129513a.a(j10, d10);
            return;
        }
        D dC = c(d10);
        a aVar = this.f129518f;
        if (aVar != null && j10 == aVar.f129520b) {
            aVar.f129519a.add(dC);
            return;
        }
        a aVar2 = this.f129515c.isEmpty() ? new a() : this.f129515c.pop();
        aVar2.b(j10, dC);
        this.f129516d.add(aVar2);
        this.f129518f = aVar2;
        int i11 = this.f129517e;
        if (i11 != -1) {
            e(i11);
        }
    }

    public void b() {
        this.f129516d.clear();
    }

    public int f() {
        return this.f129517e;
    }

    public void g(int i10) {
        C13599a.g(i10 >= 0);
        this.f129517e = i10;
        e(i10);
    }

    public i(b bVar) {
        this.f129513a = bVar;
    }
}
