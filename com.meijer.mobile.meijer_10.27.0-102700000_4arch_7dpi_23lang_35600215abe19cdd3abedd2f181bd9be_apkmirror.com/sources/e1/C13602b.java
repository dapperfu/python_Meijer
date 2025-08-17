package e1;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0015"}, d2 = {"Le1/b;", "", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "nativeKeyEvent", "b", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "", "e", "(Landroid/view/KeyEvent;)Ljava/lang/String;", "", "d", "(Landroid/view/KeyEvent;)I", "other", "", "c", "(Landroid/view/KeyEvent;Ljava/lang/Object;)Z", "a", "Landroid/view/KeyEvent;", "getNativeKeyEvent", "()Landroid/view/KeyEvent;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* renamed from: e1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13602b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KeyEvent nativeKeyEvent;

    public static KeyEvent b(KeyEvent keyEvent) {
        return keyEvent;
    }

    public static final /* synthetic */ C13602b a(KeyEvent keyEvent) {
        return new C13602b(keyEvent);
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof C13602b) && Intrinsics.e(keyEvent, ((C13602b) obj).getNativeKeyEvent());
    }

    public static String e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return c(this.nativeKeyEvent, obj);
    }

    /* renamed from: f, reason: from getter */
    public final /* synthetic */ KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    public int hashCode() {
        return d(this.nativeKeyEvent);
    }

    public String toString() {
        return e(this.nativeKeyEvent);
    }

    private /* synthetic */ C13602b(KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    public static int d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }
}
