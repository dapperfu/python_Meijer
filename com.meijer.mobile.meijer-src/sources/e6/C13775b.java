package e6;

import R5.K;
import R5.t;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le6/b;", "Le6/a;", "<init>", "()V", "", "uri", "", "a", "(Ljava/lang/String;)Z", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: e6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13775b implements InterfaceC13774a {
    @Override // e6.InterfaceC13774a
    public boolean a(String uri) {
        Intrinsics.j(uri, "uri");
        if (StringsKt.s0(uri)) {
            t.a("Services", "UriService", "Cannot open URI. URI is empty.", new Object[0]);
            return false;
        }
        Activity activityC = K.f().a().c();
        if (activityC == null) {
            t.a("Services", "UriService", "Cannot open URI: " + uri + ". No current activity found.", new Object[0]);
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(uri));
            activityC.startActivity(intent);
            return true;
        } catch (Exception e10) {
            t.a("Services", "UriService", "Failed to open URI: " + uri + ". " + e10.getMessage(), new Object[0]);
            return false;
        }
    }
}
