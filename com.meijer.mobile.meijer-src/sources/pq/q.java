package pq;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "c", "(Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "context", "", "isFull", "g", "(Landroid/content/Context;Z)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class q {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pq/q$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements E {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f157063a;

        public a(Context context) {
            this.f157063a = context;
        }

        @Override // androidx.compose.runtime.E
        public void dispose() {
            q.g(this.f157063a, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E d(Context context, F DisposableEffect) {
        Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
        g(context, true);
        return new a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(int i10, Composer composer, int i11) {
        c(composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Context context, boolean z10) {
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        Intrinsics.i(attributes, "getAttributes(...)");
        attributes.screenBrightness = z10 ? 1.0f : -1.0f;
        activity.getWindow().setAttributes(attributes);
    }

    public static final void c(Composer composer, final int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-811098233);
        if (i10 == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-811098233, i10, -1, "com.meijer.mobile.shopandscan.presentation.widget.UpdateBrightness (UpdateBrightness.kt:24)");
            }
            final Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            Unit unit = Unit.f143329a;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(context);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: pq.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.d(context, (F) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J.c(unit, (Function1) objB, composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: pq.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return q.e(i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
