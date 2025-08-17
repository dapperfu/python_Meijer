package Zm;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "", "b", "(Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Zm.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5530c {
    public static final void b(BottomSheetDialogFragment bottomSheetDialogFragment) {
        Intrinsics.j(bottomSheetDialogFragment, "<this>");
        final Dialog dialog = bottomSheetDialogFragment.getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: Zm.b
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    C5530c.c(dialog, dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Dialog dialog, DialogInterface dialogInterface) {
        View viewFindViewById = dialog.findViewById(ae.f.f44689h);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundResource(R.color.transparent);
        }
    }
}
