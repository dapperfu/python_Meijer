package kotlin;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Ly1/x;", "", "", "value", "f", "(I)I", "", "l", "(I)Ljava/lang/String;", "i", "other", "", "g", "(ILjava/lang/Object;)Z", "a", "I", "k", "(I)Z", "isWeightOn", "j", "isStyleOn", "b", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* renamed from: y1.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18154x {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f170155c = f(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f170156d = f(1);

    /* renamed from: e, reason: collision with root package name */
    private static final int f170157e = f(2);

    /* renamed from: f, reason: collision with root package name */
    private static final int f170158f = f(65535);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Ly1/x$a;", "", "<init>", "()V", "Ly1/x;", "None", "I", "b", "()I", "Weight", "d", "Style", "c", "All", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y1.x$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int a() {
            return C18154x.f170158f;
        }

        public final int b() {
            return C18154x.f170155c;
        }

        public final int c() {
            return C18154x.f170157e;
        }

        public final int d() {
            return C18154x.f170156d;
        }
    }

    public static int f(int i10) {
        return i10;
    }

    public static final boolean k(int i10) {
        return (i10 & 1) != 0;
    }

    public static final /* synthetic */ C18154x e(int i10) {
        return new C18154x(i10);
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof C18154x) && i10 == ((C18154x) obj).getValue();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean j(int i10) {
        return (i10 & 2) != 0;
    }

    public static String l(int i10) {
        return h(i10, f170155c) ? "None" : h(i10, f170156d) ? "Weight" : h(i10, f170157e) ? "Style" : h(i10, f170158f) ? "All" : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.value, obj);
    }

    public int hashCode() {
        return i(this.value);
    }

    /* renamed from: m, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return l(this.value);
    }

    private /* synthetic */ C18154x(int i10) {
        this.value = i10;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }
}
