package V0;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u00020\u00048\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0012\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"LV0/i0;", "", "<init>", "()V", "LU0/k;", "size", "LV0/o1;", "p", "", "alpha", "", "a", "(JLV0/o1;F)V", "J", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "b", "LV0/z1;", "LV0/E1;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: V0.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5324i0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long intrinsicSize;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u0012\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0015\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"LV0/i0$a;", "", "<init>", "()V", "", "LV0/q0;", "colors", "LU0/f;", "start", "end", "LV0/I1;", "tileMode", "LV0/i0;", "a", "(Ljava/util/List;JJI)LV0/i0;", "", "startY", "endY", "e", "(Ljava/util/List;FFI)LV0/i0;", "center", "c", "(Ljava/util/List;J)LV0/i0;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: V0.i0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC5324i0 e(List<C5346q0> colors, float startY, float endY, int tileMode) {
            return a(colors, U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(startY) & 4294967295L)), U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(endY) & 4294967295L)), tileMode);
        }

        private Companion() {
        }

        public static /* synthetic */ AbstractC5324i0 b(Companion companion, List list, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = U0.f.INSTANCE.c();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = U0.f.INSTANCE.a();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = I1.INSTANCE.a();
            }
            return companion.a(list, j12, j13, i10);
        }

        public static /* synthetic */ AbstractC5324i0 d(Companion companion, List list, long j10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j10 = U0.f.INSTANCE.b();
            }
            return companion.c(list, j10);
        }

        public static /* synthetic */ AbstractC5324i0 f(Companion companion, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = I1.INSTANCE.a();
            }
            return companion.e(list, f10, f11, i10);
        }

        public final AbstractC5324i0 a(List<C5346q0> colors, long start, long end, int tileMode) {
            return new C5328j1(colors, null, start, end, tileMode, null);
        }

        public final AbstractC5324i0 c(List<C5346q0> colors, long center) {
            return new H1(center, colors, null, null);
        }
    }

    public /* synthetic */ AbstractC5324i0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a(long size, o1 p10, float alpha);

    private AbstractC5324i0() {
        this.intrinsicSize = U0.k.INSTANCE.a();
    }
}
