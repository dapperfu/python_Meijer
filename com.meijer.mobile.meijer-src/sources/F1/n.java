package F1;

import V0.AbstractC5467i0;
import V0.C5489q0;
import V0.SolidColor;
import V0.z1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b`\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\tJ\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0006\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\b8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"LF1/n;", "", "other", "d", "(LF1/n;)LF1/n;", "Lkotlin/Function0;", "c", "(Lkotlin/jvm/functions/Function0;)LF1/n;", "LV0/q0;", "b", "()J", "color", "LV0/i0;", "getBrush", "()LV0/i0;", "brush", "", "a", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f8957a;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"LF1/n$a;", "", "<init>", "()V", "LV0/q0;", "color", "LF1/n;", "b", "(J)LF1/n;", "LV0/i0;", "brush", "", "alpha", "a", "(LV0/i0;F)LF1/n;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: F1.n$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f8957a = new Companion();

        public final n a(AbstractC5467i0 brush, float alpha) {
            if (brush == null) {
                return b.f8958b;
            }
            if (brush instanceof SolidColor) {
                return b(m.c(((SolidColor) brush).getValue(), alpha));
            }
            if (brush instanceof z1) {
                return new BrushStyle((z1) brush, alpha);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final n b(long color) {
            return color != 16 ? new ColorStyle(color, null) : b.f8958b;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"LF1/n$b;", "LF1/n;", "<init>", "()V", "LV0/q0;", "b", "()J", "color", "LV0/i0;", "getBrush", "()LV0/i0;", "brush", "", "a", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements n {

        /* renamed from: b, reason: collision with root package name */
        public static final b f8958b = new b();

        @Override // F1.n
        public AbstractC5467i0 getBrush() {
            return null;
        }

        @Override // F1.n
        /* renamed from: a */
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // F1.n
        /* renamed from: b */
        public long getValue() {
            return C5489q0.INSTANCE.j();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function0<Float> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(n.this.getAlpha());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LF1/n;", "c", "()LF1/n;"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function0<n> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            return n.this;
        }
    }

    /* renamed from: a */
    float getAlpha();

    /* renamed from: b */
    long getValue();

    AbstractC5467i0 getBrush();

    default n c(Function0<? extends n> other) {
        return !Intrinsics.e(this, b.f8958b) ? this : other.invoke();
    }

    default n d(n other) {
        boolean z10 = other instanceof BrushStyle;
        return (z10 && (this instanceof BrushStyle)) ? new BrushStyle(((BrushStyle) other).getValue(), m.d(other.getAlpha(), new c())) : (!z10 || (this instanceof BrushStyle)) ? (z10 || !(this instanceof BrushStyle)) ? other.c(new d()) : this : other;
    }
}
