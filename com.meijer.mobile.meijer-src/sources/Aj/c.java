package Aj;

import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import q2.y;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Landroid/view/View;", "", "isHeading", "", "a", "(Landroid/view/View;Z)V", "isScreenReaderFocusable", "c", "base-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
/* loaded from: classes8.dex */
public final class c {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Aj/c$a", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Lq2/y;", "info", "", "g", "(Landroid/view/View;Lq2/y;)V", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f1345d;

        a(boolean z10) {
            this.f1345d = z10;
        }

        @Override // androidx.core.view.a
        public void g(View host, y info) {
            Intrinsics.j(host, "host");
            Intrinsics.j(info, "info");
            super.g(host, info);
            info.B0(this.f1345d);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Aj/c$b", "Landroidx/core/view/a;", "Landroid/view/View;", "host", "Lq2/y;", "info", "", "g", "(Landroid/view/View;Lq2/y;)V", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f1346d;

        b(boolean z10) {
            this.f1346d = z10;
        }

        @Override // androidx.core.view.a
        public void g(View host, y info) {
            Intrinsics.j(host, "host");
            Intrinsics.j(info, "info");
            super.g(host, info);
            info.Q0(this.f1346d);
        }
    }

    public static /* synthetic */ void b(View view, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        a(view, z10);
    }

    public static final void a(View view, boolean z10) {
        Intrinsics.j(view, "<this>");
        if (Build.VERSION.SDK_INT >= 28) {
            view.setAccessibilityHeading(z10);
        } else {
            ViewCompat.m0(view, new a(z10));
        }
        view.setFocusable(z10);
    }

    public static final void c(View view, boolean z10) {
        Intrinsics.j(view, "<this>");
        if (Build.VERSION.SDK_INT >= 28) {
            view.setScreenReaderFocusable(z10);
        } else {
            ViewCompat.m0(view, new b(z10));
        }
        view.setFocusable(z10);
    }
}
