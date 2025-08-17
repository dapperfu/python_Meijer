package a8;

import android.view.MotionEvent;
import android.view.View;
import b8.C6206b;
import b8.InterfaceC6207c;
import b8.InterfaceC6208d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"La8/b;", "La8/a;", "Lb8/d;", "userInteractionHandlerFactory", "<init>", "(Lb8/d;)V", "Landroid/view/View;", "rootView", "Landroid/view/MotionEvent;", "event", "", "a", "(Landroid/view/View;Landroid/view/MotionEvent;)V", "Lb8/b;", "Lb8/b;", "touchUserInteractionHandler", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: a8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5586b implements InterfaceC5585a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6206b touchUserInteractionHandler;

    public C5586b(InterfaceC6208d userInteractionHandlerFactory) {
        Intrinsics.j(userInteractionHandlerFactory, "userInteractionHandlerFactory");
        InterfaceC6207c interfaceC6207cA = userInteractionHandlerFactory.a(InterfaceC6207c.a.f60062a);
        Intrinsics.h(interfaceC6207cA, "null cannot be cast to non-null type com.dynatrace.agent.userinteraction.handler.TouchUserInteractionHandler");
        this.touchUserInteractionHandler = (C6206b) interfaceC6207cA;
    }

    @Override // a8.InterfaceC5585a
    public void a(View rootView, MotionEvent event) {
        Intrinsics.j(rootView, "rootView");
        Intrinsics.j(event, "event");
        this.touchUserInteractionHandler.c(rootView, event);
    }
}
