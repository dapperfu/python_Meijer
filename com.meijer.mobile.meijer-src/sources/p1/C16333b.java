package p1;

import V0.InterfaceC5459f1;
import V0.M;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LV0/f1$a;", "Landroid/content/res/Resources;", "res", "", PreferencesHelper.PREF_ID, "LV0/f1;", "a", "(LV0/f1$a;Landroid/content/res/Resources;I)LV0/f1;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16333b {
    public static final InterfaceC5459f1 a(InterfaceC5459f1.Companion companion, Resources resources, int i10) throws Resources.NotFoundException {
        Drawable drawable = resources.getDrawable(i10, null);
        Intrinsics.h(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return M.c(((BitmapDrawable) drawable).getBitmap());
    }
}
