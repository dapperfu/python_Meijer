package Zb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class e<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Za.e f42584a;

    /* renamed from: b, reason: collision with root package name */
    private List<T> f42585b;

    /* renamed from: c, reason: collision with root package name */
    private List<T> f42586c;

    /* renamed from: d, reason: collision with root package name */
    private int f42587d;

    /* renamed from: e, reason: collision with root package name */
    private long f42588e;

    /* renamed from: f, reason: collision with root package name */
    private long f42589f;

    public e(Za.e eVar) {
        this(eVar, (byte) 0);
    }

    public final synchronized void b(T t10) {
        try {
            this.f42585b.add(t10);
            if (this.f42585b.size() == 1) {
                this.f42588e = this.f42584a.a();
            }
            while (this.f42586c.size() > 0 && a() > this.f42587d) {
                this.f42586c.remove(0);
            }
            while (this.f42585b.size() > this.f42587d) {
                this.f42585b.remove(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized List<T> d() {
        try {
            if (this.f42585b.size() > 0) {
                Iterator<T> it = this.f42585b.iterator();
                while (it.hasNext()) {
                    this.f42586c.add(it.next());
                }
                this.f42585b.clear();
                this.f42589f = Math.min(this.f42589f, this.f42588e);
                this.f42588e = 4611686018427387903L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new ArrayList(this.f42586c);
    }

    public final synchronized void e() {
        this.f42585b.removeAll(this.f42586c);
        this.f42586c.clear();
        this.f42589f = 4611686018427387903L;
    }

    public final synchronized void f() {
        this.f42586c.clear();
        this.f42585b.clear();
        this.f42588e = 4611686018427387903L;
        this.f42589f = 4611686018427387903L;
    }

    private e(Za.e eVar, byte b10) {
        this.f42588e = 4611686018427387903L;
        this.f42589f = 4611686018427387903L;
        this.f42584a = eVar;
        this.f42587d = 1000;
        this.f42585b = new ArrayList(1000);
        this.f42586c = new ArrayList(1000);
    }

    public final int a() {
        return this.f42585b.size() + this.f42586c.size();
    }

    public final long c() {
        return Math.min(this.f42588e, this.f42589f);
    }
}
