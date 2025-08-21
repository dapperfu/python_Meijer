package j5;

import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15673l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lj5/e;", "Lj5/d;", "", "Landroid/net/Uri;", "<init>", "()V", "data", "Landroid/content/Context;", "context", "", "b", "(ILandroid/content/Context;)Z", "Lm5/l;", "options", "c", "(ILm5/l;)Landroid/net/Uri;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j5.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14946e implements InterfaceC14945d<Integer, Uri> {
    private final boolean b(int data, Context context) {
        return context.getResources().getResourceEntryName(data) != null;
    }

    @Override // j5.InterfaceC14945d
    public /* bridge */ /* synthetic */ Uri a(Integer num, C15673l c15673l) {
        return c(num.intValue(), c15673l);
    }

    public Uri c(int data, C15673l options) {
        if (!b(data, options.getContext())) {
            return null;
        }
        return Uri.parse("android.resource://" + options.getContext().getPackageName() + '/' + data);
    }
}
