package lb;

import bb.C6345b;

/* renamed from: lb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15478a<T> implements Pb.a, Comparable<C15478a<T>> {

    /* renamed from: a, reason: collision with root package name */
    private T f149555a;

    /* renamed from: b, reason: collision with root package name */
    private String f149556b;

    /* renamed from: c, reason: collision with root package name */
    private long f149557c;

    /* renamed from: d, reason: collision with root package name */
    private final bb.e f149558d;

    /* renamed from: e, reason: collision with root package name */
    private Long f149559e;

    public C15478a(T t10, long j10, bb.e eVar) {
        j.a(t10, "value");
        j.a(eVar, "timeProvider");
        this.f149555a = t10;
        this.f149557c = j10;
        this.f149558d = eVar;
        this.f149559e = Long.valueOf(eVar.a());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C15478a<T> c15478a) {
        return c15478a.f149559e.compareTo(this.f149559e);
    }

    public boolean b() {
        return this.f149558d.a() - this.f149559e.longValue() > this.f149557c;
    }

    public String e() {
        return this.f149556b;
    }

    public T l() {
        return this.f149555a;
    }

    public void m(String str) {
        this.f149556b = str;
    }

    public C15478a() {
        this.f149558d = new C6345b();
    }
}
