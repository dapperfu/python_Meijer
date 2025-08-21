package h7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import b2.C6327h;
import j.C14879a;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f135171a = true;

    public static Drawable b(Context context, Context context2, int i10) {
        return c(context, context2, i10, null);
    }

    private static Drawable c(Context context, Context context2, int i10, Resources.Theme theme) {
        try {
            if (f135171a) {
                return e(context2, i10, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e10;
            }
            return Z1.b.e(context2, i10);
        } catch (NoClassDefFoundError unused2) {
            f135171a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i10, theme);
    }

    private static Drawable e(Context context, int i10, Resources.Theme theme) {
        if (theme != null) {
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, theme);
            dVar.a(theme.getResources().getConfiguration());
            context = dVar;
        }
        return C14879a.b(context, i10);
    }

    public static Drawable a(Context context, int i10, Resources.Theme theme) {
        return c(context, context, i10, theme);
    }

    private static Drawable d(Context context, int i10, Resources.Theme theme) {
        return C6327h.f(context.getResources(), i10, theme);
    }
}
