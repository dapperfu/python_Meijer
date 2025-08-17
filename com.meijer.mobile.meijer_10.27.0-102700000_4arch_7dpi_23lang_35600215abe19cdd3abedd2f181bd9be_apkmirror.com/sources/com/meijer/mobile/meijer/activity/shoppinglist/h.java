package com.meijer.mobile.meijer.activity.shoppinglist;

import pu.InterfaceC16421a;
import qv.AbstractC16618K;

/* loaded from: classes9.dex */
public final class h implements InterfaceC16421a<ShoppingListFavoritesActivity> {
    public static void a(ShoppingListFavoritesActivity shoppingListFavoritesActivity, Eq.a aVar) {
        shoppingListFavoritesActivity.favoritesListRepository = aVar;
    }

    public static void b(ShoppingListFavoritesActivity shoppingListFavoritesActivity, AbstractC16618K abstractC16618K) {
        shoppingListFavoritesActivity.ioDispatcher = abstractC16618K;
    }

    public static void c(ShoppingListFavoritesActivity shoppingListFavoritesActivity, Ro.c cVar) {
        shoppingListFavoritesActivity.productsRepository = cVar;
    }

    public static void d(ShoppingListFavoritesActivity shoppingListFavoritesActivity, Eq.b bVar) {
        shoppingListFavoritesActivity.shoppingListRepository = bVar;
    }
}
