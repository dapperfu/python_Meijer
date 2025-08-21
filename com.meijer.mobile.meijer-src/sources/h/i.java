package h;

import android.content.Context;
import android.content.Intent;
import g.C14274a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lh/i;", "Lh/a;", "Landroid/content/Intent;", "Lg/a;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "d", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "", "resultCode", "intent", "e", "(ILandroid/content/Intent;)Lg/a;", "a", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i extends AbstractC14427a<Intent, C14274a> {
    @Override // h.AbstractC14427a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent input) {
        Intrinsics.j(context, "context");
        Intrinsics.j(input, "input");
        return input;
    }

    @Override // h.AbstractC14427a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C14274a c(int resultCode, Intent intent) {
        return new C14274a(resultCode, intent);
    }
}
