package com.scandit.datacapture.core.internal.module.ui.hint;

import android.os.Handler;
import android.view.ViewGroup;
import android.widget.TextView;
import com.scandit.datacapture.core.ui.animation.SpringAnimation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class j implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f126218a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f126219b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f126220c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f126221d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f126222e;

    /* renamed from: f, reason: collision with root package name */
    public final Lazy f126223f;

    /* renamed from: g, reason: collision with root package name */
    public final Lazy f126224g;

    public static final void a(j this$0) {
        Intrinsics.j(this$0, "this$0");
        ((SpringAnimation) this$0.f126222e.getValue()).animateToFinalPosition(1.0f);
    }

    public j(ViewGroup container) {
        Intrinsics.j(container, "container");
        this.f126218a = LazyKt.b(new f(container));
        this.f126219b = LazyKt.b(new g(this));
        this.f126220c = LazyKt.b(new C13512c(this));
        this.f126221d = true;
        this.f126222e = LazyKt.b(new C13511b(this));
        this.f126223f = LazyKt.b(new i(this));
        this.f126224g = LazyKt.b(C13513d.f126211a);
    }

    public final void a() {
        ((Handler) this.f126224g.getValue()).postDelayed(new Runnable() { // from class: fu.e
            @Override // java.lang.Runnable
            public final void run() {
                com.scandit.datacapture.core.internal.module.ui.hint.j.a(this.f133650a);
            }
        }, 200L);
        SpringAnimation springAnimation = (SpringAnimation) this.f126223f.getValue();
        ViewGroup.LayoutParams layoutParams = ((TextView) this.f126218a.getValue()).getLayoutParams();
        springAnimation.animateToFinalPosition((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r1.topMargin : 0);
        if (this.f126221d) {
            return;
        }
        ((SpringAnimation) this.f126222e.getValue()).skipToEnd();
        ((SpringAnimation) this.f126223f.getValue()).skipToEnd();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.scandit.datacapture.core.internal.module.ui.NativeHintStyle r14) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.module.ui.hint.j.a(com.scandit.datacapture.core.internal.module.ui.NativeHintStyle):void");
    }
}
