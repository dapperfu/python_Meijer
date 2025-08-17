package jb;

/* renamed from: jb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14879a<T> implements Nb.a, Comparable<C14879a<T>> {

    /* renamed from: a, reason: collision with root package name */
    private T f139541a;

    /* renamed from: b, reason: collision with root package name */
    private String f139542b;

    /* renamed from: c, reason: collision with root package name */
    private long f139543c;

    /* renamed from: d, reason: collision with root package name */
    private final Za.e f139544d;

    /* renamed from: e, reason: collision with root package name */
    private Long f139545e;

    public C14879a(T t10, long j10, Za.e eVar) {
        j.a(t10, "value");
        j.a(eVar, "timeProvider");
        this.f139541a = t10;
        this.f139543c = j10;
        this.f139544d = eVar;
        this.f139545e = Long.valueOf(eVar.a());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14879a<T> c14879a) {
        return c14879a.f139545e.compareTo(this.f139545e);
    }

    public boolean b() {
        return this.f139544d.a() - this.f139545e.longValue() > this.f139543c;
    }

    public String e() {
        return this.f139542b;
    }

    public T l() {
        return this.f139541a;
    }

    public void m(String str) {
        this.f139542b = str;
    }

    public C14879a() {
        this.f139544d = new Za.b();
    }
}
