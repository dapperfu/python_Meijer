package com.scandit.datacapture.core.internal.module.ui.hint;

import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import com.scandit.datacapture.core.internal.module.ui.NativeHintPresenter;
import com.scandit.datacapture.core.internal.module.ui.NativeHintStyle;
import com.scandit.datacapture.core.internal.module.ui.hint.z;
import com.scandit.datacapture.core.ui.animation.SpringAnimation;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class z extends NativeHintPresenter {

    /* renamed from: a, reason: collision with root package name */
    public final s f126241a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f126242b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f126243c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f126244d;

    /* renamed from: e, reason: collision with root package name */
    public x f126245e;

    public final synchronized void a() {
        try {
            s sVar = this.f126241a;
            x state = this.f126245e;
            CopyOnWriteArrayList operations = this.f126244d;
            ((k) sVar).getClass();
            Intrinsics.j(state, "state");
            Intrinsics.j(operations, "operations");
            if (state == x.f126237a && !operations.isEmpty()) {
                w wVar = (w) this.f126244d.remove(0);
                this.f126245e = x.f126238b;
                if (wVar instanceof u) {
                    a((u) wVar);
                } else if (wVar instanceof t) {
                    c();
                } else if (wVar instanceof v) {
                    a((v) wVar);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            s sVar = this.f126241a;
            x state = this.f126245e;
            CopyOnWriteArrayList operations = this.f126244d;
            ((k) sVar).getClass();
            Intrinsics.j(state, "state");
            Intrinsics.j(operations, "operations");
            if (state != x.f126238b || operations.isEmpty()) {
                this.f126245e = x.f126237a;
            } else {
                w wVar = (w) this.f126244d.remove(0);
                if (wVar instanceof u) {
                    a((u) wVar);
                } else if (wVar instanceof t) {
                    c();
                } else if (wVar instanceof v) {
                    a((v) wVar);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public z(j hintHolder, k operationsHandler) {
        Handler handler = new Handler(Looper.getMainLooper());
        Intrinsics.j(hintHolder, "hintHolder");
        Intrinsics.j(operationsHandler, "operationsHandler");
        Intrinsics.j(handler, "handler");
        this.f126241a = operationsHandler;
        this.f126242b = handler;
        this.f126243c = new WeakReference(hintHolder);
        this.f126244d = new CopyOnWriteArrayList();
        this.f126245e = x.f126237a;
    }

    public final void c() {
        this.f126242b.post(new Runnable() { // from class: fu.j
            @Override // java.lang.Runnable
            public final void run() {
                z.a(this.f133658a);
            }
        });
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenter
    public final void hideHint() {
        this.f126244d.add(t.f126233a);
        a();
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenter
    public final void showHint(String hint, NativeHintStyle style) {
        Intrinsics.j(hint, "hint");
        Intrinsics.j(style, "style");
        this.f126244d.add(new u(hint, style));
        a();
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativeHintPresenter
    public final void updateHint(NativeHintStyle style) {
        Intrinsics.j(style, "style");
        this.f126244d.add(new v(style));
        a();
    }

    public final void a(final u uVar) {
        this.f126242b.post(new Runnable() { // from class: fu.i
            @Override // java.lang.Runnable
            public final void run() {
                z.a(this.f133656a, uVar);
            }
        });
    }

    public static final void a(final z this$0, final u operation) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(operation, "$operation");
        final q qVar = (q) this$0.f126243c.get();
        if (qVar != null) {
            ((TextView) ((j) qVar).f126218a.getValue()).post(new Runnable() { // from class: fu.k
                @Override // java.lang.Runnable
                public final void run() {
                    z.a(qVar, operation, this$0);
                }
            });
        }
    }

    public static final void a(final z this$0) {
        Intrinsics.j(this$0, "this$0");
        final q qVar = (q) this$0.f126243c.get();
        if (qVar != null) {
            ((TextView) ((j) qVar).f126218a.getValue()).post(new Runnable() { // from class: fu.h
                @Override // java.lang.Runnable
                public final void run() {
                    z.a(qVar, this$0);
                }
            });
        }
    }

    public static final void a(q holder, z this$0) {
        Intrinsics.j(holder, "$holder");
        Intrinsics.j(this$0, "this$0");
        y then = new y(this$0);
        j jVar = (j) holder;
        jVar.getClass();
        Intrinsics.j(then, "then");
        ((Handler) jVar.f126224g.getValue()).removeCallbacksAndMessages(null);
        ((SpringAnimation) jVar.f126222e.getValue()).animateToFinalPosition(0.0f);
        SpringAnimation springAnimation = (SpringAnimation) jVar.f126223f.getValue();
        springAnimation.animateToFinalPosition(((Number) jVar.f126219b.getValue()).floatValue());
        springAnimation.addEndListener(new h(springAnimation, new C13514e(then)));
        if (jVar.f126221d) {
            return;
        }
        ((SpringAnimation) jVar.f126222e.getValue()).skipToEnd();
        ((SpringAnimation) jVar.f126223f.getValue()).skipToEnd();
    }

    public final void a(final v vVar) {
        this.f126242b.post(new Runnable() { // from class: fu.g
            @Override // java.lang.Runnable
            public final void run() {
                z.a(this.f133652a, vVar);
            }
        });
    }

    public static final void a(final z this$0, final v operation) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(operation, "$operation");
        final q qVar = (q) this$0.f126243c.get();
        if (qVar != null) {
            ((TextView) ((j) qVar).f126218a.getValue()).post(new Runnable() { // from class: fu.l
                @Override // java.lang.Runnable
                public final void run() {
                    z.a(qVar, operation, this$0);
                }
            });
        }
    }

    public static final void a(q holder, u operation, z this$0) {
        Intrinsics.j(holder, "$holder");
        Intrinsics.j(operation, "$operation");
        Intrinsics.j(this$0, "this$0");
        String text = operation.f126234a;
        NativeHintStyle style = operation.f126235b;
        j jVar = (j) holder;
        jVar.getClass();
        Intrinsics.j(text, "text");
        Intrinsics.j(style, "style");
        ((TextView) jVar.f126218a.getValue()).setText(text);
        jVar.a(style);
        jVar.a();
        this$0.b();
    }

    public static final void a(q holder, v operation, z this$0) {
        Intrinsics.j(holder, "$holder");
        Intrinsics.j(operation, "$operation");
        Intrinsics.j(this$0, "this$0");
        ((j) holder).a(operation.f126236a);
        this$0.b();
    }
}
