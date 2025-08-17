package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.EnumC13827z;
import kotlin.InterfaceC15725K;
import kotlin.InterfaceC15758r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001aA\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Ln0/r;", "itemProviderLambda", "Ln0/K;", "state", "Lf0/z;", "orientation", "", "userScrollEnabled", "reverseScrolling", "c", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Ln0/K;Lf0/z;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "b", "(II)F", "canScrollForward", "a", "(IIZ)F", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {
    public static final float b(int i10, int i11) {
        return i11 + (i10 * HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR);
    }

    public static final float a(int i10, int i11, boolean z10) {
        return z10 ? b(i10, i11) + 100 : b(i10, i11);
    }

    public static final Modifier c(Modifier modifier, Function0<? extends InterfaceC15758r> function0, InterfaceC15725K interfaceC15725K, EnumC13827z enumC13827z, boolean z10, boolean z11, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1070136913, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:48)");
        }
        Modifier modifierThen = modifier.then(new LazyLayoutSemanticsModifier(function0, interfaceC15725K, enumC13827z, z10, z11));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return modifierThen;
    }
}
