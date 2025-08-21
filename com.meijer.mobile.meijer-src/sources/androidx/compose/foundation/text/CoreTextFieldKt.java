package androidx.compose.foundation.text;

import V0.AbstractC5467i0;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.C5917b;
import androidx.compose.ui.layout.InterfaceC5933s;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.W1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeOptions;
import e1.C13750b;
import java.util.List;
import kotlin.C13904L;
import kotlin.C17763B;
import kotlin.C17775N;
import kotlin.C17778Q;
import kotlin.C17779S;
import kotlin.EnumC13937z;
import kotlin.EnumC17810z;
import kotlin.InterfaceC17797m;
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
import mv.C15784P;
import mv.C15809k;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;
import p0.InterfaceC16328a;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import r1.C16819m;
import u1.TextLayoutResult;
import z1.InterfaceC18417E;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001aò\u0001\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112)\b\u0002\u0010 \u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0001¢\u0006\u0004\b#\u0010$\u001a-\u0010(\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u001cH\u0003¢\u0006\u0004\b(\u0010)\u001a#\u0010,\u001a\u00020\u0005*\u00020\u00052\u0006\u0010+\u001a\u00020*2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b,\u0010-\u001a'\u00101\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0011H\u0000¢\u0006\u0004\b1\u00102\u001a7\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u0002032\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108\u001a\u0017\u00109\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b9\u0010:\u001a4\u0010?\u001a\u00020\u0003*\u00020;2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u000b2\u0006\u00106\u001a\u000205H\u0080@¢\u0006\u0004\b?\u0010@\u001a\u001f\u0010B\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\u0006\u0010A\u001a\u00020\u0011H\u0003¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010D\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\bD\u0010E\u001a'\u0010F\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\bF\u0010G¨\u0006I²\u0006\f\u0010H\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lz1/M;", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/z;", "textStyle", "Lz1/W;", "visualTransformation", "Lu1/v;", "onTextLayout", "Lh0/l;", "interactionSource", "LV0/i0;", "cursorBrush", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/foundation/text/z;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", "innerTextField", "decorationBox", "Landroidx/compose/foundation/text/d0;", "textScrollerPosition", "a", "(Lz1/M;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/z;Lz1/W;Lkotlin/jvm/functions/Function1;Lh0/l;LV0/i0;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/z;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/foundation/text/d0;Landroidx/compose/runtime/Composer;III)V", "Lw0/Q;", "manager", "content", "c", "(Landroidx/compose/ui/Modifier;Lw0/Q;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/B;", "state", "o", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/B;Lw0/Q;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/y;", "focusRequester", "allowKeyboard", "q", "(Landroidx/compose/foundation/text/B;Landroidx/compose/ui/focus/y;Z)V", "Lz1/O;", "textInputService", "Lz1/E;", "offsetMapping", "p", "(Lz1/O;Landroidx/compose/foundation/text/B;Lz1/M;Landroidx/compose/ui/text/input/ImeOptions;Lz1/E;)V", "m", "(Landroidx/compose/foundation/text/B;)V", "Lp0/a;", "Landroidx/compose/foundation/text/N;", "textDelegate", "textLayoutResult", "l", "(Lp0/a;Lz1/M;Landroidx/compose/foundation/text/N;Lu1/v;Lz1/E;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "show", "d", "(Lw0/Q;ZLandroidx/compose/runtime/Composer;I)V", "e", "(Lw0/Q;Landroidx/compose/runtime/Composer;I)V", "n", "(Landroidx/compose/foundation/text/B;Lz1/M;Lz1/E;)V", "writeable", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CoreTextFieldKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f49259f = new a();

        a() {
            super(1);
        }

        public final void a(TextLayoutResult textLayoutResult) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$2$1", f = "CoreTextField.kt", l = {347}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f49260a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f49261b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z1<Boolean> f49262c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z1.O f49263d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C17778Q f49264e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ImeOptions f49265f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<Boolean> f49266f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z1<Boolean> z1Var) {
                super(0);
                this.f49266f = z1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(CoreTextFieldKt.b(this.f49266f));
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "writeable", "", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$b$b, reason: collision with other inner class name */
        static final class C1017b<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f49267a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1.O f49268b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17778Q f49269c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ImeOptions f49270d;

            C1017b(B b10, z1.O o10, C17778Q c17778q, ImeOptions imeOptions) {
                this.f49267a = b10;
                this.f49268b = o10;
                this.f49269c = c17778q;
                this.f49270d = imeOptions;
            }

            public final Object a(boolean z10, Continuation<? super Unit> continuation) {
                if (z10 && this.f49267a.f()) {
                    CoreTextFieldKt.p(this.f49268b, this.f49267a, this.f49269c.U(), this.f49270d, this.f49269c.getOffsetMapping());
                } else {
                    CoreTextFieldKt.m(this.f49267a);
                }
                return Unit.f143329a;
            }

            @Override // pv.InterfaceC16562g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f49261b, this.f49262c, this.f49263d, this.f49264e, this.f49265f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(B b10, z1<Boolean> z1Var, z1.O o10, C17778Q c17778q, ImeOptions imeOptions, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f49261b = b10;
            this.f49262c = z1Var;
            this.f49263d = o10;
            this.f49264e = c17778q;
            this.f49265f = imeOptions;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f49260a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16561f interfaceC16561fQ = o1.q(new a(this.f49262c));
                    C1017b c1017b = new C1017b(this.f49261b, this.f49263d, this.f49264e, this.f49265f);
                    this.f49260a = 1;
                    if (interfaceC16561fQ.collect(c1017b, this) == objF) {
                        return objF;
                    }
                }
                CoreTextFieldKt.m(this.f49261b);
                return Unit.f143329a;
            } catch (Throwable th2) {
                CoreTextFieldKt.m(this.f49261b);
                throw th2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class c extends Lambda implements Function1<androidx.compose.runtime.F, androidx.compose.runtime.E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17778Q f49271f;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/foundation/text/CoreTextFieldKt$c$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements androidx.compose.runtime.E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C17778Q f49272a;

            public a(C17778Q c17778q) {
                this.f49272a = c17778q;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f49272a.X();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C17778Q c17778q) {
            super(1);
            this.f49271f = c17778q;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.E invoke(androidx.compose.runtime.F f10) {
            return new a(this.f49271f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class d extends Lambda implements Function1<androidx.compose.runtime.F, androidx.compose.runtime.E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49273f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1.O f49274g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49275h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ImeOptions f49276i;

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
            this.f49273f = b10;
            this.f49274g = o10;
            this.f49275h = textFieldValue;
            this.f49276i = imeOptions;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.E invoke(androidx.compose.runtime.F f10) {
            if (this.f49273f.f()) {
                B b10 = this.f49273f;
                b10.H(T.INSTANCE.i(this.f49274g, this.f49275h, b10.getProcessor(), this.f49276i, this.f49273f.o(), this.f49273f.n()));
            }
            return new a();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f49277f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B f49278g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextStyle f49279h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f49280i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f49281j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ d0 f49282k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49283l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ z1.W f49284m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Modifier f49285n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Modifier f49286o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Modifier f49287p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Modifier f49288q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC16328a f49289r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ C17778Q f49290s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f49291t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f49292u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49293v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ InterfaceC18417E f49294w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ H1.d f49295x;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ B f49296f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ TextStyle f49297g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f49298h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f49299i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ d0 f49300j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ TextFieldValue f49301k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ z1.W f49302l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Modifier f49303m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Modifier f49304n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Modifier f49305o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ Modifier f49306p;

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC16328a f49307q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ C17778Q f49308r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ boolean f49309s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ boolean f49310t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ Function1<TextLayoutResult, Unit> f49311u;

            /* renamed from: v, reason: collision with root package name */
            final /* synthetic */ InterfaceC18417E f49312v;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ H1.d f49313w;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$e$a$a, reason: collision with other inner class name */
            static final class C1018a extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ C17778Q f49314f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ B f49315g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ boolean f49316h;

                /* renamed from: i, reason: collision with root package name */
                final /* synthetic */ boolean f49317i;

                /* renamed from: j, reason: collision with root package name */
                final /* synthetic */ Function1<TextLayoutResult, Unit> f49318j;

                /* renamed from: k, reason: collision with root package name */
                final /* synthetic */ TextFieldValue f49319k;

                /* renamed from: l, reason: collision with root package name */
                final /* synthetic */ InterfaceC18417E f49320l;

                /* renamed from: m, reason: collision with root package name */
                final /* synthetic */ H1.d f49321m;

                /* renamed from: n, reason: collision with root package name */
                final /* synthetic */ int f49322n;

                @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"androidx/compose/foundation/text/CoreTextFieldKt$e$a$a$a", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "", "height", "e", "(Landroidx/compose/ui/layout/s;Ljava/util/List;I)I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$e$a$a$a, reason: collision with other inner class name */
                public static final class C1019a implements MeasurePolicy {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ B f49323a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Function1<TextLayoutResult, Unit> f49324b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ TextFieldValue f49325c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ InterfaceC18417E f49326d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ H1.d f49327e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ int f49328f;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$e$a$a$a$a, reason: collision with other inner class name */
                    static final class C1020a extends Lambda implements Function1<f0.a, Unit> {

                        /* renamed from: f, reason: collision with root package name */
                        public static final C1020a f49329f = new C1020a();

                        C1020a() {
                            super(1);
                        }

                        public final void a(f0.a aVar) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                            a(aVar);
                            return Unit.f143329a;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    C1019a(B b10, Function1<? super TextLayoutResult, Unit> function1, TextFieldValue textFieldValue, InterfaceC18417E interfaceC18417E, H1.d dVar, int i10) {
                        this.f49323a = b10;
                        this.f49324b = function1;
                        this.f49325c = textFieldValue;
                        this.f49326d = interfaceC18417E;
                        this.f49327e = dVar;
                        this.f49328f = i10;
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K k10, List<? extends androidx.compose.ui.layout.I> list, long j10) {
                        g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
                        B b10 = this.f49323a;
                        androidx.compose.runtime.snapshots.g gVarD = companion.d();
                        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
                        androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
                        try {
                            h0 h0VarL = b10.l();
                            TextLayoutResult value = h0VarL != null ? h0VarL.getValue() : null;
                            Triple<Integer, Integer, TextLayoutResult> tripleD = T.INSTANCE.d(this.f49323a.getTextDelegate(), j10, k10.getLayoutDirection(), value);
                            int iIntValue = tripleD.a().intValue();
                            int iIntValue2 = tripleD.b().intValue();
                            TextLayoutResult textLayoutResultC = tripleD.c();
                            if (!Intrinsics.e(value, textLayoutResultC)) {
                                this.f49323a.K(new h0(textLayoutResultC, null, h0VarL != null ? h0VarL.getDecorationBoxCoordinates() : null, 2, null));
                                this.f49324b.invoke(textLayoutResultC);
                                CoreTextFieldKt.n(this.f49323a, this.f49325c, this.f49326d);
                            }
                            this.f49323a.L(this.f49327e.K(this.f49328f == 1 ? O.a(textLayoutResultC.m(0)) : 0));
                            return k10.g1(iIntValue, iIntValue2, MapsKt.o(TuplesKt.a(C5917b.a(), Integer.valueOf(Math.round(textLayoutResultC.getFirstBaseline()))), TuplesKt.a(C5917b.b(), Integer.valueOf(Math.round(textLayoutResultC.getLastBaseline())))), C1020a.f49329f);
                        } finally {
                            companion.l(gVarD, gVarE, function1G);
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public int e(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
                        this.f49323a.getTextDelegate().m(interfaceC5933s.getLayoutDirection());
                        return this.f49323a.getTextDelegate().c();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1018a(C17778Q c17778q, B b10, boolean z10, boolean z11, Function1<? super TextLayoutResult, Unit> function1, TextFieldValue textFieldValue, InterfaceC18417E interfaceC18417E, H1.d dVar, int i10) {
                    super(2);
                    this.f49314f = c17778q;
                    this.f49315g = b10;
                    this.f49316h = z10;
                    this.f49317i = z11;
                    this.f49318j = function1;
                    this.f49319k = textFieldValue;
                    this.f49320l = interfaceC18417E;
                    this.f49321m = dVar;
                    this.f49322n = i10;
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
                        androidx.compose.foundation.text.B r6 = r12.f49315g
                        kotlin.jvm.functions.Function1<u1.v, kotlin.Unit> r7 = r12.f49318j
                        z1.M r8 = r12.f49319k
                        z1.E r9 = r12.f49320l
                        H1.d r10 = r12.f49321m
                        int r11 = r12.f49322n
                        r5.<init>(r6, r7, r8, r9, r10, r11)
                        androidx.compose.ui.Modifier$a r14 = androidx.compose.ui.Modifier.INSTANCE
                        int r0 = androidx.compose.runtime.C5859f.a(r13, r3)
                        androidx.compose.runtime.s r1 = r13.r()
                        androidx.compose.ui.Modifier r14 = androidx.compose.ui.b.e(r13, r14)
                        androidx.compose.ui.node.g$a r4 = androidx.compose.ui.node.InterfaceC5953g.INSTANCE
                        kotlin.jvm.functions.Function0 r6 = r4.a()
                        androidx.compose.runtime.Applier r7 = r13.k()
                        if (r7 != 0) goto L4f
                        androidx.compose.runtime.C5859f.c()
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
                        w0.Q r14 = r12.f49314f
                        androidx.compose.foundation.text.B r0 = r12.f49315g
                        androidx.compose.foundation.text.o r0 = r0.e()
                        androidx.compose.foundation.text.o r1 = androidx.compose.foundation.text.EnumC5825o.f49921a
                        if (r0 == r1) goto Lc9
                        androidx.compose.foundation.text.B r0 = r12.f49315g
                        androidx.compose.ui.layout.LayoutCoordinates r0 = r0.k()
                        if (r0 == 0) goto Lc9
                        androidx.compose.foundation.text.B r0 = r12.f49315g
                        androidx.compose.ui.layout.LayoutCoordinates r0 = r0.k()
                        kotlin.jvm.internal.Intrinsics.g(r0)
                        boolean r0 = r0.isAttached()
                        if (r0 == 0) goto Lc9
                        boolean r0 = r12.f49316h
                        if (r0 == 0) goto Lc9
                        goto Lca
                    Lc9:
                        r2 = r3
                    Lca:
                        androidx.compose.foundation.text.CoreTextFieldKt.h(r14, r2, r13, r3)
                        androidx.compose.foundation.text.B r14 = r12.f49315g
                        androidx.compose.foundation.text.o r14 = r14.e()
                        androidx.compose.foundation.text.o r0 = androidx.compose.foundation.text.EnumC5825o.f49923c
                        if (r14 != r0) goto Lee
                        boolean r14 = r12.f49317i
                        if (r14 != 0) goto Lee
                        boolean r14 = r12.f49316h
                        if (r14 == 0) goto Lee
                        r14 = -7167858(0xffffffffff92a08e, float:NaN)
                        r13.startReplaceGroup(r14)
                        w0.Q r14 = r12.f49314f
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
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.e.a.C1018a.a(androidx.compose.runtime.Composer, int):void");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/h0;", "c", "()Landroidx/compose/foundation/text/h0;"}, k = 3, mv = {1, 9, 0})
            static final class b extends Lambda implements Function0<h0> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ B f49330f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(B b10) {
                    super(0);
                    this.f49330f = b10;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final h0 invoke() {
                    return this.f49330f.l();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(B b10, TextStyle textStyle, int i10, int i11, d0 d0Var, TextFieldValue textFieldValue, z1.W w10, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, InterfaceC16328a interfaceC16328a, C17778Q c17778q, boolean z10, boolean z11, Function1<? super TextLayoutResult, Unit> function1, InterfaceC18417E interfaceC18417E, H1.d dVar) {
                super(2);
                this.f49296f = b10;
                this.f49297g = textStyle;
                this.f49298h = i10;
                this.f49299i = i11;
                this.f49300j = d0Var;
                this.f49301k = textFieldValue;
                this.f49302l = w10;
                this.f49303m = modifier;
                this.f49304n = modifier2;
                this.f49305o = modifier3;
                this.f49306p = modifier4;
                this.f49307q = interfaceC16328a;
                this.f49308r = c17778q;
                this.f49309s = z10;
                this.f49310t = z11;
                this.f49311u = function1;
                this.f49312v = interfaceC18417E;
                this.f49313w = dVar;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1835647873, i10, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:558)");
                }
                Modifier modifierA = C5826p.a(androidx.compose.foundation.layout.J.k(Modifier.INSTANCE, this.f49296f.m(), 0.0f, 2, null), this.f49297g, this.f49298h, this.f49299i);
                d0 d0Var = this.f49300j;
                TextFieldValue textFieldValue = this.f49301k;
                z1.W w10 = this.f49302l;
                boolean zD = composer.D(this.f49296f);
                B b10 = this.f49296f;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new b(b10);
                    composer.t(objB);
                }
                C17775N.a(androidx.compose.foundation.relocation.b.b(f0.a(c0.a(modifierA, d0Var, textFieldValue, w10, (Function0) objB).then(this.f49303m).then(this.f49304n), this.f49297g).then(this.f49305o).then(this.f49306p), this.f49307q), ComposableLambdaKt.c(-1172467467, true, new C1018a(this.f49308r, this.f49296f, this.f49309s, this.f49310t, this.f49311u, this.f49301k, this.f49312v, this.f49313w, this.f49299i), composer, 54), composer, 48, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, B b10, TextStyle textStyle, int i10, int i11, d0 d0Var, TextFieldValue textFieldValue, z1.W w10, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, InterfaceC16328a interfaceC16328a, C17778Q c17778q, boolean z10, boolean z11, Function1<? super TextLayoutResult, Unit> function1, InterfaceC18417E interfaceC18417E, H1.d dVar) {
            super(2);
            this.f49277f = function3;
            this.f49278g = b10;
            this.f49279h = textStyle;
            this.f49280i = i10;
            this.f49281j = i11;
            this.f49282k = d0Var;
            this.f49283l = textFieldValue;
            this.f49284m = w10;
            this.f49285n = modifier;
            this.f49286o = modifier2;
            this.f49287p = modifier3;
            this.f49288q = modifier4;
            this.f49289r = interfaceC16328a;
            this.f49290s = c17778q;
            this.f49291t = z10;
            this.f49292u = z11;
            this.f49293v = function1;
            this.f49294w = interfaceC18417E;
            this.f49295x = dVar;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-492537660, i10, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:555)");
            }
            this.f49277f.invoke(ComposableLambdaKt.c(-1835647873, true, new a(this.f49278g, this.f49279h, this.f49280i, this.f49281j, this.f49282k, this.f49283l, this.f49284m, this.f49285n, this.f49286o, this.f49287p, this.f49288q, this.f49289r, this.f49290s, this.f49291t, this.f49292u, this.f49293v, this.f49294w, this.f49295x), composer, 54), composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49331f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<TextFieldValue, Unit> f49332g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f49333h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ TextStyle f49334i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ z1.W f49335j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49336k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ h0.l f49337l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ AbstractC5467i0 f49338m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f49339n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f49340o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f49341p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ImeOptions f49342q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ C5835z f49343r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f49344s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f49345t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f49346u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ d0 f49347v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f49348w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f49349x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f49350y;

        public final void a(Composer composer, int i10) {
            CoreTextFieldKt.a(this.f49331f, this.f49332g, this.f49333h, this.f49334i, this.f49335j, this.f49336k, this.f49337l, this.f49338m, this.f49339n, this.f49340o, this.f49341p, this.f49342q, this.f49343r, this.f49344s, this.f49345t, this.f49346u, this.f49347v, composer, J0.a(this.f49348w | 1), J0.a(this.f49349x), this.f49350y);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, Modifier modifier, TextStyle textStyle, z1.W w10, Function1<? super TextLayoutResult, Unit> function12, h0.l lVar, AbstractC5467i0 abstractC5467i0, boolean z10, int i10, int i11, ImeOptions imeOptions, C5835z c5835z, boolean z11, boolean z12, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, d0 d0Var, int i12, int i13, int i14) {
            super(2);
            this.f49331f = textFieldValue;
            this.f49332g = function1;
            this.f49333h = modifier;
            this.f49334i = textStyle;
            this.f49335j = w10;
            this.f49336k = function12;
            this.f49337l = lVar;
            this.f49338m = abstractC5467i0;
            this.f49339n = z10;
            this.f49340o = i10;
            this.f49341p = i11;
            this.f49342q = imeOptions;
            this.f49343r = c5835z;
            this.f49344s = z11;
            this.f49345t = z12;
            this.f49346u = function3;
            this.f49347v = d0Var;
            this.f49348w = i12;
            this.f49349x = i13;
            this.f49350y = i14;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "it", "", "a", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49351f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(B b10) {
            super(1);
            this.f49351f = b10;
        }

        public final void a(LayoutCoordinates layoutCoordinates) {
            h0 h0VarL = this.f49351f.l();
            if (h0VarL == null) {
                return;
            }
            h0VarL.h(layoutCoordinates);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            a(layoutCoordinates);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49352f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f49353g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(B b10, long j10) {
            super(1);
            this.f49352f = b10;
            this.f49353g = j10;
        }

        public final void a(X0.f fVar) {
            if (this.f49352f.c() || this.f49352f.i()) {
                X0.f.i1(fVar, this.f49353g, 0L, 0L, 0.0f, null, null, 0, 126, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class i extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49354f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49355g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC18417E f49356h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(B b10, TextFieldValue textFieldValue, InterfaceC18417E interfaceC18417E) {
            super(1);
            this.f49354f = b10;
            this.f49355g = textFieldValue;
            this.f49356h = interfaceC18417E;
        }

        public final void a(X0.f fVar) {
            h0 h0VarL = this.f49354f.l();
            if (h0VarL != null) {
                TextFieldValue textFieldValue = this.f49355g;
                B b10 = this.f49354f;
                InterfaceC18417E interfaceC18417E = this.f49356h;
                T.INSTANCE.b(fVar.getDrawContext().g(), textFieldValue, b10.s(), b10.d(), interfaceC18417E, h0VarL.getValue(), b10.getHighlightPaint(), b10.getSelectionBackgroundColor());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "it", "", "a", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49357f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f49358g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ W1 f49359h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C17778Q f49360i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49361j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC18417E f49362k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(B b10, boolean z10, W1 w12, C17778Q c17778q, TextFieldValue textFieldValue, InterfaceC18417E interfaceC18417E) {
            super(1);
            this.f49357f = b10;
            this.f49358g = z10;
            this.f49359h = w12;
            this.f49360i = c17778q;
            this.f49361j = textFieldValue;
            this.f49362k = interfaceC18417E;
        }

        public final void a(LayoutCoordinates layoutCoordinates) {
            this.f49357f.J(layoutCoordinates);
            h0 h0VarL = this.f49357f.l();
            if (h0VarL != null) {
                h0VarL.i(layoutCoordinates);
            }
            if (this.f49358g) {
                if (this.f49357f.e() == EnumC5825o.f49922b) {
                    if (this.f49357f.u() && this.f49359h.b()) {
                        this.f49360i.t0();
                    } else {
                        this.f49360i.X();
                    }
                    this.f49357f.Q(C17779S.c(this.f49360i, true));
                    this.f49357f.P(C17779S.c(this.f49360i, false));
                    this.f49357f.N(androidx.compose.ui.text.y.h(this.f49361j.getSelection()));
                } else if (this.f49357f.e() == EnumC5825o.f49923c) {
                    this.f49357f.N(C17779S.c(this.f49360i, true));
                }
                CoreTextFieldKt.n(this.f49357f, this.f49361j, this.f49362k);
                h0 h0VarL2 = this.f49357f.l();
                if (h0VarL2 != null) {
                    B b10 = this.f49357f;
                    TextFieldValue textFieldValue = this.f49361j;
                    InterfaceC18417E interfaceC18417E = this.f49362k;
                    z1.T inputSession = b10.getInputSession();
                    if (inputSession == null || !b10.f()) {
                        return;
                    }
                    T.INSTANCE.k(inputSession, textFieldValue, interfaceC18417E, h0VarL2);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            a(layoutCoordinates);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Z)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49363f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(B b10) {
            super(1);
            this.f49363f = b10;
        }

        public final void a(boolean z10) {
            this.f49363f.G(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            a(bool.booleanValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "offset", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends Lambda implements Function1<U0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49364f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.y f49365g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f49366h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f49367i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C17778Q f49368j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC18417E f49369k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(B b10, androidx.compose.ui.focus.y yVar, boolean z10, boolean z11, C17778Q c17778q, InterfaceC18417E interfaceC18417E) {
            super(1);
            this.f49364f = b10;
            this.f49365g = yVar;
            this.f49366h = z10;
            this.f49367i = z11;
            this.f49368j = c17778q;
            this.f49369k = interfaceC18417E;
        }

        public final void a(long j10) {
            CoreTextFieldKt.q(this.f49364f, this.f49365g, !this.f49366h);
            if (this.f49364f.f() && this.f49367i) {
                if (this.f49364f.e() == EnumC5825o.f49922b) {
                    this.f49368j.v(U0.f.d(j10));
                    return;
                }
                h0 h0VarL = this.f49364f.l();
                if (h0VarL != null) {
                    B b10 = this.f49364f;
                    T.INSTANCE.j(j10, h0VarL, b10.getProcessor(), this.f49369k, b10.o());
                    if (b10.getTextDelegate().getText().length() > 0) {
                        b10.E(EnumC5825o.f49923c);
                    }
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
            a(fVar.getPackedValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/d0;", "c", "()Landroidx/compose/foundation/text/d0;"}, k = 3, mv = {1, 9, 0})
    static final class m extends Lambda implements Function0<d0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC13937z f49370f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(EnumC13937z enumC13937z) {
            super(0);
            this.f49370f = enumC13937z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final d0 invoke() {
            return new d0(this.f49370f, 0.0f, 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class n extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f49371f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ u0.q0 f49372g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z10, u0.q0 q0Var) {
            super(0);
            this.f49371f = z10;
            this.f49372g = q0Var;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.f49371f) {
                this.f49372g.k();
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f49373f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C17778Q f49374g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f49375h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f49376i;

        public final void a(Composer composer, int i10) {
            CoreTextFieldKt.c(this.f49373f, this.f49374g, this.f49375h, composer, J0.a(this.f49376i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(Modifier modifier, C17778Q c17778q, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f49373f = modifier;
            this.f49374g = c17778q;
            this.f49375h = function2;
            this.f49376i = i10;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class p extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17778Q f49377f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f49378g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f49379h;

        public final void a(Composer composer, int i10) {
            CoreTextFieldKt.d(this.f49377f, this.f49378g, composer, J0.a(this.f49379h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(C17778Q c17778q, boolean z10, int i10) {
            super(2);
            this.f49377f = c17778q;
            this.f49378g = z10;
            this.f49379h = i10;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/f;", "a", "()J"}, k = 3, mv = {1, 9, 0})
    static final class q implements InterfaceC17797m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f49380a;

        q(long j10) {
            this.f49380a = j10;
        }

        @Override // kotlin.InterfaceC17797m
        public final long a() {
            return this.f49380a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    static final class r implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P f49381a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17778Q f49382b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f49383a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f49384b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ g1.J f49385c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ P f49386d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C17778Q f49387e;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1078}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$r$a$a, reason: collision with other inner class name */
            static final class C1021a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f49388a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ g1.J f49389b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ P f49390c;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1021a(this.f49389b, this.f49390c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1021a(g1.J j10, P p10, Continuation<? super C1021a> continuation) {
                    super(2, continuation);
                    this.f49389b = j10;
                    this.f49390c = p10;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1021a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f49388a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        g1.J j10 = this.f49389b;
                        P p10 = this.f49390c;
                        this.f49388a = 1;
                        if (E.c(j10, p10, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1081}, m = "invokeSuspend")
            static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f49391a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ g1.J f49392b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17778Q f49393c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
                /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$r$a$b$a, reason: collision with other inner class name */
                static final class C1022a extends Lambda implements Function1<U0.f, Unit> {

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ C17778Q f49394f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1022a(C17778Q c17778q) {
                        super(1);
                        this.f49394f = c17778q;
                    }

                    public final void a(long j10) {
                        this.f49394f.t0();
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
                        a(fVar.getPackedValue());
                        return Unit.f143329a;
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f49392b, this.f49393c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(g1.J j10, C17778Q c17778q, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f49392b = j10;
                    this.f49393c = c17778q;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f49391a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        g1.J j10 = this.f49392b;
                        C1022a c1022a = new C1022a(this.f49393c);
                        this.f49391a = 1;
                        if (C13904L.m(j10, null, null, null, c1022a, this, 7, null) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f49385c, this.f49386d, this.f49387e, continuation);
                aVar.f49384b = obj;
                return aVar;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g1.J j10, P p10, C17778Q c17778q, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f49385c = j10;
                this.f49386d = p10;
                this.f49387e = c17778q;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f49383a == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f49384b;
                    EnumC15785Q enumC15785Q = EnumC15785Q.f151688d;
                    C15809k.d(interfaceC15783O, null, enumC15785Q, new C1021a(this.f49385c, this.f49386d, null), 1, null);
                    C15809k.d(interfaceC15783O, null, enumC15785Q, new b(this.f49385c, this.f49387e, null), 1, null);
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        r(P p10, C17778Q c17778q) {
            this.f49381a = p10;
            this.f49382b = c17778q;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
            Object objG = C15784P.g(new a(j10, this.f49381a, this.f49382b, null), continuation);
            return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    static final class s extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f49395f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(long j10) {
            super(1);
            this.f49395f = j10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }

        public final void a(r1.u uVar) {
            uVar.a(C17763B.d(), new SelectionHandleInfo(EnumC5824n.f49914a, this.f49395f, EnumC17810z.f166844b, true, null));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class t extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17778Q f49396f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f49397g;

        public final void a(Composer composer, int i10) {
            CoreTextFieldKt.e(this.f49396f, composer, J0.a(this.f49397g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(C17778Q c17778q, int i10) {
            super(2);
            this.f49396f = c17778q;
            this.f49397g = i10;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le1/b;", "keyEvent", "", "a", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class u extends Lambda implements Function1<C13750b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B f49398f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C17778Q f49399g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(B b10, C17778Q c17778q) {
            super(1);
            this.f49398f = b10;
            this.f49399g = c17778q;
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z10;
            if (this.f49398f.e() == EnumC5825o.f49922b && C5829t.a(keyEvent)) {
                z10 = true;
                C17778Q.w(this.f49399g, null, 1, null);
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(C13750b c13750b) {
            return a(c13750b.getNativeKeyEvent());
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
    public static final void a(z1.TextFieldValue r48, kotlin.jvm.functions.Function1<? super z1.TextFieldValue, kotlin.Unit> r49, androidx.compose.ui.Modifier r50, androidx.compose.ui.text.TextStyle r51, z1.W r52, kotlin.jvm.functions.Function1<? super u1.TextLayoutResult, kotlin.Unit> r53, h0.l r54, V0.AbstractC5467i0 r55, boolean r56, int r57, int r58, androidx.compose.ui.text.input.ImeOptions r59, androidx.compose.foundation.text.C5835z r60, boolean r61, boolean r62, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r63, androidx.compose.foundation.text.d0 r64, androidx.compose.runtime.Composer r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instructions count: 2728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.a(z1.M, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.z, z1.W, kotlin.jvm.functions.Function1, h0.l, V0.i0, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.z, boolean, boolean, kotlin.jvm.functions.Function3, androidx.compose.foundation.text.d0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(B b10, TextFieldValue textFieldValue, InterfaceC18417E interfaceC18417E) {
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
            T.INSTANCE.e(textFieldValue, b10.getTextDelegate(), h0VarL.getValue(), layoutCoordinatesK, inputSession, b10.f(), interfaceC18417E);
            Unit unit = Unit.f143329a;
        } finally {
            companion.l(gVarD, gVarE, function1G);
        }
    }

    private static final Modifier o(Modifier modifier, B b10, C17778Q c17778q) {
        return androidx.compose.ui.input.key.b.b(modifier, new u(b10, c17778q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(z1.O o10, B b10, TextFieldValue textFieldValue, ImeOptions imeOptions, InterfaceC18417E interfaceC18417E) {
        b10.H(T.INSTANCE.h(o10, textFieldValue, b10.getProcessor(), imeOptions, b10.o(), b10.n()));
        n(b10, textFieldValue, interfaceC18417E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Modifier modifier, C17778Q c17778q, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
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
            if (composerStartRestartGroup.D(c17778q)) {
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
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), true);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
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
            C5820j.b(c17778q, function2, composerStartRestartGroup, (i11 >> 3) & 126);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new o(modifier, c17778q, function2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C17778Q c17778q, boolean z10, Composer composer, int i10) {
        int i11;
        boolean z11;
        h0 h0VarL;
        TextLayoutResult value;
        boolean isLayoutResultStale;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(626339208);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(c17778q)) {
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
                B state = c17778q.getState();
                TextLayoutResult textLayoutResult = null;
                if (state != null && (h0VarL = state.l()) != null && (value = h0VarL.getValue()) != null) {
                    B state2 = c17778q.getState();
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
                    if (!androidx.compose.ui.text.y.h(c17778q.U().getSelection())) {
                        composerStartRestartGroup.startReplaceGroup(-1685230508);
                        int iB = c17778q.getOffsetMapping().b(androidx.compose.ui.text.y.n(c17778q.U().getSelection()));
                        int iB2 = c17778q.getOffsetMapping().b(androidx.compose.ui.text.y.i(c17778q.U().getSelection()));
                        F1.i iVarC = textLayoutResult.c(iB);
                        F1.i iVarC2 = textLayoutResult.c(Math.max(iB2 - 1, 0));
                        B state3 = c17778q.getState();
                        if (state3 != null && state3.w()) {
                            composerStartRestartGroup.startReplaceGroup(-1684812473);
                            C17779S.a(true, iVarC, c17778q, composerStartRestartGroup, ((i11 << 6) & 896) | 6);
                            composerStartRestartGroup.P();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1684548198);
                            composerStartRestartGroup.P();
                        }
                        B state4 = c17778q.getState();
                        if (state4 != null && state4.v()) {
                            composerStartRestartGroup.startReplaceGroup(-1684464312);
                            C17779S.a(false, iVarC2, c17778q, composerStartRestartGroup, ((i11 << 6) & 896) | 6);
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
                    B state5 = c17778q.getState();
                    if (state5 != null) {
                        if (c17778q.Y()) {
                            state5.O(false);
                        }
                        if (state5.f()) {
                            if (state5.u()) {
                                c17778q.t0();
                            } else {
                                c17778q.X();
                            }
                        }
                        Unit unit = Unit.f143329a;
                    }
                }
                composerStartRestartGroup.P();
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(651160447);
                composerStartRestartGroup.P();
                c17778q.X();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new p(c17778q, z10, i10));
        }
    }

    public static final void e(C17778Q c17778q, Composer composer, int i10) {
        int i11;
        boolean z10;
        AnnotatedString annotatedStringS;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1436003720);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(c17778q)) {
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
            B state = c17778q.getState();
            if (state != null && state.t() && (annotatedStringS = c17778q.S()) != null && annotatedStringS.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(-289940723);
                boolean zV = composerStartRestartGroup.V(c17778q);
                Object objB = composerStartRestartGroup.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = c17778q.t();
                    composerStartRestartGroup.t(objB);
                }
                P p10 = (P) objB;
                long jE = c17778q.E((H1.d) composerStartRestartGroup.o(C6034t0.g()));
                boolean zE = composerStartRestartGroup.e(jE);
                Object objB2 = composerStartRestartGroup.B();
                if (zE || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new q(jE);
                    composerStartRestartGroup.t(objB2);
                }
                InterfaceC17797m interfaceC17797m = (InterfaceC17797m) objB2;
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean zD = composerStartRestartGroup.D(p10) | composerStartRestartGroup.D(c17778q);
                Object objB3 = composerStartRestartGroup.B();
                if (zD || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new r(p10, c17778q);
                    composerStartRestartGroup.t(objB3);
                }
                Modifier modifierC = g1.U.c(companion, p10, (PointerInputEventHandler) objB3);
                boolean zE2 = composerStartRestartGroup.e(jE);
                Object objB4 = composerStartRestartGroup.B();
                if (zE2 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new s(jE);
                    composerStartRestartGroup.t(objB4);
                }
                C5811a.a(interfaceC17797m, C16819m.d(modifierC, false, (Function1) objB4, 1, null), 0L, composerStartRestartGroup, 0, 4);
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
            t0L.a(new t(c17778q, i10));
        }
    }

    public static final Object l(InterfaceC16328a interfaceC16328a, TextFieldValue textFieldValue, N n10, TextLayoutResult textLayoutResult, InterfaceC18417E interfaceC18417E, Continuation<? super Unit> continuation) {
        Rect rect;
        int iB = interfaceC18417E.b(androidx.compose.ui.text.y.k(textFieldValue.getSelection()));
        if (iB < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.d(iB);
        } else if (iB != 0) {
            rect = textLayoutResult.d(iB - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, (int) (U.b(n10.getStyle(), n10.getDensity(), n10.getFontFamilyResolver(), null, 0, 24, null) & 4294967295L));
        }
        Object objB = interfaceC16328a.b(rect, continuation);
        if (objB == IntrinsicsKt.f()) {
            return objB;
        }
        return Unit.f143329a;
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
