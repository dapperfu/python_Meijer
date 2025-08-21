package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* loaded from: classes4.dex */
interface a {
    void f(View view, int i10, int i11, c cVar);

    int g(int i10, int i11, int i12);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<c> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    View i(int i10);

    int k(int i10, int i11, int i12);

    int l(View view);

    void m(c cVar);

    View n(int i10);

    void o(int i10, View view);

    int p(View view, int i10, int i11);

    boolean q();

    void setFlexLines(List<c> list);
}
