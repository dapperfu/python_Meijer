package gl;

import hi.AbstractC14482i;
import hi.C14476c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lgl/c;", "", "<init>", "()V", "", "fulfillmentHeader", "fulfillmentType", "", "Lhi/i;", "a", "(Ljava/lang/String;Ljava/lang/String;)[Lhi/i;", "errorMessage", "b", "(Ljava/lang/String;)[Lhi/i;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f133775a = new c();

    public final AbstractC14482i[] a(String fulfillmentHeader, String fulfillmentType) {
        Intrinsics.j(fulfillmentHeader, "fulfillmentHeader");
        Intrinsics.j(fulfillmentType, "fulfillmentType");
        return (AbstractC14482i[]) CollectionsKt.r(C14476c.b(fulfillmentHeader, fulfillmentType), C14476c.d("checkout review order")).toArray(new AbstractC14482i[0]);
    }

    public final AbstractC14482i[] b(String errorMessage) {
        Intrinsics.j(errorMessage, "errorMessage");
        return (AbstractC14482i[]) CollectionsKt.r(C14476c.b("&&events", "event150"), C14476c.b("errormessage", errorMessage)).toArray(new AbstractC14482i[0]);
    }

    private c() {
    }
}
