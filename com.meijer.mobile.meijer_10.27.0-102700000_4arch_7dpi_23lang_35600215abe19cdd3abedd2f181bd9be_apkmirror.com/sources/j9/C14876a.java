package j9;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lj9/a;", "", "<init>", "()V", "", "applicationCode", "b", "(Ljava/lang/String;)Ljava/lang/String;", "a", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: j9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14876a {

    /* renamed from: a, reason: collision with root package name */
    public static final C14876a f139531a = new C14876a();

    public final String a(String applicationCode) {
        return "https://mobile-sdk-config.gservice.emarsys.net/signature/" + applicationCode;
    }

    public final String b(String applicationCode) {
        return "https://mobile-sdk-config.gservice.emarsys.net/" + applicationCode;
    }

    private C14876a() {
    }
}
