package v2;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import p2.C16349c0;
import p2.C16351d0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0003*\u00020\t¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r\"(\u0010\u0016\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0018\u001a\u00020\u0010*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/View;", "Lv2/b;", "listener", "", "a", "(Landroid/view/View;Lv2/b;)V", "g", "b", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "c", "(Landroid/view/ViewGroup;)V", "", "I", "PoolingContainerListenerHolderTag", "IsPoolingContainerTag", "", "value", "e", "(Landroid/view/View;)Z", "h", "(Landroid/view/View;Z)V", "isPoolingContainer", "f", "isWithinPoolingContainer", "Lv2/c;", "d", "(Landroid/view/View;)Lv2/c;", "poolingContainerListenerHolder", "customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
@JvmName
/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17624a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f165450a = C17627d.f165454b;

    /* renamed from: b, reason: collision with root package name */
    private static final int f165451b = C17627d.f165453a;

    @SuppressLint({"ExecutorRegistration"})
    public static final void a(View view, InterfaceC17625b listener) {
        Intrinsics.j(view, "<this>");
        Intrinsics.j(listener, "listener");
        d(view).a(listener);
    }

    public static final void b(View view) {
        Intrinsics.j(view, "<this>");
        Iterator<View> it = C16351d0.a(view).iterator();
        while (it.hasNext()) {
            d(it.next()).b();
        }
    }

    public static final void c(ViewGroup viewGroup) {
        Intrinsics.j(viewGroup, "<this>");
        Iterator<View> it = C16349c0.b(viewGroup).iterator();
        while (it.hasNext()) {
            d(it.next()).b();
        }
    }

    private static final C17626c d(View view) {
        int i10 = f165450a;
        C17626c c17626c = (C17626c) view.getTag(i10);
        if (c17626c != null) {
            return c17626c;
        }
        C17626c c17626c2 = new C17626c();
        view.setTag(i10, c17626c2);
        return c17626c2;
    }

    public static final boolean e(View view) {
        Intrinsics.j(view, "<this>");
        Object tag = view.getTag(f165451b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(View view) {
        Intrinsics.j(view, "<this>");
        for (Object obj : C16351d0.b(view)) {
            if ((obj instanceof View) && e((View) obj)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void g(View view, InterfaceC17625b listener) {
        Intrinsics.j(view, "<this>");
        Intrinsics.j(listener, "listener");
        d(view).c(listener);
    }

    public static final void h(View view, boolean z10) {
        Intrinsics.j(view, "<this>");
        view.setTag(f165451b, Boolean.valueOf(z10));
    }
}
