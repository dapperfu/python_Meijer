package androidx.compose.foundation.text;

import V0.AbstractC5324i0;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.C5775b;
import androidx.compose.ui.layout.InterfaceC5791s;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.W1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import e1.C13602b;
import java.util.List;
import kotlin.C13794L;
import kotlin.C17693B;
import kotlin.C17705N;
import kotlin.C17708Q;
import kotlin.C17709S;
import kotlin.EnumC13827z;
import kotlin.EnumC17740z;
import kotlin.InterfaceC17727m;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.SelectionHandleInfo;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p0.InterfaceC16183a;
import qv.C16623P;
import qv.C16648k;
import qv.EnumC16624Q;
import qv.InterfaceC16622O;
import r1.C16705m;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import u1.TextLayoutResult;
import z1.InterfaceC18354E;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001aò\u0001\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112)\b\u0002\u0010 \u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0001¢\u0006\u0004\b#\u0010$\u001a-\u0010(\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0003¢\u0006\u0004\b(\u0010)\u001a#\u0010,\u001a\u00020\u0005*\u00020\u00052\u0006\u0010+\u001a\u00020*2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b,\u0010-\u001a'\u00101\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0011H\u0000¢\u0006\u0004\b1\u00102\u001a7\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u0002032\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108\u001a\u0017\u00109\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b9\u0010:\u001a4\u0010?\u001a\u00020\u0003*\u00020;2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0080@¢\u0006\u0004\b?\u0010@\u001a\u001f\u0010B\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\u0006\u0010A\u001a\u00020\u0011H\u0003¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010D\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\bD\u0010E\u001a'\u0010F\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\bF\u0010G¨\u0006I²\u0006\f\u0010H\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lz1/M;", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/z;", "textStyle", "Lz1/W;", "visualTransformation", "Lu1/v;", "onTextLayout", "Lh0/l;", "interactionSource", "LV0/i0;", "cursorBrush", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/foundation/text/z;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", "innerTextField", "decorationBox", "Landroidx/compose/foundation/text/d0;", "textScrollerPosition", "a", "(Lz1/M;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/z;Lz1/W;Lkotlin/jvm/functions/Function1;Lh0/l;LV0/i0;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/z;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/text/d0;Landroidx/compose/runtime/Composer;III)V", "Lw0/Q;", "manager", "content", "c", "(Landroidx/compose/ui/Modifier;Lw0/Q;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/B;", "state", "o", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/B;Lw0/Q;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/y;", "focusRequester", "allowKeyboard", "q", "(Landroidx/compose/foundation/text/B;Landroidx/compose/ui/focus/y;Z)V", "Lz1/O;", "textInputService", "Lz1/E;", "offsetMapping", "p", "(Lz1/O;Landroidx/compose/foundation/text/B;Lz1/M;Landroidx/compose/ui/text/input/ImeOptions;Lz1/E;)V", "m", "(Landroidx/compose/foundation/text/B;)V", "Lp0/a;", "Landroidx/compose/foundation/text/N;", "textDelegate", "textLayoutResult", "l", "(Lp0/a;Lz1/M;Landroidx/compose/foundation/text/N;Lu1/v;Lz1/E;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "show", "d", "(Lw0/Q;ZLandroidx/compose/runtime/Composer;I)V", "e", "(Lw0/Q;Landroidx/compose/runtime/Composer;I)V", "n", "(Landroidx/compose/foundation/text/B;Lz1/M;Lz1/E;)V", "writeable", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CoreTextFieldKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f49035f = new a();

        a() {
            super(1);
        }

        public final void a(TextLayoutResult textLayoutResult) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", l = {347}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f49036a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f49037b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z1<Boolean> f49038c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z1.O f49039d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C17708Q f49040e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ImeOptions f49041f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<Boolean> f49042f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z1<Boolean> z1Var) {
                super(0);
                this.f49042f = z1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(CoreTextFieldKt.b(this.f49042f));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "writeable", "", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$b$b, reason: collision with other inner class name */
        static final class C1004b<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f49043a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1.O f49044b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17708Q f49045c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ImeOptions f49046d;

            C1004b(B b10, z1.O o10, C17708Q c17708q, ImeOptions imeOptions) {
                this.f49043a = b10;
                this.f49044b = o10;
                this.f49045c = c17708q;
                this.f49046d = imeOptions;
            }

            public final Object a(boolean z10, Continuation<? super Unit> continuation) {
                if (z10 && this.f49043a.f()) {
                    CoreTextFieldKt.p(this.f49044b, this.f49043a, this.f49045c.U(), this.f49046d, this.f49045c.getOffsetMapping());
                } else {
                    CoreTextFieldKt.m(this.f49043a);
                }
                return Unit.f142422a;
            }

            @Override // tv.InterfaceC17153g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f49037b, this.f49038c, this.f49039d, this.f49040e, this.f49041f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B b10, z1<Boolean> z1Var, z1.O o10, C17708Q c17708q, ImeOptions imeOptions, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f49037b = b10;
            this.f49038c = z1Var;
            this.f49039d = o10;
            this.f49040e = c17708q;
            this.f49041f = imeOptions;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f49036a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17152f interfaceC17152fQ = o1.q(new a(this.f49038c));
                    C1004b c1004b = new C1004b(this.f49037b, this.f49039d, this.f49040e, this.f49041f);
                    this.f49036a = 1;
                    if (interfaceC17152fQ.collect(c1004b, this) == objF) {
                        return objF;
                    }
                }
                CoreTextFieldKt.m(this.f49037b);
                return Unit.f142422a;
            } catch (Throwable th2) {
                CoreTextFieldKt.m(this.f49037b);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class c extends Lambda implements Function1<androidx.compose.runtime.F, androidx.compose.runtime.E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17708Q f49047f;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/foundation/text/CoreTextFieldKt$c$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements androidx.compose.runtime.E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C17708Q f49048a;

            public a(C17708Q c17708q) {
                this.f49048a = c17708q;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f49048a.X();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C17708Q c17708q) {
            super(1);
            this.f49047f = c17708q;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.E invoke(androidx.compose.runtime.F f10) {
            return new a(this.f49047f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class d extends Lambda implements Function1<androidx.compose.runtime.F, androidx.compose.runtime.E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49049f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1.O f49050g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49051h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ImeOptions f49052i;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/foundation/text/CoreTextFieldKt$d$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements androidx.compose.runtime.E {
            @Override // androidx.compose.runtime.E
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(B b10, z1.O o10, TextFieldValue textFieldValue, ImeOptions imeOptions) {
            super(1);
            this.f49049f = b10;
            this.f49050g = o10;
            this.f49051h = textFieldValue;
            this.f49052i = imeOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.E invoke(androidx.compose.runtime.F f10) {
            if (this.f49049f.f()) {
                B b10 = this.f49049f;
                b10.H(T.INSTANCE.i(this.f49050g, this.f49051h, b10.getProcessor(), this.f49052i, this.f49049f.o(), this.f49049f.n()));
            }
            return new a();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f49053f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B f49054g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextStyle f49055h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f49056i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f49057j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ d0 f49058k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49059l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ z1.W f49060m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Modifier f49061n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Modifier f49062o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Modifier f49063p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Modifier f49064q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC16183a f49065r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ C17708Q f49066s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f49067t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f49068u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49069v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ InterfaceC18354E f49070w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ H1.d f49071x;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ B f49072f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ TextStyle f49073g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f49074h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f49075i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ d0 f49076j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ TextFieldValue f49077k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ z1.W f49078l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Modifier f49079m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Modifier f49080n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Modifier f49081o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ Modifier f49082p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC16183a f49083q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ C17708Q f49084r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ boolean f49085s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ boolean f49086t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ Function1<TextLayoutResult, Unit> f49087u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ InterfaceC18354E f49088v;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ H1.d f49089w;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$e$a$a, reason: collision with other inner class name */
            static final class C1005a extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C17708Q f49090f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ B f49091g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ boolean f49092h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ boolean f49093i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ Function1<TextLayoutResult, Unit> f49094j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ TextFieldValue f49095k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ InterfaceC18354E f49096l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ H1.d f49097m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ int f49098n;

                @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"androidx/compose/foundation/text/CoreTextFieldKt$e$a$a$a", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "", "height", "e", "(Landroidx/compose/ui/layout/s;Ljava/util/List;I)I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$e$a$a$a, reason: collision with other inner class name */
                public static final class C1006a implements MeasurePolicy {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ B f49099a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Function1<TextLayoutResult, Unit> f49100b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ TextFieldValue f49101c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ InterfaceC18354E f49102d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ H1.d f49103e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ int f49104f;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$e$a$a$a$a, reason: collision with other inner class name */
                    static final class C1007a extends Lambda implements Function1<f0.a, Unit> {

                        /* renamed from: f, reason: collision with root package name */
                        public static final C1007a f49105f = new C1007a();

                        C1007a() {
                            super(1);
                        }

                        public final void a(f0.a aVar) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                            a(aVar);
                            return Unit.f142422a;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    C1006a(B b10, Function1<? super TextLayoutResult, Unit> function1, TextFieldValue textFieldValue, InterfaceC18354E interfaceC18354E, H1.d dVar, int i10) {
                        this.f49099a = b10;
                        this.f49100b = function1;
                        this.f49101c = textFieldValue;
                        this.f49102d = interfaceC18354E;
                        this.f49103e = dVar;
                        this.f49104f = i10;
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K k10, List<? extends androidx.compose.ui.layout.I> list, long j10) {
                        g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
                        B b10 = this.f49099a;
                        androidx.compose.runtime.snapshots.g gVarD = companion.d();
                        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
                        androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
                        try {
                            h0 h0VarL = b10.l();
                            TextLayoutResult value = h0VarL != null ? h0VarL.getValue() : null;
                            Triple<Integer, Integer, TextLayoutResult> tripleD = T.INSTANCE.d(this.f49099a.getTextDelegate(), j10, k10.getLayoutDirection(), value);
                            int iIntValue = tripleD.a().intValue();
                            int iIntValue2 = tripleD.b().intValue();
                            TextLayoutResult textLayoutResultC = tripleD.c();
                            if (!Intrinsics.e(value, textLayoutResultC)) {
                                this.f49099a.K(new h0(textLayoutResultC, null, h0VarL != null ? h0VarL.getDecorationBoxCoordinates() : null, 2, null));
                                this.f49100b.invoke(textLayoutResultC);
                                CoreTextFieldKt.n(this.f49099a, this.f49101c, this.f49102d);
                            }
                            this.f49099a.L(this.f49103e.K(this.f49104f == 1 ? O.a(textLayoutResultC.m(0)) : 0));
                            return k10.g1(iIntValue, iIntValue2, MapsKt.o(TuplesKt.a(C5775b.a(), Integer.valueOf(Math.round(textLayoutResultC.getFirstBaseline()))), TuplesKt.a(C5775b.b(), Integer.valueOf(Math.round(textLayoutResultC.getLastBaseline())))), C1007a.f49105f);
                        } finally {
                            companion.l(gVarD, gVarE, function1G);
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int e(InterfaceC5791s interfaceC5791s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
                        this.f49099a.getTextDelegate().m(interfaceC5791s.getLayoutDirection());
                        return this.f49099a.getTextDelegate().c();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1005a(C17708Q c17708q, B b10, boolean z10, boolean z11, Function1<? super TextLayoutResult, Unit> function1, TextFieldValue textFieldValue, InterfaceC18354E interfaceC18354E, H1.d dVar, int i10) {
                    super(2);
                    this.f49090f = c17708q;
                    this.f49091g = b10;
                    this.f49092h = z10;
                    this.f49093i = z11;
                    this.f49094j = function1;
                    this.f49095k = textFieldValue;
                    this.f49096l = interfaceC18354E;
                    this.f49097m = dVar;
                    this.f49098n = i10;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(androidx.compose.runtime.Composer r13, int r14) {
                    /*
                        r12 = this;
                        r0 = r14 & 3
                        r1 = 2
                        r2 = 1
                        r3 = 0
                        if (r0 == r1) goto L9
                        r0 = r2
                        goto La
                    L9:
                        r0 = r3
                    La:
                        r1 = r14 & 1
                        boolean r0 = r13.p(r0, r1)
                        if (r0 == 0) goto L101
                        boolean r0 = androidx.compose.runtime.ComposerKt.M()
                        if (r0 == 0) goto L21
                        r0 = -1
                        java.lang.String r1 = "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:579)"
                        r4 = -1172467467(0xffffffffba1d90f5, float:-6.010675E-4)
                        androidx.compose.runtime.ComposerKt.U(r4, r14, r0, r1)
                    L21:
                        androidx.compose.foundation.text.CoreTextFieldKt$e$a$a$a r5 = new androidx.compose.foundation.text.CoreTextFieldKt$e$a$a$a
                        androidx.compose.foundation.text.B r6 = r12.f49091g
                        kotlin.jvm.functions.Function1<u1.v, kotlin.Unit> r7 = r12.f49094j
                        z1.M r8 = r12.f49095k
                        z1.E r9 = r12.f49096l
                        H1.d r10 = r12.f49097m
                        int r11 = r12.f49098n
                        r5.<init>(r6, r7, r8, r9, r10, r11)
                        androidx.compose.ui.Modifier$a r14 = androidx.compose.ui.Modifier.INSTANCE
                        int r0 = androidx.compose.runtime.C5717f.a(r13, r3)
                        androidx.compose.runtime.s r1 = r13.r()
                        androidx.compose.ui.Modifier r14 = androidx.compose.ui.b.e(r13, r14)
                        androidx.compose.ui.node.g$a r4 = androidx.compose.ui.node.InterfaceC5811g.INSTANCE
                        kotlin.jvm.functions.Function0 r6 = r4.a()
                        androidx.compose.runtime.Applier r7 = r13.k()
                        if (r7 != 0) goto L4f
                        androidx.compose.runtime.C5717f.c()
                    L4f:
                        r13.F()
                        boolean r7 = r13.getInserting()
                        if (r7 == 0) goto L5c
                        r13.I(r6)
                        goto L5f
                    L5c:
                        r13.s()
                    L5f:
                        androidx.compose.runtime.Composer r6 = androidx.compose.runtime.D1.a(r13)
                        kotlin.jvm.functions.Function2 r7 = r4.e()
                        androidx.compose.runtime.D1.c(r6, r5, r7)
                        kotlin.jvm.functions.Function2 r5 = r4.g()
                        androidx.compose.runtime.D1.c(r6, r1, r5)
                        kotlin.jvm.functions.Function2 r1 = r4.b()
                        boolean r5 = r6.getInserting()
                        if (r5 != 0) goto L89
                        java.lang.Object r5 = r6.B()
                        java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
                        boolean r5 = kotlin.jvm.internal.Intrinsics.e(r5, r7)
                        if (r5 != 0) goto L97
                    L89:
                        java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                        r6.t(r5)
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        r6.n(r0, r1)
                    L97:
                        kotlin.jvm.functions.Function2 r0 = r4.f()
                        androidx.compose.runtime.D1.c(r6, r14, r0)
                        r13.v()
                        w0.Q r14 = r12.f49090f
                        androidx.compose.foundation.text.B r0 = r12.f49091g
                        androidx.compose.foundation.text.o r0 = r0.e()
                        androidx.compose.foundation.text.o r1 = androidx.compose.foundation.text.EnumC5683o.f49697a
                        if (r0 == r1) goto Lc9
                        androidx.compose.foundation.text.B r0 = r12.f49091g
                        androidx.compose.ui.layout.LayoutCoordinates r0 = r0.k()
                        if (r0 == 0) goto Lc9
                        androidx.compose.foundation.text.B r0 = r12.f49091g
                        androidx.compose.ui.layout.LayoutCoordinates r0 = r0.k()
                        kotlin.jvm.internal.Intrinsics.g(r0)
                        boolean r0 = r0.isAttached()
                        if (r0 == 0) goto Lc9
                        boolean r0 = r12.f49092h
                        if (r0 == 0) goto Lc9
                        goto Lca
                    Lc9:
                        r2 = r3
                    Lca:
                        androidx.compose.foundation.text.CoreTextFieldKt.h(r14, r2, r13, r3)
                        androidx.compose.foundation.text.B r14 = r12.f49091g
                        androidx.compose.foundation.text.o r14 = r14.e()
                        androidx.compose.foundation.text.o r0 = androidx.compose.foundation.text.EnumC5683o.f49699c
                        if (r14 != r0) goto Lee
                        boolean r14 = r12.f49093i
                        if (r14 != 0) goto Lee
                        boolean r14 = r12.f49092h
                        if (r14 == 0) goto Lee
                        r14 = -7167858(0xffffffffff92a08e, float:NaN)
                        r13.startReplaceGroup(r14)
                        w0.Q r14 = r12.f49090f
                        androidx.compose.foundation.text.CoreTextFieldKt.e(r14, r13, r3)
                        r13.P()
                        goto Lf7
                    Lee:
                        r14 = -7090978(0xffffffffff93ccde, float:NaN)
                        r13.startReplaceGroup(r14)
                        r13.P()
                    Lf7:
                        boolean r13 = androidx.compose.runtime.ComposerKt.M()
                        if (r13 == 0) goto L100
                        androidx.compose.runtime.ComposerKt.T()
                    L100:
                        return
                    L101:
                        r13.K()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.e.a.C1005a.a(androidx.compose.runtime.Composer, int):void");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/h0;", "c", "()Landroidx/compose/foundation/text/h0;"}, k = 3, mv = {1, 9, 0})
            static final class b extends Lambda implements Function0<h0> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ B f49106f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(B b10) {
                    super(0);
                    this.f49106f = b10;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final h0 invoke() {
                    return this.f49106f.l();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(B b10, TextStyle textStyle, int i10, int i11, d0 d0Var, TextFieldValue textFieldValue, z1.W w10, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, InterfaceC16183a interfaceC16183a, C17708Q c17708q, boolean z10, boolean z11, Function1<? super TextLayoutResult, Unit> function1, InterfaceC18354E interfaceC18354E, H1.d dVar) {
                super(2);
                this.f49072f = b10;
                this.f49073g = textStyle;
                this.f49074h = i10;
                this.f49075i = i11;
                this.f49076j = d0Var;
                this.f49077k = textFieldValue;
                this.f49078l = w10;
                this.f49079m = modifier;
                this.f49080n = modifier2;
                this.f49081o = modifier3;
                this.f49082p = modifier4;
                this.f49083q = interfaceC16183a;
                this.f49084r = c17708q;
                this.f49085s = z10;
                this.f49086t = z11;
                this.f49087u = function1;
                this.f49088v = interfaceC18354E;
                this.f49089w = dVar;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1835647873, i10, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:558)");
                }
                Modifier modifierA = C5684p.a(androidx.compose.foundation.layout.J.k(Modifier.INSTANCE, this.f49072f.m(), 0.0f, 2, null), this.f49073g, this.f49074h, this.f49075i);
                d0 d0Var = this.f49076j;
                TextFieldValue textFieldValue = this.f49077k;
                z1.W w10 = this.f49078l;
                boolean zD = composer.D(this.f49072f);
                B b10 = this.f49072f;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new b(b10);
                    composer.t(objB);
                }
                C17705N.a(androidx.compose.foundation.relocation.b.b(f0.a(c0.a(modifierA, d0Var, textFieldValue, w10, (Function0) objB).then(this.f49079m).then(this.f49080n), this.f49073g).then(this.f49081o).then(this.f49082p), this.f49083q), ComposableLambdaKt.c(-1172467467, true, new C1005a(this.f49084r, this.f49072f, this.f49085s, this.f49086t, this.f49087u, this.f49077k, this.f49088v, this.f49089w, this.f49075i), composer, 54), composer, 48, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, B b10, TextStyle textStyle, int i10, int i11, d0 d0Var, TextFieldValue textFieldValue, z1.W w10, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, InterfaceC16183a interfaceC16183a, C17708Q c17708q, boolean z10, boolean z11, Function1<? super TextLayoutResult, Unit> function1, InterfaceC18354E interfaceC18354E, H1.d dVar) {
            super(2);
            this.f49053f = function3;
            this.f49054g = b10;
            this.f49055h = textStyle;
            this.f49056i = i10;
            this.f49057j = i11;
            this.f49058k = d0Var;
            this.f49059l = textFieldValue;
            this.f49060m = w10;
            this.f49061n = modifier;
            this.f49062o = modifier2;
            this.f49063p = modifier3;
            this.f49064q = modifier4;
            this.f49065r = interfaceC16183a;
            this.f49066s = c17708q;
            this.f49067t = z10;
            this.f49068u = z11;
            this.f49069v = function1;
            this.f49070w = interfaceC18354E;
            this.f49071x = dVar;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-492537660, i10, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:555)");
            }
            this.f49053f.invoke(ComposableLambdaKt.c(-1835647873, true, new a(this.f49054g, this.f49055h, this.f49056i, this.f49057j, this.f49058k, this.f49059l, this.f49060m, this.f49061n, this.f49062o, this.f49063p, this.f49064q, this.f49065r, this.f49066s, this.f49067t, this.f49068u, this.f49069v, this.f49070w, this.f49071x), composer, 54), composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49107f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<TextFieldValue, Unit> f49108g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f49109h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ TextStyle f49110i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ z1.W f49111j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49112k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ h0.l f49113l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ AbstractC5324i0 f49114m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f49115n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f49116o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f49117p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ImeOptions f49118q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ C5693z f49119r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f49120s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f49121t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f49122u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ d0 f49123v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f49124w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f49125x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f49126y;

        public final void a(Composer composer, int i10) {
            CoreTextFieldKt.a(this.f49107f, this.f49108g, this.f49109h, this.f49110i, this.f49111j, this.f49112k, this.f49113l, this.f49114m, this.f49115n, this.f49116o, this.f49117p, this.f49118q, this.f49119r, this.f49120s, this.f49121t, this.f49122u, this.f49123v, composer, J0.a(this.f49124w | 1), J0.a(this.f49125x), this.f49126y);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, Modifier modifier, TextStyle textStyle, z1.W w10, Function1<? super TextLayoutResult, Unit> function12, h0.l lVar, AbstractC5324i0 abstractC5324i0, boolean z10, int i10, int i11, ImeOptions imeOptions, C5693z c5693z, boolean z11, boolean z12, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, d0 d0Var, int i12, int i13, int i14) {
            super(2);
            this.f49107f = textFieldValue;
            this.f49108g = function1;
            this.f49109h = modifier;
            this.f49110i = textStyle;
            this.f49111j = w10;
            this.f49112k = function12;
            this.f49113l = lVar;
            this.f49114m = abstractC5324i0;
            this.f49115n = z10;
            this.f49116o = i10;
            this.f49117p = i11;
            this.f49118q = imeOptions;
            this.f49119r = c5693z;
            this.f49120s = z11;
            this.f49121t = z12;
            this.f49122u = function3;
            this.f49123v = d0Var;
            this.f49124w = i12;
            this.f49125x = i13;
            this.f49126y = i14;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "it", "", "a", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49127f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(B b10) {
            super(1);
            this.f49127f = b10;
        }

        public final void a(LayoutCoordinates layoutCoordinates) {
            h0 h0VarL = this.f49127f.l();
            if (h0VarL == null) {
                return;
            }
            h0VarL.h(layoutCoordinates);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            a(layoutCoordinates);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49128f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f49129g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(B b10, long j10) {
            super(1);
            this.f49128f = b10;
            this.f49129g = j10;
        }

        public final void a(X0.f fVar) {
            if (this.f49128f.c() || this.f49128f.i()) {
                X0.f.i1(fVar, this.f49129g, 0L, 0L, 0.0f, null, null, 0, 126, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class i extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49130f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49131g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC18354E f49132h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(B b10, TextFieldValue textFieldValue, InterfaceC18354E interfaceC18354E) {
            super(1);
            this.f49130f = b10;
            this.f49131g = textFieldValue;
            this.f49132h = interfaceC18354E;
        }

        public final void a(X0.f fVar) {
            h0 h0VarL = this.f49130f.l();
            if (h0VarL != null) {
                TextFieldValue textFieldValue = this.f49131g;
                B b10 = this.f49130f;
                InterfaceC18354E interfaceC18354E = this.f49132h;
                T.INSTANCE.b(fVar.getDrawContext().g(), textFieldValue, b10.s(), b10.d(), interfaceC18354E, h0VarL.getValue(), b10.getHighlightPaint(), b10.getSelectionBackgroundColor());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "it", "", "a", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49133f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f49134g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ W1 f49135h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C17708Q f49136i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49137j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC18354E f49138k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(B b10, boolean z10, W1 w12, C17708Q c17708q, TextFieldValue textFieldValue, InterfaceC18354E interfaceC18354E) {
            super(1);
            this.f49133f = b10;
            this.f49134g = z10;
            this.f49135h = w12;
            this.f49136i = c17708q;
            this.f49137j = textFieldValue;
            this.f49138k = interfaceC18354E;
        }

        public final void a(LayoutCoordinates layoutCoordinates) {
            this.f49133f.J(layoutCoordinates);
            h0 h0VarL = this.f49133f.l();
            if (h0VarL != null) {
                h0VarL.i(layoutCoordinates);
            }
            if (this.f49134g) {
                if (this.f49133f.e() == EnumC5683o.f49698b) {
                    if (this.f49133f.u() && this.f49135h.b()) {
                        this.f49136i.t0();
                    } else {
                        this.f49136i.X();
                    }
                    this.f49133f.Q(C17709S.c(this.f49136i, true));
                    this.f49133f.P(C17709S.c(this.f49136i, false));
                    this.f49133f.N(androidx.compose.ui.text.y.h(this.f49137j.getSelection()));
                } else if (this.f49133f.e() == EnumC5683o.f49699c) {
                    this.f49133f.N(C17709S.c(this.f49136i, true));
                }
                CoreTextFieldKt.n(this.f49133f, this.f49137j, this.f49138k);
                h0 h0VarL2 = this.f49133f.l();
                if (h0VarL2 != null) {
                    B b10 = this.f49133f;
                    TextFieldValue textFieldValue = this.f49137j;
                    InterfaceC18354E interfaceC18354E = this.f49138k;
                    z1.T inputSession = b10.getInputSession();
                    if (inputSession == null || !b10.f()) {
                        return;
                    }
                    T.INSTANCE.k(inputSession, textFieldValue, interfaceC18354E, h0VarL2);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            a(layoutCoordinates);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Z)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49139f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(B b10) {
            super(1);
            this.f49139f = b10;
        }

        public final void a(boolean z10) {
            this.f49139f.G(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "offset", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends Lambda implements Function1<U0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49140f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f49141g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f49142h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f49143i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C17708Q f49144j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC18354E f49145k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(B b10, androidx.compose.ui.focus.y yVar, boolean z10, boolean z11, C17708Q c17708q, InterfaceC18354E interfaceC18354E) {
            super(1);
            this.f49140f = b10;
            this.f49141g = yVar;
            this.f49142h = z10;
            this.f49143i = z11;
            this.f49144j = c17708q;
            this.f49145k = interfaceC18354E;
        }

        public final void a(long j10) {
            CoreTextFieldKt.q(this.f49140f, this.f49141g, !this.f49142h);
            if (this.f49140f.f() && this.f49143i) {
                if (this.f49140f.e() == EnumC5683o.f49698b) {
                    this.f49144j.v(U0.f.d(j10));
                    return;
                }
                h0 h0VarL = this.f49140f.l();
                if (h0VarL != null) {
                    B b10 = this.f49140f;
                    T.INSTANCE.j(j10, h0VarL, b10.getProcessor(), this.f49145k, b10.o());
                    if (b10.getTextDelegate().getText().length() > 0) {
                        b10.E(EnumC5683o.f49699c);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
            a(fVar.getPackedValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/d0;", "c", "()Landroidx/compose/foundation/text/d0;"}, k = 3, mv = {1, 9, 0})
    static final class m extends Lambda implements Function0<d0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC13827z f49146f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(EnumC13827z enumC13827z) {
            super(0);
            this.f49146f = enumC13827z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            return new d0(this.f49146f, 0.0f, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class n extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f49147f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ u0.q0 f49148g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z10, u0.q0 q0Var) {
            super(0);
            this.f49147f = z10;
            this.f49148g = q0Var;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f49147f) {
                this.f49148g.k();
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f49149f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C17708Q f49150g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f49151h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f49152i;

        public final void a(Composer composer, int i10) {
            CoreTextFieldKt.c(this.f49149f, this.f49150g, this.f49151h, composer, J0.a(this.f49152i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(Modifier modifier, C17708Q c17708q, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f49149f = modifier;
            this.f49150g = c17708q;
            this.f49151h = function2;
            this.f49152i = i10;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class p extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17708Q f49153f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f49154g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f49155h;

        public final void a(Composer composer, int i10) {
            CoreTextFieldKt.d(this.f49153f, this.f49154g, composer, J0.a(this.f49155h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(C17708Q c17708q, boolean z10, int i10) {
            super(2);
            this.f49153f = c17708q;
            this.f49154g = z10;
            this.f49155h = i10;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/f;", "a", "()J"}, k = 3, mv = {1, 9, 0})
    static final class q implements InterfaceC17727m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f49156a;

        q(long j10) {
            this.f49156a = j10;
        }

        @Override // kotlin.InterfaceC17727m
        public final long a() {
            return this.f49156a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class r implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P f49157a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17708Q f49158b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f49159a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f49160b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ g1.J f49161c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ P f49162d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C17708Q f49163e;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1078}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$r$a$a, reason: collision with other inner class name */
            static final class C1008a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f49164a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ g1.J f49165b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ P f49166c;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1008a(this.f49165b, this.f49166c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1008a(g1.J j10, P p10, Continuation<? super C1008a> continuation) {
                    super(2, continuation);
                    this.f49165b = j10;
                    this.f49166c = p10;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C1008a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f49164a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        g1.J j10 = this.f49165b;
                        P p10 = this.f49166c;
                        this.f49164a = 1;
                        if (E.c(j10, p10, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1081}, m = "invokeSuspend")
            static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f49167a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ g1.J f49168b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17708Q f49169c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
                /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$r$a$b$a, reason: collision with other inner class name */
                static final class C1009a extends Lambda implements Function1<U0.f, Unit> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ C17708Q f49170f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1009a(C17708Q c17708q) {
                        super(1);
                        this.f49170f = c17708q;
                    }

                    public final void a(long j10) {
                        this.f49170f.t0();
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
                        a(fVar.getPackedValue());
                        return Unit.f142422a;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f49168b, this.f49169c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(g1.J j10, C17708Q c17708q, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f49168b = j10;
                    this.f49169c = c17708q;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f49167a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        g1.J j10 = this.f49168b;
                        C1009a c1009a = new C1009a(this.f49169c);
                        this.f49167a = 1;
                        if (C13794L.m(j10, null, null, null, c1009a, this, 7, null) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f49161c, this.f49162d, this.f49163e, continuation);
                aVar.f49160b = obj;
                return aVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g1.J j10, P p10, C17708Q c17708q, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f49161c = j10;
                this.f49162d = p10;
                this.f49163e = c17708q;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f49159a == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f49160b;
                    EnumC16624Q enumC16624Q = EnumC16624Q.f157614d;
                    C16648k.d(interfaceC16622O, null, enumC16624Q, new C1008a(this.f49161c, this.f49162d, null), 1, null);
                    C16648k.d(interfaceC16622O, null, enumC16624Q, new b(this.f49161c, this.f49163e, null), 1, null);
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        r(P p10, C17708Q c17708q) {
            this.f49157a = p10;
            this.f49158b = c17708q;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
            Object objG = C16623P.g(new a(j10, this.f49157a, this.f49158b, null), continuation);
            return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    static final class s extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f49171f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(long j10) {
            super(1);
            this.f49171f = j10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f142422a;
        }

        public final void a(r1.u uVar) {
            uVar.a(C17693B.d(), new SelectionHandleInfo(EnumC5682n.f49690a, this.f49171f, EnumC17740z.f165633b, true, null));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class t extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17708Q f49172f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f49173g;

        public final void a(Composer composer, int i10) {
            CoreTextFieldKt.e(this.f49172f, composer, J0.a(this.f49173g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(C17708Q c17708q, int i10) {
            super(2);
            this.f49172f = c17708q;
            this.f49173g = i10;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le1/b;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class u extends Lambda implements Function1<C13602b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49174f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C17708Q f49175g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(B b10, C17708Q c17708q) {
            super(1);
            this.f49174f = b10;
            this.f49175g = c17708q;
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z10;
            if (this.f49174f.e() == EnumC5683o.f49698b && C5687t.a(keyEvent)) {
                z10 = true;
                C17708Q.w(this.f49175g, null, 1, null);
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(C13602b c13602b) {
            return a(c13602b.getNativeKeyEvent());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:497:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(z1.TextFieldValue r48, kotlin.jvm.functions.Function1<? super z1.TextFieldValue, kotlin.Unit> r49, androidx.compose.ui.Modifier r50, androidx.compose.ui.text.TextStyle r51, z1.W r52, kotlin.jvm.functions.Function1<? super u1.TextLayoutResult, kotlin.Unit> r53, h0.l r54, V0.AbstractC5324i0 r55, boolean r56, int r57, int r58, androidx.compose.ui.text.input.ImeOptions r59, androidx.compose.foundation.text.C5693z r60, boolean r61, boolean r62, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r63, androidx.compose.foundation.text.d0 r64, androidx.compose.runtime.Composer r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instructions count: 2728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.a(z1.M, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.z, z1.W, kotlin.jvm.functions.Function1, h0.l, V0.i0, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.z, boolean, boolean, kotlin.jvm.functions.Function3, androidx.compose.foundation.text.d0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(B b10, TextFieldValue textFieldValue, InterfaceC18354E interfaceC18354E) {
        g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
        androidx.compose.runtime.snapshots.g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
        try {
            h0 h0VarL = b10.l();
            if (h0VarL == null) {
                return;
            }
            z1.T inputSession = b10.getInputSession();
            if (inputSession == null) {
                return;
            }
            LayoutCoordinates layoutCoordinatesK = b10.k();
            if (layoutCoordinatesK == null) {
                return;
            }
            T.INSTANCE.e(textFieldValue, b10.getTextDelegate(), h0VarL.getValue(), layoutCoordinatesK, inputSession, b10.f(), interfaceC18354E);
            Unit unit = Unit.f142422a;
        } finally {
            companion.l(gVarD, gVarE, function1G);
        }
    }

    private static final Modifier o(Modifier modifier, B b10, C17708Q c17708q) {
        return androidx.compose.ui.input.key.b.b(modifier, new u(b10, c17708q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(z1.O o10, B b10, TextFieldValue textFieldValue, ImeOptions imeOptions, InterfaceC18354E interfaceC18354E) {
        b10.H(T.INSTANCE.h(o10, textFieldValue, b10.getProcessor(), imeOptions, b10.o(), b10.n()));
        n(b10, textFieldValue, interfaceC18354E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Modifier modifier, C17708Q c17708q, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-20551815);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(c17708q)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-20551815, i11, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:668)");
            }
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), true);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
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
            C5678j.b(c17708q, function2, composerStartRestartGroup, (i11 >> 3) & 126);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new o(modifier, c17708q, function2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C17708Q c17708q, boolean z10, Composer composer, int i10) {
        int i11;
        boolean z11;
        h0 h0VarL;
        TextLayoutResult value;
        boolean isLayoutResultStale;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(626339208);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(c17708q)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.a(z10)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (composerStartRestartGroup.p(z11, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(626339208, i11, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1018)");
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(-1290924834);
                B state = c17708q.getState();
                TextLayoutResult textLayoutResult = null;
                if (state != null && (h0VarL = state.l()) != null && (value = h0VarL.getValue()) != null) {
                    B state2 = c17708q.getState();
                    if (state2 != null) {
                        isLayoutResultStale = state2.getIsLayoutResultStale();
                    } else {
                        isLayoutResultStale = true;
                    }
                    if (!isLayoutResultStale) {
                        textLayoutResult = value;
                    }
                }
                if (textLayoutResult == null) {
                    composerStartRestartGroup.startReplaceGroup(-1290601288);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1290601287);
                    if (!androidx.compose.ui.text.y.h(c17708q.U().getSelection())) {
                        composerStartRestartGroup.startReplaceGroup(-1685230508);
                        int iB = c17708q.getOffsetMapping().b(androidx.compose.ui.text.y.n(c17708q.U().getSelection()));
                        int iB2 = c17708q.getOffsetMapping().b(androidx.compose.ui.text.y.i(c17708q.U().getSelection()));
                        F1.i iVarC = textLayoutResult.c(iB);
                        F1.i iVarC2 = textLayoutResult.c(Math.max(iB2 - 1, 0));
                        B state3 = c17708q.getState();
                        if (state3 != null && state3.w()) {
                            composerStartRestartGroup.startReplaceGroup(-1684812473);
                            C17709S.a(true, iVarC, c17708q, composerStartRestartGroup, ((i11 << 6) & 896) | 6);
                            composerStartRestartGroup.P();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1684548198);
                            composerStartRestartGroup.P();
                        }
                        B state4 = c17708q.getState();
                        if (state4 != null && state4.v()) {
                            composerStartRestartGroup.startReplaceGroup(-1684464312);
                            C17709S.a(false, iVarC2, c17708q, composerStartRestartGroup, ((i11 << 6) & 896) | 6);
                            composerStartRestartGroup.P();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1684200998);
                            composerStartRestartGroup.P();
                        }
                        composerStartRestartGroup.P();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1684179174);
                        composerStartRestartGroup.P();
                    }
                    B state5 = c17708q.getState();
                    if (state5 != null) {
                        if (c17708q.Y()) {
                            state5.O(false);
                        }
                        if (state5.f()) {
                            if (state5.u()) {
                                c17708q.t0();
                            } else {
                                c17708q.X();
                            }
                        }
                        Unit unit = Unit.f142422a;
                    }
                }
                composerStartRestartGroup.P();
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(651160447);
                composerStartRestartGroup.P();
                c17708q.X();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new p(c17708q, z10, i10));
        }
    }

    public static final void e(C17708Q c17708q, Composer composer, int i10) {
        int i11;
        boolean z10;
        AnnotatedString annotatedStringS;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1436003720);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(c17708q)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-1436003720, i11, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1065)");
            }
            B state = c17708q.getState();
            if (state != null && state.t() && (annotatedStringS = c17708q.S()) != null && annotatedStringS.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(-289940723);
                boolean zV = composerStartRestartGroup.V(c17708q);
                Object objB = composerStartRestartGroup.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = c17708q.t();
                    composerStartRestartGroup.t(objB);
                }
                P p10 = (P) objB;
                long jE = c17708q.E((H1.d) composerStartRestartGroup.o(C5892t0.g()));
                boolean zE = composerStartRestartGroup.e(jE);
                Object objB2 = composerStartRestartGroup.B();
                if (zE || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new q(jE);
                    composerStartRestartGroup.t(objB2);
                }
                InterfaceC17727m interfaceC17727m = (InterfaceC17727m) objB2;
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zD = composerStartRestartGroup.D(p10) | composerStartRestartGroup.D(c17708q);
                Object objB3 = composerStartRestartGroup.B();
                if (zD || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new r(p10, c17708q);
                    composerStartRestartGroup.t(objB3);
                }
                Modifier modifierC = g1.U.c(companion, p10, (PointerInputEventHandler) objB3);
                boolean zE2 = composerStartRestartGroup.e(jE);
                Object objB4 = composerStartRestartGroup.B();
                if (zE2 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new s(jE);
                    composerStartRestartGroup.t(objB4);
                }
                C5669a.a(interfaceC17727m, C16705m.d(modifierC, false, (Function1) objB4, 1, null), 0L, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-288632802);
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new t(c17708q, i10));
        }
    }

    public static final Object l(InterfaceC16183a interfaceC16183a, TextFieldValue textFieldValue, N n10, TextLayoutResult textLayoutResult, InterfaceC18354E interfaceC18354E, Continuation<? super Unit> continuation) {
        Rect rect;
        int iB = interfaceC18354E.b(androidx.compose.ui.text.y.k(textFieldValue.getSelection()));
        if (iB < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.d(iB);
        } else if (iB != 0) {
            rect = textLayoutResult.d(iB - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, (int) (U.b(n10.getStyle(), n10.getDensity(), n10.getFontFamilyResolver(), null, 0, 24, null) & 4294967295L));
        }
        Object objB = interfaceC16183a.b(rect, continuation);
        if (objB == IntrinsicsKt.f()) {
            return objB;
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(B b10) {
        z1.T inputSession = b10.getInputSession();
        if (inputSession != null) {
            T.INSTANCE.f(inputSession, b10.getProcessor(), b10.o());
        }
        b10.H(null);
    }

    public static final void q(B b10, androidx.compose.ui.focus.y yVar, boolean z10) {
        androidx.compose.ui.platform.D1 keyboardController;
        if (!b10.f()) {
            androidx.compose.ui.focus.y.h(yVar, 0, 1, null);
        } else if (z10 && (keyboardController = b10.getKeyboardController()) != null) {
            keyboardController.a();
        }
    }
}
