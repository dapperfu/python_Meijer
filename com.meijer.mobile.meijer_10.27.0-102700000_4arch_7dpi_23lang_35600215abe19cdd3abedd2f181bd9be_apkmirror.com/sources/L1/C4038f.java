package L1;

import O1.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB!\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LL1/f;", "", "LO1/e$b;", "Landroidx/constraintlayout/compose/SolverChain;", "style", "", "bias", "<init>", "(LO1/e$b;Ljava/lang/Float;)V", "a", "LO1/e$b;", "d", "()LO1/e$b;", "b", "Ljava/lang/Float;", "c", "()Ljava/lang/Float;", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: L1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4038f {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    private static final C4038f f17689d;

    /* renamed from: e, reason: collision with root package name */
    private static final C4038f f17690e;

    /* renamed from: f, reason: collision with root package name */
    private static final C4038f f17691f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e.b style;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Float bias;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\n\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"LL1/f$a;", "", "<init>", "()V", "", "bias", "LL1/f;", "a", "(F)LL1/f;", "SpreadInside", "LL1/f;", "c", "()LL1/f;", "getSpreadInside$annotations", "Packed", "b", "getPacked$annotations", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: L1.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final C4038f a(float bias) {
            return new C4038f(e.b.PACKED, Float.valueOf(bias));
        }

        public final C4038f b() {
            return C4038f.f17691f;
        }

        public final C4038f c() {
            return C4038f.f17690e;
        }
    }

    public C4038f(e.b style, Float f10) {
        Intrinsics.j(style, "style");
        this.style = style;
        this.bias = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        int i10 = 2;
        f17689d = new C4038f(e.b.SPREAD, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f17690e = new C4038f(e.b.SPREAD_INSIDE, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        f17691f = companion.a(0.5f);
    }

    /* renamed from: c, reason: from getter */
    public final Float getBias() {
        return this.bias;
    }

    /* renamed from: d, reason: from getter */
    public final e.b getStyle() {
        return this.style;
    }

    public /* synthetic */ C4038f(e.b bVar, Float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i10 & 2) != 0 ? null : f10);
    }
}
