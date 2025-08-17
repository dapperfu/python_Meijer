package fsimpl;

/* renamed from: fsimpl.y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14127y {

    /* renamed from: a, reason: collision with root package name */
    private static final C14127y f132386a = new C14127y("masked");

    /* renamed from: b, reason: collision with root package name */
    private static final C14127y f132387b = new C14127y("unmasked");

    /* renamed from: c, reason: collision with root package name */
    private final String f132388c;

    private C14127y(String str) {
        this.f132388c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C14127y b(C14013ck c14013ck) {
        return c14013ck == null || c14013ck.c() ? f132386a : f132387b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C14127y e() {
        return f132386a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C14127y f() {
        return f132387b;
    }

    boolean a() {
        return this == f132386a;
    }

    boolean b() {
        return this == f132387b;
    }

    public String toString() {
        return "PrivacyState [" + this.f132388c + "]";
    }
}
