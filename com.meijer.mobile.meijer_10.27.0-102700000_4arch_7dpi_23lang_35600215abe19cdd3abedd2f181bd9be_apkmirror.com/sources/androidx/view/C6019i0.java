package androidx.view;

import U2.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import t2.C17057b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/s;", "lifecycleOwner", "", "b", "(Landroid/view/View;Landroidx/lifecycle/s;)V", "a", "(Landroid/view/View;)Landroidx/lifecycle/s;", "lifecycle-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* renamed from: androidx.lifecycle.i0, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6019i0 {
    @JvmName
    public static final InterfaceC6030s a(View view) {
        Intrinsics.j(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(a.f35700a);
            InterfaceC6030s interfaceC6030s = tag instanceof InterfaceC6030s ? (InterfaceC6030s) tag : null;
            if (interfaceC6030s != null) {
                return interfaceC6030s;
            }
            Object objA = C17057b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    @JvmName
    public static final void b(View view, InterfaceC6030s interfaceC6030s) {
        Intrinsics.j(view, "<this>");
        view.setTag(a.f35700a, interfaceC6030s);
    }
}
