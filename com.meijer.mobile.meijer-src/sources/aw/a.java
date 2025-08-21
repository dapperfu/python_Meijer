package aw;

import android.content.Context;
import android.content.res.AssetManager;
import gw.K;
import gw.w;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Law/a;", "Law/b;", "", "path", "<init>", "(Ljava/lang/String;)V", "Lgw/K;", "e", "()Lgw/K;", "f", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "g", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends b {

    /* renamed from: h, reason: collision with root package name */
    private static final String f59708h = "PublicSuffixDatabase.list";

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String path;

    public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? f59708h : str);
    }

    @Override // aw.b
    public K e() throws IOException {
        AssetManager assets;
        Context contextB = d.f154694a.b();
        if (contextB == null || (assets = contextB.getAssets()) == null) {
            throw new IOException("Platform applicationContext not initialized");
        }
        InputStream inputStreamOpen = assets.open(d());
        Intrinsics.i(inputStreamOpen, "open(...)");
        return w.i(inputStreamOpen);
    }

    @Override // aw.b
    /* renamed from: j, reason: from getter and merged with bridge method [inline-methods] */
    public String d() {
        return this.path;
    }

    public a(String path) {
        Intrinsics.j(path, "path");
        this.path = path;
    }
}
