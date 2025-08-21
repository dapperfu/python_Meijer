package Vn;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
import qw.a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"LVn/f;", "LY9/a;", "LDl/e;", "deepLinkParser", "<init>", "(LDl/e;)V", "Landroid/content/Context;", "context", "", "eventName", "Lorg/json/JSONObject;", "payload", "", "a", "(Landroid/content/Context;Ljava/lang/String;Lorg/json/JSONObject;)V", "LDl/e;", "b", "emarsys_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class f implements Y9.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Dl.e deepLinkParser;

    public f(Dl.e deepLinkParser) {
        Intrinsics.j(deepLinkParser, "deepLinkParser");
        this.deepLinkParser = deepLinkParser;
    }

    @Override // Y9.a
    public void a(Context context, String eventName, JSONObject payload) {
        Intent intentAddFlags;
        Intrinsics.j(context, "context");
        Intrinsics.j(eventName, "eventName");
        if (!Intrinsics.e(eventName, "DeepLink")) {
            if (Intrinsics.e(eventName, "push:payload")) {
                qw.a.INSTANCE.z("Emarsys Event").q(eventName + ": " + payload, new Object[0]);
                return;
            }
            qw.a.INSTANCE.z("Emarsys Event").s("Unhandled event: " + eventName + ": " + payload, new Object[0]);
            return;
        }
        a.Companion companion = qw.a.INSTANCE;
        companion.z("Emarsys Event").a(eventName + ": " + payload, new Object[0]);
        String string = payload != null ? payload.getString("url") : null;
        Intent intentN = this.deepLinkParser.n(context, string);
        if (intentN == null || (intentAddFlags = intentN.addFlags(268435456)) == null) {
            companion.z("Emarsys Event").s("Failed to parse deep link: " + string, new Object[0]);
            return;
        }
        companion.z("Emarsys Event").a("Resolved " + string + " to " + intentAddFlags, new Object[0]);
        context.startActivity(intentAddFlags);
    }
}
