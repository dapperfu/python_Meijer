package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/k;", "", "LU0/k;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/m0;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5784k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f51105a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u000f\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u001c\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0018\u0010\u001aR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u0005\u0010\b¨\u0006 "}, d2 = {"Landroidx/compose/ui/layout/k$a;", "", "<init>", "()V", "Landroidx/compose/ui/layout/k;", "b", "Landroidx/compose/ui/layout/k;", "a", "()Landroidx/compose/ui/layout/k;", "getCrop$annotations", "Crop", "c", "e", "getFit$annotations", "Fit", "d", "getFillHeight$annotations", "FillHeight", "getFillWidth$annotations", "FillWidth", "f", "getInside$annotations", "Inside", "Landroidx/compose/ui/layout/o;", "g", "Landroidx/compose/ui/layout/o;", "()Landroidx/compose/ui/layout/o;", "getNone$annotations", "None", "h", "getFillBounds$annotations", "FillBounds", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.k$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f51105a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC5784k Crop = new C1052a();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC5784k Fit = new e();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC5784k FillHeight = new c();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC5784k FillWidth = new d();

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC5784k Inside = new f();

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final FixedScale None = new FixedScale(1.0f);

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final InterfaceC5784k FillBounds = new b();

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/k$a$b", "Landroidx/compose/ui/layout/k;", "LU0/k;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/m0;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: androidx.compose.ui.layout.k$a$b */
        public static final class b implements InterfaceC5784k {
            @Override // androidx.compose.ui.layout.InterfaceC5784k
            public long a(long srcSize, long dstSize) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize >> 32)) / Float.intBitsToFloat((int) (srcSize >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dstSize & 4294967295L)) / Float.intBitsToFloat((int) (srcSize & 4294967295L));
                return m0.a((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
            }

            b() {
            }
        }

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/k$a$d", "Landroidx/compose/ui/layout/k;", "LU0/k;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/m0;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: androidx.compose.ui.layout.k$a$d */
        public static final class d implements InterfaceC5784k {
            @Override // androidx.compose.ui.layout.InterfaceC5784k
            public long a(long srcSize, long dstSize) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize >> 32)) / Float.intBitsToFloat((int) (srcSize >> 32));
                return m0.a((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L));
            }

            d() {
            }
        }

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/k$a$f", "Landroidx/compose/ui/layout/k;", "LU0/k;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/m0;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: androidx.compose.ui.layout.k$a$f */
        public static final class f implements InterfaceC5784k {
            @Override // androidx.compose.ui.layout.InterfaceC5784k
            public long a(long srcSize, long dstSize) {
                if (Float.intBitsToFloat((int) (srcSize >> 32)) <= Float.intBitsToFloat((int) (dstSize >> 32)) && Float.intBitsToFloat((int) (srcSize & 4294967295L)) <= Float.intBitsToFloat((int) (dstSize & 4294967295L))) {
                    return m0.a((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L));
                }
                float fD = C5785l.d(srcSize, dstSize);
                return m0.a((Float.floatToRawIntBits(fD) << 32) | (Float.floatToRawIntBits(fD) & 4294967295L));
            }

            f() {
            }
        }

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/k$a$a", "Landroidx/compose/ui/layout/k;", "LU0/k;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/m0;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: androidx.compose.ui.layout.k$a$a, reason: collision with other inner class name */
        public static final class C1052a implements InterfaceC5784k {
            C1052a() {
            }

            @Override // androidx.compose.ui.layout.InterfaceC5784k
            public long a(long srcSize, long dstSize) {
                float fC = C5785l.c(srcSize, dstSize);
                return m0.a((Float.floatToRawIntBits(fC) << 32) | (4294967295L & Float.floatToRawIntBits(fC)));
            }
        }

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/k$a$c", "Landroidx/compose/ui/layout/k;", "LU0/k;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/m0;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: androidx.compose.ui.layout.k$a$c */
        public static final class c implements InterfaceC5784k {
            c() {
            }

            @Override // androidx.compose.ui.layout.InterfaceC5784k
            public long a(long srcSize, long dstSize) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dstSize & 4294967295L)) / Float.intBitsToFloat((int) (srcSize & 4294967295L));
                return m0.a((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L));
            }
        }

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"androidx/compose/ui/layout/k$a$e", "Landroidx/compose/ui/layout/k;", "LU0/k;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/m0;", "a", "(JJ)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: androidx.compose.ui.layout.k$a$e */
        public static final class e implements InterfaceC5784k {
            e() {
            }

            @Override // androidx.compose.ui.layout.InterfaceC5784k
            public long a(long srcSize, long dstSize) {
                float fD = C5785l.d(srcSize, dstSize);
                return m0.a((Float.floatToRawIntBits(fD) << 32) | (4294967295L & Float.floatToRawIntBits(fD)));
            }
        }

        public final InterfaceC5784k a() {
            return Crop;
        }

        public final InterfaceC5784k b() {
            return FillBounds;
        }

        public final InterfaceC5784k c() {
            return FillHeight;
        }

        public final InterfaceC5784k d() {
            return FillWidth;
        }

        public final InterfaceC5784k e() {
            return Fit;
        }

        public final InterfaceC5784k f() {
            return Inside;
        }

        public final FixedScale g() {
            return None;
        }

        private Companion() {
        }
    }

    long a(long srcSize, long dstSize);
}
