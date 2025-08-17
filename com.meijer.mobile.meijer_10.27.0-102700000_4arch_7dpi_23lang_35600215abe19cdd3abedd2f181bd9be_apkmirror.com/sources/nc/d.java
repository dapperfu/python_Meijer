package nc;

import androidx.compose.foundation.layout.C5658d;
import kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lnc/d;", "", "Landroidx/compose/foundation/layout/d$m;", "arrangement", "<init>", "(Ljava/lang/String;ILandroidx/compose/foundation/layout/d$m;)V", "a", "Landroidx/compose/foundation/layout/d$m;", "b", "()Landroidx/compose/foundation/layout/d$m;", "c", "d", "e", "f", "g", "flowlayout_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f151168b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f151169c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f151170d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f151171e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f151172f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f151173g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ d[] f151174h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C5658d.m arrangement;

    static {
        C5658d c5658d = C5658d.f48555a;
        f151168b = new d("Center", 0, c5658d.b());
        f151169c = new d("Start", 1, c5658d.h());
        f151170d = new d("End", 2, c5658d.a());
        f151171e = new d("SpaceEvenly", 3, c5658d.f());
        f151172f = new d("SpaceBetween", 4, c5658d.e());
        f151173g = new d("SpaceAround", 5, c5658d.d());
        f151174h = a();
    }

    private static final /* synthetic */ d[] a() {
        return new d[]{f151168b, f151169c, f151170d, f151171e, f151172f, f151173g};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f151174h.clone();
    }

    /* renamed from: b, reason: from getter */
    public final C5658d.m getArrangement() {
        return this.arrangement;
    }

    private d(String str, int i10, C5658d.m mVar) {
        this.arrangement = mVar;
    }
}
