package com.meijer.mobile.shoppinglist.di;

import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import zl.k;

/* loaded from: classes12.dex */
public final class d implements InterfaceC15612a<ShoppingListFeatureActivity> {
    public static void a(ShoppingListFeatureActivity shoppingListFeatureActivity, InterfaceC14523a interfaceC14523a) {
        shoppingListFeatureActivity.analyticsEngine = interfaceC14523a;
    }

    public static void b(ShoppingListFeatureActivity shoppingListFeatureActivity, Bl.g gVar) {
        shoppingListFeatureActivity.featureEntryPoint = gVar;
    }

    public static void c(ShoppingListFeatureActivity shoppingListFeatureActivity, k kVar) {
        shoppingListFeatureActivity.featureManager = kVar;
    }

    public static void d(ShoppingListFeatureActivity shoppingListFeatureActivity, yo.k kVar) {
        shoppingListFeatureActivity.userManager = kVar;
    }
}
