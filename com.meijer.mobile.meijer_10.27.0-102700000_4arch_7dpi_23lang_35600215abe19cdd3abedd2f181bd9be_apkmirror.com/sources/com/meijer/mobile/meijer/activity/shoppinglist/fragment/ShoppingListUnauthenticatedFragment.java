package com.meijer.mobile.meijer.activity.shoppinglist.fragment;

import Al.f;
import Mn.D1;
import Pj.g;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yl.AbstractC18227f;
import yl.k;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0004R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/fragment/ShoppingListUnauthenticatedFragment;", "Landroidx/fragment/app/Fragment;", "LPj/g;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onSignIn", "onCreateAccount", "Lyl/k;", "f", "Lyl/k;", "getFeatureManager", "()Lyl/k;", "setFeatureManager", "(Lyl/k;)V", "featureManager", "g", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ShoppingListUnauthenticatedFragment extends Hilt_ShoppingListUnauthenticatedFragment implements g {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f112501h = 8;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public k featureManager;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/meijer/activity/shoppinglist/fragment/ShoppingListUnauthenticatedFragment$a;", "", "<init>", "()V", "Lcom/meijer/mobile/meijer/activity/shoppinglist/fragment/ShoppingListUnauthenticatedFragment;", "a", "()Lcom/meijer/mobile/meijer/activity/shoppinglist/fragment/ShoppingListUnauthenticatedFragment;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.shoppinglist.fragment.ShoppingListUnauthenticatedFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ShoppingListUnauthenticatedFragment a() {
            return new ShoppingListUnauthenticatedFragment();
        }
    }

    public final k getFeatureManager() {
        k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    @Override // Pj.g
    public void onCreateAccount() {
        f fVar = f.f666a;
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(fVar.a(contextRequireContext, getFeatureManager().e(AbstractC18227f.h0.f170581h)));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        D1 d1K0 = D1.K0(inflater, container, false);
        Intrinsics.i(d1K0, "inflate(...)");
        d1K0.f19964G.setListener(this);
        View root = d1K0.getRoot();
        Intrinsics.i(root, "getRoot(...)");
        return root;
    }

    @Override // Pj.g
    public void onSignIn() {
        Context contextRequireContext = requireContext();
        Intrinsics.i(contextRequireContext, "requireContext(...)");
        startActivity(Al.k.b(contextRequireContext, false, null, Integer.valueOf(HttpResponseStatus.SUCCESS_OK), null, null, null, 118, null));
    }
}
