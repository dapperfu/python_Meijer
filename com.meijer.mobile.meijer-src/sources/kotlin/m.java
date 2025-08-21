package kotlin;

import android.content.Context;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5953g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LH1/h;", "inset", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "content", "b", "(FLandroid/content/Context;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class m {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f19029a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f19030b;

        a(Context context, float f10) {
            this.f19029a = context;
            this.f19030b = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(K k10, float f10, f0 f0Var, f0 f0Var2, f0 f0Var3, f0 f0Var4, f0 f0Var5, f0 f0Var6, f0 f0Var7, Ref.BooleanRef booleanRef, Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3, Ref.IntRef intRef4, int i10, Ref.IntRef intRef5, Ref.IntRef intRef6, f0.a layout) {
            int iE0;
            Intrinsics.j(layout, "$this$layout");
            int iE02 = k10.E0(f10);
            if (f0Var != null) {
                f0.a.l(layout, f0Var, iE02, 0, 0.0f, 4, null);
                iE02 += f0Var.getWidth() + k10.E0(H1.h.p(6));
            }
            if (f0Var2 != null) {
                f0.a.l(layout, f0Var2, iE02, 0, 0.0f, 4, null);
                iE02 += f0Var2.getWidth();
            }
            if (f0Var3 != null) {
                f0.a.l(layout, f0Var3, iE02, k10.E0(H1.h.p(16)), 0.0f, 4, null);
                if (!booleanRef.f143735a && intRef.f143740a < intRef2.f143740a) {
                    iE02 += f0Var3.getWidth();
                }
            }
            if (f0Var4 != null) {
                int iE03 = k10.E0(H1.h.p(16));
                if ((booleanRef.f143735a || intRef.f143740a > intRef2.f143740a) && f0Var3 != null) {
                    iE03 += intRef3.f143740a + k10.E0(H1.h.p(4));
                }
                f0.a.l(layout, f0Var4, iE02, iE03, 0.0f, 4, null);
            }
            if (f0Var5 != null) {
                if (booleanRef.f143735a) {
                    iE0 = intRef4.f143740a + k10.E0(H1.h.p(16));
                    if (f0Var3 != null) {
                        iE0 += intRef3.f143740a + k10.E0(H1.h.p(4));
                    }
                } else {
                    iE0 = 0;
                }
                int iM0 = ((i10 - f0Var5.M0()) - intRef5.f143740a) - intRef6.f143740a;
                if (booleanRef.f143735a) {
                    f0.a.l(layout, f0Var5, iM0 - k10.E0(H1.h.p(16)), iE0 + k10.E0(H1.h.p(10)), 0.0f, 4, null);
                } else {
                    float f11 = 16;
                    f0.a.l(layout, f0Var5, iM0 - k10.E0(H1.h.p(f11)), k10.E0(H1.h.p(f11)) - k10.E0(H1.h.p(7)), 0.0f, 4, null);
                }
            }
            if (f0Var6 != null) {
                f0.a.l(layout, f0Var6, (i10 - f0Var6.M0()) - intRef5.f143740a, 0, 0.0f, 4, null);
            }
            if (f0Var7 != null) {
                f0.a.l(layout, f0Var7, i10 - f0Var7.M0(), 0, 0.0f, 4, null);
            }
            return Unit.f143329a;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0226  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0243  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x024e  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x0251  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x026d  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0282  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x0290  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x029b  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x02b0  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x01d8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:163:0x027d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:166:0x02ab A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x020e  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x021c  */
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.compose.ui.layout.J d(final androidx.compose.ui.layout.K r26, java.util.List<? extends androidx.compose.ui.layout.I> r27, long r28) {
            /*
                Method dump skipped, instructions count: 736
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Li.m.a.d(androidx.compose.ui.layout.K, java.util.List, long):androidx.compose.ui.layout.J");
        }
    }

    public static final void b(float f10, final Context context, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(context, "context");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1313788312);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.b(f10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(context) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                f10 = H1.h.p(0);
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1313788312, i12, -1, "com.meijer.mobile.android_acres_library.layouts.AdsNotification (NotificationLayout.kt:39)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(context) | ((i12 & 14) == 4);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new a(context, f10);
                composerStartRestartGroup.t(objB);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objB;
            composerStartRestartGroup.P();
            int i14 = (i12 >> 6) & 14;
            Modifier.Companion companion = Modifier.INSTANCE;
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            int i15 = ((i14 << 6) & 896) | 6;
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicy, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            content.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 6) & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final float f11 = f10;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Li.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m.c(f11, context, content, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(float f10, Context context, Function2 function2, int i10, int i11, Composer composer, int i12) {
        b(f10, context, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
