package ud;

@Deprecated
/* renamed from: ud.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17381a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f163903a;

    /* renamed from: b, reason: collision with root package name */
    private final String f163904b;

    /* renamed from: c, reason: collision with root package name */
    private final T f163905c;

    @Deprecated
    /* renamed from: ud.a$a, reason: collision with other inner class name */
    public static class C2595a extends AbstractC17381a<Boolean> {
        public C2595a(int i10, String str, Boolean bool) {
            super(i10, str, bool);
        }
    }

    private AbstractC17381a(int i10, String str, T t10) {
        this.f163903a = i10;
        this.f163904b = str;
        this.f163905c = t10;
        C17383c.a().a(this);
    }

    @Deprecated
    public static C2595a a(int i10, String str, Boolean bool) {
        return new C2595a(i10, str, bool);
    }
}
