package Us;

import android.os.Build;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0003R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR$\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LUs/i;", "", "<init>", "()V", "", "b", "", "sdkVersion", "c", "(Ljava/lang/String;)V", "d", "", "Ljava/util/Set;", "sdkVersions", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "userAgent", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f36312a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Set<String> sdkVersions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static volatile String userAgent;

    static {
        i iVar = new i();
        f36312a = iVar;
        Set<String> setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.i(setSynchronizedSet, "synchronizedSet(...)");
        sdkVersions = setSynchronizedSet;
        userAgent = "";
        iVar.d();
    }

    private final void b() {
        userAgent = CollectionsKt.B0(CollectionsKt.Y0(sdkVersions), " ", null, null, 0, null, null, 62, null) + " Android/" + Build.VERSION.SDK_INT;
    }

    public final String a() {
        return userAgent;
    }

    public final void c(String sdkVersion) {
        Intrinsics.j(sdkVersion, "sdkVersion");
        if (sdkVersions.add(sdkVersion)) {
            b();
        }
    }

    public final void d() {
        Set<String> set = sdkVersions;
        set.clear();
        set.add("okta-auth-foundation-kotlin/2.0.3");
        b();
    }

    private i() {
    }
}
