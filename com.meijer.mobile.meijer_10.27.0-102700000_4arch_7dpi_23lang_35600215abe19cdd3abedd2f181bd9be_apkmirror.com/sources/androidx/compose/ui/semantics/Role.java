package androidx.compose.ui.semantics;

import com.fullstory.instrumentation.frameworks.compose.FSComposeRole;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/semantics/Role;", "", "", "value", "k", "(I)I", "", "o", "(I)Ljava/lang/String;", "n", "other", "", "l", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class Role implements FSComposeRole {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final int f52303c = k(0);

    /* renamed from: d, reason: collision with root package name */
    private static final int f52304d = k(1);

    /* renamed from: e, reason: collision with root package name */
    private static final int f52305e = k(2);

    /* renamed from: f, reason: collision with root package name */
    private static final int f52306f = k(3);

    /* renamed from: g, reason: collision with root package name */
    private static final int f52307g = k(4);

    /* renamed from: h, reason: collision with root package name */
    private static final int f52308h = k(5);

    /* renamed from: i, reason: collision with root package name */
    private static final int f52309i = k(6);

    /* renamed from: j, reason: collision with root package name */
    private static final int f52310j = k(7);

    /* renamed from: k, reason: collision with root package name */
    private static final int f52311k = k(8);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/semantics/Role$a;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/Role;", "Button", "I", "a", "()I", "Checkbox", "c", "Switch", "g", "RadioButton", "f", "Tab", "h", "Image", "e", "DropdownList", "d", "ValuePicker", "i", "Carousel", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.semantics.Role$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int a() {
            return Role.f52303c;
        }

        public final int b() {
            return Role.f52311k;
        }

        public final int c() {
            return Role.f52304d;
        }

        public final int d() {
            return Role.f52309i;
        }

        public final int e() {
            return Role.f52308h;
        }

        public final int f() {
            return Role.f52306f;
        }

        public final int g() {
            return Role.f52305e;
        }

        public final int h() {
            return Role.f52307g;
        }

        public final int i() {
            return Role.f52310j;
        }
    }

    public static final /* synthetic */ Role j(int i10) {
        return new Role(i10);
    }

    private static int k(int i10) {
        return i10;
    }

    public static boolean l(int i10, Object obj) {
        return (obj instanceof Role) && i10 == ((Role) obj).getValue();
    }

    public static final boolean m(int i10, int i11) {
        return i10 == i11;
    }

    public static int n(int i10) {
        return Integer.hashCode(i10);
    }

    public boolean equals(Object obj) {
        return l(this.value, obj);
    }

    public int hashCode() {
        return n(this.value);
    }

    /* renamed from: p, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public static String o(int i10) {
        return m(i10, f52303c) ? "Button" : m(i10, f52304d) ? "Checkbox" : m(i10, f52305e) ? "Switch" : m(i10, f52306f) ? "RadioButton" : m(i10, f52307g) ? "Tab" : m(i10, f52308h) ? "Image" : m(i10, f52309i) ? "DropdownList" : m(i10, f52310j) ? "Picker" : m(i10, f52311k) ? "Carousel" : "Unknown";
    }

    public String toString() {
        return o(this.value);
    }

    private /* synthetic */ Role(int i10) {
        this.value = i10;
    }
}
