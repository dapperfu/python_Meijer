package n9;

import Z1.b;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Ln9/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "permission", "", "a", "(Ljava/lang/String;)I", "Landroid/content/Context;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: n9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15784a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public C15784a(Context context) {
        Intrinsics.j(context, "context");
        this.context = context;
    }

    public int a(String permission) {
        Intrinsics.j(permission, "permission");
        return b.a(this.context, permission);
    }
}
