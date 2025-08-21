package ej;

import android.text.Spanned;
import android.widget.TextView;
import androidx.core.widget.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/widget/TextView;", "", "string", "", "a", "(Landroid/widget/TextView;Ljava/lang/String;)V", "", "resourceId", "b", "(Landroid/widget/TextView;I)V", "base-ui_release"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "com/meijer/mobile/base/ui/util/TextViewExt")
@SourceDebugExtension
/* loaded from: classes8.dex */
final /* synthetic */ class b {
    public static final void a(TextView textView, String str) {
        Intrinsics.j(textView, "<this>");
        Spanned spannedA = null;
        if (str != null) {
            if (StringsKt.s0(str)) {
                str = null;
            }
            if (str != null) {
                spannedA = m2.b.a(str, 0, null, null);
            }
        }
        textView.setText(spannedA);
    }

    public static final void b(TextView textView, int i10) {
        Intrinsics.j(textView, "<this>");
        k.p(textView, i10);
    }
}
