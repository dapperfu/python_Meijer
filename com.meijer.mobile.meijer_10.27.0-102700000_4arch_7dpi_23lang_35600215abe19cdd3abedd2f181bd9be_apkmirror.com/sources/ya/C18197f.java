package ya;

import B9.ResponseModel;
import F9.l;
import G9.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0011B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lya/f;", "LB9/a;", "LF9/l;", "", "clientStateStorage", "LDa/b;", "requestModelHelper", "<init>", "(LF9/l;LDa/b;)V", "LB9/c;", "responseModel", "d", "(LB9/c;)Ljava/lang/String;", "", "c", "(LB9/c;)Z", "", "a", "(LB9/c;)V", "LF9/l;", "b", "LDa/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ya.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18197f extends B9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<String> clientStateStorage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Da.b requestModelHelper;

    public C18197f(l<String> clientStateStorage, Da.b requestModelHelper) {
        Intrinsics.j(clientStateStorage, "clientStateStorage");
        Intrinsics.j(requestModelHelper, "requestModelHelper");
        this.clientStateStorage = clientStateStorage;
        this.requestModelHelper = requestModelHelper;
    }

    @Override // B9.a
    public void a(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        this.clientStateStorage.set(d(responseModel));
    }

    @Override // B9.a
    public boolean c(ResponseModel responseModel) {
        Intrinsics.j(responseModel, "responseModel");
        return this.requestModelHelper.c(responseModel.getRequestModel()) && (d(responseModel) != null);
    }

    private final String d(ResponseModel responseModel) {
        return (String) j.b(responseModel.f(), "X-Client-State");
    }
}
