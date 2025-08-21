package androidx.compose.ui.layout;

import androidx.compose.ui.layout.f0;
import j1.C14920a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\b*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u0011*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u0011*\u00020\fH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\u0016*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\f*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\f*\u00020\u0011H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ\u001a\u0010 \u001a\u00020\f*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!Jg\u0010/\u001a\u00020.2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t0$2\u0019\u0010+\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0018\u00010'¢\u0006\u0002\b*2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020)0'¢\u0006\u0002\b*H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00118\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010=\u001a\u00020:8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/ui/layout/v;", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/s;", "intrinsicMeasureScope", "LH1/t;", "layoutDirection", "<init>", "(Landroidx/compose/ui/layout/s;LH1/t;)V", "LH1/h;", "", "E0", "(F)I", "LH1/v;", "N1", "(J)I", "t", "(J)F", "", "L", "(F)F", "K", "(I)F", "LU0/k;", "LH1/k;", "p", "(J)J", "I1", "N0", "T", "o", "(F)J", "x", "w", "(I)J", "width", "height", "", "Landroidx/compose/ui/layout/a;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/f0$a;", "placementBlock", "Landroidx/compose/ui/layout/J;", "O1", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;", "a", "LH1/t;", "getLayoutDirection", "()LH1/t;", "getDensity", "()F", "density", "F1", "fontScale", "", "v0", "()Z", "isLookingAhead", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.layout.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5936v implements K, InterfaceC5933s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final H1.t layoutDirection;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC5933s f51376b;

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR'\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010¢\u0006\u0002\b\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"androidx/compose/ui/layout/v$a", "Landroidx/compose/ui/layout/J;", "", "s", "()V", "", "getWidth", "()I", "width", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "r", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/ExtensionFunctionType;", "t", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.v$a */
    public static final class a implements J {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51377a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51378b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Map<AbstractC5916a, Integer> f51379c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<l0, Unit> f51380d;

        @Override // androidx.compose.ui.layout.J
        public void s() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Map<AbstractC5916a, Integer> map, Function1<? super l0, Unit> function1) {
            this.f51377a = i10;
            this.f51378b = i11;
            this.f51379c = map;
            this.f51380d = function1;
        }

        @Override // androidx.compose.ui.layout.J
        /* renamed from: getHeight, reason: from getter */
        public int getF51284b() {
            return this.f51378b;
        }

        @Override // androidx.compose.ui.layout.J
        /* renamed from: getWidth, reason: from getter */
        public int getF51283a() {
            return this.f51377a;
        }

        @Override // androidx.compose.ui.layout.J
        public Map<AbstractC5916a, Integer> r() {
            return this.f51379c;
        }

        @Override // androidx.compose.ui.layout.J
        public Function1<l0, Unit> t() {
            return this.f51380d;
        }
    }

    @Override // H1.d
    public int E0(float f10) {
        return this.f51376b.E0(f10);
    }

    @Override // H1.l
    /* renamed from: F1 */
    public float getFontScale() {
        return this.f51376b.getFontScale();
    }

    @Override // H1.d
    public float I1(float f10) {
        return this.f51376b.I1(f10);
    }

    @Override // H1.d
    public float K(int i10) {
        return this.f51376b.K(i10);
    }

    @Override // H1.d
    public float L(float f10) {
        return this.f51376b.L(f10);
    }

    @Override // H1.d
    public float N0(long j10) {
        return this.f51376b.N0(j10);
    }

    @Override // H1.d
    public int N1(long j10) {
        return this.f51376b.N1(j10);
    }

    @Override // androidx.compose.ui.layout.K
    public J O1(int width, int height, Map<AbstractC5916a, Integer> alignmentLines, Function1<? super l0, Unit> rulers, Function1<? super f0.a, Unit> placementBlock) {
        boolean z10 = false;
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        if ((width & (-16777216)) == 0 && ((-16777216) & height) == 0) {
            z10 = true;
        }
        if (!z10) {
            C14920a.b("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new a(width, height, alignmentLines, rulers);
    }

    @Override // H1.d
    public long T(long j10) {
        return this.f51376b.T(j10);
    }

    @Override // H1.d
    public float getDensity() {
        return this.f51376b.getDensity();
    }

    @Override // H1.l
    public long o(float f10) {
        return this.f51376b.o(f10);
    }

    @Override // H1.d
    public long p(long j10) {
        return this.f51376b.p(j10);
    }

    @Override // H1.l
    public float t(long j10) {
        return this.f51376b.t(j10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC5933s
    public boolean v0() {
        return this.f51376b.v0();
    }

    @Override // H1.d
    public long w(int i10) {
        return this.f51376b.w(i10);
    }

    @Override // H1.d
    public long x(float f10) {
        return this.f51376b.x(f10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC5933s
    public H1.t getLayoutDirection() {
        return this.layoutDirection;
    }

    public C5936v(InterfaceC5933s interfaceC5933s, H1.t tVar) {
        this.layoutDirection = tVar;
        this.f51376b = interfaceC5933s;
    }
}
