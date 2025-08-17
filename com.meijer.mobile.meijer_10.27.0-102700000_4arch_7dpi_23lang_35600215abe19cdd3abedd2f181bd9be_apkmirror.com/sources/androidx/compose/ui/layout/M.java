package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001:\u0004\u0011\u0010\u000f\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ-\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\rJ-\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/M;", "", "<init>", "()V", "Landroidx/compose/ui/layout/B;", "modifier", "Landroidx/compose/ui/layout/s;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/r;", "intrinsicMeasurable", "", "h", "d", "(Landroidx/compose/ui/layout/B;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/r;I)I", "w", "c", "b", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class M {

    /* renamed from: a, reason: collision with root package name */
    public static final M f51028a = new M();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/layout/M$a;", "Landroidx/compose/ui/layout/I;", "Landroidx/compose/ui/layout/r;", "measurable", "Landroidx/compose/ui/layout/M$c;", "minMax", "Landroidx/compose/ui/layout/M$d;", "widthHeight", "<init>", "(Landroidx/compose/ui/layout/r;Landroidx/compose/ui/layout/M$c;Landroidx/compose/ui/layout/M$d;)V", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/f0;", "k0", "(J)Landroidx/compose/ui/layout/f0;", "", "height", "d0", "(I)I", "j0", "width", "W", "A", "a", "Landroidx/compose/ui/layout/r;", "getMeasurable", "()Landroidx/compose/ui/layout/r;", "b", "Landroidx/compose/ui/layout/M$c;", "getMinMax", "()Landroidx/compose/ui/layout/M$c;", "c", "Landroidx/compose/ui/layout/M$d;", "getWidthHeight", "()Landroidx/compose/ui/layout/M$d;", "", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a implements I {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final r measurable;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final c minMax;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final d widthHeight;

        @Override // androidx.compose.ui.layout.r
        public int A(int width) {
            return this.measurable.A(width);
        }

        @Override // androidx.compose.ui.layout.r
        public int W(int width) {
            return this.measurable.W(width);
        }

        @Override // androidx.compose.ui.layout.r
        public Object a() {
            return this.measurable.a();
        }

        @Override // androidx.compose.ui.layout.r
        public int d0(int height) {
            return this.measurable.d0(height);
        }

        @Override // androidx.compose.ui.layout.r
        public int j0(int height) {
            return this.measurable.j0(height);
        }

        @Override // androidx.compose.ui.layout.I
        public f0 k0(long constraints) {
            if (this.widthHeight == d.f51036a) {
                return new b(this.minMax == c.f51033b ? this.measurable.j0(H1.b.k(constraints)) : this.measurable.d0(H1.b.k(constraints)), H1.b.g(constraints) ? H1.b.k(constraints) : 32767);
            }
            return new b(H1.b.h(constraints) ? H1.b.l(constraints) : 32767, this.minMax == c.f51033b ? this.measurable.A(H1.b.l(constraints)) : this.measurable.W(H1.b.l(constraints)));
        }

        public a(r rVar, c cVar, d dVar) {
            this.measurable = rVar;
            this.minMax = cVar;
            this.widthHeight = dVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/M$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f51032a = new c("Min", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f51033b = new c("Max", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ c[] f51034c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f51035d;

        private static final /* synthetic */ c[] a() {
            return new c[]{f51032a, f51033b};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f51034c.clone();
        }

        static {
            c[] cVarArrA = a();
            f51034c = cVarArrA;
            f51035d = EnumEntriesKt.a(cVarArrA);
        }

        private c(String str, int i10) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/layout/M$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f51036a = new d("Width", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f51037b = new d("Height", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ d[] f51038c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f51039d;

        private static final /* synthetic */ d[] a() {
            return new d[]{f51036a, f51037b};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f51038c.clone();
        }

        static {
            d[] dVarArrA = a();
            f51038c = dVarArrA;
            f51039d = EnumEntriesKt.a(dVarArrA);
        }

        private d(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0019\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0002\b\u0012H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/layout/M$b;", "Landroidx/compose/ui/layout/f0;", "", "width", "height", "<init>", "(II)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "l0", "(Landroidx/compose/ui/layout/a;)I", "LH1/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/e;", "", "Lkotlin/ExtensionFunctionType;", "layerBlock", "V0", "(JFLkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    private static final class b extends f0 {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.f0
        public void V0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock) {
        }

        @Override // androidx.compose.ui.layout.L
        public int l0(AbstractC5774a alignmentLine) {
            return Integer.MIN_VALUE;
        }

        public b(int i10, int i11) {
            Z0(H1.r.c((i11 & 4294967295L) | (i10 << 32)));
        }
    }

    public final int a(B modifier, InterfaceC5791s intrinsicMeasureScope, r intrinsicMeasurable, int w10) {
        return modifier.a(new C5794v(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.f51033b, d.f51037b), H1.c.b(0, w10, 0, 0, 13, null)).getF51364b();
    }

    public final int b(B modifier, InterfaceC5791s intrinsicMeasureScope, r intrinsicMeasurable, int h10) {
        return modifier.a(new C5794v(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.f51033b, d.f51036a), H1.c.b(0, 0, 0, h10, 7, null)).getF51363a();
    }

    public final int c(B modifier, InterfaceC5791s intrinsicMeasureScope, r intrinsicMeasurable, int w10) {
        return modifier.a(new C5794v(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.f51032a, d.f51037b), H1.c.b(0, w10, 0, 0, 13, null)).getF51364b();
    }

    public final int d(B modifier, InterfaceC5791s intrinsicMeasureScope, r intrinsicMeasurable, int h10) {
        return modifier.a(new C5794v(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new a(intrinsicMeasurable, c.f51032a, d.f51036a), H1.c.b(0, 0, 0, h10, 7, null)).getF51363a();
    }

    private M() {
    }
}
