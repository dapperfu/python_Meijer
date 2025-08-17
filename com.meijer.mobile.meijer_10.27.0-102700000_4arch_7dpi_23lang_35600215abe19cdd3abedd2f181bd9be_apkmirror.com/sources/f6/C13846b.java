package f6;

import Q5.K;
import U5.r;
import android.app.Activity;
import android.app.Application;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lf6/b;", "LU5/r;", "<init>", "()V", "Landroid/app/Application;", "b", "()Landroid/app/Application;", "Landroid/app/Activity;", "c", "()Landroid/app/Activity;", "", "cacheName", "key", "Ljava/io/InputStream;", "d", "(Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;", "uri", "", "a", "(Ljava/lang/String;)Z", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: f6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13846b implements r {
    @Override // U5.r
    public boolean a(String uri) {
        Intrinsics.j(uri, "uri");
        return K.f().j().a(uri);
    }

    @Override // U5.r
    public InputStream d(String cacheName, String key) {
        Intrinsics.j(cacheName, "cacheName");
        Intrinsics.j(key, "key");
        R5.c cVarB = K.f().b().b(cacheName, key);
        if (cVarB != null) {
            return cVarB.getData();
        }
        return null;
    }

    @Override // U5.r
    public Application b() {
        return K.f().a().b();
    }

    @Override // U5.r
    public Activity c() {
        return K.f().a().c();
    }
}
