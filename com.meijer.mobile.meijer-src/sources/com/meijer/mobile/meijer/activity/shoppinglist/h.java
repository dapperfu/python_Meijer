package com.meijer.mobile.meijer.activity.shoppinglist;

import lu.InterfaceC15612a;
import mv.AbstractC15779K;

/* loaded from: classes10.dex */
public final class h implements InterfaceC15612a<ShoppingListFavoritesActivity> {
    public static void a(ShoppingListFavoritesActivity shoppingListFavoritesActivity, Eq.a aVar) {
        shoppingListFavoritesActivity.favoritesListRepository = aVar;
    }

    public static void b(ShoppingListFavoritesActivity shoppingListFavoritesActivity, AbstractC15779K abstractC15779K) {
        shoppingListFavoritesActivity.ioDispatcher = abstractC15779K;
    }

    public static void c(ShoppingListFavoritesActivity shoppingListFavoritesActivity, Ro.c cVar) {
        shoppingListFavoritesActivity.productsRepository = cVar;
    }

    public static void d(ShoppingListFavoritesActivity shoppingListFavoritesActivity, Eq.b bVar) {
        shoppingListFavoritesActivity.shoppingListRepository = bVar;
    }
}
