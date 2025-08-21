package hl;

import ii.AbstractC14762i;
import ii.C14756c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lhl/c;", "", "<init>", "()V", "", "fulfillmentHeader", "fulfillmentType", "", "Lii/i;", "a", "(Ljava/lang/String;Ljava/lang/String;)[Lii/i;", "errorMessage", "b", "(Ljava/lang/String;)[Lii/i;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f135841a = new c();

    public final AbstractC14762i[] a(String fulfillmentHeader, String fulfillmentType) {
        Intrinsics.j(fulfillmentHeader, "fulfillmentHeader");
        Intrinsics.j(fulfillmentType, "fulfillmentType");
        return (AbstractC14762i[]) CollectionsKt.r(C14756c.b(fulfillmentHeader, fulfillmentType), C14756c.d("checkout review order")).toArray(new AbstractC14762i[0]);
    }

    public final AbstractC14762i[] b(String errorMessage) {
        Intrinsics.j(errorMessage, "errorMessage");
        return (AbstractC14762i[]) CollectionsKt.r(C14756c.b("&&events", "event150"), C14756c.b("errormessage", errorMessage)).toArray(new AbstractC14762i[0]);
    }

    private c() {
    }
}
