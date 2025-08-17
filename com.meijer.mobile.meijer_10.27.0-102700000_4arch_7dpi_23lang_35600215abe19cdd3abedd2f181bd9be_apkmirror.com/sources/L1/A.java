package L1;

import Q1.e;
import R1.b;
import V0.L1;
import androidx.compose.ui.layout.C5795w;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JO\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00070\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0004JI\u0010+\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0016H\u0000¢\u0006\u0004\b-\u0010\u0004J\u001d\u0010.\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u0016*\u0002002\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0016H\u0016¢\u0006\u0004\b3\u0010\u0004R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00105R\u001a\u0010;\u001a\u0002078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\b9\u0010:R&\u0010A\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020=0<8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b.\u0010>\u001a\u0004\b?\u0010@R&\u0010B\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00130<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010>R&\u0010E\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020C0<8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\bD\u0010@R\"\u0010L\u001a\u00020F8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bG\u0010I\"\u0004\bJ\u0010KR\"\u0010)\u001a\u00020(8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bD\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001b\u0010V\u001a\u00020R8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b?\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010WR\u0014\u0010Y\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010WR\"\u0010`\u001a\u00020Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010i\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010a\u001a\u0004\bg\u0010c\"\u0004\bh\u0010eR&\u0010n\u001a\u0012\u0012\u0004\u0012\u00020k0jj\b\u0012\u0004\u0012\u00020k`l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010m\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006o"}, d2 = {"LL1/A;", "LR1/b$b;", "LL1/u;", "<init>", "()V", "LQ1/e$b;", "dimensionBehaviour", "", "dimension", "matchConstraintDefaultDimension", "measureStrategy", "", "otherDimensionResolved", "currentDimensionResolved", "rootMaxConstraint", "", "outConstraints", "j", "(LQ1/e$b;IIIZZI[I)Z", "", "LR1/b$a;", "measure", "", "e", "([Ljava/lang/Integer;LR1/b$a;)V", "LQ1/e;", "constraintWidget", "b", "(LQ1/e;LR1/b$a;)V", "d", "LH1/b;", "constraints", "LH1/t;", "layoutDirection", "LL1/q;", "constraintSet", "", "Landroidx/compose/ui/layout/I;", "measurables", "optimizationLevel", "Landroidx/compose/ui/layout/K;", "measureScope", "LH1/r;", "l", "(JLH1/t;LL1/q;Ljava/util/List;ILandroidx/compose/ui/layout/K;)J", "m", "c", "(J)V", "Landroidx/compose/ui/layout/f0$a;", "k", "(Landroidx/compose/ui/layout/f0$a;Ljava/util/List;)V", "a", "", "Ljava/lang/String;", "computedLayoutResult", "LQ1/f;", "LQ1/f;", "getRoot", "()LQ1/f;", "root", "", "Landroidx/compose/ui/layout/f0;", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "placeables", "lastMeasures", "LO1/f;", "g", "frameCache", "LH1/d;", "f", "LH1/d;", "()LH1/d;", "n", "(LH1/d;)V", "density", "Landroidx/compose/ui/layout/K;", "getMeasureScope", "()Landroidx/compose/ui/layout/K;", "o", "(Landroidx/compose/ui/layout/K;)V", "LL1/B;", "Lkotlin/Lazy;", "i", "()LL1/B;", "state", "[I", "widthConstraintsHolder", "heightConstraintsHolder", "", "F", "getForcedScaleFactor", "()F", "setForcedScaleFactor", "(F)V", "forcedScaleFactor", "I", "getLayoutCurrentWidth", "()I", "setLayoutCurrentWidth", "(I)V", "layoutCurrentWidth", "getLayoutCurrentHeight", "setLayoutCurrentHeight", "layoutCurrentHeight", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "designElements", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@PublishedApi
/* loaded from: classes.dex */
public class A implements b.InterfaceC0714b, u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String computedLayoutResult = "";

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Q1.f root;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<I, f0> placeables;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<I, Integer[]> lastMeasures;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<I, O1.f> frameCache;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    protected H1.d density;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    protected K measureScope;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy state;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int[] widthConstraintsHolder;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int[] heightConstraintsHolder;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float forcedScaleFactor;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int layoutCurrentWidth;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int layoutCurrentHeight;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private ArrayList<Object> designElements;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/e;", "", "<anonymous>", "(Landroidx/compose/ui/graphics/e;)V"}, k = 3, mv = {1, 5, 1})
    static final class b extends Lambda implements Function1<androidx.compose.ui.graphics.e, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ O1.f f17638f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(O1.f fVar) {
            super(1);
            this.f17638f = fVar;
        }

        public final void a(androidx.compose.ui.graphics.e eVar) {
            Intrinsics.j(eVar, "$this$null");
            if (!Float.isNaN(this.f17638f.f23077f) || !Float.isNaN(this.f17638f.f23078g)) {
                eVar.F0(L1.a(Float.isNaN(this.f17638f.f23077f) ? 0.5f : this.f17638f.f23077f, Float.isNaN(this.f17638f.f23078g) ? 0.5f : this.f17638f.f23078g));
            }
            if (!Float.isNaN(this.f17638f.f23079h)) {
                eVar.j(this.f17638f.f23079h);
            }
            if (!Float.isNaN(this.f17638f.f23080i)) {
                eVar.k(this.f17638f.f23080i);
            }
            if (!Float.isNaN(this.f17638f.f23081j)) {
                eVar.l(this.f17638f.f23081j);
            }
            if (!Float.isNaN(this.f17638f.f23082k)) {
                eVar.n(this.f17638f.f23082k);
            }
            if (!Float.isNaN(this.f17638f.f23083l)) {
                eVar.e(this.f17638f.f23083l);
            }
            if (!Float.isNaN(this.f17638f.f23084m)) {
                eVar.H(this.f17638f.f23084m);
            }
            if (!Float.isNaN(this.f17638f.f23085n) || !Float.isNaN(this.f17638f.f23086o)) {
                eVar.h(Float.isNaN(this.f17638f.f23085n) ? 1.0f : this.f17638f.f23085n);
                eVar.m(Float.isNaN(this.f17638f.f23086o) ? 1.0f : this.f17638f.f23086o);
            }
            if (Float.isNaN(this.f17638f.f23087p)) {
                return;
            }
            eVar.d(this.f17638f.f23087p);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
            a(eVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LL1/B;", "<anonymous>", "()LL1/B;"}, k = 3, mv = {1, 5, 1})
    static final class c extends Lambda implements Function0<B> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final B invoke() {
            return new B(A.this.f());
        }
    }

    @Override // R1.b.InterfaceC0714b
    public void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long l(long constraints, H1.t layoutDirection, q constraintSet, List<? extends I> measurables, int optimizationLevel, K measureScope) {
        String string;
        Intrinsics.j(layoutDirection, "layoutDirection");
        Intrinsics.j(constraintSet, "constraintSet");
        Intrinsics.j(measurables, "measurables");
        Intrinsics.j(measureScope, "measureScope");
        n(measureScope);
        o(measureScope);
        i().p(H1.b.j(constraints) ? O1.b.a(H1.b.l(constraints)) : O1.b.e().l(H1.b.n(constraints)));
        i().g(H1.b.i(constraints) ? O1.b.a(H1.b.k(constraints)) : O1.b.e().l(H1.b.m(constraints)));
        i().u(constraints);
        i().t(layoutDirection);
        m();
        if (constraintSet.a(measurables)) {
            i().k();
            constraintSet.c(i(), measurables);
            l.d(i(), measurables);
            i().a(this.root);
        } else {
            l.d(i(), measurables);
        }
        c(constraints);
        this.root.C1();
        if (l.f17755a) {
            this.root.n0("ConstraintLayout");
            ArrayList<Q1.e> arrayListY0 = this.root.Y0();
            Intrinsics.i(arrayListY0, "root.children");
            for (Q1.e eVar : arrayListY0) {
                Object objN = eVar.n();
                I i10 = objN instanceof I ? (I) objN : null;
                Object objA = i10 == null ? null : C5795w.a(i10);
                String str = "NOTAG";
                if (objA != null && (string = objA.toString()) != null) {
                    str = string;
                }
                eVar.n0(str);
            }
            FS.log_d("CCL", Intrinsics.q("ConstraintLayout is asked to measure with ", H1.b.q(constraints)));
            FS.log_d("CCL", l.i(this.root));
            Iterator<Q1.e> it = this.root.Y0().iterator();
            while (it.hasNext()) {
                Q1.e child = it.next();
                Intrinsics.i(child, "child");
                FS.log_d("CCL", l.i(child));
            }
        }
        this.root.z1(optimizationLevel);
        Q1.f fVar = this.root;
        fVar.u1(fVar.q1(), 0, 0, 0, 0, 0, 0, 0, 0);
        Iterator<Q1.e> it2 = this.root.Y0().iterator();
        while (it2.hasNext()) {
            Q1.e next = it2.next();
            Object objN2 = next.n();
            if (objN2 instanceof I) {
                f0 f0Var = this.placeables.get(objN2);
                Integer numValueOf = f0Var == null ? null : Integer.valueOf(f0Var.getWidth());
                Integer numValueOf2 = f0Var == null ? null : Integer.valueOf(f0Var.getHeight());
                int iM = next.M();
                if (numValueOf != null && iM == numValueOf.intValue()) {
                    int iS = next.s();
                    if (numValueOf2 != null && iS == numValueOf2.intValue()) {
                    }
                }
                if (l.f17755a) {
                    FS.log_d("CCL", "Final measurement for " + C5795w.a((I) objN2) + " to confirm size " + next.M() + ' ' + next.s());
                }
                h().put(objN2, ((I) objN2).k0(H1.b.INSTANCE.c(next.M(), next.s())));
            }
        }
        if (l.f17755a) {
            FS.log_d("CCL", "ConstraintLayout is at the end " + this.root.M() + ' ' + this.root.s());
        }
        return H1.s.a(this.root.M(), this.root.s());
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e.b.values().length];
            iArr[e.b.FIXED.ordinal()] = 1;
            iArr[e.b.WRAP_CONTENT.ordinal()] = 2;
            iArr[e.b.MATCH_CONSTRAINT.ordinal()] = 3;
            iArr[e.b.MATCH_PARENT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void e(Integer[] numArr, b.a aVar) {
        numArr[0] = Integer.valueOf(aVar.f31563e);
        numArr[1] = Integer.valueOf(aVar.f31564f);
        numArr[2] = Integer.valueOf(aVar.f31565g);
    }

    private final boolean j(e.b dimensionBehaviour, int dimension, int matchConstraintDefaultDimension, int measureStrategy, boolean otherDimensionResolved, boolean currentDimensionResolved, int rootMaxConstraint, int[] outConstraints) {
        int i10 = a.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i10 == 1) {
            outConstraints[0] = dimension;
            outConstraints[1] = dimension;
            return false;
        }
        if (i10 == 2) {
            outConstraints[0] = 0;
            outConstraints[1] = rootMaxConstraint;
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                outConstraints[0] = rootMaxConstraint;
                outConstraints[1] = rootMaxConstraint;
                return false;
            }
            throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
        }
        if (l.f17755a) {
            FS.log_d("CCL", Intrinsics.q("Measure strategy ", Integer.valueOf(measureStrategy)));
            FS.log_d("CCL", Intrinsics.q("DW ", Integer.valueOf(matchConstraintDefaultDimension)));
            FS.log_d("CCL", Intrinsics.q("ODR ", Boolean.valueOf(otherDimensionResolved)));
            FS.log_d("CCL", Intrinsics.q("IRH ", Boolean.valueOf(currentDimensionResolved)));
        }
        boolean z10 = currentDimensionResolved || ((measureStrategy == b.a.f31557l || measureStrategy == b.a.f31558m) && (measureStrategy == b.a.f31558m || matchConstraintDefaultDimension != 1 || otherDimensionResolved));
        if (l.f17755a) {
            FS.log_d("CCL", Intrinsics.q("UD ", Boolean.valueOf(z10)));
        }
        outConstraints[0] = z10 ? dimension : 0;
        if (!z10) {
            dimension = rootMaxConstraint;
        }
        outConstraints[1] = dimension;
        return !z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0103  */
    @Override // R1.b.InterfaceC0714b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(Q1.e r20, R1.b.a r21) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.A.b(Q1.e, R1.b$a):void");
    }

    protected final void c(long constraints) {
        this.root.R0(H1.b.l(constraints));
        this.root.w0(H1.b.k(constraints));
        this.forcedScaleFactor = Float.NaN;
        this.layoutCurrentWidth = this.root.M();
        this.layoutCurrentHeight = this.root.s();
    }

    public void d() {
        Q1.e eVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{ ");
        sb2.append("  root: {");
        sb2.append("interpolated: { left:  0,");
        sb2.append("  top:  0,");
        sb2.append("  right:   " + this.root.M() + " ,");
        sb2.append("  bottom:  " + this.root.s() + " ,");
        sb2.append(" } }");
        Iterator<Q1.e> it = this.root.Y0().iterator();
        while (it.hasNext()) {
            Q1.e next = it.next();
            Object objN = next.n();
            if (objN instanceof I) {
                O1.f fVar = null;
                if (next.f29607o == null) {
                    I i10 = (I) objN;
                    Object objA = C5795w.a(i10);
                    if (objA == null) {
                        objA = o.a(i10);
                    }
                    next.f29607o = objA == null ? null : objA.toString();
                }
                O1.f fVar2 = this.frameCache.get(objN);
                if (fVar2 != null && (eVar = fVar2.f23072a) != null) {
                    fVar = eVar.f29605n;
                }
                if (fVar != null) {
                    sb2.append(' ' + ((Object) next.f29607o) + ": {");
                    sb2.append(" interpolated : ");
                    fVar.d(sb2, true);
                    sb2.append("}, ");
                }
            } else if (next instanceof Q1.g) {
                sb2.append(' ' + ((Object) next.f29607o) + ": {");
                Q1.g gVar = (Q1.g) next;
                if (gVar.Y0() == 0) {
                    sb2.append(" type: 'hGuideline', ");
                } else {
                    sb2.append(" type: 'vGuideline', ");
                }
                sb2.append(" interpolated: ");
                sb2.append(" { left: " + gVar.N() + ", top: " + gVar.O() + ", right: " + (gVar.N() + gVar.M()) + ", bottom: " + (gVar.O() + gVar.s()) + " }");
                sb2.append("}, ");
            }
        }
        sb2.append(" }");
        String string = sb2.toString();
        Intrinsics.i(string, "json.toString()");
        this.computedLayoutResult = string;
    }

    protected final H1.d f() {
        H1.d dVar = this.density;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.y("density");
        throw null;
    }

    protected final Map<I, O1.f> g() {
        return this.frameCache;
    }

    protected final Map<I, f0> h() {
        return this.placeables;
    }

    protected final B i() {
        return (B) this.state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(f0.a aVar, List<? extends I> measurables) {
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(measurables, "measurables");
        if (this.frameCache.isEmpty()) {
            Iterator<Q1.e> it = this.root.Y0().iterator();
            while (it.hasNext()) {
                Q1.e next = it.next();
                Object objN = next.n();
                if (objN instanceof I) {
                    this.frameCache.put(objN, new O1.f(next.f29605n.h()));
                }
            }
        }
        int size = measurables.size() - 1;
        if (size >= 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                I i12 = measurables.get(i10);
                O1.f fVar = g().get(i12);
                if (fVar == null) {
                    return;
                }
                if (fVar.c()) {
                    O1.f fVar2 = g().get(i12);
                    Intrinsics.g(fVar2);
                    int i13 = fVar2.f23073b;
                    O1.f fVar3 = g().get(i12);
                    Intrinsics.g(fVar3);
                    int i14 = fVar3.f23074c;
                    f0 f0Var = h().get(i12);
                    if (f0Var != null) {
                        f0.a.j(aVar, f0Var, H1.o.a(i13, i14), 0.0f, 2, null);
                    }
                } else {
                    b bVar = new b(fVar);
                    O1.f fVar4 = g().get(i12);
                    Intrinsics.g(fVar4);
                    int i15 = fVar4.f23073b;
                    O1.f fVar5 = g().get(i12);
                    Intrinsics.g(fVar5);
                    int i16 = fVar5.f23074c;
                    float f10 = Float.isNaN(fVar.f23084m) ? 0.0f : fVar.f23084m;
                    f0 f0Var2 = h().get(i12);
                    if (f0Var2 != null) {
                        aVar.u(f0Var2, i15, i16, f10, bVar);
                    }
                }
                if (i11 > size) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        if (z.BOUNDS == null) {
            d();
        }
    }

    public final void m() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }

    protected final void n(H1.d dVar) {
        Intrinsics.j(dVar, "<set-?>");
        this.density = dVar;
    }

    protected final void o(K k10) {
        Intrinsics.j(k10, "<set-?>");
        this.measureScope = k10;
    }

    public A() {
        Q1.f fVar = new Q1.f(0, 0);
        fVar.y1(this);
        Unit unit = Unit.f142422a;
        this.root = fVar;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        this.state = LazyKt.a(LazyThreadSafetyMode.f142381c, new c());
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
        this.designElements = new ArrayList<>();
    }
}
