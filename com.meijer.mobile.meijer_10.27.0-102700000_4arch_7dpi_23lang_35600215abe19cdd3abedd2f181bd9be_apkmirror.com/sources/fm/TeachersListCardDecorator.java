package fm;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0019\u0010\r¨\u0006\u001d"}, d2 = {"Lfm/d;", "", "Lak/a;", "title", "description", "actionButtonTitle", "", "image", "", "destinationDeeplink", "<init>", "(Lak/a;Lak/a;Lak/a;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "e", "()Lak/a;", "b", "c", "d", "I", "Ljava/lang/String;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fm.d, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class TeachersListCardDecorator {

    /* renamed from: f, reason: collision with root package name */
    public static final int f131223f = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a actionButtonTitle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int image;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String destinationDeeplink;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeachersListCardDecorator)) {
            return false;
        }
        TeachersListCardDecorator teachersListCardDecorator = (TeachersListCardDecorator) other;
        return Intrinsics.e(this.title, teachersListCardDecorator.title) && Intrinsics.e(this.description, teachersListCardDecorator.description) && Intrinsics.e(this.actionButtonTitle, teachersListCardDecorator.actionButtonTitle) && this.image == teachersListCardDecorator.image && Intrinsics.e(this.destinationDeeplink, teachersListCardDecorator.destinationDeeplink);
    }

    public TeachersListCardDecorator(AbstractC5607a title, AbstractC5607a description, AbstractC5607a actionButtonTitle, int i10, String str) {
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(actionButtonTitle, "actionButtonTitle");
        this.title = title;
        this.description = description;
        this.actionButtonTitle = actionButtonTitle;
        this.image = i10;
        this.destinationDeeplink = str;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getActionButtonTitle() {
        return this.actionButtonTitle;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final String getDestinationDeeplink() {
        return this.destinationDeeplink;
    }

    /* renamed from: d, reason: from getter */
    public final int getImage() {
        return this.image;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.actionButtonTitle.hashCode()) * 31) + Integer.hashCode(this.image)) * 31;
        String str = this.destinationDeeplink;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TeachersListCardDecorator(title=" + this.title + ", description=" + this.description + ", actionButtonTitle=" + this.actionButtonTitle + ", image=" + this.image + ", destinationDeeplink=" + this.destinationDeeplink + ')';
    }
}
