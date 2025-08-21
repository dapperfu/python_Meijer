package com.meijer.mobile.meijer.search;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/search/d;", "", "Lbk/a;", "title", "description", "<init>", "(Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "b", "()Lbk/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.search.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class LoadingDecorator {

    /* renamed from: c, reason: collision with root package name */
    public static final int f114104c = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a description;

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
        AbstractC6392a abstractC6392a = this.title;
        int iHashCode = (abstractC6392a == null ? 0 : abstractC6392a.hashCode()) * 31;
        AbstractC6392a abstractC6392a2 = this.description;
        return iHashCode + (abstractC6392a2 != null ? abstractC6392a2.hashCode() : 0);
    }

    public String toString() {
        return "LoadingDecorator(title=" + this.title + ", description=" + this.description + ')';
    }

    public LoadingDecorator(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2) {
        this.title = abstractC6392a;
        this.description = abstractC6392a2;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getTitle() {
        return this.title;
    }

    public /* synthetic */ LoadingDecorator(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC6392a, (i10 & 2) != 0 ? null : abstractC6392a2);
    }
}
