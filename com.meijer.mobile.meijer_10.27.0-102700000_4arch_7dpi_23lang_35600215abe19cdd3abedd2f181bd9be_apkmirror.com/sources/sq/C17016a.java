package sq;

import Jd.C3778l;
import Jd.r;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qq.C16598b;
import qq.InterfaceC16597a;
import xq.C18085d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lsq/a;", "", "<init>", "()V", "Lzq/d;", "e", "()Lzq/d;", "Lxq/d;", "d", "()Lxq/d;", "Landroid/content/Context;", "context", "LJd/r;", "c", "(Landroid/content/Context;)LJd/r;", "settingsClient", "Lvq/e;", "b", "(Landroid/content/Context;LJd/r;)Lvq/e;", "Lqq/a;", "a", "(Landroid/content/Context;)Lqq/a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sq.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17016a {

    /* renamed from: a, reason: collision with root package name */
    public static final C17016a f160780a = new C17016a();

    public final InterfaceC16597a a(Context context) {
        Intrinsics.j(context, "context");
        return new C16598b(context);
    }

    public final vq.e b(Context context, r settingsClient) {
        Intrinsics.j(context, "context");
        Intrinsics.j(settingsClient, "settingsClient");
        return new vq.e(context, settingsClient);
    }

    public final r c(Context context) {
        Intrinsics.j(context, "context");
        r rVarD = C3778l.d(context);
        Intrinsics.i(rVarD, "getSettingsClient(...)");
        return rVarD;
    }

    public final C18085d d() {
        return new C18085d();
    }

    public final zq.d e() {
        return new zq.c();
    }

    private C17016a() {
    }
}
