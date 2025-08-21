package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/g0;", "Landroidx/compose/ui/platform/e0;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "a", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5996g0 implements InterfaceC5990e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C5996g0 f52308b = new C5996g0();

    @Override // androidx.compose.ui.platform.InterfaceC5990e0
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public Rect a(Activity activity) throws Exception {
        DisplayCutout displayCutoutF;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                Intrinsics.h(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                Intrinsics.h(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e10) {
            if (!(e10 instanceof NoSuchFieldException ? true : e10 instanceof NoSuchMethodException ? true : e10 instanceof IllegalAccessException ? true : e10 instanceof InvocationTargetException)) {
                throw e10;
            }
            C5978a0.h(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            int iG = C5978a0.g(activity);
            int i10 = rect.bottom;
            if (i10 + iG == point.y) {
                rect.bottom = i10 + iG;
            } else {
                int i11 = rect.right;
                if (i11 + iG == point.x) {
                    rect.right = i11 + iG;
                } else if (rect.left == iG) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode() && (displayCutoutF = C5978a0.f(defaultDisplay)) != null) {
            if (rect.left == displayCutoutF.getSafeInsetLeft()) {
                rect.left = 0;
            }
            if (point.x - rect.right == displayCutoutF.getSafeInsetRight()) {
                rect.right += displayCutoutF.getSafeInsetRight();
            }
            if (rect.top == displayCutoutF.getSafeInsetTop()) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == displayCutoutF.getSafeInsetBottom()) {
                rect.bottom += displayCutoutF.getSafeInsetBottom();
            }
        }
        return rect;
    }

    private C5996g0() {
    }
}
