package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\nR\u0011\u0010\u000e\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0014\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/y0;", "", "", "packedValue", "d", "(J)J", "LH1/t;", "layoutDirection", "", "b", "(JLH1/t;)I", "c", "g", "(J)I", "start", "h", "top", "f", "end", "e", "bottom", "", "i", "(J)Z", "isLayoutDirectionAware", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final long f51589b = z0.c(0, 0, 0, 0, 14, null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/node/y0$a;", "", "<init>", "()V", "", "packedValue", "", "position", "e", "(JI)I", "int", "d", "(II)J", "start", "top", "end", "bottom", "", "isLayoutDirectionAware", "c", "(IIIIZ)J", "Landroidx/compose/ui/node/y0;", "None", "J", "b", "()J", "IS_LAYOUT_DIRECTION_AWARE", "MASK", "I", "MAX_VALUE", "SHIFT", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.node.y0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final long d(int i10, int position) {
            return (i10 & 32767) << (position * 15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int e(long packedValue, int position) {
            return ((int) (packedValue >> (position * 15))) & 32767;
        }

        public final long c(int start, int top, int end, int bottom, boolean isLayoutDirectionAware) {
            return d(top, 1) | d(start, 0) | d(end, 2) | d(bottom, 3) | (isLayoutDirectionAware ? Long.MIN_VALUE : 0L);
        }

        private Companion() {
        }

        public final long b() {
            return y0.f51589b;
        }
    }

    public static long d(long j10) {
        return j10;
    }

    public static final boolean i(long j10) {
        return (j10 & Long.MIN_VALUE) != 0;
    }

    public static final int e(long j10) {
        return INSTANCE.e(j10, 3);
    }

    public static final int f(long j10) {
        return INSTANCE.e(j10, 2);
    }

    public static final int g(long j10) {
        return INSTANCE.e(j10, 0);
    }

    public static final int h(long j10) {
        return INSTANCE.e(j10, 1);
    }

    public static final int b(long j10, H1.t tVar) {
        if (i(j10) && tVar != H1.t.f12006a) {
            return f(j10);
        }
        return g(j10);
    }

    public static final int c(long j10, H1.t tVar) {
        if (i(j10) && tVar != H1.t.f12006a) {
            return g(j10);
        }
        return f(j10);
    }
}
