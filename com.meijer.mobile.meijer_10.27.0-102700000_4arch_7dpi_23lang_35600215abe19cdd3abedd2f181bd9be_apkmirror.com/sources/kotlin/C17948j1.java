package kotlin;

import H1.t;
import M0.SnapshotStateList;
import P0.e;
import V0.C5346q0;
import V0.F1;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.GestureCancellationException;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.A0;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5724i0;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import androidx.recyclerview.widget.RecyclerView;
import d0.C13443j;
import d0.EnumC13431E;
import d0.Q;
import e1.C13601a;
import e1.C13602b;
import e1.C13603c;
import e1.C13604d;
import g1.U;
import h0.C14321a;
import h0.C14322b;
import h0.C14323c;
import h0.n;
import j0.C14802K;
import j0.InterfaceC14810b;
import j0.InterfaceC14812d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C13794L;
import kotlin.C13818q;
import kotlin.C6313a;
import kotlin.C6315b;
import kotlin.C6330m;
import kotlin.EnumC13827z;
import kotlin.InterfaceC13783A;
import kotlin.InterfaceC13815n;
import kotlin.InterfaceC13819r;
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
import qv.C16648k;
import qv.InterfaceC16622O;
import r0.C16692i;
import r1.C16705m;
import r1.s;
import r1.u;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000p\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0081\u0001\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aq\u0010\u0019\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00072\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00020\u00162\u0014\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r0\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aM\u0010\u001f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u001c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u001f\u0010 \u001aF\u0010%\u001a\u00020\u0003*\u00020!2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\"H\u0003ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aU\u0010+\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u001c2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0000H\u0003¢\u0006\u0004\b+\u0010,\u001a5\u00100\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u001c2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0000H\u0002¢\u0006\u0004\b0\u00101\u001a\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u00000\u001c2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u00103\u001a7\u00109\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0000H\u0002¢\u0006\u0004\b9\u0010:\u001a'\u0010=\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0000H\u0002¢\u0006\u0004\b=\u0010>\u001aU\u0010;\u001a\u00020\u00032\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00000A2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b;\u0010C\u001ac\u0010D\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bD\u0010E\u001aq\u0010K\u001a\u00020\u0005*\u00020\u00052\u0006\u0010G\u001a\u00020F2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00072\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\u0018\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00020\u00162\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00000A2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bK\u0010L\u001a0\u0010O\u001a\u00020\u00032\u0006\u0010G\u001a\u00020F2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u0000H\u0082@¢\u0006\u0004\bO\u0010P\"\u001a\u0010T\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010Q\u001a\u0004\bR\u0010S\"\u0014\u0010U\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010Q\"\u0014\u0010V\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010Q\"\u0014\u0010W\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010Q\"\u001a\u0010Y\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010Q\u001a\u0004\bX\u0010S\"\u0014\u0010[\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010Q\"\u0014\u0010]\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010Q\"\u0014\u0010`\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_\"\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00000a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006e"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Lh0/l;", "interactionSource", "Lx0/g1;", "colors", "b", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Lh0/l;Lx0/g1;Landroidx/compose/runtime/Composer;II)V", "isRtl", "Landroidx/compose/runtime/z1;", "onValueChangeState", "onValueChangeFinishedState", "t", "(Landroidx/compose/ui/Modifier;ZILkotlin/ranges/ClosedFloatingPointRange;FZLandroidx/compose/runtime/z1;Landroidx/compose/runtime/z1;)Landroidx/compose/ui/Modifier;", "positionFraction", "", "tickFractions", "width", "c", "(ZFLjava/util/List;Lx0/g1;FLh0/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lj0/b;", "LH1/h;", "offset", "thumbSize", "d", "(Lj0/b;Landroidx/compose/ui/Modifier;FLh0/l;Lx0/g1;ZFLandroidx/compose/runtime/Composer;I)V", "positionFractionStart", "positionFractionEnd", "thumbPx", "trackStrokeWidth", "e", "(Landroidx/compose/ui/Modifier;Lx0/g1;ZFFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V", "current", "minPx", "maxPx", "w", "(FLjava/util/List;FF)F", "x", "(I)Ljava/util/List;", "a1", "b1", "x1", "a2", "b2", "s", "(FFFFF)F", "a", "pos", "q", "(FFF)F", "scaleToOffset", "trackRange", "Landroidx/compose/runtime/l0;", "valueState", "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/l0;FLandroidx/compose/runtime/Composer;I)V", "u", "(Landroidx/compose/ui/Modifier;FZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;", "Lf0/r;", "draggableState", "rawOffset", "gestureEndAction", "pressOffset", "v", "(Landroidx/compose/ui/Modifier;Lf0/r;Lh0/l;FZLandroidx/compose/runtime/z1;Landroidx/compose/runtime/z1;Landroidx/compose/runtime/l0;Z)Landroidx/compose/ui/Modifier;", "target", "velocity", "p", "(Lf0/r;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "F", "r", "()F", "ThumbRadius", "ThumbRippleRadius", "ThumbDefaultElevation", "ThumbPressedElevation", "getTrackHeight", "TrackHeight", "f", "SliderHeight", "g", "SliderMinWidth", "h", "Landroidx/compose/ui/Modifier;", "DefaultSliderConstraints", "Lc0/n0;", "i", "Lc0/n0;", "SliderToTickAnimation", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17948j1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f168000a = H1.h.p(10);

    /* renamed from: b, reason: collision with root package name */
    private static final float f168001b = H1.h.p(24);

    /* renamed from: c, reason: collision with root package name */
    private static final float f168002c = H1.h.p(1);

    /* renamed from: d, reason: collision with root package name */
    private static final float f168003d = H1.h.p(6);

    /* renamed from: e, reason: collision with root package name */
    private static final float f168004e = H1.h.p(4);

    /* renamed from: f, reason: collision with root package name */
    private static final float f168005f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f168006g;

    /* renamed from: h, reason: collision with root package name */
    private static final Modifier f168007h;

    /* renamed from: i, reason: collision with root package name */
    private static final n0<Float> f168008i;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.j1$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f168009f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Float> f168010g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f168011h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Float> f168012i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f168013j;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super Float, Float> function1, float f10, InterfaceC5730l0<Float> interfaceC5730l0, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
            super(0);
            this.f168009f = closedFloatingPointRange;
            this.f168010g = function1;
            this.f168011h = f10;
            this.f168012i = interfaceC5730l0;
            this.f168013j = closedFloatingPointRange2;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            float fFloatValue = (this.f168009f.getEndInclusive().floatValue() - this.f168009f.getStart().floatValue()) / 1000;
            float fFloatValue2 = this.f168010g.invoke(Float.valueOf(this.f168011h)).floatValue();
            if (Math.abs(fFloatValue2 - this.f168012i.getValue().floatValue()) <= fFloatValue || !this.f168013j.contains(this.f168012i.getValue())) {
                return;
            }
            this.f168012i.setValue(Float.valueOf(fFloatValue2));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.j1$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Float> f168014f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f168015g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f168016h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Float> f168017i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f168018j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f168019k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Float, Float> function1, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, InterfaceC5730l0<Float> interfaceC5730l0, float f10, int i10) {
            super(2);
            this.f168014f = function1;
            this.f168015g = closedFloatingPointRange;
            this.f168016h = closedFloatingPointRange2;
            this.f168017i = interfaceC5730l0;
            this.f168018j = f10;
            this.f168019k = i10;
        }

        public final void a(Composer composer, int i10) {
            C17948j1.a(this.f168014f, this.f168015g, this.f168016h, this.f168017i, this.f168018j, composer, J0.a(this.f168019k | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj0/d;", "", "c", "(Lj0/d;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.j1$c */
    static final class c extends Lambda implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f168020f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f168021g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<Float> f168022h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168023i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ h0.l f168024j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f168025k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC17939g1 f168026l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ z1<Function1<Float, Unit>> f168027m;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: x0.j1$c$a */
        /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Float, Float> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ClosedFloatingPointRange<Float> f168028b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f168029c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f168030d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2) {
                super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
                this.f168028b = closedFloatingPointRange;
                this.f168029c = floatRef;
                this.f168030d = floatRef2;
            }

            public final Float a(float f10) {
                return Float.valueOf(c.d(this.f168028b, this.f168029c, this.f168030d, f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return a(f10.floatValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lqv/O;", "", "velocity", "", "<anonymous>", "(Lqv/O;F)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$2$drag$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
        /* renamed from: x0.j1$c$b */
        static final class b extends SuspendLambda implements Function3<InterfaceC16622O, Float, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f168031a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ float f168032b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<Function1<Float, Unit>> f168033c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(z1<? extends Function1<? super Float, Unit>> z1Var, Continuation<? super b> continuation) {
                super(3, continuation);
                this.f168033c = z1Var;
            }

            public final Object d(InterfaceC16622O interfaceC16622O, float f10, Continuation<? super Unit> continuation) {
                b bVar = new b(this.f168033c, continuation);
                bVar.f168032b = f10;
                return bVar.invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Float f10, Continuation<? super Unit> continuation) {
                return d(interfaceC16622O, f10.floatValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f168031a == 0) {
                    ResultKt.b(obj);
                    this.f168033c.getValue().invoke(Boxing.c(this.f168032b));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "b", "(F)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.j1$c$c, reason: collision with other inner class name */
        static final class C2672c extends Lambda implements Function1<Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5724i0 f168034f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5724i0 f168035g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f168036h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f168037i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ z1<Function1<Float, Unit>> f168038j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ ClosedFloatingPointRange<Float> f168039k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2672c(InterfaceC5724i0 interfaceC5724i0, InterfaceC5724i0 interfaceC5724i02, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, z1<? extends Function1<? super Float, Unit>> z1Var, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
                super(1);
                this.f168034f = interfaceC5724i0;
                this.f168035g = interfaceC5724i02;
                this.f168036h = floatRef;
                this.f168037i = floatRef2;
                this.f168038j = z1Var;
                this.f168039k = closedFloatingPointRange;
            }

            public final void b(float f10) {
                InterfaceC5724i0 interfaceC5724i0 = this.f168034f;
                interfaceC5724i0.B(interfaceC5724i0.b() + f10 + this.f168035g.b());
                this.f168035g.B(0.0f);
                this.f168038j.getValue().invoke(Float.valueOf(c.e(this.f168036h, this.f168037i, this.f168039k, RangesKt.n(this.f168034f.b(), this.f168036h.f142832a, this.f168037i.f142832a))));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                b(f10.floatValue());
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "velocity", "", "b", "(F)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.j1$c$d */
        static final class d extends Lambda implements Function1<Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5724i0 f168040f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<Float> f168041g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f168042h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f168043i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f168044j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ C17945i1 f168045k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f168046l;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.SliderKt$Slider$2$gestureEndAction$1$1$1", f = "Slider.kt", l = {235}, m = "invokeSuspend")
            /* renamed from: x0.j1$c$d$a */
            static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f168047a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17945i1 f168048b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ float f168049c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ float f168050d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ float f168051e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function0<Unit> f168052f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C17945i1 c17945i1, float f10, float f11, float f12, Function0<Unit> function0, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f168048b = c17945i1;
                    this.f168049c = f10;
                    this.f168050d = f11;
                    this.f168051e = f12;
                    this.f168052f = function0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f168048b, this.f168049c, this.f168050d, this.f168051e, this.f168052f, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f168047a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17945i1 c17945i1 = this.f168048b;
                        float f10 = this.f168049c;
                        float f11 = this.f168050d;
                        float f12 = this.f168051e;
                        this.f168047a = 1;
                        if (C17948j1.p(c17945i1, f10, f11, f12, this) == objF) {
                            return objF;
                        }
                    }
                    Function0<Unit> function0 = this.f168052f;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(InterfaceC5724i0 interfaceC5724i0, List<Float> list, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, InterfaceC16622O interfaceC16622O, C17945i1 c17945i1, Function0<Unit> function0) {
                super(1);
                this.f168040f = interfaceC5724i0;
                this.f168041g = list;
                this.f168042h = floatRef;
                this.f168043i = floatRef2;
                this.f168044j = interfaceC16622O;
                this.f168045k = c17945i1;
                this.f168046l = function0;
            }

            public final void b(float f10) {
                Function0<Unit> function0;
                float fB = this.f168040f.b();
                float fW = C17948j1.w(fB, this.f168041g, this.f168042h.f142832a, this.f168043i.f142832a);
                if (fB != fW) {
                    C16648k.d(this.f168044j, null, null, new a(this.f168045k, fB, fW, f10, this.f168046l, null), 3, null);
                } else {
                    if (this.f168045k.g() || (function0 = this.f168046l) == null) {
                        return;
                    }
                    function0.invoke();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                b(f10.floatValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f10, List<Float> list, Function0<Unit> function0, h0.l lVar, boolean z10, InterfaceC17939g1 interfaceC17939g1, z1<? extends Function1<? super Float, Unit>> z1Var) {
            super(3);
            this.f168020f = closedFloatingPointRange;
            this.f168021g = f10;
            this.f168022h = list;
            this.f168023i = function0;
            this.f168024j = lVar;
            this.f168025k = z10;
            this.f168026l = interfaceC17939g1;
            this.f168027m = z1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float e(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f10) {
            return C17948j1.s(floatRef.f142832a, floatRef2.f142832a, f10, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        }

        public final void c(InterfaceC14812d interfaceC14812d, Composer composer, int i10) {
            InterfaceC14812d interfaceC14812d2;
            int i11;
            InterfaceC5724i0 interfaceC5724i0;
            Ref.FloatRef floatRef;
            Ref.FloatRef floatRef2;
            C17945i1 c17945i1;
            Ref.FloatRef floatRef3;
            Ref.FloatRef floatRef4;
            if ((i10 & 6) == 0) {
                interfaceC14812d2 = interfaceC14812d;
                i11 = i10 | (composer.V(interfaceC14812d2) ? 4 : 2);
            } else {
                interfaceC14812d2 = interfaceC14812d;
                i11 = i10;
            }
            if (!composer.p((i11 & 19) != 18, i11 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2085116814, i11, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:196)");
            }
            boolean z10 = composer.o(C5892t0.m()) == t.f12007b;
            float fL = H1.b.l(interfaceC14812d2.getConstraints());
            Ref.FloatRef floatRef5 = new Ref.FloatRef();
            Ref.FloatRef floatRef6 = new Ref.FloatRef();
            H1.d dVar = (H1.d) composer.o(C5892t0.g());
            floatRef5.f142832a = Math.max(fL - dVar.I1(C17948j1.r()), 0.0f);
            floatRef6.f142832a = Math.min(dVar.I1(C17948j1.r()), floatRef5.f142832a);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB);
            }
            InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB;
            float f10 = this.f168021g;
            ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f168020f;
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = A0.a(d(closedFloatingPointRange, floatRef6, floatRef5, f10));
                composer.t(objB2);
            }
            InterfaceC5724i0 interfaceC5724i02 = (InterfaceC5724i0) objB2;
            Object objB3 = composer.B();
            if (objB3 == companion.a()) {
                objB3 = A0.a(0.0f);
                composer.t(objB3);
            }
            InterfaceC5724i0 interfaceC5724i03 = (InterfaceC5724i0) objB3;
            boolean zB = composer.b(floatRef6.f142832a) | composer.b(floatRef5.f142832a) | composer.V(this.f168020f);
            z1<Function1<Float, Unit>> z1Var = this.f168027m;
            ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.f168020f;
            Object objB4 = composer.B();
            if (zB || objB4 == companion.a()) {
                interfaceC5724i0 = interfaceC5724i03;
                floatRef = floatRef6;
                floatRef2 = floatRef5;
                objB4 = new C17945i1(new C2672c(interfaceC5724i02, interfaceC5724i03, floatRef6, floatRef5, z1Var, closedFloatingPointRange2));
                composer.t(objB4);
            } else {
                floatRef2 = floatRef5;
                floatRef = floatRef6;
                interfaceC5724i0 = interfaceC5724i03;
            }
            C17945i1 c17945i12 = (C17945i1) objB4;
            boolean zV = composer.V(this.f168020f) | composer.b(floatRef.f142832a) | composer.b(floatRef2.f142832a);
            ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.f168020f;
            Object objB5 = composer.B();
            if (zV || objB5 == companion.a()) {
                objB5 = new a(closedFloatingPointRange3, floatRef, floatRef2);
                composer.t(objB5);
            }
            C17948j1.a((Function1) ((KFunction) objB5), this.f168020f, RangesKt.b(floatRef.f142832a, floatRef2.f142832a), interfaceC5724i02, this.f168021g, composer, 3072);
            boolean zD = composer.D(this.f168022h) | composer.b(floatRef.f142832a) | composer.b(floatRef2.f142832a) | composer.D(interfaceC16622O) | composer.D(c17945i12) | composer.V(this.f168023i);
            List<Float> list = this.f168022h;
            Function0<Unit> function0 = this.f168023i;
            Object objB6 = composer.B();
            if (zD || objB6 == companion.a()) {
                c17945i1 = c17945i12;
                Ref.FloatRef floatRef7 = floatRef2;
                Ref.FloatRef floatRef8 = floatRef;
                Object dVar2 = new d(interfaceC5724i02, list, floatRef8, floatRef7, interfaceC16622O, c17945i1, function0);
                floatRef3 = floatRef8;
                floatRef4 = floatRef7;
                composer.t(dVar2);
                objB6 = dVar2;
            } else {
                floatRef4 = floatRef2;
                floatRef3 = floatRef;
                c17945i1 = c17945i12;
            }
            z1 z1VarP = o1.p((Function1) objB6, composer, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierV = C17948j1.v(companion2, c17945i1, this.f168024j, fL, z10, interfaceC5724i02, z1VarP, interfaceC5724i0, this.f168025k);
            EnumC13827z enumC13827z = EnumC13827z.f130586b;
            boolean zG = c17945i1.g();
            boolean z11 = this.f168025k;
            boolean z12 = z10;
            h0.l lVar = this.f168024j;
            boolean zV2 = composer.V(z1VarP);
            Object objB7 = composer.B();
            if (zV2 || objB7 == companion.a()) {
                objB7 = new b(z1VarP, null);
                composer.t(objB7);
            }
            C17948j1.c(this.f168025k, C17948j1.q(this.f168020f.getStart().floatValue(), this.f168020f.getEndInclusive().floatValue(), RangesKt.n(this.f168021g, this.f168020f.getStart().floatValue(), this.f168020f.getEndInclusive().floatValue())), this.f168022h, this.f168026l, floatRef4.f142832a - floatRef3.f142832a, this.f168024j, modifierV.then(C13818q.h(companion2, c17945i1, enumC13827z, z11, lVar, zG, null, (Function3) objB7, z12, 32, null)), composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14812d interfaceC14812d, Composer composer, Integer num) {
            c(interfaceC14812d, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float d(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f10) {
            return C17948j1.s(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f10, floatRef.f142832a, floatRef2.f142832a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.j1$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f168053f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Unit> f168054g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f168055h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f168056i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f168057j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f168058k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168059l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ h0.l f168060m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC17939g1 f168061n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f168062o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f168063p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(float f10, Function1<? super Float, Unit> function1, Modifier modifier, boolean z10, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10, Function0<Unit> function0, h0.l lVar, InterfaceC17939g1 interfaceC17939g1, int i11, int i12) {
            super(2);
            this.f168053f = f10;
            this.f168054g = function1;
            this.f168055h = modifier;
            this.f168056i = z10;
            this.f168057j = closedFloatingPointRange;
            this.f168058k = i10;
            this.f168059l = function0;
            this.f168060m = lVar;
            this.f168061n = interfaceC17939g1;
            this.f168062o = i11;
            this.f168063p = i12;
        }

        public final void a(Composer composer, int i10) {
            C17948j1.b(this.f168053f, this.f168054g, this.f168055h, this.f168056i, this.f168057j, this.f168058k, this.f168059l, this.f168060m, this.f168061n, composer, J0.a(this.f168062o | 1), this.f168063p);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.j1$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f168064f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f168065g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<Float> f168066h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC17939g1 f168067i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f168068j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ h0.l f168069k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Modifier f168070l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f168071m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, float f10, List<Float> list, InterfaceC17939g1 interfaceC17939g1, float f11, h0.l lVar, Modifier modifier, int i10) {
            super(2);
            this.f168064f = z10;
            this.f168065g = f10;
            this.f168066h = list;
            this.f168067i = interfaceC17939g1;
            this.f168068j = f11;
            this.f168069k = lVar;
            this.f168070l = modifier;
            this.f168071m = i10;
        }

        public final void a(Composer composer, int i10) {
            C17948j1.c(this.f168064f, this.f168065g, this.f168066h, this.f168067i, this.f168068j, this.f168069k, this.f168070l, composer, J0.a(this.f168071m | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$SliderThumb$1$1$1", f = "Slider.kt", l = {794}, m = "invokeSuspend")
    /* renamed from: x0.j1$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f168072a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.l f168073b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<h0.i> f168074c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/i;", "interaction", "", "a", "(Lh0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.j1$f$a */
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<h0.i> f168075a;

            a(SnapshotStateList<h0.i> snapshotStateList) {
                this.f168075a = snapshotStateList;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(h0.i iVar, Continuation<? super Unit> continuation) {
                if (iVar instanceof n.b) {
                    this.f168075a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f168075a.remove(((n.c) iVar).getPress());
                } else if (iVar instanceof n.a) {
                    this.f168075a.remove(((n.a) iVar).getPress());
                } else if (iVar instanceof C14322b) {
                    this.f168075a.add(iVar);
                } else if (iVar instanceof C14323c) {
                    this.f168075a.remove(((C14323c) iVar).getStart());
                } else if (iVar instanceof C14321a) {
                    this.f168075a.remove(((C14321a) iVar).getStart());
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(h0.l lVar, SnapshotStateList<h0.i> snapshotStateList, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f168073b = lVar;
            this.f168074c = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f168073b, this.f168074c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f168072a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f<h0.i> interfaceC17152fB = this.f168073b.b();
                a aVar = new a(this.f168074c);
                this.f168072a = 1;
                if (interfaceC17152fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.j1$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC14810b f168076f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168077g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f168078h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h0.l f168079i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC17939g1 f168080j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f168081k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f168082l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f168083m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC14810b interfaceC14810b, Modifier modifier, float f10, h0.l lVar, InterfaceC17939g1 interfaceC17939g1, boolean z10, float f11, int i10) {
            super(2);
            this.f168076f = interfaceC14810b;
            this.f168077g = modifier;
            this.f168078h = f10;
            this.f168079i = lVar;
            this.f168080j = interfaceC17939g1;
            this.f168081k = z10;
            this.f168082l = f11;
            this.f168083m = i10;
        }

        public final void a(Composer composer, int i10) {
            C17948j1.d(this.f168076f, this.f168077g, this.f168078h, this.f168079i, this.f168080j, this.f168081k, this.f168082l, composer, J0.a(this.f168083m | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.j1$h */
    static final class h extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f168084f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<C5346q0> f168085g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f168086h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f168087i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f168088j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ z1<C5346q0> f168089k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ List<Float> f168090l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ z1<C5346q0> f168091m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ z1<C5346q0> f168092n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f10, z1<C5346q0> z1Var, float f11, float f12, float f13, z1<C5346q0> z1Var2, List<Float> list, z1<C5346q0> z1Var3, z1<C5346q0> z1Var4) {
            super(1);
            this.f168084f = f10;
            this.f168085g = z1Var;
            this.f168086h = f11;
            this.f168087i = f12;
            this.f168088j = f13;
            this.f168089k = z1Var2;
            this.f168090l = list;
            this.f168091m = z1Var3;
            this.f168092n = z1Var4;
        }

        public final void a(X0.f fVar) {
            boolean z10 = fVar.getLayoutDirection() == t.f12007b;
            long jA = U0.g.a(this.f168084f, U0.f.n(fVar.Q1()));
            long jA2 = U0.g.a(U0.k.i(fVar.b()) - this.f168084f, U0.f.n(fVar.Q1()));
            long j10 = z10 ? jA2 : jA;
            long j11 = z10 ? jA : jA2;
            long value = this.f168085g.getValue().getValue();
            float f10 = this.f168086h;
            F1.Companion companion = F1.INSTANCE;
            X0.f.O0(fVar, value, j10, j11, f10, companion.b(), null, 0.0f, null, 0, 480, null);
            X0.f.O0(fVar, this.f168089k.getValue().getValue(), U0.g.a(U0.f.m(j10) + ((U0.f.m(j11) - U0.f.m(j10)) * this.f168088j), U0.f.n(fVar.Q1())), U0.g.a(U0.f.m(j10) + ((U0.f.m(j11) - U0.f.m(j10)) * this.f168087i), U0.f.n(fVar.Q1())), this.f168086h, companion.b(), null, 0.0f, null, 0, 480, null);
            List<Float> list = this.f168090l;
            float f11 = this.f168087i;
            float f12 = this.f168088j;
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
            z1<C5346q0> z1Var = this.f168091m;
            z1<C5346q0> z1Var2 = this.f168092n;
            float f13 = this.f168086h;
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
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.j1$i */
    static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f168093f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC17939g1 f168094g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f168095h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f168096i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f168097j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ List<Float> f168098k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f168099l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f168100m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f168101n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Modifier modifier, InterfaceC17939g1 interfaceC17939g1, boolean z10, float f10, float f11, List<Float> list, float f12, float f13, int i10) {
            super(2);
            this.f168093f = modifier;
            this.f168094g = interfaceC17939g1;
            this.f168095h = z10;
            this.f168096i = f10;
            this.f168097j = f11;
            this.f168098k = list;
            this.f168099l = f12;
            this.f168100m = f13;
            this.f168101n = i10;
        }

        public final void a(Composer composer, int i10) {
            C17948j1.e(this.f168093f, this.f168094g, this.f168095h, this.f168096i, this.f168097j, this.f168098k, this.f168099l, this.f168100m, composer, J0.a(this.f168101n | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/n;", "", "<anonymous>", "(Lf0/n;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", l = {1053}, m = "invokeSuspend")
    /* renamed from: x0.j1$j */
    static final class j extends SuspendLambda implements Function2<InterfaceC13815n, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f168102a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f168103b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f168104c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f168105d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f168106e;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/a;", "", "Lc0/m;", "", "a", "(Lc0/a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.j1$j$a */
        static final class a extends Lambda implements Function1<C6313a<Float, C6330m>, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC13815n f168107f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Ref.FloatRef f168108g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC13815n interfaceC13815n, Ref.FloatRef floatRef) {
                super(1);
                this.f168107f = interfaceC13815n;
                this.f168108g = floatRef;
            }

            public final void a(C6313a<Float, C6330m> c6313a) {
                this.f168107f.a(c6313a.m().floatValue() - this.f168108g.f142832a);
                this.f168108g.f142832a = c6313a.m().floatValue();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C6313a<Float, C6330m> c6313a) {
                a(c6313a);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(float f10, float f11, float f12, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f168104c = f10;
            this.f168105d = f11;
            this.f168106e = f12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            j jVar = new j(this.f168104c, this.f168105d, this.f168106e, continuation);
            jVar.f168103b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13815n interfaceC13815n, Continuation<? super Unit> continuation) {
            return ((j) create(interfaceC13815n, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f168102a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC13815n interfaceC13815n = (InterfaceC13815n) this.f168103b;
                Ref.FloatRef floatRef = new Ref.FloatRef();
                float f10 = this.f168104c;
                floatRef.f142832a = f10;
                C6313a c6313aB = C6315b.b(f10, 0.0f, 2, null);
                Float fC = Boxing.c(this.f168105d);
                n0 n0Var = C17948j1.f168008i;
                Float fC2 = Boxing.c(this.f168106e);
                a aVar = new a(interfaceC13815n, floatRef);
                this.f168102a = 1;
                if (c6313aB.e(fC, n0Var, fC2, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le1/b;", "it", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.j1$k */
    static final class k extends Lambda implements Function1<C13602b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f168109f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f168110g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f168111h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ z1<Function1<Float, Unit>> f168112i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f168113j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f168114k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ z1<Function0<Unit>> f168115l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(boolean z10, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10, z1<? extends Function1<? super Float, Unit>> z1Var, float f10, boolean z11, z1<? extends Function0<Unit>> z1Var2) {
            super(1);
            this.f168109f = z10;
            this.f168110g = closedFloatingPointRange;
            this.f168111h = i10;
            this.f168112i = z1Var;
            this.f168113j = f10;
            this.f168114k = z11;
            this.f168115l = z1Var2;
        }

        public final Boolean a(KeyEvent keyEvent) {
            if (!this.f168109f) {
                return Boolean.FALSE;
            }
            int iB = C13604d.b(keyEvent);
            C13603c.Companion companion = C13603c.INSTANCE;
            boolean z10 = false;
            if (C13603c.e(iB, companion.a())) {
                float fAbs = Math.abs(this.f168110g.getEndInclusive().floatValue() - this.f168110g.getStart().floatValue());
                int i10 = this.f168111h;
                float f10 = fAbs / (i10 > 0 ? i10 + 1 : 100);
                long jA = C13604d.a(keyEvent);
                C13601a.Companion companion2 = C13601a.INSTANCE;
                if (C13601a.q(jA, companion2.f())) {
                    this.f168112i.getValue().invoke(RangesKt.r(Float.valueOf(this.f168113j + f10), this.f168110g));
                } else if (C13601a.q(jA, companion2.c())) {
                    this.f168112i.getValue().invoke(RangesKt.r(Float.valueOf(this.f168113j - f10), this.f168110g));
                } else {
                    if (C13601a.q(jA, companion2.e())) {
                        this.f168112i.getValue().invoke(RangesKt.r(Float.valueOf(this.f168113j + ((this.f168114k ? -1 : 1) * f10)), this.f168110g));
                    } else if (C13601a.q(jA, companion2.d())) {
                        this.f168112i.getValue().invoke(RangesKt.r(Float.valueOf(this.f168113j - ((this.f168114k ? -1 : 1) * f10)), this.f168110g));
                    } else if (C13601a.q(jA, companion2.j())) {
                        this.f168112i.getValue().invoke(this.f168110g.getStart());
                    } else if (C13601a.q(jA, companion2.i())) {
                        this.f168112i.getValue().invoke(this.f168110g.getEndInclusive());
                    } else if (C13601a.q(jA, companion2.m())) {
                        this.f168112i.getValue().invoke(RangesKt.r(Float.valueOf(this.f168113j - (RangesKt.o(r1 / 10, 1, 10) * f10)), this.f168110g));
                    } else if (C13601a.q(jA, companion2.l())) {
                        this.f168112i.getValue().invoke(RangesKt.r(Float.valueOf(this.f168113j + (RangesKt.o(r1 / 10, 1, 10) * f10)), this.f168110g));
                    }
                }
                z10 = true;
            } else if (C13603c.e(iB, companion.b())) {
                long jA2 = C13604d.a(keyEvent);
                C13601a.Companion companion3 = C13601a.INSTANCE;
                if (C13601a.q(jA2, companion3.f()) ? true : C13601a.q(jA2, companion3.c()) ? true : C13601a.q(jA2, companion3.e()) ? true : C13601a.q(jA2, companion3.d()) ? true : C13601a.q(jA2, companion3.j()) ? true : C13601a.q(jA2, companion3.i()) ? true : C13601a.q(jA2, companion3.m()) ? true : C13601a.q(jA2, companion3.l())) {
                    Function0<Unit> value = this.f168115l.getValue();
                    if (value != null) {
                        value.invoke();
                    }
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(C13602b c13602b) {
            return a(c13602b.getNativeKeyEvent());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.j1$l */
    static final class l extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f168116f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f168117g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f168118h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f168119i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Unit> f168120j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168121k;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "targetValue", "", "b", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.j1$l$a */
        static final class a extends Lambda implements Function1<Float, Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ClosedFloatingPointRange<Float> f168122f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f168123g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f168124h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1<Float, Unit> f168125i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f168126j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10, float f10, Function1<? super Float, Unit> function1, Function0<Unit> function0) {
                super(1);
                this.f168122f = closedFloatingPointRange;
                this.f168123g = i10;
                this.f168124h = f10;
                this.f168125i = function1;
                this.f168126j = function0;
            }

            public final Boolean b(float f10) {
                int i10;
                float fN = RangesKt.n(f10, this.f168122f.getStart().floatValue(), this.f168122f.getEndInclusive().floatValue());
                int i11 = this.f168123g;
                boolean z10 = false;
                if (i11 > 0 && (i10 = i11 + 1) >= 0) {
                    float fAbs = fN;
                    float f11 = fAbs;
                    int i12 = 0;
                    while (true) {
                        float fB = J1.b.b(this.f168122f.getStart().floatValue(), this.f168122f.getEndInclusive().floatValue(), i12 / (this.f168123g + 1));
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
                if (fN != this.f168124h) {
                    this.f168125i.invoke(Float.valueOf(fN));
                    Function0<Unit> function0 = this.f168126j;
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
            this.f168116f = z10;
            this.f168117g = closedFloatingPointRange;
            this.f168118h = i10;
            this.f168119i = f10;
            this.f168120j = function1;
            this.f168121k = function0;
        }

        public final void a(u uVar) {
            if (!this.f168116f) {
                s.l(uVar);
            }
            s.q0(uVar, null, new a(this.f168117g, this.f168118h, this.f168119i, this.f168120j, this.f168121k), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.j1$m */
    public static final class m extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC13819r f168127f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0.l f168128g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f168129h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f168130i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ z1 f168131j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ z1 f168132k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0 f168133l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f168134m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC13819r interfaceC13819r, h0.l lVar, float f10, boolean z10, z1 z1Var, z1 z1Var2, InterfaceC5730l0 interfaceC5730l0, boolean z11) {
            super(1);
            this.f168127f = interfaceC13819r;
            this.f168128g = lVar;
            this.f168129h = f10;
            this.f168130i = z10;
            this.f168131j = z1Var;
            this.f168132k = z1Var2;
            this.f168133l = interfaceC5730l0;
            this.f168134m = z11;
        }

        public final void a(N0 n02) {
            n02.b("sliderTapModifier");
            n02.getProperties().c("draggableState", this.f168127f);
            n02.getProperties().c("interactionSource", this.f168128g);
            n02.getProperties().c("maxPx", Float.valueOf(this.f168129h));
            n02.getProperties().c("isRtl", Boolean.valueOf(this.f168130i));
            n02.getProperties().c("rawOffset", this.f168131j);
            n02.getProperties().c("gestureEndAction", this.f168132k);
            n02.getProperties().c("pressOffset", this.f168133l);
            n02.getProperties().c("enabled", Boolean.valueOf(this.f168134m));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.j1$n */
    static final class n extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f168135f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC13819r f168136g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0.l f168137h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f168138i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f168139j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Float> f168140k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168141l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ z1<Function1<Float, Unit>> f168142m;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "<anonymous>", "(Lg1/J;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1", f = "Slider.kt", l = {1006}, m = "invokeSuspend")
        /* renamed from: x0.j1$n$a */
        static final class a extends SuspendLambda implements Function2<g1.J, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f168143a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f168144b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f168145c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f168146d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Float> f168147e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<Float> f168148f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f168149g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC13819r f168150h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ z1<Function1<Float, Unit>> f168151i;

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf0/A;", "LU0/f;", "pos", "", "<anonymous>", "(Lf0/A;LU0/f;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1", f = "Slider.kt", l = {1011}, m = "invokeSuspend")
            /* renamed from: x0.j1$n$a$a, reason: collision with other inner class name */
            static final class C2673a extends SuspendLambda implements Function3<InterfaceC13783A, U0.f, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f168152a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f168153b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ long f168154c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ boolean f168155d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ float f168156e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<Float> f168157f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ z1<Float> f168158g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2673a(boolean z10, float f10, InterfaceC5730l0<Float> interfaceC5730l0, z1<Float> z1Var, Continuation<? super C2673a> continuation) {
                    super(3, continuation);
                    this.f168155d = z10;
                    this.f168156e = f10;
                    this.f168157f = interfaceC5730l0;
                    this.f168158g = z1Var;
                }

                public final Object d(InterfaceC13783A interfaceC13783A, long j10, Continuation<? super Unit> continuation) {
                    C2673a c2673a = new C2673a(this.f168155d, this.f168156e, this.f168157f, this.f168158g, continuation);
                    c2673a.f168153b = interfaceC13783A;
                    c2673a.f168154c = j10;
                    return c2673a.invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(InterfaceC13783A interfaceC13783A, U0.f fVar, Continuation<? super Unit> continuation) {
                    return d(interfaceC13783A, fVar.getPackedValue(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    float fM;
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f168152a;
                    try {
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            InterfaceC13783A interfaceC13783A = (InterfaceC13783A) this.f168153b;
                            long j10 = this.f168154c;
                            if (this.f168155d) {
                                fM = this.f168156e - U0.f.m(j10);
                            } else {
                                fM = U0.f.m(j10);
                            }
                            this.f168157f.setValue(Boxing.c(fM - this.f168158g.getValue().floatValue()));
                            this.f168152a = 1;
                            if (interfaceC13783A.p1(this) == objF) {
                                return objF;
                            }
                        }
                    } catch (GestureCancellationException unused) {
                        this.f168157f.setValue(Boxing.c(0.0f));
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.j1$n$a$b */
            static final class b extends Lambda implements Function1<U0.f, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f168159f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC13819r f168160g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ z1<Function1<Float, Unit>> f168161h;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1", f = "Slider.kt", l = {1018}, m = "invokeSuspend")
                /* renamed from: x0.j1$n$a$b$a, reason: collision with other inner class name */
                static final class C2674a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f168162a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC13819r f168163b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ z1<Function1<Float, Unit>> f168164c;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf0/n;", "", "<anonymous>", "(Lf0/n;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: x0.j1$n$a$b$a$a, reason: collision with other inner class name */
                    static final class C2675a extends SuspendLambda implements Function2<InterfaceC13815n, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f168165a;

                        /* renamed from: b, reason: collision with root package name */
                        private /* synthetic */ Object f168166b;

                        C2675a(Continuation<? super C2675a> continuation) {
                            super(2, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C2675a c2675a = new C2675a(continuation);
                            c2675a.f168166b = obj;
                            return c2675a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: d, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(InterfaceC13815n interfaceC13815n, Continuation<? super Unit> continuation) {
                            return ((C2675a) create(interfaceC13815n, continuation)).invokeSuspend(Unit.f142422a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.f168165a == 0) {
                                ResultKt.b(obj);
                                ((InterfaceC13815n) this.f168166b).a(0.0f);
                                return Unit.f142422a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C2674a(InterfaceC13819r interfaceC13819r, z1<? extends Function1<? super Float, Unit>> z1Var, Continuation<? super C2674a> continuation) {
                        super(2, continuation);
                        this.f168163b = interfaceC13819r;
                        this.f168164c = z1Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C2674a(this.f168163b, this.f168164c, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C2674a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f168162a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            InterfaceC13819r interfaceC13819r = this.f168163b;
                            EnumC13431E enumC13431E = EnumC13431E.f126846b;
                            C2675a c2675a = new C2675a(null);
                            this.f168162a = 1;
                            if (interfaceC13819r.a(enumC13431E, c2675a, this) == objF) {
                                return objF;
                            }
                        }
                        this.f168164c.getValue().invoke(Boxing.c(0.0f));
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(InterfaceC16622O interfaceC16622O, InterfaceC13819r interfaceC13819r, z1<? extends Function1<? super Float, Unit>> z1Var) {
                    super(1);
                    this.f168159f = interfaceC16622O;
                    this.f168160g = interfaceC13819r;
                    this.f168161h = z1Var;
                }

                public final void a(long j10) {
                    C16648k.d(this.f168159f, null, null, new C2674a(this.f168160g, this.f168161h, null), 3, null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
                    a(fVar.getPackedValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(boolean z10, float f10, InterfaceC5730l0<Float> interfaceC5730l0, z1<Float> z1Var, InterfaceC16622O interfaceC16622O, InterfaceC13819r interfaceC13819r, z1<? extends Function1<? super Float, Unit>> z1Var2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f168145c = z10;
                this.f168146d = f10;
                this.f168147e = interfaceC5730l0;
                this.f168148f = z1Var;
                this.f168149g = interfaceC16622O;
                this.f168150h = interfaceC13819r;
                this.f168151i = z1Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f168145c, this.f168146d, this.f168147e, this.f168148f, this.f168149g, this.f168150h, this.f168151i, continuation);
                aVar.f168144b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
                return ((a) create(j10, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f168143a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    g1.J j10 = (g1.J) this.f168144b;
                    C2673a c2673a = new C2673a(this.f168145c, this.f168146d, this.f168147e, this.f168148f, null);
                    b bVar = new b(this.f168149g, this.f168150h, this.f168151i);
                    this.f168143a = 1;
                    if (C13794L.m(j10, null, null, c2673a, bVar, this, 3, null) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(boolean z10, InterfaceC13819r interfaceC13819r, h0.l lVar, float f10, boolean z11, InterfaceC5730l0<Float> interfaceC5730l0, z1<Float> z1Var, z1<? extends Function1<? super Float, Unit>> z1Var2) {
            super(3);
            this.f168135f = z10;
            this.f168136g = interfaceC13819r;
            this.f168137h = lVar;
            this.f168138i = f10;
            this.f168139j = z11;
            this.f168140k = interfaceC5730l0;
            this.f168141l = z1Var;
            this.f168142m = z1Var2;
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
            if (this.f168135f) {
                composer.startReplaceGroup(-394118969);
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = J.k(EmptyCoroutineContext.f142646a, composer);
                    composer.t(objB);
                }
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB;
                Object[] objArr = {this.f168136g, this.f168137h, Float.valueOf(this.f168138i), Boolean.valueOf(this.f168139j)};
                boolean zA = composer.a(this.f168139j) | composer.b(this.f168138i) | composer.V(this.f168140k) | composer.V(this.f168141l) | composer.D(interfaceC16622O) | composer.D(this.f168136g) | composer.V(this.f168142m);
                boolean z10 = this.f168139j;
                float f10 = this.f168138i;
                InterfaceC5730l0<Float> interfaceC5730l0 = this.f168140k;
                z1<Float> z1Var = this.f168141l;
                InterfaceC13819r interfaceC13819r = this.f168136g;
                z1<Function1<Float, Unit>> z1Var2 = this.f168142m;
                Object objB2 = composer.B();
                if (zA || objB2 == companion.a()) {
                    Object aVar = new a(z10, f10, interfaceC5730l0, z1Var, interfaceC16622O, interfaceC13819r, z1Var2, null);
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
        f168005f = fP;
        float fP2 = H1.h.p(144);
        f168006g = fP2;
        f168007h = androidx.compose.foundation.layout.J.k(androidx.compose.foundation.layout.J.B(Modifier.INSTANCE, fP2, 0.0f, 2, null), 0.0f, fP, 1, null);
        f168008i = new n0<>(100, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1<? super Float, Float> function1, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, InterfaceC5730l0<Float> interfaceC5730l0, float f10, Composer composer, int i10) {
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
            i11 |= composerStartRestartGroup.V(interfaceC5730l0) ? 2048 : 1024;
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
                a aVar = new a(closedFloatingPointRange, function1, f11, interfaceC5730l0, closedFloatingPointRange2);
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
            t0L.a(new b(function1, closedFloatingPointRange, closedFloatingPointRange2, interfaceC5730l0, f10, i10));
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
    public static final void b(float r39, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r40, androidx.compose.ui.Modifier r41, boolean r42, kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r43, int r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, h0.l r46, kotlin.InterfaceC17939g1 r47, androidx.compose.runtime.Composer r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17948j1.b(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, h0.l, x0.g1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z10, float f10, List<Float> list, InterfaceC17939g1 interfaceC17939g1, float f11, h0.l lVar, Modifier modifier, Composer composer, int i10) {
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
            i11 |= composerStartRestartGroup.V(interfaceC17939g1) ? RecyclerView.m.FLAG_MOVED : 1024;
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
            Modifier modifierThen = modifier.then(f168007h);
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierThen);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5664j c5664j = C5664j.f48612a;
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            float fI1 = dVar.I1(f168004e);
            float f12 = f168000a;
            float fI12 = dVar.I1(f12);
            float fL = dVar.L(f11);
            float fP = H1.h.p(f12 * 2);
            float fP2 = H1.h.p(fL * f10);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i13 = i12 >> 6;
            int i14 = i12 << 9;
            e(androidx.compose.foundation.layout.J.f(companion2, 0.0f, 1, null), interfaceC17939g1, z11, 0.0f, f10, list2, fI12, fI1, composerStartRestartGroup, (i14 & 458752) | ((i12 << 6) & 896) | (i13 & 112) | 3078 | (i14 & 57344));
            d(c5664j, companion2, fP2, lVar, interfaceC17939g1, z10, fP, composerStartRestartGroup, (i13 & 7168) | 1572918 | ((i12 << 3) & 57344) | ((i12 << 15) & 458752));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new e(z10, f10, list, interfaceC17939g1, f11, lVar, modifier, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC14810b interfaceC14810b, Modifier modifier, float f10, h0.l lVar, InterfaceC17939g1 interfaceC17939g1, boolean z10, float f11, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(428907178);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.V(interfaceC14810b) ? 4 : 2) | i10;
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
            i11 |= composerStartRestartGroup.V(interfaceC17939g1) ? 16384 : 8192;
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
            Modifier modifierG = interfaceC14810b.g(modifierM, companion.h());
            MeasurePolicy measurePolicyG = C5662h.g(companion.o(), false);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierG);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5664j c5664j = C5664j.f48612a;
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
            float fP = !snapshotStateList.isEmpty() ? f168003d : f168002c;
            Modifier modifierB = androidx.compose.foundation.h.b(androidx.compose.foundation.j.b(androidx.compose.foundation.layout.J.w(modifier, f11, f11), lVar, C17916Y0.f(false, f168001b, 0L, 4, null)), lVar, false, 2, null);
            if (!z10) {
                fP = H1.h.p(0);
            }
            C14802K.a(androidx.compose.foundation.b.c(T0.l.b(modifierB, fP, C16692i.f(), false, 0L, 0L, 24, null), interfaceC17939g1.c(z10, composerStartRestartGroup, ((i11 >> 15) & 14) | (i12 & 112)).getValue().getValue(), C16692i.f()), composerStartRestartGroup, 0);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new g(interfaceC14810b, modifier, f10, lVar, interfaceC17939g1, z10, f11, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Modifier modifier, InterfaceC17939g1 interfaceC17939g1, boolean z10, float f10, float f11, List<Float> list, float f12, float f13, Composer composer, int i10) {
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
            i11 |= composerStartRestartGroup.V(interfaceC17939g1) ? 32 : 16;
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
            z1<C5346q0> z1VarA = interfaceC17939g1.a(z10, false, composerStartRestartGroup, i13);
            z1<C5346q0> z1VarA2 = interfaceC17939g1.a(z10, true, composerStartRestartGroup, i13);
            z1<C5346q0> z1VarB = interfaceC17939g1.b(z10, false, composerStartRestartGroup, i13);
            z1<C5346q0> z1VarB2 = interfaceC17939g1.b(z10, true, composerStartRestartGroup, i13);
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
            C13443j.a(modifier, (Function1) objB, composerStartRestartGroup, i12 & 14);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new i(modifier, interfaceC17939g1, z10, f10, f11, list, f12, f13, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object p(InterfaceC13819r interfaceC13819r, float f10, float f11, float f12, Continuation<? super Unit> continuation) {
        Object objB = InterfaceC13819r.b(interfaceC13819r, null, new j(f10, f11, f12, null), continuation, 1, null);
        return objB == IntrinsicsKt.f() ? objB : Unit.f142422a;
    }

    public static final float r() {
        return f168000a;
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
        return Q.b(C16705m.d(modifier, false, new l(z10, closedFloatingPointRange, i10, RangesKt.n(f10, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue()), function1, function0), 1, null), f10, closedFloatingPointRange, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier v(Modifier modifier, InterfaceC13819r interfaceC13819r, h0.l lVar, float f10, boolean z10, z1<Float> z1Var, z1<? extends Function1<? super Float, Unit>> z1Var2, InterfaceC5730l0<Float> interfaceC5730l0, boolean z11) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new m(interfaceC13819r, lVar, f10, z10, z1Var, z1Var2, interfaceC5730l0, z11);
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier, function1A, new n(z11, interfaceC13819r, lVar, f10, z10, interfaceC5730l0, z1Var, z1Var2));
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
