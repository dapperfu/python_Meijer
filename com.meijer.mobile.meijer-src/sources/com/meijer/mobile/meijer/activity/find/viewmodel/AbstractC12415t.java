package com.meijer.mobile.meijer.activity.find.viewmodel;

import Co.ProductFullDetails;
import Qo.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0012\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0012\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "", "<init>", "()V", "c", "b", "m", "g", "o", "r", "j", "h", "f", "e", "i", "p", "l", "n", "d", "a", "q", "k", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$i;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$j;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$k;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$l;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$m;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$n;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$o;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$p;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$q;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$r;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC12415t {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$a;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "", "searchTerm", "originalQuery", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$a, reason: from toString */
    public static final /* data */ class AutoFillSearchAction extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String searchTerm;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String originalQuery;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoFillSearchAction)) {
                return false;
            }
            AutoFillSearchAction autoFillSearchAction = (AutoFillSearchAction) other;
            return Intrinsics.e(this.searchTerm, autoFillSearchAction.searchTerm) && Intrinsics.e(this.originalQuery, autoFillSearchAction.originalQuery);
        }

        public int hashCode() {
            return (this.searchTerm.hashCode() * 31) + this.originalQuery.hashCode();
        }

        public String toString() {
            return "AutoFillSearchAction(searchTerm=" + this.searchTerm + ", originalQuery=" + this.originalQuery + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoFillSearchAction(String searchTerm, String originalQuery) {
            super(null);
            Intrinsics.j(searchTerm, "searchTerm");
            Intrinsics.j(originalQuery, "originalQuery");
            this.searchTerm = searchTerm;
            this.originalQuery = originalQuery;
        }

        /* renamed from: a, reason: from getter */
        public final String getOriginalQuery() {
            return this.originalQuery;
        }

        /* renamed from: b, reason: from getter */
        public final String getSearchTerm() {
            return this.searchTerm;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$b;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$b */
    public static final /* data */ class b extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name */
        public static final b f109851a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 2104622504;
        }

        public String toString() {
            return "ClearRecentSearchesAction";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$c;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$c */
    public static final /* data */ class c extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name */
        public static final c f109852a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -74107801;
        }

        public String toString() {
            return "ClearSearchFieldAction";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$d;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "", "originalTerm", "searchTerm", "", "isScannedUpc", "isSuggestion", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$d, reason: from toString */
    public static final /* data */ class CompleteSearchAction extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String originalTerm;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String searchTerm;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isScannedUpc;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSuggestion;

        public /* synthetic */ CompleteSearchAction(String str, String str2, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? str : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CompleteSearchAction)) {
                return false;
            }
            CompleteSearchAction completeSearchAction = (CompleteSearchAction) other;
            return Intrinsics.e(this.originalTerm, completeSearchAction.originalTerm) && Intrinsics.e(this.searchTerm, completeSearchAction.searchTerm) && this.isScannedUpc == completeSearchAction.isScannedUpc && this.isSuggestion == completeSearchAction.isSuggestion;
        }

        public int hashCode() {
            return (((((this.originalTerm.hashCode() * 31) + this.searchTerm.hashCode()) * 31) + Boolean.hashCode(this.isScannedUpc)) * 31) + Boolean.hashCode(this.isSuggestion);
        }

        public String toString() {
            return "CompleteSearchAction(originalTerm=" + this.originalTerm + ", searchTerm=" + this.searchTerm + ", isScannedUpc=" + this.isScannedUpc + ", isSuggestion=" + this.isSuggestion + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CompleteSearchAction(String originalTerm, String searchTerm, boolean z10, boolean z11) {
            super(null);
            Intrinsics.j(originalTerm, "originalTerm");
            Intrinsics.j(searchTerm, "searchTerm");
            this.originalTerm = originalTerm;
            this.searchTerm = searchTerm;
            this.isScannedUpc = z10;
            this.isSuggestion = z11;
        }

        /* renamed from: a, reason: from getter */
        public final String getOriginalTerm() {
            return this.originalTerm;
        }

        /* renamed from: b, reason: from getter */
        public final String getSearchTerm() {
            return this.searchTerm;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsScannedUpc() {
            return this.isScannedUpc;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsSuggestion() {
            return this.isSuggestion;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$e;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "", "deeplink", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDeeplink", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$e, reason: from toString */
    public static final /* data */ class DepartmentItemClicked extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deeplink;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DepartmentItemClicked)) {
                return false;
            }
            DepartmentItemClicked departmentItemClicked = (DepartmentItemClicked) other;
            return Intrinsics.e(this.deeplink, departmentItemClicked.deeplink) && Intrinsics.e(this.name, departmentItemClicked.name);
        }

        public int hashCode() {
            return (this.deeplink.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "DepartmentItemClicked(deeplink=" + this.deeplink + ", name=" + this.name + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepartmentItemClicked(String deeplink, String name) {
            super(null);
            Intrinsics.j(deeplink, "deeplink");
            Intrinsics.j(name, "name");
            this.deeplink = deeplink;
            this.name = name;
        }

        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$f;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$f */
    public static final /* data */ class f extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name */
        public static final f f109859a = new f();

        private f() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return -339457612;
        }

        public String toString() {
            return "DepartmentsListClicked";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$g;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$g */
    public static final /* data */ class g extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name */
        public static final g f109860a = new g();

        private g() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof g);
        }

        public int hashCode() {
            return -661345944;
        }

        public String toString() {
            return "ExitSearchAction";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$h;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$h */
    public static final /* data */ class h extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name */
        public static final h f109861a = new h();

        private h() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof h);
        }

        public int hashCode() {
            return 949227507;
        }

        public String toString() {
            return "FetchCarouselDepartments";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$i;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$i */
    public static final /* data */ class i extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name */
        public static final i f109862a = new i();

        private i() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof i);
        }

        public int hashCode() {
            return 2051653489;
        }

        public String toString() {
            return "FetchCarouselRecommendedProducts";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$j;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$j */
    public static final /* data */ class j extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name */
        public static final j f109863a = new j();

        private j() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof j);
        }

        public int hashCode() {
            return 255286737;
        }

        public String toString() {
            return "FilterAndSort";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$k;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "Lkotlin/Function1;", "LQo/l$k;", "", "collector", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$k, reason: from toString */
    public static final /* data */ class FilterAndSortCollectorForSharedFlow extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Function1<l.k, Unit> collector;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FilterAndSortCollectorForSharedFlow) && Intrinsics.e(this.collector, ((FilterAndSortCollectorForSharedFlow) other).collector);
        }

        public int hashCode() {
            return this.collector.hashCode();
        }

        public String toString() {
            return "FilterAndSortCollectorForSharedFlow(collector=" + this.collector + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FilterAndSortCollectorForSharedFlow(Function1<? super l.k, Unit> collector) {
            super(null);
            Intrinsics.j(collector, "collector");
            this.collector = collector;
        }

        public final Function1<l.k, Unit> a() {
            return this.collector;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$l;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "", "uriString", "carouselTitle", "", "isFromSeeMoreItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$l, reason: from toString */
    public static final /* data */ class PersonalizedProductListClicked extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String uriString;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String carouselTitle;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFromSeeMoreItems;

        public PersonalizedProductListClicked(String str, String str2, boolean z10) {
            super(null);
            this.uriString = str;
            this.carouselTitle = str2;
            this.isFromSeeMoreItems = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PersonalizedProductListClicked)) {
                return false;
            }
            PersonalizedProductListClicked personalizedProductListClicked = (PersonalizedProductListClicked) other;
            return Intrinsics.e(this.uriString, personalizedProductListClicked.uriString) && Intrinsics.e(this.carouselTitle, personalizedProductListClicked.carouselTitle) && this.isFromSeeMoreItems == personalizedProductListClicked.isFromSeeMoreItems;
        }

        public int hashCode() {
            String str = this.uriString;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.carouselTitle;
            return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isFromSeeMoreItems);
        }

        public String toString() {
            return "PersonalizedProductListClicked(uriString=" + this.uriString + ", carouselTitle=" + this.carouselTitle + ", isFromSeeMoreItems=" + this.isFromSeeMoreItems + ')';
        }

        /* renamed from: a, reason: from getter */
        public final String getCarouselTitle() {
            return this.carouselTitle;
        }

        /* renamed from: b, reason: from getter */
        public final String getUriString() {
            return this.uriString;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsFromSeeMoreItems() {
            return this.isFromSeeMoreItems;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$m;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$m */
    public static final /* data */ class m extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name */
        public static final m f109868a = new m();

        private m() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof m);
        }

        public int hashCode() {
            return 785321389;
        }

        public String toString() {
            return "ScanBarcodeAction";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$n;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "", "searchTerm", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$n, reason: from toString */
    public static final /* data */ class SearchStartedAction extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String searchTerm;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SearchStartedAction) && Intrinsics.e(this.searchTerm, ((SearchStartedAction) other).searchTerm);
        }

        public int hashCode() {
            return this.searchTerm.hashCode();
        }

        public String toString() {
            return "SearchStartedAction(searchTerm=" + this.searchTerm + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchStartedAction(String searchTerm) {
            super(null);
            Intrinsics.j(searchTerm, "searchTerm");
            this.searchTerm = searchTerm;
        }

        /* renamed from: a, reason: from getter */
        public final String getSearchTerm() {
            return this.searchTerm;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$o;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$o */
    public static final /* data */ class o extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name */
        public static final o f109870a = new o();

        private o() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof o);
        }

        public int hashCode() {
            return 634206077;
        }

        public String toString() {
            return "ToCartAction";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$p;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "LCo/h;", "product", "", "quantityToUpdate", "<init>", "(LCo/h;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "D", "()D", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$p, reason: from toString */
    public static final /* data */ class UpdateEntryAction extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails product;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double quantityToUpdate;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateEntryAction)) {
                return false;
            }
            UpdateEntryAction updateEntryAction = (UpdateEntryAction) other;
            return Intrinsics.e(this.product, updateEntryAction.product) && Double.compare(this.quantityToUpdate, updateEntryAction.quantityToUpdate) == 0;
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + Double.hashCode(this.quantityToUpdate);
        }

        public String toString() {
            return "UpdateEntryAction(product=" + this.product + ", quantityToUpdate=" + this.quantityToUpdate + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateEntryAction(ProductFullDetails product, double d10) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
            this.quantityToUpdate = d10;
        }

        /* renamed from: a, reason: from getter */
        public final ProductFullDetails getProduct() {
            return this.product;
        }

        /* renamed from: b, reason: from getter */
        public final double getQuantityToUpdate() {
            return this.quantityToUpdate;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$q;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "LQo/l$k;", "query", "", "resetDeeplinkFacet", "<init>", "(LQo/l$k;Z)V", "a", "(LQo/l$k;Z)Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$q;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "LQo/l$k;", "c", "()LQo/l$k;", "b", "Z", "d", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$q, reason: from toString */
    public static final /* data */ class UpdateFacetBuffer extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l.k query;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean resetDeeplinkFacet;

        public /* synthetic */ UpdateFacetBuffer(l.k kVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(kVar, (i10 & 2) != 0 ? false : z10);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateFacetBuffer)) {
                return false;
            }
            UpdateFacetBuffer updateFacetBuffer = (UpdateFacetBuffer) other;
            return Intrinsics.e(this.query, updateFacetBuffer.query) && this.resetDeeplinkFacet == updateFacetBuffer.resetDeeplinkFacet;
        }

        public int hashCode() {
            return (this.query.hashCode() * 31) + Boolean.hashCode(this.resetDeeplinkFacet);
        }

        public String toString() {
            return "UpdateFacetBuffer(query=" + this.query + ", resetDeeplinkFacet=" + this.resetDeeplinkFacet + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateFacetBuffer(l.k query, boolean z10) {
            super(null);
            Intrinsics.j(query, "query");
            this.query = query;
            this.resetDeeplinkFacet = z10;
        }

        public static /* synthetic */ UpdateFacetBuffer b(UpdateFacetBuffer updateFacetBuffer, l.k kVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                kVar = updateFacetBuffer.query;
            }
            if ((i10 & 2) != 0) {
                z10 = updateFacetBuffer.resetDeeplinkFacet;
            }
            return updateFacetBuffer.a(kVar, z10);
        }

        public final UpdateFacetBuffer a(l.k query, boolean resetDeeplinkFacet) {
            Intrinsics.j(query, "query");
            return new UpdateFacetBuffer(query, resetDeeplinkFacet);
        }

        /* renamed from: c, reason: from getter */
        public final l.k getQuery() {
            return this.query;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getResetDeeplinkFacet() {
            return this.resetDeeplinkFacet;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/t$r;", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/t;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.t$r */
    public static final /* data */ class r extends AbstractC12415t {

        /* renamed from: a, reason: collision with root package name */
        public static final r f109875a = new r();

        private r() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof r);
        }

        public int hashCode() {
            return 745660412;
        }

        public String toString() {
            return "UpdateRecentSearchesAction";
        }
    }

    public /* synthetic */ AbstractC12415t(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12415t() {
    }
}
