package d8;

import c8.EnumC6375b;
import c8.TouchEvent;
import c8.TouchUserInteraction;
import c8.UiElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x8.f;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ld8/a;", "", "<init>", "()V", "Lc8/e;", "", "c", "(Lc8/e;)Ljava/lang/String;", "Lc8/k;", "d", "(Lc8/k;)Ljava/lang/String;", "Lc8/c;", "touchEvent", "", "a", "(Lc8/c;)V", "touchUserInteraction", "b", "(Lc8/e;)V", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: d8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13494a {
    private final String c(TouchUserInteraction touchUserInteraction) {
        String strD;
        String strD2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Ancestor view ");
        UiElement ancestor = touchUserInteraction.getAncestor();
        String str = "NULL";
        if (ancestor == null || (strD = d(ancestor)) == null) {
            strD = "NULL";
        }
        sb2.append(strD);
        sb2.append("\n\tElement view ");
        UiElement element = touchUserInteraction.getElement();
        if (element != null && (strD2 = d(element)) != null) {
            str = strD2;
        }
        sb2.append(str);
        return sb2.toString();
    }

    private final String d(UiElement uiElement) {
        return "class: " + uiElement.getComponent() + " name: " + uiElement.getName() + " id: " + uiElement.getId();
    }

    public final void a(TouchEvent touchEvent) {
        Intrinsics.j(touchEvent, "touchEvent");
        if (touchEvent.getAction() != EnumC6375b.f61643c) {
            f.a("dtxUserAction", "Received Touch event " + touchEvent.getAction().name() + " with coordinates [" + ((int) touchEvent.getX()) + ':' + ((int) touchEvent.getY()) + ']');
        }
    }

    public final void b(TouchUserInteraction touchUserInteraction) {
        Intrinsics.j(touchUserInteraction, "touchUserInteraction");
        f.a("dtxUserAction", c(touchUserInteraction));
    }
}
