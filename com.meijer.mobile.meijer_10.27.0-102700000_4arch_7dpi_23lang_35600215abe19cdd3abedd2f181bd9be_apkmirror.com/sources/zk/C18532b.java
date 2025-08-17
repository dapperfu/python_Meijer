package zk;

import Jk.AppVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzk/b;", "", "<init>", "()V", "LJk/a;", "appVersion", "Lokhttp3/Headers;", "a", "(LJk/a;)Lokhttp3/Headers;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zk.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C18532b {

    /* renamed from: a, reason: collision with root package name */
    public static final C18532b f172834a = new C18532b();

    public final Headers a(AppVersion appVersion) {
        Intrinsics.j(appVersion, "appVersion");
        return appVersion.j();
    }

    private C18532b() {
    }
}
