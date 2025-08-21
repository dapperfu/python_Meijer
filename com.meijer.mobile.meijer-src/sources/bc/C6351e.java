package bc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bc.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6351e<T> {

    /* renamed from: a, reason: collision with root package name */
    private final bb.e f60251a;

    /* renamed from: b, reason: collision with root package name */
    private List<T> f60252b;

    /* renamed from: c, reason: collision with root package name */
    private List<T> f60253c;

    /* renamed from: d, reason: collision with root package name */
    private int f60254d;

    /* renamed from: e, reason: collision with root package name */
    private long f60255e;

    /* renamed from: f, reason: collision with root package name */
    private long f60256f;

    public C6351e(bb.e eVar) {
        this(eVar, (byte) 0);
    }

    public final synchronized void b(T t10) {
        try {
            this.f60252b.add(t10);
            if (this.f60252b.size() == 1) {
                this.f60255e = this.f60251a.a();
            }
            while (this.f60253c.size() > 0 && a() > this.f60254d) {
                this.f60253c.remove(0);
            }
            while (this.f60252b.size() > this.f60254d) {
                this.f60252b.remove(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized List<T> d() {
        try {
            if (this.f60252b.size() > 0) {
                Iterator<T> it = this.f60252b.iterator();
                while (it.hasNext()) {
                    this.f60253c.add(it.next());
                }
                this.f60252b.clear();
                this.f60256f = Math.min(this.f60256f, this.f60255e);
                this.f60255e = 4611686018427387903L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new ArrayList(this.f60253c);
    }

    public final synchronized void e() {
        this.f60252b.removeAll(this.f60253c);
        this.f60253c.clear();
        this.f60256f = 4611686018427387903L;
    }

    public final synchronized void f() {
        this.f60253c.clear();
        this.f60252b.clear();
        this.f60255e = 4611686018427387903L;
        this.f60256f = 4611686018427387903L;
    }

    private C6351e(bb.e eVar, byte b10) {
        this.f60255e = 4611686018427387903L;
        this.f60256f = 4611686018427387903L;
        this.f60251a = eVar;
        this.f60254d = 1000;
        this.f60252b = new ArrayList(1000);
        this.f60253c = new ArrayList(1000);
    }

    public final int a() {
        return this.f60252b.size() + this.f60253c.size();
    }

    public final long c() {
        return Math.min(this.f60255e, this.f60256f);
    }
}
