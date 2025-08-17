package Bj;

import android.widget.ImageView;
import dk.C13530b;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u0007*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LBj/a;", "", "<init>", "()V", "Landroid/widget/ImageView;", "", "url", "", "a", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "", "errorImageResource", "b", "(Landroid/widget/ImageView;Ljava/lang/String;I)V", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2591a = new a();

    @JvmStatic
    public static final void a(ImageView imageView, String str) {
        Intrinsics.j(imageView, "<this>");
        if (str == null || StringsKt.r0(str)) {
            return;
        }
        C13530b.f(imageView, str, null, null, 6, null);
    }

    @JvmStatic
    public static final void b(ImageView imageView, String str, int i10) {
        Intrinsics.j(imageView, "<this>");
        if (i10 != 0) {
            C13530b.f(imageView, str, Integer.valueOf(i10), null, 4, null);
        }
    }

    private a() {
    }
}
