package com.meijer.mobile.shoppinglist.di;

import gi.InterfaceC14261a;
import pu.InterfaceC16421a;
import yl.k;

/* loaded from: classes11.dex */
public final class d implements InterfaceC16421a<ShoppingListFeatureActivity> {
    public static void a(ShoppingListFeatureActivity shoppingListFeatureActivity, InterfaceC14261a interfaceC14261a) {
        shoppingListFeatureActivity.analyticsEngine = interfaceC14261a;
    }

    public static void b(ShoppingListFeatureActivity shoppingListFeatureActivity, Al.g gVar) {
        shoppingListFeatureActivity.featureEntryPoint = gVar;
    }

    public static void c(ShoppingListFeatureActivity shoppingListFeatureActivity, k kVar) {
        shoppingListFeatureActivity.featureManager = kVar;
    }

    public static void d(ShoppingListFeatureActivity shoppingListFeatureActivity, yo.k kVar) {
        shoppingListFeatureActivity.userManager = kVar;
    }
}
