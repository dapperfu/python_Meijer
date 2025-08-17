package h5;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l5.C15376l;
import q5.C16458j;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lh5/c;", "Lh5/b;", "Landroid/net/Uri;", "<init>", "()V", "data", "Ll5/l;", "options", "", "b", "(Landroid/net/Uri;Ll5/l;)Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: h5.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14379c implements InterfaceC14378b<Uri> {
    @Override // h5.InterfaceC14378b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(Uri data, C15376l options) {
        if (Intrinsics.e(data.getScheme(), "android.resource")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(data);
            sb2.append('-');
            sb2.append(C16458j.l(options.getContext().getResources().getConfiguration()));
            return sb2.toString();
        }
        return data.toString();
    }
}
