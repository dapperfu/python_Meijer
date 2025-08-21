package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0005H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "androidComposeView", "LH1/r;", "d", "(Landroidx/compose/ui/platform/AndroidComposeView;)J", "Landroid/content/Context;", "Landroid/app/Activity;", "e", "(Landroid/content/Context;)Landroid/app/Activity;", "context", "", "g", "(Landroid/content/Context;)I", "activity", "Landroid/graphics/Rect;", "bounds", "", "h", "(Landroid/app/Activity;Landroid/graphics/Rect;)V", "Landroid/view/Display;", "display", "Landroid/view/DisplayCutout;", "f", "(Landroid/view/Display;)Landroid/view/DisplayCutout;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.platform.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5978a0 {
    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"BanUncheckedReflection"})
    public static final DisplayCutout f(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (Y.a(obj)) {
                return Z.a(obj);
            }
        } catch (Exception e10) {
            if (!(e10 instanceof ClassNotFoundException ? true : e10 instanceof NoSuchMethodException ? true : e10 instanceof NoSuchFieldException ? true : e10 instanceof IllegalAccessException ? true : e10 instanceof InvocationTargetException ? true : e10 instanceof InstantiationException)) {
                throw e10;
            }
        }
        return null;
    }

    private static final Activity e(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    public static final long d(AndroidComposeView androidComposeView) {
        Context context = androidComposeView.getContext();
        Activity activityE = e(context);
        if (activityE != null) {
            Rect rectA = InterfaceC5990e0.INSTANCE.a().a(activityE);
            return H1.r.c((rectA.height() & 4294967295L) | (rectA.width() << 32));
        }
        Configuration configuration = context.getResources().getConfiguration();
        return H1.r.c((Math.round(configuration.screenHeightDp * r7) & 4294967295L) | (Math.round(configuration.screenWidthDp * context.getResources().getDisplayMetrics().density) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
