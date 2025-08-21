package L1;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LL1/G;", "", "", "solverValue", "<init>", "(I)V", "a", "I", "d", "()I", "b", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class G {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final G f17805c = new G(0);

    /* renamed from: d, reason: collision with root package name */
    private static final G f17806d = new G(4);

    /* renamed from: e, reason: collision with root package name */
    private static final G f17807e = new G(8);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int solverValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"LL1/G$a;", "", "<init>", "()V", "LL1/G;", "Visible", "LL1/G;", "c", "()LL1/G;", "getVisible$annotations", "Invisible", "b", "getInvisible$annotations", "Gone", "a", "getGone$annotations", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: L1.G$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final G a() {
            return G.f17807e;
        }

        public final G b() {
            return G.f17806d;
        }

        public final G c() {
            return G.f17805c;
        }
    }

    /* renamed from: d, reason: from getter */
    public final int getSolverValue() {
        return this.solverValue;
    }

    public G(int i10) {
        this.solverValue = i10;
    }
}
