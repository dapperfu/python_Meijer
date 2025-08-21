package H5;

import R5.K;
import R5.v;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"LH5/a;", "", "<init>", "()V", "", "b", "()I", "a", "I", "smallIconResourceID", "c", "largeIconResourceID", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13419a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static volatile int smallIconResourceID = -1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static volatile int largeIconResourceID = -1;

    @JvmName
    public final int a() {
        v vVarA;
        if (largeIconResourceID == -1 && (vVarA = K.f().d().a("ADOBE_MOBILE_APP_STATE")) != null) {
            largeIconResourceID = vVarA.getInt("LARGE_ICON_RESOURCE_ID", -1);
        }
        return largeIconResourceID;
    }

    @JvmName
    public final int b() {
        v vVarA;
        if (smallIconResourceID == -1 && (vVarA = K.f().d().a("ADOBE_MOBILE_APP_STATE")) != null) {
            smallIconResourceID = vVarA.getInt("SMALL_ICON_RESOURCE_ID", -1);
        }
        return smallIconResourceID;
    }

    private a() {
    }
}
