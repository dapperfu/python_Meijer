package androidx.view;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.view.L;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\r\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\" \u0010\u0011\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u0012\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\n\"\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/activity/L;", "statusBarStyle", "navigationBarStyle", "", "a", "(Landroidx/activity/ComponentActivity;Landroidx/activity/L;Landroidx/activity/L;)V", "", "I", "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultLightScrim", "b", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "DefaultDarkScrim", "Landroidx/activity/B;", "c", "Landroidx/activity/B;", "Impl", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final int f45729a = Color.argb(230, l3.f92484c, l3.f92484c, l3.f92484c);

    /* renamed from: b, reason: collision with root package name */
    private static final int f45730b = Color.argb(128, 27, 27, 27);

    /* renamed from: c, reason: collision with root package name */
    private static B f45731c;

    @JvmOverloads
    @JvmName
    public static final void a(ComponentActivity componentActivity, L statusBarStyle, L navigationBarStyle) {
        Intrinsics.j(componentActivity, "<this>");
        Intrinsics.j(statusBarStyle, "statusBarStyle");
        Intrinsics.j(navigationBarStyle, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        Intrinsics.i(decorView, "window.decorView");
        Function1<Resources, Boolean> function1B = statusBarStyle.b();
        Resources resources = decorView.getResources();
        Intrinsics.i(resources, "view.resources");
        boolean zBooleanValue = function1B.invoke(resources).booleanValue();
        Function1<Resources, Boolean> function1B2 = navigationBarStyle.b();
        Resources resources2 = decorView.getResources();
        Intrinsics.i(resources2, "view.resources");
        boolean zBooleanValue2 = function1B2.invoke(resources2).booleanValue();
        B zVar = f45731c;
        if (zVar == null) {
            int i10 = Build.VERSION.SDK_INT;
            zVar = i10 >= 30 ? new z() : i10 >= 29 ? new y() : i10 >= 28 ? new v() : i10 >= 26 ? new t() : new s();
        }
        B b10 = zVar;
        Window window = componentActivity.getWindow();
        Intrinsics.i(window, "window");
        b10.b(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = componentActivity.getWindow();
        Intrinsics.i(window2, "window");
        b10.a(window2);
    }

    public static /* synthetic */ void b(ComponentActivity componentActivity, L l10, L l11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = L.Companion.b(L.INSTANCE, 0, 0, null, 4, null);
        }
        if ((i10 & 2) != 0) {
            l11 = L.Companion.b(L.INSTANCE, f45729a, f45730b, null, 4, null);
        }
        a(componentActivity, l10, l11);
    }
}
