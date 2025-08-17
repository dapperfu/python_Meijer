package androidx.compose.foundation.text;

import M0.SnapshotStateList;
import V0.AbstractC5337m1;
import V0.D1;
import V0.q1;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.L1;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.f;
import g1.C14191x;
import g1.InterfaceC14190w;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import qv.InterfaceC16622O;
import r1.C16705m;
import u1.InterfaceC17212d;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\r\u0010\fJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J@\u0010'\u001a\u00020\u001e2\u0016\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010!\"\u0004\u0018\u00010\u00012\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#¢\u0006\u0002\b%H\u0003¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001eH\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0002H\u0000¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010,R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u00100\u001a\u0004\u0018\u00010\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00108\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010.\u001a\u0004\b6\u0010,\"\u0004\b7\u0010\u0005R+\u0010<\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#¢\u0006\u0002\b%098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8F¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Landroidx/compose/foundation/text/k0;", "", "Landroidx/compose/ui/text/AnnotatedString;", "initialText", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/f;", "Landroidx/compose/foundation/text/LinkRange;", "link", "t", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString$d;)Landroidx/compose/ui/Modifier;", "k", "LV0/D1;", "s", "(Landroidx/compose/ui/text/AnnotatedString$d;)LV0/D1;", "LV0/q1;", "q", "(Landroidx/compose/ui/text/AnnotatedString$d;)LV0/q1;", "Lu1/v;", "textLayoutResult", "j", "(Landroidx/compose/ui/text/AnnotatedString$d;Lu1/v;)Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/s;", "other", "p", "(Landroidx/compose/ui/text/s;Landroidx/compose/ui/text/s;)Landroidx/compose/ui/text/s;", "Landroidx/compose/ui/platform/L1;", "uriHandler", "", "o", "(Landroidx/compose/ui/text/f;Landroidx/compose/ui/platform/L1;)V", "", "keys", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/K;", "Lkotlin/ExtensionFunctionType;", "block", "c", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "b", "(Landroidx/compose/runtime/Composer;I)V", "i", "()Landroidx/compose/ui/text/AnnotatedString;", "a", "Landroidx/compose/ui/text/AnnotatedString;", "getInitialText$foundation_release", "<set-?>", "Landroidx/compose/runtime/l0;", "n", "()Lu1/v;", "r", "(Lu1/v;)V", "m", "setText$foundation_release", "text", "LM0/m;", "d", "LM0/m;", "annotators", "Lkotlin/Function0;", "", "l", "()Lkotlin/jvm/functions/Function0;", "shouldMeasureLinks", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AnnotatedString initialText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private AnnotatedString text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 textLayoutResult = t1.e(null, null, 2, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SnapshotStateList<Function1<K, Unit>> annotators = o1.f();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f49594f = new b();

        b() {
            super(1);
        }

        public final void a(r1.u uVar) {
            uVar.a(SemanticsProperties.INSTANCE.s(), Unit.f142422a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AnnotatedString.Range<androidx.compose.ui.text.f> f49596g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ L1 f49597h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AnnotatedString.Range<androidx.compose.ui.text.f> range, L1 l12) {
            super(0);
            this.f49596g = range;
            this.f49597h = l12;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k0.this.o(this.f49596g.g(), this.f49597h);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", l = {247}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f49598a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C f49599b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C c10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f49599b = c10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f49599b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f49598a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C c10 = this.f49599b;
                this.f49598a = 1;
                if (c10.e(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/text/K;", "", "a", "(Landroidx/compose/foundation/text/K;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function1<K, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AnnotatedString.Range<androidx.compose.ui.text.f> f49601g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C f49602h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AnnotatedString.Range<androidx.compose.ui.text.f> range, C c10) {
            super(1);
            this.f49601g = range;
            this.f49602h = c10;
        }

        public final void a(K k10) {
            u1.w styles;
            u1.w styles2;
            u1.w styles3;
            k0 k0Var = k0.this;
            u1.w styles4 = this.f49601g.g().getStyles();
            SpanStyle pressedStyle = null;
            SpanStyle spanStyleP = k0Var.p(k0Var.p(styles4 != null ? styles4.getStyle() : null, (!this.f49602h.f() || (styles3 = this.f49601g.g().getStyles()) == null) ? null : styles3.getFocusedStyle()), (!this.f49602h.g() || (styles2 = this.f49601g.g().getStyles()) == null) ? null : styles2.getHoveredStyle());
            if (this.f49602h.h() && (styles = this.f49601g.g().getStyles()) != null) {
                pressedStyle = styles.getPressedStyle();
            }
            k10.b(this.f49601g, k0Var.p(spanStyleP, pressedStyle));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(K k10) {
            a(k10);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f49604g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10) {
            super(2);
            this.f49604g = i10;
        }

        public final void a(Composer composer, int i10) {
            k0.this.b(composer, J0.a(this.f49604g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class g extends Lambda implements Function1<androidx.compose.runtime.F, androidx.compose.runtime.E> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<K, Unit> f49606g;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/foundation/text/k0$g$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements androidx.compose.runtime.E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k0 f49607a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f49608b;

            public a(k0 k0Var, Function1 function1) {
                this.f49607a = k0Var;
                this.f49608b = function1;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f49607a.annotators.remove(this.f49608b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super K, Unit> function1) {
            super(1);
            this.f49606g = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.E invoke(androidx.compose.runtime.F f10) {
            k0.this.annotators.add(this.f49606g);
            return new a(k0.this, this.f49606g);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object[] f49610g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<K, Unit> f49611h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f49612i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Object[] objArr, Function1<? super K, Unit> function1, int i10) {
            super(2);
            this.f49610g = objArr;
            this.f49611h = function1;
            this.f49612i = i10;
        }

        public final void a(Composer composer, int i10) {
            k0 k0Var = k0.this;
            Object[] objArr = this.f49610g;
            k0Var.c(Arrays.copyOf(objArr, objArr.length), this.f49611h, composer, J0.a(this.f49612i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/e;", "", "a", "(Landroidx/compose/ui/graphics/e;)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends Lambda implements Function1<androidx.compose.ui.graphics.e, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AnnotatedString.Range<androidx.compose.ui.text.f> f49614g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(AnnotatedString.Range<androidx.compose.ui.text.f> range) {
            super(1);
            this.f49614g = range;
        }

        public final void a(androidx.compose.ui.graphics.e eVar) {
            D1 d1S = k0.this.s(this.f49614g);
            if (d1S != null) {
                eVar.K1(d1S);
                eVar.D(true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
            a(eVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"androidx/compose/foundation/text/k0$j", "LV0/D1;", "LU0/k;", "size", "LH1/t;", "layoutDirection", "LH1/d;", "density", "LV0/m1;", "a", "(JLH1/t;LH1/d;)LV0/m1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements D1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q1 f49615a;

        j(q1 q1Var) {
            this.f49615a = q1Var;
        }

        @Override // V0.D1
        public AbstractC5337m1 a(long size, H1.t layoutDirection, H1.d density) {
            return new AbstractC5337m1.a(this.f49615a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class k extends Lambda implements Function0<Boolean> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            TextLayoutInput layoutInput;
            AnnotatedString text = k0.this.getText();
            TextLayoutResult textLayoutResultN = k0.this.n();
            return Boolean.valueOf(Intrinsics.e(text, (textLayoutResultN == null || (layoutInput = textLayoutResultN.getLayoutInput()) == null) ? null : layoutInput.getText()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LH1/n;", "c", "()J"}, k = 3, mv = {1, 9, 0})
    static final class l extends Lambda implements Function0<H1.n> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ H1.p f49617f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(H1.p pVar) {
            super(0);
            this.f49617f = pVar;
        }

        public final long c() {
            return this.f49617f.i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ H1.n invoke() {
            return H1.n.c(c());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LH1/n;", "c", "()J"}, k = 3, mv = {1, 9, 0})
    static final class m extends Lambda implements Function0<H1.n> {

        /* renamed from: f, reason: collision with root package name */
        public static final m f49618f = new m();

        m() {
            super(0);
        }

        public final long c() {
            return H1.n.INSTANCE.b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ H1.n invoke() {
            return H1.n.c(c());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LH1/n;", "c", "()J"}, k = 3, mv = {1, 9, 0})
    static final class n extends Lambda implements Function0<H1.n> {

        /* renamed from: f, reason: collision with root package name */
        public static final n f49619f = new n();

        n() {
            super(0);
        }

        public final long c() {
            return H1.n.INSTANCE.b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ H1.n invoke() {
            return H1.n.c(c());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00000\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/AnnotatedString$a;", "it", "", "a", "(Landroidx/compose/ui/text/AnnotatedString$d;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<AnnotatedString.Range<? extends AnnotatedString.a>, List<? extends AnnotatedString.Range<? extends AnnotatedString.a>>> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f49593f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<AnnotatedString.Range<? extends AnnotatedString.a>> invoke(AnnotatedString.Range<? extends AnnotatedString.a> range) {
            SpanStyle spanStyle;
            if (range.g() instanceof androidx.compose.ui.text.f) {
                AnnotatedString.a aVarG = range.g();
                Intrinsics.h(aVarG, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                if (!l0.b(((androidx.compose.ui.text.f) aVarG).getStyles())) {
                    AnnotatedString.a aVarG2 = range.g();
                    Intrinsics.h(aVarG2, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
                    u1.w styles = ((androidx.compose.ui.text.f) aVarG2).getStyles();
                    if (styles == null || (spanStyle = styles.getStyle()) == null) {
                        spanStyle = new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65535, null);
                    }
                    return CollectionsKt.g(range, new AnnotatedString.Range(spanStyle, range.h(), range.f()));
                }
            }
            return CollectionsKt.g(range);
        }
    }

    private final Modifier k(Modifier modifier, AnnotatedString.Range<androidx.compose.ui.text.f> range) {
        return androidx.compose.ui.graphics.d.a(modifier, new i(range));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(androidx.compose.ui.text.f link, L1 uriHandler) {
        InterfaceC17212d linkInteractionListener;
        Unit unit;
        if (!(link instanceof f.b)) {
            if (!(link instanceof f.a) || (linkInteractionListener = link.getLinkInteractionListener()) == null) {
                return;
            }
            linkInteractionListener.a(link);
            return;
        }
        InterfaceC17212d linkInteractionListener2 = link.getLinkInteractionListener();
        if (linkInteractionListener2 != null) {
            linkInteractionListener2.a(link);
            unit = Unit.f142422a;
        } else {
            unit = null;
        }
        if (unit == null) {
            try {
                uriHandler.a(((f.b) link).getUrl());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpanStyle p(SpanStyle spanStyle, SpanStyle spanStyle2) {
        SpanStyle spanStyleY;
        return (spanStyle == null || (spanStyleY = spanStyle.y(spanStyle2)) == null) ? spanStyle2 : spanStyleY;
    }

    private final Modifier t(Modifier modifier, final AnnotatedString.Range<androidx.compose.ui.text.f> range) {
        return modifier.then(new q0(new r0() { // from class: androidx.compose.foundation.text.j0
            @Override // androidx.compose.foundation.text.r0
            public final o0 a(p0 p0Var) {
                return k0.u(this.f49586a, range, p0Var);
            }
        }));
    }

    public final void b(Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(1154651354);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = 1;
        if (composerStartRestartGroup.p((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(1154651354, i11, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:214)");
            }
            L1 l12 = (L1) composerStartRestartGroup.o(C5892t0.s());
            AnnotatedString annotatedString = this.text;
            List<AnnotatedString.Range<androidx.compose.ui.text.f>> listE = annotatedString.e(0, annotatedString.length());
            int size = listE.size();
            int i13 = 0;
            while (i13 < size) {
                AnnotatedString.Range<androidx.compose.ui.text.f> range = listE.get(i13);
                if (range.h() != range.f()) {
                    composerStartRestartGroup.startReplaceGroup(1386075176);
                    Object objB = composerStartRestartGroup.B();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objB == companion.a()) {
                        objB = h0.k.a();
                        composerStartRestartGroup.t(objB);
                    }
                    h0.l lVar = (h0.l) objB;
                    Modifier modifierB = C14191x.b(androidx.compose.foundation.h.b(t(C16705m.d(k(Modifier.INSTANCE, range), false, b.f49594f, i12, null), range), lVar, false, 2, null), InterfaceC14190w.INSTANCE.b(), false, 2, null);
                    boolean zD = composerStartRestartGroup.D(this) | composerStartRestartGroup.V(range) | composerStartRestartGroup.D(l12);
                    Object objB2 = composerStartRestartGroup.B();
                    if (zD || objB2 == companion.a()) {
                        objB2 = new c(range, l12);
                        composerStartRestartGroup.t(objB2);
                    }
                    C5662h.a(ClickableKt.f(modifierB, lVar, null, false, null, null, null, null, null, false, (Function0) objB2, 508, null), composerStartRestartGroup, 0);
                    if (l0.b(range.g().getStyles())) {
                        composerStartRestartGroup.startReplaceGroup(1388926990);
                        composerStartRestartGroup.P();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1386898319);
                        Object objB3 = composerStartRestartGroup.B();
                        if (objB3 == companion.a()) {
                            objB3 = new C(lVar);
                            composerStartRestartGroup.t(objB3);
                        }
                        C c10 = (C) objB3;
                        Unit unit = Unit.f142422a;
                        Object objB4 = composerStartRestartGroup.B();
                        if (objB4 == companion.a()) {
                            objB4 = new d(c10, null);
                            composerStartRestartGroup.t(objB4);
                        }
                        androidx.compose.runtime.J.g(unit, (Function2) objB4, composerStartRestartGroup, 6);
                        Boolean boolValueOf = Boolean.valueOf(c10.g());
                        Boolean boolValueOf2 = Boolean.valueOf(c10.f());
                        Boolean boolValueOf3 = Boolean.valueOf(c10.h());
                        u1.w styles = range.g().getStyles();
                        SpanStyle style = styles != null ? styles.getStyle() : null;
                        u1.w styles2 = range.g().getStyles();
                        SpanStyle focusedStyle = styles2 != null ? styles2.getFocusedStyle() : null;
                        u1.w styles3 = range.g().getStyles();
                        SpanStyle hoveredStyle = styles3 != null ? styles3.getHoveredStyle() : null;
                        u1.w styles4 = range.g().getStyles();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, style, focusedStyle, hoveredStyle, styles4 != null ? styles4.getPressedStyle() : null};
                        boolean zD2 = composerStartRestartGroup.D(this) | composerStartRestartGroup.V(range);
                        Object objB5 = composerStartRestartGroup.B();
                        if (zD2 || objB5 == companion.a()) {
                            objB5 = new e(range, c10);
                            composerStartRestartGroup.t(objB5);
                        }
                        c(objArr, (Function1) objB5, composerStartRestartGroup, (i11 << 6) & 896);
                        composerStartRestartGroup.P();
                    }
                    composerStartRestartGroup.P();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1388940878);
                    composerStartRestartGroup.P();
                }
                i13++;
                i12 = 1;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new f(i10));
        }
    }

    public final AnnotatedString i() {
        AnnotatedString styledText;
        if (this.annotators.isEmpty()) {
            styledText = this.text;
        } else {
            K k10 = new K(this.text);
            SnapshotStateList<Function1<K, Unit>> snapshotStateList = this.annotators;
            int size = snapshotStateList.size();
            for (int i10 = 0; i10 < size; i10++) {
                snapshotStateList.get(i10).invoke(k10);
            }
            styledText = k10.getStyledText();
        }
        this.text = styledText;
        return styledText;
    }

    public final Function0<Boolean> l() {
        return new k();
    }

    /* renamed from: m, reason: from getter */
    public final AnnotatedString getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextLayoutResult n() {
        return (TextLayoutResult) this.textLayoutResult.getValue();
    }

    public final void r(TextLayoutResult textLayoutResult) {
        this.textLayoutResult.setValue(textLayoutResult);
    }

    public k0(AnnotatedString annotatedString) {
        this.initialText = annotatedString;
        this.text = annotatedString.a(a.f49593f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Object[] objArr, Function1<? super K, Unit> function1, Composer composer, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2083052099);
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function1)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        composerStartRestartGroup.startMovableGroup(-416604407, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            if (composerStartRestartGroup.D(obj)) {
                i12 = 4;
            } else {
                i12 = 0;
            }
            i11 |= i12;
        }
        composerStartRestartGroup.T();
        if ((i11 & 14) == 0) {
            i11 |= 2;
        }
        boolean z11 = true;
        if ((i11 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-2083052099, i11, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:315)");
            }
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.a(function1);
            spreadBuilder.b(objArr);
            Object[] objArrD = spreadBuilder.d(new Object[spreadBuilder.c()]);
            boolean zD = composerStartRestartGroup.D(this);
            if ((i11 & 112) != 32) {
                z11 = false;
            }
            boolean z12 = zD | z11;
            Object objB = composerStartRestartGroup.B();
            if (z12 || objB == Composer.INSTANCE.a()) {
                objB = new g(function1);
                composerStartRestartGroup.t(objB);
            }
            androidx.compose.runtime.J.d(objArrD, (Function1) objB, composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new h(objArr, function1, i10));
        }
    }

    private final AnnotatedString.Range<androidx.compose.ui.text.f> j(AnnotatedString.Range<androidx.compose.ui.text.f> link, TextLayoutResult textLayoutResult) {
        int iP = TextLayoutResult.p(textLayoutResult, textLayoutResult.n() - 1, false, 2, null);
        if (link.h() >= iP) {
            return null;
        }
        return AnnotatedString.Range.e(link, null, 0, Math.min(link.f(), iP), null, 11, null);
    }

    private final q1 q(AnnotatedString.Range<androidx.compose.ui.text.f> link) {
        float fMin;
        q1 q1VarZ = null;
        if (!l().invoke().booleanValue()) {
            return null;
        }
        TextLayoutResult textLayoutResultN = n();
        if (textLayoutResultN != null) {
            AnnotatedString.Range<androidx.compose.ui.text.f> rangeJ = j(link, textLayoutResultN);
            if (rangeJ == null) {
                return null;
            }
            q1VarZ = textLayoutResultN.z(rangeJ.h(), rangeJ.f());
            Rect rectD = textLayoutResultN.d(rangeJ.h());
            Rect rectD2 = textLayoutResultN.d(rangeJ.f() - 1);
            if (textLayoutResultN.q(rangeJ.h()) == textLayoutResultN.q(rangeJ.f() - 1)) {
                fMin = Math.min(rectD2.getLeft(), rectD.getLeft());
            } else {
                fMin = 0.0f;
            }
            float top = rectD.getTop();
            q1VarZ.k(U0.f.e(U0.f.e((Float.floatToRawIntBits(fMin) << 32) | (Float.floatToRawIntBits(top) & 4294967295L)) ^ (-9223372034707292160L)));
        }
        return q1VarZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final D1 s(AnnotatedString.Range<androidx.compose.ui.text.f> link) {
        q1 q1VarQ = q(link);
        if (q1VarQ != null) {
            return new j(q1VarQ);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 u(k0 k0Var, AnnotatedString.Range range, p0 p0Var) {
        TextLayoutResult textLayoutResultN = k0Var.n();
        if (textLayoutResultN == null) {
            return p0Var.a(0, 0, m.f49618f);
        }
        AnnotatedString.Range<androidx.compose.ui.text.f> rangeJ = k0Var.j(range, textLayoutResultN);
        if (rangeJ == null) {
            return p0Var.a(0, 0, n.f49619f);
        }
        H1.p pVarB = H1.q.b(textLayoutResultN.z(rangeJ.h(), rangeJ.f()).getBounds());
        return p0Var.a(pVarB.j(), pVarB.e(), new l(pVarB));
    }
}
