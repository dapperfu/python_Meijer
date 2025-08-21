package com.scandit.datacapture.core.internal.module.ui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.scandit.datacapture.core.common.geometry.Point;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class p implements GestureRecognizer {

    /* renamed from: a, reason: collision with root package name */
    public final o f126258a;

    /* renamed from: b, reason: collision with root package name */
    public final GestureDetector f126259b;

    /* renamed from: c, reason: collision with root package name */
    public GestureListener f126260c;

    /* renamed from: d, reason: collision with root package name */
    public EnumSet f126261d;

    /* renamed from: e, reason: collision with root package name */
    public final float f126262e;

    public static final Point a(p pVar, MotionEvent motionEvent) {
        pVar.getClass();
        return new Point(motionEvent.getX() * pVar.f126262e, motionEvent.getY() * pVar.f126262e);
    }

    public p(Context context, float f10) {
        Intrinsics.j(context, "context");
        o oVar = new o(this);
        this.f126258a = oVar;
        this.f126259b = new GestureDetector(context, oVar, new Handler(Looper.getMainLooper()));
        EnumSet enumSetNoneOf = EnumSet.noneOf(NativeGestureType.class);
        Intrinsics.i(enumSetNoneOf, "noneOf(...)");
        this.f126261d = enumSetNoneOf;
        this.f126262e = 1.0f / f10;
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.GestureRecognizer
    public final void a(GestureListener listener, EnumSet gestures) {
        Intrinsics.j(listener, "listener");
        Intrinsics.j(gestures, "gestures");
        this.f126260c = listener;
        this.f126261d = gestures;
        if (gestures.contains(NativeGestureType.DOUBLE_TAP)) {
            this.f126259b.setOnDoubleTapListener(this.f126258a);
        } else {
            this.f126259b.setOnDoubleTapListener(null);
        }
    }
}
