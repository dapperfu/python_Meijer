package Aa;

import D9.ResponseModel;
import H9.l;
import I9.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0011B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LAa/f;", "LD9/a;", "LH9/l;", "", "clientStateStorage", "LFa/b;", "requestModelHelper", "<init>", "(LH9/l;LFa/b;)V", "LD9/c;", "responseModel", "d", "(LD9/c;)Ljava/lang/String;", "", "c", "(LD9/c;)Z", "", "a", "(LD9/c;)V", "LH9/l;", "b", "LFa/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends D9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<String> clientStateStorage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Fa.b requestModelHelper;

    public f(l<String> clientStateStorage, Fa.b requestModelHelper) {
        Intrinsics.j(clientStateStorage, "clientStateStorage");
        Intrinsics.j(requestModelHelper, "requestModelHelper");
        this.clientStateStorage = clientStateStorage;
        this.requestModelHelper = requestModelHelper;
    }

    @Override // D9.a
    public void a(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        this.clientStateStorage.set(d(responseModel));
    }

    @Override // D9.a
    public boolean c(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        return this.requestModelHelper.c(responseModel.getRequestModel()) && (d(responseModel) != null);
    }

    private final String d(ResponseModel responseModel) {
        return (String) j.b(responseModel.f(), "X-Client-State");
    }
}
