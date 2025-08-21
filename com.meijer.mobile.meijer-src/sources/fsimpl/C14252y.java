package fsimpl;

/* renamed from: fsimpl.y, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14252y {

    /* renamed from: a, reason: collision with root package name */
    private static final C14252y f133636a = new C14252y("masked");

    /* renamed from: b, reason: collision with root package name */
    private static final C14252y f133637b = new C14252y("unmasked");

    /* renamed from: c, reason: collision with root package name */
    private final String f133638c;

    private C14252y(String str) {
        this.f133638c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C14252y b(C14138ck c14138ck) {
        return c14138ck == null || c14138ck.c() ? f133636a : f133637b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C14252y e() {
        return f133636a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C14252y f() {
        return f133637b;
    }

    boolean a() {
        return this == f133636a;
    }

    boolean b() {
        return this == f133637b;
    }

    public String toString() {
        return "PrivacyState [" + this.f133638c + "]";
    }
}
