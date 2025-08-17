package androidx.compose.ui.layout;

import androidx.compose.ui.layout.f0;
import j1.C14832a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JN\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJk\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u001b\b\u0002\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/s;", "", "width", "height", "", "Landroidx/compose/ui/layout/a;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/f0$a;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/J;", "g1", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/l0;", "rulers", "O1", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface K extends InterfaceC5791s {

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R-\u0010\u001c\u001a\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015¢\u0006\u0002\b\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"androidx/compose/ui/layout/K$b", "Landroidx/compose/ui/layout/J;", "", "s", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "c", "Ljava/util/Map;", "r", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/l0;", "Lkotlin/ExtensionFunctionType;", "d", "Lkotlin/jvm/functions/Function1;", "t", "()Lkotlin/jvm/functions/Function1;", "rulers", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements J {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<AbstractC5774a, Integer> alignmentLines;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Function1<l0, Unit> rulers;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f51024e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ K f51025f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<f0.a, Unit> f51026g;

        /* JADX WARN: Multi-variable type inference failed */
        b(int i10, int i11, Map<AbstractC5774a, Integer> map, Function1<? super l0, Unit> function1, K k10, Function1<? super f0.a, Unit> function12) {
            this.f51024e = i10;
            this.f51025f = k10;
            this.f51026g = function12;
            this.width = i10;
            this.height = i11;
            this.alignmentLines = map;
            this.rulers = function1;
        }

        @Override // androidx.compose.ui.layout.J
        /* renamed from: getHeight, reason: from getter */
        public int getF51364b() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.J
        /* renamed from: getWidth, reason: from getter */
        public int getF51363a() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.J
        public Map<AbstractC5774a, Integer> r() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.ui.layout.J
        public void s() {
            K k10 = this.f51025f;
            if (k10 instanceof androidx.compose.ui.node.Q) {
                this.f51026g.invoke(((androidx.compose.ui.node.Q) k10).getPlacementScope());
            } else {
                this.f51026g.invoke(new o0(this.f51024e, this.f51025f.getLayoutDirection()));
            }
        }

        @Override // androidx.compose.ui.layout.J
        public Function1<l0, Unit> t() {
            return this.rulers;
        }
    }

    default J g1(int width, int height, Map<AbstractC5774a, Integer> alignmentLines, Function1<? super f0.a, Unit> placementBlock) {
        return O1(width, height, alignmentLines, null, placementBlock);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ J G0(K k10, int i10, int i11, Map map, Function1 function1, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i12 & 4) != 0) {
            map = MapsKt.k();
        }
        return k10.g1(i10, i11, map, function1);
    }

    default J O1(int width, int height, Map<AbstractC5774a, Integer> alignmentLines, Function1<? super l0, Unit> rulers, Function1<? super f0.a, Unit> placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            C14832a.b("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new b(width, height, alignmentLines, rulers, this, placementBlock);
    }
}
