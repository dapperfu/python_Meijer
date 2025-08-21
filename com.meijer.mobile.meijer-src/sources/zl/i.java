package zl;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzl/i;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "a", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f172921a = new i();

    public final SharedPreferences a(Context context) {
        Intrinsics.j(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("feature_flags", 0);
        Intrinsics.i(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    private i() {
    }
}
