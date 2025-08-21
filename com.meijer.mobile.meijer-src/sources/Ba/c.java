package Ba;

import android.graphics.Bitmap;
import androidx.core.app.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LBa/c;", "LBa/o;", "<init>", "()V", "Landroidx/core/app/m$e;", "builder", "LBa/k;", "notificationData", "Landroid/graphics/Bitmap;", "image", "iconImage", "a", "(Landroidx/core/app/m$e;LBa/k;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Landroidx/core/app/m$e;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends o {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2579a = new c();

    private c() {
        super(null);
    }

    public m.e a(m.e builder, NotificationData notificationData, Bitmap image, Bitmap iconImage) {
        Intrinsics.j(builder, "builder");
        Intrinsics.j(notificationData, "notificationData");
        if (notificationData.getImageUrl() != null) {
            builder.q(image).A(new m.b().j(image).h(null).k(notificationData.getTitle()).l(notificationData.getBody()));
            return builder;
        }
        builder.A(new m.c().h(notificationData.getBody()).i(notificationData.getTitle()));
        return builder;
    }
}
