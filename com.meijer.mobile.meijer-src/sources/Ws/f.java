package Ws;

import Vs.p;
import at.InterfaceC6294a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LWs/f;", "Lat/a;", "LVs/b;", "credential", "LVs/p;", "token", "", "", "tags", "<init>", "(LVs/b;LVs/p;Ljava/util/Map;)V", "a", "LVs/b;", "getCredential", "()LVs/b;", "b", "LVs/p;", "getToken", "()LVs/p;", "c", "Ljava/util/Map;", "getTags", "()Ljava/util/Map;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements InterfaceC6294a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Vs.b credential;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p token;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> tags;

    public f(Vs.b credential, p pVar, Map<String, String> tags) {
        Intrinsics.j(credential, "credential");
        Intrinsics.j(tags, "tags");
        this.credential = credential;
        this.token = pVar;
        this.tags = tags;
    }
}
