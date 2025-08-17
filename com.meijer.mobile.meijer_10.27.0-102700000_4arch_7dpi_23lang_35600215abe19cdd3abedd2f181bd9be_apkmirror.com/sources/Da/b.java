package Da;

import j9.C14877b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u000b*\u00020\b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\t\"\u00020\bH\u0012¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016¨\u0006\u0017"}, d2 = {"LDa/b;", "", "Lj9/b;", "clientServiceEndpointProvider", "eventServiceEndpointProvider", "messageInboxServiceEndpointProvider", "<init>", "(Lj9/b;Lj9/b;Lj9/b;)V", "", "", "patterns", "", "f", "(Ljava/lang/String;[Ljava/lang/String;)Z", "Ly9/c;", "requestModel", "c", "(Ly9/c;)Z", "a", "b", "e", "d", "Lj9/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C14877b clientServiceEndpointProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C14877b eventServiceEndpointProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14877b messageInboxServiceEndpointProvider;

    private boolean f(String str, String... strArr) {
        for (String str2 : strArr) {
            if (StringsKt.W(str, str2, false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public b(C14877b clientServiceEndpointProvider, C14877b eventServiceEndpointProvider, C14877b messageInboxServiceEndpointProvider) {
        Intrinsics.j(clientServiceEndpointProvider, "clientServiceEndpointProvider");
        Intrinsics.j(eventServiceEndpointProvider, "eventServiceEndpointProvider");
        Intrinsics.j(messageInboxServiceEndpointProvider, "messageInboxServiceEndpointProvider");
        this.clientServiceEndpointProvider = clientServiceEndpointProvider;
        this.eventServiceEndpointProvider = eventServiceEndpointProvider;
        this.messageInboxServiceEndpointProvider = messageInboxServiceEndpointProvider;
    }

    public boolean a(y9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        String strA = this.eventServiceEndpointProvider.a();
        String string = requestModel.getUrl().toString();
        Intrinsics.i(string, "toString(...)");
        return f(string, strA) && StringsKt.G(string, "/events", false, 2, null);
    }

    public boolean b(y9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        String strA = this.eventServiceEndpointProvider.a();
        String string = requestModel.getUrl().toString();
        Intrinsics.i(string, "toString(...)");
        return f(string, strA) && StringsKt.G(string, "/inline-messages", false, 2, null);
    }

    public boolean c(y9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        String strA = this.clientServiceEndpointProvider.a();
        String strA2 = this.eventServiceEndpointProvider.a();
        String strA3 = this.messageInboxServiceEndpointProvider.a();
        String string = requestModel.getUrl().toString();
        Intrinsics.i(string, "toString(...)");
        return f(string, strA, strA2, strA3);
    }

    public boolean d(y9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        String strA = this.clientServiceEndpointProvider.a();
        String string = requestModel.getUrl().toString();
        Intrinsics.i(string, "toString(...)");
        return f(string, strA) && StringsKt.G(string, "client/contact", false, 2, null);
    }

    public boolean e(y9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        String strA = this.clientServiceEndpointProvider.a();
        String string = requestModel.getUrl().toString();
        Intrinsics.i(string, "toString(...)");
        return f(string, strA) && StringsKt.G(string, "/contact-token", false, 2, null);
    }
}
