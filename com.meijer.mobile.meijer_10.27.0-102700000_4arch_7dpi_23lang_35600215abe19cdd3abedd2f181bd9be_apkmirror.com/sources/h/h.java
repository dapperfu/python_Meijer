package h;

import android.content.Context;
import android.content.Intent;
import h.AbstractC14314a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh/h;", "Lh/a;", "", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "", "resultCode", "intent", "f", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "Lh/a$a;", "e", "(Landroid/content/Context;Ljava/lang/String;)Lh/a$a;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class h extends AbstractC14314a<String, Boolean> {
    @Override // h.AbstractC14314a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String input) {
        Intrinsics.j(context, "context");
        Intrinsics.j(input, "input");
        return C14320g.INSTANCE.a(new String[]{input});
    }

    @Override // h.AbstractC14314a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC14314a.C2118a<Boolean> b(Context context, String input) {
        Intrinsics.j(context, "context");
        Intrinsics.j(input, "input");
        if (Z1.b.a(context, input) == 0) {
            return new AbstractC14314a.C2118a<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // h.AbstractC14314a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean c(int resultCode, Intent intent) {
        if (intent == null || resultCode != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z10 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (intArrayExtra[i10] == 0) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        return Boolean.valueOf(z10);
    }
}
