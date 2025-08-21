package com.meijer.mobile.meijer.activity.cart;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vs.CartProductListDecorator;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0002\u0015\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/EditBackUpItemBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lvs/b;", "item", "Lcom/meijer/mobile/meijer/activity/cart/EditBackUpItemBottomSheet$b;", "listener", "<init>", "(Lvs/b;Lcom/meijer/mobile/meijer/activity/cart/EditBackUpItemBottomSheet$b;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "a", "Lvs/b;", "getItem", "()Lvs/b;", "b", "Lcom/meijer/mobile/meijer/activity/cart/EditBackUpItemBottomSheet$b;", "getListener", "()Lcom/meijer/mobile/meijer/activity/cart/EditBackUpItemBottomSheet$b;", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EditBackUpItemBottomSheet extends BottomSheetDialogFragment {

    /* renamed from: d, reason: collision with root package name */
    public static final int f102418d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CartProductListDecorator item;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b listener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/EditBackUpItemBottomSheet$b;", "", "Lvs/b;", "item", "", "k", "(Lvs/b;)V", "l", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void k(CartProductListDecorator item);

        void l(CartProductListDecorator item);
    }

    public EditBackUpItemBottomSheet(CartProductListDecorator item, b listener) {
        Intrinsics.j(item, "item");
        Intrinsics.j(listener, "listener");
        this.item = item;
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(EditBackUpItemBottomSheet editBackUpItemBottomSheet, View view) {
        editBackUpItemBottomSheet.listener.k(editBackUpItemBottomSheet.item);
        Dialog dialog = editBackUpItemBottomSheet.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(EditBackUpItemBottomSheet editBackUpItemBottomSheet, View view) {
        editBackUpItemBottomSheet.listener.l(editBackUpItemBottomSheet.item);
        Dialog dialog = editBackUpItemBottomSheet.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        View viewInflate = inflater.inflate(com.meijer.mobile.meijer.V.f100238g0, container, false);
        View viewFindViewById = viewInflate.findViewById(com.meijer.mobile.meijer.T.f100134x0);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = viewInflate.findViewById(com.meijer.mobile.meijer.T.f99697H6);
        Intrinsics.i(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = viewInflate.findViewById(com.meijer.mobile.meijer.T.f99882a1);
        Intrinsics.i(viewFindViewById3, "findViewById(...)");
        ((Button) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.W0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditBackUpItemBottomSheet.J0(this.f102569a, view);
            }
        });
        ((Button) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.X0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditBackUpItemBottomSheet.K0(this.f102588a, view);
            }
        });
        ((Button) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.Y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditBackUpItemBottomSheet.L0(this.f102590a, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(EditBackUpItemBottomSheet editBackUpItemBottomSheet, View view) {
        Dialog dialog = editBackUpItemBottomSheet.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
