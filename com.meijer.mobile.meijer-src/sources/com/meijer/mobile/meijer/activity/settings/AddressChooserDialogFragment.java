package com.meijer.mobile.meijer.activity.settings;

import Cn.SplitAddress;
import Nn.AbstractC4223d1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meijer.mobile.core.base.ui.dialogfragment.MeijerDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/AddressChooserDialogFragment;", "Lcom/meijer/mobile/core/base/ui/dialogfragment/MeijerDialogFragment;", "<init>", "()V", "Lcom/meijer/mobile/meijer/activity/settings/a;", "listener", "", "D0", "(Lcom/meijer/mobile/meijer/activity/settings/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "a", "Lcom/meijer/mobile/meijer/activity/settings/a;", "LEn/r;", "b", "LEn/r;", "item", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AddressChooserDialogFragment extends MeijerDialogFragment {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f112552d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private a listener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private En.r item;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/AddressChooserDialogFragment$a;", "", "<init>", "()V", "LCn/e;", "userAddress", "suggestedAddress", "Lcom/meijer/mobile/meijer/activity/settings/AddressChooserDialogFragment;", "a", "(LCn/e;LCn/e;)Lcom/meijer/mobile/meijer/activity/settings/AddressChooserDialogFragment;", "", "SUGGESTED_ADDRESS_DIALOG_FRAGMENT_TAG", "Ljava/lang/String;", "USER_ADDRESS", "SUGGESTED_ADDRESS", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.settings.AddressChooserDialogFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AddressChooserDialogFragment a(SplitAddress userAddress, SplitAddress suggestedAddress) {
            Intrinsics.j(userAddress, "userAddress");
            Intrinsics.j(suggestedAddress, "suggestedAddress");
            AddressChooserDialogFragment addressChooserDialogFragment = new AddressChooserDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("user_address", userAddress);
            bundle.putParcelable("suggested_address", suggestedAddress);
            addressChooserDialogFragment.setArguments(bundle);
            return addressChooserDialogFragment;
        }
    }

    public final void D0(a listener) {
        this.listener = listener;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        AbstractC4223d1 abstractC4223d1M0 = AbstractC4223d1.M0(inflater);
        Intrinsics.i(abstractC4223d1M0, "inflate(...)");
        abstractC4223d1M0.O0(this.item);
        View root = abstractC4223d1M0.getRoot();
        Intrinsics.i(root, "getRoot(...)");
        return root;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            r12 = 0
            r11.setCancelable(r12)
            android.os.Bundle r12 = r11.getArguments()
            r0 = 0
            java.lang.Class<Cn.e> r1 = Cn.SplitAddress.class
            r2 = 33
            if (r12 == 0) goto L2e
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = "user_address"
            if (r3 < r2) goto L1f
            java.lang.Object r12 = com.google.android.libraries.places.internal.a.a(r12, r4, r1)
            android.os.Parcelable r12 = (android.os.Parcelable) r12
            goto L2a
        L1f:
            android.os.Parcelable r12 = r12.getParcelable(r4)
            boolean r3 = r12 instanceof Cn.SplitAddress
            if (r3 != 0) goto L28
            r12 = r0
        L28:
            Cn.e r12 = (Cn.SplitAddress) r12
        L2a:
            Cn.e r12 = (Cn.SplitAddress) r12
            if (r12 != 0) goto L3c
        L2e:
            Cn.e r3 = new Cn.e
            r9 = 31
            r10 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r12 = r3
        L3c:
            android.os.Bundle r3 = r11.getArguments()
            if (r3 == 0) goto L5f
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r5 = "suggested_address"
            if (r4 < r2) goto L4f
            java.lang.Object r0 = com.google.android.libraries.places.internal.a.a(r3, r5, r1)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            goto L5b
        L4f:
            android.os.Parcelable r1 = r3.getParcelable(r5)
            boolean r2 = r1 instanceof Cn.SplitAddress
            if (r2 != 0) goto L58
            goto L59
        L58:
            r0 = r1
        L59:
            Cn.e r0 = (Cn.SplitAddress) r0
        L5b:
            Cn.e r0 = (Cn.SplitAddress) r0
            if (r0 != 0) goto L6d
        L5f:
            Cn.e r1 = new Cn.e
            r7 = 31
            r8 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0 = r1
        L6d:
            com.meijer.mobile.meijer.activity.settings.a r1 = r11.listener
            if (r1 == 0) goto L78
            En.r r2 = new En.r
            r2.<init>(r1, r12, r0)
            r11.item = r2
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.AddressChooserDialogFragment.onCreate(android.os.Bundle):void");
    }
}
