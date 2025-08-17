package xs;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import tp.Builder;
import ws.C17858d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\tB'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\t\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lxs/a;", "", "Lak/a;", "shopperName", "feedbackMessage", "", "shopperImageURL", "<init>", "(Lak/a;Lak/a;Ljava/lang/String;)V", "a", "Lak/a;", "c", "()Lak/a;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "d", "rateandtip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xs.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18091a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f169897e = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a shopperName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a feedbackMessage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String shopperImageURL;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxs/a$a;", "", "<init>", "()V", "Ltp/b;", "model", "", "isLegacyScreen", "Lxs/a;", "a", "(Ltp/b;Z)Lxs/a;", "rateandtip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: xs.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final C18091a a(Builder model, boolean isLegacyScreen) {
            Intrinsics.j(model, "model");
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            int i10 = C17858d.f166449l;
            Object shopperName = model.getShopperName();
            if (shopperName == null) {
                shopperName = companion.d(C17858d.f166446i, new Object[0]);
            }
            AbstractC5607a abstractC5607aD = companion.d(i10, shopperName);
            AbstractC5607a abstractC5607aD2 = companion.d(isLegacyScreen ? C17858d.f166448k : C17858d.f166447j, new Object[0]);
            String shopperImage = model.getShopperImage();
            if (shopperImage == null || StringsKt.r0(shopperImage)) {
                shopperImage = null;
            }
            return new C18091a(abstractC5607aD, abstractC5607aD2, shopperImage);
        }
    }

    public C18091a(AbstractC5607a shopperName, AbstractC5607a feedbackMessage, String str) {
        Intrinsics.j(shopperName, "shopperName");
        Intrinsics.j(feedbackMessage, "feedbackMessage");
        this.shopperName = shopperName;
        this.feedbackMessage = feedbackMessage;
        this.shopperImageURL = str;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getFeedbackMessage() {
        return this.feedbackMessage;
    }

    /* renamed from: b, reason: from getter */
    public final String getShopperImageURL() {
        return this.shopperImageURL;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getShopperName() {
        return this.shopperName;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C18091a(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            abstractC5607a = companion.d(C17858d.f166449l, companion.d(C17858d.f166446i, new Object[0]));
        }
        this(abstractC5607a, (i10 & 2) != 0 ? AbstractC5607a.INSTANCE.d(C17858d.f166446i, new Object[0]) : abstractC5607a2, (i10 & 4) != 0 ? null : str);
    }
}
