package com.scandit.datacapture.barcode.internal.module.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class e extends TouchDelegate {

    /* renamed from: e, reason: collision with root package name */
    public static final int f124263e = PixelExtensionsKt.pxFromDp$default(48, (Context) null, 1, (Object) null);

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f124264a;

    /* renamed from: b, reason: collision with root package name */
    public final int f124265b;

    /* renamed from: c, reason: collision with root package name */
    public View f124266c;

    /* renamed from: d, reason: collision with root package name */
    public Rect f124267d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ViewGroup view) {
        super(new Rect(), view);
        Intrinsics.j(view, "view");
        this.f124264a = view;
        this.f124265b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f124267d = new Rect();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.barcode.internal.module.ui.e.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
