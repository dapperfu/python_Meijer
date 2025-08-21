package c8;

import android.view.MotionEvent;
import android.view.View;
import d8.C13637b;
import d8.InterfaceC13638c;
import d8.InterfaceC13639d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lc8/b;", "Lc8/a;", "Ld8/d;", "userInteractionHandlerFactory", "<init>", "(Ld8/d;)V", "Landroid/view/View;", "rootView", "Landroid/view/MotionEvent;", "event", "", "a", "(Landroid/view/View;Landroid/view/MotionEvent;)V", "Ld8/b;", "Ld8/b;", "touchUserInteractionHandler", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: c8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6492b implements InterfaceC6491a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C13637b touchUserInteractionHandler;

    public C6492b(InterfaceC13639d userInteractionHandlerFactory) {
        Intrinsics.j(userInteractionHandlerFactory, "userInteractionHandlerFactory");
        InterfaceC13638c interfaceC13638cA = userInteractionHandlerFactory.a(InterfaceC13638c.a.f128297a);
        Intrinsics.h(interfaceC13638cA, "null cannot be cast to non-null type com.dynatrace.agent.userinteraction.handler.TouchUserInteractionHandler");
        this.touchUserInteractionHandler = (C13637b) interfaceC13638cA;
    }

    @Override // c8.InterfaceC6491a
    public void a(View rootView, MotionEvent event) {
        Intrinsics.j(rootView, "rootView");
        Intrinsics.j(event, "event");
        this.touchUserInteractionHandler.c(rootView, event);
    }
}
