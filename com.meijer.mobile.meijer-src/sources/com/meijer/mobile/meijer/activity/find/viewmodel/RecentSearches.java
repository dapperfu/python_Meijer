package com.meijer.mobile.meijer.activity.find.viewmodel;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ys.C18372b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/n1;", "", "", "", "recentsList", "", "emptyRecentsMessage", "<init>", "(Ljava/util/List;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "I", "getEmptyRecentsMessage", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.n1, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class RecentSearches {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> recentsList;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int emptyRecentsMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public RecentSearches() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecentSearches)) {
            return false;
        }
        RecentSearches recentSearches = (RecentSearches) other;
        return Intrinsics.e(this.recentsList, recentSearches.recentsList) && this.emptyRecentsMessage == recentSearches.emptyRecentsMessage;
    }

    public int hashCode() {
        return (this.recentsList.hashCode() * 31) + Integer.hashCode(this.emptyRecentsMessage);
    }

    public String toString() {
        return "RecentSearches(recentsList=" + this.recentsList + ", emptyRecentsMessage=" + this.emptyRecentsMessage + ')';
    }

    public RecentSearches(List<String> recentsList, int i10) {
        Intrinsics.j(recentsList, "recentsList");
        this.recentsList = recentsList;
        this.emptyRecentsMessage = i10;
    }

    public final List<String> a() {
        return this.recentsList;
    }

    public /* synthetic */ RecentSearches(List list, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.m() : list, (i11 & 2) != 0 ? C18372b.f172057h : i10);
    }
}
