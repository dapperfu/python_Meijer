package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;

/* loaded from: classes4.dex */
public class j extends androidx.appcompat.view.menu.f {
    public j(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) a(i10, i11, i12, charSequence);
        l lVar = new l(w(), this, hVar);
        hVar.x(lVar);
        return lVar;
    }
}
