package com.scandit.datacapture.barcode.internal.module.find.ui;

import android.graphics.PointF;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHintStyle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public interface BarcodeFindViewLayout {
    void a();

    void a(int i10, int i11);

    void a(RelativeLayout relativeLayout, com.scandit.datacapture.barcode.internal.module.find.ui.overlay.a aVar);

    void a(BarcodeFindItem barcodeFindItem);

    void a(BarcodeFindViewPresenter barcodeFindViewPresenter);

    void a(w0 w0Var);

    void a(Anchor anchor);

    void a(String str);

    void a(String str, NativeToastHintStyle nativeToastHintStyle, String str2);

    void a(ArrayList arrayList);

    void a(LinkedHashMap linkedHashMap, Map map);

    void a(List list, float f10);

    void a(Map map);

    void a(boolean z10);

    void b(BarcodeFindItem barcodeFindItem);

    void b(String str);

    void b(boolean z10);

    boolean b();

    void c(String str);

    void c(boolean z10);

    boolean c();

    void d();

    void d(String str);

    void d(boolean z10);

    void e(boolean z10);

    boolean e();

    void f();

    void f(boolean z10);

    void g();

    void g(boolean z10);

    boolean getShouldShowHints();

    void h(boolean z10);

    boolean h();

    Anchor i();

    boolean j();

    void k();

    void l();

    void m();

    PointF mapFramePointToView(Point point);

    void n();

    void o();

    boolean p();

    String q();

    void setShouldShowHints(boolean z10);
}
