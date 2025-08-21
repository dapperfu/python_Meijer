package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/g;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/topics/b;", "request", "Landroid/adservices/topics/GetTopicsRequest;", "a", "(Landroidx/privacysandbox/ads/adservices/topics/b;)Landroid/adservices/topics/GetTopicsRequest;", "b", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f58001a = new g();

    public final GetTopicsRequest a(C6245b request) {
        Intrinsics.j(request, "request");
        GetTopicsRequest getTopicsRequestBuild = C6246c.a().setAdsSdkName(request.getAdsSdkName()).setShouldRecordObservation(request.getShouldRecordObservation()).build();
        Intrinsics.i(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }

    public final GetTopicsRequest b(C6245b request) {
        Intrinsics.j(request, "request");
        GetTopicsRequest getTopicsRequestBuild = C6246c.a().setAdsSdkName(request.getAdsSdkName()).build();
        Intrinsics.i(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    private g() {
    }
}
