package com.meijer.mobile.digitalshopping.api.cart;

import fj.CartChanges;
import fj.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import uk.AbstractC17440a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B1\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/cart/ChangeFulfillmentModeChallenge;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "Lfj/n;", "Lfj/e;", "Luk/a$a;", "accept", "Luk/a$b;", "cancel", "<init>", "(Luk/a$a;Luk/a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luk/a$a;", "()Luk/a$a;", "b", "Luk/a$b;", "()Luk/a$b;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ChangeFulfillmentModeChallenge extends RuntimeException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC17440a.Accept<n, CartChanges> accept;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC17440a.Cancel<n, CartChanges> cancel;

    public /* synthetic */ ChangeFulfillmentModeChallenge(AbstractC17440a.Accept accept, AbstractC17440a.Cancel cancel, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(accept, (i10 & 2) != 0 ? accept.b() : cancel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeFulfillmentModeChallenge)) {
            return false;
        }
        ChangeFulfillmentModeChallenge changeFulfillmentModeChallenge = (ChangeFulfillmentModeChallenge) other;
        return Intrinsics.e(this.accept, changeFulfillmentModeChallenge.accept) && Intrinsics.e(this.cancel, changeFulfillmentModeChallenge.cancel);
    }

    public int hashCode() {
        return (this.accept.hashCode() * 31) + this.cancel.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ChangeFulfillmentModeChallenge(accept=" + this.accept + ", cancel=" + this.cancel + ')';
    }

    public AbstractC17440a.Accept<n, CartChanges> a() {
        return this.accept;
    }

    public AbstractC17440a.Cancel<n, CartChanges> b() {
        return this.cancel;
    }

    public ChangeFulfillmentModeChallenge(AbstractC17440a.Accept<n, CartChanges> accept, AbstractC17440a.Cancel<n, CartChanges> cancel) {
        Intrinsics.j(accept, "accept");
        Intrinsics.j(cancel, "cancel");
        this.accept = accept;
        this.cancel = cancel;
    }
}
