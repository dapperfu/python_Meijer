package F1;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0011\u0013B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"LF1/s;", "", "LF1/s$b;", "linearity", "", "subpixelTextPositioning", "<init>", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "Z", "c", "()Z", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    private static final s f10203d;

    /* renamed from: e, reason: collision with root package name */
    private static final s f10204e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int linearity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean subpixelTextPositioning;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LF1/s$a;", "", "<init>", "()V", "LF1/s;", "Static", "LF1/s;", "a", "()LF1/s;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: F1.s$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final s a() {
            return s.f10203d;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"LF1/s$b;", "", "", "value", "e", "(I)I", "", "i", "(I)Ljava/lang/String;", "h", "other", "", "f", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class b {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: c, reason: collision with root package name */
        private static final int f10208c = e(1);

        /* renamed from: d, reason: collision with root package name */
        private static final int f10209d = e(2);

        /* renamed from: e, reason: collision with root package name */
        private static final int f10210e = e(3);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"LF1/s$b$a;", "", "<init>", "()V", "LF1/s$b;", "Linear", "I", "b", "()I", "FontHinting", "a", "None", "c", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: F1.s$b$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final int a() {
                return b.f10209d;
            }

            public final int b() {
                return b.f10208c;
            }

            public final int c() {
                return b.f10210e;
            }
        }

        private static int e(int i10) {
            return i10;
        }

        public static final /* synthetic */ b d(int i10) {
            return new b(i10);
        }

        public static boolean f(int i10, Object obj) {
            return (obj instanceof b) && i10 == ((b) obj).getValue();
        }

        public static final boolean g(int i10, int i11) {
            return i10 == i11;
        }

        public static String i(int i10) {
            return g(i10, f10208c) ? "Linearity.Linear" : g(i10, f10209d) ? "Linearity.FontHinting" : g(i10, f10210e) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return f(this.value, obj);
        }

        public int hashCode() {
            return h(this.value);
        }

        /* renamed from: j, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public String toString() {
            return i(this.value);
        }

        private /* synthetic */ b(int i10) {
            this.value = i10;
        }

        public static int h(int i10) {
            return Integer.hashCode(i10);
        }
    }

    public /* synthetic */ s(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        return b.g(this.linearity, sVar.linearity) && this.subpixelTextPositioning == sVar.subpixelTextPositioning;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        b.Companion companion = b.INSTANCE;
        f10203d = new s(companion.a(), false, defaultConstructorMarker);
        f10204e = new s(companion.b(), true, defaultConstructorMarker);
    }

    private s(int i10, boolean z10) {
        this.linearity = i10;
        this.subpixelTextPositioning = z10;
    }

    /* renamed from: b, reason: from getter */
    public final int getLinearity() {
        return this.linearity;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getSubpixelTextPositioning() {
        return this.subpixelTextPositioning;
    }

    public int hashCode() {
        return (b.h(this.linearity) * 31) + Boolean.hashCode(this.subpixelTextPositioning);
    }

    public String toString() {
        return Intrinsics.e(this, f10203d) ? "TextMotion.Static" : Intrinsics.e(this, f10204e) ? "TextMotion.Animated" : "Invalid";
    }
}
