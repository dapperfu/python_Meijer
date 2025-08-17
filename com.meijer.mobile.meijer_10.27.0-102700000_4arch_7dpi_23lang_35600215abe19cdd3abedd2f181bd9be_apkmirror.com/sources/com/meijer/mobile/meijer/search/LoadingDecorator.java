package com.meijer.mobile.meijer.search;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/search/d;", "", "Lak/a;", "title", "description", "<init>", "(Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "b", "()Lak/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.search.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class LoadingDecorator {

    /* renamed from: c, reason: collision with root package name */
    public static final int f113251c = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a description;

    /* JADX WARN: Multi-variable type inference failed */
    public LoadingDecorator() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingDecorator)) {
            return false;
        }
        LoadingDecorator loadingDecorator = (LoadingDecorator) other;
        return Intrinsics.e(this.title, loadingDecorator.title) && Intrinsics.e(this.description, loadingDecorator.description);
    }

    public int hashCode() {
        AbstractC5607a abstractC5607a = this.title;
        int iHashCode = (abstractC5607a == null ? 0 : abstractC5607a.hashCode()) * 31;
        AbstractC5607a abstractC5607a2 = this.description;
        return iHashCode + (abstractC5607a2 != null ? abstractC5607a2.hashCode() : 0);
    }

    public String toString() {
        return "LoadingDecorator(title=" + this.title + ", description=" + this.description + ')';
    }

    public LoadingDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2) {
        this.title = abstractC5607a;
        this.description = abstractC5607a2;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    public /* synthetic */ LoadingDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC5607a, (i10 & 2) != 0 ? null : abstractC5607a2);
    }
}
