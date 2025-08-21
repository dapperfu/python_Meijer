package h;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import h.AbstractC14427a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh/j;", "Lh/a;", "Landroid/net/Uri;", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "Lh/a$a;", "e", "(Landroid/content/Context;Landroid/net/Uri;)Lh/a$a;", "", "resultCode", "intent", "f", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class j extends AbstractC14427a<Uri, Boolean> {
    @Override // h.AbstractC14427a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC14427a.C2131a<Boolean> b(Context context, Uri input) {
        Intrinsics.j(context, "context");
        Intrinsics.j(input, "input");
        return null;
    }

    @Override // h.AbstractC14427a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Boolean c(int resultCode, Intent intent) {
        return Boolean.valueOf(resultCode == -1);
    }

    @Override // h.AbstractC14427a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Uri input) {
        Intrinsics.j(context, "context");
        Intrinsics.j(input, "input");
        Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
        Intrinsics.i(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
        return intentPutExtra;
    }
}
