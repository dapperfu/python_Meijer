package Kr;

import Di.j;
import Di.o;
import Ki.LocalThemeScope;
import Ki.Q;
import Kr.f;
import android.content.Context;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import dk.C13698b;
import ki.InterfaceC15160b0;
import ki.a1;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\n\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0012²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\nX\u008a\u0084\u0002"}, d2 = {"LKr/g;", "T", "LKi/M;", "LKr/b;", "permissionRequest", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "onResolve", "b", "(LKi/M;LKr/b;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "", "permissionsGranted", "LKr/a;", "permissionType", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f17685a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PermissionRequestDecorator<T> f17686b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f17687c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<T, Unit> f17688d;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, PermissionRequestDecorator<? extends T> permissionRequestDecorator, Context context, Function1<? super T, Unit> function1) {
            this.f17685a = localThemeScope;
            this.f17686b = permissionRequestDecorator;
            this.f17687c = context;
            this.f17688d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(PermissionRequestDecorator permissionRequestDecorator, Context context, final Function1 function1, o AdsInlineNotification) {
            Intrinsics.j(AdsInlineNotification, "$this$AdsInlineNotification");
            final g gVarC = permissionRequestDecorator.c();
            if (gVarC != null) {
                AdsInlineNotification.F(permissionRequestDecorator.getActionName().b(context), new Function0() { // from class: Kr.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f.a.e(function1, gVarC);
                    }
                });
            }
            return Unit.f143329a;
        }

        public final void c(InterfaceC15160b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-596520740, i10, -1, "com.meijer.mobile.ui.common.permissions.PermissionRequestView.<anonymous>.<anonymous> (PermissionRequestView.kt:46)");
            }
            LocalThemeScope localThemeScope = this.f17685a;
            String strA = C13698b.a(this.f17686b.getMessage(), composer, AbstractC6392a.f60445b);
            q1.m.Inline warning = Assemble.getToastVariant().getWarning();
            composer.startReplaceGroup(-1746271574);
            boolean zD = composer.D(this.f17686b) | composer.D(this.f17687c) | composer.V(this.f17688d);
            final PermissionRequestDecorator<T> permissionRequestDecorator = this.f17686b;
            final Context context = this.f17687c;
            final Function1<T, Unit> function1 = this.f17688d;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Kr.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f.a.d(permissionRequestDecorator, context, function1, (o) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            j.i(localThemeScope, null, strA, null, warning, (Function1) objB, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 5);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
            c(interfaceC15160b0, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, g gVar) {
            function1.invoke(gVar);
            return Unit.f143329a;
        }
    }

    public static final <T extends g> void b(final LocalThemeScope localThemeScope, final PermissionRequestDecorator<? extends T> permissionRequest, Modifier modifier, final Function1<? super T, Unit> onResolve, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(permissionRequest, "permissionRequest");
        Intrinsics.j(onResolve, "onResolve");
        Composer composerStartRestartGroup = composer.startRestartGroup(1887818767);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(permissionRequest) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onResolve) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1887818767, i12, -1, "com.meijer.mobile.ui.common.permissions.PermissionRequestView (PermissionRequestView.kt:42)");
            }
            Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
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
            Q.e(localThemeScope, a1.f142015a, ComposableLambdaKt.c(-596520740, true, new a(localThemeScope, permissionRequest, context, onResolve), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (a1.f142016b << 3));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Kr.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f.c(localThemeScope, permissionRequest, modifier2, onResolve, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, PermissionRequestDecorator permissionRequestDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, permissionRequestDecorator, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
