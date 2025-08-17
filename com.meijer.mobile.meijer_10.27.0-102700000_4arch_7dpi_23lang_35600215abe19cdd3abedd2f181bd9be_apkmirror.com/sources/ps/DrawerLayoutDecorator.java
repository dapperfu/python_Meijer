package ps;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJX\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b!\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\u001d\u0010&¨\u0006'"}, d2 = {"Lps/t;", "", "", "isNewShoppingListEnabled", "isMedalliaSurveyEnabled", "isUserLoggedIn", "isChatBotEnabled", "", "cartItemCount", "Lps/i;", "fulfillmentBarDecorator", "activeIntentCode", "<init>", "(ZZZZILps/i;Ljava/lang/Integer;)V", "a", "(ZZZZILps/i;Ljava/lang/Integer;)Lps/t;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "h", "()Z", "b", "g", "c", "i", "d", "f", "e", "I", "Lps/i;", "()Lps/i;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ps.t, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class DrawerLayoutDecorator {

    /* renamed from: h, reason: collision with root package name */
    public static final int f156604h = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNewShoppingListEnabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMedalliaSurveyEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isUserLoggedIn;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isChatBotEnabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cartItemCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final DrawerFulfillmentBarDecorator fulfillmentBarDecorator;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer activeIntentCode;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawerLayoutDecorator)) {
            return false;
        }
        DrawerLayoutDecorator drawerLayoutDecorator = (DrawerLayoutDecorator) other;
        return this.isNewShoppingListEnabled == drawerLayoutDecorator.isNewShoppingListEnabled && this.isMedalliaSurveyEnabled == drawerLayoutDecorator.isMedalliaSurveyEnabled && this.isUserLoggedIn == drawerLayoutDecorator.isUserLoggedIn && this.isChatBotEnabled == drawerLayoutDecorator.isChatBotEnabled && this.cartItemCount == drawerLayoutDecorator.cartItemCount && Intrinsics.e(this.fulfillmentBarDecorator, drawerLayoutDecorator.fulfillmentBarDecorator) && Intrinsics.e(this.activeIntentCode, drawerLayoutDecorator.activeIntentCode);
    }

    public DrawerLayoutDecorator(boolean z10, boolean z11, boolean z12, boolean z13, int i10, DrawerFulfillmentBarDecorator fulfillmentBarDecorator, Integer num) {
        Intrinsics.j(fulfillmentBarDecorator, "fulfillmentBarDecorator");
        this.isNewShoppingListEnabled = z10;
        this.isMedalliaSurveyEnabled = z11;
        this.isUserLoggedIn = z12;
        this.isChatBotEnabled = z13;
        this.cartItemCount = i10;
        this.fulfillmentBarDecorator = fulfillmentBarDecorator;
        this.activeIntentCode = num;
    }

    public static /* synthetic */ DrawerLayoutDecorator b(DrawerLayoutDecorator drawerLayoutDecorator, boolean z10, boolean z11, boolean z12, boolean z13, int i10, DrawerFulfillmentBarDecorator drawerFulfillmentBarDecorator, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = drawerLayoutDecorator.isNewShoppingListEnabled;
        }
        if ((i11 & 2) != 0) {
            z11 = drawerLayoutDecorator.isMedalliaSurveyEnabled;
        }
        if ((i11 & 4) != 0) {
            z12 = drawerLayoutDecorator.isUserLoggedIn;
        }
        if ((i11 & 8) != 0) {
            z13 = drawerLayoutDecorator.isChatBotEnabled;
        }
        if ((i11 & 16) != 0) {
            i10 = drawerLayoutDecorator.cartItemCount;
        }
        if ((i11 & 32) != 0) {
            drawerFulfillmentBarDecorator = drawerLayoutDecorator.fulfillmentBarDecorator;
        }
        if ((i11 & 64) != 0) {
            num = drawerLayoutDecorator.activeIntentCode;
        }
        DrawerFulfillmentBarDecorator drawerFulfillmentBarDecorator2 = drawerFulfillmentBarDecorator;
        Integer num2 = num;
        int i12 = i10;
        boolean z14 = z12;
        return drawerLayoutDecorator.a(z10, z11, z14, z13, i12, drawerFulfillmentBarDecorator2, num2);
    }

    public final DrawerLayoutDecorator a(boolean isNewShoppingListEnabled, boolean isMedalliaSurveyEnabled, boolean isUserLoggedIn, boolean isChatBotEnabled, int cartItemCount, DrawerFulfillmentBarDecorator fulfillmentBarDecorator, Integer activeIntentCode) {
        Intrinsics.j(fulfillmentBarDecorator, "fulfillmentBarDecorator");
        return new DrawerLayoutDecorator(isNewShoppingListEnabled, isMedalliaSurveyEnabled, isUserLoggedIn, isChatBotEnabled, cartItemCount, fulfillmentBarDecorator, activeIntentCode);
    }

    /* renamed from: c, reason: from getter */
    public final Integer getActiveIntentCode() {
        return this.activeIntentCode;
    }

    /* renamed from: d, reason: from getter */
    public final int getCartItemCount() {
        return this.cartItemCount;
    }

    /* renamed from: e, reason: from getter */
    public final DrawerFulfillmentBarDecorator getFulfillmentBarDecorator() {
        return this.fulfillmentBarDecorator;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsChatBotEnabled() {
        return this.isChatBotEnabled;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsMedalliaSurveyEnabled() {
        return this.isMedalliaSurveyEnabled;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsNewShoppingListEnabled() {
        return this.isNewShoppingListEnabled;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Boolean.hashCode(this.isNewShoppingListEnabled) * 31) + Boolean.hashCode(this.isMedalliaSurveyEnabled)) * 31) + Boolean.hashCode(this.isUserLoggedIn)) * 31) + Boolean.hashCode(this.isChatBotEnabled)) * 31) + Integer.hashCode(this.cartItemCount)) * 31) + this.fulfillmentBarDecorator.hashCode()) * 31;
        Integer num = this.activeIntentCode;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsUserLoggedIn() {
        return this.isUserLoggedIn;
    }

    public String toString() {
        return "DrawerLayoutDecorator(isNewShoppingListEnabled=" + this.isNewShoppingListEnabled + ", isMedalliaSurveyEnabled=" + this.isMedalliaSurveyEnabled + ", isUserLoggedIn=" + this.isUserLoggedIn + ", isChatBotEnabled=" + this.isChatBotEnabled + ", cartItemCount=" + this.cartItemCount + ", fulfillmentBarDecorator=" + this.fulfillmentBarDecorator + ", activeIntentCode=" + this.activeIntentCode + ')';
    }
}
