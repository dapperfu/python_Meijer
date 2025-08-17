package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import be.C6230a;
import com.google.android.material.internal.x;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes4.dex */
class c {
    static RectF a(TabLayout tabLayout, View view) {
        return view == null ? new RectF() : (tabLayout.D() || !(view instanceof TabLayout.TabView)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : b((TabLayout.TabView) view, 24);
    }

    c() {
    }

    static RectF b(TabLayout.TabView tabView, int i10) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int iD = (int) x.d(tabView.getContext(), i10);
        if (contentWidth < iD) {
            contentWidth = iD;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i11 = contentWidth / 2;
        return new RectF(left - i11, top - (contentHeight / 2), i11 + left, top + (left / 2));
    }

    void c(TabLayout tabLayout, View view, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
    }

    void d(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(C6230a.c((int) rectFA.left, (int) rectFA2.left, f10), drawable.getBounds().top, C6230a.c((int) rectFA.right, (int) rectFA2.right, f10), drawable.getBounds().bottom);
    }
}
