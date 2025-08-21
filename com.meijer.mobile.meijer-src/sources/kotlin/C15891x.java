package kotlin;

import H1.t;
import Z.r;
import androidx.compose.ui.layout.AbstractC5916a;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJl\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u001b\b\u0002\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0002\b\u00122\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018JO\u0010\u0019\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0002\b\u0012H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\t*\u00020\u001eH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020!*\u00020\u001eH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J(\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010&\u001a\u00020\t2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\u00020\u001b*\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b-\u0010%J\u0019\u0010.\u001a\u00020\u001b*\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u001b*\u00020!H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u0010#J\u0019\u00101\u001a\u00020\u001e*\u00020!H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\u001e*\u00020\tH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0016\u00105\u001a\u00020\u001e*\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b5\u00102J\u0016\u00108\u001a\u000207*\u000206H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0016\u0010:\u001a\u000206*\u000207H\u0016ø\u0001\u0000¢\u0006\u0004\b:\u00109R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR \u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020!8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020!8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0014\u0010O\u001a\u00020L8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010R\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006T"}, d2 = {"Ln0/x;", "Ln0/w;", "Landroidx/compose/ui/layout/K;", "Ln0/p;", "itemContentFactory", "Landroidx/compose/ui/layout/r0;", "subcomposeMeasureScope", "<init>", "(Ln0/p;Landroidx/compose/ui/layout/r0;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/a;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/f0$a;", "placementBlock", "Landroidx/compose/ui/layout/J;", "O1", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;", "g1", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;", "LH1/h;", "E0", "(F)I", "LH1/v;", "N1", "(J)I", "", "I1", "(F)F", "N0", "(J)F", "index", "LH1/b;", "constraints", "", "Landroidx/compose/ui/layout/f0;", "p0", "(IJ)Ljava/util/List;", "t", "K", "(I)F", "L", "x", "(F)J", "w", "(I)J", "o", "LH1/k;", "LU0/k;", "T", "(J)J", "p", "a", "Ln0/p;", "b", "Landroidx/compose/ui/layout/r0;", "Ln0/r;", "c", "Ln0/r;", "itemProvider", "LZ/K;", "d", "LZ/K;", "placeablesCache", "getDensity", "()F", "density", "F1", "fontScale", "", "v0", "()Z", "isLookingAhead", "LH1/t;", "getLayoutDirection", "()LH1/t;", "layoutDirection", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: n0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15891x implements InterfaceC15890w, K {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15883p itemContentFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r0 subcomposeMeasureScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15885r itemProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Z.K<List<f0>> placeablesCache = r.c();

    @Override // H1.d
    public int E0(float f10) {
        return this.subcomposeMeasureScope.E0(f10);
    }

    @Override // H1.l
    /* renamed from: F1 */
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // H1.d
    public float I1(float f10) {
        return this.subcomposeMeasureScope.I1(f10);
    }

    @Override // kotlin.InterfaceC15890w, H1.d
    public float K(int i10) {
        return this.subcomposeMeasureScope.K(i10);
    }

    @Override // kotlin.InterfaceC15890w, H1.d
    public float L(float f10) {
        return this.subcomposeMeasureScope.L(f10);
    }

    @Override // H1.d
    public float N0(long j10) {
        return this.subcomposeMeasureScope.N0(j10);
    }

    @Override // H1.d
    public int N1(long j10) {
        return this.subcomposeMeasureScope.N1(j10);
    }

    @Override // androidx.compose.ui.layout.K
    public J O1(int width, int height, Map<AbstractC5916a, Integer> alignmentLines, Function1<? super l0, Unit> rulers, Function1<? super f0.a, Unit> placementBlock) {
        return this.subcomposeMeasureScope.O1(width, height, alignmentLines, rulers, placementBlock);
    }

    @Override // kotlin.InterfaceC15890w, H1.d
    public long T(long j10) {
        return this.subcomposeMeasureScope.T(j10);
    }

    @Override // androidx.compose.ui.layout.K
    public J g1(int width, int height, Map<AbstractC5916a, Integer> alignmentLines, Function1<? super f0.a, Unit> placementBlock) {
        return this.subcomposeMeasureScope.g1(width, height, alignmentLines, placementBlock);
    }

    @Override // H1.d
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.ui.layout.InterfaceC5933s
    public t getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // kotlin.InterfaceC15890w, H1.l
    public long o(float f10) {
        return this.subcomposeMeasureScope.o(f10);
    }

    @Override // kotlin.InterfaceC15890w, H1.d
    public long p(long j10) {
        return this.subcomposeMeasureScope.p(j10);
    }

    @Override // kotlin.InterfaceC15890w
    public List<f0> p0(int index, long constraints) {
        List<f0> listB = this.placeablesCache.b(index);
        if (listB != null) {
            return listB;
        }
        Object objD = this.itemProvider.d(index);
        List<I> listZ = this.subcomposeMeasureScope.Z(objD, this.itemContentFactory.b(index, objD, this.itemProvider.f(index)));
        int size = listZ.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(listZ.get(i10).k0(constraints));
        }
        this.placeablesCache.r(index, arrayList);
        return arrayList;
    }

    @Override // kotlin.InterfaceC15890w, H1.l
    public float t(long j10) {
        return this.subcomposeMeasureScope.t(j10);
    }

    @Override // androidx.compose.ui.layout.InterfaceC5933s
    public boolean v0() {
        return this.subcomposeMeasureScope.v0();
    }

    @Override // kotlin.InterfaceC15890w, H1.d
    public long w(int i10) {
        return this.subcomposeMeasureScope.w(i10);
    }

    @Override // kotlin.InterfaceC15890w, H1.d
    public long x(float f10) {
        return this.subcomposeMeasureScope.x(f10);
    }

    public C15891x(C15883p c15883p, r0 r0Var) {
        this.itemContentFactory = c15883p;
        this.subcomposeMeasureScope = r0Var;
        this.itemProvider = c15883p.d().invoke();
    }
}
