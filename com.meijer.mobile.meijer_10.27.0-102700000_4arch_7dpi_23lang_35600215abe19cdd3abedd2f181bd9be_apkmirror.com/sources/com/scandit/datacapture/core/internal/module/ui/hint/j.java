package com.scandit.datacapture.core.internal.module.ui.hint;

import android.os.Handler;
import android.view.ViewGroup;
import android.widget.TextView;
import com.scandit.datacapture.core.ui.animation.SpringAnimation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f125266a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f125267b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f125268c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f125269d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f125270e;

    /* renamed from: f, reason: collision with root package name */
    public final Lazy f125271f;

    /* renamed from: g, reason: collision with root package name */
    public final Lazy f125272g;

    public static final void a(j this$0) {
        Intrinsics.j(this$0, "this$0");
        ((SpringAnimation) this$0.f125270e.getValue()).animateToFinalPosition(1.0f);
    }

    public j(ViewGroup container) {
        Intrinsics.j(container, "container");
        this.f125266a = LazyKt.b(new f(container));
        this.f125267b = LazyKt.b(new g(this));
        this.f125268c = LazyKt.b(new C13379c(this));
        this.f125269d = true;
        this.f125270e = LazyKt.b(new C13378b(this));
        this.f125271f = LazyKt.b(new i(this));
        this.f125272g = LazyKt.b(C13380d.f125259a);
    }

    public final void a() {
        ((Handler) this.f125272g.getValue()).postDelayed(new Runnable() { // from class: fu.e
            @Override // java.lang.Runnable
            public final void run() {
                com.scandit.datacapture.core.internal.module.ui.hint.j.a(this.f132400a);
            }
        }, 200L);
        SpringAnimation springAnimation = (SpringAnimation) this.f125271f.getValue();
        ViewGroup.LayoutParams layoutParams = ((TextView) this.f125266a.getValue()).getLayoutParams();
        springAnimation.animateToFinalPosition((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r1.topMargin : 0);
        if (this.f125269d) {
            return;
        }
        ((SpringAnimation) this.f125270e.getValue()).skipToEnd();
        ((SpringAnimation) this.f125271f.getValue()).skipToEnd();
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
