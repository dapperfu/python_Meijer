package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/h0;", "Landroidx/compose/ui/platform/e0;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "a", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5999h0 implements InterfaceC5990e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C5999h0 f52321b = new C5999h0();

    private C5999h0() {
    }

    @Override // androidx.compose.ui.platform.InterfaceC5990e0
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public Rect a(Activity activity) throws Exception {
        boolean z10;
        boolean z11;
        Configuration configuration = activity.getResources().getConfiguration();
        boolean z12 = true;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            Intrinsics.h(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (Exception e10) {
            if (e10 instanceof NoSuchFieldException) {
                z10 = true;
            } else {
                z10 = e10 instanceof NoSuchMethodException;
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = e10 instanceof IllegalAccessException;
            }
            if (!z11) {
                z12 = e10 instanceof InvocationTargetException;
            }
            if (z12) {
                return C5996g0.f52308b.a(activity);
            }
            throw e10;
        }
    }
}
