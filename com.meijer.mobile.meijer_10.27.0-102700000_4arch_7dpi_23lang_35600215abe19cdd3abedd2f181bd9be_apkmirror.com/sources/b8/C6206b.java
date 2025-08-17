package b8;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import c8.TouchEvent;
import c8.TouchUserInteraction;
import c8.i;
import d8.C13494a;
import d8.C13495b;
import d8.C13496c;
import e8.C13633a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qv.C0;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001%B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lb8/b;", "Le8/a;", "Lb8/c;", "Lqv/O;", "coroutineScope", "Ld8/a;", "userInteractionLogger", "Ld8/b;", "userInteractionTracker", "Lc8/g;", "touchUserInteractionGenerator", "<init>", "(Lqv/O;Ld8/a;Ld8/b;Lc8/g;)V", "Landroid/view/ViewGroup;", "rootView", "Landroid/view/View;", "interactView", "", "e", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "Landroid/view/MotionEvent;", "event", "c", "(Landroid/view/View;Landroid/view/MotionEvent;)V", "b", "Ld8/a;", "Ld8/b;", "d", "Lc8/g;", "Lc8/c;", "Lc8/c;", "upTouchEvent", "Lqv/C0;", "f", "Lqv/C0;", "touchEventJob", "g", "a", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: b8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6206b extends C13633a implements InterfaceC6207c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C13494a userInteractionLogger;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C13495b userInteractionTracker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c8.g touchUserInteractionGenerator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private TouchEvent upTouchEvent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C0 touchEventJob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6206b(InterfaceC16622O coroutineScope, C13494a userInteractionLogger, C13495b userInteractionTracker, c8.g touchUserInteractionGenerator) {
        super(coroutineScope);
        Intrinsics.j(coroutineScope, "coroutineScope");
        Intrinsics.j(userInteractionLogger, "userInteractionLogger");
        Intrinsics.j(userInteractionTracker, "userInteractionTracker");
        Intrinsics.j(touchUserInteractionGenerator, "touchUserInteractionGenerator");
        this.userInteractionLogger = userInteractionLogger;
        this.userInteractionTracker = userInteractionTracker;
        this.touchUserInteractionGenerator = touchUserInteractionGenerator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(C6206b c6206b, View view) {
        c6206b.e((ViewGroup) view, null);
        return Unit.f142422a;
    }

    private final void e(ViewGroup rootView, View interactView) {
        C0 c02 = this.touchEventJob;
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
        if (rootView != null) {
            TouchEvent touchEvent = this.upTouchEvent;
            if (touchEvent == null) {
                return;
            }
            TouchUserInteraction touchUserInteractionB = this.touchUserInteractionGenerator.b(CollectionsKt.e(touchEvent), null);
            if (touchUserInteractionB == null) {
                touchUserInteractionB = this.touchUserInteractionGenerator.a(CollectionsKt.e(touchEvent), rootView, interactView);
            }
            if (touchUserInteractionB != null) {
                this.userInteractionLogger.b(touchUserInteractionB);
                this.userInteractionTracker.a(i.a(touchUserInteractionB));
            }
        }
        this.upTouchEvent = null;
    }

    public final void c(final View rootView, MotionEvent event) {
        Intrinsics.j(rootView, "rootView");
        Intrinsics.j(event, "event");
        if (rootView instanceof ViewGroup) {
            C0 c02 = this.touchEventJob;
            if (c02 != null && c02.a()) {
                e((ViewGroup) rootView, null);
            }
            TouchEvent touchEvent = new TouchEvent(C13496c.b(event), event.getX(0), event.getY(0));
            this.userInteractionLogger.a(touchEvent);
            if (event.getAction() == 1) {
                this.upTouchEvent = touchEvent;
                this.touchEventJob = a(500L, new Function0() { // from class: b8.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C6206b.d(this.f60054a, rootView);
                    }
                });
            }
        }
    }
}
