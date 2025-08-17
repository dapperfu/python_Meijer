package m9;

import U8.ChannelSettings;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lm9/a;", "LU8/b;", "Lm9/j;", "notificationManagerProxy", "<init>", "(Lm9/j;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lm9/j;", "b", "()Z", "areNotificationsEnabled", "importance", "", "LU8/a;", "c", "()Ljava/util/List;", "channelSettings", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: m9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15578a implements U8.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j notificationManagerProxy;

    public C15578a(j notificationManagerProxy) {
        Intrinsics.j(notificationManagerProxy, "notificationManagerProxy");
        this.notificationManagerProxy = notificationManagerProxy;
    }

    @Override // U8.b
    public int a() {
        return this.notificationManagerProxy.b();
    }

    @Override // U8.b
    public boolean b() {
        return this.notificationManagerProxy.a();
    }

    @Override // U8.b
    public List<ChannelSettings> c() {
        return this.notificationManagerProxy.c();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.e(getClass(), other.getClass())) {
            return false;
        }
        return Intrinsics.e(this.notificationManagerProxy, ((C15578a) other).notificationManagerProxy);
    }

    public int hashCode() {
        return Objects.hash(this.notificationManagerProxy);
    }
}
