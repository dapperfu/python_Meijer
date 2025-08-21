package Yh;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, d2 = {"LYh/f;", "", "", "storeId", "", "storeName", "Lbk/a;", "loadingErrorMessage", "<init>", "(ILjava/lang/String;Lbk/a;)V", "a", "(ILjava/lang/String;Lbk/a;)LYh/f;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "c", "b", "Ljava/lang/String;", "d", "Lbk/a;", "()Lbk/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Yh.f, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class YourMeijerStoreCardDecorator {

    /* renamed from: d, reason: collision with root package name */
    public static final int f43106d = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a loadingErrorMessage;

    public YourMeijerStoreCardDecorator() {
        this(0, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YourMeijerStoreCardDecorator)) {
            return false;
        }
        YourMeijerStoreCardDecorator yourMeijerStoreCardDecorator = (YourMeijerStoreCardDecorator) other;
        return this.storeId == yourMeijerStoreCardDecorator.storeId && Intrinsics.e(this.storeName, yourMeijerStoreCardDecorator.storeName) && Intrinsics.e(this.loadingErrorMessage, yourMeijerStoreCardDecorator.loadingErrorMessage);
    }

    public YourMeijerStoreCardDecorator(int i10, String storeName, AbstractC6392a abstractC6392a) {
        Intrinsics.j(storeName, "storeName");
        this.storeId = i10;
        this.storeName = storeName;
        this.loadingErrorMessage = abstractC6392a;
    }

    public final YourMeijerStoreCardDecorator a(int storeId, String storeName, AbstractC6392a loadingErrorMessage) {
        Intrinsics.j(storeName, "storeName");
        return new YourMeijerStoreCardDecorator(storeId, storeName, loadingErrorMessage);
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getLoadingErrorMessage() {
        return this.loadingErrorMessage;
    }

    /* renamed from: c, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: d, reason: from getter */
    public final String getStoreName() {
        return this.storeName;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.storeId) * 31) + this.storeName.hashCode()) * 31;
        AbstractC6392a abstractC6392a = this.loadingErrorMessage;
        return iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode());
    }

    public String toString() {
        return "YourMeijerStoreCardDecorator(storeId=" + this.storeId + ", storeName=" + this.storeName + ", loadingErrorMessage=" + this.loadingErrorMessage + ')';
    }

    public /* synthetic */ YourMeijerStoreCardDecorator(int i10, String str, AbstractC6392a abstractC6392a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? null : abstractC6392a);
    }
}
