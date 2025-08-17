package r1;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lr1/g;", "", "", "value", "d", "(I)I", "", "h", "(I)Ljava/lang/String;", "g", "other", "", "e", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* renamed from: r1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16699g {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f157771c = d(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f157772d = d(1);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lr1/g$a;", "", "<init>", "()V", "Lr1/g;", "Polite", "I", "b", "()I", "Assertive", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r1.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int a() {
            return C16699g.f157772d;
        }

        public final int b() {
            return C16699g.f157771c;
        }
    }

    private static int d(int i10) {
        return i10;
    }

    public static final /* synthetic */ C16699g c(int i10) {
        return new C16699g(i10);
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof C16699g) && i10 == ((C16699g) obj).getValue();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static String h(int i10) {
        return f(i10, f157771c) ? "Polite" : f(i10, f157772d) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.value, obj);
    }

    public int hashCode() {
        return g(this.value);
    }

    /* renamed from: i, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return h(this.value);
    }

    private /* synthetic */ C16699g(int i10) {
        this.value = i10;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }
}
