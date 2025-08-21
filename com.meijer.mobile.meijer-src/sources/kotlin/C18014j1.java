package kotlin;

import H1.t;
import M0.SnapshotStateList;
import P0.e;
import V0.C5489q0;
import V0.F1;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.A0;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5866i0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import androidx.recyclerview.widget.RecyclerView;
import d0.C13576j;
import d0.EnumC13564E;
import d0.Q;
import e1.C13749a;
import e1.C13750b;
import e1.C13751c;
import e1.C13752d;
import g1.U;
import h0.C14434a;
import h0.C14435b;
import h0.C14436c;
import h0.n;
import j0.C14890K;
import j0.InterfaceC14898b;
import j0.InterfaceC14900d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C13904L;
import kotlin.C13928q;
import kotlin.C6439a;
import kotlin.C6441b;
import kotlin.C6456m;
import kotlin.EnumC13937z;
import kotlin.InterfaceC13893A;
import kotlin.InterfaceC13925n;
import kotlin.InterfaceC13929r;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n0;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import r0.C16806i;
import r1.C16819m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000p\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0081\u0001\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aq\u0010\u0019\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00072\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00020\u00162\u0014\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r0\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aM\u0010\u001f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001f\u0010 \u001aF\u0010%\u001a\u00020\u0003*\u00020!2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\"H\u0003ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aU\u0010+\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u001c2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0000H\u0003¢\u0006\u0004\b+\u0010,\u001a5\u00100\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u001c2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0000H\u0002¢\u0006\u0004\b0\u00101\u001a\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u00000\u001c2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u00103\u001a7\u00109\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0000H\u0002¢\u0006\u0004\b9\u0010:\u001a'\u0010=\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0000H\u0002¢\u0006\u0004\b=\u0010>\u001aU\u0010;\u001a\u00020\u00032\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00000A2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b;\u0010C\u001ac\u0010D\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bD\u0010E\u001aq\u0010K\u001a\u00020\u0005*\u00020\u00052\u0006\u0010G\u001a\u00020F2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00072\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\u0018\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00020\u00162\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00000A2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bK\u0010L\u001a0\u0010O\u001a\u00020\u00032\u0006\u0010G\u001a\u00020F2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0000H\u0082@¢\u0006\u0004\bO\u0010P\"\u001a\u0010T\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010Q\u001a\u0004\bR\u0010S\"\u0014\u0010U\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010Q\"\u0014\u0010V\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010Q\"\u0014\u0010W\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010Q\"\u001a\u0010Y\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010Q\u001a\u0004\bX\u0010S\"\u0014\u0010[\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010Q\"\u0014\u0010]\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010Q\"\u0014\u0010`\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_\"\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00000a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Lh0/l;", "interactionSource", "Lx0/g1;", "colors", "b", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Lh0/l;Lx0/g1;Landroidx/compose/runtime/Composer;II)V", "isRtl", "Landroidx/compose/runtime/z1;", "onValueChangeState", "onValueChangeFinishedState", "t", "(Landroidx/compose/ui/Modifier;ZILkotlin/ranges/ClosedFloatingPointRange;FZLandroidx/compose/runtime/z1;Landroidx/compose/runtime/z1;)Landroidx/compose/ui/Modifier;", "positionFraction", "", "tickFractions", "width", "c", "(ZFLjava/util/List;Lx0/g1;FLh0/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lj0/b;", "LH1/h;", "offset", "thumbSize", "d", "(Lj0/b;Landroidx/compose/ui/Modifier;FLh0/l;Lx0/g1;ZFLandroidx/compose/runtime/Composer;I)V", "positionFractionStart", "positionFractionEnd", "thumbPx", "trackStrokeWidth", "e", "(Landroidx/compose/ui/Modifier;Lx0/g1;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "current", "minPx", "maxPx", "w", "(FLjava/util/List;FF)F", "x", "(I)Ljava/util/List;", "a1", "b1", "x1", "a2", "b2", "s", "(FFFFF)F", "a", "pos", "q", "(FFF)F", "scaleToOffset", "trackRange", "Landroidx/compose/runtime/l0;", "valueState", "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/l0;FLandroidx/compose/runtime/Composer;I)V", "u", "(Landroidx/compose/ui/Modifier;FZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;", "Lf0/r;", "draggableState", "rawOffset", "gestureEndAction", "pressOffset", "v", "(Landroidx/compose/ui/Modifier;Lf0/r;Lh0/l;FZLandroidx/compose/runtime/z1;Landroidx/compose/runtime/z1;Landroidx/compose/runtime/l0;Z)Landroidx/compose/ui/Modifier;", "target", "velocity", "p", "(Lf0/r;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "F", "r", "()F", "ThumbRadius", "ThumbRippleRadius", "ThumbDefaultElevation", "ThumbPressedElevation", "getTrackHeight", "TrackHeight", "f", "SliderHeight", "g", "SliderMinWidth", "h", "Landroidx/compose/ui/Modifier;", "DefaultSliderConstraints", "Lc0/n0;", "i", "Lc0/n0;", "SliderToTickAnimation", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18014j1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f169088a = H1.h.p(10);

    /* renamed from: b, reason: collision with root package name */
    private static final float f169089b = H1.h.p(24);

    /* renamed from: c, reason: collision with root package name */
    private static final float f169090c = H1.h.p(1);

    /* renamed from: d, reason: collision with root package name */
    private static final float f169091d = H1.h.p(6);

    /* renamed from: e, reason: collision with root package name */
    private static final float f169092e = H1.h.p(4);

    /* renamed from: f, reason: collision with root package name */
    private static final float f169093f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f169094g;

    /* renamed from: h, reason: collision with root package name */
    private static final Modifier f169095h;

    /* renamed from: i, reason: collision with root package name */
    private static final n0<Float> f169096i;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.j1$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f169097f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Float> f169098g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f169099h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Float> f169100i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f169101j;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super Float, Float> function1, float f10, InterfaceC5872l0<Float> interfaceC5872l0, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
            super(0);
            this.f169097f = closedFloatingPointRange;
            this.f169098g = function1;
            this.f169099h = f10;
            this.f169100i = interfaceC5872l0;
            this.f169101j = closedFloatingPointRange2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            float fFloatValue = (this.f169097f.getEndInclusive().floatValue() - this.f169097f.getStart().floatValue()) / 1000;
            float fFloatValue2 = this.f169098g.invoke(Float.valueOf(this.f169099h)).floatValue();
            if (Math.abs(fFloatValue2 - this.f169100i.getValue().floatValue()) <= fFloatValue || !this.f169101j.contains(this.f169100i.getValue())) {
                return;
            }
            this.f169100i.setValue(Float.valueOf(fFloatValue2));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.j1$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Float> f169102f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f169103g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f169104h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Float> f169105i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f169106j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f169107k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Float, Float> function1, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, InterfaceC5872l0<Float> interfaceC5872l0, float f10, int i10) {
            super(2);
            this.f169102f = function1;
            this.f169103g = closedFloatingPointRange;
            this.f169104h = closedFloatingPointRange2;
            this.f169105i = interfaceC5872l0;
            this.f169106j = f10;
            this.f169107k = i10;
        }

        public final void a(Composer composer, int i10) {
            C18014j1.a(this.f169102f, this.f169103g, this.f169104h, this.f169105i, this.f169106j, composer, J0.a(this.f169107k | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj0/d;", "", "c", "(Lj0/d;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.j1$c */
    static final class c extends Lambda implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f169108f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f169109g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<Float> f169110h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f169111i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0.l f169112j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f169113k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC18005g1 f169114l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ z1<Function1<Float, Unit>> f169115m;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: x0.j1$c$a */
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Float, Float> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ClosedFloatingPointRange<Float> f169116b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f169117c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f169118d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
                super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
                this.f169116b = closedFloatingPointRange;
                this.f169117c = floatRef;
                this.f169118d = floatRef2;
            }

            public final Float a(float f10) {
                return Float.valueOf(c.d(this.f169116b, this.f169117c, this.f169118d, f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return a(f10.floatValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmv/O;", "", "velocity", "", "<anonymous>", "(Lmv/O;F)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$2$drag$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
        /* renamed from: x0.j1$c$b */
        static final class b extends SuspendLambda implements Function3<InterfaceC15783O, Float, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f169119a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ float f169120b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<Function1<Float, Unit>> f169121c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(z1<? extends Function1<? super Float, Unit>> z1Var, Continuation<? super b> continuation) {
                super(3, continuation);
                this.f169121c = z1Var;
            }

            public final Object d(InterfaceC15783O interfaceC15783O, float f10, Continuation<? super Unit> continuation) {
                b bVar = new b(this.f169121c, continuation);
                bVar.f169120b = f10;
                return bVar.invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Float f10, Continuation<? super Unit> continuation) {
                return d(interfaceC15783O, f10.floatValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f169119a == 0) {
                    ResultKt.b(obj);
                    this.f169121c.getValue().invoke(Boxing.c(this.f169120b));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "b", "(F)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.j1$c$c, reason: collision with other inner class name */
        static final class C2696c extends Lambda implements Function1<Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5866i0 f169122f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5866i0 f169123g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f169124h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f169125i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ z1<Function1<Float, Unit>> f169126j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ ClosedFloatingPointRange<Float> f169127k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2696c(InterfaceC5866i0 interfaceC5866i0, InterfaceC5866i0 interfaceC5866i02, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, z1<? extends Function1<? super Float, Unit>> z1Var, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
                super(1);
                this.f169122f = interfaceC5866i0;
                this.f169123g = interfaceC5866i02;
                this.f169124h = floatRef;
                this.f169125i = floatRef2;
                this.f169126j = z1Var;
                this.f169127k = closedFloatingPointRange;
            }

            public final void b(float f10) {
                InterfaceC5866i0 interfaceC5866i0 = this.f169122f;
                interfaceC5866i0.A(interfaceC5866i0.b() + f10 + this.f169123g.b());
                this.f169123g.A(0.0f);
                this.f169126j.getValue().invoke(Float.valueOf(c.e(this.f169124h, this.f169125i, this.f169127k, RangesKt.n(this.f169122f.b(), this.f169124h.f143739a, this.f169125i.f143739a))));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                b(f10.floatValue());
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "velocity", "", "b", "(F)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.j1$c$d */
        static final class d extends Lambda implements Function1<Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5866i0 f169128f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<Float> f169129g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f169130h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f169131i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f169132j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ C18011i1 f169133k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f169134l;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1", f = "Slider.kt", l = {235}, m = "invokeSuspend")
            /* renamed from: x0.j1$c$d$a */
            static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f169135a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C18011i1 f169136b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ float f169137c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ float f169138d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ float f169139e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f169140f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C18011i1 c18011i1, float f10, float f11, float f12, Function0<Unit> function0, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f169136b = c18011i1;
                    this.f169137c = f10;
                    this.f169138d = f11;
                    this.f169139e = f12;
                    this.f169140f = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f169136b, this.f169137c, this.f169138d, this.f169139e, this.f169140f, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f169135a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C18011i1 c18011i1 = this.f169136b;
                        float f10 = this.f169137c;
                        float f11 = this.f169138d;
                        float f12 = this.f169139e;
                        this.f169135a = 1;
                        if (C18014j1.p(c18011i1, f10, f11, f12, this) == objF) {
                            return objF;
                        }
                    }
                    Function0<Unit> function0 = this.f169140f;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(InterfaceC5866i0 interfaceC5866i0, List<Float> list, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, InterfaceC15783O interfaceC15783O, C18011i1 c18011i1, Function0<Unit> function0) {
                super(1);
                this.f169128f = interfaceC5866i0;
                this.f169129g = list;
                this.f169130h = floatRef;
                this.f169131i = floatRef2;
                this.f169132j = interfaceC15783O;
                this.f169133k = c18011i1;
                this.f169134l = function0;
            }

            public final void b(float f10) {
                Function0<Unit> function0;
                float fB = this.f169128f.b();
                float fW = C18014j1.w(fB, this.f169129g, this.f169130h.f143739a, this.f169131i.f143739a);
                if (fB != fW) {
                    C15809k.d(this.f169132j, null, null, new a(this.f169133k, fB, fW, f10, this.f169134l, null), 3, null);
                } else {
                    if (this.f169133k.g() || (function0 = this.f169134l) == null) {
                        return;
                    }
                    function0.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                b(f10.floatValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f10, List<Float> list, Function0<Unit> function0, h0.l lVar, boolean z10, InterfaceC18005g1 interfaceC18005g1, z1<? extends Function1<? super Float, Unit>> z1Var) {
            super(3);
            this.f169108f = closedFloatingPointRange;
            this.f169109g = f10;
            this.f169110h = list;
            this.f169111i = function0;
            this.f169112j = lVar;
            this.f169113k = z10;
            this.f169114l = interfaceC18005g1;
            this.f169115m = z1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float e(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f10) {
            return C18014j1.s(floatRef.f143739a, floatRef2.f143739a, f10, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        }

        public final void c(InterfaceC14900d interfaceC14900d, Composer composer, int i10) {
            InterfaceC14900d interfaceC14900d2;
            int i11;
            InterfaceC5866i0 interfaceC5866i0;
            Ref.FloatRef floatRef;
            Ref.FloatRef floatRef2;
            C18011i1 c18011i1;
            Ref.FloatRef floatRef3;
            Ref.FloatRef floatRef4;
            if ((i10 & 6) == 0) {
                interfaceC14900d2 = interfaceC14900d;
                i11 = i10 | (composer.V(interfaceC14900d2) ? 4 : 2);
            } else {
                interfaceC14900d2 = interfaceC14900d;
                i11 = i10;
            }
            if (!composer.p((i11 & 19) != 18, i11 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2085116814, i11, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:196)");
            }
            boolean z10 = composer.o(C6034t0.m()) == t.f13339b;
            float fL = H1.b.l(interfaceC14900d2.getConstraints());
            Ref.FloatRef floatRef5 = new Ref.FloatRef();
            Ref.FloatRef floatRef6 = new Ref.FloatRef();
            H1.d dVar = (H1.d) composer.o(C6034t0.g());
            floatRef5.f143739a = Math.max(fL - dVar.I1(C18014j1.r()), 0.0f);
            floatRef6.f143739a = Math.min(dVar.I1(C18014j1.r()), floatRef5.f143739a);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB);
            }
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB;
            float f10 = this.f169109g;
            ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f169108f;
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = A0.a(d(closedFloatingPointRange, floatRef6, floatRef5, f10));
                composer.t(objB2);
            }
            InterfaceC5866i0 interfaceC5866i02 = (InterfaceC5866i0) objB2;
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = A0.a(0.0f);
                composer.t(objB3);
            }
            InterfaceC5866i0 interfaceC5866i03 = (InterfaceC5866i0) objB3;
            boolean zB = composer.b(floatRef6.f143739a) | composer.b(floatRef5.f143739a) | composer.V(this.f169108f);
            z1<Function1<Float, Unit>> z1Var = this.f169115m;
            ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.f169108f;
            Object objB4 = composer.B();
            if (zB || objB4 == companion.a()) {
                interfaceC5866i0 = interfaceC5866i03;
                floatRef = floatRef6;
                floatRef2 = floatRef5;
                objB4 = new C18011i1(new C2696c(interfaceC5866i02, interfaceC5866i03, floatRef6, floatRef5, z1Var, closedFloatingPointRange2));
                composer.t(objB4);
            } else {
                floatRef2 = floatRef5;
                floatRef = floatRef6;
                interfaceC5866i0 = interfaceC5866i03;
            }
            C18011i1 c18011i12 = (C18011i1) objB4;
            boolean zV = composer.V(this.f169108f) | composer.b(floatRef.f143739a) | composer.b(floatRef2.f143739a);
            ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.f169108f;
            Object objB5 = composer.B();
            if (zV || objB5 == companion.a()) {
                objB5 = new a(closedFloatingPointRange3, floatRef, floatRef2);
                composer.t(objB5);
            }
            C18014j1.a((Function1) ((KFunction) objB5), this.f169108f, RangesKt.b(floatRef.f143739a, floatRef2.f143739a), interfaceC5866i02, this.f169109g, composer, 3072);
            boolean zD = composer.D(this.f169110h) | composer.b(floatRef.f143739a) | composer.b(floatRef2.f143739a) | composer.D(interfaceC15783O) | composer.D(c18011i12) | composer.V(this.f169111i);
            List<Float> list = this.f169110h;
            Function0<Unit> function0 = this.f169111i;
            Object objB6 = composer.B();
            if (zD || objB6 == companion.a()) {
                c18011i1 = c18011i12;
                Ref.FloatRef floatRef7 = floatRef2;
                Ref.FloatRef floatRef8 = floatRef;
                Object dVar2 = new d(interfaceC5866i02, list, floatRef8, floatRef7, interfaceC15783O, c18011i1, function0);
                floatRef3 = floatRef8;
                floatRef4 = floatRef7;
                composer.t(dVar2);
                objB6 = dVar2;
            } else {
                floatRef4 = floatRef2;
                floatRef3 = floatRef;
                c18011i1 = c18011i12;
            }
            z1 z1VarP = o1.p((Function1) objB6, composer, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierV = C18014j1.v(companion2, c18011i1, this.f169112j, fL, z10, interfaceC5866i02, z1VarP, interfaceC5866i0, this.f169113k);
            EnumC13937z enumC13937z = EnumC13937z.f131420b;
            boolean zG = c18011i1.g();
            boolean z11 = this.f169113k;
            boolean z12 = z10;
            h0.l lVar = this.f169112j;
            boolean zV2 = composer.V(z1VarP);
            Object objB7 = composer.B();
            if (zV2 || objB7 == companion.a()) {
                objB7 = new b(z1VarP, null);
                composer.t(objB7);
            }
            C18014j1.c(this.f169113k, C18014j1.q(this.f169108f.getStart().floatValue(), this.f169108f.getEndInclusive().floatValue(), RangesKt.n(this.f169109g, this.f169108f.getStart().floatValue(), this.f169108f.getEndInclusive().floatValue())), this.f169110h, this.f169114l, floatRef4.f143739a - floatRef3.f143739a, this.f169112j, modifierV.then(C13928q.h(companion2, c18011i1, enumC13937z, z11, lVar, zG, null, (Function3) objB7, z12, 32, null)), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
            c(interfaceC14900d, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float d(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f10) {
            return C18014j1.s(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f10, floatRef.f143739a, floatRef2.f143739a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.j1$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f169141f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Unit> f169142g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f169143h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f169144i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f169145j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f169146k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f169147l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ h0.l f169148m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC18005g1 f169149n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f169150o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f169151p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(float f10, Function1<? super Float, Unit> function1, Modifier modifier, boolean z10, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10, Function0<Unit> function0, h0.l lVar, InterfaceC18005g1 interfaceC18005g1, int i11, int i12) {
            super(2);
            this.f169141f = f10;
            this.f169142g = function1;
            this.f169143h = modifier;
            this.f169144i = z10;
            this.f169145j = closedFloatingPointRange;
            this.f169146k = i10;
            this.f169147l = function0;
            this.f169148m = lVar;
            this.f169149n = interfaceC18005g1;
            this.f169150o = i11;
            this.f169151p = i12;
        }

        public final void a(Composer composer, int i10) {
            C18014j1.b(this.f169141f, this.f169142g, this.f169143h, this.f169144i, this.f169145j, this.f169146k, this.f169147l, this.f169148m, this.f169149n, composer, J0.a(this.f169150o | 1), this.f169151p);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.j1$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f169152f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f169153g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<Float> f169154h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC18005g1 f169155i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f169156j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ h0.l f169157k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Modifier f169158l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f169159m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, float f10, List<Float> list, InterfaceC18005g1 interfaceC18005g1, float f11, h0.l lVar, Modifier modifier, int i10) {
            super(2);
            this.f169152f = z10;
            this.f169153g = f10;
            this.f169154h = list;
            this.f169155i = interfaceC18005g1;
            this.f169156j = f11;
            this.f169157k = lVar;
            this.f169158l = modifier;
            this.f169159m = i10;
        }

        public final void a(Composer composer, int i10) {
            C18014j1.c(this.f169152f, this.f169153g, this.f169154h, this.f169155i, this.f169156j, this.f169157k, this.f169158l, composer, J0.a(this.f169159m | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$SliderThumb$1$1$1", f = "Slider.kt", l = {794}, m = "invokeSuspend")
    /* renamed from: x0.j1$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169160a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.l f169161b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<h0.i> f169162c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/i;", "interaction", "", "a", "(Lh0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.j1$f$a */
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<h0.i> f169163a;

            a(SnapshotStateList<h0.i> snapshotStateList) {
                this.f169163a = snapshotStateList;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(h0.i iVar, Continuation<? super Unit> continuation) {
                if (iVar instanceof n.b) {
                    this.f169163a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f169163a.remove(((n.c) iVar).getPress());
                } else if (iVar instanceof n.a) {
                    this.f169163a.remove(((n.a) iVar).getPress());
                } else if (iVar instanceof C14435b) {
                    this.f169163a.add(iVar);
                } else if (iVar instanceof C14436c) {
                    this.f169163a.remove(((C14436c) iVar).getStart());
                } else if (iVar instanceof C14434a) {
                    this.f169163a.remove(((C14434a) iVar).getStart());
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(h0.l lVar, SnapshotStateList<h0.i> snapshotStateList, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f169161b = lVar;
            this.f169162c = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f169161b, this.f169162c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f169160a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f<h0.i> interfaceC16561fB = this.f169161b.b();
                a aVar = new a(this.f169162c);
                this.f169160a = 1;
                if (interfaceC16561fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.j1$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC14898b f169164f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f169165g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f169166h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h0.l f169167i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC18005g1 f169168j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f169169k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f169170l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f169171m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC14898b interfaceC14898b, Modifier modifier, float f10, h0.l lVar, InterfaceC18005g1 interfaceC18005g1, boolean z10, float f11, int i10) {
            super(2);
            this.f169164f = interfaceC14898b;
            this.f169165g = modifier;
            this.f169166h = f10;
            this.f169167i = lVar;
            this.f169168j = interfaceC18005g1;
            this.f169169k = z10;
            this.f169170l = f11;
            this.f169171m = i10;
        }

        public final void a(Composer composer, int i10) {
            C18014j1.d(this.f169164f, this.f169165g, this.f169166h, this.f169167i, this.f169168j, this.f169169k, this.f169170l, composer, J0.a(this.f169171m | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.j1$h */
    static final class h extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f169172f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<C5489q0> f169173g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f169174h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f169175i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f169176j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ z1<C5489q0> f169177k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ List<Float> f169178l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ z1<C5489q0> f169179m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ z1<C5489q0> f169180n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f10, z1<C5489q0> z1Var, float f11, float f12, float f13, z1<C5489q0> z1Var2, List<Float> list, z1<C5489q0> z1Var3, z1<C5489q0> z1Var4) {
            super(1);
            this.f169172f = f10;
            this.f169173g = z1Var;
            this.f169174h = f11;
            this.f169175i = f12;
            this.f169176j = f13;
            this.f169177k = z1Var2;
            this.f169178l = list;
            this.f169179m = z1Var3;
            this.f169180n = z1Var4;
        }

        public final void a(X0.f fVar) {
            boolean z10 = fVar.getLayoutDirection() == t.f13339b;
            long jA = U0.g.a(this.f169172f, U0.f.n(fVar.Q1()));
            long jA2 = U0.g.a(U0.k.i(fVar.b()) - this.f169172f, U0.f.n(fVar.Q1()));
            long j10 = z10 ? jA2 : jA;
            long j11 = z10 ? jA : jA2;
            long value = this.f169173g.getValue().getValue();
            float f10 = this.f169174h;
            F1.Companion companion = F1.INSTANCE;
            X0.f.O0(fVar, value, j10, j11, f10, companion.b(), null, 0.0f, null, 0, 480, null);
            X0.f.O0(fVar, this.f169177k.getValue().getValue(), U0.g.a(U0.f.m(j10) + ((U0.f.m(j11) - U0.f.m(j10)) * this.f169176j), U0.f.n(fVar.Q1())), U0.g.a(U0.f.m(j10) + ((U0.f.m(j11) - U0.f.m(j10)) * this.f169175i), U0.f.n(fVar.Q1())), this.f169174h, companion.b(), null, 0.0f, null, 0, 480, null);
            List<Float> list = this.f169178l;
            float f11 = this.f169175i;
            float f12 = this.f169176j;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                float fFloatValue = ((Number) obj).floatValue();
                Boolean boolValueOf = Boolean.valueOf(fFloatValue > f11 || fFloatValue < f12);
                Object arrayList = linkedHashMap.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(boolValueOf, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            z1<C5489q0> z1Var = this.f169179m;
            z1<C5489q0> z1Var2 = this.f169180n;
            float f13 = this.f169174h;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                List list2 = (List) entry.getValue();
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(U0.f.d(U0.g.a(U0.f.m(U0.g.b(j10, j11, ((Number) list2.get(i10)).floatValue())), U0.f.n(fVar.Q1()))));
                }
                X0.f.o1(fVar, arrayList2, androidx.compose.ui.graphics.f.INSTANCE.b(), (zBooleanValue ? z1Var : z1Var2).getValue().getValue(), f13, F1.INSTANCE.b(), null, 0.0f, null, 0, 480, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.j1$i */
    static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f169181f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC18005g1 f169182g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f169183h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f169184i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f169185j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ List<Float> f169186k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f169187l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f169188m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f169189n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Modifier modifier, InterfaceC18005g1 interfaceC18005g1, boolean z10, float f10, float f11, List<Float> list, float f12, float f13, int i10) {
            super(2);
            this.f169181f = modifier;
            this.f169182g = interfaceC18005g1;
            this.f169183h = z10;
            this.f169184i = f10;
            this.f169185j = f11;
            this.f169186k = list;
            this.f169187l = f12;
            this.f169188m = f13;
            this.f169189n = i10;
        }

        public final void a(Composer composer, int i10) {
            C18014j1.e(this.f169181f, this.f169182g, this.f169183h, this.f169184i, this.f169185j, this.f169186k, this.f169187l, this.f169188m, composer, J0.a(this.f169189n | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/n;", "", "<anonymous>", "(Lf0/n;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", l = {1053}, m = "invokeSuspend")
    /* renamed from: x0.j1$j */
    static final class j extends SuspendLambda implements Function2<InterfaceC13925n, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f169190a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f169191b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f169192c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f169193d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f169194e;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/a;", "", "Lc0/m;", "", "a", "(Lc0/a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.j1$j$a */
        static final class a extends Lambda implements Function1<C6439a<Float, C6456m>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC13925n f169195f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f169196g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC13925n interfaceC13925n, Ref.FloatRef floatRef) {
                super(1);
                this.f169195f = interfaceC13925n;
                this.f169196g = floatRef;
            }

            public final void a(C6439a<Float, C6456m> c6439a) {
                this.f169195f.a(c6439a.m().floatValue() - this.f169196g.f143739a);
                this.f169196g.f143739a = c6439a.m().floatValue();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C6439a<Float, C6456m> c6439a) {
                a(c6439a);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(float f10, float f11, float f12, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f169192c = f10;
            this.f169193d = f11;
            this.f169194e = f12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = new j(this.f169192c, this.f169193d, this.f169194e, continuation);
            jVar.f169191b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13925n interfaceC13925n, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC13925n, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f169190a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC13925n interfaceC13925n = (InterfaceC13925n) this.f169191b;
                Ref.FloatRef floatRef = new Ref.FloatRef();
                float f10 = this.f169192c;
                floatRef.f143739a = f10;
                C6439a c6439aB = C6441b.b(f10, 0.0f, 2, null);
                Float fC = Boxing.c(this.f169193d);
                n0 n0Var = C18014j1.f169096i;
                Float fC2 = Boxing.c(this.f169194e);
                a aVar = new a(interfaceC13925n, floatRef);
                this.f169190a = 1;
                if (c6439aB.e(fC, n0Var, fC2, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le1/b;", "it", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.j1$k */
    static final class k extends Lambda implements Function1<C13750b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f169197f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f169198g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f169199h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ z1<Function1<Float, Unit>> f169200i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f169201j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f169202k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ z1<Function0<Unit>> f169203l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(boolean z10, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10, z1<? extends Function1<? super Float, Unit>> z1Var, float f10, boolean z11, z1<? extends Function0<Unit>> z1Var2) {
            super(1);
            this.f169197f = z10;
            this.f169198g = closedFloatingPointRange;
            this.f169199h = i10;
            this.f169200i = z1Var;
            this.f169201j = f10;
            this.f169202k = z11;
            this.f169203l = z1Var2;
        }

        public final Boolean a(KeyEvent keyEvent) {
            if (!this.f169197f) {
                return Boolean.FALSE;
            }
            int iB = C13752d.b(keyEvent);
            C13751c.Companion companion = C13751c.INSTANCE;
            boolean z10 = false;
            if (C13751c.e(iB, companion.a())) {
                float fAbs = Math.abs(this.f169198g.getEndInclusive().floatValue() - this.f169198g.getStart().floatValue());
                int i10 = this.f169199h;
                float f10 = fAbs / (i10 > 0 ? i10 + 1 : 100);
                long jA = C13752d.a(keyEvent);
                C13749a.Companion companion2 = C13749a.INSTANCE;
                if (C13749a.q(jA, companion2.f())) {
                    this.f169200i.getValue().invoke(RangesKt.r(Float.valueOf(this.f169201j + f10), this.f169198g));
                } else if (C13749a.q(jA, companion2.c())) {
                    this.f169200i.getValue().invoke(RangesKt.r(Float.valueOf(this.f169201j - f10), this.f169198g));
                } else {
                    if (C13749a.q(jA, companion2.e())) {
                        this.f169200i.getValue().invoke(RangesKt.r(Float.valueOf(this.f169201j + ((this.f169202k ? -1 : 1) * f10)), this.f169198g));
                    } else if (C13749a.q(jA, companion2.d())) {
                        this.f169200i.getValue().invoke(RangesKt.r(Float.valueOf(this.f169201j - ((this.f169202k ? -1 : 1) * f10)), this.f169198g));
                    } else if (C13749a.q(jA, companion2.j())) {
                        this.f169200i.getValue().invoke(this.f169198g.getStart());
                    } else if (C13749a.q(jA, companion2.i())) {
                        this.f169200i.getValue().invoke(this.f169198g.getEndInclusive());
                    } else if (C13749a.q(jA, companion2.m())) {
                        this.f169200i.getValue().invoke(RangesKt.r(Float.valueOf(this.f169201j - (RangesKt.o(r1 / 10, 1, 10) * f10)), this.f169198g));
                    } else if (C13749a.q(jA, companion2.l())) {
                        this.f169200i.getValue().invoke(RangesKt.r(Float.valueOf(this.f169201j + (RangesKt.o(r1 / 10, 1, 10) * f10)), this.f169198g));
                    }
                }
                z10 = true;
            } else if (C13751c.e(iB, companion.b())) {
                long jA2 = C13752d.a(keyEvent);
                C13749a.Companion companion3 = C13749a.INSTANCE;
                if (C13749a.q(jA2, companion3.f()) ? true : C13749a.q(jA2, companion3.c()) ? true : C13749a.q(jA2, companion3.e()) ? true : C13749a.q(jA2, companion3.d()) ? true : C13749a.q(jA2, companion3.j()) ? true : C13749a.q(jA2, companion3.i()) ? true : C13749a.q(jA2, companion3.m()) ? true : C13749a.q(jA2, companion3.l())) {
                    Function0<Unit> value = this.f169203l.getValue();
                    if (value != null) {
                        value.invoke();
                    }
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(C13750b c13750b) {
            return a(c13750b.getNativeKeyEvent());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.j1$l */
    static final class l extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f169204f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f169205g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f169206h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f169207i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Unit> f169208j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f169209k;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "targetValue", "", "b", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.j1$l$a */
        static final class a extends Lambda implements Function1<Float, Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ClosedFloatingPointRange<Float> f169210f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f169211g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f169212h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1<Float, Unit> f169213i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f169214j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10, float f10, Function1<? super Float, Unit> function1, Function0<Unit> function0) {
                super(1);
                this.f169210f = closedFloatingPointRange;
                this.f169211g = i10;
                this.f169212h = f10;
                this.f169213i = function1;
                this.f169214j = function0;
            }

            public final Boolean b(float f10) {
                int i10;
                float fN = RangesKt.n(f10, this.f169210f.getStart().floatValue(), this.f169210f.getEndInclusive().floatValue());
                int i11 = this.f169211g;
                boolean z10 = false;
                if (i11 > 0 && (i10 = i11 + 1) >= 0) {
                    float fAbs = fN;
                    float f11 = fAbs;
                    int i12 = 0;
                    while (true) {
                        float fB = J1.b.b(this.f169210f.getStart().floatValue(), this.f169210f.getEndInclusive().floatValue(), i12 / (this.f169211g + 1));
                        float f12 = fB - fN;
                        if (Math.abs(f12) <= fAbs) {
                            fAbs = Math.abs(f12);
                            f11 = fB;
                        }
                        if (i12 == i10) {
                            break;
                        }
                        i12++;
                    }
                    fN = f11;
                }
                if (fN != this.f169212h) {
                    this.f169213i.invoke(Float.valueOf(fN));
                    Function0<Unit> function0 = this.f169214j;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Float f10) {
                return b(f10.floatValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(boolean z10, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10, float f10, Function1<? super Float, Unit> function1, Function0<Unit> function0) {
            super(1);
            this.f169204f = z10;
            this.f169205g = closedFloatingPointRange;
            this.f169206h = i10;
            this.f169207i = f10;
            this.f169208j = function1;
            this.f169209k = function0;
        }

        public final void a(u uVar) {
            if (!this.f169204f) {
                s.l(uVar);
            }
            s.q0(uVar, null, new a(this.f169205g, this.f169206h, this.f169207i, this.f169208j, this.f169209k), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.j1$m */
    public static final class m extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13929r f169215f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0.l f169216g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f169217h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f169218i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ z1 f169219j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ z1 f169220k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f169221l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f169222m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC13929r interfaceC13929r, h0.l lVar, float f10, boolean z10, z1 z1Var, z1 z1Var2, InterfaceC5872l0 interfaceC5872l0, boolean z11) {
            super(1);
            this.f169215f = interfaceC13929r;
            this.f169216g = lVar;
            this.f169217h = f10;
            this.f169218i = z10;
            this.f169219j = z1Var;
            this.f169220k = z1Var2;
            this.f169221l = interfaceC5872l0;
            this.f169222m = z11;
        }

        public final void a(N0 n02) {
            n02.b("sliderTapModifier");
            n02.getProperties().c("draggableState", this.f169215f);
            n02.getProperties().c("interactionSource", this.f169216g);
            n02.getProperties().c("maxPx", Float.valueOf(this.f169217h));
            n02.getProperties().c("isRtl", Boolean.valueOf(this.f169218i));
            n02.getProperties().c("rawOffset", this.f169219j);
            n02.getProperties().c("gestureEndAction", this.f169220k);
            n02.getProperties().c("pressOffset", this.f169221l);
            n02.getProperties().c("enabled", Boolean.valueOf(this.f169222m));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.j1$n */
    static final class n extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f169223f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC13929r f169224g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0.l f169225h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f169226i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f169227j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Float> f169228k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ z1<Float> f169229l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ z1<Function1<Float, Unit>> f169230m;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "<anonymous>", "(Lg1/J;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", l = {1006}, m = "invokeSuspend")
        /* renamed from: x0.j1$n$a */
        static final class a extends SuspendLambda implements Function2<g1.J, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f169231a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f169232b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f169233c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f169234d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Float> f169235e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<Float> f169236f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f169237g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC13929r f169238h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ z1<Function1<Float, Unit>> f169239i;

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf0/A;", "LU0/f;", "pos", "", "<anonymous>", "(Lf0/A;LU0/f;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1", f = "Slider.kt", l = {1011}, m = "invokeSuspend")
            /* renamed from: x0.j1$n$a$a, reason: collision with other inner class name */
            static final class C2697a extends SuspendLambda implements Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f169240a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f169241b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ long f169242c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f169243d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ float f169244e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Float> f169245f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ z1<Float> f169246g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2697a(boolean z10, float f10, InterfaceC5872l0<Float> interfaceC5872l0, z1<Float> z1Var, Continuation<? super C2697a> continuation) {
                    super(3, continuation);
                    this.f169243d = z10;
                    this.f169244e = f10;
                    this.f169245f = interfaceC5872l0;
                    this.f169246g = z1Var;
                }

                public final Object d(InterfaceC13893A interfaceC13893A, long j10, Continuation<? super Unit> continuation) {
                    C2697a c2697a = new C2697a(this.f169243d, this.f169244e, this.f169245f, this.f169246g, continuation);
                    c2697a.f169241b = interfaceC13893A;
                    c2697a.f169242c = j10;
                    return c2697a.invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(InterfaceC13893A interfaceC13893A, U0.f fVar, Continuation<? super Unit> continuation) {
                    return d(interfaceC13893A, fVar.getPackedValue(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    float fM;
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f169240a;
                    try {
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            InterfaceC13893A interfaceC13893A = (InterfaceC13893A) this.f169241b;
                            long j10 = this.f169242c;
                            if (this.f169243d) {
                                fM = this.f169244e - U0.f.m(j10);
                            } else {
                                fM = U0.f.m(j10);
                            }
                            this.f169245f.setValue(Boxing.c(fM - this.f169246g.getValue().floatValue()));
                            this.f169240a = 1;
                            if (interfaceC13893A.p1(this) == objF) {
                                return objF;
                            }
                        }
                    } catch (GestureCancellationException unused) {
                        this.f169245f.setValue(Boxing.c(0.0f));
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.j1$n$a$b */
            static final class b extends Lambda implements Function1<U0.f, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f169247f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC13929r f169248g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ z1<Function1<Float, Unit>> f169249h;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1", f = "Slider.kt", l = {1018}, m = "invokeSuspend")
                /* renamed from: x0.j1$n$a$b$a, reason: collision with other inner class name */
                static final class C2698a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f169250a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC13929r f169251b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<Function1<Float, Unit>> f169252c;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/n;", "", "<anonymous>", "(Lf0/n;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: x0.j1$n$a$b$a$a, reason: collision with other inner class name */
                    static final class C2699a extends SuspendLambda implements Function2<InterfaceC13925n, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f169253a;

                        /* renamed from: b, reason: collision with root package name */
                        private /* synthetic */ Object f169254b;

                        C2699a(Continuation<? super C2699a> continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C2699a c2699a = new C2699a(continuation);
                            c2699a.f169254b = obj;
                            return c2699a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: d, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(InterfaceC13925n interfaceC13925n, Continuation<? super Unit> continuation) {
                            return ((C2699a) create(interfaceC13925n, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.f169253a == 0) {
                                ResultKt.b(obj);
                                ((InterfaceC13925n) this.f169254b).a(0.0f);
                                return Unit.f143329a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2698a(InterfaceC13929r interfaceC13929r, z1<? extends Function1<? super Float, Unit>> z1Var, Continuation<? super C2698a> continuation) {
                        super(2, continuation);
                        this.f169251b = interfaceC13929r;
                        this.f169252c = z1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C2698a(this.f169251b, this.f169252c, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C2698a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f169250a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            InterfaceC13929r interfaceC13929r = this.f169251b;
                            EnumC13564E enumC13564E = EnumC13564E.f127648b;
                            C2699a c2699a = new C2699a(null);
                            this.f169250a = 1;
                            if (interfaceC13929r.a(enumC13564E, c2699a, this) == objF) {
                                return objF;
                            }
                        }
                        this.f169252c.getValue().invoke(Boxing.c(0.0f));
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(InterfaceC15783O interfaceC15783O, InterfaceC13929r interfaceC13929r, z1<? extends Function1<? super Float, Unit>> z1Var) {
                    super(1);
                    this.f169247f = interfaceC15783O;
                    this.f169248g = interfaceC13929r;
                    this.f169249h = z1Var;
                }

                public final void a(long j10) {
                    C15809k.d(this.f169247f, null, null, new C2698a(this.f169248g, this.f169249h, null), 3, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
                    a(fVar.getPackedValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(boolean z10, float f10, InterfaceC5872l0<Float> interfaceC5872l0, z1<Float> z1Var, InterfaceC15783O interfaceC15783O, InterfaceC13929r interfaceC13929r, z1<? extends Function1<? super Float, Unit>> z1Var2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f169233c = z10;
                this.f169234d = f10;
                this.f169235e = interfaceC5872l0;
                this.f169236f = z1Var;
                this.f169237g = interfaceC15783O;
                this.f169238h = interfaceC13929r;
                this.f169239i = z1Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f169233c, this.f169234d, this.f169235e, this.f169236f, this.f169237g, this.f169238h, this.f169239i, continuation);
                aVar.f169232b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
                return ((a) create(j10, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f169231a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    g1.J j10 = (g1.J) this.f169232b;
                    C2697a c2697a = new C2697a(this.f169233c, this.f169234d, this.f169235e, this.f169236f, null);
                    b bVar = new b(this.f169237g, this.f169238h, this.f169239i);
                    this.f169231a = 1;
                    if (C13904L.m(j10, null, null, c2697a, bVar, this, 3, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(boolean z10, InterfaceC13929r interfaceC13929r, h0.l lVar, float f10, boolean z11, InterfaceC5872l0<Float> interfaceC5872l0, z1<Float> z1Var, z1<? extends Function1<? super Float, Unit>> z1Var2) {
            super(3);
            this.f169223f = z10;
            this.f169224g = interfaceC13929r;
            this.f169225h = lVar;
            this.f169226i = f10;
            this.f169227j = z11;
            this.f169228k = interfaceC5872l0;
            this.f169229l = z1Var;
            this.f169230m = z1Var2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(1945228890);
            if (ComposerKt.M()) {
                ComposerKt.U(1945228890, i10, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:1002)");
            }
            if (this.f169223f) {
                composer.startReplaceGroup(-394118969);
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = J.k(EmptyCoroutineContext.f143553a, composer);
                    composer.t(objB);
                }
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB;
                Object[] objArr = {this.f169224g, this.f169225h, Float.valueOf(this.f169226i), Boolean.valueOf(this.f169227j)};
                boolean zA = composer.a(this.f169227j) | composer.b(this.f169226i) | composer.V(this.f169228k) | composer.V(this.f169229l) | composer.D(interfaceC15783O) | composer.D(this.f169224g) | composer.V(this.f169230m);
                boolean z10 = this.f169227j;
                float f10 = this.f169226i;
                InterfaceC5872l0<Float> interfaceC5872l0 = this.f169228k;
                z1<Float> z1Var = this.f169229l;
                InterfaceC13929r interfaceC13929r = this.f169224g;
                z1<Function1<Float, Unit>> z1Var2 = this.f169230m;
                Object objB2 = composer.B();
                if (zA || objB2 == companion.a()) {
                    Object aVar = new a(z10, f10, interfaceC5872l0, z1Var, interfaceC15783O, interfaceC13929r, z1Var2, null);
                    composer.t(aVar);
                    objB2 = aVar;
                }
                modifier = modifier.then(new SuspendPointerInputElement(null, null, objArr, new U.a((Function2) objB2), 3, null));
                composer.P();
            } else {
                composer.startReplaceGroup(-393026932);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifier;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float q(float f10, float f11, float f12) {
        float f13 = f11 - f10;
        float f14 = f13 == 0.0f ? 0.0f : (f12 - f10) / f13;
        float f15 = f14 >= 0.0f ? f14 : 0.0f;
        if (f15 > 1.0f) {
            return 1.0f;
        }
        return f15;
    }

    static {
        float fP = H1.h.p(48);
        f169093f = fP;
        float fP2 = H1.h.p(144);
        f169094g = fP2;
        f169095h = androidx.compose.foundation.layout.J.k(androidx.compose.foundation.layout.J.B(Modifier.INSTANCE, fP2, 0.0f, 2, null), 0.0f, fP, 1, null);
        f169096i = new n0<>(100, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1<? super Float, Float> function1, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, InterfaceC5872l0<Float> interfaceC5872l0, float f10, Composer composer, int i10) {
        int i11;
        float f11;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-743965752);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(function1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(closedFloatingPointRange) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(closedFloatingPointRange2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.V(interfaceC5872l0) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            f11 = f10;
            i11 |= composerStartRestartGroup.b(f11) ? 16384 : 8192;
        } else {
            f11 = f10;
        }
        if (composerStartRestartGroup.p((i11 & 9363) != 9362, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-743965752, i11, -1, "androidx.compose.material.CorrectValueSideEffect (Slider.kt:929)");
            }
            boolean z10 = ((i11 & 112) == 32) | ((i11 & 14) == 4) | ((57344 & i11) == 16384) | ((i11 & 7168) == 2048) | ((i11 & 896) == 256);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                i12 = 0;
                a aVar = new a(closedFloatingPointRange, function1, f11, interfaceC5872l0, closedFloatingPointRange2);
                composerStartRestartGroup.t(aVar);
                objB = aVar;
            } else {
                i12 = 0;
            }
            J.i((Function0) objB, composerStartRestartGroup, i12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(function1, closedFloatingPointRange, closedFloatingPointRange2, interfaceC5872l0, f10, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(float r39, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r40, androidx.compose.ui.Modifier r41, boolean r42, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r43, int r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, h0.l r46, kotlin.InterfaceC18005g1 r47, androidx.compose.runtime.Composer r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C18014j1.b(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, h0.l, x0.g1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z10, float f10, List<Float> list, InterfaceC18005g1 interfaceC18005g1, float f11, h0.l lVar, Modifier modifier, Composer composer, int i10) {
        boolean z11;
        int i11;
        List<Float> list2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1679682785);
        if ((i10 & 6) == 0) {
            z11 = z10;
            i11 = (composerStartRestartGroup.a(z11) ? 4 : 2) | i10;
        } else {
            z11 = z10;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.b(f10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            list2 = list;
            i11 |= composerStartRestartGroup.D(list2) ? 256 : 128;
        } else {
            list2 = list;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.V(interfaceC18005g1) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.b(f11) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.V(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 1048576 : 524288;
        }
        int i12 = i11;
        if (composerStartRestartGroup.p((599187 & i12) != 599186, i12 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(1679682785, i12, -1, "androidx.compose.material.SliderImpl (Slider.kt:685)");
            }
            Modifier modifierThen = modifier.then(f169095h);
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierThen);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            float fI1 = dVar.I1(f169092e);
            float f12 = f169088a;
            float fI12 = dVar.I1(f12);
            float fL = dVar.L(f11);
            float fP = H1.h.p(f12 * 2);
            float fP2 = H1.h.p(fL * f10);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i13 = i12 >> 6;
            int i14 = i12 << 9;
            e(androidx.compose.foundation.layout.J.f(companion2, 0.0f, 1, null), interfaceC18005g1, z11, 0.0f, f10, list2, fI12, fI1, composerStartRestartGroup, (i14 & 458752) | ((i12 << 6) & 896) | (i13 & 112) | 3078 | (i14 & 57344));
            d(c5806j, companion2, fP2, lVar, interfaceC18005g1, z10, fP, composerStartRestartGroup, (i13 & 7168) | 1572918 | ((i12 << 3) & 57344) | ((i12 << 15) & 458752));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new e(z10, f10, list, interfaceC18005g1, f11, lVar, modifier, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC14898b interfaceC14898b, Modifier modifier, float f10, h0.l lVar, InterfaceC18005g1 interfaceC18005g1, boolean z10, float f11, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(428907178);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.V(interfaceC14898b) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.b(f10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.V(lVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.V(interfaceC18005g1) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.b(f11) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.p((599187 & i11) != 599186, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(428907178, i11, -1, "androidx.compose.material.SliderThumb (Slider.kt:789)");
            }
            Modifier modifierM = D.m(Modifier.INSTANCE, f10, 0.0f, 0.0f, 0.0f, 14, null);
            e.Companion companion = P0.e.INSTANCE;
            Modifier modifierG = interfaceC14898b.g(modifierM, companion.h());
            MeasurePolicy measurePolicyG = C5804h.g(companion.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierG);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5806j c5806j = C5806j.f48836a;
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objB == companion3.a()) {
                objB = o1.f();
                composerStartRestartGroup.t(objB);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objB;
            boolean z11 = (i11 & 7168) == 2048;
            Object objB2 = composerStartRestartGroup.B();
            if (z11 || objB2 == companion3.a()) {
                objB2 = new f(lVar, snapshotStateList, null);
                composerStartRestartGroup.t(objB2);
            }
            int i12 = i11 >> 9;
            J.g(lVar, (Function2) objB2, composerStartRestartGroup, i12 & 14);
            float fP = !snapshotStateList.isEmpty() ? f169091d : f169090c;
            Modifier modifierB = androidx.compose.foundation.h.b(androidx.compose.foundation.j.b(androidx.compose.foundation.layout.J.w(modifier, f11, f11), lVar, C17982Y0.f(false, f169089b, 0L, 4, null)), lVar, false, 2, null);
            if (!z10) {
                fP = H1.h.p(0);
            }
            C14890K.a(androidx.compose.foundation.b.c(T0.l.b(modifierB, fP, C16806i.f(), false, 0L, 0L, 24, null), interfaceC18005g1.c(z10, composerStartRestartGroup, ((i11 >> 15) & 14) | (i12 & 112)).getValue().getValue(), C16806i.f()), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new g(interfaceC14898b, modifier, f10, lVar, interfaceC18005g1, z10, f11, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Modifier modifier, InterfaceC18005g1 interfaceC18005g1, boolean z10, float f10, float f11, List<Float> list, float f12, float f13, Composer composer, int i10) {
        int i11;
        float f14;
        float f15;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1833126050);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.V(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(interfaceC18005g1) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.b(f10) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            f14 = f11;
            i11 |= composerStartRestartGroup.b(f14) ? 16384 : 8192;
        } else {
            f14 = f11;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(list) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            f15 = f12;
            i11 |= composerStartRestartGroup.b(f15) ? 1048576 : 524288;
        } else {
            f15 = f12;
        }
        if ((12582912 & i10) == 0) {
            i11 |= composerStartRestartGroup.b(f13) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.p((i11 & 4793491) != 4793490, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(1833126050, i11, -1, "androidx.compose.material.Track (Slider.kt:835)");
            }
            int i13 = ((i11 >> 6) & 14) | 48 | ((i11 << 3) & 896);
            z1<C5489q0> z1VarA = interfaceC18005g1.a(z10, false, composerStartRestartGroup, i13);
            z1<C5489q0> z1VarA2 = interfaceC18005g1.a(z10, true, composerStartRestartGroup, i13);
            z1<C5489q0> z1VarB = interfaceC18005g1.b(z10, false, composerStartRestartGroup, i13);
            z1<C5489q0> z1VarB2 = interfaceC18005g1.b(z10, true, composerStartRestartGroup, i13);
            boolean zV = ((29360128 & i11) == 8388608) | ((i11 & 3670016) == 1048576) | composerStartRestartGroup.V(z1VarA) | ((57344 & i11) == 16384) | ((i11 & 7168) == 2048) | composerStartRestartGroup.V(z1VarA2) | composerStartRestartGroup.D(list) | composerStartRestartGroup.V(z1VarB) | composerStartRestartGroup.V(z1VarB2);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                i12 = i11;
                Object hVar = new h(f15, z1VarA, f13, f14, f10, z1VarA2, list, z1VarB, z1VarB2);
                composerStartRestartGroup.t(hVar);
                objB = hVar;
            } else {
                i12 = i11;
            }
            C13576j.a(modifier, (Function1) objB, composerStartRestartGroup, i12 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new i(modifier, interfaceC18005g1, z10, f10, f11, list, f12, f13, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object p(InterfaceC13929r interfaceC13929r, float f10, float f11, float f12, Continuation<? super Unit> continuation) {
        Object objB = InterfaceC13929r.b(interfaceC13929r, null, new j(f10, f11, f12, null), continuation, 1, null);
        return objB == IntrinsicsKt.f() ? objB : Unit.f143329a;
    }

    public static final float r() {
        return f169088a;
    }

    private static final Modifier t(Modifier modifier, boolean z10, int i10, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f10, boolean z11, z1<? extends Function1<? super Float, Unit>> z1Var, z1<? extends Function0<Unit>> z1Var2) {
        if (i10 >= 0) {
            return androidx.compose.ui.input.key.b.a(modifier, new k(z10, closedFloatingPointRange, i10, z1Var, f10, z11, z1Var2));
        }
        throw new IllegalArgumentException("steps should be >= 0");
    }

    private static final List<Float> x(int i10) {
        if (i10 == 0) {
            return CollectionsKt.m();
        }
        int i11 = i10 + 2;
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Float.valueOf(i12 / (i10 + 1)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float s(float f10, float f11, float f12, float f13, float f14) {
        return J1.b.b(f13, f14, q(f10, f11, f12));
    }

    private static final Modifier u(Modifier modifier, float f10, boolean z10, Function1<? super Float, Unit> function1, Function0<Unit> function0, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10) {
        return Q.b(C16819m.d(modifier, false, new l(z10, closedFloatingPointRange, i10, RangesKt.n(f10, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue()), function1, function0), 1, null), f10, closedFloatingPointRange, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier v(Modifier modifier, InterfaceC13929r interfaceC13929r, h0.l lVar, float f10, boolean z10, z1<Float> z1Var, z1<? extends Function1<? super Float, Unit>> z1Var2, InterfaceC5872l0<Float> interfaceC5872l0, boolean z11) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new m(interfaceC13929r, lVar, f10, z10, z1Var, z1Var2, interfaceC5872l0, z11);
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier, function1A, new n(z11, interfaceC13929r, lVar, f10, z10, interfaceC5872l0, z1Var, z1Var2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float w(float f10, List<Float> list, float f11, float f12) {
        Float f13;
        if (list.isEmpty()) {
            f13 = null;
        } else {
            Float f14 = list.get(0);
            float fAbs = Math.abs(J1.b.b(f11, f12, f14.floatValue()) - f10);
            int iO = CollectionsKt.o(list);
            int i10 = 1;
            if (1 <= iO) {
                while (true) {
                    Float f15 = list.get(i10);
                    float fAbs2 = Math.abs(J1.b.b(f11, f12, f15.floatValue()) - f10);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f14 = f15;
                        fAbs = fAbs2;
                    }
                    if (i10 == iO) {
                        break;
                    }
                    i10++;
                }
            }
            f13 = f14;
        }
        Float f16 = f13;
        if (f16 != null) {
            return J1.b.b(f11, f12, f16.floatValue());
        }
        return f10;
    }
}
