package sn;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\fJB\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010\f¨\u0006 "}, d2 = {"Lsn/a;", "", "", "nextPage", "archivedCurrentPage", "totalPages", "archivedTotalPages", "", "isPaginating", "<init>", "(IIIIZ)V", "g", "()Z", "f", "a", "(IIIIZ)Lsn/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "d", "b", "c", "e", "getArchivedTotalPages", "Z", "h", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sn.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class Paginator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int nextPage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int archivedCurrentPage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalPages;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int archivedTotalPages;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPaginating;

    public Paginator() {
        this(0, 0, 0, 0, false, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Paginator)) {
            return false;
        }
        Paginator paginator = (Paginator) other;
        return this.nextPage == paginator.nextPage && this.archivedCurrentPage == paginator.archivedCurrentPage && this.totalPages == paginator.totalPages && this.archivedTotalPages == paginator.archivedTotalPages && this.isPaginating == paginator.isPaginating;
    }

    public Paginator(int i10, int i11, int i12, int i13, boolean z10) {
        this.nextPage = i10;
        this.archivedCurrentPage = i11;
        this.totalPages = i12;
        this.archivedTotalPages = i13;
        this.isPaginating = z10;
    }

    public static /* synthetic */ Paginator b(Paginator paginator, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = paginator.nextPage;
        }
        if ((i14 & 2) != 0) {
            i11 = paginator.archivedCurrentPage;
        }
        if ((i14 & 4) != 0) {
            i12 = paginator.totalPages;
        }
        if ((i14 & 8) != 0) {
            i13 = paginator.archivedTotalPages;
        }
        if ((i14 & 16) != 0) {
            z10 = paginator.isPaginating;
        }
        boolean z11 = z10;
        int i15 = i12;
        return paginator.a(i10, i11, i15, i13, z11);
    }

    public final Paginator a(int nextPage, int archivedCurrentPage, int totalPages, int archivedTotalPages, boolean isPaginating) {
        return new Paginator(nextPage, archivedCurrentPage, totalPages, archivedTotalPages, isPaginating);
    }

    /* renamed from: c, reason: from getter */
    public final int getArchivedCurrentPage() {
        return this.archivedCurrentPage;
    }

    /* renamed from: d, reason: from getter */
    public final int getNextPage() {
        return this.nextPage;
    }

    /* renamed from: e, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    public final boolean f() {
        return this.archivedCurrentPage < this.archivedTotalPages;
    }

    public final boolean g() {
        return this.nextPage <= this.totalPages;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsPaginating() {
        return this.isPaginating;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.nextPage) * 31) + Integer.hashCode(this.archivedCurrentPage)) * 31) + Integer.hashCode(this.totalPages)) * 31) + Integer.hashCode(this.archivedTotalPages)) * 31) + Boolean.hashCode(this.isPaginating);
    }

    public String toString() {
        return "Paginator(nextPage=" + this.nextPage + ", archivedCurrentPage=" + this.archivedCurrentPage + ", totalPages=" + this.totalPages + ", archivedTotalPages=" + this.archivedTotalPages + ", isPaginating=" + this.isPaginating + ')';
    }

    public /* synthetic */ Paginator(int i10, int i11, int i12, int i13, boolean z10, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i10, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? 1 : i12, (i14 & 8) != 0 ? 1 : i13, (i14 & 16) != 0 ? false : z10);
    }
}
