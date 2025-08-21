package Q5;

/* loaded from: classes4.dex */
public class q {

    /* renamed from: d, reason: collision with root package name */
    public static final q f27829d = new q(true);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27830a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27831b;

    /* renamed from: c, reason: collision with root package name */
    private final a f27832c;

    public enum a {
        UNKNOWN,
        CONDITION_FAILED,
        TYPE_MISMATCHED,
        MISSING_OPERATOR,
        INVALID_OPERAND
    }

    public q(a aVar, String str) {
        this.f27830a = false;
        this.f27831b = str;
        this.f27832c = aVar;
    }

    public boolean a() {
        return this.f27830a;
    }

    private q(boolean z10) {
        this.f27830a = z10;
        this.f27831b = null;
        this.f27832c = null;
    }
}
