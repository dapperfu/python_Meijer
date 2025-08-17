package t7;

import a8.InterfaceC5585a;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import w8.InterfaceC17802a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lt7/d;", "Lw8/a;", "La8/a;", "oneAgentUserInteractionManager", "<init>", "(La8/a;)V", "Landroid/view/View;", "rootView", "Landroid/view/MotionEvent;", "event", "", "a", "(Landroid/view/View;Landroid/view/MotionEvent;)V", "La8/a;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: t7.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17072d implements InterfaceC17802a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5585a oneAgentUserInteractionManager;

    public C17072d(InterfaceC5585a oneAgentUserInteractionManager) {
        Intrinsics.j(oneAgentUserInteractionManager, "oneAgentUserInteractionManager");
        this.oneAgentUserInteractionManager = oneAgentUserInteractionManager;
    }

    @Override // w8.InterfaceC17802a
    public void a(View rootView, MotionEvent event) {
        Intrinsics.j(rootView, "rootView");
        Intrinsics.j(event, "event");
        this.oneAgentUserInteractionManager.a(rootView, event);
    }
}
