package P5;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: d, reason: collision with root package name */
    public static final q f24799d = new q(true);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24800a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24801b;

    /* renamed from: c, reason: collision with root package name */
    private final a f24802c;

    public enum a {
        UNKNOWN,
        CONDITION_FAILED,
        TYPE_MISMATCHED,
        MISSING_OPERATOR,
        INVALID_OPERAND
    }

    public q(a aVar, String str) {
        this.f24800a = false;
        this.f24801b = str;
        this.f24802c = aVar;
    }

    public boolean a() {
        return this.f24800a;
    }

    private q(boolean z10) {
        this.f24800a = z10;
        this.f24801b = null;
        this.f24802c = null;
    }
}
