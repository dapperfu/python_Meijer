package com.scandit.datacapture.barcode.internal.module.ui;

import android.util.Size;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f123290a = new a();

    public static boolean a(View view) {
        Intrinsics.j(view, "view");
        return view.getHeight() > view.getWidth();
    }

    public static boolean a(Size size) {
        Intrinsics.j(size, "size");
        return size.getHeight() > size.getWidth();
    }
}
