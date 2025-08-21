package androidx.view;

import android.window.BackEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/activity/a;", "", "<init>", "()V", "Landroid/window/BackEvent;", "backEvent", "", "a", "(Landroid/window/BackEvent;)F", "c", "d", "", "b", "(Landroid/window/BackEvent;)I", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.activity.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5755a {

    /* renamed from: a, reason: collision with root package name */
    public static final C5755a f45926a = new C5755a();

    public final float a(BackEvent backEvent) {
        Intrinsics.j(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int b(BackEvent backEvent) {
        Intrinsics.j(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float c(BackEvent backEvent) {
        Intrinsics.j(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float d(BackEvent backEvent) {
        Intrinsics.j(backEvent, "backEvent");
        return backEvent.getTouchY();
    }

    private C5755a() {
    }
}
