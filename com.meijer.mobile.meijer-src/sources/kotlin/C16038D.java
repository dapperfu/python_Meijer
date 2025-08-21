package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.AbstractC5916a;
import androidx.compose.ui.layout.J;
import g0.InterfaceC14293k;
import java.util.Map;
import kotlin.EnumC13937z;
import kotlin.InterfaceC13897E;
import kotlin.InterfaceC15850I;
import kotlin.InterfaceC6452i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import mv.C15784P;

@Metadata(d1 = {"\u0000c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0005*\u0001*\u001a1\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u0006H\u0080@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\u0006H\u0080@¢\u0006\u0004\b\f\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0012\u001a\u00020\u000e*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001aQ\u0010\u001d\u001a\u00020\t*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\u001d\u0010\u001c\u001a\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\u0019¢\u0006\u0002\b\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010$\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u001a\u0010)\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"", "initialPage", "", "initialPageOffsetFraction", "Lkotlin/Function0;", "pageCount", "Lo0/C;", "k", "(IFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lo0/C;", "", "e", "(Lo0/C;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "Lo0/n;", "", "g", "(Lo0/n;I)J", "Lo0/t;", "h", "(Lo0/t;I)J", "Ln0/I;", "targetPage", "targetPageOffsetToSnappedPosition", "Lc0/i;", "animationSpec", "Lkotlin/Function2;", "Lf0/E;", "Lkotlin/ExtensionFunctionType;", "updateTargetPage", "d", "(Ln0/I;IFLc0/i;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LH1/h;", "a", "F", "i", "()F", "DefaultPositionThreshold", "b", "Lo0/t;", "j", "()Lo0/t;", "EmptyLayoutInfo", "o0/D$b", "c", "Lo0/D$b;", "UnitDensity", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16038D {

    /* renamed from: a, reason: collision with root package name */
    private static final float f153378a = H1.h.p(56);

    /* renamed from: b, reason: collision with root package name */
    private static final C16059t f153379b = new C16059t(CollectionsKt.m(), 0, 0, 0, EnumC13937z.f131420b, 0, 0, false, 0, null, null, 0.0f, 0, false, InterfaceC14293k.a.f133820a, new a(), false, null, null, C15784P.a(EmptyCoroutineContext.f143553a), 393216, null);

    /* renamed from: c, reason: collision with root package name */
    private static final b f153380c = new b();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"o0/D$a", "Landroidx/compose/ui/layout/J;", "", "s", "()V", "", "a", "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "Landroidx/compose/ui/layout/a;", "c", "Ljava/util/Map;", "r", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o0.D$a */
    public static final class a implements J {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<AbstractC5916a, Integer> alignmentLines = MapsKt.k();

        @Override // androidx.compose.ui.layout.J
        public void s() {
        }

        @Override // androidx.compose.ui.layout.J
        /* renamed from: getHeight, reason: from getter */
        public int getF51222b() {
            return this.height;
        }

        @Override // androidx.compose.ui.layout.J
        /* renamed from: getWidth, reason: from getter */
        public int getF51221a() {
            return this.width;
        }

        @Override // androidx.compose.ui.layout.J
        public Map<AbstractC5916a, Integer> r() {
            return this.alignmentLines;
        }

        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"o0/D$b", "LH1/d;", "", "a", "F", "getDensity", "()F", "density", "b", "F1", "fontScale", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o0.D$b */
    public static final class b implements H1.d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float density = 1.0f;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float fontScale = 1.0f;

        @Override // H1.l
        /* renamed from: F1, reason: from getter */
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // H1.d
        public float getDensity() {
            return this.density;
        }

        b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "", "a", "(FF)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: o0.D$c */
    static final class c extends Lambda implements Function2<Float, Float, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f153386f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC15850I f153387g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ref.FloatRef floatRef, InterfaceC15850I interfaceC15850I) {
            super(2);
            this.f153386f = floatRef;
            this.f153387g = interfaceC15850I;
        }

        public final void a(float f10, float f11) {
            this.f153386f.f143739a += this.f153387g.e(f10 - this.f153386f.f143739a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Float f10, Float f11) {
            a(f10.floatValue(), f11.floatValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo0/b;", "c", "()Lo0/b;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.D$d */
    static final class d extends Lambda implements Function0<C16041b> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f153388f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f153389g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Integer> f153390h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, float f10, Function0<Integer> function0) {
            super(0);
            this.f153388f = i10;
            this.f153389g = f10;
            this.f153390h = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C16041b invoke() {
            return new C16041b(this.f153388f, this.f153389g, this.f153390h);
        }
    }

    public static final float i() {
        return f153378a;
    }

    public static final C16059t j() {
        return f153379b;
    }

    public static final AbstractC16037C k(int i10, float f10, Function0<Integer> function0, Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            f10 = 0.0f;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-1210768637, i11, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:87)");
        }
        Object[] objArr = new Object[0];
        L0.k<C16041b, ?> kVarA = C16041b.INSTANCE.a();
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && composer.d(i10)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.b(f10)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.V(function0)) || (i11 & 384) == 256);
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            objB = new d(i10, f10, function0);
            composer.t(objB);
        }
        C16041b c16041b = (C16041b) L0.c.c(objArr, kVarA, null, (Function0) objB, composer, 0, 4);
        c16041b.q0().setValue(function0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c16041b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(InterfaceC15850I interfaceC15850I, int i10, float f10, InterfaceC6452i<Float> interfaceC6452i, Function2<? super InterfaceC13897E, ? super Integer, Unit> function2, Continuation<? super Unit> continuation) {
        boolean z10;
        int iK;
        function2.invoke(interfaceC15850I, Boxing.d(i10));
        if (i10 > interfaceC15850I.h()) {
            z10 = true;
        } else {
            z10 = false;
        }
        int iB = (interfaceC15850I.b() - interfaceC15850I.h()) + 1;
        if (((z10 && i10 > interfaceC15850I.b()) || (!z10 && i10 < interfaceC15850I.h())) && Math.abs(i10 - interfaceC15850I.h()) >= 3) {
            if (z10) {
                iK = RangesKt.f(i10 - iB, interfaceC15850I.h());
            } else {
                iK = RangesKt.k(iB + i10, interfaceC15850I.h());
            }
            interfaceC15850I.d(iK, 0);
        }
        Object objE = i0.e(0.0f, InterfaceC15850I.c(interfaceC15850I, i10, 0, 2, null) + f10, 0.0f, interfaceC6452i, new c(new Ref.FloatRef(), interfaceC15850I), continuation, 4, null);
        if (objE == IntrinsicsKt.f()) {
            return objE;
        }
        return Unit.f143329a;
    }

    public static final Object e(AbstractC16037C abstractC16037C, Continuation<? super Unit> continuation) {
        if (abstractC16037C.v() + 1 < abstractC16037C.H()) {
            Object objN = AbstractC16037C.n(abstractC16037C, abstractC16037C.v() + 1, 0.0f, null, continuation, 6, null);
            if (objN == IntrinsicsKt.f()) {
                return objN;
            }
            return Unit.f143329a;
        }
        return Unit.f143329a;
    }

    public static final Object f(AbstractC16037C abstractC16037C, Continuation<? super Unit> continuation) {
        if (abstractC16037C.v() - 1 >= 0) {
            Object objN = AbstractC16037C.n(abstractC16037C, abstractC16037C.v() - 1, 0.0f, null, continuation, 6, null);
            if (objN == IntrinsicsKt.f()) {
                return objN;
            }
            return Unit.f143329a;
        }
        return Unit.f143329a;
    }

    public static final long g(InterfaceC16053n interfaceC16053n, int i10) {
        long jA;
        long jI = (((i10 * (interfaceC16053n.getPageSpacing() + interfaceC16053n.getPageSize())) + interfaceC16053n.d()) + interfaceC16053n.getAfterContentPadding()) - interfaceC16053n.getPageSpacing();
        if (interfaceC16053n.getOrientation() == EnumC13937z.f131420b) {
            jA = interfaceC16053n.a() >> 32;
        } else {
            jA = interfaceC16053n.a() & 4294967295L;
        }
        int i11 = (int) jA;
        return RangesKt.g(jI - (i11 - RangesKt.o(interfaceC16053n.getSnapPosition().a(i11, interfaceC16053n.getPageSize(), interfaceC16053n.d(), interfaceC16053n.getAfterContentPadding(), i10 - 1, i10), 0, i11)), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(C16059t c16059t, int i10) {
        long jA;
        if (c16059t.getOrientation() == EnumC13937z.f131420b) {
            jA = c16059t.a() >> 32;
        } else {
            jA = c16059t.a() & 4294967295L;
        }
        int i11 = (int) jA;
        return RangesKt.o(c16059t.getSnapPosition().a(i11, c16059t.getPageSize(), c16059t.d(), c16059t.getAfterContentPadding(), 0, i10), 0, i11);
    }
}
