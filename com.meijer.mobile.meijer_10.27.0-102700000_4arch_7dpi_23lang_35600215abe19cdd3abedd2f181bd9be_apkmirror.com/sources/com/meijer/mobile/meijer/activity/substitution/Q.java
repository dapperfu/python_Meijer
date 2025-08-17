package com.meijer.mobile.meijer.activity.substitution;

import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/substitution/Q;", "Lcom/meijer/mobile/meijer/activity/find/fragment/a;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "", "useCompose", "<init>", "(Landroidx/fragment/app/FragmentActivity;Z)V", "", "getItemCount", "()I", "position", "Landroidx/fragment/app/Fragment;", "createFragment", "(I)Landroidx/fragment/app/Fragment;", "Landroid/view/MotionEvent;", "ev", "", "h", "(Landroid/view/MotionEvent;)V", "Lcom/meijer/mobile/meijer/activity/substitution/SuggestedProductFragment;", "e", "Lcom/meijer/mobile/meijer/activity/substitution/SuggestedProductFragment;", "getSuggestedProductFragment$Meijer_playstoreRelease", "()Lcom/meijer/mobile/meijer/activity/substitution/SuggestedProductFragment;", "setSuggestedProductFragment$Meijer_playstoreRelease", "(Lcom/meijer/mobile/meijer/activity/substitution/SuggestedProductFragment;)V", "suggestedProductFragment", "f", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class Q extends com.meijer.mobile.meijer.activity.find.fragment.a {

    /* renamed from: g, reason: collision with root package name */
    public static final int f112817g = 8;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private SuggestedProductFragment suggestedProductFragment;

    @Override // com.meijer.mobile.meijer.activity.find.fragment.a, androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount */
    public int getTotalNumberOfTabs() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(FragmentActivity fragmentActivity, boolean z10) {
        super(fragmentActivity, z10);
        Intrinsics.j(fragmentActivity, "fragmentActivity");
    }

    @Override // androidx.viewpager2.adapter.a
    public Fragment createFragment(int position) {
        if (position == 0) {
            SuggestedProductFragment suggestedProductFragmentA = SuggestedProductFragment.INSTANCE.a();
            this.suggestedProductFragment = suggestedProductFragmentA;
            return suggestedProductFragmentA;
        }
        if (position == 1) {
            ProductsFragment productsFragmentB = ProductsFragment.Companion.b(ProductsFragment.INSTANCE, getQuery(), null, null, 6, null);
            i(productsFragmentB);
            return productsFragmentB;
        }
        throw new IllegalArgumentException("invalid position: " + position);
    }

    @Override // com.meijer.mobile.meijer.activity.find.fragment.a
    public void h(MotionEvent ev2) {
        SuggestedProductFragment suggestedProductFragment = this.suggestedProductFragment;
        if (suggestedProductFragment != null) {
            suggestedProductFragment.T(ev2);
        }
    }
}
