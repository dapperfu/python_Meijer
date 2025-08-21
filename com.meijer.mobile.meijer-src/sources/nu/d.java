package nu;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import mu.C15768a;
import qu.C16766a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lnu/d;", "", "<init>", "()V", "T", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "entryPoint", "a", "(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;", "hilt-android_main_java_dagger_hilt_android-entry_point_accessors_internal_kt"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f153263a = new d();

    @JvmStatic
    public static final <T> T a(Context context, Class<T> entryPoint) {
        Intrinsics.j(context, "context");
        Intrinsics.j(entryPoint, "entryPoint");
        return (T) C15768a.a(C16766a.a(context.getApplicationContext()), entryPoint);
    }

    private d() {
    }
}
