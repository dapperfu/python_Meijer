package vb;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private Db.b f165791a;

    public static String b(String str, String str2) {
        return str + "_" + str2;
    }

    public final Long a() {
        return Long.valueOf(this.f165791a.j() / 1000);
    }

    public final Long c() {
        return Long.valueOf(this.f165791a.k() / 1000);
    }

    public s(Db.b bVar) {
        this.f165791a = bVar;
    }
}
