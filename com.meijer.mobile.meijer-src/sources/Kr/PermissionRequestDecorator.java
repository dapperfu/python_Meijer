package Kr;

import Kr.g;
import bk.AbstractC6392a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B1\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"LKr/b;", "LKr/g;", "T", "", "", "", "permissions", "Lbk/a;", "message", "actionName", "resolution", "<init>", "(Ljava/util/List;Lbk/a;Lbk/a;LKr/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getPermissions", "()Ljava/util/List;", "b", "Lbk/a;", "()Lbk/a;", "c", "d", "LKr/g;", "()LKr/g;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kr.b, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class PermissionRequestDecorator<T extends g> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f17669e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> permissions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a message;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a actionName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final T resolution;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionRequestDecorator)) {
            return false;
        }
        PermissionRequestDecorator permissionRequestDecorator = (PermissionRequestDecorator) other;
        return Intrinsics.e(this.permissions, permissionRequestDecorator.permissions) && Intrinsics.e(this.message, permissionRequestDecorator.message) && Intrinsics.e(this.actionName, permissionRequestDecorator.actionName) && Intrinsics.e(this.resolution, permissionRequestDecorator.resolution);
    }

    public PermissionRequestDecorator(List<String> permissions, AbstractC6392a message, AbstractC6392a actionName, T t10) {
        Intrinsics.j(permissions, "permissions");
        Intrinsics.j(message, "message");
        Intrinsics.j(actionName, "actionName");
        this.permissions = permissions;
        this.message = message;
        this.actionName = actionName;
        this.resolution = t10;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getActionName() {
        return this.actionName;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getMessage() {
        return this.message;
    }

    public final T c() {
        return this.resolution;
    }

    public int hashCode() {
        int iHashCode = ((((this.permissions.hashCode() * 31) + this.message.hashCode()) * 31) + this.actionName.hashCode()) * 31;
        T t10 = this.resolution;
        return iHashCode + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        return "PermissionRequestDecorator(permissions=" + this.permissions + ", message=" + this.message + ", actionName=" + this.actionName + ", resolution=" + this.resolution + ')';
    }
}
