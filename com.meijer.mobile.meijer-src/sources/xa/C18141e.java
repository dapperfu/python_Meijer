package xa;

import H9.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lxa/e;", "Lxa/i;", "LH9/l;", "", "pushTokenStorage", "<init>", "(LH9/l;)V", "a", "()Ljava/lang/String;", "LH9/l;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xa.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18141e implements InterfaceC18145i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<String> pushTokenStorage;

    public C18141e(l<String> pushTokenStorage) {
        Intrinsics.j(pushTokenStorage, "pushTokenStorage");
        this.pushTokenStorage = pushTokenStorage;
    }

    @Override // xa.InterfaceC18145i
    public String a() {
        return this.pushTokenStorage.get();
    }
}
