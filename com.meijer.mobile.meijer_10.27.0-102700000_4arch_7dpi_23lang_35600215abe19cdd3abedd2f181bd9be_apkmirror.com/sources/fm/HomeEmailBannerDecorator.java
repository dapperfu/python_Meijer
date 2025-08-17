package fm;

import Ji.C;
import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lfm/a;", "", "Lak/a;", "title", "body", "LJi/C;", "actionIcon", "actionTitle", "", "isActionEnabled", "isLoading", "<init>", "(Lak/a;Lak/a;LJi/C;Lak/a;ZZ)V", "a", "(Lak/a;Lak/a;LJi/C;Lak/a;ZZ)Lfm/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lak/a;", "f", "()Lak/a;", "b", "e", "c", "LJi/C;", "()LJi/C;", "d", "Z", "g", "()Z", "h", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fm.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class HomeEmailBannerDecorator {

    /* renamed from: g, reason: collision with root package name */
    public static final int f131199g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a body;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final C actionIcon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a actionTitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isActionEnabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    public HomeEmailBannerDecorator(AbstractC5607a title, AbstractC5607a body, C actionIcon, AbstractC5607a actionTitle, boolean z10, boolean z11) {
        Intrinsics.j(title, "title");
        Intrinsics.j(body, "body");
        Intrinsics.j(actionIcon, "actionIcon");
        Intrinsics.j(actionTitle, "actionTitle");
        this.title = title;
        this.body = body;
        this.actionIcon = actionIcon;
        this.actionTitle = actionTitle;
        this.isActionEnabled = z10;
        this.isLoading = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeEmailBannerDecorator)) {
            return false;
        }
        HomeEmailBannerDecorator homeEmailBannerDecorator = (HomeEmailBannerDecorator) other;
        return Intrinsics.e(this.title, homeEmailBannerDecorator.title) && Intrinsics.e(this.body, homeEmailBannerDecorator.body) && Intrinsics.e(this.actionIcon, homeEmailBannerDecorator.actionIcon) && Intrinsics.e(this.actionTitle, homeEmailBannerDecorator.actionTitle) && this.isActionEnabled == homeEmailBannerDecorator.isActionEnabled && this.isLoading == homeEmailBannerDecorator.isLoading;
    }

    static {
        int i10 = AbstractC5607a.f45514b;
        f131199g = i10 | C.f15315b | i10 | i10;
    }

    public static /* synthetic */ HomeEmailBannerDecorator b(HomeEmailBannerDecorator homeEmailBannerDecorator, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, C c10, AbstractC5607a abstractC5607a3, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC5607a = homeEmailBannerDecorator.title;
        }
        if ((i10 & 2) != 0) {
            abstractC5607a2 = homeEmailBannerDecorator.body;
        }
        if ((i10 & 4) != 0) {
            c10 = homeEmailBannerDecorator.actionIcon;
        }
        if ((i10 & 8) != 0) {
            abstractC5607a3 = homeEmailBannerDecorator.actionTitle;
        }
        if ((i10 & 16) != 0) {
            z10 = homeEmailBannerDecorator.isActionEnabled;
        }
        if ((i10 & 32) != 0) {
            z11 = homeEmailBannerDecorator.isLoading;
        }
        boolean z12 = z10;
        boolean z13 = z11;
        return homeEmailBannerDecorator.a(abstractC5607a, abstractC5607a2, c10, abstractC5607a3, z12, z13);
    }

    public final HomeEmailBannerDecorator a(AbstractC5607a title, AbstractC5607a body, C actionIcon, AbstractC5607a actionTitle, boolean isActionEnabled, boolean isLoading) {
        Intrinsics.j(title, "title");
        Intrinsics.j(body, "body");
        Intrinsics.j(actionIcon, "actionIcon");
        Intrinsics.j(actionTitle, "actionTitle");
        return new HomeEmailBannerDecorator(title, body, actionIcon, actionTitle, isActionEnabled, isLoading);
    }

    /* renamed from: c, reason: from getter */
    public final C getActionIcon() {
        return this.actionIcon;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getActionTitle() {
        return this.actionTitle;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC5607a getBody() {
        return this.body;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsActionEnabled() {
        return this.isActionEnabled;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.body.hashCode()) * 31) + this.actionIcon.hashCode()) * 31) + this.actionTitle.hashCode()) * 31) + Boolean.hashCode(this.isActionEnabled)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "HomeEmailBannerDecorator(title=" + this.title + ", body=" + this.body + ", actionIcon=" + this.actionIcon + ", actionTitle=" + this.actionTitle + ", isActionEnabled=" + this.isActionEnabled + ", isLoading=" + this.isLoading + ')';
    }

    public /* synthetic */ HomeEmailBannerDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, C c10, AbstractC5607a abstractC5607a3, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5607a, abstractC5607a2, c10, abstractC5607a3, (i10 & 16) != 0 ? true : z10, (i10 & 32) != 0 ? false : z11);
    }
}
