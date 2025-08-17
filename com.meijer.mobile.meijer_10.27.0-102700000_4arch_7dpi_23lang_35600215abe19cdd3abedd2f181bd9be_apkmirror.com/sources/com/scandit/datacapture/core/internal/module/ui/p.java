package com.scandit.datacapture.core.internal.module.ui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.scandit.datacapture.core.common.geometry.Point;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class p implements GestureRecognizer {

    /* renamed from: a, reason: collision with root package name */
    public final o f125306a;

    /* renamed from: b, reason: collision with root package name */
    public final GestureDetector f125307b;

    /* renamed from: c, reason: collision with root package name */
    public GestureListener f125308c;

    /* renamed from: d, reason: collision with root package name */
    public EnumSet f125309d;

    /* renamed from: e, reason: collision with root package name */
    public final float f125310e;

    public static final Point a(p pVar, MotionEvent motionEvent) {
        pVar.getClass();
        return new Point(motionEvent.getX() * pVar.f125310e, motionEvent.getY() * pVar.f125310e);
    }

    public p(Context context, float f10) {
        Intrinsics.j(context, "context");
        o oVar = new o(this);
        this.f125306a = oVar;
        this.f125307b = new GestureDetector(context, oVar, new Handler(Looper.getMainLooper()));
        EnumSet enumSetNoneOf = EnumSet.noneOf(NativeGestureType.class);
        Intrinsics.i(enumSetNoneOf, "noneOf(...)");
        this.f125309d = enumSetNoneOf;
        this.f125310e = 1.0f / f10;
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.GestureRecognizer
    public final void a(GestureListener listener, EnumSet gestures) {
        Intrinsics.j(listener, "listener");
        Intrinsics.j(gestures, "gestures");
        this.f125308c = listener;
        this.f125309d = gestures;
        if (gestures.contains(NativeGestureType.DOUBLE_TAP)) {
            this.f125307b.setOnDoubleTapListener(this.f125306a);
        } else {
            this.f125307b.setOnDoubleTapListener(null);
        }
    }
}
