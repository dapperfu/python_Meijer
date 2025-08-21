package com.meijer.mobile.shoppinglist.teacherlists.ux;

import com.meijer.mobile.shoppinglist.teacherlists.ux.v1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/shoppinglist/teacherlists/ux/t1;", "", "", "newTerm", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.shoppinglist.teacherlists.ux.t1, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class UpdateSearchTerm implements v1.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String newTerm;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdateSearchTerm) && Intrinsics.e(this.newTerm, ((UpdateSearchTerm) other).newTerm);
    }

    public int hashCode() {
        return this.newTerm.hashCode();
    }

    public String toString() {
        return "UpdateSearchTerm(newTerm=" + this.newTerm + ')';
    }

    public UpdateSearchTerm(String newTerm) {
        Intrinsics.j(newTerm, "newTerm");
        this.newTerm = newTerm;
    }

    /* renamed from: a, reason: from getter */
    public final String getNewTerm() {
        return this.newTerm;
    }
}
