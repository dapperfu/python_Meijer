package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewUiListener;
import com.scandit.datacapture.barcode.internal.module.find.ui.listener.SearchedItemsUpdateListener;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* loaded from: classes11.dex */
public interface BarcodeFindViewPresenter extends SearchedItemsUpdateListener {
    void a();

    void a(float f10);

    void a(BarcodeFindItem barcodeFindItem);

    void a(BarcodeFindViewUiListener barcodeFindViewUiListener);

    void a(Collection collection);

    void a(Collection collection, Collection collection2, Function1 function1);

    void a(boolean z10);

    void b();

    void c();

    void d();

    boolean e();

    void f();

    void g();

    void h();

    void i();

    void onSearchStarted();
}
