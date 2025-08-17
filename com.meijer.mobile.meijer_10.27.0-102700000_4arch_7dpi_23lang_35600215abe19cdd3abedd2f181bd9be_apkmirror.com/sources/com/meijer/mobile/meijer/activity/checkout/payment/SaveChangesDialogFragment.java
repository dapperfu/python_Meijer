package com.meijer.mobile.meijer.activity.checkout.payment;

import Mn.AbstractC4304x2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meijer.mobile.core.base.ui.dialogfragment.MeijerDialogFragment;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Deprecated
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/SaveChangesDialogFragment;", "Lcom/meijer/mobile/core/base/ui/dialogfragment/MeijerDialogFragment;", "<init>", "()V", "Lcom/meijer/mobile/meijer/activity/checkout/payment/u0;", "listener", "", "H0", "(Lcom/meijer/mobile/meijer/activity/checkout/payment/u0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "a", "Lcom/meijer/mobile/meijer/activity/checkout/payment/u0;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/t0;", "b", "Lcom/meijer/mobile/meijer/activity/checkout/payment/t0;", "item", "LMn/x2;", "c", "LMn/x2;", "binding", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SaveChangesDialogFragment extends MeijerDialogFragment {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f103703e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private u0 listener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private t0 item;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private AbstractC4304x2 binding;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/SaveChangesDialogFragment$a;", "", "<init>", "()V", "", "stringRes", "Lcom/meijer/mobile/meijer/activity/checkout/payment/SaveChangesDialogFragment;", "a", "(Ljava/lang/Integer;)Lcom/meijer/mobile/meijer/activity/checkout/payment/SaveChangesDialogFragment;", "", "SAVE_CHANGES_DIALOG_FRAGMENT_TAG", "Ljava/lang/String;", "STRING_RES", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.SaveChangesDialogFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ SaveChangesDialogFragment b(Companion companion, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = null;
            }
            return companion.a(num);
        }

        @Deprecated
        public final SaveChangesDialogFragment a(Integer stringRes) {
            SaveChangesDialogFragment saveChangesDialogFragment = new SaveChangesDialogFragment();
            Bundle bundle = new Bundle();
            if (stringRes != null) {
                bundle.putInt("string_res", stringRes.intValue());
            }
            saveChangesDialogFragment.setArguments(bundle);
            return saveChangesDialogFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(SaveChangesDialogFragment saveChangesDialogFragment, View view) {
        t0 t0Var = saveChangesDialogFragment.item;
        if (t0Var != null) {
            t0Var.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(SaveChangesDialogFragment saveChangesDialogFragment, View view) {
        t0 t0Var = saveChangesDialogFragment.item;
        if (t0Var != null) {
            t0Var.a();
        }
    }

    @Deprecated
    public final void H0(u0 listener) {
        this.listener = listener;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        this.binding = AbstractC4304x2.K0(inflater);
        Bundle arguments = getArguments();
        int i10 = arguments != null ? arguments.getInt("string_res", com.meijer.mobile.meijer.Y.f100128j0) : com.meijer.mobile.meijer.Y.f100128j0;
        AbstractC4304x2 abstractC4304x2 = this.binding;
        AbstractC4304x2 abstractC4304x22 = null;
        if (abstractC4304x2 == null) {
            Intrinsics.y("binding");
            abstractC4304x2 = null;
        }
        abstractC4304x2.f21115z.setText(i10);
        AbstractC4304x2 abstractC4304x23 = this.binding;
        if (abstractC4304x23 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4304x22 = abstractC4304x23;
        }
        View root = abstractC4304x22.getRoot();
        Intrinsics.i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC4304x2 abstractC4304x2 = this.binding;
        AbstractC4304x2 abstractC4304x22 = null;
        if (abstractC4304x2 == null) {
            Intrinsics.y("binding");
            abstractC4304x2 = null;
        }
        abstractC4304x2.f21113B.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SaveChangesDialogFragment.E0(this.f104076a, view2);
            }
        });
        AbstractC4304x2 abstractC4304x23 = this.binding;
        if (abstractC4304x23 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC4304x22 = abstractC4304x23;
        }
        abstractC4304x22.f21112A.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.checkout.payment.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SaveChangesDialogFragment.F0(this.f104078a, view2);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(false);
        u0 u0Var = this.listener;
        if (u0Var != null) {
            this.item = new t0(u0Var);
        }
    }
}
