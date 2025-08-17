package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC5774a;
import androidx.compose.ui.layout.C5777d;
import androidx.compose.ui.layout.C5794v;
import androidx.compose.ui.layout.InterfaceC5776c;
import androidx.compose.ui.layout.InterfaceC5779f;
import androidx.compose.ui.layout.InterfaceC5791s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0006\u0011\u0017\u0010\u0016\u000f\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\rJ/\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\rJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\rJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\u0014J/\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0014J/\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0014J/\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/h0;", "", "<init>", "()V", "Landroidx/compose/ui/node/h0$a;", "measureBlock", "Landroidx/compose/ui/layout/c;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/r;", "intrinsicMeasurable", "", "h", "g", "(Landroidx/compose/ui/node/h0$a;Landroidx/compose/ui/layout/c;Landroidx/compose/ui/layout/r;I)I", "w", "e", "c", "a", "Landroidx/compose/ui/node/h0$f;", "Landroidx/compose/ui/layout/s;", "(Landroidx/compose/ui/node/h0$f;Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/r;I)I", "f", "d", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f51533a = new h0();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/h0$a;", "", "Landroidx/compose/ui/layout/f;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/f;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        androidx.compose.ui.layout.J a(InterfaceC5779f interfaceC5779f, androidx.compose.ui.layout.I i10, long j10);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u0004\u0018\u00010#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/node/h0$b;", "Landroidx/compose/ui/layout/I;", "Landroidx/compose/ui/layout/r;", "measurable", "Landroidx/compose/ui/node/h0$d;", "minMax", "Landroidx/compose/ui/node/h0$e;", "widthHeight", "<init>", "(Landroidx/compose/ui/layout/r;Landroidx/compose/ui/node/h0$d;Landroidx/compose/ui/node/h0$e;)V", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/f0;", "k0", "(J)Landroidx/compose/ui/layout/f0;", "", "height", "d0", "(I)I", "j0", "width", "W", "A", "a", "Landroidx/compose/ui/layout/r;", "getMeasurable", "()Landroidx/compose/ui/layout/r;", "b", "Landroidx/compose/ui/node/h0$d;", "getMinMax", "()Landroidx/compose/ui/node/h0$d;", "c", "Landroidx/compose/ui/node/h0$e;", "getWidthHeight", "()Landroidx/compose/ui/node/h0$e;", "", "()Ljava/lang/Object;", "parentData", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b implements androidx.compose.ui.layout.I {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.ui.layout.r measurable;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final d minMax;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final e widthHeight;

        @Override // androidx.compose.ui.layout.r
        public int A(int width) {
            return this.measurable.A(width);
        }

        @Override // androidx.compose.ui.layout.r
        public int W(int width) {
            return this.measurable.W(width);
        }

        @Override // androidx.compose.ui.layout.r
        /* renamed from: a */
        public Object getParentData() {
            return this.measurable.getParentData();
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
        public androidx.compose.ui.layout.f0 k0(long constraints) {
            if (this.widthHeight == e.f51541a) {
                return new c(this.minMax == d.f51538b ? this.measurable.j0(H1.b.k(constraints)) : this.measurable.d0(H1.b.k(constraints)), H1.b.g(constraints) ? H1.b.k(constraints) : 32767);
            }
            return new c(H1.b.h(constraints) ? H1.b.l(constraints) : 32767, this.minMax == d.f51538b ? this.measurable.A(H1.b.l(constraints)) : this.measurable.W(H1.b.l(constraints)));
        }

        public b(androidx.compose.ui.layout.r rVar, d dVar, e eVar) {
            this.measurable = rVar;
            this.minMax = dVar;
            this.widthHeight = eVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/h0$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f51537a = new d("Min", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final d f51538b = new d("Max", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ d[] f51539c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f51540d;

        private static final /* synthetic */ d[] a() {
            return new d[]{f51537a, f51538b};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f51539c.clone();
        }

        static {
            d[] dVarArrA = a();
            f51539c = dVarArrA;
            f51540d = EnumEntriesKt.a(dVarArrA);
        }

        private d(String str, int i10) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/h0$e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f51541a = new e("Width", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final e f51542b = new e("Height", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ e[] f51543c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f51544d;

        private static final /* synthetic */ e[] a() {
            return new e[]{f51541a, f51542b};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f51543c.clone();
        }

        static {
            e[] eVarArrA = a();
            f51543c = eVarArrA;
            f51544d = EnumEntriesKt.a(eVarArrA);
        }

        private e(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/h0$f;", "", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface f {
        androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0019\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0002\b\u0012H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/node/h0$c;", "Landroidx/compose/ui/layout/f0;", "", "width", "height", "<init>", "(II)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "l0", "(Landroidx/compose/ui/layout/a;)I", "LH1/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/e;", "", "Lkotlin/ExtensionFunctionType;", "layerBlock", "V0", "(JFLkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    private static final class c extends androidx.compose.ui.layout.f0 {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.f0
        public void V0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock) {
        }

        @Override // androidx.compose.ui.layout.L
        public int l0(AbstractC5774a alignmentLine) {
            return Integer.MIN_VALUE;
        }

        public c(int i10, int i11) {
            Z0(H1.r.c((i11 & 4294967295L) | (i10 << 32)));
        }
    }

    public final int a(a measureBlock, InterfaceC5776c intrinsicMeasureScope, androidx.compose.ui.layout.r intrinsicMeasurable, int w10) {
        return measureBlock.a(new C5777d(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.f51538b, e.f51542b), H1.c.b(0, w10, 0, 0, 13, null)).getF51154b();
    }

    public final int b(f measureBlock, InterfaceC5791s intrinsicMeasureScope, androidx.compose.ui.layout.r intrinsicMeasurable, int w10) {
        return measureBlock.a(new C5794v(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.f51538b, e.f51542b), H1.c.b(0, w10, 0, 0, 13, null)).getF51154b();
    }

    public final int c(a measureBlock, InterfaceC5776c intrinsicMeasureScope, androidx.compose.ui.layout.r intrinsicMeasurable, int h10) {
        return measureBlock.a(new C5777d(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.f51538b, e.f51541a), H1.c.b(0, 0, 0, h10, 7, null)).getF51153a();
    }

    public final int d(f measureBlock, InterfaceC5791s intrinsicMeasureScope, androidx.compose.ui.layout.r intrinsicMeasurable, int h10) {
        return measureBlock.a(new C5794v(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.f51538b, e.f51541a), H1.c.b(0, 0, 0, h10, 7, null)).getF51153a();
    }

    public final int e(a measureBlock, InterfaceC5776c intrinsicMeasureScope, androidx.compose.ui.layout.r intrinsicMeasurable, int w10) {
        return measureBlock.a(new C5777d(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.f51537a, e.f51542b), H1.c.b(0, w10, 0, 0, 13, null)).getF51154b();
    }

    public final int f(f measureBlock, InterfaceC5791s intrinsicMeasureScope, androidx.compose.ui.layout.r intrinsicMeasurable, int w10) {
        return measureBlock.a(new C5794v(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.f51537a, e.f51542b), H1.c.b(0, w10, 0, 0, 13, null)).getF51154b();
    }

    public final int g(a measureBlock, InterfaceC5776c intrinsicMeasureScope, androidx.compose.ui.layout.r intrinsicMeasurable, int h10) {
        return measureBlock.a(new C5777d(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.f51537a, e.f51541a), H1.c.b(0, 0, 0, h10, 7, null)).getF51153a();
    }

    public final int h(f measureBlock, InterfaceC5791s intrinsicMeasureScope, androidx.compose.ui.layout.r intrinsicMeasurable, int h10) {
        return measureBlock.a(new C5794v(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new b(intrinsicMeasurable, d.f51537a, e.f51541a), H1.c.b(0, 0, 0, h10, 7, null)).getF51153a();
    }

    private h0() {
    }
}
