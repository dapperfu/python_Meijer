package androidx.compose.foundation.text;

import V0.AbstractC5467i0;
import V0.SolidColor;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.W1;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import mv.InterfaceC15783O;
import u0.C17324p;
import u1.TextLayoutResult;
import z1.InterfaceC18417E;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a;\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/B;", "state", "Lz1/M;", "value", "Lz1/E;", "offsetMapping", "LV0/i0;", "cursorBrush", "", "enabled", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/B;Lz1/M;Lz1/E;LV0/i0;Z)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC5467i0 f49475f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B f49476g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49477h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC18417E f49478i;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", l = {60}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.Q$a$a, reason: collision with other inner class name */
        static final class C1024a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f49479a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17324p f49480b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1024a(this.f49480b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1024a(C17324p c17324p, Continuation<? super C1024a> continuation) {
                super(2, continuation);
                this.f49480b = c17324p;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1024a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f49479a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17324p c17324p = this.f49480b;
                    this.f49479a = 1;
                    if (c17324p.f(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/c;", "", "a", "(LX0/c;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class b extends Lambda implements Function1<X0.c, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17324p f49481f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC18417E f49482g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ TextFieldValue f49483h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ B f49484i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ AbstractC5467i0 f49485j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17324p c17324p, InterfaceC18417E interfaceC18417E, TextFieldValue textFieldValue, B b10, AbstractC5467i0 abstractC5467i0) {
                super(1);
                this.f49481f = c17324p;
                this.f49482g = interfaceC18417E;
                this.f49483h = textFieldValue;
                this.f49484i = b10;
                this.f49485j = abstractC5467i0;
            }

            public final void a(X0.c cVar) {
                Rect rect;
                TextLayoutResult value;
                cVar.a2();
                float fD = this.f49481f.d();
                if (fD == 0.0f) {
                    return;
                }
                int iB = this.f49482g.b(androidx.compose.ui.text.y.n(this.f49483h.getSelection()));
                h0 h0VarL = this.f49484i.l();
                if (h0VarL == null || (value = h0VarL.getValue()) == null || (rect = value.e(iB)) == null) {
                    rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float fE = RangesKt.e((float) Math.floor(cVar.I1(S.a())), 1.0f);
                float f10 = fE / 2;
                float fE2 = RangesKt.e(RangesKt.j(rect.getLeft() + f10, Float.intBitsToFloat((int) (cVar.b() >> 32)) - f10), f10);
                float fFloor = ((int) fE) % 2 == 1 ? ((float) Math.floor(fE2)) + 0.5f : (float) Math.rint(fE2);
                X0.f.P0(cVar, this.f49485j, U0.f.e((Float.floatToRawIntBits(fFloor) << 32) | (Float.floatToRawIntBits(rect.getTop()) & 4294967295L)), U0.f.e((Float.floatToRawIntBits(rect.i()) & 4294967295L) | (Float.floatToRawIntBits(fFloor) << 32)), fE, 0, null, fD, null, 0, 432, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(X0.c cVar) {
                a(cVar);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC5467i0 abstractC5467i0, B b10, TextFieldValue textFieldValue, InterfaceC18417E interfaceC18417E) {
            super(3);
            this.f49475f = abstractC5467i0;
            this.f49476g = b10;
            this.f49477h = textFieldValue;
            this.f49478i = interfaceC18417E;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            boolean z10;
            Modifier modifierD;
            composer.startReplaceGroup(-84507373);
            if (ComposerKt.M()) {
                ComposerKt.U(-84507373, i10, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:46)");
            }
            boolean zBooleanValue = ((Boolean) composer.o(C6034t0.f())).booleanValue();
            boolean zA = composer.a(zBooleanValue);
            Object objB = composer.B();
            if (zA || objB == Composer.INSTANCE.a()) {
                objB = new C17324p(zBooleanValue);
                composer.t(objB);
            }
            C17324p c17324p = (C17324p) objB;
            AbstractC5467i0 abstractC5467i0 = this.f49475f;
            if ((abstractC5467i0 instanceof SolidColor) && ((SolidColor) abstractC5467i0).getValue() == 16) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (((W1) composer.o(C6034t0.u())).b() && this.f49476g.f() && androidx.compose.ui.text.y.h(this.f49477h.getSelection()) && z10) {
                composer.startReplaceGroup(808460990);
                AnnotatedString text = this.f49477h.getText();
                androidx.compose.ui.text.y yVarB = androidx.compose.ui.text.y.b(this.f49477h.getSelection());
                boolean zD = composer.D(c17324p);
                Object objB2 = composer.B();
                if (zD || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new C1024a(c17324p, null);
                    composer.t(objB2);
                }
                androidx.compose.runtime.J.f(text, yVarB, (Function2) objB2, composer, 0);
                boolean zD2 = composer.D(c17324p) | composer.D(this.f49478i) | composer.V(this.f49477h) | composer.D(this.f49476g) | composer.V(this.f49475f);
                InterfaceC18417E interfaceC18417E = this.f49478i;
                TextFieldValue textFieldValue = this.f49477h;
                B b10 = this.f49476g;
                AbstractC5467i0 abstractC5467i02 = this.f49475f;
                Object objB3 = composer.B();
                if (zD2 || objB3 == Composer.INSTANCE.a()) {
                    Object bVar = new b(c17324p, interfaceC18417E, textFieldValue, b10, abstractC5467i02);
                    composer.t(bVar);
                    objB3 = bVar;
                }
                modifierD = androidx.compose.ui.draw.b.d(modifier, (Function1) objB3);
                composer.P();
            } else {
                composer.startReplaceGroup(810474750);
                composer.P();
                modifierD = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierD;
        }
    }

    public static final Modifier a(Modifier modifier, B b10, TextFieldValue textFieldValue, InterfaceC18417E interfaceC18417E, AbstractC5467i0 abstractC5467i0, boolean z10) {
        return z10 ? androidx.compose.ui.b.c(modifier, null, new a(abstractC5467i0, b10, textFieldValue, interfaceC18417E), 1, null) : modifier;
    }
}
