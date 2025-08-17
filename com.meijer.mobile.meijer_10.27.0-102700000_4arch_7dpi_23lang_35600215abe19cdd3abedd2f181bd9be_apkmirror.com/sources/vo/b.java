package vo;

import Bj.g;
import Ji.C;
import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import to.C17126a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B?\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0010\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000fj\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lvo/b;", "", "", "bannerIcon", "bannerBackgroundColor", "Lak/a;", "bannerTitle", "bannerDescription", "bannerActionText", "bannerBorderColor", "<init>", "(Ljava/lang/String;IIILak/a;Lak/a;Lak/a;I)V", "a", "I", "o", "()I", "b", "e", "c", "Lak/a;", "p", "()Lak/a;", "d", "m", "f", "l", "g", "h", "i", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f164895g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f164896h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f164897i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ b[] f164898j;

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f164899k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int bannerIcon;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int bannerBackgroundColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a bannerTitle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a bannerDescription;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a bannerActionText;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int bannerBorderColor;

    static {
        int i10 = C.i.b.f15549d.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        int i11 = g.f2625l;
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        f164895g = new b("CONFIRMED_SUBSTITUTION", 0, i10, i11, companion.d(C17126a.f161935e, new Object[0]), companion.d(C17126a.f161934d, new Object[0]), companion.d(C17126a.f161933c, new Object[0]), g.f2627n);
        C.i.n nVar = C.i.n.f15565d;
        f164896h = new b("PENDING_SUBSTITUTION", 1, nVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), g.f2633t, companion.d(C17126a.f161938h, new Object[0]), companion.d(C17126a.f161937g, new Object[0]), companion.d(C17126a.f161932b, new Object[0]), g.f2634u);
        f164897i = new b("OUT_OF_STOCK_SUBSTITUTION", 2, nVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), g.f2633t, companion.d(C17126a.f161938h, new Object[0]), companion.d(C17126a.f161936f, new Object[0]), companion.d(C17126a.f161931a, new Object[0]), g.f2634u);
        b[] bVarArrA = a();
        f164898j = bVarArrA;
        f164899k = EnumEntriesKt.a(bVarArrA);
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f164895g, f164896h, f164897i};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f164898j.clone();
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getBannerActionText() {
        return this.bannerActionText;
    }

    /* renamed from: e, reason: from getter */
    public final int getBannerBackgroundColor() {
        return this.bannerBackgroundColor;
    }

    /* renamed from: l, reason: from getter */
    public final int getBannerBorderColor() {
        return this.bannerBorderColor;
    }

    /* renamed from: m, reason: from getter */
    public final AbstractC5607a getBannerDescription() {
        return this.bannerDescription;
    }

    /* renamed from: o, reason: from getter */
    public final int getBannerIcon() {
        return this.bannerIcon;
    }

    /* renamed from: p, reason: from getter */
    public final AbstractC5607a getBannerTitle() {
        return this.bannerTitle;
    }

    private b(String str, int i10, int i11, int i12, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, int i13) {
        this.bannerIcon = i11;
        this.bannerBackgroundColor = i12;
        this.bannerTitle = abstractC5607a;
        this.bannerDescription = abstractC5607a2;
        this.bannerActionText = abstractC5607a3;
        this.bannerBorderColor = i13;
    }
}
