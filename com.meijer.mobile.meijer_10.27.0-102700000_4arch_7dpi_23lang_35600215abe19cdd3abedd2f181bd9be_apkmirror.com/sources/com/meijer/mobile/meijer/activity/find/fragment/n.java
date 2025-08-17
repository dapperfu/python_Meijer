package com.meijer.mobile.meijer.activity.find.fragment;

import Pp.SearchQuery;
import Rk.CouponOptions;
import Zm.InterfaceC5528a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vs.CartProductListDecorator;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 /2\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/fragment/n;", "Lcom/meijer/mobile/meijer/activity/find/fragment/a;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "", "useCompose", "<init>", "(Landroidx/fragment/app/FragmentActivity;Z)V", "", "position", "Landroidx/fragment/app/Fragment;", "createFragment", "(I)Landroidx/fragment/app/Fragment;", "LPp/a;", "searchQuery", "", "searchMethod", "", "n", "(LPp/a;Ljava/lang/String;)V", "bool", "q", "(Z)V", "LPp/b;", "searchType", "p", "(LPp/b;)V", "Lvs/b;", "item", "o", "(Lvs/b;)V", "Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "e", "Lcom/meijer/mobile/meijer/activity/coupons/fragment/CouponsFragment;", "couponsFragment", "LRk/a;", "f", "LRk/a;", "couponOptions", "g", "Z", "showCouponsOnly", "h", "LPp/b;", "i", "Lvs/b;", "itemToSubstitute", "j", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class n extends a {

    /* renamed from: k, reason: collision with root package name */
    public static final int f106899k = 8;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private CouponsFragment couponsFragment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final CouponOptions couponOptions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean showCouponsOnly;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Pp.b searchType;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private CartProductListDecorator itemToSubstitute;

    @Override // androidx.viewpager2.adapter.a
    public Fragment createFragment(int position) {
        l(1);
        if (this.showCouponsOnly) {
            CouponsFragment couponsFragmentB = CouponsFragment.Companion.b(CouponsFragment.INSTANCE, Pk.c.f28330f, this.couponOptions, null, 4, null);
            this.couponsFragment = couponsFragmentB;
            return couponsFragmentB;
        }
        if (position == 0) {
            if (getUseCompose()) {
                ProductsFragmentCompose productsFragmentComposeA = ProductsFragmentCompose.INSTANCE.a(getQuery(), this.searchType, this.itemToSubstitute);
                i(productsFragmentComposeA);
                return productsFragmentComposeA;
            }
            ProductsFragment productsFragmentA = ProductsFragment.INSTANCE.a(getQuery(), this.searchType, this.itemToSubstitute);
            i(productsFragmentA);
            return productsFragmentA;
        }
        if (position == 1) {
            CouponsFragment couponsFragmentB2 = CouponsFragment.Companion.b(CouponsFragment.INSTANCE, Pk.c.f28330f, this.couponOptions, null, 4, null);
            this.couponsFragment = couponsFragmentB2;
            return couponsFragmentB2;
        }
        throw new IllegalArgumentException("invalid position: " + position);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(FragmentActivity fragmentActivity, boolean z10) {
        super(fragmentActivity, z10);
        Intrinsics.j(fragmentActivity, "fragmentActivity");
        this.couponOptions = new CouponOptions(null, null, null, false, false, 0L, null, null, false, null, null, false, false, 8191, null);
        this.searchType = Pp.b.f28356a;
    }

    public void n(SearchQuery searchQuery, String searchMethod) {
        Intrinsics.j(searchQuery, "searchQuery");
        j(searchQuery.getQueryString());
        InterfaceC5528a productsFragment = getProductsFragment();
        if (productsFragment != null) {
            String query = getQuery();
            Intrinsics.g(query);
            productsFragment.i(query, searchMethod);
        }
        this.couponOptions.s(searchQuery);
        CouponsFragment couponsFragment = this.couponsFragment;
        if (couponsFragment != null) {
            couponsFragment.J1(this.couponOptions);
        }
    }

    public final void o(CartProductListDecorator item) {
        this.itemToSubstitute = item;
    }

    public final void p(Pp.b searchType) {
        Intrinsics.j(searchType, "searchType");
        this.searchType = searchType;
    }

    public final void q(boolean bool) {
        this.showCouponsOnly = bool;
    }
}
