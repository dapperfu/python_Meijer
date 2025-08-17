package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0011¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/w;", "Landroidx/privacysandbox/ads/adservices/topics/F;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/privacysandbox/ads/adservices/topics/b;", "request", "Landroid/adservices/topics/GetTopicsRequest;", "c", "(Landroidx/privacysandbox/ads/adservices/topics/b;)Landroid/adservices/topics/GetTopicsRequest;", "Landroid/adservices/topics/GetTopicsResponse;", "response", "Landroidx/privacysandbox/ads/adservices/topics/h;", "d", "(Landroid/adservices/topics/GetTopicsResponse;)Landroidx/privacysandbox/ads/adservices/topics/h;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
/* loaded from: classes4.dex */
public final class w extends F {
    /* JADX WARN: Illegal instructions before constructor call */
    public w(Context context) {
        Intrinsics.j(context, "context");
        TopicsManager topicsManager = TopicsManager.get(context);
        Intrinsics.i(topicsManager, "get(context)");
        super(topicsManager);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.F
    public GetTopicsRequest c(C6103b request) {
        Intrinsics.j(request, "request");
        return g.f57777a.a(request);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.F
    public h d(GetTopicsResponse response) {
        Intrinsics.j(response, "response");
        return s.f57780a.b(response);
    }
}
