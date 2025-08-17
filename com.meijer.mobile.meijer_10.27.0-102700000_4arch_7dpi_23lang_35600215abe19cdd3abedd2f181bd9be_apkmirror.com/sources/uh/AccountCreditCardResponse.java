package uh;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Luh/b;", "", "", "Luh/a;", "creditCards", "<init>", "(Ljava/util/List;)V", "a", "(Ljava/util/List;)Luh/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "getHasCardWithLinkedMperks", "()Z", "hasCardWithLinkedMperks", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: uh.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class AccountCreditCardResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AccountCreditCard> creditCards;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean hasCardWithLinkedMperks;

    /* JADX WARN: Multi-variable type inference failed */
    public AccountCreditCardResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccountCreditCardResponse) && Intrinsics.e(this.creditCards, ((AccountCreditCardResponse) other).creditCards);
    }

    public AccountCreditCardResponse(List<AccountCreditCard> creditCards) {
        Intrinsics.j(creditCards, "creditCards");
        this.creditCards = creditCards;
        List<AccountCreditCard> list = creditCards;
        boolean z10 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AccountCreditCard) it.next()).getLinkToMPerks()) {
                    z10 = true;
                    break;
                }
            }
        }
        this.hasCardWithLinkedMperks = z10;
    }

    public final AccountCreditCardResponse a(List<AccountCreditCard> creditCards) {
        Intrinsics.j(creditCards, "creditCards");
        return new AccountCreditCardResponse(creditCards);
    }

    public final List<AccountCreditCard> b() {
        return this.creditCards;
    }

    public int hashCode() {
        return this.creditCards.hashCode();
    }

    public String toString() {
        return "AccountCreditCardResponse(creditCards=" + this.creditCards + ')';
    }

    public /* synthetic */ AccountCreditCardResponse(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list);
    }
}
