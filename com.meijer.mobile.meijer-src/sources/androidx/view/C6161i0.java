package androidx.view;

import U2.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import t2.C17176b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/s;", "lifecycleOwner", "", "b", "(Landroid/view/View;Landroidx/lifecycle/s;)V", "a", "(Landroid/view/View;)Landroidx/lifecycle/s;", "lifecycle-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* renamed from: androidx.lifecycle.i0, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6161i0 {
    @JvmName
    public static final InterfaceC6172s a(View view) {
        Intrinsics.j(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(a.f37036a);
            InterfaceC6172s interfaceC6172s = tag instanceof InterfaceC6172s ? (InterfaceC6172s) tag : null;
            if (interfaceC6172s != null) {
                return interfaceC6172s;
            }
            Object objA = C17176b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    @JvmName
    public static final void b(View view, InterfaceC6172s interfaceC6172s) {
        Intrinsics.j(view, "<this>");
        view.setTag(a.f37036a, interfaceC6172s);
    }
}
