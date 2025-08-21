package com.meijer.mobile.meijer.activity.cart;

import Nn.AbstractC4284r1;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import x4.InterfaceC18089i;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/CartBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onDetach", "Lcom/meijer/mobile/meijer/activity/cart/k0;", "f", "Lcom/meijer/mobile/meijer/activity/cart/k0;", "cartEntryActionDecorator", "LNn/r1;", "g", "LNn/r1;", "binding", "Lcom/meijer/mobile/meijer/activity/cart/CartBottomSheetDialogFragment$a;", "h", "Lcom/meijer/mobile/meijer/activity/cart/CartBottomSheetDialogFragment$a;", "listener", "i", "a", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class CartBottomSheetDialogFragment extends Hilt_CartBottomSheetDialogFragment {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f101954j = 8;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private CartEntryActionDecorator cartEntryActionDecorator;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private AbstractC4284r1 binding;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private a listener;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/CartBottomSheetDialogFragment$a;", "", "Lnk/f;", "product", "", "N0", "(Lnk/f;)V", "", "entryNumber", "", "note", "b", "(ILjava/lang/String;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        void N0(nk.f product);

        void b(int entryNumber, String note);

        static /* synthetic */ void J0(a aVar, int i10, String str, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEditNoteClicked");
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            aVar.b(i10, str);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/CartBottomSheetDialogFragment$b;", "", "<init>", "()V", "Lcom/meijer/mobile/meijer/activity/cart/k0;", "cartEntryActionDecorator", "Lcom/meijer/mobile/meijer/activity/cart/CartBottomSheetDialogFragment;", "a", "(Lcom/meijer/mobile/meijer/activity/cart/k0;)Lcom/meijer/mobile/meijer/activity/cart/CartBottomSheetDialogFragment;", "", "CART_BOTTOM_SHEET_ACTION_INFORMATION", "Ljava/lang/String;", "CART_BOTTOM_SHEET_TAG", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CartBottomSheetDialogFragment a(CartEntryActionDecorator cartEntryActionDecorator) {
            Intrinsics.j(cartEntryActionDecorator, "cartEntryActionDecorator");
            CartBottomSheetDialogFragment cartBottomSheetDialogFragment = new CartBottomSheetDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("cart_bottom_sheet_action_information", cartEntryActionDecorator);
            cartBottomSheetDialogFragment.setArguments(bundle);
            return cartBottomSheetDialogFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(CartBottomSheetDialogFragment cartBottomSheetDialogFragment, View view) {
        if (cartBottomSheetDialogFragment.cartEntryActionDecorator == null) {
            Intrinsics.x("cartEntryActionDecorator");
        }
        a aVar = cartBottomSheetDialogFragment.listener;
        if (aVar != null) {
            CartEntryActionDecorator cartEntryActionDecorator = cartBottomSheetDialogFragment.cartEntryActionDecorator;
            if (cartEntryActionDecorator == null) {
                Intrinsics.x("cartEntryActionDecorator");
                cartEntryActionDecorator = null;
            }
            aVar.N0(cartEntryActionDecorator.getProduct());
        }
        cartBottomSheetDialogFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(CartBottomSheetDialogFragment cartBottomSheetDialogFragment, View view) {
        if (cartBottomSheetDialogFragment.cartEntryActionDecorator == null) {
            Intrinsics.x("cartEntryActionDecorator");
        }
        a aVar = cartBottomSheetDialogFragment.listener;
        if (aVar != null) {
            CartEntryActionDecorator cartEntryActionDecorator = cartBottomSheetDialogFragment.cartEntryActionDecorator;
            if (cartEntryActionDecorator == null) {
                Intrinsics.x("cartEntryActionDecorator");
                cartEntryActionDecorator = null;
            }
            a.J0(aVar, cartEntryActionDecorator.getEntryNumber(), null, 2, null);
        }
        cartBottomSheetDialogFragment.dismiss();
    }

    @Override // com.meijer.mobile.meijer.activity.cart.Hilt_CartBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.j(context, "context");
        super.onAttach(context);
        try {
            InterfaceC18089i activity = getActivity();
            Intrinsics.h(activity, "null cannot be cast to non-null type com.meijer.mobile.meijer.activity.cart.CartBottomSheetDialogFragment.CartBottomSheetInteractionListener");
            this.listener = (a) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context + " must implementation CartBottomSheetDialogFragment.CartBottomSheetInteractionListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        AbstractC4284r1 abstractC4284r1M0 = AbstractC4284r1.M0(inflater, container, false);
        this.binding = abstractC4284r1M0;
        AbstractC4284r1 abstractC4284r1 = null;
        if (abstractC4284r1M0 == null) {
            Intrinsics.x("binding");
            abstractC4284r1M0 = null;
        }
        TableRow addNoteSection = abstractC4284r1M0.f22241A;
        Intrinsics.i(addNoteSection, "addNoteSection");
        CartEntryActionDecorator cartEntryActionDecorator = this.cartEntryActionDecorator;
        if (cartEntryActionDecorator == null) {
            Intrinsics.x("cartEntryActionDecorator");
            cartEntryActionDecorator = null;
        }
        addNoteSection.setVisibility(cartEntryActionDecorator.getIsEntryHasNote() ? 8 : 0);
        AbstractC4284r1 abstractC4284r12 = this.binding;
        if (abstractC4284r12 == null) {
            Intrinsics.x("binding");
            abstractC4284r12 = null;
        }
        abstractC4284r12.f22248H.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartBottomSheetDialogFragment.J0(this.f102691a, view);
            }
        });
        AbstractC4284r1 abstractC4284r13 = this.binding;
        if (abstractC4284r13 == null) {
            Intrinsics.x("binding");
            abstractC4284r13 = null;
        }
        abstractC4284r13.f22241A.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartBottomSheetDialogFragment.K0(this.f102695a, view);
            }
        });
        AbstractC4284r1 abstractC4284r14 = this.binding;
        if (abstractC4284r14 == null) {
            Intrinsics.x("binding");
            abstractC4284r14 = null;
        }
        abstractC4284r14.f22244D.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.cart.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CartBottomSheetDialogFragment.L0(this.f102697a, view);
            }
        });
        AbstractC4284r1 abstractC4284r15 = this.binding;
        if (abstractC4284r15 == null) {
            Intrinsics.x("binding");
        } else {
            abstractC4284r1 = abstractC4284r15;
        }
        View root = abstractC4284r1.getRoot();
        Intrinsics.i(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(CartBottomSheetDialogFragment cartBottomSheetDialogFragment, View view) {
        cartBottomSheetDialogFragment.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Object obj;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = (Parcelable) arguments.getParcelable("cart_bottom_sheet_action_information", CartEntryActionDecorator.class);
            } else {
                Parcelable parcelable = arguments.getParcelable("cart_bottom_sheet_action_information");
                if (!(parcelable instanceof CartEntryActionDecorator)) {
                    parcelable = null;
                }
                obj = (CartEntryActionDecorator) parcelable;
            }
            Intrinsics.g(obj);
            this.cartEntryActionDecorator = (CartEntryActionDecorator) obj;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.listener = null;
    }
}
