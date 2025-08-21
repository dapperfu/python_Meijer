package androidx.privacysandbox.ads.adservices.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/g;", "Landroidx/privacysandbox/ads/adservices/measurement/l;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
/* loaded from: classes4.dex */
public final class g extends l {
    /* JADX WARN: Illegal instructions before constructor call */
    public g(Context context) {
        Intrinsics.j(context, "context");
        Object systemService = context.getSystemService((Class<Object>) e.a());
        Intrinsics.i(systemService, "context.getSystemService…ementManager::class.java)");
        super(f.a(systemService));
    }
}
