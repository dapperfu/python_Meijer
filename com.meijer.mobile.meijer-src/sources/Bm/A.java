package Bm;

import Nn.v3;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.meijer.mobile.core.design.widget.checkoutprogressstepperview.ProgressIndicatorView;
import java.util.List;
import kl.CheckoutFlowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "isEditMode", "Lkl/f;", "checkoutFlowState", "showFull", "", "c", "(ZLkl/f;ZLandroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class A {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, v3> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3155b = new a();

        a() {
            super(3, v3.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/meijer/mobile/meijer/databinding/ViewProgressIndicatorBinding;", 0);
        }

        public final v3 a(LayoutInflater p02, ViewGroup viewGroup, boolean z10) {
            Intrinsics.j(p02, "p0");
            return v3.M0(p02, viewGroup, z10);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ v3 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return a(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    public static final void c(boolean z10, final CheckoutFlowState checkoutFlowState, boolean z11, Composer composer, final int i10, final int i11) {
        int i12;
        final boolean z12;
        final CheckoutFlowState checkoutFlowState2;
        final boolean z13;
        List<String> listC;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1634260671);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.a(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(checkoutFlowState) ? 32 : 16;
        }
        int i15 = i11 & 4;
        if (i15 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.a(z11) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            z12 = z11;
            z13 = z10;
            checkoutFlowState2 = checkoutFlowState;
        } else {
            if (i13 != 0) {
                z10 = false;
            }
            if (i14 != 0) {
                checkoutFlowState = null;
            }
            final boolean z14 = i15 != 0 ? false : z11;
            if (ComposerKt.M()) {
                ComposerKt.U(-1634260671, i12, -1, "com.meijer.mobile.meijer.activity.checkout.composables.CheckoutProgressIndicator (CheckoutProgressIndicator.kt:25)");
            }
            if (!z10 && checkoutFlowState != null && (listC = checkoutFlowState.c()) != null && (!listC.isEmpty())) {
                final Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objB = composerStartRestartGroup.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = a.f3155b;
                    composerStartRestartGroup.t(objB);
                }
                composerStartRestartGroup.P();
                Function3 function3 = (Function3) ((KFunction) objB);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zD = composerStartRestartGroup.D(context) | composerStartRestartGroup.D(checkoutFlowState) | ((i12 & 896) == 256);
                Object objB2 = composerStartRestartGroup.B();
                if (zD || objB2 == companion.a()) {
                    objB2 = new Function1() { // from class: Bm.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return A.d(context, checkoutFlowState, z14, (v3) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB2);
                }
                composerStartRestartGroup.P();
                androidx.compose.ui.viewinterop.a.a(function3, null, (Function1) objB2, composerStartRestartGroup, 6, 2);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            z12 = z14;
            checkoutFlowState2 = checkoutFlowState;
            z13 = z10;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Bm.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return A.e(z13, checkoutFlowState2, z12, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Context context, CheckoutFlowState checkoutFlowState, boolean z10, v3 AndroidViewBinding) {
        Intrinsics.j(AndroidViewBinding, "$this$AndroidViewBinding");
        ProgressIndicatorView progressIndicatorView = AndroidViewBinding.f22381z;
        progressIndicatorView.setPadding((int) Ds.p.b(context, checkoutFlowState.getHorizontalPaddingInDp()), progressIndicatorView.getPaddingTop(), (int) Ds.p.b(context, checkoutFlowState.getHorizontalPaddingInDp()), progressIndicatorView.getPaddingBottom());
        if (z10) {
            progressIndicatorView.d(checkoutFlowState.c(), 3);
        } else {
            progressIndicatorView.d(checkoutFlowState.c(), checkoutFlowState.getCurrentStep());
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(boolean z10, CheckoutFlowState checkoutFlowState, boolean z11, int i10, int i11, Composer composer, int i12) {
        c(z10, checkoutFlowState, z11, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
