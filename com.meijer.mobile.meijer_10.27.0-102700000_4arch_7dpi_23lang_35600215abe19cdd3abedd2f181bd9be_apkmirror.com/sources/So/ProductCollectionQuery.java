package So;

import To.C5277v;
import To.J;
import Xo.ProductFilterInput;
import Xo.ProductQueryContextInput;
import Xo.ProductSortInput;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import y6.AbstractC18169C;
import y6.C18174b;
import y6.InterfaceC18167A;
import y6.InterfaceC18171E;
import y6.InterfaceC18173a;
import y6.p;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0086\b\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0013+\u001e-3.78\u00139:;<!4=1\u0015>/BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u001b2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010%R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b.\u0010%R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010*\u001a\u0004\b/\u0010\u0014R%\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\t8\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b3\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106¨\u0006?"}, d2 = {"LSo/d;", "Ly6/E;", "LSo/d$f;", "", "collectionId", "", "storeId", "first", "after", "Ly6/C;", "", "LXo/a;", "filters", "LXo/c;", "sort", "LXo/b;", "context", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ly6/C;Ly6/C;LXo/b;)V", "b", "()Ljava/lang/String;", "c", "name", "LC6/g;", "writer", "Ly6/p;", "customScalarAdapters", "", "withDefaultValues", "", "d", "(LC6/g;Ly6/p;Z)V", "Ly6/a;", "a", "()Ly6/a;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "I", "k", "i", "e", "Ly6/C;", "h", "()Ly6/C;", "j", "g", "LXo/b;", "()LXo/b;", "l", "s", "r", "o", "q", "n", "m", "p", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: So.d, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ProductCollectionQuery implements InterfaceC18171E<Data> {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String collectionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int first;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String after;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC18169C<List<ProductFilterInput>> filters;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC18169C<ProductSortInput> sort;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductQueryContextInput context;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"LSo/d$a;", "", "", "onLoad", "onView", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$a, reason: from toString */
    public static final /* data */ class Attribution1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String onLoad;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String onView;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attribution1)) {
                return false;
            }
            Attribution1 attribution1 = (Attribution1) other;
            return Intrinsics.e(this.onLoad, attribution1.onLoad) && Intrinsics.e(this.onView, attribution1.onView);
        }

        /* renamed from: a, reason: from getter */
        public final String getOnLoad() {
            return this.onLoad;
        }

        /* renamed from: b, reason: from getter */
        public final String getOnView() {
            return this.onView;
        }

        public int hashCode() {
            String str = this.onLoad;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.onView;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Attribution1(onLoad=" + this.onLoad + ", onView=" + this.onView + ')';
        }

        public Attribution1(String str, String str2) {
            this.onLoad = str;
            this.onView = str2;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\nR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0013\u0012\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001a\u0010\n¨\u0006\u001c"}, d2 = {"LSo/d$b;", "", "", "onAddToCart", "onClick", "onLoad", "onView", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOnAddToCart$annotations", "()V", "b", "getOnClick$annotations", "c", "getOnLoad$annotations", "d", "getOnView$annotations", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$b, reason: from toString */
    public static final /* data */ class Attribution {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String onAddToCart;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String onClick;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String onLoad;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String onView;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attribution)) {
                return false;
            }
            Attribution attribution = (Attribution) other;
            return Intrinsics.e(this.onAddToCart, attribution.onAddToCart) && Intrinsics.e(this.onClick, attribution.onClick) && Intrinsics.e(this.onLoad, attribution.onLoad) && Intrinsics.e(this.onView, attribution.onView);
        }

        /* renamed from: a, reason: from getter */
        public final String getOnAddToCart() {
            return this.onAddToCart;
        }

        /* renamed from: b, reason: from getter */
        public final String getOnClick() {
            return this.onClick;
        }

        /* renamed from: c, reason: from getter */
        public final String getOnLoad() {
            return this.onLoad;
        }

        /* renamed from: d, reason: from getter */
        public final String getOnView() {
            return this.onView;
        }

        public int hashCode() {
            String str = this.onAddToCart;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.onClick;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.onLoad;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.onView;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Attribution(onAddToCart=" + this.onAddToCart + ", onClick=" + this.onClick + ", onLoad=" + this.onLoad + ", onView=" + this.onView + ')';
        }

        public Attribution(String str, String str2, String str3, String str4) {
            this.onAddToCart = str;
            this.onClick = str2;
            this.onLoad = str3;
            this.onView = str4;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\n¨\u0006\u0016"}, d2 = {"LSo/d$c;", "", "", "count", "", "displayName", "groupId", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$c, reason: from toString */
    public static final /* data */ class Child {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int count;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String displayName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String groupId;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Child)) {
                return false;
            }
            Child child = (Child) other;
            return this.count == child.count && Intrinsics.e(this.displayName, child.displayName) && Intrinsics.e(this.groupId, child.groupId);
        }

        public Child(int i10, String str, String groupId) {
            Intrinsics.j(groupId, "groupId");
            this.count = i10;
            this.displayName = str;
            this.groupId = groupId;
        }

        /* renamed from: a, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* renamed from: b, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: c, reason: from getter */
        public final String getGroupId() {
            return this.groupId;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.count) * 31;
            String str = this.displayName;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.groupId.hashCode();
        }

        public String toString() {
            return "Child(count=" + this.count + ", displayName=" + this.displayName + ", groupId=" + this.groupId + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"LSo/d$d;", "", "", "__typename", "LSo/d$k;", "onFilterableProductDisplayResult", "<init>", "(Ljava/lang/String;LSo/d$k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LSo/d$k;", "()LSo/d$k;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$d, reason: collision with other inner class name and from toString */
    public static final /* data */ class Collection {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String __typename;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OnFilterableProductDisplayResult onFilterableProductDisplayResult;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Collection)) {
                return false;
            }
            Collection collection = (Collection) other;
            return Intrinsics.e(this.__typename, collection.__typename) && Intrinsics.e(this.onFilterableProductDisplayResult, collection.onFilterableProductDisplayResult);
        }

        public Collection(String __typename, OnFilterableProductDisplayResult onFilterableProductDisplayResult) {
            Intrinsics.j(__typename, "__typename");
            Intrinsics.j(onFilterableProductDisplayResult, "onFilterableProductDisplayResult");
            this.__typename = __typename;
            this.onFilterableProductDisplayResult = onFilterableProductDisplayResult;
        }

        /* renamed from: a, reason: from getter */
        public final OnFilterableProductDisplayResult getOnFilterableProductDisplayResult() {
            return this.onFilterableProductDisplayResult;
        }

        /* renamed from: b, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            return (this.__typename.hashCode() * 31) + this.onFilterableProductDisplayResult.hashCode();
        }

        public String toString() {
            return "Collection(__typename=" + this.__typename + ", onFilterableProductDisplayResult=" + this.onFilterableProductDisplayResult + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LSo/d$e;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$e, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a() {
            return "query ProductCollectionQuery($collectionId: String!, $storeId: Int!, $first: Int!, $after: String!, $filters: [ProductFilterInput!], $sort: ProductSortInput, $context: ProductQueryContextInput!) { collection: browseProductsByCollection(collectionId: $collectionId, filters: $filters, sort: $sort, context: $context) { __typename ... on FilterableProductDisplayResult { itemConnection(first: $first, after: $after) { items { __typename ... on ProductExtended { averagePoundsPerEach brandName brandDescription hasMPerks isAlcohol isCurbsideEligible isHomeDeliveryAvailable isPrimaryUpc isSponsored mPerksOfferId productDescription productDetails productId productName upc upcTypeName descriptiveFeatures priceUnit isPriceByWeight soldByUnit unitOfMeasureQuantity maxOrderQuantity thumbnailImage { altText url } attribution { onAddToCart onClick onLoad onView } storeSpecificProductDetails(storeId: $storeId) { pricing: productStore { ageLimit alcoholAgeLimit avgPricingUnitsPerSoldByUnit avgSoldByUnitsPerPricingUnit basePrice basePricePerSoldByUnit buyQuantity clearancePrice clearancePricePerSoldByUnit cmPriceEndDate currency customerPrice customerPricePerSoldByUnit depositValue discountValue discountValuePerSoldByUnit dollarOff isEligible isOnSale isPriceDisplayable percentageOff priceChangeMethod priceDescription priceEndDate priceText priceType pricingUnit productId promotionPrice restrictedCategoryDescription restrictedCategoryName savingsDescription sellQuantity soldByUnit storeId unitOfMeasureQuantity upc upcStoreCompositeKey updatedAt } stock: productStoreInventory { ilcPrimary ilcs stockStatus storeId upc upcStoreCompositeKey updatedAt } } } } totalCount pageInfo { hasNextPage hasPreviousPage endCursor startCursor } } attribution { onLoad onView } filterOptions { displayName hidden name selectionType options { count displayName status value } } groupFilterOptions { count displayName groupId children { count displayName groupId } } sortOptions { displayName sortBy sortOrder status } } } }";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LSo/d$f;", "", "LSo/d$d;", "collection", "<init>", "(LSo/d$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSo/d$d;", "()LSo/d$d;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$f, reason: from toString */
    public static final /* data */ class Data implements InterfaceC18167A.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Collection collection;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.e(this.collection, ((Data) other).collection);
        }

        public Data(Collection collection) {
            Intrinsics.j(collection, "collection");
            this.collection = collection;
        }

        /* renamed from: a, reason: from getter */
        public final Collection getCollection() {
            return this.collection;
        }

        public int hashCode() {
            return this.collection.hashCode();
        }

        public String toString() {
            return "Data(collection=" + this.collection + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u000eR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, d2 = {"LSo/d$g;", "", "", "displayName", "", "hidden", "name", "selectionType", "", "LSo/d$m;", "options", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "c", "d", "e", "Ljava/util/List;", "()Ljava/util/List;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$g, reason: from toString */
    public static final /* data */ class FilterOption {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String displayName;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hidden;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String selectionType;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Option> options;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilterOption)) {
                return false;
            }
            FilterOption filterOption = (FilterOption) other;
            return Intrinsics.e(this.displayName, filterOption.displayName) && this.hidden == filterOption.hidden && Intrinsics.e(this.name, filterOption.name) && Intrinsics.e(this.selectionType, filterOption.selectionType) && Intrinsics.e(this.options, filterOption.options);
        }

        public FilterOption(String displayName, boolean z10, String name, String str, List<Option> list) {
            Intrinsics.j(displayName, "displayName");
            Intrinsics.j(name, "name");
            this.displayName = displayName;
            this.hidden = z10;
            this.name = name;
            this.selectionType = str;
            this.options = list;
        }

        /* renamed from: a, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getHidden() {
            return this.hidden;
        }

        /* renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final List<Option> d() {
            return this.options;
        }

        /* renamed from: e, reason: from getter */
        public final String getSelectionType() {
            return this.selectionType;
        }

        public int hashCode() {
            int iHashCode = ((((this.displayName.hashCode() * 31) + Boolean.hashCode(this.hidden)) * 31) + this.name.hashCode()) * 31;
            String str = this.selectionType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<Option> list = this.options;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "FilterOption(displayName=" + this.displayName + ", hidden=" + this.hidden + ", name=" + this.name + ", selectionType=" + this.selectionType + ", options=" + this.options + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\rR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"LSo/d$h;", "", "", "count", "", "displayName", "groupId", "", "LSo/d$c;", "children", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$h, reason: from toString */
    public static final /* data */ class GroupFilterOption {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int count;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String displayName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String groupId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Child> children;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GroupFilterOption)) {
                return false;
            }
            GroupFilterOption groupFilterOption = (GroupFilterOption) other;
            return this.count == groupFilterOption.count && Intrinsics.e(this.displayName, groupFilterOption.displayName) && Intrinsics.e(this.groupId, groupFilterOption.groupId) && Intrinsics.e(this.children, groupFilterOption.children);
        }

        public GroupFilterOption(int i10, String str, String groupId, List<Child> children) {
            Intrinsics.j(groupId, "groupId");
            Intrinsics.j(children, "children");
            this.count = i10;
            this.displayName = str;
            this.groupId = groupId;
            this.children = children;
        }

        public final List<Child> a() {
            return this.children;
        }

        /* renamed from: b, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* renamed from: c, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: d, reason: from getter */
        public final String getGroupId() {
            return this.groupId;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.count) * 31;
            String str = this.displayName;
            return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.groupId.hashCode()) * 31) + this.children.hashCode();
        }

        public String toString() {
            return "GroupFilterOption(count=" + this.count + ", displayName=" + this.displayName + ", groupId=" + this.groupId + ", children=" + this.children + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"LSo/d$i;", "", "", "__typename", "LSo/d$l;", "onProductExtended", "<init>", "(Ljava/lang/String;LSo/d$l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LSo/d$l;", "()LSo/d$l;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$i, reason: from toString */
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String __typename;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OnProductExtended onProductExtended;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.e(this.__typename, item.__typename) && Intrinsics.e(this.onProductExtended, item.onProductExtended);
        }

        public Item(String __typename, OnProductExtended onProductExtended) {
            Intrinsics.j(__typename, "__typename");
            this.__typename = __typename;
            this.onProductExtended = onProductExtended;
        }

        /* renamed from: a, reason: from getter */
        public final OnProductExtended getOnProductExtended() {
            return this.onProductExtended;
        }

        /* renamed from: b, reason: from getter */
        public final String get__typename() {
            return this.__typename;
        }

        public int hashCode() {
            int iHashCode = this.__typename.hashCode() * 31;
            OnProductExtended onProductExtended = this.onProductExtended;
            return iHashCode + (onProductExtended == null ? 0 : onProductExtended.hashCode());
        }

        public String toString() {
            return "Item(__typename=" + this.__typename + ", onProductExtended=" + this.onProductExtended + ')';
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"LSo/d$j;", "", "", "LSo/d$i;", "items", "", "totalCount", "LSo/d$n;", "pageInfo", "<init>", "(Ljava/util/List;ILSo/d$n;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "I", "c", "LSo/d$n;", "()LSo/d$n;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$j, reason: from toString */
    public static final /* data */ class ItemConnection {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Item> items;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int totalCount;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final PageInfo pageInfo;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemConnection)) {
                return false;
            }
            ItemConnection itemConnection = (ItemConnection) other;
            return Intrinsics.e(this.items, itemConnection.items) && this.totalCount == itemConnection.totalCount && Intrinsics.e(this.pageInfo, itemConnection.pageInfo);
        }

        public ItemConnection(List<Item> items, int i10, PageInfo pageInfo) {
            Intrinsics.j(items, "items");
            Intrinsics.j(pageInfo, "pageInfo");
            this.items = items;
            this.totalCount = i10;
            this.pageInfo = pageInfo;
        }

        public final List<Item> a() {
            return this.items;
        }

        /* renamed from: b, reason: from getter */
        public final PageInfo getPageInfo() {
            return this.pageInfo;
        }

        /* renamed from: c, reason: from getter */
        public final int getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            return (((this.items.hashCode() * 31) + Integer.hashCode(this.totalCount)) * 31) + this.pageInfo.hashCode();
        }

        public String toString() {
            return "ItemConnection(items=" + this.items + ", totalCount=" + this.totalCount + ", pageInfo=" + this.pageInfo + ')';
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\"¨\u0006$"}, d2 = {"LSo/d$k;", "", "LSo/d$j;", "itemConnection", "LSo/d$a;", "attribution", "", "LSo/d$g;", "filterOptions", "LSo/d$h;", "groupFilterOptions", "LSo/d$p;", "sortOptions", "<init>", "(LSo/d$j;LSo/d$a;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSo/d$j;", "d", "()LSo/d$j;", "b", "LSo/d$a;", "()LSo/d$a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "e", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$k, reason: from toString */
    public static final /* data */ class OnFilterableProductDisplayResult {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ItemConnection itemConnection;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Attribution1 attribution;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FilterOption> filterOptions;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<GroupFilterOption> groupFilterOptions;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<SortOption> sortOptions;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnFilterableProductDisplayResult)) {
                return false;
            }
            OnFilterableProductDisplayResult onFilterableProductDisplayResult = (OnFilterableProductDisplayResult) other;
            return Intrinsics.e(this.itemConnection, onFilterableProductDisplayResult.itemConnection) && Intrinsics.e(this.attribution, onFilterableProductDisplayResult.attribution) && Intrinsics.e(this.filterOptions, onFilterableProductDisplayResult.filterOptions) && Intrinsics.e(this.groupFilterOptions, onFilterableProductDisplayResult.groupFilterOptions) && Intrinsics.e(this.sortOptions, onFilterableProductDisplayResult.sortOptions);
        }

        public OnFilterableProductDisplayResult(ItemConnection itemConnection, Attribution1 attribution1, List<FilterOption> filterOptions, List<GroupFilterOption> groupFilterOptions, List<SortOption> sortOptions) {
            Intrinsics.j(itemConnection, "itemConnection");
            Intrinsics.j(filterOptions, "filterOptions");
            Intrinsics.j(groupFilterOptions, "groupFilterOptions");
            Intrinsics.j(sortOptions, "sortOptions");
            this.itemConnection = itemConnection;
            this.attribution = attribution1;
            this.filterOptions = filterOptions;
            this.groupFilterOptions = groupFilterOptions;
            this.sortOptions = sortOptions;
        }

        /* renamed from: a, reason: from getter */
        public final Attribution1 getAttribution() {
            return this.attribution;
        }

        public final List<FilterOption> b() {
            return this.filterOptions;
        }

        public final List<GroupFilterOption> c() {
            return this.groupFilterOptions;
        }

        /* renamed from: d, reason: from getter */
        public final ItemConnection getItemConnection() {
            return this.itemConnection;
        }

        public final List<SortOption> e() {
            return this.sortOptions;
        }

        public int hashCode() {
            int iHashCode = this.itemConnection.hashCode() * 31;
            Attribution1 attribution1 = this.attribution;
            return ((((((iHashCode + (attribution1 == null ? 0 : attribution1.hashCode())) * 31) + this.filterOptions.hashCode()) * 31) + this.groupFilterOptions.hashCode()) * 31) + this.sortOptions.hashCode();
        }

        public String toString() {
            return "OnFilterableProductDisplayResult(itemConnection=" + this.itemConnection + ", attribution=" + this.attribution + ", filterOptions=" + this.filterOptions + ", groupFilterOptions=" + this.groupFilterOptions + ", sortOptions=" + this.sortOptions + ')';
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b1\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b3\u00104R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b7\u00104R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b9\u00104R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u00104R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b8\u0010BR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bC\u0010/\u001a\u0004\b@\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bD\u0010/\u001a\u0004\bC\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bE\u0010/\u001a\u0004\bD\u0010%R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bF\u0010/\u001a\u0004\bE\u0010%R\u0017\u0010\u0013\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bG\u0010/\u001a\u0004\bH\u0010%R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bJ\u0010%R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bK\u0010/\u001a\u0004\b5\u0010%R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bH\u0010/\u001a\u0004\b<\u0010%R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bJ\u00102\u001a\u0004\bL\u00104R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\bF\u0010%R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\bK\u0010.R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b9\u0010M\u001a\u0004\b:\u0010NR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bL\u0010O\u001a\u0004\bI\u0010PR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b;\u0010Q\u001a\u0004\b+\u0010RR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b>\u0010S\u001a\u0004\bG\u0010T¨\u0006U"}, d2 = {"LSo/d$l;", "", "averagePoundsPerEach", "", "brandName", "brandDescription", "", "hasMPerks", "isAlcohol", "isCurbsideEligible", "isHomeDeliveryAvailable", "isPrimaryUpc", "isSponsored", "", "mPerksOfferId", "productDescription", "productDetails", "productId", "productName", "upc", "upcTypeName", "descriptiveFeatures", "priceUnit", "isPriceByWeight", "soldByUnit", "unitOfMeasureQuantity", "", "maxOrderQuantity", "LSo/d$s;", "thumbnailImage", "LSo/d$b;", "attribution", "LSo/d$r;", "storeSpecificProductDetails", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Integer;LSo/d$s;LSo/d$b;LSo/d$r;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Ljava/lang/String;", "d", "c", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "e", "t", "u", "g", "v", "h", "x", "i", "Z", "y", "()Z", "j", "Ljava/util/List;", "()Ljava/util/List;", "k", "l", "m", "n", "o", "r", "p", "s", "q", "w", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "LSo/d$s;", "()LSo/d$s;", "LSo/d$b;", "()LSo/d$b;", "LSo/d$r;", "()LSo/d$r;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$l, reason: from toString */
    public static final /* data */ class OnProductExtended {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object averagePoundsPerEach;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String brandName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String brandDescription;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean hasMPerks;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isAlcohol;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isCurbsideEligible;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isHomeDeliveryAvailable;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isPrimaryUpc;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSponsored;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> mPerksOfferId;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productDescription;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productDetails;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productId;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productName;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upc;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upcTypeName;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final String descriptiveFeatures;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceUnit;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isPriceByWeight;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final String soldByUnit;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object unitOfMeasureQuantity;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer maxOrderQuantity;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final ThumbnailImage thumbnailImage;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final Attribution attribution;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final StoreSpecificProductDetails storeSpecificProductDetails;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnProductExtended)) {
                return false;
            }
            OnProductExtended onProductExtended = (OnProductExtended) other;
            return Intrinsics.e(this.averagePoundsPerEach, onProductExtended.averagePoundsPerEach) && Intrinsics.e(this.brandName, onProductExtended.brandName) && Intrinsics.e(this.brandDescription, onProductExtended.brandDescription) && Intrinsics.e(this.hasMPerks, onProductExtended.hasMPerks) && Intrinsics.e(this.isAlcohol, onProductExtended.isAlcohol) && Intrinsics.e(this.isCurbsideEligible, onProductExtended.isCurbsideEligible) && Intrinsics.e(this.isHomeDeliveryAvailable, onProductExtended.isHomeDeliveryAvailable) && Intrinsics.e(this.isPrimaryUpc, onProductExtended.isPrimaryUpc) && this.isSponsored == onProductExtended.isSponsored && Intrinsics.e(this.mPerksOfferId, onProductExtended.mPerksOfferId) && Intrinsics.e(this.productDescription, onProductExtended.productDescription) && Intrinsics.e(this.productDetails, onProductExtended.productDetails) && Intrinsics.e(this.productId, onProductExtended.productId) && Intrinsics.e(this.productName, onProductExtended.productName) && Intrinsics.e(this.upc, onProductExtended.upc) && Intrinsics.e(this.upcTypeName, onProductExtended.upcTypeName) && Intrinsics.e(this.descriptiveFeatures, onProductExtended.descriptiveFeatures) && Intrinsics.e(this.priceUnit, onProductExtended.priceUnit) && Intrinsics.e(this.isPriceByWeight, onProductExtended.isPriceByWeight) && Intrinsics.e(this.soldByUnit, onProductExtended.soldByUnit) && Intrinsics.e(this.unitOfMeasureQuantity, onProductExtended.unitOfMeasureQuantity) && Intrinsics.e(this.maxOrderQuantity, onProductExtended.maxOrderQuantity) && Intrinsics.e(this.thumbnailImage, onProductExtended.thumbnailImage) && Intrinsics.e(this.attribution, onProductExtended.attribution) && Intrinsics.e(this.storeSpecificProductDetails, onProductExtended.storeSpecificProductDetails);
        }

        public OnProductExtended(Object obj, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, boolean z10, List<String> list, String str3, String str4, String str5, String str6, String upc, String str7, String str8, String str9, Boolean bool6, String str10, Object obj2, Integer num, ThumbnailImage thumbnailImage, Attribution attribution, StoreSpecificProductDetails storeSpecificProductDetails) {
            Intrinsics.j(upc, "upc");
            this.averagePoundsPerEach = obj;
            this.brandName = str;
            this.brandDescription = str2;
            this.hasMPerks = bool;
            this.isAlcohol = bool2;
            this.isCurbsideEligible = bool3;
            this.isHomeDeliveryAvailable = bool4;
            this.isPrimaryUpc = bool5;
            this.isSponsored = z10;
            this.mPerksOfferId = list;
            this.productDescription = str3;
            this.productDetails = str4;
            this.productId = str5;
            this.productName = str6;
            this.upc = upc;
            this.upcTypeName = str7;
            this.descriptiveFeatures = str8;
            this.priceUnit = str9;
            this.isPriceByWeight = bool6;
            this.soldByUnit = str10;
            this.unitOfMeasureQuantity = obj2;
            this.maxOrderQuantity = num;
            this.thumbnailImage = thumbnailImage;
            this.attribution = attribution;
            this.storeSpecificProductDetails = storeSpecificProductDetails;
        }

        /* renamed from: a, reason: from getter */
        public final Attribution getAttribution() {
            return this.attribution;
        }

        /* renamed from: b, reason: from getter */
        public final Object getAveragePoundsPerEach() {
            return this.averagePoundsPerEach;
        }

        /* renamed from: c, reason: from getter */
        public final String getBrandDescription() {
            return this.brandDescription;
        }

        /* renamed from: d, reason: from getter */
        public final String getBrandName() {
            return this.brandName;
        }

        /* renamed from: e, reason: from getter */
        public final String getDescriptiveFeatures() {
            return this.descriptiveFeatures;
        }

        /* renamed from: f, reason: from getter */
        public final Boolean getHasMPerks() {
            return this.hasMPerks;
        }

        public final List<String> g() {
            return this.mPerksOfferId;
        }

        /* renamed from: h, reason: from getter */
        public final Integer getMaxOrderQuantity() {
            return this.maxOrderQuantity;
        }

        public int hashCode() {
            Object obj = this.averagePoundsPerEach;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            String str = this.brandName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.brandDescription;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.hasMPerks;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isAlcohol;
            int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isCurbsideEligible;
            int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.isHomeDeliveryAvailable;
            int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.isPrimaryUpc;
            int iHashCode8 = (((iHashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31) + Boolean.hashCode(this.isSponsored)) * 31;
            List<String> list = this.mPerksOfferId;
            int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.productDescription;
            int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.productDetails;
            int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.productId;
            int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.productName;
            int iHashCode13 = (((iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.upc.hashCode()) * 31;
            String str7 = this.upcTypeName;
            int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.descriptiveFeatures;
            int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.priceUnit;
            int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Boolean bool6 = this.isPriceByWeight;
            int iHashCode17 = (iHashCode16 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            String str10 = this.soldByUnit;
            int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Object obj2 = this.unitOfMeasureQuantity;
            int iHashCode19 = (iHashCode18 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Integer num = this.maxOrderQuantity;
            int iHashCode20 = (iHashCode19 + (num == null ? 0 : num.hashCode())) * 31;
            ThumbnailImage thumbnailImage = this.thumbnailImage;
            int iHashCode21 = (iHashCode20 + (thumbnailImage == null ? 0 : thumbnailImage.hashCode())) * 31;
            Attribution attribution = this.attribution;
            int iHashCode22 = (iHashCode21 + (attribution == null ? 0 : attribution.hashCode())) * 31;
            StoreSpecificProductDetails storeSpecificProductDetails = this.storeSpecificProductDetails;
            return iHashCode22 + (storeSpecificProductDetails != null ? storeSpecificProductDetails.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final String getPriceUnit() {
            return this.priceUnit;
        }

        /* renamed from: j, reason: from getter */
        public final String getProductDescription() {
            return this.productDescription;
        }

        /* renamed from: k, reason: from getter */
        public final String getProductDetails() {
            return this.productDetails;
        }

        /* renamed from: l, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        /* renamed from: m, reason: from getter */
        public final String getProductName() {
            return this.productName;
        }

        /* renamed from: n, reason: from getter */
        public final String getSoldByUnit() {
            return this.soldByUnit;
        }

        /* renamed from: o, reason: from getter */
        public final StoreSpecificProductDetails getStoreSpecificProductDetails() {
            return this.storeSpecificProductDetails;
        }

        /* renamed from: p, reason: from getter */
        public final ThumbnailImage getThumbnailImage() {
            return this.thumbnailImage;
        }

        /* renamed from: q, reason: from getter */
        public final Object getUnitOfMeasureQuantity() {
            return this.unitOfMeasureQuantity;
        }

        /* renamed from: r, reason: from getter */
        public final String getUpc() {
            return this.upc;
        }

        /* renamed from: s, reason: from getter */
        public final String getUpcTypeName() {
            return this.upcTypeName;
        }

        /* renamed from: t, reason: from getter */
        public final Boolean getIsAlcohol() {
            return this.isAlcohol;
        }

        public String toString() {
            return "OnProductExtended(averagePoundsPerEach=" + this.averagePoundsPerEach + ", brandName=" + this.brandName + ", brandDescription=" + this.brandDescription + ", hasMPerks=" + this.hasMPerks + ", isAlcohol=" + this.isAlcohol + ", isCurbsideEligible=" + this.isCurbsideEligible + ", isHomeDeliveryAvailable=" + this.isHomeDeliveryAvailable + ", isPrimaryUpc=" + this.isPrimaryUpc + ", isSponsored=" + this.isSponsored + ", mPerksOfferId=" + this.mPerksOfferId + ", productDescription=" + this.productDescription + ", productDetails=" + this.productDetails + ", productId=" + this.productId + ", productName=" + this.productName + ", upc=" + this.upc + ", upcTypeName=" + this.upcTypeName + ", descriptiveFeatures=" + this.descriptiveFeatures + ", priceUnit=" + this.priceUnit + ", isPriceByWeight=" + this.isPriceByWeight + ", soldByUnit=" + this.soldByUnit + ", unitOfMeasureQuantity=" + this.unitOfMeasureQuantity + ", maxOrderQuantity=" + this.maxOrderQuantity + ", thumbnailImage=" + this.thumbnailImage + ", attribution=" + this.attribution + ", storeSpecificProductDetails=" + this.storeSpecificProductDetails + ')';
        }

        /* renamed from: u, reason: from getter */
        public final Boolean getIsCurbsideEligible() {
            return this.isCurbsideEligible;
        }

        /* renamed from: v, reason: from getter */
        public final Boolean getIsHomeDeliveryAvailable() {
            return this.isHomeDeliveryAvailable;
        }

        /* renamed from: w, reason: from getter */
        public final Boolean getIsPriceByWeight() {
            return this.isPriceByWeight;
        }

        /* renamed from: x, reason: from getter */
        public final Boolean getIsPrimaryUpc() {
            return this.isPrimaryUpc;
        }

        /* renamed from: y, reason: from getter */
        public final boolean getIsSponsored() {
            return this.isSponsored;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"LSo/d$m;", "", "", "count", "", "displayName", "status", "value", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "d", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$m, reason: from toString */
    public static final /* data */ class Option {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int count;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String displayName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String status;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return this.count == option.count && Intrinsics.e(this.displayName, option.displayName) && Intrinsics.e(this.status, option.status) && Intrinsics.e(this.value, option.value);
        }

        public Option(int i10, String displayName, String str, String value) {
            Intrinsics.j(displayName, "displayName");
            Intrinsics.j(value, "value");
            this.count = i10;
            this.displayName = displayName;
            this.status = str;
            this.value = value;
        }

        /* renamed from: a, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* renamed from: b, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: c, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* renamed from: d, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.count) * 31) + this.displayName.hashCode()) * 31;
            String str = this.status;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.value.hashCode();
        }

        public String toString() {
            return "Option(count=" + this.count + ", displayName=" + this.displayName + ", status=" + this.status + ", value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"LSo/d$n;", "", "", "hasNextPage", "hasPreviousPage", "", "endCursor", "startCursor", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "c", "Ljava/lang/String;", "d", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$n, reason: from toString */
    public static final /* data */ class PageInfo {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasNextPage;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasPreviousPage;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String endCursor;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String startCursor;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageInfo)) {
                return false;
            }
            PageInfo pageInfo = (PageInfo) other;
            return this.hasNextPage == pageInfo.hasNextPage && this.hasPreviousPage == pageInfo.hasPreviousPage && Intrinsics.e(this.endCursor, pageInfo.endCursor) && Intrinsics.e(this.startCursor, pageInfo.startCursor);
        }

        /* renamed from: a, reason: from getter */
        public final String getEndCursor() {
            return this.endCursor;
        }

        /* renamed from: b, reason: from getter */
        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        /* renamed from: d, reason: from getter */
        public final String getStartCursor() {
            return this.startCursor;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.hasNextPage) * 31) + Boolean.hashCode(this.hasPreviousPage)) * 31;
            String str = this.endCursor;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.startCursor;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "PageInfo(hasNextPage=" + this.hasNextPage + ", hasPreviousPage=" + this.hasPreviousPage + ", endCursor=" + this.endCursor + ", startCursor=" + this.startCursor + ')';
        }

        public PageInfo(boolean z10, boolean z11, String str, String str2) {
            this.hasNextPage = z10;
            this.hasPreviousPage = z11;
            this.endCursor = str;
            this.startCursor = str2;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\bP\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\r\u0012\b\u0010 \u001a\u0004\u0018\u00010\r\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\"\u001a\u0004\u0018\u00010\r\u0012\b\u0010#\u001a\u0004\u0018\u00010\r\u0012\b\u0010$\u001a\u0004\u0018\u00010\r\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010)\u001a\u00020\r\u0012\u0006\u0010*\u001a\u00020\r\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b8\u00107R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b<\u0010;R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b=\u0010;R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b>\u0010;R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u00106\u001a\u0004\b?\u00107R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b@\u0010:\u001a\u0004\b@\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bA\u0010;R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\bB\u0010;R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bC\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bE\u0010;R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bF\u0010:\u001a\u0004\bF\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bG\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bH\u0010:\u001a\u0004\bH\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bI\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bJ\u0010:\u001a\u0004\bJ\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010NR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bU\u0010:\u001a\u0004\bK\u0010;R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bV\u0010D\u001a\u0004\bO\u0010/R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bW\u0010D\u001a\u0004\bQ\u0010/R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bX\u0010:\u001a\u0004\bU\u0010;R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bY\u0010D\u001a\u0004\bV\u0010/R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bZ\u0010D\u001a\u0004\bW\u0010/R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b[\u0010D\u001a\u0004\bX\u0010/R\u0019\u0010 \u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\\\u0010D\u001a\u0004\bY\u0010/R\u0019\u0010!\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b]\u0010:\u001a\u0004\bZ\u0010;R\u0019\u0010\"\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b^\u0010D\u001a\u0004\b[\u0010/R\u0019\u0010#\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b_\u0010D\u001a\u0004\b\\\u0010/R\u0019\u0010$\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b`\u0010D\u001a\u0004\b]\u0010/R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\ba\u00106\u001a\u0004\b^\u00107R\u0019\u0010&\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bb\u0010D\u001a\u0004\b_\u0010/R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010c\u001a\u0004\b`\u00101R\u0019\u0010(\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bd\u0010:\u001a\u0004\ba\u0010;R\u0017\u0010)\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bM\u0010D\u001a\u0004\bb\u0010/R\u0017\u0010*\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bP\u0010D\u001a\u0004\bc\u0010/R\u0019\u0010+\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\bd\u0010;¨\u0006e"}, d2 = {"LSo/d$o;", "", "", "ageLimit", "alcoholAgeLimit", "avgPricingUnitsPerSoldByUnit", "avgSoldByUnitsPerPricingUnit", "basePrice", "basePricePerSoldByUnit", "buyQuantity", "clearancePrice", "clearancePricePerSoldByUnit", "cmPriceEndDate", "", "currency", "customerPrice", "customerPricePerSoldByUnit", "depositValue", "discountValue", "discountValuePerSoldByUnit", "dollarOff", "", "isEligible", "isOnSale", "isPriceDisplayable", "percentageOff", "priceChangeMethod", "priceDescription", "priceEndDate", "priceText", "priceType", "pricingUnit", "productId", "promotionPrice", "restrictedCategoryDescription", "restrictedCategoryName", "savingsDescription", "sellQuantity", "soldByUnit", "storeId", "unitOfMeasureQuantity", "upc", "upcStoreCompositeKey", "updatedAt", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Boolean;ZLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "d", "e", "f", "g", "h", "i", "j", "k", "Ljava/lang/String;", "l", "m", "n", "o", "p", "q", "r", "Ljava/lang/Boolean;", "K", "()Ljava/lang/Boolean;", "s", "L", "t", "Z", "M", "()Z", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$o, reason: from toString */
    public static final /* data */ class Pricing {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pricingUnit;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productId;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object promotionPrice;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
        private final String restrictedCategoryDescription;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
        private final String restrictedCategoryName;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
        private final String savingsDescription;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer sellQuantity;

        /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
        private final String soldByUnit;

        /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
        private final int storeId;

        /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object unitOfMeasureQuantity;

        /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upc;

        /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upcStoreCompositeKey;

        /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object updatedAt;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer ageLimit;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer alcoholAgeLimit;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object avgPricingUnitsPerSoldByUnit;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object avgSoldByUnitsPerPricingUnit;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object basePrice;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object basePricePerSoldByUnit;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer buyQuantity;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object clearancePrice;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object clearancePricePerSoldByUnit;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object cmPriceEndDate;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String currency;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object customerPrice;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object customerPricePerSoldByUnit;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object depositValue;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object discountValue;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object discountValuePerSoldByUnit;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object dollarOff;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isEligible;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean isOnSale;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isPriceDisplayable;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object percentageOff;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceChangeMethod;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceDescription;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object priceEndDate;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceText;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final String priceType;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pricing)) {
                return false;
            }
            Pricing pricing = (Pricing) other;
            return Intrinsics.e(this.ageLimit, pricing.ageLimit) && Intrinsics.e(this.alcoholAgeLimit, pricing.alcoholAgeLimit) && Intrinsics.e(this.avgPricingUnitsPerSoldByUnit, pricing.avgPricingUnitsPerSoldByUnit) && Intrinsics.e(this.avgSoldByUnitsPerPricingUnit, pricing.avgSoldByUnitsPerPricingUnit) && Intrinsics.e(this.basePrice, pricing.basePrice) && Intrinsics.e(this.basePricePerSoldByUnit, pricing.basePricePerSoldByUnit) && Intrinsics.e(this.buyQuantity, pricing.buyQuantity) && Intrinsics.e(this.clearancePrice, pricing.clearancePrice) && Intrinsics.e(this.clearancePricePerSoldByUnit, pricing.clearancePricePerSoldByUnit) && Intrinsics.e(this.cmPriceEndDate, pricing.cmPriceEndDate) && Intrinsics.e(this.currency, pricing.currency) && Intrinsics.e(this.customerPrice, pricing.customerPrice) && Intrinsics.e(this.customerPricePerSoldByUnit, pricing.customerPricePerSoldByUnit) && Intrinsics.e(this.depositValue, pricing.depositValue) && Intrinsics.e(this.discountValue, pricing.discountValue) && Intrinsics.e(this.discountValuePerSoldByUnit, pricing.discountValuePerSoldByUnit) && Intrinsics.e(this.dollarOff, pricing.dollarOff) && Intrinsics.e(this.isEligible, pricing.isEligible) && Intrinsics.e(this.isOnSale, pricing.isOnSale) && this.isPriceDisplayable == pricing.isPriceDisplayable && Intrinsics.e(this.percentageOff, pricing.percentageOff) && Intrinsics.e(this.priceChangeMethod, pricing.priceChangeMethod) && Intrinsics.e(this.priceDescription, pricing.priceDescription) && Intrinsics.e(this.priceEndDate, pricing.priceEndDate) && Intrinsics.e(this.priceText, pricing.priceText) && Intrinsics.e(this.priceType, pricing.priceType) && Intrinsics.e(this.pricingUnit, pricing.pricingUnit) && Intrinsics.e(this.productId, pricing.productId) && Intrinsics.e(this.promotionPrice, pricing.promotionPrice) && Intrinsics.e(this.restrictedCategoryDescription, pricing.restrictedCategoryDescription) && Intrinsics.e(this.restrictedCategoryName, pricing.restrictedCategoryName) && Intrinsics.e(this.savingsDescription, pricing.savingsDescription) && Intrinsics.e(this.sellQuantity, pricing.sellQuantity) && Intrinsics.e(this.soldByUnit, pricing.soldByUnit) && this.storeId == pricing.storeId && Intrinsics.e(this.unitOfMeasureQuantity, pricing.unitOfMeasureQuantity) && Intrinsics.e(this.upc, pricing.upc) && Intrinsics.e(this.upcStoreCompositeKey, pricing.upcStoreCompositeKey) && Intrinsics.e(this.updatedAt, pricing.updatedAt);
        }

        public Pricing(Integer num, Integer num2, Object obj, Object obj2, Object obj3, Object obj4, Integer num3, Object obj5, Object obj6, Object obj7, String str, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Boolean bool, Boolean bool2, boolean z10, Object obj14, String str2, String str3, Object obj15, String str4, String str5, String str6, String str7, Object obj16, String str8, String str9, String str10, Integer num4, String str11, int i10, Object obj17, String upc, String upcStoreCompositeKey, Object obj18) {
            Intrinsics.j(upc, "upc");
            Intrinsics.j(upcStoreCompositeKey, "upcStoreCompositeKey");
            this.ageLimit = num;
            this.alcoholAgeLimit = num2;
            this.avgPricingUnitsPerSoldByUnit = obj;
            this.avgSoldByUnitsPerPricingUnit = obj2;
            this.basePrice = obj3;
            this.basePricePerSoldByUnit = obj4;
            this.buyQuantity = num3;
            this.clearancePrice = obj5;
            this.clearancePricePerSoldByUnit = obj6;
            this.cmPriceEndDate = obj7;
            this.currency = str;
            this.customerPrice = obj8;
            this.customerPricePerSoldByUnit = obj9;
            this.depositValue = obj10;
            this.discountValue = obj11;
            this.discountValuePerSoldByUnit = obj12;
            this.dollarOff = obj13;
            this.isEligible = bool;
            this.isOnSale = bool2;
            this.isPriceDisplayable = z10;
            this.percentageOff = obj14;
            this.priceChangeMethod = str2;
            this.priceDescription = str3;
            this.priceEndDate = obj15;
            this.priceText = str4;
            this.priceType = str5;
            this.pricingUnit = str6;
            this.productId = str7;
            this.promotionPrice = obj16;
            this.restrictedCategoryDescription = str8;
            this.restrictedCategoryName = str9;
            this.savingsDescription = str10;
            this.sellQuantity = num4;
            this.soldByUnit = str11;
            this.storeId = i10;
            this.unitOfMeasureQuantity = obj17;
            this.upc = upc;
            this.upcStoreCompositeKey = upcStoreCompositeKey;
            this.updatedAt = obj18;
        }

        /* renamed from: A, reason: from getter */
        public final String getRestrictedCategoryDescription() {
            return this.restrictedCategoryDescription;
        }

        /* renamed from: B, reason: from getter */
        public final String getRestrictedCategoryName() {
            return this.restrictedCategoryName;
        }

        /* renamed from: C, reason: from getter */
        public final String getSavingsDescription() {
            return this.savingsDescription;
        }

        /* renamed from: D, reason: from getter */
        public final Integer getSellQuantity() {
            return this.sellQuantity;
        }

        /* renamed from: E, reason: from getter */
        public final String getSoldByUnit() {
            return this.soldByUnit;
        }

        /* renamed from: F, reason: from getter */
        public final int getStoreId() {
            return this.storeId;
        }

        /* renamed from: G, reason: from getter */
        public final Object getUnitOfMeasureQuantity() {
            return this.unitOfMeasureQuantity;
        }

        /* renamed from: H, reason: from getter */
        public final String getUpc() {
            return this.upc;
        }

        /* renamed from: I, reason: from getter */
        public final String getUpcStoreCompositeKey() {
            return this.upcStoreCompositeKey;
        }

        /* renamed from: J, reason: from getter */
        public final Object getUpdatedAt() {
            return this.updatedAt;
        }

        /* renamed from: K, reason: from getter */
        public final Boolean getIsEligible() {
            return this.isEligible;
        }

        /* renamed from: L, reason: from getter */
        public final Boolean getIsOnSale() {
            return this.isOnSale;
        }

        /* renamed from: M, reason: from getter */
        public final boolean getIsPriceDisplayable() {
            return this.isPriceDisplayable;
        }

        /* renamed from: a, reason: from getter */
        public final Integer getAgeLimit() {
            return this.ageLimit;
        }

        /* renamed from: b, reason: from getter */
        public final Integer getAlcoholAgeLimit() {
            return this.alcoholAgeLimit;
        }

        /* renamed from: c, reason: from getter */
        public final Object getAvgPricingUnitsPerSoldByUnit() {
            return this.avgPricingUnitsPerSoldByUnit;
        }

        /* renamed from: d, reason: from getter */
        public final Object getAvgSoldByUnitsPerPricingUnit() {
            return this.avgSoldByUnitsPerPricingUnit;
        }

        /* renamed from: e, reason: from getter */
        public final Object getBasePrice() {
            return this.basePrice;
        }

        /* renamed from: f, reason: from getter */
        public final Object getBasePricePerSoldByUnit() {
            return this.basePricePerSoldByUnit;
        }

        /* renamed from: g, reason: from getter */
        public final Integer getBuyQuantity() {
            return this.buyQuantity;
        }

        /* renamed from: h, reason: from getter */
        public final Object getClearancePrice() {
            return this.clearancePrice;
        }

        public int hashCode() {
            Integer num = this.ageLimit;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.alcoholAgeLimit;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Object obj = this.avgPricingUnitsPerSoldByUnit;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.avgSoldByUnitsPerPricingUnit;
            int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Object obj3 = this.basePrice;
            int iHashCode5 = (iHashCode4 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
            Object obj4 = this.basePricePerSoldByUnit;
            int iHashCode6 = (iHashCode5 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
            Integer num3 = this.buyQuantity;
            int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Object obj5 = this.clearancePrice;
            int iHashCode8 = (iHashCode7 + (obj5 == null ? 0 : obj5.hashCode())) * 31;
            Object obj6 = this.clearancePricePerSoldByUnit;
            int iHashCode9 = (iHashCode8 + (obj6 == null ? 0 : obj6.hashCode())) * 31;
            Object obj7 = this.cmPriceEndDate;
            int iHashCode10 = (iHashCode9 + (obj7 == null ? 0 : obj7.hashCode())) * 31;
            String str = this.currency;
            int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
            Object obj8 = this.customerPrice;
            int iHashCode12 = (iHashCode11 + (obj8 == null ? 0 : obj8.hashCode())) * 31;
            Object obj9 = this.customerPricePerSoldByUnit;
            int iHashCode13 = (iHashCode12 + (obj9 == null ? 0 : obj9.hashCode())) * 31;
            Object obj10 = this.depositValue;
            int iHashCode14 = (iHashCode13 + (obj10 == null ? 0 : obj10.hashCode())) * 31;
            Object obj11 = this.discountValue;
            int iHashCode15 = (iHashCode14 + (obj11 == null ? 0 : obj11.hashCode())) * 31;
            Object obj12 = this.discountValuePerSoldByUnit;
            int iHashCode16 = (iHashCode15 + (obj12 == null ? 0 : obj12.hashCode())) * 31;
            Object obj13 = this.dollarOff;
            int iHashCode17 = (iHashCode16 + (obj13 == null ? 0 : obj13.hashCode())) * 31;
            Boolean bool = this.isEligible;
            int iHashCode18 = (iHashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isOnSale;
            int iHashCode19 = (((iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + Boolean.hashCode(this.isPriceDisplayable)) * 31;
            Object obj14 = this.percentageOff;
            int iHashCode20 = (iHashCode19 + (obj14 == null ? 0 : obj14.hashCode())) * 31;
            String str2 = this.priceChangeMethod;
            int iHashCode21 = (iHashCode20 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.priceDescription;
            int iHashCode22 = (iHashCode21 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Object obj15 = this.priceEndDate;
            int iHashCode23 = (iHashCode22 + (obj15 == null ? 0 : obj15.hashCode())) * 31;
            String str4 = this.priceText;
            int iHashCode24 = (iHashCode23 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.priceType;
            int iHashCode25 = (iHashCode24 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.pricingUnit;
            int iHashCode26 = (iHashCode25 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.productId;
            int iHashCode27 = (iHashCode26 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Object obj16 = this.promotionPrice;
            int iHashCode28 = (iHashCode27 + (obj16 == null ? 0 : obj16.hashCode())) * 31;
            String str8 = this.restrictedCategoryDescription;
            int iHashCode29 = (iHashCode28 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.restrictedCategoryName;
            int iHashCode30 = (iHashCode29 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.savingsDescription;
            int iHashCode31 = (iHashCode30 + (str10 == null ? 0 : str10.hashCode())) * 31;
            Integer num4 = this.sellQuantity;
            int iHashCode32 = (iHashCode31 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str11 = this.soldByUnit;
            int iHashCode33 = (((iHashCode32 + (str11 == null ? 0 : str11.hashCode())) * 31) + Integer.hashCode(this.storeId)) * 31;
            Object obj17 = this.unitOfMeasureQuantity;
            int iHashCode34 = (((((iHashCode33 + (obj17 == null ? 0 : obj17.hashCode())) * 31) + this.upc.hashCode()) * 31) + this.upcStoreCompositeKey.hashCode()) * 31;
            Object obj18 = this.updatedAt;
            return iHashCode34 + (obj18 != null ? obj18.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final Object getClearancePricePerSoldByUnit() {
            return this.clearancePricePerSoldByUnit;
        }

        /* renamed from: j, reason: from getter */
        public final Object getCmPriceEndDate() {
            return this.cmPriceEndDate;
        }

        /* renamed from: k, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* renamed from: l, reason: from getter */
        public final Object getCustomerPrice() {
            return this.customerPrice;
        }

        /* renamed from: m, reason: from getter */
        public final Object getCustomerPricePerSoldByUnit() {
            return this.customerPricePerSoldByUnit;
        }

        /* renamed from: n, reason: from getter */
        public final Object getDepositValue() {
            return this.depositValue;
        }

        /* renamed from: o, reason: from getter */
        public final Object getDiscountValue() {
            return this.discountValue;
        }

        /* renamed from: p, reason: from getter */
        public final Object getDiscountValuePerSoldByUnit() {
            return this.discountValuePerSoldByUnit;
        }

        /* renamed from: q, reason: from getter */
        public final Object getDollarOff() {
            return this.dollarOff;
        }

        /* renamed from: r, reason: from getter */
        public final Object getPercentageOff() {
            return this.percentageOff;
        }

        /* renamed from: s, reason: from getter */
        public final String getPriceChangeMethod() {
            return this.priceChangeMethod;
        }

        /* renamed from: t, reason: from getter */
        public final String getPriceDescription() {
            return this.priceDescription;
        }

        public String toString() {
            return "Pricing(ageLimit=" + this.ageLimit + ", alcoholAgeLimit=" + this.alcoholAgeLimit + ", avgPricingUnitsPerSoldByUnit=" + this.avgPricingUnitsPerSoldByUnit + ", avgSoldByUnitsPerPricingUnit=" + this.avgSoldByUnitsPerPricingUnit + ", basePrice=" + this.basePrice + ", basePricePerSoldByUnit=" + this.basePricePerSoldByUnit + ", buyQuantity=" + this.buyQuantity + ", clearancePrice=" + this.clearancePrice + ", clearancePricePerSoldByUnit=" + this.clearancePricePerSoldByUnit + ", cmPriceEndDate=" + this.cmPriceEndDate + ", currency=" + this.currency + ", customerPrice=" + this.customerPrice + ", customerPricePerSoldByUnit=" + this.customerPricePerSoldByUnit + ", depositValue=" + this.depositValue + ", discountValue=" + this.discountValue + ", discountValuePerSoldByUnit=" + this.discountValuePerSoldByUnit + ", dollarOff=" + this.dollarOff + ", isEligible=" + this.isEligible + ", isOnSale=" + this.isOnSale + ", isPriceDisplayable=" + this.isPriceDisplayable + ", percentageOff=" + this.percentageOff + ", priceChangeMethod=" + this.priceChangeMethod + ", priceDescription=" + this.priceDescription + ", priceEndDate=" + this.priceEndDate + ", priceText=" + this.priceText + ", priceType=" + this.priceType + ", pricingUnit=" + this.pricingUnit + ", productId=" + this.productId + ", promotionPrice=" + this.promotionPrice + ", restrictedCategoryDescription=" + this.restrictedCategoryDescription + ", restrictedCategoryName=" + this.restrictedCategoryName + ", savingsDescription=" + this.savingsDescription + ", sellQuantity=" + this.sellQuantity + ", soldByUnit=" + this.soldByUnit + ", storeId=" + this.storeId + ", unitOfMeasureQuantity=" + this.unitOfMeasureQuantity + ", upc=" + this.upc + ", upcStoreCompositeKey=" + this.upcStoreCompositeKey + ", updatedAt=" + this.updatedAt + ')';
        }

        /* renamed from: u, reason: from getter */
        public final Object getPriceEndDate() {
            return this.priceEndDate;
        }

        /* renamed from: v, reason: from getter */
        public final String getPriceText() {
            return this.priceText;
        }

        /* renamed from: w, reason: from getter */
        public final String getPriceType() {
            return this.priceType;
        }

        /* renamed from: x, reason: from getter */
        public final String getPricingUnit() {
            return this.pricingUnit;
        }

        /* renamed from: y, reason: from getter */
        public final String getProductId() {
            return this.productId;
        }

        /* renamed from: z, reason: from getter */
        public final Object getPromotionPrice() {
            return this.promotionPrice;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"LSo/d$p;", "", "", "displayName", "sortBy", "sortOrder", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$p, reason: from toString */
    public static final /* data */ class SortOption {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String displayName;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sortBy;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sortOrder;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String status;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SortOption)) {
                return false;
            }
            SortOption sortOption = (SortOption) other;
            return Intrinsics.e(this.displayName, sortOption.displayName) && Intrinsics.e(this.sortBy, sortOption.sortBy) && Intrinsics.e(this.sortOrder, sortOption.sortOrder) && Intrinsics.e(this.status, sortOption.status);
        }

        public SortOption(String displayName, String sortBy, String sortOrder, String str) {
            Intrinsics.j(displayName, "displayName");
            Intrinsics.j(sortBy, "sortBy");
            Intrinsics.j(sortOrder, "sortOrder");
            this.displayName = displayName;
            this.sortBy = sortBy;
            this.sortOrder = sortOrder;
            this.status = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: b, reason: from getter */
        public final String getSortBy() {
            return this.sortBy;
        }

        /* renamed from: c, reason: from getter */
        public final String getSortOrder() {
            return this.sortOrder;
        }

        /* renamed from: d, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = ((((this.displayName.hashCode() * 31) + this.sortBy.hashCode()) * 31) + this.sortOrder.hashCode()) * 31;
            String str = this.status;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SortOption(displayName=" + this.displayName + ", sortBy=" + this.sortBy + ", sortOrder=" + this.sortOrder + ", status=" + this.status + ')';
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"LSo/d$q;", "", "", "ilcPrimary", "ilcs", "stockStatus", "", "storeId", "upc", "upcStoreCompositeKey", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "I", "e", "f", "g", "Ljava/lang/Object;", "()Ljava/lang/Object;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$q, reason: from toString */
    public static final /* data */ class Stock {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ilcPrimary;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String ilcs;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stockStatus;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int storeId;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upc;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upcStoreCompositeKey;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Object updatedAt;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stock)) {
                return false;
            }
            Stock stock = (Stock) other;
            return Intrinsics.e(this.ilcPrimary, stock.ilcPrimary) && Intrinsics.e(this.ilcs, stock.ilcs) && Intrinsics.e(this.stockStatus, stock.stockStatus) && this.storeId == stock.storeId && Intrinsics.e(this.upc, stock.upc) && Intrinsics.e(this.upcStoreCompositeKey, stock.upcStoreCompositeKey) && Intrinsics.e(this.updatedAt, stock.updatedAt);
        }

        public Stock(String str, String str2, String str3, int i10, String upc, String upcStoreCompositeKey, Object obj) {
            Intrinsics.j(upc, "upc");
            Intrinsics.j(upcStoreCompositeKey, "upcStoreCompositeKey");
            this.ilcPrimary = str;
            this.ilcs = str2;
            this.stockStatus = str3;
            this.storeId = i10;
            this.upc = upc;
            this.upcStoreCompositeKey = upcStoreCompositeKey;
            this.updatedAt = obj;
        }

        /* renamed from: a, reason: from getter */
        public final String getIlcPrimary() {
            return this.ilcPrimary;
        }

        /* renamed from: b, reason: from getter */
        public final String getIlcs() {
            return this.ilcs;
        }

        /* renamed from: c, reason: from getter */
        public final String getStockStatus() {
            return this.stockStatus;
        }

        /* renamed from: d, reason: from getter */
        public final int getStoreId() {
            return this.storeId;
        }

        /* renamed from: e, reason: from getter */
        public final String getUpc() {
            return this.upc;
        }

        /* renamed from: f, reason: from getter */
        public final String getUpcStoreCompositeKey() {
            return this.upcStoreCompositeKey;
        }

        /* renamed from: g, reason: from getter */
        public final Object getUpdatedAt() {
            return this.updatedAt;
        }

        public int hashCode() {
            String str = this.ilcPrimary;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.ilcs;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.stockStatus;
            int iHashCode3 = (((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.storeId)) * 31) + this.upc.hashCode()) * 31) + this.upcStoreCompositeKey.hashCode()) * 31;
            Object obj = this.updatedAt;
            return iHashCode3 + (obj != null ? obj.hashCode() : 0);
        }

        public String toString() {
            return "Stock(ilcPrimary=" + this.ilcPrimary + ", ilcs=" + this.ilcs + ", stockStatus=" + this.stockStatus + ", storeId=" + this.storeId + ", upc=" + this.upc + ", upcStoreCompositeKey=" + this.upcStoreCompositeKey + ", updatedAt=" + this.updatedAt + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LSo/d$r;", "", "LSo/d$o;", "pricing", "LSo/d$q;", "stock", "<init>", "(LSo/d$o;LSo/d$q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSo/d$o;", "()LSo/d$o;", "b", "LSo/d$q;", "()LSo/d$q;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$r, reason: from toString */
    public static final /* data */ class StoreSpecificProductDetails {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pricing pricing;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Stock stock;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StoreSpecificProductDetails)) {
                return false;
            }
            StoreSpecificProductDetails storeSpecificProductDetails = (StoreSpecificProductDetails) other;
            return Intrinsics.e(this.pricing, storeSpecificProductDetails.pricing) && Intrinsics.e(this.stock, storeSpecificProductDetails.stock);
        }

        /* renamed from: a, reason: from getter */
        public final Pricing getPricing() {
            return this.pricing;
        }

        /* renamed from: b, reason: from getter */
        public final Stock getStock() {
            return this.stock;
        }

        public int hashCode() {
            Pricing pricing = this.pricing;
            int iHashCode = (pricing == null ? 0 : pricing.hashCode()) * 31;
            Stock stock = this.stock;
            return iHashCode + (stock != null ? stock.hashCode() : 0);
        }

        public String toString() {
            return "StoreSpecificProductDetails(pricing=" + this.pricing + ", stock=" + this.stock + ')';
        }

        public StoreSpecificProductDetails(Pricing pricing, Stock stock) {
            this.pricing = pricing;
            this.stock = stock;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"LSo/d$s;", "", "", "altText", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: So.d$s, reason: from toString */
    public static final /* data */ class ThumbnailImage {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String altText;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThumbnailImage)) {
                return false;
            }
            ThumbnailImage thumbnailImage = (ThumbnailImage) other;
            return Intrinsics.e(this.altText, thumbnailImage.altText) && Intrinsics.e(this.url, thumbnailImage.url);
        }

        /* renamed from: a, reason: from getter */
        public final String getAltText() {
            return this.altText;
        }

        /* renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.altText;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.url;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "ThumbnailImage(altText=" + this.altText + ", url=" + this.url + ')';
        }

        public ThumbnailImage(String str, String str2) {
            this.altText = str;
            this.url = str2;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductCollectionQuery)) {
            return false;
        }
        ProductCollectionQuery productCollectionQuery = (ProductCollectionQuery) other;
        return Intrinsics.e(this.collectionId, productCollectionQuery.collectionId) && this.storeId == productCollectionQuery.storeId && this.first == productCollectionQuery.first && Intrinsics.e(this.after, productCollectionQuery.after) && Intrinsics.e(this.filters, productCollectionQuery.filters) && Intrinsics.e(this.sort, productCollectionQuery.sort) && Intrinsics.e(this.context, productCollectionQuery.context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductCollectionQuery(String collectionId, int i10, int i11, String after, AbstractC18169C<? extends List<ProductFilterInput>> filters, AbstractC18169C<ProductSortInput> sort, ProductQueryContextInput context) {
        Intrinsics.j(collectionId, "collectionId");
        Intrinsics.j(after, "after");
        Intrinsics.j(filters, "filters");
        Intrinsics.j(sort, "sort");
        Intrinsics.j(context, "context");
        this.collectionId = collectionId;
        this.storeId = i10;
        this.first = i11;
        this.after = after;
        this.filters = filters;
        this.sort = sort;
        this.context = context;
    }

    @Override // y6.t
    public InterfaceC18173a<Data> a() {
        return C18174b.d(C5277v.f35269a, false, 1, null);
    }

    @Override // y6.InterfaceC18167A
    public String b() {
        return "420b192819db18b62edbfb69e540cd7bbc6a4c19d52757f888e48d24248a39a0";
    }

    @Override // y6.InterfaceC18167A
    public String c() {
        return INSTANCE.a();
    }

    @Override // y6.t
    public void d(C6.g writer, p customScalarAdapters, boolean withDefaultValues) throws IOException {
        Intrinsics.j(writer, "writer");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        J.f35141a.a(writer, this, customScalarAdapters, withDefaultValues);
    }

    /* renamed from: e, reason: from getter */
    public final String getAfter() {
        return this.after;
    }

    /* renamed from: f, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
    }

    /* renamed from: g, reason: from getter */
    public final ProductQueryContextInput getContext() {
        return this.context;
    }

    public final AbstractC18169C<List<ProductFilterInput>> h() {
        return this.filters;
    }

    public int hashCode() {
        return (((((((((((this.collectionId.hashCode() * 31) + Integer.hashCode(this.storeId)) * 31) + Integer.hashCode(this.first)) * 31) + this.after.hashCode()) * 31) + this.filters.hashCode()) * 31) + this.sort.hashCode()) * 31) + this.context.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final int getFirst() {
        return this.first;
    }

    public final AbstractC18169C<ProductSortInput> j() {
        return this.sort;
    }

    /* renamed from: k, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    @Override // y6.InterfaceC18167A
    public String name() {
        return "ProductCollectionQuery";
    }

    public String toString() {
        return "ProductCollectionQuery(collectionId=" + this.collectionId + ", storeId=" + this.storeId + ", first=" + this.first + ", after=" + this.after + ", filters=" + this.filters + ", sort=" + this.sort + ", context=" + this.context + ')';
    }
}
