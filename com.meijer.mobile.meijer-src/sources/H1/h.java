package H1;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"LH1/h;", "", "", "value", "p", "(F)F", "other", "", "o", "(FF)I", "", "z", "(F)Ljava/lang/String;", "w", "(F)I", "", "", "t", "(FLjava/lang/Object;)Z", "a", "F", "getValue", "()F", "b", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class h implements Comparable<h> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final float f13313c = p(0.0f);

    /* renamed from: d, reason: collision with root package name */
    private static final float f13314d = p(Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    private static final float f13315e = p(Float.NaN);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"LH1/h$a;", "", "<init>", "()V", "LH1/h;", "Hairline", "F", "a", "()F", "getHairline-D9Ej5fM$annotations", "Infinity", "b", "getInfinity-D9Ej5fM$annotations", "Unspecified", "c", "getUnspecified-D9Ej5fM$annotations", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: H1.h$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final float a() {
            return h.f13313c;
        }

        public final float b() {
            return h.f13314d;
        }

        public final float c() {
            return h.f13315e;
        }
    }

    public static float p(float f10) {
        return f10;
    }

    public static final /* synthetic */ h l(float f10) {
        return new h(f10);
    }

    public static boolean t(float f10, Object obj) {
        return (obj instanceof h) && Float.compare(f10, ((h) obj).getValue()) == 0;
    }

    /* renamed from: B, reason: from getter */
    public final /* synthetic */ float getValue() {
        return this.value;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(h hVar) {
        return m(hVar.getValue());
    }

    public boolean equals(Object obj) {
        return t(this.value, obj);
    }

    public int hashCode() {
        return w(this.value);
    }

    public int m(float f10) {
        return o(this.value, f10);
    }

    public String toString() {
        return z(this.value);
    }

    private /* synthetic */ h(float f10) {
        this.value = f10;
    }

    public static int o(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public static final boolean u(float f10, float f11) {
        if (Float.compare(f10, f11) == 0) {
            return true;
        }
        return false;
    }

    public static int w(float f10) {
        return Float.hashCode(f10);
    }

    public static String z(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }
}
