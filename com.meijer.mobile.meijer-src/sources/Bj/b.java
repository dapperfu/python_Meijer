package Bj;

import Aj.e;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"LBj/b;", "", "", "titleRes", "", "U0", "(I)V", BarcodePickDeserializer.FIELD_ICON, "description", "Lkotlin/Function0;", "upAction", "G", "(IILkotlin/jvm/functions/Function0;)V", "Landroidx/appcompat/widget/Toolbar;", "y", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "", "value", "getToolbarTitle", "()Ljava/lang/CharSequence;", "C", "(Ljava/lang/CharSequence;)V", "toolbarTitle", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface b {
    Toolbar y();

    static /* synthetic */ void o(b bVar, int i10, int i11, Function0 function0, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableHomeAsUp");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        bVar.G(i10, i11, function0);
    }

    default void G(int icon, int description, final Function0<Unit> upAction) {
        Intrinsics.j(upAction, "upAction");
        if (description != 0) {
            y().setNavigationContentDescription(description);
        } else {
            CharSequence navigationContentDescription = y().getNavigationContentDescription();
            if (navigationContentDescription == null || StringsKt.s0(navigationContentDescription)) {
                y().setNavigationContentDescription(e.f1348a);
            }
        }
        if (icon != 0) {
            y().setNavigationIcon(icon);
        }
        y().setNavigationOnClickListener(new View.OnClickListener() { // from class: Bj.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.E0(upAction, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    static void E0(Function0 function0, View view) {
        function0.invoke();
    }

    default void C(CharSequence charSequence) {
        y().setTitle(charSequence);
    }

    default void U0(int titleRes) {
        y().setTitle(titleRes);
    }
}
