package androidx.compose.foundation.text;

import V0.AbstractC5324i0;
import V0.SolidColor;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.C5892t0;
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
import qv.InterfaceC16622O;
import u0.C17197p;
import u1.TextLayoutResult;
import z1.InterfaceC18354E;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a;\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/B;", "state", "Lz1/M;", "value", "Lz1/E;", "offsetMapping", "LV0/i0;", "cursorBrush", "", "enabled", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/B;Lz1/M;Lz1/E;LV0/i0;Z)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC5324i0 f49251f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B f49252g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49253h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC18354E f49254i;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", l = {60}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.Q$a$a, reason: collision with other inner class name */
        static final class C1011a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f49255a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17197p f49256b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1011a(this.f49256b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1011a(C17197p c17197p, Continuation<? super C1011a> continuation) {
                super(2, continuation);
                this.f49256b = c17197p;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1011a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f49255a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17197p c17197p = this.f49256b;
                    this.f49255a = 1;
                    if (c17197p.f(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/c;", "", "a", "(LX0/c;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class b extends Lambda implements Function1<X0.c, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17197p f49257f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC18354E f49258g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ TextFieldValue f49259h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ B f49260i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ AbstractC5324i0 f49261j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17197p c17197p, InterfaceC18354E interfaceC18354E, TextFieldValue textFieldValue, B b10, AbstractC5324i0 abstractC5324i0) {
                super(1);
                this.f49257f = c17197p;
                this.f49258g = interfaceC18354E;
                this.f49259h = textFieldValue;
                this.f49260i = b10;
                this.f49261j = abstractC5324i0;
            }

            public final void a(X0.c cVar) {
                Rect rect;
                TextLayoutResult value;
                cVar.a2();
                float fD = this.f49257f.d();
                if (fD == 0.0f) {
                    return;
                }
                int iB = this.f49258g.b(androidx.compose.ui.text.y.n(this.f49259h.getSelection()));
                h0 h0VarL = this.f49260i.l();
                if (h0VarL == null || (value = h0VarL.getValue()) == null || (rect = value.e(iB)) == null) {
                    rect = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float fE = RangesKt.e((float) Math.floor(cVar.I1(S.a())), 1.0f);
                float f10 = fE / 2;
                float fE2 = RangesKt.e(RangesKt.j(rect.getLeft() + f10, Float.intBitsToFloat((int) (cVar.b() >> 32)) - f10), f10);
                float fFloor = ((int) fE) % 2 == 1 ? ((float) Math.floor(fE2)) + 0.5f : (float) Math.rint(fE2);
                X0.f.P0(cVar, this.f49261j, U0.f.e((Float.floatToRawIntBits(fFloor) << 32) | (Float.floatToRawIntBits(rect.getTop()) & 4294967295L)), U0.f.e((Float.floatToRawIntBits(rect.i()) & 4294967295L) | (Float.floatToRawIntBits(fFloor) << 32)), fE, 0, null, fD, null, 0, 432, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(X0.c cVar) {
                a(cVar);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC5324i0 abstractC5324i0, B b10, TextFieldValue textFieldValue, InterfaceC18354E interfaceC18354E) {
            super(3);
            this.f49251f = abstractC5324i0;
            this.f49252g = b10;
            this.f49253h = textFieldValue;
            this.f49254i = interfaceC18354E;
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
            boolean zBooleanValue = ((Boolean) composer.o(C5892t0.f())).booleanValue();
            boolean zA = composer.a(zBooleanValue);
            Object objB = composer.B();
            if (zA || objB == Composer.INSTANCE.a()) {
                objB = new C17197p(zBooleanValue);
                composer.t(objB);
            }
            C17197p c17197p = (C17197p) objB;
            AbstractC5324i0 abstractC5324i0 = this.f49251f;
            if ((abstractC5324i0 instanceof SolidColor) && ((SolidColor) abstractC5324i0).getValue() == 16) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (((W1) composer.o(C5892t0.u())).b() && this.f49252g.f() && androidx.compose.ui.text.y.h(this.f49253h.getSelection()) && z10) {
                composer.startReplaceGroup(808460990);
                AnnotatedString text = this.f49253h.getText();
                androidx.compose.ui.text.y yVarB = androidx.compose.ui.text.y.b(this.f49253h.getSelection());
                boolean zD = composer.D(c17197p);
                Object objB2 = composer.B();
                if (zD || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new C1011a(c17197p, null);
                    composer.t(objB2);
                }
                androidx.compose.runtime.J.f(text, yVarB, (Function2) objB2, composer, 0);
                boolean zD2 = composer.D(c17197p) | composer.D(this.f49254i) | composer.V(this.f49253h) | composer.D(this.f49252g) | composer.V(this.f49251f);
                InterfaceC18354E interfaceC18354E = this.f49254i;
                TextFieldValue textFieldValue = this.f49253h;
                B b10 = this.f49252g;
                AbstractC5324i0 abstractC5324i02 = this.f49251f;
                Object objB3 = composer.B();
                if (zD2 || objB3 == Composer.INSTANCE.a()) {
                    Object bVar = new b(c17197p, interfaceC18354E, textFieldValue, b10, abstractC5324i02);
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

    public static final Modifier a(Modifier modifier, B b10, TextFieldValue textFieldValue, InterfaceC18354E interfaceC18354E, AbstractC5324i0 abstractC5324i0, boolean z10) {
        return z10 ? androidx.compose.ui.b.c(modifier, null, new a(abstractC5324i0, b10, textFieldValue, interfaceC18354E), 1, null) : modifier;
    }
}
