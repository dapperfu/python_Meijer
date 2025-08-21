package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/e0;", "", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "a", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
interface InterfaceC5990e0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f52300a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/e0$a;", "", "<init>", "()V", "Landroidx/compose/ui/platform/e0;", "a", "()Landroidx/compose/ui/platform/e0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.e0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f52300a = new Companion();

        public final InterfaceC5990e0 a() {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 30 ? C6002i0.f52325b : i10 >= 29 ? C5999h0.f52321b : i10 >= 28 ? C5996g0.f52308b : C5993f0.f52302b;
        }

        private Companion() {
        }
    }

    Rect a(Activity activity);
}
