package kotlin;

import H1.r;
import androidx.compose.foundation.text.B;
import androidx.compose.foundation.text.E;
import androidx.compose.foundation.text.EnumC5824n;
import androidx.compose.foundation.text.N;
import androidx.compose.foundation.text.P;
import androidx.compose.foundation.text.h0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.y;
import g1.J;
import g1.U;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"", "isStartHandle", "LF1/i;", "direction", "Lw0/Q;", "manager", "", "a", "(ZLF1/i;Lw0/Q;Landroidx/compose/runtime/Composer;I)V", "c", "(Lw0/Q;Z)Z", "LH1/r;", "magnifierSize", "LU0/f;", "b", "(Lw0/Q;J)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17779S {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LU0/f;", "<anonymous>", "()LU0/f;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.S$a */
    static final class a implements InterfaceC17797m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C17778Q f166635a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f166636b;

        a(C17778Q c17778q, boolean z10) {
            this.f166635a = c17778q;
            this.f166636b = z10;
        }

        @Override // kotlin.InterfaceC17797m
        public final long a() {
            return this.f166635a.K(this.f166636b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w0.S$b */
    static final class b implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P f166637a;

        b(P p10) {
            this.f166637a = p10;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(J j10, Continuation<? super Unit> continuation) {
            Object objC = E.c(j10, this.f166637a, continuation);
            return objC == IntrinsicsKt.f() ? objC : Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.S$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f166638f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ F1.i f166639g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C17778Q f166640h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f166641i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, F1.i iVar, C17778Q c17778q, int i10) {
            super(2);
            this.f166638f = z10;
            this.f166639g = iVar;
            this.f166640h = c17778q;
            this.f166641i = i10;
        }

        public final void a(Composer composer, int i10) {
            C17779S.a(this.f166638f, this.f166639g, this.f166640h, composer, J0.a(this.f166641i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.S$d */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC5824n.values().length];
            try {
                iArr[EnumC5824n.f49914a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5824n.f49915b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5824n.f49916c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(boolean z10, F1.i iVar, C17778Q c17778q, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1344558920);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(iVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(c17778q) ? 256 : 128;
        }
        if (composerStartRestartGroup.p((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-1344558920, i11, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1029)");
            }
            int i12 = i11 & 14;
            boolean zV = (i12 == 4) | composerStartRestartGroup.V(c17778q);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = c17778q.W(z10);
                composerStartRestartGroup.t(objB);
            }
            P p10 = (P) objB;
            boolean zD = composerStartRestartGroup.D(c17778q) | (i12 == 4);
            Object objB2 = composerStartRestartGroup.B();
            if (zD || objB2 == Composer.INSTANCE.a()) {
                objB2 = new a(c17778q, z10);
                composerStartRestartGroup.t(objB2);
            }
            InterfaceC17797m interfaceC17797m = (InterfaceC17797m) objB2;
            boolean zM = y.m(c17778q.U().getSelection());
            float fJ = c17778q.J(z10);
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean zD2 = composerStartRestartGroup.D(p10);
            Object objB3 = composerStartRestartGroup.B();
            if (zD2 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new b(p10);
                composerStartRestartGroup.t(objB3);
            }
            C17785a.b(interfaceC17797m, z10, iVar, zM, 0L, fJ, U.c(companion, p10, (PointerInputEventHandler) objB3), composerStartRestartGroup, (i11 << 3) & 1008, 16);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new c(z10, iVar, c17778q, i10));
        }
    }

    public static final long b(C17778Q c17778q, long j10) {
        int i10;
        int iN;
        h0 h0VarL;
        N textDelegate;
        AnnotatedString text;
        U0.f fVarD = c17778q.D();
        if (fVarD != null) {
            long packedValue = fVarD.getPackedValue();
            AnnotatedString annotatedStringS = c17778q.S();
            if (annotatedStringS != null && annotatedStringS.length() != 0) {
                EnumC5824n enumC5824nF = c17778q.F();
                if (enumC5824nF == null) {
                    i10 = -1;
                } else {
                    i10 = d.$EnumSwitchMapping$0[enumC5824nF.ordinal()];
                }
                if (i10 != -1) {
                    if (i10 != 1 && i10 != 2) {
                        if (i10 == 3) {
                            iN = y.i(c17778q.U().getSelection());
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        iN = y.n(c17778q.U().getSelection());
                    }
                    B state = c17778q.getState();
                    if (state != null && (h0VarL = state.l()) != null) {
                        B state2 = c17778q.getState();
                        if (state2 != null && (textDelegate = state2.getTextDelegate()) != null && (text = textDelegate.getText()) != null) {
                            int iO = RangesKt.o(c17778q.getOffsetMapping().b(iN), 0, text.length());
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (h0VarL.j(packedValue) >> 32));
                            TextLayoutResult value = h0VarL.getValue();
                            int iQ = value.q(iO);
                            float fS = value.s(iQ);
                            float fT = value.t(iQ);
                            float fN = RangesKt.n(fIntBitsToFloat, Math.min(fS, fT), Math.max(fS, fT));
                            if (!r.e(j10, r.INSTANCE.a()) && Math.abs(fIntBitsToFloat - fN) > ((int) (j10 >> 32)) / 2) {
                                return U0.f.INSTANCE.b();
                            }
                            float fV = value.v(iQ);
                            return U0.f.e((Float.floatToRawIntBits(fN) << 32) | (Float.floatToRawIntBits(((value.m(iQ) - fV) / 2) + fV) & 4294967295L));
                        }
                        return U0.f.INSTANCE.b();
                    }
                    return U0.f.INSTANCE.b();
                }
                return U0.f.INSTANCE.b();
            }
            return U0.f.INSTANCE.b();
        }
        return U0.f.INSTANCE.b();
    }

    public static final boolean c(C17778Q c17778q, boolean z10) {
        LayoutCoordinates layoutCoordinatesK;
        Rect rectI;
        B state = c17778q.getState();
        if (state != null && (layoutCoordinatesK = state.k()) != null && (rectI = C17769H.i(layoutCoordinatesK)) != null) {
            return C17769H.d(rectI, c17778q.K(z10));
        }
        return false;
    }
}
