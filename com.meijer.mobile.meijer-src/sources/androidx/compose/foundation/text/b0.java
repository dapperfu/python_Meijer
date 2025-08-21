package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import d0.EnumC13564E;
import kotlin.C13901I;
import kotlin.EnumC13937z;
import kotlin.InterfaceC13897E;
import kotlin.InterfaceC13900H;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.TextLayoutResult;
import z1.TextFieldValue;
import z1.TransformedText;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u001c\u001a\u00020\u001b*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/d0;", "scrollerPosition", "Lh0/l;", "interactionSource", "", "enabled", "d", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/d0;Lh0/l;Z)Landroidx/compose/ui/Modifier;", "Lz1/M;", "textFieldValue", "Lz1/W;", "visualTransformation", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/h0;", "textLayoutResultProvider", "b", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/d0;Lz1/M;Lz1/W;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "LH1/d;", "", "cursorOffset", "Lz1/U;", "transformedText", "Lu1/v;", "textLayoutResult", "rtl", "textFieldWidth", "Landroidx/compose/ui/geometry/Rect;", "c", "(LH1/d;ILz1/U;Lu1/v;ZI)Landroidx/compose/ui/geometry/Rect;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b0 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC13937z.values().length];
            try {
                iArr[EnumC13937z.f131419a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13937z.f131420b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class b extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d0 f49579f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0.l f49580g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f49581h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d0 d0Var, h0.l lVar, boolean z10) {
            super(1);
            this.f49579f = d0Var;
            this.f49580g = lVar;
            this.f49581h = z10;
        }

        public final void a(N0 n02) {
            n02.b("textFieldScrollable");
            n02.getProperties().c("scrollerPosition", this.f49579f);
            n02.getProperties().c("interactionSource", this.f49580g);
            n02.getProperties().c("enabled", Boolean.valueOf(this.f49581h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class c extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d0 f49582f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f49583g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0.l f49584h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "delta", "b", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<Float, Float> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ d0 f49585f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var) {
                super(1);
                this.f49585f = d0Var;
            }

            public final Float b(float f10) {
                float fD = this.f49585f.d() + f10;
                if (fD > this.f49585f.c()) {
                    f10 = this.f49585f.c() - this.f49585f.d();
                } else if (fD < 0.0f) {
                    f10 = -this.f49585f.d();
                }
                d0 d0Var = this.f49585f;
                d0Var.h(d0Var.d() + f10);
                return Float.valueOf(f10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                return b(f10.floatValue());
            }
        }

        @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u00062'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\rH\u0096A¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00118\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u001b"}, d2 = {"androidx/compose/foundation/text/b0$c$b", "Lf0/H;", "", "delta", "f", "(F)F", "Ld0/E;", "scrollPriority", "Lkotlin/Function2;", "Lf0/E;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "Landroidx/compose/runtime/z1;", "e", "()Z", "canScrollForward", "c", "d", "canScrollBackward", "isScrollInProgress", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        public static final class b implements InterfaceC13900H {

            /* renamed from: a, reason: collision with root package name */
            private final /* synthetic */ InterfaceC13900H f49586a;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final z1 canScrollForward;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final z1 canScrollBackward;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
            static final class a extends Lambda implements Function0<Boolean> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ d0 f49589f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(d0 d0Var) {
                    super(0);
                    this.f49589f = d0Var;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f49589f.d() > 0.0f);
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.foundation.text.b0$c$b$b, reason: collision with other inner class name */
            static final class C1039b extends Lambda implements Function0<Boolean> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ d0 f49590f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1039b(d0 d0Var) {
                    super(0);
                    this.f49590f = d0Var;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f49590f.d() < this.f49590f.c());
                }
            }

            @Override // kotlin.InterfaceC13900H
            public boolean b() {
                return this.f49586a.b();
            }

            @Override // kotlin.InterfaceC13900H
            public float f(float delta) {
                return this.f49586a.f(delta);
            }

            @Override // kotlin.InterfaceC13900H
            public Object a(EnumC13564E enumC13564E, Function2<? super InterfaceC13897E, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
                return this.f49586a.a(enumC13564E, function2, continuation);
            }

            @Override // kotlin.InterfaceC13900H
            public boolean d() {
                return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
            }

            @Override // kotlin.InterfaceC13900H
            public boolean e() {
                return ((Boolean) this.canScrollForward.getValue()).booleanValue();
            }

            b(InterfaceC13900H interfaceC13900H, d0 d0Var) {
                this.f49586a = interfaceC13900H;
                this.canScrollForward = o1.e(new C1039b(d0Var));
                this.canScrollBackward = o1.e(new a(d0Var));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d0 d0Var, boolean z10, h0.l lVar) {
            super(3);
            this.f49582f = d0Var;
            this.f49583g = z10;
            this.f49584h = lVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            boolean z10;
            boolean z11;
            boolean z12;
            composer.startReplaceGroup(805428266);
            if (ComposerKt.M()) {
                ComposerKt.U(805428266, i10, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:71)");
            }
            if (composer.o(C6034t0.m()) == H1.t.f13339b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f49582f.f() != EnumC13937z.f131419a && z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean zV = composer.V(this.f49582f);
            d0 d0Var = this.f49582f;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(d0Var);
                composer.t(objB);
            }
            InterfaceC13900H interfaceC13900HB = C13901I.b((Function1) objB, composer, 0);
            boolean zV2 = composer.V(interfaceC13900HB) | composer.V(this.f49582f);
            d0 d0Var2 = this.f49582f;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new b(interfaceC13900HB, d0Var2);
                composer.t(objB2);
            }
            b bVar = (b) objB2;
            Modifier.Companion companion = Modifier.INSTANCE;
            EnumC13937z enumC13937zF = this.f49582f.f();
            if (this.f49583g && this.f49582f.c() != 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            Modifier modifierK = androidx.compose.foundation.gestures.g.k(companion, bVar, enumC13937zF, z12, z11, null, this.f49584h, 16, null);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierK;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect c(H1.d dVar, int i10, TransformedText transformedText, TextLayoutResult textLayoutResult, boolean z10, int i11) {
        Rect rectA;
        if (textLayoutResult == null || (rectA = textLayoutResult.e(transformedText.getOffsetMapping().b(i10))) == null) {
            rectA = Rect.INSTANCE.a();
        }
        Rect rect = rectA;
        int iE0 = dVar.E0(S.a());
        return Rect.h(rect, z10 ? (i11 - rect.getLeft()) - iE0 : rect.getLeft(), 0.0f, z10 ? i11 - rect.getLeft() : iE0 + rect.getLeft(), 0.0f, 10, null);
    }

    public static final Modifier b(Modifier modifier, d0 d0Var, TextFieldValue textFieldValue, z1.W w10, Function0<h0> function0) {
        Modifier x0Var;
        EnumC13937z enumC13937zF = d0Var.f();
        int iE = d0Var.e(textFieldValue.getSelection());
        d0Var.i(textFieldValue.getSelection());
        TransformedText transformedTextC = w0.c(w10, textFieldValue.getText());
        int i10 = a.$EnumSwitchMapping$0[enumC13937zF.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                x0Var = new C5827q(d0Var, iE, transformedTextC, function0);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            x0Var = new x0(d0Var, iE, transformedTextC, function0);
        }
        return T0.e.b(modifier).then(x0Var);
    }

    public static final Modifier d(Modifier modifier, d0 d0Var, h0.l lVar, boolean z10) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new b(d0Var, lVar, z10);
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier, function1A, new c(d0Var, z10, lVar));
    }
}
